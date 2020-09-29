package com.spotify.android.stories.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import com.spotify.music.R;

public final class PausableProgressBar extends FrameLayout {
    /* access modifiers changed from: 0000 */
    public final View a;
    /* access modifiers changed from: 0000 */
    public final View b;
    b c;
    long d;
    /* access modifiers changed from: 0000 */
    public a e;
    private final View f;

    interface a {
        void onFinishProgress();
    }

    static class b extends ScaleAnimation {
        long a;
        boolean b;

        b(float f, float f2, float f3, float f4, int i, float f5, int i2, float f6) {
            super(0.0f, 1.0f, 1.0f, 1.0f, 0, 0.0f, 1, 0.0f);
        }

        public final boolean getTransformation(long j, Transformation transformation, float f) {
            if (this.b && this.a == 0) {
                this.a = j - getStartTime();
            }
            if (this.b) {
                setStartTime(j - this.a);
            }
            return super.getTransformation(j, transformation, f);
        }
    }

    public PausableProgressBar(Context context) {
        this(context, null);
    }

    public PausableProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PausableProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 6000;
        View inflate = LayoutInflater.from(context).inflate(R.layout.pausable_progress, this);
        this.f = ip.d(inflate, (int) R.id.progress_background);
        this.a = ip.d(inflate, (int) R.id.progress_current);
        this.b = ip.d(inflate, (int) R.id.progress_max);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.a.setAnimation(null);
        b bVar = this.c;
        if (bVar != null) {
            bVar.setAnimationListener(null);
            this.c.cancel();
            this.c = null;
        }
    }

    public final void a(int i) {
        this.f.setBackgroundColor(i);
    }

    public final void b(int i) {
        this.a.setBackgroundColor(i);
        this.b.setBackgroundColor(i);
    }
}
