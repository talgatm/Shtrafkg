package kg.shtraf.shtrafkg.ui.main;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import kg.shtraf.shtrafkg.R;
import kg.shtraf.shtrafkg.ui.fines.FinesActivity;

/**
 * Created by User on 26.04.2018.
 */

public class FragmentTSNumber extends Fragment implements View.OnClickListener {

    final String LOG_TAG = "myLogs";


    private TextInputLayout textInputCar,textInputTS;
    private EditText edittextInputCar, edittextInputTS;
    private Button button ;

    public FragmentTSNumber() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view;
         view = inflater.inflate(R.layout.fragment_po_nomeru_ts, container, false);

//        textInputCar = (TextInputLayout) view.findViewById(R.id.til_nomermawiny);
//        textInputTS = (TextInputLayout) view.findViewById(R.id.til_nomerts);

        edittextInputCar = (TextInputEditText) view.findViewById(R.id.tiet_nomer_auto);
        edittextInputTS = (TextInputEditText) view.findViewById(R.id.tiet_nomer_ts);

        button = (Button) view.findViewById(R.id.btnts);
        button.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View view) {
        if (view == button){
            Intent intent = new Intent(getActivity(), FinesActivity.class);
            getActivity().startActivity(intent);
        }

    }
}
