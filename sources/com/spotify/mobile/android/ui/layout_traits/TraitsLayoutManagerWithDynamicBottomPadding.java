package com.spotify.mobile.android.ui.layout_traits;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.o;
import androidx.recyclerview.widget.RecyclerView.r;
import androidx.recyclerview.widget.RecyclerView.s;
import com.spotify.android.glue.patterns.prettylist.StickyRecyclerView.a;

public class TraitsLayoutManagerWithDynamicBottomPadding extends TraitsLayoutManager implements a {
    private boolean A;
    private int y;
    private int z;

    public final void a(int i) {
        this.z = i;
        o_();
    }

    public final void a(RecyclerView recyclerView, s sVar, int i) {
        a((r) null);
    }

    public final int b(int i, o oVar, s sVar) {
        boolean z2 = true;
        View view = (View) fbp.a(g(r() - 1));
        boolean z3 = ((LayoutParams) view.getLayoutParams()).c.e() == t() - 1;
        View view2 = (View) fbp.a(g(0));
        if (((LayoutParams) view2.getLayoutParams()).c.e() == 0) {
            if (view2.getTop() >= 0) {
                z2 = false;
            }
        }
        return (!z3 || i <= 0 || !z2) ? super.b(i, oVar, sVar) : super.b(Math.max(0, Math.min(i, n(view) - this.w)), oVar, sVar);
    }

    public final void c(o oVar, s sVar) {
        super.c(oVar, sVar);
        int r = r();
        int i = 0;
        for (int i2 = 0; i2 < r; i2++) {
            View g = g(i2);
            if (g != null) {
                i += g.getMeasuredHeight();
            }
        }
        if (this.y != i) {
            this.y = i;
            super.c(oVar, sVar);
        }
    }

    public int getPaddingBottom() {
        if (this.A || this.z == 0) {
            return super.getPaddingBottom();
        }
        int i = (this.w - this.y) - this.z;
        if (i > 0) {
            return i;
        }
        return 0;
    }

    public final int l() {
        this.A = true;
        int l = super.l();
        this.A = false;
        return l;
    }

    public final int m() {
        this.A = true;
        int m = super.m();
        this.A = false;
        return m;
    }
}
