package kg.shtraf.shtrafkg.ui.main;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kg.shtraf.shtrafkg.R;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout =(TabLayout) findViewById(R.id.tablayout_id);
        appBarLayout=(AppBarLayout) findViewById(R.id.appbar_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);

         ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager());

         //adding Fragments
        adapter.AddFragment(new FragmentTSNumber(),"");
        adapter.AddFragment(new FragmentPinCode(),"");
        adapter.AddFragment(new FragmentProtocolNumber(),"");

        //adding Setup

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.po_nomeru_ts);
        tabLayout.getTabAt(1).setIcon(R.drawable.po_pin);
        tabLayout.getTabAt(2).setIcon(R.drawable.po_nomeru_postanovleniya);


    }
}
