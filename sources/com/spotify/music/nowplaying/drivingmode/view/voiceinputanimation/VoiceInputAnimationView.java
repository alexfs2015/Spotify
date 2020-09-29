package com.spotify.music.nowplaying.drivingmode.view.voiceinputanimation;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.AccelerateInterpolator;
import com.spotify.music.R;
import java.util.ArrayList;

public class VoiceInputAnimationView extends View implements AnimatorUpdateListener, tfs {
    private final Paint a;
    private final ArrayList<RectF> b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private ValueAnimator h;

    public VoiceInputAnimationView(Context context) {
        this(context, null);
    }

    public VoiceInputAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceInputAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new ArrayList<>(4);
        this.a = new Paint();
        this.a.setColor(fr.c(context, R.color.green_light));
        this.a.setAntiAlias(true);
        this.h = new ValueAnimator();
        this.h.addUpdateListener(this);
        this.h.setInterpolator(new AccelerateInterpolator());
        this.h.setDuration(50);
        this.b.add(new RectF());
        this.b.add(new RectF());
        this.b.add(new RectF());
        this.b.add(new RectF());
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.h.removeAllUpdateListeners();
        this.h = null;
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        float size = (float) MeasureSpec.getSize(i);
        this.f = (size - ((this.e * ((float) this.b.size())) + (this.d * (((float) this.b.size()) - 1.0f)))) / 2.0f;
        float f2 = size * 0.07f;
        this.e = f2;
        this.d = f2;
        this.g = ((float) MeasureSpec.getSize(i2)) / 2.0f;
        super.onMeasure(i, i2);
    }

    public void draw(Canvas canvas) {
        float f2;
        float f3;
        super.draw(canvas);
        for (int i = 0; i < this.b.size(); i++) {
            RectF rectF = (RectF) this.b.get(i);
            rectF.left = this.f + ((this.e + this.d) * ((float) i));
            rectF.right = rectF.left + this.e;
            if (i == 1) {
                f2 = this.g;
                f3 = 0.75f;
            } else if (i == 2) {
                f2 = this.g;
                f3 = 0.5f;
            } else {
                f2 = this.g;
                f3 = 0.25f;
            }
            float f4 = f2 * f3 * this.c;
            float f5 = this.e;
            if (f4 < f5 / 2.0f) {
                f4 = f5 / 2.0f;
            }
            float f6 = this.g;
            rectF.top = f6 - f4;
            rectF.bottom = f6 + f4;
            float f7 = this.e;
            canvas.drawRoundRect(rectF, f7, f7, this.a);
        }
    }

    public final void a(float f2) {
        if (getHandler() != null && this.h != null) {
            getHandler().post(new Runnable(f2) {
                private final /* synthetic */ float f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    VoiceInputAnimationView.this.b(this.f$1);
                }
            });
        }
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        postInvalidate();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(float f2) {
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.h.setFloatValues(new float[]{this.c, f2});
            this.h.start();
        }
    }
}
