package kg.shtraf.shtrafkg;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        adapter.AddFragment(new Fragment_po_nomeru_ts(),"");
        adapter.AddFragment(new Fragment_po_pin(),"");
        adapter.AddFragment(new Fragment_po_nomeru_postanovleniya(),"");

        //adding Setup

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.po_nomeru_ts);
        tabLayout.getTabAt(1).setIcon(R.drawable.po_pin);
        tabLayout.getTabAt(2).setIcon(R.drawable.po_nomeru_postanovleniya);


    }
}
