package com.spotify.music.nowplaying.ads.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.R;

public class AudioAdsActionsView extends LinearLayout implements thk {
    private Button a;
    private Button b;
    private Button c;
    private TextView d;
    private a e;

    public AudioAdsActionsView(Context context) {
        this(context, null);
    }

    public AudioAdsActionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AudioAdsActionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.audio_ads_actions, this);
        this.d = (TextView) findViewById(R.id.audio_ads_title);
        this.a = (Button) findViewById(R.id.ad_call_to_action);
        this.a.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                AudioAdsActionsView.this.c(view);
            }
        });
        this.b = (Button) findViewById(R.id.reject_offer_button);
        this.b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                AudioAdsActionsView.this.b(view);
            }
        });
        this.c = (Button) findViewById(R.id.accept_offer_button);
        this.c.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                AudioAdsActionsView.this.a(view);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.e.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.e.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.e.c();
    }

    public final void a(Boolean bool) {
        this.b.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = getContext().getString(R.string.watch_now_reject_video_ad);
        }
        this.b.setText(str);
    }

    public final void a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            str = z ? getContext().getString(R.string.c2p_play_track_button) : getContext().getString(R.string.audio_ad_learn_more_button);
        }
        this.a.setText(str);
    }

    public final void a(a aVar) {
        this.e = aVar;
    }

    public final void b(Boolean bool) {
        this.c.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public final void b(String str) {
        this.c.setText(str);
    }

    public final void c(Boolean bool) {
        this.a.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public final void c(String str) {
        this.d.setText(str);
    }

    public final void d(Boolean bool) {
        this.d.setVisibility(bool.booleanValue() ? 0 : 8);
    }
}
