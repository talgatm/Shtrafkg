package kg.shtraf.shtrafkg.network;


import kg.shtraf.shtrafkg.model.Fine;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;

/**
 * Created by User on 26.05.2018.
 */

public interface ApiService {/*
    @GET("getData/{numberAuto}/{numberRegistr}")
    Call<Fine> getFine(@Path("numberAuto") String numberAuto, @Path("numberRegistr") String numberReigstr);*/

    @GET("bins/q6e5q")
    Call<Fine> getFine(/*String numberAuto, String numberReigstr*/);
}
