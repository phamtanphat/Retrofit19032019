package khoapham.ptp.phamtanphat.retrofit19032019;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class En {

@SerializedName("name")
@Expose
private String name;
@SerializedName("address")
@Expose
private String address;

@SerializedName("course2")
@Expose
private String course2;
@SerializedName("course3")
@Expose
private String course3;

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getAddress() {
return address;
}

public void setAddress(String address) {
this.address = address;
}


public String getCourse2() {
return course2;
}

public void setCourse2(String course2) {
this.course2 = course2;
}

public String getCourse3() {
return course3;
}

public void setCourse3(String course3) {
this.course3 = course3;
}

}