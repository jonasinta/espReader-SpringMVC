package jonas.springmvc.controller.modelStuff;

import java.util.Date;

public class esp_chipId_Table_DataClass {
private Integer id;
private String chipid;
	private String chip_nickname;
private Date create_time;
private Integer fkey_userid;
private Object img;
/**
 * @return the img
 */
public Object getImg() {
	return img;
}
/**
 * @param img the img to set
 */
public void setImg(Object img) {
	this.img = img;
}
/**
 * @return the id
 */
public Integer getId() {
	return id;
}
/**
 * @return the chipid
 */
public String getChipid() {
	return chipid;
}
/**
 * @return the chip_nickname
 */
public String getChip_nickname() {
	return chip_nickname;
}
/**
 * @return the create_time
 */
public Date getCreate_time() {
	return create_time;
}
/**
 * @return the fkey_userid
 */
public Integer getFkey_userid() {
	return fkey_userid;
}
/**
 * @param id the id to set
 */
public void setId(Integer id) {
	this.id = id;
}
/**
 * @param chipid the chipid to set
 */
public void setChipid(String chipid) {
	this.chipid = chipid;
}
/**
 * @param chip_nickname the chip_nickname to set
 */
public void setChip_nickname(String chip_nickname) {
	this.chip_nickname = chip_nickname;
}
/**
 * @param create_time the create_time to set
 */
public void setCreate_time(Date create_time) {
	this.create_time = create_time;
}
/**
 * @param fkey_userid the fkey_userid to set
 */
public void setFkey_userid(Integer fkey_userid) {
	this.fkey_userid = fkey_userid;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "esp_chipId_Table_DataClass [id=" + id + ", chipid=" + chipid + ", chip_nickname=" + chip_nickname
			+ ", create_time=" + create_time + ", fkey_userid=" + fkey_userid + "]";
}


}
