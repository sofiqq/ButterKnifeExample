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

    @BindView(R.id.button_up)
    Button buttonUp;
    @BindView(R.id.button_down)
    Button buttonDown;

    @BindView(R.id.tv_text)
    TextView tvText;

    char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setTextToTv();
    }

    @OnClick({R.id.button_up, R.id.button_down})
    public void change(Button button) {
        switch (button.getId()) {
            case R.id.button_up:
                if (++i >= letters.length)
                    i = 0;
                setTextToTv();
                break;
            case R.id.button_down:
                if (--i < 0)
                    i = letters.length - 1;
                setTextToTv();
                break;
        }
    }

    public void setTextToTv() {
        tvText.setText(Character.toString(letters[i]));
    }
}