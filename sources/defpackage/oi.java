package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.r;
import androidx.recyclerview.widget.RecyclerView.r.a;

/* renamed from: oi reason: default package */
public class oi extends r {
    protected final DecelerateInterpolator a = new DecelerateInterpolator();
    private LinearInterpolator i = new LinearInterpolator();
    private PointF j;
    private final DisplayMetrics k;
    private boolean l = false;
    private float m;
    private int n = 0;
    private int o = 0;

    public oi(Context context) {
        this.k = context.getResources().getDisplayMetrics();
    }

    private static int b(int i2, int i3) {
        int i4 = i2 - i3;
        if (i2 * i4 <= 0) {
            return 0;
        }
        return i4;
    }

    /* access modifiers changed from: protected */
    public float a(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    public final int a(int i2) {
        double b = (double) b(i2);
        Double.isNaN(b);
        return (int) Math.ceil(b / 0.3356d);
    }

    public int a(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 == 0) {
            int i7 = i4 - i2;
            if (i7 > 0) {
                return i7;
            }
            int i8 = i5 - i3;
            if (i8 < 0) {
                return i8;
            }
            return 0;
        } else if (i6 == 1) {
            return i5 - i3;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public final void a() {
        this.o = 0;
        this.n = 0;
        this.j = null;
    }

    public final void a(int i2, int i3, a aVar) {
        if (this.c.n.r() == 0) {
            b();
            return;
        }
        this.n = b(this.n, i2);
        this.o = b(this.o, i3);
        if (this.n == 0 && this.o == 0) {
            PointF c = c(this.b);
            if (c == null || (c.x == 0.0f && c.y == 0.0f)) {
                aVar.a = this.b;
                b();
            } else {
                float sqrt = (float) Math.sqrt((double) ((c.x * c.x) + (c.y * c.y)));
                c.x /= sqrt;
                c.y /= sqrt;
                this.j = c;
                this.n = (int) (c.x * 10000.0f);
                this.o = (int) (c.y * 10000.0f);
                aVar.a((int) (((float) this.n) * 1.2f), (int) (((float) this.o) * 1.2f), (int) (((float) b(10000)) * 1.2f), this.i);
            }
        }
    }

    public void a(View view, a aVar) {
        int i2;
        PointF pointF = this.j;
        int i3 = 0;
        int i4 = (pointF == null || pointF.x == 0.0f) ? 0 : this.j.x > 0.0f ? 1 : -1;
        i iVar = this.d;
        if (iVar == null || !iVar.e()) {
            i2 = 0;
        } else {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            i2 = a(iVar.k(view) - layoutParams.leftMargin, iVar.m(view) + layoutParams.rightMargin, iVar.getPaddingLeft(), iVar.v - iVar.getPaddingRight(), i4);
        }
        PointF pointF2 = this.j;
        int i5 = (pointF2 == null || pointF2.y == 0.0f) ? 0 : this.j.y > 0.0f ? 1 : -1;
        i iVar2 = this.d;
        if (iVar2 != null && iVar2.f()) {
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            i3 = a(iVar2.l(view) - layoutParams2.topMargin, iVar2.n(view) + layoutParams2.bottomMargin, iVar2.getPaddingTop(), iVar2.w - iVar2.getPaddingBottom(), i5);
        }
        int a2 = a((int) Math.sqrt((double) ((i2 * i2) + (i3 * i3))));
        if (a2 > 0) {
            aVar.a(-i2, -i3, a2, this.a);
        }
    }

    /* access modifiers changed from: protected */
    public int b(int i2) {
        float abs = (float) Math.abs(i2);
        if (!this.l) {
            this.m = a(this.k);
            this.l = true;
        }
        return (int) Math.ceil((double) (abs * this.m));
    }
}
