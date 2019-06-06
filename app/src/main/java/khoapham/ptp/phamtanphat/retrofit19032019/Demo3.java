package khoapham.ptp.phamtanphat.retrofit19032019;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Demo3 {

@SerializedName("language")
@Expose
private Language language;

public Language getLanguage() {
return language;
}

public void setLanguage(Language language) {
this.language = language;
}

}