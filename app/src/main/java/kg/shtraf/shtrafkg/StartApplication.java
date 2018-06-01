package kg.shtraf.shtrafkg;

import android.app.Application;

import kg.shtraf.shtrafkg.network.ApiService;
import kg.shtraf.shtrafkg.network.RetrofitClient;

/**
 * Created by User on 26.05.2018.
 */

public class StartApplication extends Application {
    public static class ApiUtils {

        public static final String BASE_URL = "https://api.myjson.com/";

        public static ApiService getService() {
            return RetrofitClient.getClient(BASE_URL).create(ApiService.class);
        }
    }
}
