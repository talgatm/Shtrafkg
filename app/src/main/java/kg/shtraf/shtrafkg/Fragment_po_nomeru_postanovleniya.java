package kg.shtraf.shtrafkg;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by User on 26.04.2018.
 */

public class Fragment_po_nomeru_postanovleniya extends Fragment{

    View view;
    public Fragment_po_nomeru_postanovleniya() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.po_nomeru_postanovleniya_fragment,container,false);
        return view;
    }
}
