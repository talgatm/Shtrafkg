package kg.shtraf.shtrafkg.ui.fines;

import kg.shtraf.shtrafkg.R;
import kg.shtraf.shtrafkg.model.Fine;
import kg.shtraf.shtrafkg.network.ApiService;
import kg.shtraf.shtrafkg.ui.fines.FinesContract.*;
import retrofit2.Call;
import retrofit2.Response;

public class FinesPresenter implements Presenter {
    private ApiService mService;
    private View mView;

    public FinesPresenter(ApiService mService, View mView) {
        this.mService = mService;
        this.mView = mView;
    }

    @Override
    public void getFine(String numberAuto, String numberRegistr) {
        mService.getFine(/*numberAuto, numberRegistr*/).enqueue(new retrofit2.Callback<Fine>() {
            @Override
            public void onResponse(Call<Fine> call, Response<Fine> response) {
                if (response.isSuccessful()){
                    mView.onSuccessGetFines(response.body());
                } else {
                    mView.onError(String.valueOf(R.string.error_network_message));
                }

            }

            @Override
            public void onFailure(Call<Fine> call, Throwable t) {
                mView.onError(String.valueOf(R.string.error_network_message));
            }
        });
    }
}
