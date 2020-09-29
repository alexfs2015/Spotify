package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: udn reason: default package */
public final class udn implements udm {
    private int a;
    private final udp b;
    private vgo c;
    private vgo d;
    private int e;
    private int f;

    public udn(TextPaint textPaint, int i, int i2) {
        this(new udp(textPaint, i, i2));
    }

    private udn(udp udp) {
        this.a = Integer.MAX_VALUE;
        this.b = (udp) fbp.a(udp);
        a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int a(float f2) {
        return 872415231;
    }

    private void a() {
        this.f = -14145496;
        this.e = 872415231;
        this.c = $$Lambda$udn$JJEJ7YL_f5Fy1w8dyyzzgiNizQ.INSTANCE;
        this.d = $$Lambda$udn$w9mTn1y8dSKi47nGw8WAquUka4.INSTANCE;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int b(float f2) {
        return -14145496;
    }

    public final void a(int i) {
        this.a = 100;
    }

    public final void a(int i, int i2) {
        if (this.f != i || this.e != i2) {
            this.f = i;
            this.e = i2;
            this.c = vgp.a(-14145496, i);
            this.d = vgp.a(872415231, i2);
        }
    }

    public final void a(Canvas canvas, Paint paint, RectF rectF, float f2, float f3) {
        paint.setColor(this.c.interpolate(f2));
        canvas.drawRoundRect(rectF, f3, f3, paint);
        udp udp = this.b;
        int interpolate = this.d.interpolate(f2);
        if (udp.g != null) {
            canvas.save();
            canvas.clipPath(udp.c);
            canvas.translate((float) udp.d, (float) udp.b);
            udp.a.setColor(interpolate);
            udp.g.draw(canvas);
            canvas.restore();
        }
    }

    public final void a(Rect rect) {
        udp udp = this.b;
        udp.h = new Rect(rect);
        udp.e = (int) (((float) udp.h.width()) * 1.5f);
        udp.a();
    }

    public final boolean a(String str) {
        udp udp = this.b;
        int length = str.length();
        int i = this.a;
        if (length > i) {
            str = str.substring(0, i);
        }
        if (TextUtils.equals(udp.f, str)) {
            return false;
        }
        udp.f = str;
        udp.a();
        return true;
    }

    public final void b() {
        a();
        udp udp = this.b;
        udp.g = null;
        udp.h = null;
        udp.c.reset();
        udp.f = null;
    }
}
