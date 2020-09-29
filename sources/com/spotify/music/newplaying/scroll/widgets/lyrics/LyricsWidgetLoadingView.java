package com.spotify.music.newplaying.scroll.widgets.lyrics;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.spotify.music.R;

public class LyricsWidgetLoadingView extends LinearLayout {
    private final AnimatorSet a;
    private View b;
    private View c;
    private View d;
    private View e;

    public LyricsWidgetLoadingView(Context context) {
        this(context, null);
    }

    public LyricsWidgetLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LyricsWidgetLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new AnimatorSet();
        LayoutInflater.from(context).inflate(R.layout.lyrics_loading_view, this);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.b = findViewById(R.id.view1);
        this.c = findViewById(R.id.view2);
        this.d = findViewById(R.id.view3);
        this.e = findViewById(R.id.view4);
    }

    private static ObjectAnimator a(View view, int i) {
        view.setLayerType(2, null);
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.08f, 0.16f, 0.08f}).setDuration(1400);
        duration.setRepeatCount(-1);
        duration.setRepeatMode(1);
        duration.setInterpolator(ftn.e);
        duration.setStartDelay((long) i);
        return duration;
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        if (i != 0) {
            if (i == 4 || i == 8) {
                this.a.cancel();
                this.b.setLayerType(0, null);
                this.c.setLayerType(0, null);
                this.d.setLayerType(0, null);
                this.e.setLayerType(0, null);
            }
            return;
        }
        this.a.cancel();
        this.a.playTogether(new Animator[]{a(this.b, 0), a(this.c, 200), a(this.d, 400), a(this.e, 600)});
        this.a.start();
    }
}
