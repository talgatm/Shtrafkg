package kg.shtraf.shtrafkg.ui.main;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kg.shtraf.shtrafkg.R;

/**
 * Created by User on 26.04.2018.
 */

public class FragmentProtocolNumber extends Fragment{

    View view;
    public FragmentProtocolNumber() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_po_nomeru_postanovleniya,container,false);
        return view;
    }
}
