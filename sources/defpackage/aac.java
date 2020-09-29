package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build.VERSION;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.Mask.MaskMode;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.Layer.LayerType;
import com.airbnb.lottie.model.layer.Layer.MatteType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aac reason: default package */
public abstract class aac implements xo, a, za {
    final Matrix a;
    final xc b;
    final Layer c;
    aac d;
    aac e;
    final yr f;
    private final Path g = new Path();
    private final Matrix h = new Matrix();
    private final Paint i;
    private final Paint j;
    private final Paint k;
    private final Paint l;
    private final Paint m;
    private final RectF n;
    private final RectF o;
    private final RectF p;
    private final RectF q;
    private final String r;
    private yj s;
    private List<aac> t;
    private final List<yd<?, ?>> u;
    private boolean v;

    /* renamed from: aac$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[LayerType.values().length];
        static final /* synthetic */ int[] b = new int[MaskMode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0072 */
        static {
            /*
                com.airbnb.lottie.model.content.Mask$MaskMode[] r0 = com.airbnb.lottie.model.content.Mask.MaskMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r0 = 1
                int[] r1 = b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.airbnb.lottie.model.content.Mask$MaskMode r2 = com.airbnb.lottie.model.content.Mask.MaskMode.MaskModeSubtract     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.airbnb.lottie.model.content.Mask$MaskMode r3 = com.airbnb.lottie.model.content.Mask.MaskMode.MaskModeIntersect     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x002a }
                com.airbnb.lottie.model.content.Mask$MaskMode r4 = com.airbnb.lottie.model.content.Mask.MaskMode.MaskModeAdd     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.airbnb.lottie.model.layer.Layer$LayerType[] r3 = com.airbnb.lottie.model.layer.Layer.LayerType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                a = r3
                int[] r3 = a     // Catch:{ NoSuchFieldError -> 0x003d }
                com.airbnb.lottie.model.layer.Layer$LayerType r4 = com.airbnb.lottie.model.layer.Layer.LayerType.Shape     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0047 }
                com.airbnb.lottie.model.layer.Layer$LayerType r3 = com.airbnb.lottie.model.layer.Layer.LayerType.PreComp     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0051 }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.Solid     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0051:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x005c }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.Image     // Catch:{ NoSuchFieldError -> 0x005c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0067 }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.Null     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0072 }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.Text     // Catch:{ NoSuchFieldError -> 0x0072 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0072 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0072 }
            L_0x0072:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x007d }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.Unknown     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aac.AnonymousClass2.<clinit>():void");
        }
    }

    public final void a(List<xm> list, List<xm> list2) {
    }

    /* access modifiers changed from: 0000 */
    public abstract void b(Canvas canvas, Matrix matrix, int i2);

    /* access modifiers changed from: 0000 */
    public void b(yz yzVar, int i2, List<yz> list, yz yzVar2) {
    }

    aac(xc xcVar, Layer layer) {
        boolean z = true;
        this.i = new Paint(1);
        this.j = new Paint(1);
        this.k = new Paint(1);
        this.l = new Paint(1);
        this.m = new Paint();
        this.n = new RectF();
        this.o = new RectF();
        this.p = new RectF();
        this.q = new RectF();
        this.a = new Matrix();
        this.u = new ArrayList();
        this.v = true;
        this.b = xcVar;
        this.c = layer;
        StringBuilder sb = new StringBuilder();
        sb.append(layer.c);
        sb.append("#draw");
        this.r = sb.toString();
        this.m.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        this.j.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        this.k.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        if (layer.u == MatteType.Invert) {
            this.l.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        } else {
            this.l.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        }
        this.f = layer.i.a();
        this.f.a((a) this);
        if (layer.h != null && !layer.h.isEmpty()) {
            this.s = new yj(layer.h);
            for (yd a2 : this.s.a) {
                a2.a((a) this);
            }
            for (yd ydVar : this.s.b) {
                a(ydVar);
                ydVar.a((a) this);
            }
        }
        if (!this.c.t.isEmpty()) {
            final yf yfVar = new yf(this.c.t);
            yfVar.b = true;
            yfVar.a((a) new a() {
                public final void a() {
                    aac.this.a(((Float) yfVar.d()).floatValue() == 1.0f);
                }
            });
            if (((Float) yfVar.d()).floatValue() != 1.0f) {
                z = false;
            }
            a(z);
            a((yd<?, ?>) yfVar);
            return;
        }
        a(true);
    }

    private boolean c() {
        return this.d != null;
    }

    private static void a(Canvas canvas, RectF rectF, Paint paint, boolean z) {
        if (VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, z ? 31 : 19);
        } else {
            canvas.saveLayer(rectF, paint);
        }
    }

    public final void a(yd<?, ?> ydVar) {
        this.u.add(ydVar);
    }

    public void a(RectF rectF, Matrix matrix) {
        this.a.set(matrix);
        this.a.preConcat(this.f.a());
    }

    public final void a(Canvas canvas, Matrix matrix, int i2) {
        wz.c(this.r);
        if (!this.v) {
            wz.d(this.r);
            return;
        }
        if (this.t == null) {
            if (this.e == null) {
                this.t = Collections.emptyList();
            } else {
                this.t = new ArrayList();
                for (aac aac = this.e; aac != null; aac = aac.e) {
                    this.t.add(aac);
                }
            }
        }
        String str = "Layer#parentMatrix";
        wz.c(str);
        this.h.reset();
        this.h.set(matrix);
        for (int size = this.t.size() - 1; size >= 0; size--) {
            this.h.preConcat(((aac) this.t.get(size)).f.a());
        }
        wz.d(str);
        int intValue = (int) ((((((float) i2) / 255.0f) * ((float) ((Integer) this.f.e.d()).intValue())) / 100.0f) * 255.0f);
        String str2 = "Layer#drawLayer";
        if (c() || d()) {
            String str3 = "Layer#computeBounds";
            wz.c(str3);
            this.n.set(0.0f, 0.0f, 0.0f, 0.0f);
            a(this.n, this.h);
            RectF rectF = this.n;
            Matrix matrix2 = this.h;
            if (c() && this.c.u != MatteType.Invert) {
                this.d.a(this.p, matrix2);
                rectF.set(Math.max(rectF.left, this.p.left), Math.max(rectF.top, this.p.top), Math.min(rectF.right, this.p.right), Math.min(rectF.bottom, this.p.bottom));
            }
            this.h.preConcat(this.f.a());
            b(this.n, this.h);
            this.n.set(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
            wz.d(str3);
            String str4 = "Layer#saveLayer";
            wz.c(str4);
            a(canvas, this.n, this.i, true);
            wz.d(str4);
            a(canvas);
            wz.c(str2);
            b(canvas, this.h, intValue);
            wz.d(str2);
            if (d()) {
                Matrix matrix3 = this.h;
                a(canvas, matrix3, MaskMode.MaskModeAdd);
                a(canvas, matrix3, MaskMode.MaskModeIntersect);
                a(canvas, matrix3, MaskMode.MaskModeSubtract);
            }
            String str5 = "Layer#restoreLayer";
            if (c()) {
                String str6 = "Layer#drawMatte";
                wz.c(str6);
                wz.c(str4);
                a(canvas, this.n, this.l, false);
                wz.d(str4);
                a(canvas);
                this.d.a(canvas, matrix, intValue);
                wz.c(str5);
                canvas.restore();
                wz.d(str5);
                wz.d(str6);
            }
            wz.c(str5);
            canvas.restore();
            wz.d(str5);
            b(wz.d(this.r));
            return;
        }
        this.h.preConcat(this.f.a());
        wz.c(str2);
        b(canvas, this.h, intValue);
        wz.d(str2);
        b(wz.d(this.r));
    }

    private void b(float f2) {
        this.b.a.a.a(this.c.c, f2);
    }

    private void a(Canvas canvas) {
        String str = "Layer#clearLayer";
        wz.c(str);
        canvas.drawRect(this.n.left - 1.0f, this.n.top - 1.0f, this.n.right + 1.0f, this.n.bottom + 1.0f, this.m);
        wz.d(str);
    }

    private void b(RectF rectF, Matrix matrix) {
        this.o.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (d()) {
            int size = this.s.c.size();
            int i2 = 0;
            while (i2 < size) {
                Mask mask = (Mask) this.s.c.get(i2);
                this.g.set((Path) ((yd) this.s.a.get(i2)).d());
                this.g.transform(matrix);
                int i3 = AnonymousClass2.b[mask.a.ordinal()];
                if (i3 != 1 && i3 != 2) {
                    this.g.computeBounds(this.q, false);
                    if (i2 == 0) {
                        this.o.set(this.q);
                    } else {
                        RectF rectF2 = this.o;
                        rectF2.set(Math.min(rectF2.left, this.q.left), Math.min(this.o.top, this.q.top), Math.max(this.o.right, this.q.right), Math.max(this.o.bottom, this.q.bottom));
                    }
                    i2++;
                } else {
                    return;
                }
            }
            rectF.set(Math.max(rectF.left, this.o.left), Math.max(rectF.top, this.o.top), Math.min(rectF.right, this.o.right), Math.min(rectF.bottom, this.o.bottom));
        }
    }

    private void a(Canvas canvas, Matrix matrix, MaskMode maskMode) {
        Paint paint;
        boolean z = true;
        if (AnonymousClass2.b[maskMode.ordinal()] != 1) {
            paint = this.j;
        } else {
            paint = this.k;
        }
        int size = this.s.c.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            } else if (((Mask) this.s.c.get(i2)).a == maskMode) {
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            String str = "Layer#drawMask";
            wz.c(str);
            String str2 = "Layer#saveLayer";
            wz.c(str2);
            a(canvas, this.n, paint, false);
            wz.d(str2);
            a(canvas);
            for (int i3 = 0; i3 < size; i3++) {
                if (((Mask) this.s.c.get(i3)).a == maskMode) {
                    this.g.set((Path) ((yd) this.s.a.get(i3)).d());
                    this.g.transform(matrix);
                    yd ydVar = (yd) this.s.b.get(i3);
                    int alpha = this.i.getAlpha();
                    this.i.setAlpha((int) (((float) ((Integer) ydVar.d()).intValue()) * 2.55f));
                    canvas.drawPath(this.g, this.i);
                    this.i.setAlpha(alpha);
                }
            }
            String str3 = "Layer#restoreLayer";
            wz.c(str3);
            canvas.restore();
            wz.d(str3);
            wz.d(str);
        }
    }

    private boolean d() {
        yj yjVar = this.s;
        return yjVar != null && !yjVar.a.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        if (z != this.v) {
            this.v = z;
            this.b.invalidateSelf();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(float f2) {
        yr yrVar = this.f;
        yrVar.a.a(f2);
        yrVar.b.a(f2);
        yrVar.c.a(f2);
        yrVar.d.a(f2);
        yrVar.e.a(f2);
        if (yrVar.f != null) {
            yrVar.f.a(f2);
        }
        if (yrVar.g != null) {
            yrVar.g.a(f2);
        }
        if (this.s != null) {
            for (int i2 = 0; i2 < this.s.a.size(); i2++) {
                ((yd) this.s.a.get(i2)).a(f2);
            }
        }
        if (this.c.m != 0.0f) {
            f2 /= this.c.m;
        }
        aac aac = this.d;
        if (aac != null) {
            this.d.a(aac.c.m * f2);
        }
        for (int i3 = 0; i3 < this.u.size(); i3++) {
            ((yd) this.u.get(i3)).a(f2);
        }
    }

    public final String b() {
        return this.c.c;
    }

    public final void a(yz yzVar, int i2, List<yz> list, yz yzVar2) {
        if (yzVar.a(b(), i2)) {
            if (!"__container".equals(b())) {
                yzVar2 = yzVar2.a(b());
                if (yzVar.c(b(), i2)) {
                    list.add(yzVar2.a((za) this));
                }
            }
            if (yzVar.d(b(), i2)) {
                b(yzVar, i2 + yzVar.b(b(), i2), list, yzVar2);
            }
        }
    }

    public <T> void a(T t2, abz<T> abz) {
        this.f.a(t2, abz);
    }

    public final void a() {
        this.b.invalidateSelf();
    }
}
