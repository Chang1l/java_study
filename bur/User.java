package bur;

public class User {

	String id, name,nic,num,add;

	public User(String id, String name, String nic, String num, String add) {
		
		this.id = id;
		this.name = name;
		this.nic = nic;
		this.num = num;
		this.add = add;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", nic=" + nic + ", num=" + num + ", add=" + add + "]";
	}
	
	
}
