package com.spotify.music.behindthelyrics.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.spotify.music.R;

public class BehindTheLyricsCard extends FrameLayout implements OnClickListener, kwc {
    protected float a;
    private ObjectAnimator b;
    private ProgressBar c;
    private Button d;
    private Paint e;
    private final RectF f = new RectF();
    private Intent g;
    private final kwa h = new kwa(fr.c(getContext(), R.color.genius_yellow));
    private BehindTheLyricsViewStateManager i;
    private boolean j = true;

    public BehindTheLyricsCard(Context context) {
        super(context);
    }

    public BehindTheLyricsCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BehindTheLyricsCard(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public final void a() {
        this.d.setVisibility(0);
        this.i.a(State.CREDITS);
    }

    public final void a(int i2, int i3, boolean z) {
        ObjectAnimator objectAnimator = this.b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.b = null;
        }
        this.c.setMax(i2);
        int i4 = i2 - i3;
        this.c.setProgress(i4);
        if (z) {
            this.b = ObjectAnimator.ofInt(this.c, "progress", new int[]{i4, 0});
            this.b.setDuration((long) i4);
            this.b.setInterpolator(new LinearInterpolator());
            this.b.start();
        }
    }

    public final void a(Intent intent) {
        this.g = intent;
    }

    public final void a(String str) {
        this.d.setVisibility(8);
        this.i.a(str);
    }

    public final void a(String str, kvy kvy, String str2) {
        this.d.setVisibility(8);
        this.i.a(str, kvy, str2);
    }

    public final void b() {
        this.d.setVisibility(8);
        this.i.a(State.INTRODUCTION);
    }

    public final void b(String str) {
        this.d.setVisibility(8);
        this.i.b(str);
    }

    public final void c(String str) {
        this.d.setVisibility(8);
        this.i.c(str);
    }

    public void onClick(View view) {
        Intent intent = this.g;
        if (view == this.d && intent != null) {
            getContext().startActivity(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.j) {
            this.f.set(0.0f, 0.0f, (float) width, (float) height);
            RectF rectF = this.f;
            float f2 = this.a;
            canvas.drawRoundRect(rectF, f2, f2, this.e);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.d = (Button) findViewById(R.id.go_to_genius);
        this.c = (ProgressBar) findViewById(R.id.progressBar);
        a g2 = ImmutableMap.g();
        g2.b(State.INTRODUCTION, findViewById(R.id.intro_card));
        g2.b(State.CREDITS, findViewById(R.id.credits_card));
        g2.b(State.LYRICS, findViewById(R.id.content_card));
        g2.b(State.INSIGHT, findViewById(R.id.content_card));
        g2.b(State.ARTIST_ANNOTATION, findViewById(R.id.content_card));
        kvw kvw = new kvw();
        kvu kvu = new kvu(this, kvw);
        BehindTheLyricsViewStateManager behindTheLyricsViewStateManager = new BehindTheLyricsViewStateManager(g2.b(), new kvz(this, kvw), kvu, kvw, this.h, getContext().getResources());
        this.i = behindTheLyricsViewStateManager;
        ((TextView) findViewById(R.id.intro_title)).setText(this.h.call(getContext().getString(R.string.btl_intro_card_title)));
        this.d.setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.e == null) {
            int size = MeasureSpec.getSize(i2);
            int size2 = MeasureSpec.getSize(i3);
            float f2 = ((float) size) / 2.0f;
            double d2 = (double) f2;
            double tan = Math.tan(Math.toRadians(10.0d));
            double d3 = (double) size2;
            Double.isNaN(d3);
            double d4 = tan * d3;
            Double.isNaN(d2);
            LinearGradient linearGradient = new LinearGradient(f2, (float) size2, (float) ((int) (d2 - d4)), 0.0f, fr.c(getContext(), R.color.black_80), fr.c(getContext(), R.color.black_30), TileMode.CLAMP);
            this.e = new Paint(1);
            this.e.setShader(linearGradient);
        }
        super.onMeasure(i2, i3);
    }
}
