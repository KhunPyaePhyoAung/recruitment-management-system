package team.ojt7.recruitment.model.dto;

<<<<<<< HEAD
public class DepartmentDto {

	private Long id;
=======
import javax.validation.constraints.NotEmpty;

public class DepartmentDto {
	@NotEmpty
	private Long id;
	@NotEmpty
>>>>>>> deparments
	private String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
<<<<<<< HEAD
=======

>>>>>>> deparments
}
