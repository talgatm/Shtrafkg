package kg.shtraf.shtrafkg.ui.fines;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import kg.shtraf.shtrafkg.StartApplication;
import kg.shtraf.shtrafkg.R;
import kg.shtraf.shtrafkg.model.Fine;

public class FinesActivity extends AppCompatActivity implements FinesContract.View {
    private Fine fine = new Fine();
    private FinesAdapter mFinesAdapter;
    private RecyclerView mRvResultsList;
    private FinesPresenter mFinesPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fines);
        init();
    }

    void init(){
        initPresenter();
    }

    private void initPresenter() {
        mFinesPresenter = new FinesPresenter(StartApplication.ApiUtils.getService(), this);
        mFinesPresenter.getFine("vv","vdsv");
    }

    private void initRecyclerView() {
        mRvResultsList = findViewById(R.id.rvResultsList);
        mRvResultsList.setLayoutManager(new LinearLayoutManager(this));
        mFinesAdapter = new FinesAdapter(fine.getResult());
        mRvResultsList.setAdapter(mFinesAdapter);
    }

    @Override
    public void onSuccessGetFines(Fine fine) {
        this.fine = fine;
        initRecyclerView();
    }

    @Override
    public void onError(String errorMessage) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show();
    }
}
