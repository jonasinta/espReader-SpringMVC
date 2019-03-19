package jonas.springmvc.controller.modelStuff;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.google.protobuf.Timestamp;

import jonas.springmvc.controller.modelStuff.esp_chip_Table_Mapper;

public class DaoForEspAccess {
	private JdbcTemplate jdbcTemplateObject;
	@SuppressWarnings("unused")
	private DataSource dataSource;
	/**
	 * @param dataSource the dataSource to set
	 */
	   public void setDataSource(DataSource dataSource) {
		      this.dataSource = dataSource;
		      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		   }
	   
	/*
	 
	 all this from: /espReaderSiteWithSession[Servlets]/src/comage/jonas/DAO.java 
	 The main one....
	 select timestamp, bat_serviceV, esp_heap from "+tableName+" order by timestamp  desc limit 30";//order by timestamp  desc
	 
	 public String getInstance_chipid(int user_id) {
	"select chipid from chipid where fkey_userid=?";
	
	public int getUserID(String chipid) {
	"select fkey_userid from chipid where chipid=?";
	
	public int isUser(String userName, String password) {
	"select userid from userid where email=? and password=?";
	
	public int updateUser(String user, String password, int user_id) {
	"update userid set password=?, email=? where userid=?"
		
	*/
		   /** 
		      * This is the method to return the data supplying a tablename
		      * which is an esp device id number		   
		      * select timestamp, bat_serviceV, esp_heap from "+tableName+" order by timestamp  desc limit 30";*/
		   public List<esp_chip_Table_DataClass> getTable(String tablename) {
			 //esp14056893 and esp408776
			   List<esp_chip_Table_DataClass> chipData = new ArrayList<esp_chip_Table_DataClass>();
			   String sql ="select * from "+tablename+" order by timestamp  desc limit 30";
			 //  String sql ="select * from ? order by timestamp  desc limit 40";
			   chipData = jdbcTemplateObject.query(sql,new esp_chip_Table_Mapper());
			return chipData;
		}
		   
		   /** 
		      * This is the method to return the chipids as Strings in a List by passing an integer
		      * of user_id
		      * "select chipid from chipid where fkey_userid=?"		   */
		   public List<esp_chipId_Table_DataClass> getInstance_chipid(int user_id) {
			   List<esp_chipId_Table_DataClass> chipIds = new ArrayList<esp_chipId_Table_DataClass>();
			   String sql = "select * from chipid where fkey_userid=?";
			   chipIds = jdbcTemplateObject.query(sql, new Object[] {user_id}, new esp_chipId_Table_Mapper());
			return chipIds;
			   
		   }
		   /** 
		      * This is the method to return the userId as Integer
		      * by providing a chipId as String
		      * "select fkey_userid from chipid where chipid=?"
		      *       */
		   public Integer getUserID(String chipid) {
			return null;
		}
		   /** 
		      * This is the method to return the userid as an Integer
		      * by providing a String username and String password to table
		      * "userid"
		      * "select userid from userid where email=? and password=?";
		      *       */
		   public Integer isUser(String userName, String password) {
			   // todo; return null if it does not match a valid userid
			return null;
		}
		   
		   /** 
		      * This is the method to UPDATE a user
		      * by providing a String username and String password,
		      * and Integer user_id to table "userid"
		      * "update userid set password=?, email=? where userid=?"
		      *       */
		   public Integer updateUser(String user, String password, Integer user_id) {
			return null;
		}
		   
		   /** 
		      * This is the method to get time difference from now to most recent data 
		      * aquisition. 
		      * parameter tablename
		      * return date object that shows second, minutes, hours, days or months since last
		      * data aquisition
		 * @throws ParseException 
		      *       */
		   public Date timeSince(String tablename) throws ParseException {
			   SimpleDateFormat MysqlTimestampFormat = new SimpleDateFormat ("yyyy-MM-dd k:m:SS");
			   String  sql = "select id, timestamp, bat_serviceV from "+tablename+" where id > 0 order by id  desc limit 1";
			   List<esp_chip_Table_DataClass>  bedoing = jdbcTemplateObject.query(sql, new RowMapper<esp_chip_Table_DataClass>(){  
				    @Override  
				    public esp_chip_Table_DataClass mapRow(ResultSet rs, int rownumber) throws SQLException {  
				    	esp_chip_Table_DataClass e=new esp_chip_Table_DataClass();  
				        e.setId(rs.getInt("id"));  
				        e.setTimestamp(rs.getTimestamp("timestamp"));  
				        e.setBat_serviceV(rs.getFloat("bat_serviceV"));  
				        return e;  
				    }  
				    });  
			   java.sql.Timestamp dataGot = bedoing.get(0).getTimestamp();
			   Date dateReturn = MysqlTimestampFormat.parse(dataGot.toString()); 
			   System.out.println(dateReturn);
			return dateReturn;
		}
		   
		   public List<esp_chip_Table_DataClass> mostRecent(int user_id) throws ParseException {
			   List<esp_chip_Table_DataClass> tempHolder = new ArrayList<esp_chip_Table_DataClass>();
			   List<esp_chipId_Table_DataClass> chicaChikaa = getInstance_chipid(user_id);
			   
			 for (esp_chipId_Table_DataClass chipId_Table : chicaChikaa) {
				
			  String tablename = chipId_Table.getChipid();
			  
			   String  sql = "select id, timestamp, bat_serviceV from "+tablename+" where id > 0 order by id  desc limit 1";
			   tempHolder	 = jdbcTemplateObject.query(sql, new RowMapper<esp_chip_Table_DataClass>(){  
				    @Override  
				    public esp_chip_Table_DataClass mapRow(ResultSet rs, int rownumber) throws SQLException {  
				    	esp_chip_Table_DataClass e=new esp_chip_Table_DataClass();  
				        e.setId(rs.getInt("id"));  
				        e.setTimestamp(rs.getTimestamp("timestamp"));  
				        e.setBat_serviceV(rs.getFloat("bat_serviceV"));  
				        return e;  
				    }  
				    });  
			   
			 } // close for each
			   
			return tempHolder;
		}


		

		   
				
	
}//close class
