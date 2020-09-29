package com.spotify.music.nowplaying.ads.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconView;

public class VoiceAdsView extends RelativeLayout implements thn {
    private a a;
    private View b;
    private View c;
    private View d;
    private SpotifyIconView e;
    private ImageView f;
    private final AnimatorSet g;
    private final AnimatorSet h;
    private final AnimatorSet i;

    public VoiceAdsView(Context context) {
        this(context, null);
    }

    public VoiceAdsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceAdsView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.g = new AnimatorSet();
        this.h = new AnimatorSet();
        this.i = new AnimatorSet();
        inflate(getContext(), R.layout.voice_ads_options, this);
        this.b = findViewById(R.id.circle_small);
        this.c = findViewById(R.id.circle_middle);
        this.d = findViewById(R.id.circle_large);
        this.e = (SpotifyIconView) findViewById(R.id.microphone_on);
        this.f = (ImageView) findViewById(R.id.microphone_off);
        View findViewById = findViewById(R.id.microphone_wrapper);
        TextView textView = (TextView) findViewById(R.id.voice_ad_settings);
        int color = getResources().getColor(R.color.voice_ad_mic_background);
        int color2 = getResources().getColor(17170443);
        if (VERSION.SDK_INT >= 17) {
            this.b.setBackground(new jsq(color2, color2, 0));
            this.c.setBackground(new jsq(color, color, 0));
            this.d.setBackground(new jsq(color, color, 0));
        }
        findViewById.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                VoiceAdsView.this.b(view);
            }
        });
        textView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                VoiceAdsView.this.a(view);
            }
        });
    }

    private static void a(AnimatorSet animatorSet) {
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    private static void a(AnimatorSet animatorSet, View view, long j) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{1.0f, 0.9f});
        ofFloat.setDuration(400);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{1.0f, 0.9f});
        ofFloat2.setDuration(400);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setStartDelay(j);
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.start();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.c();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.d();
        }
    }

    public final void a() {
        ((Activity) getContext()).finish();
    }

    public final void a(a aVar) {
        this.a = aVar;
    }

    public final void a(boolean z) {
        setVisibility(z ? 0 : 4);
    }

    public final void b(boolean z) {
        int i2 = 4;
        this.e.setVisibility(z ? 0 : 4);
        this.b.setVisibility(z ? 0 : 4);
        this.c.setVisibility(z ? 0 : 4);
        this.d.setVisibility(z ? 0 : 4);
        ImageView imageView = this.f;
        if (!z) {
            i2 = 0;
        }
        imageView.setVisibility(i2);
        if (z) {
            Logger.b("[VoiceAd] starting animations...", new Object[0]);
            a(this.g, this.b, 0);
            a(this.h, this.c, 100);
            a(this.i, this.d, 200);
            return;
        }
        Logger.b("[VoiceAd] stopping animations...", new Object[0]);
        a(this.g);
        a(this.h);
        a(this.i);
    }
}
