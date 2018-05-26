package kg.shtraf.shtrafkg;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Po_nomeru_TS extends AppCompatActivity {

    private TextView textView;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_po_nomeru__ts);

        if (findViewById(R.id.fragment_container) != null){

            if(savedInstanceState!=null){
                return;
            }

            Fragment_po_nomeru_ts fragment_po_nomeru_ts = new Fragment_po_nomeru_ts();
           android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,fragment_po_nomeru_ts,null);
            fragmentTransaction.commit();
        }

    }
    public void onMessageRead(String message) {
    textView =findViewById(R.id.nomer_auto_display);
    textView.setText(message);
    }
}
