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
@Table(name = "admin")

public class AdminInfoBean implements Serializable {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column
	private String aname;

}
