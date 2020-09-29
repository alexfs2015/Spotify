package defpackage;

import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: jf reason: default package */
public abstract class jf implements OnTouchListener {
    private static final int q = ViewConfiguration.getTapTimeout();
    final a a = new a();
    final View b;
    boolean c;
    boolean d;
    boolean e;
    private final Interpolator f = new AccelerateInterpolator();
    private Runnable g;
    private float[] h = {0.0f, 0.0f};
    private float[] i = {Float.MAX_VALUE, Float.MAX_VALUE};
    private int j;
    private int k;
    private float[] l = {0.0f, 0.0f};
    private float[] m = {0.0f, 0.0f};
    private float[] n = {Float.MAX_VALUE, Float.MAX_VALUE};
    private boolean o;
    private boolean p;

    /* renamed from: jf$a */
    static class a {
        int a;
        int b;
        float c;
        float d;
        long e = Long.MIN_VALUE;
        long f = 0;
        int g = 0;
        int h = 0;
        long i = -1;
        float j;
        int k;

        a() {
        }

        /* access modifiers changed from: 0000 */
        public float a(long j2) {
            if (j2 < this.e) {
                return 0.0f;
            }
            long j3 = this.i;
            if (j3 < 0 || j2 < j3) {
                return jf.a(((float) (j2 - this.e)) / ((float) this.a), 0.0f, 1.0f) * 0.5f;
            }
            long j4 = j2 - j3;
            float f2 = this.j;
            return (1.0f - f2) + (f2 * jf.a(((float) j4) / ((float) this.k), 0.0f, 1.0f));
        }

        public final void a() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.k = jf.a((int) (currentAnimationTimeMillis - this.e), 0, this.b);
            this.j = a(currentAnimationTimeMillis);
            this.i = currentAnimationTimeMillis;
        }

        public final int b() {
            float f2 = this.c;
            return (int) (f2 / Math.abs(f2));
        }

        public final int c() {
            float f2 = this.d;
            return (int) (f2 / Math.abs(f2));
        }
    }

    /* renamed from: jf$b */
    class b implements Runnable {
        b() {
        }

        public final void run() {
            if (jf.this.e) {
                if (jf.this.c) {
                    jf jfVar = jf.this;
                    jfVar.c = false;
                    a aVar = jfVar.a;
                    aVar.e = AnimationUtils.currentAnimationTimeMillis();
                    aVar.i = -1;
                    aVar.f = aVar.e;
                    aVar.j = 0.5f;
                    aVar.g = 0;
                    aVar.h = 0;
                }
                a aVar2 = jf.this.a;
                if ((aVar2.i > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.i + ((long) aVar2.k)) || !jf.this.a()) {
                    jf.this.e = false;
                    return;
                }
                if (jf.this.d) {
                    jf jfVar2 = jf.this;
                    jfVar2.d = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    jfVar2.b.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (aVar2.f != 0) {
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar2.a(currentAnimationTimeMillis);
                    float f = (-4.0f * a2 * a2) + (a2 * 4.0f);
                    long j = currentAnimationTimeMillis - aVar2.f;
                    aVar2.f = currentAnimationTimeMillis;
                    float f2 = ((float) j) * f;
                    aVar2.g = (int) (aVar2.c * f2);
                    aVar2.h = (int) (f2 * aVar2.d);
                    jf.this.a(aVar2.h);
                    ip.a(jf.this.b, (Runnable) this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }
    }

    public jf(View view) {
        this.b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i2 = (int) ((displayMetrics.density * 1575.0f) + 0.5f);
        int i3 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        float f2 = (float) i2;
        float[] fArr = this.n;
        float f3 = f2 / 1000.0f;
        fArr[0] = f3;
        fArr[1] = f3;
        float f4 = (float) i3;
        float[] fArr2 = this.m;
        float f5 = f4 / 1000.0f;
        fArr2[0] = f5;
        fArr2[1] = f5;
        this.j = 1;
        float[] fArr3 = this.i;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.h;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.l;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.k = q;
        a aVar = this.a;
        aVar.a = 500;
        aVar.b = 500;
    }

    private float a(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.j;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                return f2 >= 0.0f ? 1.0f - (f2 / f3) : (!this.e || this.j != 1) ? 0.0f : 1.0f;
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
    }

    static float a(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    private float a(float f2, float f3, float f4, float f5) {
        float f6;
        float a2 = a(f2 * f3, 0.0f, f4);
        float a3 = a(f3 - f5, a2) - a(f5, a2);
        if (a3 < 0.0f) {
            f6 = -this.f.getInterpolation(-a3);
        } else if (a3 <= 0.0f) {
            return 0.0f;
        } else {
            f6 = this.f.getInterpolation(a3);
        }
        return a(f6, -1.0f, 1.0f);
    }

    private float a(int i2, float f2, float f3, float f4) {
        float a2 = a(this.h[i2], f3, this.i[i2], f2);
        if (a2 == 0.0f) {
            return 0.0f;
        }
        float f5 = this.l[i2];
        float f6 = this.m[i2];
        float f7 = this.n[i2];
        float f8 = f5 * f4;
        return a2 > 0.0f ? a(a2 * f8, f6, f7) : -a((-a2) * f8, f6, f7);
    }

    static int a(int i2, int i3, int i4) {
        if (i2 > i4) {
            return i4;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        return i2;
    }

    private void b() {
        if (this.c) {
            this.e = false;
        } else {
            this.a.a();
        }
    }

    public final jf a(boolean z) {
        if (this.p && !z) {
            b();
        }
        this.p = z;
        return this;
    }

    public abstract void a(int i2);

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        a aVar = this.a;
        int c2 = aVar.c();
        int b2 = aVar.b();
        return c2 != 0 && b(c2);
    }

    public abstract boolean b(int i2);

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.p
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x007d
        L_0x0016:
            r5.b()
            goto L_0x007d
        L_0x001a:
            r5.d = r2
            r5.o = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.b
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.b
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.a(r2, r7, r6, r3)
            jf$a r7 = r5.a
            r7.c = r0
            r7.d = r6
            boolean r6 = r5.e
            if (r6 != 0) goto L_0x007d
            boolean r6 = r5.a()
            if (r6 == 0) goto L_0x007d
            java.lang.Runnable r6 = r5.g
            if (r6 != 0) goto L_0x0061
            jf$b r6 = new jf$b
            r6.<init>()
            r5.g = r6
        L_0x0061:
            r5.e = r2
            r5.c = r2
            boolean r6 = r5.o
            if (r6 != 0) goto L_0x0076
            int r6 = r5.k
            if (r6 <= 0) goto L_0x0076
            android.view.View r7 = r5.b
            java.lang.Runnable r0 = r5.g
            long r3 = (long) r6
            defpackage.ip.a(r7, r0, r3)
            goto L_0x007b
        L_0x0076:
            java.lang.Runnable r6 = r5.g
            r6.run()
        L_0x007b:
            r5.o = r2
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
