package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: ezo reason: default package */
public final class ezo extends Drawable implements Callback, gn {
    private static final int[] w = {16842910};
    private ColorStateList A;
    private float B;
    private CharSequence C;
    private final defpackage.gb.a D = new defpackage.gb.a() {
        public final void a(int i) {
        }

        public final void a(Typeface typeface) {
            ezo.this.af = true;
            ezo.this.a();
            ezo.this.invalidateSelf();
        }
    };
    private Drawable E;
    private ColorStateList F;
    private ColorStateList G;
    private ezb H;
    private ezb I;
    private final Context J;
    private final TextPaint K = new TextPaint(1);
    private final Paint L = new Paint(1);
    private final Paint M;
    private final FontMetrics N = new FontMetrics();
    private final RectF O = new RectF();
    private final PointF P = new PointF();
    private int Q;
    private int R;
    private int S;
    private int T;
    private boolean U;
    private int V;
    private int W = 255;
    private ColorFilter X;
    private PorterDuffColorFilter Y;
    private ColorStateList Z;
    public ColorStateList a;
    private Mode aa = Mode.SRC_IN;
    private int[] ab;
    private boolean ac;
    private ColorStateList ad;
    private WeakReference<a> ae = new WeakReference<>(null);
    /* access modifiers changed from: private */
    public boolean af = true;
    private float ag;
    public CharSequence b;
    public fan c;
    public boolean d;
    public float e;
    public boolean f;
    public Drawable g;
    public float h;
    public boolean i;
    public boolean j;
    public Drawable k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public TruncateAt t;
    public boolean u;
    public int v;
    private ColorStateList x;
    private float y;
    private float z;

    /* renamed from: ezo$a */
    public interface a {
        void c();
    }

    private ezo(Context context) {
        this.J = context;
        this.b = "";
        this.K.density = context.getResources().getDisplayMetrics().density;
        this.M = null;
        setState(w);
        a(w);
        this.u = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0217  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ezo a(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10) {
        /*
            ezo r0 = new ezo
            r0.<init>(r7)
            android.content.Context r1 = r0.J
            int[] r3 = defpackage.eyt.a.H
            r7 = 0
            int[] r6 = new int[r7]
            r2 = r8
            r4 = r9
            r5 = r10
            android.content.res.TypedArray r9 = defpackage.faj.a(r1, r2, r3, r4, r5, r6)
            android.content.Context r10 = r0.J
            int r1 = defpackage.eyt.a.Q
            android.content.res.ColorStateList r10 = defpackage.fam.a(r10, r9, r1)
            android.content.res.ColorStateList r1 = r0.x
            if (r1 == r10) goto L_0x0028
            r0.x = r10
            int[] r10 = r0.getState()
            r0.onStateChange(r10)
        L_0x0028:
            int r10 = defpackage.eyt.a.Y
            r1 = 0
            float r10 = r9.getDimension(r10, r1)
            float r2 = r0.y
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x003d
            r0.y = r10
            r0.invalidateSelf()
            r0.a()
        L_0x003d:
            int r10 = defpackage.eyt.a.R
            float r10 = r9.getDimension(r10, r1)
            float r2 = r0.z
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x004e
            r0.z = r10
            r0.invalidateSelf()
        L_0x004e:
            android.content.Context r10 = r0.J
            int r2 = defpackage.eyt.a.aa
            android.content.res.ColorStateList r10 = defpackage.fam.a(r10, r9, r2)
            android.content.res.ColorStateList r2 = r0.A
            if (r2 == r10) goto L_0x0063
            r0.A = r10
            int[] r10 = r0.getState()
            r0.onStateChange(r10)
        L_0x0063:
            int r10 = defpackage.eyt.a.ab
            float r10 = r9.getDimension(r10, r1)
            float r2 = r0.B
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
            r0.B = r10
            android.graphics.Paint r2 = r0.L
            r2.setStrokeWidth(r10)
            r0.invalidateSelf()
        L_0x0079:
            android.content.Context r10 = r0.J
            int r2 = defpackage.eyt.a.am
            android.content.res.ColorStateList r10 = defpackage.fam.a(r10, r9, r2)
            android.content.res.ColorStateList r2 = r0.a
            if (r2 == r10) goto L_0x0091
            r0.a = r10
            r0.k()
            int[] r10 = r0.getState()
            r0.onStateChange(r10)
        L_0x0091:
            int r10 = defpackage.eyt.a.L
            java.lang.CharSequence r10 = r9.getText(r10)
            r0.a(r10)
            android.content.Context r10 = r0.J
            int r2 = defpackage.eyt.a.I
            boolean r3 = r9.hasValue(r2)
            r4 = 0
            if (r3 == 0) goto L_0x00b1
            int r2 = r9.getResourceId(r2, r7)
            if (r2 == 0) goto L_0x00b1
            fan r3 = new fan
            r3.<init>(r10, r2)
            goto L_0x00b2
        L_0x00b1:
            r3 = r4
        L_0x00b2:
            r0.a(r3)
            int r10 = defpackage.eyt.a.J
            int r10 = r9.getInt(r10, r7)
            r2 = 1
            if (r10 == r2) goto L_0x00cf
            r2 = 2
            if (r10 == r2) goto L_0x00ca
            r2 = 3
            if (r10 == r2) goto L_0x00c5
            goto L_0x00d3
        L_0x00c5:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.END
            r0.t = r10
            goto L_0x00d3
        L_0x00ca:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.MIDDLE
            r0.t = r10
            goto L_0x00d3
        L_0x00cf:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.START
            r0.t = r10
        L_0x00d3:
            int r10 = defpackage.eyt.a.X
            boolean r10 = r9.getBoolean(r10, r7)
            r0.b(r10)
            java.lang.String r10 = "http://schemas.android.com/apk/res-auto"
            if (r8 == 0) goto L_0x00f9
            java.lang.String r2 = "chipIconEnabled"
            java.lang.String r2 = r8.getAttributeValue(r10, r2)
            if (r2 == 0) goto L_0x00f9
            java.lang.String r2 = "chipIconVisible"
            java.lang.String r2 = r8.getAttributeValue(r10, r2)
            if (r2 != 0) goto L_0x00f9
            int r2 = defpackage.eyt.a.U
            boolean r2 = r9.getBoolean(r2, r7)
            r0.b(r2)
        L_0x00f9:
            android.content.Context r2 = r0.J
            int r3 = defpackage.eyt.a.T
            android.graphics.drawable.Drawable r2 = defpackage.fam.b(r2, r9, r3)
            android.graphics.drawable.Drawable r3 = r0.c()
            if (r3 == r2) goto L_0x0135
            float r5 = r0.b()
            if (r2 == 0) goto L_0x0116
            android.graphics.drawable.Drawable r2 = defpackage.gm.f(r2)
            android.graphics.drawable.Drawable r2 = r2.mutate()
            goto L_0x0117
        L_0x0116:
            r2 = r4
        L_0x0117:
            r0.E = r2
            float r2 = r0.b()
            b(r3)
            boolean r3 = r0.e()
            if (r3 == 0) goto L_0x012b
            android.graphics.drawable.Drawable r3 = r0.E
            r0.c(r3)
        L_0x012b:
            r0.invalidateSelf()
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0135
            r0.a()
        L_0x0135:
            android.content.Context r2 = r0.J
            int r3 = defpackage.eyt.a.W
            android.content.res.ColorStateList r2 = defpackage.fam.a(r2, r9, r3)
            android.content.res.ColorStateList r3 = r0.F
            if (r3 == r2) goto L_0x0155
            r0.F = r2
            boolean r3 = r0.e()
            if (r3 == 0) goto L_0x014e
            android.graphics.drawable.Drawable r3 = r0.E
            defpackage.gm.a(r3, r2)
        L_0x014e:
            int[] r2 = r0.getState()
            r0.onStateChange(r2)
        L_0x0155:
            int r2 = defpackage.eyt.a.V
            float r2 = r9.getDimension(r2, r1)
            float r3 = r0.e
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x0175
            float r3 = r0.b()
            r0.e = r2
            float r2 = r0.b()
            r0.invalidateSelf()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0175
            r0.a()
        L_0x0175:
            int r2 = defpackage.eyt.a.ai
            boolean r2 = r9.getBoolean(r2, r7)
            r0.c(r2)
            if (r8 == 0) goto L_0x0199
            java.lang.String r2 = "closeIconEnabled"
            java.lang.String r2 = r8.getAttributeValue(r10, r2)
            if (r2 == 0) goto L_0x0199
            java.lang.String r2 = "closeIconVisible"
            java.lang.String r2 = r8.getAttributeValue(r10, r2)
            if (r2 != 0) goto L_0x0199
            int r2 = defpackage.eyt.a.ad
            boolean r2 = r9.getBoolean(r2, r7)
            r0.c(r2)
        L_0x0199:
            android.content.Context r2 = r0.J
            int r3 = defpackage.eyt.a.ac
            android.graphics.drawable.Drawable r2 = defpackage.fam.b(r2, r9, r3)
            android.graphics.drawable.Drawable r3 = r0.d()
            if (r3 == r2) goto L_0x01d3
            float r5 = r0.i()
            if (r2 == 0) goto L_0x01b5
            android.graphics.drawable.Drawable r2 = defpackage.gm.f(r2)
            android.graphics.drawable.Drawable r4 = r2.mutate()
        L_0x01b5:
            r0.g = r4
            float r2 = r0.i()
            b(r3)
            boolean r3 = r0.g()
            if (r3 == 0) goto L_0x01c9
            android.graphics.drawable.Drawable r3 = r0.g
            r0.c(r3)
        L_0x01c9:
            r0.invalidateSelf()
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x01d3
            r0.a()
        L_0x01d3:
            android.content.Context r2 = r0.J
            int r3 = defpackage.eyt.a.ah
            android.content.res.ColorStateList r2 = defpackage.fam.a(r2, r9, r3)
            android.content.res.ColorStateList r3 = r0.G
            if (r3 == r2) goto L_0x01f3
            r0.G = r2
            boolean r3 = r0.g()
            if (r3 == 0) goto L_0x01ec
            android.graphics.drawable.Drawable r3 = r0.g
            defpackage.gm.a(r3, r2)
        L_0x01ec:
            int[] r2 = r0.getState()
            r0.onStateChange(r2)
        L_0x01f3:
            int r2 = defpackage.eyt.a.af
            float r2 = r9.getDimension(r2, r1)
            float r3 = r0.h
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x020d
            r0.h = r2
            r0.invalidateSelf()
            boolean r2 = r0.g()
            if (r2 == 0) goto L_0x020d
            r0.a()
        L_0x020d:
            int r2 = defpackage.eyt.a.M
            boolean r2 = r9.getBoolean(r2, r7)
            boolean r3 = r0.i
            if (r3 == r2) goto L_0x0233
            r0.i = r2
            float r3 = r0.b()
            if (r2 != 0) goto L_0x0225
            boolean r2 = r0.U
            if (r2 == 0) goto L_0x0225
            r0.U = r7
        L_0x0225:
            float r2 = r0.b()
            r0.invalidateSelf()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0233
            r0.a()
        L_0x0233:
            int r2 = defpackage.eyt.a.P
            boolean r2 = r9.getBoolean(r2, r7)
            r0.d(r2)
            if (r8 == 0) goto L_0x0257
            java.lang.String r2 = "checkedIconEnabled"
            java.lang.String r2 = r8.getAttributeValue(r10, r2)
            if (r2 == 0) goto L_0x0257
            java.lang.String r2 = "checkedIconVisible"
            java.lang.String r8 = r8.getAttributeValue(r10, r2)
            if (r8 != 0) goto L_0x0257
            int r8 = defpackage.eyt.a.O
            boolean r7 = r9.getBoolean(r8, r7)
            r0.d(r7)
        L_0x0257:
            android.content.Context r7 = r0.J
            int r8 = defpackage.eyt.a.N
            android.graphics.drawable.Drawable r7 = defpackage.fam.b(r7, r9, r8)
            android.graphics.drawable.Drawable r8 = r0.k
            if (r8 == r7) goto L_0x0281
            float r8 = r0.b()
            r0.k = r7
            float r7 = r0.b()
            android.graphics.drawable.Drawable r10 = r0.k
            b(r10)
            android.graphics.drawable.Drawable r10 = r0.k
            r0.c(r10)
            r0.invalidateSelf()
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0281
            r0.a()
        L_0x0281:
            android.content.Context r7 = r0.J
            int r8 = defpackage.eyt.a.an
            ezb r7 = defpackage.ezb.a(r7, r9, r8)
            r0.H = r7
            android.content.Context r7 = r0.J
            int r8 = defpackage.eyt.a.aj
            ezb r7 = defpackage.ezb.a(r7, r9, r8)
            r0.I = r7
            int r7 = defpackage.eyt.a.Z
            float r7 = r9.getDimension(r7, r1)
            float r8 = r0.l
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x02a9
            r0.l = r7
            r0.invalidateSelf()
            r0.a()
        L_0x02a9:
            int r7 = defpackage.eyt.a.al
            float r7 = r9.getDimension(r7, r1)
            float r8 = r0.m
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x02c9
            float r8 = r0.b()
            r0.m = r7
            float r7 = r0.b()
            r0.invalidateSelf()
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x02c9
            r0.a()
        L_0x02c9:
            int r7 = defpackage.eyt.a.ak
            float r7 = r9.getDimension(r7, r1)
            float r8 = r0.n
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x02e9
            float r8 = r0.b()
            r0.n = r7
            float r7 = r0.b()
            r0.invalidateSelf()
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x02e9
            r0.a()
        L_0x02e9:
            int r7 = defpackage.eyt.a.ap
            float r7 = r9.getDimension(r7, r1)
            float r8 = r0.o
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x02fd
            r0.o = r7
            r0.invalidateSelf()
            r0.a()
        L_0x02fd:
            int r7 = defpackage.eyt.a.ao
            float r7 = r9.getDimension(r7, r1)
            float r8 = r0.p
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x0311
            r0.p = r7
            r0.invalidateSelf()
            r0.a()
        L_0x0311:
            int r7 = defpackage.eyt.a.ag
            float r7 = r9.getDimension(r7, r1)
            float r8 = r0.q
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x032b
            r0.q = r7
            r0.invalidateSelf()
            boolean r7 = r0.g()
            if (r7 == 0) goto L_0x032b
            r0.a()
        L_0x032b:
            int r7 = defpackage.eyt.a.ae
            float r7 = r9.getDimension(r7, r1)
            float r8 = r0.r
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x0345
            r0.r = r7
            r0.invalidateSelf()
            boolean r7 = r0.g()
            if (r7 == 0) goto L_0x0345
            r0.a()
        L_0x0345:
            int r7 = defpackage.eyt.a.S
            float r7 = r9.getDimension(r7, r1)
            float r8 = r0.s
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x0359
            r0.s = r7
            r0.invalidateSelf()
            r0.a()
        L_0x0359:
            int r7 = defpackage.eyt.a.K
            r8 = 2147483647(0x7fffffff, float:NaN)
            int r7 = r9.getDimensionPixelSize(r7, r8)
            r0.v = r7
            r9.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezo.a(android.content.Context, android.util.AttributeSet, int, int):ezo");
    }

    private void a(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (e() || f()) {
            float f2 = this.l + this.m;
            if (gm.h(this) == 0) {
                rectF.left = ((float) rect.left) + f2;
                rectF.right = rectF.left + this.e;
            } else {
                rectF.right = ((float) rect.right) - f2;
                rectF.left = rectF.right - this.e;
            }
            rectF.top = rect.exactCenterY() - (this.e / 2.0f);
            rectF.bottom = rectF.top + this.e;
        }
    }

    private void a(fan fan) {
        if (this.c != fan) {
            this.c = fan;
            if (fan != null) {
                fan.b(this.J, this.K, this.D);
                this.af = true;
            }
            onStateChange(getState());
            a();
        }
    }

    private static boolean a(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean a(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean a(int[] iArr, int i2) {
        if (iArr == null) {
            return false;
        }
        for (int i3 : iArr) {
            if (i3 == 16842912) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(int[] r6, int[] r7) {
        /*
            r5 = this;
            boolean r0 = super.onStateChange(r6)
            android.content.res.ColorStateList r1 = r5.x
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r5.Q
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r3 = r5.Q
            r4 = 1
            if (r3 == r1) goto L_0x0019
            r5.Q = r1
            r0 = 1
        L_0x0019:
            android.content.res.ColorStateList r1 = r5.A
            if (r1 == 0) goto L_0x0024
            int r3 = r5.R
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            int r3 = r5.R
            if (r3 == r1) goto L_0x002c
            r5.R = r1
            r0 = 1
        L_0x002c:
            android.content.res.ColorStateList r1 = r5.ad
            if (r1 == 0) goto L_0x0037
            int r3 = r5.S
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            int r3 = r5.S
            if (r3 == r1) goto L_0x0043
            r5.S = r1
            boolean r1 = r5.ac
            if (r1 == 0) goto L_0x0043
            r0 = 1
        L_0x0043:
            fan r1 = r5.c
            if (r1 == 0) goto L_0x0056
            android.content.res.ColorStateList r1 = r1.a
            if (r1 == 0) goto L_0x0056
            fan r1 = r5.c
            android.content.res.ColorStateList r1 = r1.a
            int r3 = r5.T
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            int r3 = r5.T
            if (r3 == r1) goto L_0x005e
            r5.T = r1
            r0 = 1
        L_0x005e:
            int[] r1 = r5.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            boolean r1 = a(r1, r3)
            if (r1 == 0) goto L_0x0071
            boolean r1 = r5.i
            if (r1 == 0) goto L_0x0071
            r1 = 1
            goto L_0x0072
        L_0x0071:
            r1 = 0
        L_0x0072:
            boolean r3 = r5.U
            if (r3 == r1) goto L_0x008c
            android.graphics.drawable.Drawable r3 = r5.k
            if (r3 == 0) goto L_0x008c
            float r0 = r5.b()
            r5.U = r1
            float r1 = r5.b()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x008b
            r0 = 1
            r1 = 1
            goto L_0x008d
        L_0x008b:
            r0 = 1
        L_0x008c:
            r1 = 0
        L_0x008d:
            android.content.res.ColorStateList r3 = r5.Z
            if (r3 == 0) goto L_0x0097
            int r2 = r5.V
            int r2 = r3.getColorForState(r6, r2)
        L_0x0097:
            int r3 = r5.V
            if (r3 == r2) goto L_0x00a8
            r5.V = r2
            android.content.res.ColorStateList r0 = r5.Z
            android.graphics.PorterDuff$Mode r2 = r5.aa
            android.graphics.PorterDuffColorFilter r0 = defpackage.ezs.a(r5, r0, r2)
            r5.Y = r0
            r0 = 1
        L_0x00a8:
            android.graphics.drawable.Drawable r2 = r5.E
            boolean r2 = a(r2)
            if (r2 == 0) goto L_0x00b7
            android.graphics.drawable.Drawable r2 = r5.E
            boolean r2 = r2.setState(r6)
            r0 = r0 | r2
        L_0x00b7:
            android.graphics.drawable.Drawable r2 = r5.k
            boolean r2 = a(r2)
            if (r2 == 0) goto L_0x00c6
            android.graphics.drawable.Drawable r2 = r5.k
            boolean r6 = r2.setState(r6)
            r0 = r0 | r6
        L_0x00c6:
            android.graphics.drawable.Drawable r6 = r5.g
            boolean r6 = a(r6)
            if (r6 == 0) goto L_0x00d5
            android.graphics.drawable.Drawable r6 = r5.g
            boolean r6 = r6.setState(r7)
            r0 = r0 | r6
        L_0x00d5:
            if (r0 == 0) goto L_0x00da
            r5.invalidateSelf()
        L_0x00da:
            if (r1 == 0) goto L_0x00df
            r5.a()
        L_0x00df:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezo.a(int[], int[]):boolean");
    }

    private float b(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.K.measureText(charSequence, 0, charSequence.length());
    }

    private void b(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (g()) {
            float f2 = this.s + this.r + this.h + this.q + this.p;
            if (gm.h(this) == 0) {
                rectF.right = (float) rect.right;
                rectF.left = rectF.right - f2;
            } else {
                rectF.left = (float) rect.left;
                rectF.right = ((float) rect.left) + f2;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private static void b(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void b(boolean z2) {
        if (this.d != z2) {
            boolean e2 = e();
            this.d = z2;
            boolean e3 = e();
            if (e2 != e3) {
                if (e3) {
                    c(this.E);
                } else {
                    b(this.E);
                }
                invalidateSelf();
                a();
            }
        }
    }

    private void c(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            gm.b(drawable, gm.h(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.g) {
                if (drawable.isStateful()) {
                    drawable.setState(this.ab);
                }
                gm.a(drawable, this.G);
            } else if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    private void c(boolean z2) {
        if (this.f != z2) {
            boolean g2 = g();
            this.f = z2;
            boolean g3 = g();
            if (g2 != g3) {
                if (g3) {
                    c(this.g);
                } else {
                    b(this.g);
                }
                invalidateSelf();
                a();
            }
        }
    }

    private void d(boolean z2) {
        if (this.j != z2) {
            boolean f2 = f();
            this.j = z2;
            boolean f3 = f();
            if (f2 != f3) {
                if (f3) {
                    c(this.k);
                } else {
                    b(this.k);
                }
                invalidateSelf();
                a();
            }
        }
    }

    private boolean e() {
        return this.d && this.E != null;
    }

    private boolean f() {
        return this.j && this.k != null && this.U;
    }

    private boolean g() {
        return this.f && this.g != null;
    }

    private float h() {
        if (!this.af) {
            return this.ag;
        }
        this.ag = b(this.C);
        this.af = false;
        return this.ag;
    }

    private float i() {
        if (g()) {
            return this.q + this.h + this.r;
        }
        return 0.0f;
    }

    private ColorFilter j() {
        ColorFilter colorFilter = this.X;
        return colorFilter != null ? colorFilter : this.Y;
    }

    private void k() {
        this.ad = this.ac ? fao.a(this.a) : null;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        a aVar = (a) this.ae.get();
        if (aVar != null) {
            aVar.c();
        }
    }

    public final void a(int i2) {
        a(new fan(this.J, i2));
    }

    public final void a(RectF rectF) {
        b(getBounds(), rectF);
    }

    public final void a(a aVar) {
        this.ae = new WeakReference<>(aVar);
    }

    public final void a(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (this.b != charSequence) {
            this.b = charSequence;
            this.C = he.a().a(charSequence);
            this.af = true;
            invalidateSelf();
            a();
        }
    }

    public final void a(boolean z2) {
        if (this.ac != z2) {
            this.ac = z2;
            k();
            onStateChange(getState());
        }
    }

    public final boolean a(int[] iArr) {
        if (!Arrays.equals(this.ab, iArr)) {
            this.ab = iArr;
            if (g()) {
                return a(getState(), iArr);
            }
        }
        return false;
    }

    public final float b() {
        if (e() || f()) {
            return this.m + this.e + this.n;
        }
        return 0.0f;
    }

    public final Drawable c() {
        Drawable drawable = this.E;
        if (drawable != null) {
            return gm.g(drawable);
        }
        return null;
    }

    public final Drawable d() {
        Drawable drawable = this.g;
        if (drawable != null) {
            return gm.g(drawable);
        }
        return null;
    }

    public final void draw(Canvas canvas) {
        int i2;
        int i3;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            if (this.W < 255) {
                float f2 = (float) bounds.left;
                float f3 = (float) bounds.top;
                float f4 = (float) bounds.right;
                float f5 = (float) bounds.bottom;
                int i4 = this.W;
                i2 = VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f2, f3, f4, f5, i4) : canvas.saveLayerAlpha(f2, f3, f4, f5, i4, 31);
            } else {
                i2 = 0;
            }
            this.L.setColor(this.Q);
            this.L.setStyle(Style.FILL);
            this.L.setColorFilter(j());
            this.O.set(bounds);
            RectF rectF = this.O;
            float f6 = this.z;
            canvas2.drawRoundRect(rectF, f6, f6, this.L);
            if (this.B > 0.0f) {
                this.L.setColor(this.R);
                this.L.setStyle(Style.STROKE);
                this.L.setColorFilter(j());
                this.O.set(((float) bounds.left) + (this.B / 2.0f), ((float) bounds.top) + (this.B / 2.0f), ((float) bounds.right) - (this.B / 2.0f), ((float) bounds.bottom) - (this.B / 2.0f));
                float f7 = this.z - (this.B / 2.0f);
                canvas2.drawRoundRect(this.O, f7, f7, this.L);
            }
            this.L.setColor(this.S);
            this.L.setStyle(Style.FILL);
            this.O.set(bounds);
            RectF rectF2 = this.O;
            float f8 = this.z;
            canvas2.drawRoundRect(rectF2, f8, f8, this.L);
            if (e()) {
                a(bounds, this.O);
                float f9 = this.O.left;
                float f10 = this.O.top;
                canvas2.translate(f9, f10);
                this.E.setBounds(0, 0, (int) this.O.width(), (int) this.O.height());
                this.E.draw(canvas2);
                canvas2.translate(-f9, -f10);
            }
            if (f()) {
                a(bounds, this.O);
                float f11 = this.O.left;
                float f12 = this.O.top;
                canvas2.translate(f11, f12);
                this.k.setBounds(0, 0, (int) this.O.width(), (int) this.O.height());
                this.k.draw(canvas2);
                canvas2.translate(-f11, -f12);
            }
            if (this.u && this.C != null) {
                PointF pointF = this.P;
                pointF.set(0.0f, 0.0f);
                Align align = Align.LEFT;
                if (this.C != null) {
                    float b2 = this.l + b() + this.o;
                    if (gm.h(this) == 0) {
                        pointF.x = ((float) bounds.left) + b2;
                        align = Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - b2;
                        align = Align.RIGHT;
                    }
                    float centerY = (float) bounds.centerY();
                    this.K.getFontMetrics(this.N);
                    pointF.y = centerY - ((this.N.descent + this.N.ascent) / 2.0f);
                }
                RectF rectF3 = this.O;
                rectF3.setEmpty();
                if (this.C != null) {
                    float b3 = this.l + b() + this.o;
                    float i5 = this.s + i() + this.p;
                    if (gm.h(this) == 0) {
                        rectF3.left = ((float) bounds.left) + b3;
                        rectF3.right = ((float) bounds.right) - i5;
                    } else {
                        rectF3.left = ((float) bounds.left) + i5;
                        rectF3.right = ((float) bounds.right) - b3;
                    }
                    rectF3.top = (float) bounds.top;
                    rectF3.bottom = (float) bounds.bottom;
                }
                if (this.c != null) {
                    this.K.drawableState = getState();
                    this.c.a(this.J, this.K, this.D);
                }
                this.K.setTextAlign(align);
                boolean z2 = Math.round(h()) > Math.round(this.O.width());
                if (z2) {
                    int save = canvas.save();
                    canvas2.clipRect(this.O);
                    i3 = save;
                } else {
                    i3 = 0;
                }
                CharSequence charSequence = this.C;
                if (z2 && this.t != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.K, this.O.width(), this.t);
                }
                CharSequence charSequence2 = charSequence;
                canvas.drawText(charSequence2, 0, charSequence2.length(), this.P.x, this.P.y, this.K);
                if (z2) {
                    canvas2.restoreToCount(i3);
                }
            }
            if (g()) {
                RectF rectF4 = this.O;
                rectF4.setEmpty();
                if (g()) {
                    float f13 = this.s + this.r;
                    if (gm.h(this) == 0) {
                        rectF4.right = ((float) bounds.right) - f13;
                        rectF4.left = rectF4.right - this.h;
                    } else {
                        rectF4.left = ((float) bounds.left) + f13;
                        rectF4.right = rectF4.left + this.h;
                    }
                    rectF4.top = bounds.exactCenterY() - (this.h / 2.0f);
                    rectF4.bottom = rectF4.top + this.h;
                }
                float f14 = this.O.left;
                float f15 = this.O.top;
                canvas2.translate(f14, f15);
                this.g.setBounds(0, 0, (int) this.O.width(), (int) this.O.height());
                this.g.draw(canvas2);
                canvas2.translate(-f14, -f15);
            }
            if (this.W < 255) {
                canvas2.restoreToCount(i2);
            }
        }
    }

    public final int getAlpha() {
        return this.W;
    }

    public final ColorFilter getColorFilter() {
        return this.X;
    }

    public final int getIntrinsicHeight() {
        return (int) this.y;
    }

    public final int getIntrinsicWidth() {
        return Math.min(Math.round(this.l + b() + this.o + h() + this.p + i() + this.s), this.v);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.z);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.z);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final boolean isStateful() {
        if (!a(this.x) && !a(this.A) && (!this.ac || !a(this.ad))) {
            fan fan = this.c;
            if (!((fan == null || fan.a == null || !fan.a.isStateful()) ? false : true)) {
                return (this.j && this.k != null && this.i) || a(this.E) || a(this.k) || a(this.Z);
            }
        }
    }

    public final boolean onLayoutDirectionChanged(int i2) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (e()) {
            onLayoutDirectionChanged |= this.E.setLayoutDirection(i2);
        }
        if (f()) {
            onLayoutDirectionChanged |= this.k.setLayoutDirection(i2);
        }
        if (g()) {
            onLayoutDirectionChanged |= this.g.setLayoutDirection(i2);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i2) {
        boolean onLevelChange = super.onLevelChange(i2);
        if (e()) {
            onLevelChange |= this.E.setLevel(i2);
        }
        if (f()) {
            onLevelChange |= this.k.setLevel(i2);
        }
        if (g()) {
            onLevelChange |= this.g.setLevel(i2);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        return a(iArr, this.ab);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    public final void setAlpha(int i2) {
        if (this.W != i2) {
            this.W = i2;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.X != colorFilter) {
            this.X = colorFilter;
            invalidateSelf();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.Z != colorStateList) {
            this.Z = colorStateList;
            onStateChange(getState());
        }
    }

    public final void setTintMode(Mode mode) {
        if (this.aa != mode) {
            this.aa = mode;
            this.Y = ezs.a(this, this.Z, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (e()) {
            visible |= this.E.setVisible(z2, z3);
        }
        if (f()) {
            visible |= this.k.setVisible(z2, z3);
        }
        if (g()) {
            visible |= this.g.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
