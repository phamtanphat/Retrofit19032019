package khoapham.ptp.phamtanphat.retrofit19032019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Khoi tao request
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://khoapham.vn/KhoaPhamTraining/json/tien/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        //Khoi tao phuong thuc truy cap ben phia server
    }

}
