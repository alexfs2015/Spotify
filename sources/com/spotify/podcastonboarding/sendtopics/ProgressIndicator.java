package com.spotify.podcastonboarding.sendtopics;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.LinearLayout;
import com.spotify.music.R;

public class ProgressIndicator extends LinearLayout {
    private static final float[] a = {0.0f, 0.25f, 0.5f, 0.75f, 1.0f};
    private static final float[] b = {0.0f, -1.0f, -8.0f, -1.0f, 0.0f};
    private static final float[] c = {1.0f, 1.0f, 1.0f, 0.2f, 1.0f};
    private static final float[] d = {0.6f, 1.0f, 1.0f, 0.2f, 0.6f};
    private static final float[] e = {0.2f, 0.6f, 1.0f, 0.2f, 0.2f};
    private View f;
    private View g;
    private View h;

    public ProgressIndicator(Context context) {
        this(context, null);
    }

    public ProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.progress_indicator, this);
        setGravity(80);
        setMinimumHeight(vfj.b(16.0f, getResources()));
        this.f = findViewById(R.id.dot1);
        this.g = findViewById(R.id.dot2);
        this.h = findViewById(R.id.dot3);
        this.f.setAlpha(1.0f);
        this.g.setAlpha(0.6f);
        this.h.setAlpha(0.2f);
        final ObjectAnimator a2 = a(this.f, c, 0);
        final ObjectAnimator a3 = a(this.g, d, 500);
        final ObjectAnimator a4 = a(this.h, e, 1000);
        getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
            public final boolean onPreDraw() {
                ProgressIndicator.this.getViewTreeObserver().removeOnPreDrawListener(this);
                a2.start();
                a3.start();
                a4.start();
                return false;
            }
        });
    }

    private static ObjectAnimator a(View view, float[] fArr, int i) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe(View.ALPHA, a(fArr)), PropertyValuesHolder.ofKeyframe(View.TRANSLATION_Y, a(b))});
        ofPropertyValuesHolder.setStartDelay((long) i);
        ofPropertyValuesHolder.setDuration(1500);
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.setRepeatMode(1);
        return ofPropertyValuesHolder;
    }

    private static Keyframe[] a(float[] fArr) {
        Keyframe[] keyframeArr = new Keyframe[5];
        for (int i = 0; i < 5; i++) {
            keyframeArr[i] = Keyframe.ofFloat(a[i], fArr[i]);
        }
        return keyframeArr;
    }
}
