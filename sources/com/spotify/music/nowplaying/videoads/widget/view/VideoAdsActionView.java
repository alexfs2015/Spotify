package com.spotify.music.nowplaying.videoads.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;

public class VideoAdsActionView extends ConstraintLayout implements tsm {
    private Button b;
    private a c;

    public VideoAdsActionView(Context context) {
        this(context, null);
    }

    public VideoAdsActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoAdsActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(context, R.layout.video_ads_action_view, this);
        this.b = (Button) findViewById(R.id.video_ad_call_to_action_button);
        this.b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                VideoAdsActionView.this.b(view);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.c.a();
    }

    public final void a(String str) {
        this.b.setText(str);
    }

    public final void a(a aVar) {
        this.c = aVar;
    }

    public final void a(boolean z) {
        setVisibility(z ? 0 : 4);
    }
}
