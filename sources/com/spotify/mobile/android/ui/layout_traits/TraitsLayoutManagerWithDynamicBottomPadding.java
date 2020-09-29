package com.spotify.mobile.android.ui.layout_traits;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.o;
import androidx.recyclerview.widget.RecyclerView.r;
import androidx.recyclerview.widget.RecyclerView.s;
import com.spotify.android.glue.patterns.prettylist.StickyRecyclerView.a;

public class TraitsLayoutManagerWithDynamicBottomPadding extends TraitsLayoutManager implements a {
    private int x;
    private int y;
    private boolean z;

    public final void a(int i) {
        this.y = i;
        o_();
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
        if (this.x != i) {
            this.x = i;
            super.c(oVar, sVar);
        }
    }

    public final int b(int i, o oVar, s sVar) {
        boolean z2 = true;
        View view = (View) fay.a(g(r() - 1));
        boolean z3 = ((LayoutParams) view.getLayoutParams()).c.e() == t() - 1;
        View view2 = (View) fay.a(g(0));
        if (((LayoutParams) view2.getLayoutParams()).c.e() == 0 && view2.getTop() >= 0) {
            z2 = false;
        }
        if (!z3 || i <= 0 || !z2) {
            return super.b(i, oVar, sVar);
        }
        return super.b(Math.max(0, Math.min(i, n(view) - this.v)), oVar, sVar);
    }

    public int getPaddingBottom() {
        if (this.z || this.y == 0) {
            return super.getPaddingBottom();
        }
        int i = (this.v - this.x) - this.y;
        if (i > 0) {
            return i;
        }
        return 0;
    }

    public final int m() {
        this.z = true;
        int m = super.m();
        this.z = false;
        return m;
    }

    public final int l() {
        this.z = true;
        int l = super.l();
        this.z = false;
        return l;
    }

    public final void a(RecyclerView recyclerView, s sVar, int i) {
        a((r) null);
    }
}
