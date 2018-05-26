package kg.shtraf.shtrafkg;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

/**
 * Created by User on 26.04.2018.
 */

public class Fragment_po_nomeru_ts extends Fragment {

    /*public interface onSomeEventListener {
        public void someEvent(String s);
    }

    onSomeEventListener someEventListener;
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            someEventListener = (onSomeEventListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement onSomeEventListener");
        }
    }*/

    final String LOG_TAG = "myLogs";


    private TextInputLayout textInputCar,textInputTS;
    private EditText edittextInputCar, edittextInputTS;
    private Button button ;

    public Fragment_po_nomeru_ts() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view;
         view = inflater.inflate(R.layout.po_nomeru_ts_fragment, container, false);

//        textInputCar = (TextInputLayout) view.findViewById(R.id.til_nomermawiny);
//        textInputTS = (TextInputLayout) view.findViewById(R.id.til_nomerts);

        edittextInputCar = (TextInputEditText) view.findViewById(R.id.tiet_nomer_auto);
        edittextInputTS = (TextInputEditText) view.findViewById(R.id.tiet_nomer_ts);

        button = (Button) view.findViewById(R.id.btnts);


        return view;
    }


}
