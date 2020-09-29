package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bel reason: default package */
public final class bel {
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public int e;
    public int f;
    public int g;
    public int h;
    int i;
    float j;
    float k;
    public int l;
    int m;
    List<Integer> n = new ArrayList();
    public int o;
    public int p;

    bel() {
    }

    public final int a() {
        return this.h - this.i;
    }

    public final void a(View view, int i2, int i3, int i4, int i5) {
        bek bek = (bek) view.getLayoutParams();
        this.a = Math.min(this.a, (view.getLeft() - bek.m()) - i2);
        this.b = Math.min(this.b, (view.getTop() - bek.n()) - i3);
        this.c = Math.max(this.c, view.getRight() + bek.o() + i4);
        this.d = Math.max(this.d, view.getBottom() + bek.p() + i5);
    }
}
