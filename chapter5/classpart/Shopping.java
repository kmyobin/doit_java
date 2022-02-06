package classpart;

public class Shopping {
	String inum;
	String id;
	int year, month, day;
	String name;
	String pnum;
	String address;
	
	public void setInum(String ex) {
		inum=ex;
	}
	public String getInum() {
		return inum;
	}
	public void setId(String ex) {
		id=ex;
	}
	public String getId() {
		return id;
	}
	public void setDate(int y, int m, int d) {
		year=y;
		month=m;
		day=d;
	}
	public int getDay() {return day;}
	public int getMonth() {return month;}
	public int getYear() {return year;}
	public void setName(String n) {name=n;}
	public String getName() {return name;}
	public void setPnum(String p) {pnum=p;}
	public String getPnum() {return pnum;}
	public void setAddress(String a) {address=a;}
	public String getAddress() {return address;}
	
	
}
