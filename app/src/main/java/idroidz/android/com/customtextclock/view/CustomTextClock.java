package idroidz.android.com.customtextclock.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextClock;

public class CustomTextClock extends TextClock {
    //https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
    private static final String DEFAULT_FORCED_24_HOUR_FORMAT = "kk:mm";

    public CustomTextClock(Context context) {
        super(context);
    }

    public CustomTextClock(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomTextClock(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomTextClock(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void setFormat24Hour(CharSequence charSequence) {
        if (is24HourModeEnabled()) {
            super.setFormat24Hour(charSequence);
        } else {
            super.setFormat12Hour(DEFAULT_FORCED_24_HOUR_FORMAT);
        }
    }

    public void setFormat12Hour(CharSequence charSequence) {
        if (is24HourModeEnabled()) {
            super.setFormat24Hour(charSequence);
        } else {
            super.setFormat12Hour(charSequence);
        }
    }
}
