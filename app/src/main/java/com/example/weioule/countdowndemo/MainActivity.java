package com.example.weioule.countdowndemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import static com.example.weioule.countdowndemo.R.id.phone_edit_text;


/**
 * author weioule
 * Create on 2018/6/8.
 */
public class MainActivity extends AppCompatActivity {

    private SmsEditText mSmsEditText, mPhoneEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        mPhoneEditText = (SmsEditText) findViewById(phone_edit_text);
        mSmsEditText = (SmsEditText) findViewById(R.id.sms_edit_text);
        mSmsEditText.getSendButton().setOnSendClickListener(new SendButton.SendClickListener() {

            @Override
            public String onGetVerifyPhone() {
                return mPhoneEditText.getEditText().getText().toString().trim();
            }

            @Override
            public void onSendVerificationCode() {
                Toast.makeText(MainActivity.this, "验证码发送ing", Toast.LENGTH_SHORT).show();
            }
        });
    }
}