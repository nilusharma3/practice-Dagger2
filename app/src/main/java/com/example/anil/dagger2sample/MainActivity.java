package com.example.anil.dagger2sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.anil.dagger2sample.models.SampleData;

import javax.inject.Inject;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Inject
    public MainPresenter presenter;

    private TextView tvSampleName, tvSAmpleData;
    private Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GlobalApplication.component(getApplicationContext()).inject(this);

        initViews();
        initListeners();
    }

    private void initViews() {
        tvSampleName = findViewById(R.id.tvSampleName);
        tvSAmpleData = findViewById(R.id.tvSAmpleData);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
    }


    private void initListeners() {
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(final View v) {
        switch (v.getId()) {
            case R.id.button:
                if (presenter != null) {
                    tvSampleName.setText(presenter.getName());
                }
                break;
            case R.id.button2:
                SampleData sampleData = presenter.getSAmpleData();
                tvSAmpleData.setText("TITLE : " + sampleData.getTitle() + " \n NUMBER : " + sampleData.getNumber());
                break;
            default:
                break;
        }
    }
}
