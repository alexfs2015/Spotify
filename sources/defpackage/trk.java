package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: trk reason: default package */
public final class trk implements trj {
    private int a;
    private final trm b;
    private uux c;
    private uux d;
    private int e;
    private int f;

    /* access modifiers changed from: private */
    public static /* synthetic */ int a(float f2) {
        return 872415231;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int b(float f2) {
        return -14145496;
    }

    public trk(TextPaint textPaint, int i, int i2) {
        this(new trm(textPaint, i, i2));
    }

    private trk(trm trm) {
        this.a = Integer.MAX_VALUE;
        this.b = (trm) fay.a(trm);
        a();
    }

    public final void a(Canvas canvas, Paint paint, RectF rectF, float f2, float f3) {
        paint.setColor(this.c.interpolate(f2));
        canvas.drawRoundRect(rectF, f3, f3, paint);
        trm trm = this.b;
        int interpolate = this.d.interpolate(f2);
        if (trm.g != null) {
            canvas.save();
            canvas.clipPath(trm.c);
            canvas.translate((float) trm.d, (float) trm.b);
            trm.a.setColor(interpolate);
            trm.g.draw(canvas);
            canvas.restore();
        }
    }

    public final void a(Rect rect) {
        trm trm = this.b;
        trm.h = new Rect(rect);
        trm.e = (int) (((float) trm.h.width()) * 1.5f);
        trm.a();
    }

    public final void a(int i, int i2) {
        if (this.f != i || this.e != i2) {
            this.f = i;
            this.e = i2;
            this.c = uuy.a(-14145496, i);
            this.d = uuy.a(872415231, i2);
        }
    }

    public final boolean a(String str) {
        trm trm = this.b;
        int length = str.length();
        int i = this.a;
        if (length > i) {
            str = str.substring(0, i);
        }
        if (TextUtils.equals(trm.f, str)) {
            return false;
        }
        trm.f = str;
        trm.a();
        return true;
    }

    public final void a(int i) {
        this.a = 100;
    }

    public final void b() {
        a();
        trm trm = this.b;
        trm.g = null;
        trm.h = null;
        trm.c.reset();
        trm.f = null;
    }

    private void a() {
        this.f = -14145496;
        this.e = 872415231;
        this.c = $$Lambda$trk$1XNAOXUTby4SoJJo4jcA4B9ec.INSTANCE;
        this.d = $$Lambda$trk$oAtcUDwJygs8fPIy0sa6yKqmDJw.INSTANCE;
    }
}
