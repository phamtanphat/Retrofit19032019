package khoapham.ptp.phamtanphat.retrofit19032019;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Language {

@SerializedName("en")
@Expose
private En en;
@SerializedName("vn")
@Expose
private Vn vn;

public En getEn() {
return en;
}

public void setEn(En en) {
this.en = en;
}

public Vn getVn() {
return vn;
}

public void setVn(Vn vn) {
this.vn = vn;
}

}