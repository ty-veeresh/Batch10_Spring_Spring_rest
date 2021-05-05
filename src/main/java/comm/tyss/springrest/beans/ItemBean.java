package comm.tyss.springrest.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@Entity
@Table(name = "items")
@XmlRootElement(name="Item-info")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("item_info")
public class ItemBean implements Serializable {
	
	@Id
	@Column
	private Integer iId;
	
	@Column
	private String iname;
	
	@Column
	private Integer icost;
	
	@Column
	private Integer aId;

	

}
