package jonas.springmvc.controller.modelStuff;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class esp_chipId_Table_Mapper implements RowMapper<esp_chipId_Table_DataClass> {
   @Override
public esp_chipId_Table_DataClass mapRow(ResultSet rs, int rowNum) throws SQLException {
	   esp_chipId_Table_DataClass esp_chipId_Table_DataClass = new esp_chipId_Table_DataClass();
	   esp_chipId_Table_DataClass.setId(rs.getInt("id"));
	   esp_chipId_Table_DataClass.setChipid(rs.getString("chipid"));
	   esp_chipId_Table_DataClass.setChip_nickname(rs.getString("chip_nickname"));
	   esp_chipId_Table_DataClass.setCreate_time(rs.getDate("create_time"));
	   esp_chipId_Table_DataClass.setFkey_userid(rs.getInt("fkey_userid"));
	   esp_chipId_Table_DataClass.setImg(rs.getBlob("img"));

      return esp_chipId_Table_DataClass;
   }
}