package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import com.airbnb.lottie.model.content.GradientType;

/* renamed from: yg reason: default package */
public final class yg extends xz {
    private final String b;
    private final ds<LinearGradient> c = new ds<>();
    private final ds<RadialGradient> d = new ds<>();
    private final RectF e = new RectF();
    private final GradientType f;
    private final int g;
    private final yr<aah, aah> h;
    private final yr<PointF, PointF> i;
    private final yr<PointF, PointF> j;

    public yg(xq xqVar, aaq aaq, aaj aaj) {
        super(xqVar, aaq, aaj.h.a(), aaj.i.a(), aaj.j, aaj.d, aaj.g, aaj.k, aaj.l);
        this.b = aaj.a;
        this.f = aaj.b;
        this.g = (int) (xqVar.a.a() / 32.0f);
        this.h = aaj.c.a();
        this.h.a((a) this);
        aaq.a(this.h);
        this.i = aaj.e.a();
        this.i.a((a) this);
        aaq.a(this.i);
        this.j = aaj.f.a();
        this.j.a((a) this);
        aaq.a(this.j);
    }

    private int c() {
        int round = Math.round(this.i.c * ((float) this.g));
        int round2 = Math.round(this.j.c * ((float) this.g));
        int round3 = Math.round(this.h.c * ((float) this.g));
        int i2 = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i2 = i2 * 31 * round2;
        }
        return round3 != 0 ? i2 * 31 * round3 : i2;
    }

    public final void a(Canvas canvas, Matrix matrix, int i2) {
        a(this.e, matrix);
        if (this.f == GradientType.Linear) {
            Paint paint = this.a;
            long c2 = (long) c();
            LinearGradient linearGradient = (LinearGradient) this.c.a(c2, null);
            if (linearGradient == null) {
                PointF pointF = (PointF) this.i.d();
                PointF pointF2 = (PointF) this.j.d();
                aah aah = (aah) this.h.d();
                LinearGradient linearGradient2 = new LinearGradient((float) ((int) (this.e.left + (this.e.width() / 2.0f) + pointF.x)), (float) ((int) (this.e.top + (this.e.height() / 2.0f) + pointF.y)), (float) ((int) (this.e.left + (this.e.width() / 2.0f) + pointF2.x)), (float) ((int) (this.e.top + (this.e.height() / 2.0f) + pointF2.y)), aah.b, aah.a, TileMode.CLAMP);
                this.c.b(c2, linearGradient2);
                linearGradient = linearGradient2;
            }
            paint.setShader(linearGradient);
        } else {
            Paint paint2 = this.a;
            long c3 = (long) c();
            RadialGradient radialGradient = (RadialGradient) this.d.a(c3, null);
            if (radialGradient == null) {
                PointF pointF3 = (PointF) this.i.d();
                PointF pointF4 = (PointF) this.j.d();
                aah aah2 = (aah) this.h.d();
                int[] iArr = aah2.b;
                float[] fArr = aah2.a;
                int width = (int) (this.e.left + (this.e.width() / 2.0f) + pointF3.x);
                int height = (int) (this.e.top + (this.e.height() / 2.0f) + pointF3.y);
                float f2 = (float) width;
                float f3 = (float) height;
                RadialGradient radialGradient2 = new RadialGradient(f2, f3, (float) Math.hypot((double) (((int) ((this.e.left + (this.e.width() / 2.0f)) + pointF4.x)) - width), (double) (((int) ((this.e.top + (this.e.height() / 2.0f)) + pointF4.y)) - height)), iArr, fArr, TileMode.CLAMP);
                this.d.b(c3, radialGradient2);
                radialGradient = radialGradient2;
            }
            paint2.setShader(radialGradient);
        }
        super.a(canvas, matrix, i2);
    }

    public final String b() {
        return this.b;
    }
}
