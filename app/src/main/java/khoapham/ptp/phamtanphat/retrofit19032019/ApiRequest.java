package khoapham.ptp.phamtanphat.retrofit19032019;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiRequest {
    @GET("demo1.json")
    Call<Demo1> getDemo1();
}
