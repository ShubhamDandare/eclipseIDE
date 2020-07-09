package StudentMapping;

public class StudentAddres {
private String City;
private String roadname;
private String landmark;
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getRoadname() {
	return roadname;
}
public void setRoadname(String roadname) {
	this.roadname = roadname;
}
public String getLandmark() {
	return landmark;
}
public void setLandmark(String landmark) {
	this.landmark = landmark;
}


@Override
public String toString() {
	return "StudentAddres [City=" + City + ", roadname=" + roadname + ", landmark=" + landmark + "]";
}
public StudentAddres() {
	super();
	// TODO Auto-generated constructor stub
}

}
