package com.spotify.mobile.android.wrapped2019.stories.templates.minuteslistened;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.common.collect.ImmutableList;
import com.spotify.music.R;

public class ArcView extends View {
    public float a;
    public ImmutableList<Integer> b;
    private final RectF c = new RectF();
    private Paint d;
    private Paint e;
    private Paint f;
    private Paint g;

    public ArcView(Context context) {
        super(context);
        a();
    }

    public ArcView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public ArcView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        this.d = new Paint();
        this.d.setStyle(Style.FILL);
        this.d.setColor(fr.c(getContext(), R.color.wrapped_black));
        this.e = new Paint();
        this.e.setStyle(Style.STROKE);
        this.e.setStrokeWidth(4.0f);
        this.e.setColor(fr.c(getContext(), R.color.wrapped_citric_40));
        this.g = new Paint();
        this.g.setStyle(Style.FILL);
        this.g.setColor(fr.c(getContext(), R.color.wrapped_citric));
        this.f = new Paint();
        this.f.setStyle(Style.STROKE);
        this.f.setStrokeWidth(8.0f);
        this.f.setColor(fr.c(getContext(), R.color.wrapped_citric));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.c.set(0.0f, 0.0f, (float) (getWidth() << 1), (float) getHeight());
        canvas.drawArc(this.c, 90.0f, 180.0f, false, this.d);
        for (int i = 1; i < 6; i++) {
            a(canvas, i, 180.0f, this.e);
        }
        if (!this.b.isEmpty()) {
            for (int i2 = 1; i2 <= this.b.size(); i2++) {
                a(canvas, i2, (((((float) ((Integer) this.b.get(i2 - 1)).intValue()) / this.a) * 100.0f) * 144.0f) / 100.0f, this.f);
            }
        }
    }

    private void a(Canvas canvas, int i, float f2, Paint paint) {
        float f3 = ((float) i) * 0.1414f;
        float width = (((float) (getWidth() << 1)) * f3) / 2.0f;
        float height = (((float) getHeight()) * f3) / 2.0f;
        this.c.set(width, height, ((float) (getWidth() << 1)) - width, ((float) getHeight()) - height);
        canvas.drawArc(this.c, 90.0f, f2, false, paint);
        float width2 = ((float) getWidth()) - width;
        if (f2 != 180.0f && i != 0) {
            canvas.drawCircle(b(f2, width2), a(f2, width2), 10.0f, this.g);
        }
    }

    private float a(float f2, float f3) {
        return (((float) Math.sin(Math.toRadians((double) (f2 + 90.0f)))) * f3) + (((float) getHeight()) / 2.0f);
    }

    private float b(float f2, float f3) {
        return (((float) Math.cos(Math.toRadians((double) (f2 + 90.0f)))) * f3) + ((float) getWidth());
    }
}
