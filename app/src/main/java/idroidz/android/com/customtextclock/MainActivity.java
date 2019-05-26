package idroidz.android.com.customtextclock;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import idroidz.android.com.customtextclock.view.CustomTextClock;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text_clock)
    CustomTextClock textClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.hour_12_format)
    public void hour12Clicked() {
        textClock.setFormat12Hour("hh:mm a");
    }

    @OnClick(R.id.hour_24_format)
    public void hour24Clicked() {
        textClock.setFormat24Hour("HH:mm");
    }
}
