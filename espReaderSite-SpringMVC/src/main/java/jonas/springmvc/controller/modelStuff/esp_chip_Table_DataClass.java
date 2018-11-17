package jonas.springmvc.controller.modelStuff;

import java.sql.Timestamp;

public class esp_chip_Table_DataClass {

	private String table_name;
	private Integer id;
	private Timestamp timestamp;
	private Long t1;
	private Float bat_serviceV;
	private Float bat_enginesV;
	private Float mainsV;
	private Integer engines_rpm;
	private Integer mainsOn;
	private Integer esp_heap;
	private Integer FKchipID;

	/**
	 * @return the timestamp
	 */
	public Timestamp getTimestamp() {
		return timestamp;
	}

	/**
	 * @return the bat_serviceV
	 */
	public Float getBat_serviceV() {
		return bat_serviceV;
	}

	/**
	 * @param table_name
	 *            the table_name to set
	 */
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @param timestamp2
	 *            the timestamp to set
	 */
	public void setTimestamp(Timestamp timestamp2) {
		this.timestamp = timestamp2;
	}

	/**
	 * @param t1
	 *            the t1 to set
	 */
	public void setT1(Long t1) {
		this.t1 = t1;
	}

	/**
	 * @param bat_serviceV
	 *            the bat_serviceV to set
	 */
	public void setBat_serviceV(Float bat_serviceV) {
		this.bat_serviceV = bat_serviceV;
	}

	/**
	 * @param bat_enginesV
	 *            the bat_enginesV to set
	 */
	public void setBat_enginesV(Float bat_enginesV) {
		this.bat_enginesV = bat_enginesV;
	}

	/**
	 * @param mainsV
	 *            the mainsV to set
	 */
	public void setMainsV(Float mainsV) {
		this.mainsV = mainsV;
	}

	/**
	 * @param engines_rpm
	 *            the engines_rpm to set
	 */
	public void setEngines_rpm(Integer engines_rpm) {
		this.engines_rpm = engines_rpm;
	}

	/**
	 * @param mainsOn
	 *            the mainsOn to set
	 */
	public void setMainsOn(Integer mainsOn) {
		this.mainsOn = mainsOn;
	}

	/**
	 * @param esp_heap
	 *            the esp_heap to set
	 */
	public void setEsp_heap(Integer esp_heap) {
		this.esp_heap = esp_heap;
	}

	/**
	 * @param fKchipID
	 *            the fKchipID to set
	 */
	public void setFKchipID(Integer fKchipID) {
		FKchipID = fKchipID;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "esp_chip_Table_DataClass [table_name=" + table_name + ", id=" + id + ", timestamp=" + timestamp
				+ ", t1=" + t1 + ", bat_serviceV=" + bat_serviceV + ", bat_enginesV=" + bat_enginesV + ", mainsV="
				+ mainsV + ", engines_rpm=" + engines_rpm + ", mainsOn=" + mainsOn + ", esp_heap=" + esp_heap
				+ ", FKchipID=" + FKchipID + "]";
	}

}