package jonas.springmvc.controller.modelStuff;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class esp_userid_Table_Mapper implements RowMapper<esp_userid_Table_DataClass> {
   @Override
public esp_userid_Table_DataClass mapRow(ResultSet rs, int rowNum) throws SQLException {
	   esp_userid_Table_DataClass esp_userid_Table_DataClass = new esp_userid_Table_DataClass();
	   esp_userid_Table_DataClass.setUserid(rs.getInt("userid"));
	   esp_userid_Table_DataClass.setEmail(rs.getString("email"));
	   esp_userid_Table_DataClass.setPassword(rs.getString("password"));
	   esp_userid_Table_DataClass.setCreate_time(rs.getDate("create_time"));
      return esp_userid_Table_DataClass;
   }
}