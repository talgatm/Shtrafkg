package kg.shtraf.shtrafkg.ui.fines;

import kg.shtraf.shtrafkg.model.Fine;

/**
 * Created by User on 01.06.2018.
 */

public interface FinesContract {
    public interface Presenter {
        public void getFine(String numberAuto, String numberRegistr);
    }

    public interface View {
        void onSuccessGetFines(Fine fine);

        void onError(String errorMessage);
    }


}
