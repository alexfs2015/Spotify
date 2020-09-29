package com.spotify.music.nowplaying.drivingmode.view.pivot;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.o;
import androidx.recyclerview.widget.RecyclerView.r;
import androidx.recyclerview.widget.RecyclerView.s;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

public class PivotListLayoutManager extends i {
    private int A;
    private int B;
    private a C;
    /* access modifiers changed from: 0000 */
    public View a;
    int b = -1;
    private final b c;
    /* access modifiers changed from: private */
    public RecyclerView d;
    private Rect e;
    private Optional<Integer> f = Optional.e();
    private Optional<Integer> g = Optional.e();
    private int w = -1;
    private int x;
    /* access modifiers changed from: private */
    public int y;
    private boolean z;

    class a extends od {
        public a(Context context) {
            super(context);
        }

        public final PointF c(int i2) {
            PivotListLayoutManager.this.d;
            return i2 > RecyclerView.e(PivotListLayoutManager.this.a) ? new PointF(0.0f, 1.0f) : new PointF(0.0f, -1.0f);
        }

        public final int a(int i2, int i3, int i4, int i5, int i6) {
            return PivotListLayoutManager.this.y - i3;
        }

        public final float a(DisplayMetrics displayMetrics) {
            return super.a(displayMetrics) * 2.0f;
        }
    }

    interface b {
        void a();

        void a(View view);
    }

    PivotListLayoutManager(b bVar) {
        this.c = bVar;
    }

    public final LayoutParams a() {
        return new LayoutParams(-2, -2);
    }

    public final void d(RecyclerView recyclerView) {
        super.d(recyclerView);
        this.d = recyclerView;
        this.e = new Rect();
        this.C = new a(recyclerView.getContext());
    }

    public final void a(RecyclerView recyclerView, o oVar) {
        super.a(recyclerView, oVar);
        c(oVar);
        oVar.a();
    }

    public final void c(o oVar, s sVar) {
        a(oVar);
        if (t() != 0) {
            this.A = 0;
            this.w = -1;
            this.f = Optional.e();
            this.g = Optional.e();
            this.z = false;
            d(oVar);
            if (!sVar.g) {
                this.c.a();
            }
        }
    }

    private void g() {
        int i = this.b;
        if (i != -1) {
            b(i);
        }
    }

    private int h() {
        return this.w + (t() * this.x);
    }

    private void d(o oVar) {
        a(oVar);
        e(oVar);
        int i = this.w;
        int k = k();
        int i2 = i;
        int i3 = 0;
        while (i3 < k) {
            View b2 = oVar.b((this.A + i3) % t());
            a(b2);
            a_(b2, 0, 0);
            int j = j(b2) + i2;
            b(b2, getPaddingLeft(), i2, getPaddingLeft() + i(b2), j);
            if (this.e.height() / 2 > i2 && this.e.height() / 2 <= j) {
                s(b2);
            }
            i3++;
            i2 = j;
        }
        f(oVar);
    }

    private void e(o oVar) {
        if (!this.z) {
            View b2 = oVar.b(0);
            a_(b2, 0, 0);
            this.x = j(b2);
            j();
            g();
            this.z = true;
        }
    }

    private void s(View view) {
        if (this.a != view) {
            this.c.a(view);
        }
        this.a = view;
    }

    private void j() {
        this.d.getHitRect(this.e);
        this.y = (this.e.height() + this.x) / 2;
        this.w = this.y - ((t() - 2) * this.x);
        int t = this.y - (t() * this.x);
        if (this.w < 0) {
            this.f = Optional.b(Integer.valueOf(t));
            this.w = this.y;
            while (true) {
                int i = this.w;
                if (i <= 0) {
                    break;
                }
                this.w = i - this.x;
            }
        } else {
            this.f = Optional.b(Integer.valueOf(t));
        }
        if (this.f.b()) {
            this.g = Optional.b(Integer.valueOf(this.y + ((t() - 1) * this.x)));
        }
        this.B = this.w;
    }

    private int k() {
        if (!l()) {
            return (int) Math.ceil((double) (((float) (this.e.height() + Math.abs(this.w))) / ((float) this.x)));
        }
        return (h() - this.w) / this.x;
    }

    public final boolean f() {
        return r() > 1;
    }

    private boolean l() {
        return this.f.b() || this.g.b();
    }

    private boolean a(int i) {
        return i >= 0 && i < t() && this.z;
    }

    public final void e(int i) {
        if (a(i)) {
            b(i);
            o_();
        }
    }

    private void b(int i) {
        if (!l()) {
            this.w = this.B;
            int k = i - (k() / 2);
            if (k <= 0) {
                k += t();
            }
            this.A = k;
            return;
        }
        this.w = this.y - ((i + 1) * this.x);
    }

    public final void a(RecyclerView recyclerView, s sVar, int i) {
        if (a(i)) {
            a aVar = this.C;
            aVar.b = i;
            a((r) aVar);
        }
    }

    private static void f(o oVar) {
        for (u uVar : ImmutableList.a((Collection<? extends E>) oVar.d)) {
            oVar.a(uVar.o);
        }
    }

    public final int b(int i, o oVar, s sVar) {
        if (sVar.p == 0) {
            i = (int) ((float) i);
        }
        if (i > 0 && this.f.b() && this.w - i <= ((Integer) this.f.c()).intValue()) {
            int intValue = this.w - ((Integer) this.f.c()).intValue();
            this.w = ((Integer) this.f.c()).intValue();
            d(oVar);
            return -intValue;
        }
        if (i < 0 && this.g.b() && h() - i > ((Integer) this.g.c()).intValue()) {
            int h = h() - ((Integer) this.g.c()).intValue();
            this.w -= h;
            d(oVar);
            return -h;
        }
        this.w -= i;
        if (l()) {
            d(oVar);
            return i;
        } else if (r() == 0) {
            return i;
        } else {
            int c2 = c((View) fay.a(g(0)));
            while (true) {
                int i2 = this.w;
                if (i2 <= 0) {
                    break;
                }
                this.w = i2 - this.x;
                c2--;
                if (c2 == -1) {
                    c2 = t() - 1;
                }
            }
            while (true) {
                int i3 = this.w;
                int i4 = this.x;
                if (i3 <= (-i4)) {
                    this.w = i3 + i4;
                    c2++;
                } else {
                    this.A = c2;
                    d(oVar);
                    return i;
                }
            }
        }
    }
}
