import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_det")
public class Student {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="stud_id")
	private int id;
	@Column(name="stud_name")
	private String name;
	private int age;
	private String gender;
	@Column(name="stud_id",unique=true)
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age=age;
	}
	@Column(name="gender",insertable=false)
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender=gender;
	}
}
