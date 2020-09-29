package com.spotify.music.newplaying.scroll.widgets.pivots.views;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.spotify.music.R;

public class PivotsWidgetLoadingView extends LinearLayout {
    private PivotView a;
    private PivotView b;
    private PivotView c;
    private final AnimatorSet d;

    public PivotsWidgetLoadingView(Context context) {
        this(context, null);
    }

    public PivotsWidgetLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PivotsWidgetLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new AnimatorSet();
        setOrientation(1);
        inflate(getContext(), R.layout.content_view, this);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (PivotView) findViewById(R.id.pivot_1);
        this.b = (PivotView) findViewById(R.id.pivot_2);
        this.c = (PivotView) findViewById(R.id.pivot_3);
        a(this.a);
        a(this.b);
        a(this.c);
        a();
    }

    private static void a(PivotView pivotView) {
        pivotView.setBackground(null);
        pivotView.setFocusable(false);
        pivotView.setClickable(false);
        pivotView.a.setBackgroundResource(R.drawable.loading_rounded_corner_title_bg);
        pivotView.b.setBackgroundResource(R.drawable.loading_rounded_corner_subtitle_bg);
        pivotView.c.setBackgroundResource(R.color.pivots_loading_color);
        pivotView.d.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            if (i == 4 || i == 8) {
                this.d.cancel();
                this.a.setLayerType(0, null);
                this.b.setLayerType(0, null);
                this.c.setLayerType(0, null);
            }
            return;
        }
        a();
    }

    private void a() {
        this.d.cancel();
        this.d.playTogether(new Animator[]{a(this.a, 0), a(this.b, 200), a(this.c, 400)});
        this.d.start();
    }

    private static ObjectAnimator a(PivotView pivotView, int i) {
        pivotView.setLayerType(2, null);
        ObjectAnimator duration = ObjectAnimator.ofFloat(pivotView, "alpha", new float[]{1.0f, 0.5f, 1.0f}).setDuration(1400);
        duration.setRepeatCount(-1);
        duration.setRepeatMode(1);
        duration.setInterpolator(ftn.e);
        duration.setStartDelay((long) i);
        return duration;
    }
}
