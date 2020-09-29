package com.spotify.mobile.android.spotlets.common.recyclerview;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.o;
import androidx.recyclerview.widget.RecyclerView.s;

public class FrameLayoutManager extends i {
    public final LayoutParams a() {
        return new LayoutParams(-1, -1);
    }

    public final void c(o oVar, s sVar) {
        a(oVar);
        int t = t();
        for (int i = 0; i < t; i++) {
            View b = oVar.b(i);
            LayoutParams layoutParams = (LayoutParams) b.getLayoutParams();
            Rect h = this.i.h(b);
            int i2 = h.top + h.bottom + 0;
            int a = i.a(this.v, this.t, getPaddingLeft() + getPaddingRight() + h.left + h.right + 0, layoutParams.width, e());
            int a2 = i.a(this.w, this.u, getPaddingTop() + getPaddingBottom() + i2, layoutParams.height, f());
            if (b(b, a, a2, layoutParams)) {
                b.measure(a, a2);
            }
            a(b);
            LayoutParams layoutParams2 = (LayoutParams) b.getLayoutParams();
            int i3 = this.w;
            int i4 = this.v;
            int paddingTop = getPaddingTop();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingBottom = getPaddingBottom();
            int j = (((i3 - paddingTop) - paddingBottom) - j(b)) / 2;
            int i5 = (((i4 - paddingLeft) - paddingRight) - i(b)) / 2;
            a(b, paddingLeft + i5 + layoutParams2.leftMargin, paddingTop + j + layoutParams2.topMargin, ((i4 - paddingRight) - layoutParams2.rightMargin) - i5, ((i3 - paddingBottom) - layoutParams2.bottomMargin) - j);
        }
    }

    public final void e(int i) {
    }
}
