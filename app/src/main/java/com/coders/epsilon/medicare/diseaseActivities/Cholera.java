package com.coders.epsilon.medicare.diseaseActivities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.coders.epsilon.medicare.R;


public class Cholera extends ActionBarActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cholera);
        textView=(TextView)findViewById(R.id.cholera);
        textView.setText(Html.fromHtml(getString(R.string.cholera)));
    }



}
