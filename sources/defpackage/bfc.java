package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bfc reason: default package */
public final class bfc {
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

    bfc() {
    }

    public final int a() {
        return this.h - this.i;
    }

    public final void a(View view, int i2, int i3, int i4, int i5) {
        bfb bfb = (bfb) view.getLayoutParams();
        this.a = Math.min(this.a, (view.getLeft() - bfb.m()) - i2);
        this.b = Math.min(this.b, (view.getTop() - bfb.n()) - i3);
        this.c = Math.max(this.c, view.getRight() + bfb.o() + i4);
        this.d = Math.max(this.d, view.getBottom() + bfb.p() + i5);
    }
}
