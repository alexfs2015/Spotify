package com.spotify.mobile.android.wrapped2019.stories.templates.minuteslistened;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;

public class ArcView extends View {
    public float a;
    public final List<a> b = new ArrayList();
    private final RectF c = new RectF();
    private Paint d;
    private Paint e;
    private Paint f;
    private Paint g;

    public class a {
        public float a;
        public float b;

        private a(float f) {
            this.a = f;
        }

        public /* synthetic */ a(ArcView arcView, float f, byte b2) {
            this(0.0f);
        }
    }

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

    private float a(float f2, float f3) {
        return (((float) Math.sin(Math.toRadians((double) (f2 + 90.0f)))) * f3) + (((float) getHeight()) / 2.0f);
    }

    private void a() {
        boolean z = !true;
        this.d = new Paint(1);
        this.d.setStyle(Style.FILL);
        this.d.setColor(fr.c(getContext(), R.color.wrapped_black));
        this.e = new Paint(1);
        this.e.setStyle(Style.STROKE);
        this.e.setStrokeWidth(4.0f);
        this.e.setColor(fr.c(getContext(), R.color.wrapped_citric_40));
        this.g = new Paint(1);
        this.g.setStyle(Style.FILL);
        this.g.setColor(fr.c(getContext(), R.color.wrapped_citric));
        this.f = new Paint(1);
        this.f.setStyle(Style.STROKE);
        this.f.setStrokeWidth(8.0f);
        this.f.setColor(fr.c(getContext(), R.color.wrapped_citric));
    }

    private void a(Canvas canvas, int i, float f2, Paint paint, Paint paint2, boolean z) {
        int i2 = i;
        float f3 = f2;
        float f4 = f2;
        float f5 = ((float) i2) * 0.1414f;
        float width = (((float) (getWidth() << 1)) * f5) / 2.0f;
        float height = (((float) getHeight()) * f5) / 2.0f;
        this.c.set(width, height, ((float) (getWidth() << 1)) - width, ((float) getHeight()) - height);
        float f6 = f2;
        Paint paint3 = paint;
        canvas.drawArc(this.c, 90.0f, f2, false, paint);
        float width2 = ((float) getWidth()) - width;
        if (f4 != 180.0f && i2 != 0 && f4 != 0.0f && !z) {
            Canvas canvas2 = canvas;
            Canvas canvas3 = canvas;
            Paint paint4 = paint2;
            Paint paint5 = paint2;
            canvas.drawCircle(b(f2, width2), a(f2, width2), 10.0f, paint2);
        }
    }

    private float b(float f2, float f3) {
        return (((float) Math.cos(Math.toRadians((double) (f2 + 90.0f)))) * f3) + ((float) getWidth());
    }

    public a a(int i) {
        if (i < 0 || i >= this.b.size()) {
            return null;
        }
        return (a) this.b.get(i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.c.set(0.0f, 0.0f, (float) (getWidth() << 1), (float) getHeight());
        Canvas canvas2 = canvas;
        canvas.drawArc(this.c, 90.0f, 0.0f, true, this.d);
        for (int i = 1; i < 6; i++) {
            Canvas canvas3 = canvas;
            int i2 = i;
            a(canvas, i, 0.0f, this.e, this.g, true);
        }
        int size = this.b.size();
        for (int i3 = 1; i3 <= size; i3++) {
            a a2 = a(i3 - 1);
            if (a2 != null) {
                int alpha = ArcView.this.f.getAlpha();
                int alpha2 = ArcView.this.g.getAlpha();
                ArcView.this.f.setAlpha((int) (a2.b * 255.0f));
                ArcView.this.g.setAlpha((int) (a2.b * 255.0f));
                int i4 = i3;
                ArcView.this.a(canvas, i3, a2.a, ArcView.this.f, ArcView.this.g, false);
                ArcView.this.f.setAlpha(alpha);
                ArcView.this.g.setAlpha(alpha2);
            }
        }
    }
}
