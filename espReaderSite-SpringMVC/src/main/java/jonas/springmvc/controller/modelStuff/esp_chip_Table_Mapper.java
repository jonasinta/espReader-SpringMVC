package jonas.springmvc.controller.modelStuff;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class esp_chip_Table_Mapper implements RowMapper<esp_chip_Table_DataClass> {
   @Override
public esp_chip_Table_DataClass mapRow(ResultSet rs, int rowNum) throws SQLException {
	   esp_chip_Table_DataClass esp_chip_Table_DataClass = new esp_chip_Table_DataClass();
	   esp_chip_Table_DataClass.setId(rs.getInt("id"));
	   esp_chip_Table_DataClass.setTimestamp(rs.getTimestamp("timestamp"));
	   esp_chip_Table_DataClass.setT1(rs.getLong("t1"));
	   esp_chip_Table_DataClass.setBat_serviceV(rs.getFloat("bat_serviceV"));
	   esp_chip_Table_DataClass.setBat_enginesV(rs.getFloat("bat_enginesV"));
	   esp_chip_Table_DataClass.setMainsV(rs.getFloat("mainsV"));
	   esp_chip_Table_DataClass.setEngines_rpm(rs.getInt("engines_rpm"));
	   esp_chip_Table_DataClass.setMainsOn(rs.getInt("mainsOn"));
	   esp_chip_Table_DataClass.setEsp_heap(rs.getInt("esp_heap"));
	   esp_chip_Table_DataClass.setFKchipID(rs.getInt("FKchipID"));
      
      return esp_chip_Table_DataClass;
   }
}