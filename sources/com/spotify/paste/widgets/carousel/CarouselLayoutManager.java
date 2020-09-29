package com.spotify.paste.widgets.carousel;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.o;
import androidx.recyclerview.widget.RecyclerView.r;
import androidx.recyclerview.widget.RecyclerView.s;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;

public class CarouselLayoutManager extends i implements vht {
    private boolean A;
    private final MeasureMode B;
    private int C;
    private final c D = new c(0);
    private boolean E;
    private b F = new a();
    private final SparseArray<View> G = new SparseArray<>();
    private final List<View> H = new ArrayList();
    private final e I = new e(this, 0);
    private defpackage.vht.a J;
    public vhs a;
    protected int b;
    public boolean c;
    public boolean d;
    public boolean e;
    /* access modifiers changed from: private */
    public int f;
    private int g;
    private int h;
    private int x;
    private int y = -1;
    private boolean z;

    /* renamed from: com.spotify.paste.widgets.carousel.CarouselLayoutManager$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[ScrollDirection.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.paste.widgets.carousel.CarouselLayoutManager$ScrollDirection[] r0 = com.spotify.paste.widgets.carousel.CarouselLayoutManager.ScrollDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.paste.widgets.carousel.CarouselLayoutManager$ScrollDirection r1 = com.spotify.paste.widgets.carousel.CarouselLayoutManager.ScrollDirection.START     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.paste.widgets.carousel.CarouselLayoutManager$ScrollDirection r1 = com.spotify.paste.widgets.carousel.CarouselLayoutManager.ScrollDirection.END     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.paste.widgets.carousel.CarouselLayoutManager.AnonymousClass1.<clinit>():void");
        }
    }

    public static class CarouselLayoutParams extends LayoutParams {
        public CarouselLayoutParams(int i, int i2) {
            super(-2, -2);
        }

        public CarouselLayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public CarouselLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    enum LayoutDirections {
        NONE(0),
        START(-1),
        END(1);
        
        final int mShift;

        private LayoutDirections(int i) {
            this.mShift = i;
        }
    }

    public enum MeasureMode {
        SQUARE,
        FILL
    }

    public enum ScrollDirection {
        NONE,
        START,
        END
    }

    class a implements b {
        a() {
        }

        public final int a() {
            return (CarouselLayoutManager.this.k() - CarouselLayoutManager.this.f) / 2;
        }

        public final int a(int i) {
            return (i - CarouselLayoutManager.this.f) / 2;
        }

        public final r a(RecyclerView recyclerView, ScrollDirection scrollDirection) {
            return new d(recyclerView.getContext(), scrollDirection) {
                public final int a(int i2, int i3, int i4, int i5, int i6) {
                    return (i4 + (((i5 - i4) - (i3 - i2)) / 2)) - i2;
                }
            };
        }

        public final int b() {
            return (CarouselLayoutManager.this.k() - CarouselLayoutManager.this.f) / 2;
        }
    }

    interface b {
        int a();

        int a(int i);

        r a(RecyclerView recyclerView, ScrollDirection scrollDirection);

        int b();
    }

    static final class c {
        boolean a;
        boolean b;
        int c;
        int d;

        private c() {
            this.c = -1;
        }

        /* synthetic */ c(byte b2) {
            this();
        }

        public final void a() {
            this.a = false;
            this.b = false;
            this.c = -1;
        }
    }

    public static class d extends oi {
        private final ScrollDirection i;

        public d(Context context, ScrollDirection scrollDirection) {
            super(context);
            this.i = scrollDirection;
        }

        public final float a(DisplayMetrics displayMetrics) {
            return super.a(displayMetrics) * 2.0f;
        }

        public final PointF c(int i2) {
            int i3 = AnonymousClass1.a[this.i.ordinal()];
            int i4 = 1;
            if (i3 == 1) {
                i4 = -1;
            } else if (i3 != 2) {
                i4 = 0;
            }
            return new PointF((float) i4, 0.0f);
        }
    }

    final class e {
        boolean a;
        int b;

        private e() {
        }

        /* synthetic */ e(CarouselLayoutManager carouselLayoutManager, byte b2) {
            this();
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            this.b = CarouselLayoutManager.a(CarouselLayoutManager.this, (CarouselLayoutManager.this.r() <= 1 || CarouselLayoutManager.this.b <= 0) ? 0 : 1);
            this.a = true;
        }
    }

    public CarouselLayoutManager(MeasureMode measureMode) {
        if (measureMode != null) {
            this.B = measureMode;
            return;
        }
        throw new IllegalArgumentException("MeasureMode must not be null!");
    }

    private int a(int i, View view) {
        int paddingLeft = (-k(view)) + getPaddingLeft() + u(view);
        if (Math.abs(paddingLeft) <= 1) {
            paddingLeft = 0;
        }
        return Math.min(-i, paddingLeft);
    }

    static /* synthetic */ int a(CarouselLayoutManager carouselLayoutManager, int i) {
        return carouselLayoutManager.h + i;
    }

    private void a(LayoutDirections layoutDirections, o oVar, s sVar) {
        if (r() != 0) {
            if (!this.D.b) {
                a(false);
            }
            for (int i = 0; i < r(); i++) {
                this.G.put(this.h + i, g(i));
            }
            for (int i2 = 0; i2 < this.G.size(); i2++) {
                f((View) this.G.valueAt(i2));
            }
        }
        this.h += layoutDirections.mShift;
        int i3 = -1;
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = this.h + i4;
            if (i5 >= sVar.a() && !sVar.g) {
                break;
            }
            View view = (View) this.G.get(i5);
            if (view == null) {
                view = oVar.b(i5);
                if (view.getTag(R.id.paste_carousel_tag) == null) {
                    view.setTag(R.id.paste_carousel_tag, new vhp());
                }
                d(view, i4);
                this.H.add(view);
                f(view);
                a(view);
            } else {
                this.H.add(view);
                this.G.remove(i5);
                d(view, i4);
                c(view, -1);
            }
            s(view);
            if (((LayoutParams) view.getLayoutParams()).c.e() == this.D.c) {
                i3 = i4;
            }
        }
        if (this.z || !this.D.a || i3 == -1) {
            i3 = this.b > 0 ? 1 : 0;
            c cVar = this.D;
            cVar.a = true;
            cVar.d = u((View) this.H.get(i3)) + getPaddingLeft();
            this.D.b = false;
        }
        int i6 = this.D.d;
        for (int i7 = i3 - 1; i7 >= 0; i7--) {
            i6 -= ((View) this.H.get(i7)).getMeasuredWidth() + this.x;
        }
        for (View view2 : this.H) {
            b(view2, i6, getPaddingTop() + ((((this.w - getPaddingTop()) - getPaddingBottom()) - view2.getMeasuredHeight()) / 2));
            i6 += view2.getMeasuredWidth() + this.x;
        }
        for (int i8 = 0; i8 < this.G.size(); i8++) {
            oVar.a((View) this.G.valueAt(i8));
        }
        this.D.a();
        this.G.clear();
        this.H.clear();
        d(0);
    }

    private void a(boolean z2) {
        View view = (View) fbp.a(r() > 1 ? g(1) : g(0));
        this.D.c = ((CarouselLayoutParams) view.getLayoutParams()).c.e();
        this.D.d = k(view);
        c cVar = this.D;
        cVar.b = z2;
        cVar.a = true;
        if (z2 && u(view) + getPaddingLeft() == this.D.d && !this.E) {
            this.D.a = false;
        }
    }

    private int b(int i, View view) {
        int paddingRight = ((this.v - getPaddingRight()) - m(view)) - v(view);
        if (Math.abs(paddingRight) <= 1) {
            paddingRight = 0;
        }
        return Math.max(-i, paddingRight);
    }

    private void b(View view, int i, int i2) {
        boolean t = t(view);
        int k = k();
        if (!t) {
            k = this.f;
        }
        a(view, i, i2, k + i, this.g + i2);
    }

    private void d(int i) {
        if (this.a != null) {
            for (int i2 = 0; i2 < r(); i2++) {
                View view = (View) fbp.a(g(i2));
                int u = u(view);
                if (k(view) < getPaddingLeft() + u) {
                    float paddingLeft = ((float) ((getPaddingLeft() + u) - k(view))) / ((float) this.f);
                    if (paddingLeft > 1.0f) {
                        paddingLeft = 1.0f;
                    }
                    this.a.a(view, paddingLeft);
                } else {
                    float k = ((float) (k(view) - (getPaddingLeft() + u))) / ((float) this.f);
                    if (k > 1.0f) {
                        k = 1.0f;
                    }
                    this.a.b(view, k);
                }
            }
        }
    }

    private void d(View view, int i) {
        vhp vhp = (vhp) view.getTag(R.id.paste_carousel_tag);
        vhs vhs = this.a;
        boolean z2 = true;
        if (vhs == null) {
            vhp.b = 0;
        } else if (i == 0 && vhs.a() > 0 && this.b != 0) {
            vhp.b = -1;
            vhp.c = this.a.a();
        } else if (i != 2 || this.a.b() <= 0) {
            vhp.b = 0;
        } else {
            vhp.b = 1;
            vhp.c = this.a.b();
        }
        if (i != l()) {
            z2 = false;
        }
        vhp.a(z2);
    }

    private int f(int i) {
        if (t() != 0) {
            if (i > t() - 1) {
                return t() - 1;
            }
            if (i >= 0) {
                return i;
            }
        }
        return 0;
    }

    private int j() {
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < r(); i3++) {
            View view = (View) fbp.a(g(i3));
            int abs = Math.abs((getPaddingLeft() + (k() / 2)) - (k(view) + ((m(view) - k(view)) / 2)));
            if (abs < i2) {
                i = i3;
                i2 = abs;
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    public int k() {
        int paddingLeft = (this.v - getPaddingLeft()) - getPaddingRight();
        int i = this.C;
        if (paddingLeft > i && i != 0) {
            this.D.a = false;
        }
        this.C = paddingLeft;
        return paddingLeft;
    }

    private int l() {
        return this.b - this.h;
    }

    private void s(View view) {
        boolean t = t(view);
        int k = k();
        if (!t) {
            k = this.f;
        }
        view.measure(MeasureSpec.makeMeasureSpec(k, 1073741824), MeasureSpec.makeMeasureSpec(this.g, 1073741824));
    }

    private static boolean t(View view) {
        CarouselLayoutParams carouselLayoutParams = (CarouselLayoutParams) view.getLayoutParams();
        return false;
    }

    private int u(View view) {
        if (t(view)) {
            return 0;
        }
        return this.F.b();
    }

    private int v(View view) {
        if (t(view)) {
            return 0;
        }
        return this.F.a();
    }

    public final int a(int i) {
        if (Math.abs(i) < 1500) {
            return this.h + j();
        }
        int i2 = this.b;
        if (i > 0) {
            if (!this.d) {
                i2++;
            }
        } else if (!this.c) {
            i2--;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 > t() - 1) {
            i2 = t() - 1;
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r13, androidx.recyclerview.widget.RecyclerView.o r14, androidx.recyclerview.widget.RecyclerView.s r15) {
        /*
            r12 = this;
            int r0 = r12.r()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r0 = r12.g(r1)
            java.lang.Object r0 = defpackage.fbp.a(r0)
            android.view.View r0 = (android.view.View) r0
            int r2 = r12.r()
            r3 = 1
            int r2 = r2 - r3
            android.view.View r2 = r12.g(r2)
            int r4 = r12.h
            if (r4 != 0) goto L_0x0022
            r4 = 1
            goto L_0x0023
        L_0x0022:
            r4 = 0
        L_0x0023:
            int r5 = r12.h
            int r5 = r5 + 3
            int r6 = r12.t()
            if (r5 < r6) goto L_0x002f
            r5 = 1
            goto L_0x0030
        L_0x002f:
            r5 = 0
        L_0x0030:
            com.spotify.paste.widgets.carousel.CarouselLayoutManager$e r6 = r12.I
            boolean r6 = r6.a
            r7 = 0
            if (r6 == 0) goto L_0x0071
            com.spotify.paste.widgets.carousel.CarouselLayoutManager$e r6 = r12.I
            int r6 = r6.b
            int r6 = r6 - r3
            com.spotify.paste.widgets.carousel.CarouselLayoutManager$e r7 = r12.I
            int r7 = r7.b
            int r7 = r7 + r3
            int r8 = r12.h
            int r8 = r6 - r8
            int r8 = java.lang.Math.max(r8, r1)
            int r9 = r12.h
            int r9 = r7 - r9
            int r10 = r12.r()
            int r10 = r10 - r3
            int r9 = java.lang.Math.min(r9, r10)
            android.view.View r8 = r12.g(r8)
            if (r8 == 0) goto L_0x0063
            int r10 = r12.b
            int r10 = r10 - r3
            if (r10 < r6) goto L_0x0063
            r6 = 1
            goto L_0x0064
        L_0x0063:
            r6 = 0
        L_0x0064:
            android.view.View r9 = r12.g(r9)
            if (r9 == 0) goto L_0x0074
            int r10 = r12.b
            int r10 = r10 + r3
            if (r10 > r7) goto L_0x0074
            r7 = 1
            goto L_0x0075
        L_0x0071:
            r8 = r7
            r9 = r8
            r6 = 0
        L_0x0074:
            r7 = 0
        L_0x0075:
            boolean r10 = r12.c
            if (r10 == 0) goto L_0x008f
            int r10 = r12.b
            if (r10 <= 0) goto L_0x008f
            boolean r11 = r12.e
            if (r11 == 0) goto L_0x008f
            int r0 = r12.h
            int r10 = r10 - r0
            android.view.View r0 = r12.g(r10)
            java.lang.Object r0 = defpackage.fbp.a(r0)
            android.view.View r0 = (android.view.View) r0
            r4 = 1
        L_0x008f:
            boolean r10 = r12.d
            if (r10 == 0) goto L_0x00aa
            int r10 = r12.b
            int r11 = r12.t()
            int r11 = r11 - r3
            if (r10 >= r11) goto L_0x00aa
            boolean r10 = r12.e
            if (r10 == 0) goto L_0x00aa
            int r2 = r12.b
            int r5 = r12.h
            int r2 = r2 - r5
            android.view.View r2 = r12.g(r2)
            r5 = 1
        L_0x00aa:
            if (r13 <= 0) goto L_0x00cb
            if (r5 == 0) goto L_0x00b4
            boolean r6 = r12.d
            if (r6 == 0) goto L_0x00b4
            r6 = 1
            goto L_0x00b5
        L_0x00b4:
            r6 = 0
        L_0x00b5:
            if (r5 == 0) goto L_0x00ba
            if (r7 != 0) goto L_0x00ba
            r1 = 1
        L_0x00ba:
            if (r6 != 0) goto L_0x00c6
            if (r1 == 0) goto L_0x00bf
            goto L_0x00c6
        L_0x00bf:
            if (r7 == 0) goto L_0x00e5
            int r1 = r12.b(r13, r9)
            goto L_0x00eb
        L_0x00c6:
            int r1 = r12.b(r13, r2)
            goto L_0x00eb
        L_0x00cb:
            if (r4 == 0) goto L_0x00d3
            boolean r2 = r12.c
            if (r2 == 0) goto L_0x00d3
            r2 = 1
            goto L_0x00d4
        L_0x00d3:
            r2 = 0
        L_0x00d4:
            if (r4 == 0) goto L_0x00d9
            if (r6 != 0) goto L_0x00d9
            r1 = 1
        L_0x00d9:
            if (r2 != 0) goto L_0x00e7
            if (r1 == 0) goto L_0x00de
            goto L_0x00e7
        L_0x00de:
            if (r6 == 0) goto L_0x00e5
            int r1 = r12.a(r13, r8)
            goto L_0x00eb
        L_0x00e5:
            int r1 = -r13
            goto L_0x00eb
        L_0x00e7:
            int r1 = r12.a(r13, r0)
        L_0x00eb:
            r12.h(r1)
            int r1 = -r1
            r12.d(r1)
            if (r13 <= 0) goto L_0x010c
            int r13 = r12.m(r0)
            int r0 = r12.getPaddingLeft()
            if (r13 >= r0) goto L_0x0106
            if (r5 != 0) goto L_0x0106
            com.spotify.paste.widgets.carousel.CarouselLayoutManager$LayoutDirections r13 = com.spotify.paste.widgets.carousel.CarouselLayoutManager.LayoutDirections.END
            r12.a(r13, r14, r15)
            goto L_0x0123
        L_0x0106:
            com.spotify.paste.widgets.carousel.CarouselLayoutManager$LayoutDirections r13 = com.spotify.paste.widgets.carousel.CarouselLayoutManager.LayoutDirections.NONE
            r12.a(r13, r14, r15)
            goto L_0x0123
        L_0x010c:
            int r13 = r12.k(r0)
            int r0 = r12.getPaddingLeft()
            if (r13 < r0) goto L_0x011e
            if (r4 != 0) goto L_0x011e
            com.spotify.paste.widgets.carousel.CarouselLayoutManager$LayoutDirections r13 = com.spotify.paste.widgets.carousel.CarouselLayoutManager.LayoutDirections.START
            r12.a(r13, r14, r15)
            goto L_0x0123
        L_0x011e:
            com.spotify.paste.widgets.carousel.CarouselLayoutManager$LayoutDirections r13 = com.spotify.paste.widgets.carousel.CarouselLayoutManager.LayoutDirections.NONE
            r12.a(r13, r14, r15)
        L_0x0123:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.paste.widgets.carousel.CarouselLayoutManager.a(int, androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.RecyclerView$s):int");
    }

    public final LayoutParams a() {
        return new CarouselLayoutParams(-2, -2);
    }

    public final LayoutParams a(Context context, AttributeSet attributeSet) {
        return new CarouselLayoutParams(context, attributeSet);
    }

    public final LayoutParams a(ViewGroup.LayoutParams layoutParams) {
        return new CarouselLayoutParams(layoutParams);
    }

    public final void a(androidx.recyclerview.widget.RecyclerView.a aVar, androidx.recyclerview.widget.RecyclerView.a aVar2) {
        Logger.b("onAdapterChanged(oldAdapter='%s', newAdapter='%s')", aVar, aVar2);
        q();
    }

    public final void a(o oVar, s sVar, int i, int i2) {
        int i3 = 0;
        Logger.b("onMeasure(recycler='%s', state='%s', widthSpec='%s', heightSpec='%s')", oVar, sVar, Integer.valueOf(i), Integer.valueOf(i2));
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (!(mode == Integer.MIN_VALUE || mode == 1073741824)) {
            size = ip.l(this.i);
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        vhs vhs = this.a;
        if (vhs != null) {
            i3 = (vhs.a() + this.a.b()) << 1;
        }
        int i4 = paddingLeft - i3;
        int paddingTop = getPaddingTop() + i4 + getPaddingBottom();
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, paddingTop);
        } else if (mode2 == 0) {
            size2 = paddingTop;
        } else if (mode2 != 1073741824) {
            size2 = ip.m(this.i);
        }
        d(size, size2);
        if (this.B == MeasureMode.SQUARE) {
            int min = Math.min(size2, i4);
            this.f = min;
            this.g = min;
        } else {
            this.f = i4;
            this.g = (size2 - getPaddingTop()) - getPaddingBottom();
        }
        this.x = this.F.a(i4);
    }

    public final void a(RecyclerView recyclerView) {
        Logger.b("onItemsChanged(recyclerView='%s')", recyclerView);
        this.z = true;
        this.A = true;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        Logger.b("onItemsAdded(recyclerView='%s', positionStart='%s', itemCount='%s')", recyclerView, Integer.valueOf(i), Integer.valueOf(i2));
        if (r() != 0) {
            int i3 = this.b;
            if (i <= i3) {
                this.b = i3 + i2;
            }
            if (this.I.a) {
                e eVar = this.I;
                if (i <= CarouselLayoutManager.this.I.b) {
                    CarouselLayoutManager.this.I.b += i2;
                }
            }
            this.A = true;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2, int i3) {
        Logger.b("onItemsMoved(recyclerView='%s', from='%s', to='%s', itemCount='%s')", recyclerView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        int i4 = i + i3;
        int i5 = this.b;
        if (i4 < i5) {
            if (i2 > i5) {
                this.b = i5 - i3;
            }
        } else if (i > i5 || i4 < i5) {
            int i6 = this.b;
            if (i > i6 && i2 <= i6) {
                this.b = i6 + i3;
            }
        } else {
            this.b = i5 + (i2 - i);
        }
        this.A = true;
    }

    public void a(RecyclerView recyclerView, s sVar, int i) {
        if (i < t()) {
            ScrollDirection scrollDirection = ScrollDirection.NONE;
            int i2 = this.b;
            if (i > i2) {
                scrollDirection = ScrollDirection.END;
            } else if (i < i2) {
                scrollDirection = ScrollDirection.START;
            }
            r a2 = this.F.a(recyclerView, scrollDirection);
            a2.b = i;
            a(a2);
            this.b = i;
        }
    }

    public final void a(defpackage.vht.a aVar) {
        this.J = aVar;
    }

    public final boolean a(LayoutParams layoutParams) {
        return layoutParams instanceof CarouselLayoutParams;
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        Logger.b("onItemsRemoved(recyclerView='%s', positionStart='%s', itemCount='%s')", recyclerView, Integer.valueOf(i), Integer.valueOf(i2));
        if (r() != 0) {
            int i3 = i + i2;
            int i4 = i3 - 1;
            int i5 = this.b;
            if (i4 < i5) {
                this.b = i5 - i2;
            } else if (i <= i5 && i3 >= i5) {
                this.b = f(i5);
            }
            if (this.I.a) {
                e eVar = this.I;
                if (i4 < eVar.b) {
                    eVar.b -= i2;
                } else if (i <= eVar.b && i3 >= eVar.b) {
                    eVar.b = CarouselLayoutManager.this.f(eVar.b);
                }
            }
            this.A = true;
        }
    }

    public final boolean b(int i) {
        View g2 = g(i - this.h);
        if (g2 != null) {
            if (k(g2) == u(g2) + (g2.getParent() instanceof CarouselView ? ((CarouselView) g2.getParent()).getPaddingLeft() : 0)) {
                return false;
            }
        }
        return true;
    }

    public final void c(o oVar, s sVar) {
        if (t() == 0) {
            a(oVar);
            return;
        }
        if (sVar.f) {
            int i = this.y;
            if (i != -1) {
                this.b = i;
            }
        }
        if (this.b > t() - 1) {
            this.b = t() - 1;
        } else if (this.b < 0) {
            this.b = 0;
        }
        int i2 = this.b;
        if (i2 != 0) {
            this.h = i2 - 1;
        } else {
            this.h = i2;
        }
        if (r() != 0) {
            a(true);
        }
        a(oVar);
        a(LayoutDirections.NONE, oVar, sVar);
        this.z = false;
        this.y = -1;
        if (!sVar.g) {
            defpackage.vht.a aVar = this.J;
            if (aVar != null) {
                aVar.onPostLayoutChildren(this.A);
            }
        }
        this.A = false;
    }

    public final void e(int i) {
        if (i < t()) {
            this.h = Math.max(i - 1, 0);
            this.b = i;
            this.y = i;
            o_();
        }
    }

    public final boolean e() {
        return r() > 0;
    }

    public final int g() {
        return this.h + j();
    }

    public final int h() {
        return this.b;
    }

    public final void j(int i) {
        super.j(i);
        boolean z2 = true;
        this.e = i == 1;
        if (i != 2) {
            z2 = false;
        }
        this.E = z2;
        if (this.e && !this.I.a && r() > 0) {
            this.I.a();
        }
        if (i == 0) {
            this.I.a = false;
        }
    }
}
