package com.xsyf.butterknifeexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button_change)
    Button buttonChange;

    @BindView(R.id.tv_text)
    TextView tvText;

    char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button_change)
    public void change() {
        buttonChange.setText(Character.toString(letters[i]));
        tvText.setText(Character.toString(letters[i]));
        if (++i >= letters.length)
            i = 0;
    }
}