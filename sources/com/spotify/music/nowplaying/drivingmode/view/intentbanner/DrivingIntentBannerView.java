package com.spotify.music.nowplaying.drivingmode.view.intentbanner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;

public class DrivingIntentBannerView extends ConstraintLayout {
    private TextView b;
    private TextView c;

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
    }

    public DrivingIntentBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public DrivingIntentBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    private void b() {
        inflate(getContext(), R.layout.driving_intent_banner_view, this);
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                DrivingIntentBannerView.this.b(view);
            }
        });
        this.b = (TextView) findViewById(R.id.driving_intent_banner_title);
        this.c = (TextView) findViewById(R.id.driving_intent_banner_header);
    }
}
