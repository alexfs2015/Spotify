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
    private int h = -1;
    private int x;
    /* access modifiers changed from: private */
    public int y;
    private boolean z;

    class a extends oi {
        public a(Context context) {
            super(context);
        }

        public final float a(DisplayMetrics displayMetrics) {
            return super.a(displayMetrics) * 2.0f;
        }

        public final int a(int i2, int i3, int i4, int i5, int i6) {
            return PivotListLayoutManager.this.y - i3;
        }

        public final PointF c(int i2) {
            PivotListLayoutManager.this.d;
            return i2 > RecyclerView.e(PivotListLayoutManager.this.a) ? new PointF(0.0f, 1.0f) : new PointF(0.0f, -1.0f);
        }
    }

    interface b {
        void a();

        void a(View view);
    }

    PivotListLayoutManager(b bVar) {
        this.c = bVar;
    }

    private boolean a(int i) {
        return i >= 0 && i < t() && this.z;
    }

    private void b(int i) {
        if (!l()) {
            this.h = this.B;
            int k = i - (k() / 2);
            if (k <= 0) {
                k += t();
            }
            this.A = k;
            return;
        }
        this.h = this.y - ((i + 1) * this.x);
    }

    private void d(o oVar) {
        a(oVar);
        e(oVar);
        int i = this.h;
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

    private static void f(o oVar) {
        for (u uVar : ImmutableList.a((Collection<? extends E>) oVar.d)) {
            oVar.a(uVar.o);
        }
    }

    private void g() {
        int i = this.b;
        if (i != -1) {
            b(i);
        }
    }

    private int h() {
        return this.h + (t() * this.x);
    }

    private void j() {
        this.d.getHitRect(this.e);
        this.y = (this.e.height() + this.x) / 2;
        this.h = this.y - ((t() - 2) * this.x);
        int t = this.y - (t() * this.x);
        if (this.h < 0) {
            this.f = Optional.b(Integer.valueOf(t));
            this.h = this.y;
            while (true) {
                int i = this.h;
                if (i <= 0) {
                    break;
                }
                this.h = i - this.x;
            }
        } else {
            this.f = Optional.b(Integer.valueOf(t));
        }
        if (this.f.b()) {
            this.g = Optional.b(Integer.valueOf(this.y + ((t() - 1) * this.x)));
        }
        this.B = this.h;
    }

    private int k() {
        return !l() ? (int) Math.ceil((double) (((float) (this.e.height() + Math.abs(this.h))) / ((float) this.x))) : (h() - this.h) / this.x;
    }

    private boolean l() {
        return this.f.b() || this.g.b();
    }

    private void s(View view) {
        if (this.a != view) {
            this.c.a(view);
        }
        this.a = view;
    }

    public final LayoutParams a() {
        return new LayoutParams(-2, -2);
    }

    public final void a(RecyclerView recyclerView, o oVar) {
        super.a(recyclerView, oVar);
        c(oVar);
        oVar.a();
    }

    public final void a(RecyclerView recyclerView, s sVar, int i) {
        if (a(i)) {
            a aVar = this.C;
            aVar.b = i;
            a((r) aVar);
        }
    }

    public final int b(int i, o oVar, s sVar) {
        if (sVar.p == 0) {
            i = (int) ((float) i);
        }
        if (i > 0 && this.f.b() && this.h - i <= ((Integer) this.f.c()).intValue()) {
            int intValue = this.h - ((Integer) this.f.c()).intValue();
            this.h = ((Integer) this.f.c()).intValue();
            d(oVar);
            return -intValue;
        }
        if (i < 0 && this.g.b() && h() - i > ((Integer) this.g.c()).intValue()) {
            int h2 = h() - ((Integer) this.g.c()).intValue();
            this.h -= h2;
            d(oVar);
            return -h2;
        }
        this.h -= i;
        if (l()) {
            d(oVar);
            return i;
        } else if (r() == 0) {
            return i;
        } else {
            int c2 = c((View) fbp.a(g(0)));
            while (true) {
                int i2 = this.h;
                if (i2 <= 0) {
                    break;
                }
                this.h = i2 - this.x;
                c2--;
                if (c2 == -1) {
                    c2 = t() - 1;
                }
            }
            while (true) {
                int i3 = this.h;
                int i4 = this.x;
                if (i3 <= (-i4)) {
                    this.h = i3 + i4;
                    c2++;
                } else {
                    this.A = c2;
                    d(oVar);
                    return i;
                }
            }
        }
    }

    public final void c(o oVar, s sVar) {
        a(oVar);
        if (t() != 0) {
            this.A = 0;
            this.h = -1;
            this.f = Optional.e();
            this.g = Optional.e();
            this.z = false;
            d(oVar);
            if (!sVar.g) {
                this.c.a();
            }
        }
    }

    public final void d(RecyclerView recyclerView) {
        super.d(recyclerView);
        this.d = recyclerView;
        this.e = new Rect();
        this.C = new a(recyclerView.getContext());
    }

    public final void e(int i) {
        if (a(i)) {
            b(i);
            o_();
        }
    }

    public final boolean f() {
        return r() > 1;
    }
}
