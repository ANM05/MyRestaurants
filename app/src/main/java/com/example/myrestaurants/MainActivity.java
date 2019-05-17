package com.example.myrestaurants;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Typeface;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
//    public static final String TAG= MainActivity.class.getSimpleName();
    @BindView(R.id.findRestaurantsButton) Button mFindRestaurantsButton;
    @BindView (R.id.locationEditText) EditText mLocationEditText;
    @BindView (R.id.appNameTextView) TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Typeface ostrichFont = Typeface.createFromAsset(getAssets(), "fonts/ostrich-regular.ttf");
        mAppNameTextView.setTypeface(ostrichFont);
        mFindRestaurantsButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v == mFindRestaurantsButton){
        String location = mLocationEditText.getText().toString();
//                Log.d(TAG, location);
        Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
        intent.putExtra("location", location);
        startActivity(intent);
        }
    }
}
