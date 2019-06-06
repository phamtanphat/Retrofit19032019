package khoapham.ptp.phamtanphat.retrofit19032019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
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
//            Khoi tao ra interface
        //Khoi tao request
        ApiRequest apiRequest = retrofit.create(ApiRequest.class);
        //Goi phuong thuc request len server
        Call<Demo3> callbackdemo3 = apiRequest.getDemo3();
        //Lay du lieu thong qua callbackfunction
        callbackdemo3.enqueue(new Callback<Demo3>() {
            @Override
            public void onResponse(Call<Demo3> call, Response<Demo3> response) {
                Demo3 demo3 = response.body();
                Log.d("BBB",demo3.getLanguage().getEn().getAddress());
            }

            @Override
            public void onFailure(Call<Demo3> call, Throwable t) {

            }
        });

    }
    private void demo1(){
        //Khoi tao request
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://khoapham.vn/KhoaPhamTraining/json/tien/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        //Khoi tao phuong thuc truy cap ben phia server
//            Khoi tao ra interface
        //Khoi tao request
        ApiRequest apiRequest = retrofit.create(ApiRequest.class);
        //Goi phuong thuc request len server
        Call<Demo1> callbackdemo1 = apiRequest.getDemo1();
        //Lay du lieu thong qua callbackfunction
        callbackdemo1.enqueue(new Callback<Demo1>() {
            @Override
            public void onResponse(Call<Demo1> call, Response<Demo1> response) {
                Demo1 data = response.body();
                Log.d("BBB",data.getLogo() + "");
            }

            @Override
            public void onFailure(Call<Demo1> call, Throwable t) {

            }
        });
    }
    private void demo2(){
        //Khoi tao request
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://khoapham.vn/KhoaPhamTraining/json/tien/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        //Khoi tao phuong thuc truy cap ben phia server
//            Khoi tao ra interface
        //Khoi tao request
        ApiRequest apiRequest = retrofit.create(ApiRequest.class);
        //Goi phuong thuc request len server
        Call<Demo2> callbackdemo2 = apiRequest.getDemo2();
        //Lay du lieu thong qua callbackfunction
        callbackdemo2.enqueue(new Callback<Demo2>() {
            @Override
            public void onResponse(Call<Demo2> call, Response<Demo2> response) {
                Demo2 demo2 = response.body();
                Log.d("BBB",demo2.getDanhsach().get(0).getKhoahoc() + "");
            }

            @Override
            public void onFailure(Call<Demo2> call, Throwable t) {

            }
        });
    }

}
