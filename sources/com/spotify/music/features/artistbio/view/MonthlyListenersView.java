package com.spotify.music.features.artistbio.view;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.music.R;
import java.text.NumberFormat;
import java.util.Locale;

public class MonthlyListenersView extends RelativeLayout {
    private static final String[] d;
    public TextView a;
    private TextView b;
    private View c;

    public MonthlyListenersView(Context context) {
        this(context, null);
    }

    public MonthlyListenersView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MonthlyListenersView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.b = (TextView) findViewById(R.id.rankText);
        this.a = (TextView) findViewById(R.id.monthly_listeners);
        this.c = findViewById(R.id.rank);
    }

    public final void a(int i, int i2) {
        if (i2 > 0) {
            this.b.setText(a(i2));
            this.c.setVisibility(0);
        }
        if (i > 0) {
            this.a.setText(NumberFormat.getInstance(Locale.getDefault()).format((long) i));
            setVisibility(0);
        }
    }

    static {
        String str = "th";
        d = new String[]{str, "st", "nd", "rd", str, str, str, str, str, str};
    }

    private static CharSequence a(int i) {
        if (!"en".equals(gnd.a(Locale.getDefault()))) {
            return String.valueOf(i);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i));
        int length = sb.length();
        switch (i % 100) {
            case 11:
            case 12:
            case 13:
                sb.append("th");
                break;
            default:
                sb.append(d[i % 10]);
                break;
        }
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new RelativeSizeSpan(0.5f), length, sb.length(), 0);
        return spannableString;
    }
}
