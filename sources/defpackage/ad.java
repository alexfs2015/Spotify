package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.util.SparseArray;

/* renamed from: ad reason: default package */
class ad extends Drawable implements Callback {
    int a = -1;
    private b b;
    private Rect c;
    private Drawable d;
    private Drawable e;
    private int f = 255;
    private boolean g;
    private int h = -1;
    private boolean i;
    private Runnable j;
    private long k;
    private long l;
    private a m;

    /* renamed from: ad$a */
    static class a implements Callback {
        Callback a;

        a() {
        }

        public final Callback a() {
            Callback callback = this.a;
            this.a = null;
            return callback;
        }

        public final void invalidateDrawable(Drawable drawable) {
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Callback callback = this.a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Callback callback = this.a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: ad$b */
    static abstract class b extends ConstantState {
        private SparseArray<ConstantState> A;
        private boolean B;
        private int C;
        private int D;
        private int E;
        private int F;
        private boolean G;
        private boolean H;
        private boolean I;
        private ad a;
        int b;
        int c;
        Drawable[] d;
        int e;
        boolean f;
        boolean g;
        Rect h;
        boolean i;
        boolean j;
        int k;
        boolean l;
        boolean m;
        boolean n;
        int o;
        int p;
        int q;
        boolean r;
        ColorFilter s;
        boolean t;
        ColorStateList u;
        Mode v;
        boolean w;
        boolean x;
        private Resources y;
        private int z = 160;

        b(b bVar, ad adVar, Resources resources) {
            this.f = false;
            this.i = false;
            this.n = true;
            this.p = 0;
            this.q = 0;
            this.a = adVar;
            Resources resources2 = resources != null ? resources : bVar != null ? bVar.y : null;
            this.y = resources2;
            this.z = ad.a(resources, bVar != null ? bVar.z : 0);
            if (bVar != null) {
                this.b = bVar.b;
                this.c = bVar.c;
                this.G = true;
                this.H = true;
                this.f = bVar.f;
                this.i = bVar.i;
                this.n = bVar.n;
                this.I = bVar.I;
                this.o = bVar.o;
                this.p = bVar.p;
                this.q = bVar.q;
                this.r = bVar.r;
                this.s = bVar.s;
                this.t = bVar.t;
                this.u = bVar.u;
                this.v = bVar.v;
                this.w = bVar.w;
                this.x = bVar.x;
                if (bVar.z == this.z) {
                    if (bVar.g) {
                        this.h = new Rect(bVar.h);
                        this.g = true;
                    }
                    if (bVar.B) {
                        this.C = bVar.C;
                        this.D = bVar.D;
                        this.E = bVar.E;
                        this.F = bVar.F;
                        this.B = true;
                    }
                }
                if (bVar.j) {
                    this.k = bVar.k;
                    this.j = true;
                }
                if (bVar.l) {
                    this.m = bVar.m;
                    this.l = true;
                }
                Drawable[] drawableArr = bVar.d;
                this.d = new Drawable[drawableArr.length];
                this.e = bVar.e;
                SparseArray<ConstantState> sparseArray = bVar.A;
                if (sparseArray != null) {
                    this.A = sparseArray.clone();
                } else {
                    this.A = new SparseArray<>(this.e);
                }
                int i2 = this.e;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null) {
                        ConstantState constantState = drawableArr[i3].getConstantState();
                        if (constantState != null) {
                            this.A.put(i3, constantState);
                        } else {
                            this.d[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.d = new Drawable[10];
            this.e = 0;
        }

        private Drawable b(Drawable drawable) {
            if (VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.o);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.a);
            return mutate;
        }

        private void i() {
            this.B = true;
            c();
            int i2 = this.e;
            Drawable[] drawableArr = this.d;
            this.D = -1;
            this.C = -1;
            this.F = 0;
            this.E = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.C) {
                    this.C = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.D) {
                    this.D = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.E) {
                    this.E = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.F) {
                    this.F = minimumHeight;
                }
            }
        }

        public final int a(Drawable drawable) {
            int i2 = this.e;
            if (i2 >= this.d.length) {
                b(i2, i2 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.a);
            this.d[i2] = drawable;
            this.e++;
            this.c = drawable.getChangingConfigurations() | this.c;
            b();
            this.h = null;
            this.g = false;
            this.B = false;
            this.G = false;
            return i2;
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            int i2 = this.e;
            Drawable[] drawableArr = this.d;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3] != null) {
                    drawableArr[i3].mutate();
                }
            }
            this.I = true;
        }

        /* access modifiers changed from: 0000 */
        public final void a(Resources resources) {
            if (resources != null) {
                this.y = resources;
                int a2 = ad.a(resources, this.z);
                int i2 = this.z;
                this.z = a2;
                if (i2 != a2) {
                    this.B = false;
                    this.g = false;
                }
            }
        }

        public final Drawable b(int i2) {
            Drawable drawable = this.d[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<ConstantState> sparseArray = this.A;
            if (sparseArray != null) {
                int indexOfKey = sparseArray.indexOfKey(i2);
                if (indexOfKey >= 0) {
                    Drawable b2 = b(((ConstantState) this.A.valueAt(indexOfKey)).newDrawable(this.y));
                    this.d[i2] = b2;
                    this.A.removeAt(indexOfKey);
                    if (this.A.size() == 0) {
                        this.A = null;
                    }
                    return b2;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            this.j = false;
            this.l = false;
        }

        public void b(int i2, int i3) {
            Drawable[] drawableArr = new Drawable[i3];
            System.arraycopy(this.d, 0, drawableArr, 0, i2);
            this.d = drawableArr;
        }

        /* access modifiers changed from: 0000 */
        public void c() {
            SparseArray<ConstantState> sparseArray = this.A;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.d[this.A.keyAt(i2)] = b(((ConstantState) this.A.valueAt(i2)).newDrawable(this.y));
                }
                this.A = null;
            }
        }

        public boolean canApplyTheme() {
            int i2 = this.e;
            Drawable[] drawableArr = this.d;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    ConstantState constantState = (ConstantState) this.A.get(i3);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        public final int d() {
            if (!this.B) {
                i();
            }
            return this.C;
        }

        public final int e() {
            if (!this.B) {
                i();
            }
            return this.D;
        }

        public final int f() {
            if (!this.B) {
                i();
            }
            return this.E;
        }

        public final int g() {
            if (!this.B) {
                i();
            }
            return this.F;
        }

        public int getChangingConfigurations() {
            return this.b | this.c;
        }

        public final synchronized boolean h() {
            if (this.G) {
                return this.H;
            }
            c();
            this.G = true;
            int i2 = this.e;
            Drawable[] drawableArr = this.d;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getConstantState() == null) {
                    this.H = false;
                    return false;
                }
            }
            this.H = true;
            return true;
        }
    }

    ad() {
    }

    static int a(Resources resources, int i2) {
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
        }
        if (i2 == 0) {
            return 160;
        }
        return i2;
    }

    private void a(Drawable drawable) {
        if (this.m == null) {
            this.m = new a();
        }
        a aVar = this.m;
        aVar.a = drawable.getCallback();
        drawable.setCallback(aVar);
        try {
            if (this.b.p <= 0 && this.g) {
                drawable.setAlpha(this.f);
            }
            if (this.b.t) {
                drawable.setColorFilter(this.b.s);
            } else {
                if (this.b.w) {
                    gm.a(drawable, this.b.u);
                }
                if (this.b.x) {
                    gm.a(drawable, this.b.v);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.b.n);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.b.r);
            }
            Rect rect = this.c;
            if (VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.m.a());
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(b bVar) {
        this.b = bVar;
        int i2 = this.a;
        if (i2 >= 0) {
            this.d = bVar.b(i2);
            Drawable drawable = this.d;
            if (drawable != null) {
                a(drawable);
            }
        }
        this.h = -1;
        this.e = null;
    }

    /* access modifiers changed from: 0000 */
    public final void a(Resources resources) {
        this.b.a(resources);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.d
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0038
            long r9 = r13.k
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x003a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0020
            int r9 = r13.f
            r3.setAlpha(r9)
            goto L_0x0038
        L_0x0020:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r3 = (int) r9
            ad$b r9 = r13.b
            int r9 = r9.p
            int r3 = r3 / r9
            android.graphics.drawable.Drawable r9 = r13.d
            int r3 = 255 - r3
            int r10 = r13.f
            int r3 = r3 * r10
            int r3 = r3 / 255
            r9.setAlpha(r3)
            r3 = 1
            goto L_0x003b
        L_0x0038:
            r13.k = r7
        L_0x003a:
            r3 = 0
        L_0x003b:
            android.graphics.drawable.Drawable r9 = r13.e
            if (r9 == 0) goto L_0x0068
            long r10 = r13.l
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x006a
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0053
            r9.setVisible(r6, r6)
            r0 = 0
            r13.e = r0
            r0 = -1
            r13.h = r0
            goto L_0x0068
        L_0x0053:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            ad$b r4 = r13.b
            int r4 = r4.q
            int r3 = r3 / r4
            android.graphics.drawable.Drawable r4 = r13.e
            int r5 = r13.f
            int r3 = r3 * r5
            int r3 = r3 / 255
            r4.setAlpha(r3)
            goto L_0x006b
        L_0x0068:
            r13.l = r7
        L_0x006a:
            r0 = r3
        L_0x006b:
            if (r14 == 0) goto L_0x0077
            if (r0 == 0) goto L_0x0077
            java.lang.Runnable r14 = r13.j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad.a(boolean):void");
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(int i2) {
        if (i2 == this.a) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.b.q > 0) {
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.d;
            if (drawable2 != null) {
                this.e = drawable2;
                this.h = this.a;
                this.l = ((long) this.b.q) + uptimeMillis;
            } else {
                this.e = null;
                this.h = -1;
                this.l = 0;
            }
        } else {
            Drawable drawable3 = this.d;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i2 < 0 || i2 >= this.b.e) {
            this.d = null;
            this.a = -1;
        } else {
            Drawable b2 = this.b.b(i2);
            this.d = b2;
            this.a = i2;
            if (b2 != null) {
                if (this.b.p > 0) {
                    this.k = uptimeMillis + ((long) this.b.p);
                }
                a(b2);
            }
        }
        if (!(this.k == 0 && this.l == 0)) {
            Runnable runnable = this.j;
            if (runnable == null) {
                this.j = new Runnable() {
                    public final void run() {
                        ad.this.a(true);
                        ad.this.invalidateSelf();
                    }
                };
            } else {
                unscheduleSelf(runnable);
            }
            a(true);
        }
        invalidateSelf();
        return true;
    }

    public void applyTheme(Theme theme) {
        b bVar = this.b;
        if (theme != null) {
            bVar.c();
            int i2 = bVar.e;
            Drawable[] drawableArr = bVar.d;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3] != null && drawableArr[i3].canApplyTheme()) {
                    drawableArr[i3].applyTheme(theme);
                    bVar.c |= drawableArr[i3].getChangingConfigurations();
                }
            }
            bVar.a(theme.getResources());
        }
    }

    /* access modifiers changed from: 0000 */
    public b b() {
        return this.b;
    }

    public boolean canApplyTheme() {
        return this.b.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getAlpha() {
        return this.f;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    public final ConstantState getConstantState() {
        if (!this.b.h()) {
            return null;
        }
        this.b.b = getChangingConfigurations();
        return this.b;
    }

    public Drawable getCurrent() {
        return this.d;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.b.i) {
            return this.b.e();
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.b.i) {
            return this.b.d();
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.b.i) {
            return this.b.g();
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.b.i) {
            return this.b.f();
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.d;
        int i2 = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        b bVar = this.b;
        if (bVar.j) {
            return bVar.k;
        }
        bVar.c();
        int i3 = bVar.e;
        Drawable[] drawableArr = bVar.d;
        if (i3 > 0) {
            i2 = drawableArr[0].getOpacity();
        }
        int i4 = i2;
        for (int i5 = 1; i5 < i3; i5++) {
            i4 = Drawable.resolveOpacity(i4, drawableArr[i5].getOpacity());
        }
        bVar.k = i4;
        bVar.j = true;
        return i4;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        b bVar = this.b;
        Rect rect2 = null;
        boolean z2 = true;
        if (!bVar.f) {
            if (bVar.h != null || bVar.g) {
                rect2 = bVar.h;
            } else {
                bVar.c();
                Rect rect3 = new Rect();
                int i2 = bVar.e;
                Drawable[] drawableArr = bVar.d;
                Rect rect4 = null;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3].getPadding(rect3)) {
                        if (rect4 == null) {
                            rect4 = new Rect(0, 0, 0, 0);
                        }
                        if (rect3.left > rect4.left) {
                            rect4.left = rect3.left;
                        }
                        if (rect3.top > rect4.top) {
                            rect4.top = rect3.top;
                        }
                        if (rect3.right > rect4.right) {
                            rect4.right = rect3.right;
                        }
                        if (rect3.bottom > rect4.bottom) {
                            rect4.bottom = rect3.bottom;
                        }
                    }
                }
                bVar.g = true;
                bVar.h = rect4;
                rect2 = rect4;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            z = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.d;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (!isAutoMirrored() || gm.h(this) != 1) {
            z2 = false;
        }
        if (z2) {
            int i4 = rect.left;
            rect.left = rect.right;
            rect.right = i4;
        }
        return z;
    }

    public void invalidateDrawable(Drawable drawable) {
        b bVar = this.b;
        if (bVar != null) {
            bVar.b();
        }
        if (drawable == this.d && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.b.r;
    }

    public boolean isStateful() {
        b bVar = this.b;
        if (bVar.l) {
            return bVar.m;
        }
        bVar.c();
        int i2 = bVar.e;
        Drawable[] drawableArr = bVar.d;
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            } else if (drawableArr[i3].isStateful()) {
                z = true;
                break;
            } else {
                i3++;
            }
        }
        bVar.m = z;
        bVar.l = true;
        return z;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.e = null;
            this.h = -1;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.g) {
                this.d.setAlpha(this.f);
            }
        }
        if (this.l != 0) {
            this.l = 0;
            z = true;
        }
        if (this.k != 0) {
            this.k = 0;
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.i && super.mutate() == this) {
            b b2 = b();
            b2.a();
            a(b2);
            this.i = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i2) {
        b bVar = this.b;
        int i3 = this.a;
        int i4 = bVar.e;
        Drawable[] drawableArr = bVar.d;
        boolean z = false;
        for (int i5 = 0; i5 < i4; i5++) {
            if (drawableArr[i5] != null) {
                boolean layoutDirection = VERSION.SDK_INT >= 23 ? drawableArr[i5].setLayoutDirection(i2) : false;
                if (i5 == i3) {
                    z = layoutDirection;
                }
            }
        }
        bVar.o = i2;
        return z;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable == this.d && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        if (!this.g || this.f != i2) {
            this.g = true;
            this.f = i2;
            Drawable drawable = this.d;
            if (drawable != null) {
                if (this.k == 0) {
                    drawable.setAlpha(i2);
                    return;
                }
                a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        if (this.b.r != z) {
            b bVar = this.b;
            bVar.r = z;
            Drawable drawable = this.d;
            if (drawable != null) {
                gm.a(drawable, bVar.r);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.b;
        bVar.t = true;
        if (bVar.s != colorFilter) {
            this.b.s = colorFilter;
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        if (this.b.n != z) {
            b bVar = this.b;
            bVar.n = z;
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setDither(bVar.n);
            }
        }
    }

    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.d;
        if (drawable != null) {
            gm.a(drawable, f2, f3);
        }
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.c;
        if (rect == null) {
            this.c = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            gm.a(drawable, i2, i3, i4, i5);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        b bVar = this.b;
        bVar.w = true;
        if (bVar.u != colorStateList) {
            this.b.u = colorStateList;
            gm.a(this.d, colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        b bVar = this.b;
        bVar.x = true;
        if (bVar.v != mode) {
            this.b.v = mode;
            gm.a(this.d, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.d && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
