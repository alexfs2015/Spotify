package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.opengl.GLES30;

/* renamed from: gaj reason: default package */
public final class gaj implements glj {
    private final Context a;
    private final a b;
    private int c;
    private int d;
    private final Rect e = new Rect();
    private final Point f = new Point();
    private final PointF g = new PointF();
    private final Object h = new Object();
    private gag i;
    private gal j;
    private gak k;
    private float l;
    private int m;
    private float n;
    private boolean o;

    /* renamed from: gaj$a */
    public interface a {
        void a(Rect rect);

        boolean a();

        int b();

        int c();

        float d();
    }

    public gaj(Context context, a aVar) {
        this.a = (Context) fbp.a(context);
        this.b = (a) fbp.a(aVar);
    }

    private float d() {
        return ((float) this.m) * this.l;
    }

    public final void a() {
        this.j = new gal(this.a);
        this.j.b.a();
        this.k = new gak(this.a);
        this.k.a.a();
        this.o = this.b.a();
        this.l = 1.0f / this.b.d();
        this.n = d() - (this.o ? 0.0f : 2.0f);
    }

    public final void a(int i2, int i3) {
        synchronized (this.h) {
            this.d = this.b.c();
            this.c = this.b.b();
            this.b.a(this.e);
            this.e.offset(0, this.d);
        }
        this.f.set(i2, i3);
        GLES20.glViewport(0, 0, i2, i3);
        this.i = new gag(i2, i3);
    }

    public final void b() {
        synchronized (this.h) {
            this.d = this.b.c();
            this.c = this.b.b();
        }
        float f2 = this.i.c;
        this.g.set(((float) (this.e.left + this.c)) / f2, this.i.b - ((this.e.exactCenterY() - ((float) this.d)) / f2));
        this.m++;
        boolean a2 = this.b.a();
        if (this.o != a2) {
            this.o = a2;
            this.n = d();
        }
    }

    public final void c() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        float max = Math.max(0.0f, Math.min(1.0f, (d() - this.n) / 2.0f));
        if (!this.o) {
            max = 1.0f - max;
        }
        if (max > 0.0f) {
            float d2 = d();
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            float height = ((0.4f * max) * ((float) this.e.height())) / this.i.c;
            gal gal = this.j;
            gag gag = this.i;
            PointF pointF = this.g;
            gal.b.b();
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, gal.d.a[0]);
            GLES20.glUseProgram(gal.a.a);
            glk glk = gal.a;
            GLES20.glUniformMatrix4fv(glk.a("uProjMat"), 1, false, gag.a, 0);
            gal.a.a("uScale", height, height);
            gal.a.a("uOffset", pointF.x, pointF.y);
            String str = "uTime";
            gal.a.a(str, d2);
            gal.a.a("uDuration", 0.25f);
            GLES20.glUniform1i(gal.a.a("uGradient"), 0);
            gal.c.a(64);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBlendFunc(1, 771);
            gak gak = this.k;
            PointF pointF2 = this.g;
            Point point = this.f;
            GLES20.glUseProgram(gak.b.a);
            gak.b.a(str, d2);
            gak.b.a("uIntensity", max);
            gak.b.a("uResolution", (float) point.x, (float) point.y);
            gak.b.a("uCenter", pointF2.x, pointF2.y);
            gak.a.b();
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisable(3042);
            GLES30.glBindVertexArray(0);
        }
    }
}
