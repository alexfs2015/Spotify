package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: mly reason: default package */
public final class mly extends gtx {
    public final mla f;
    final mle g;
    public final mku h;
    final mkw i;
    public final unt j;
    public boolean k;
    private final mlc l;
    private final unv m;
    private final mky n;

    public mly(mlc mlc, unv unv, mla mla, mle mle, mku mku, mky mky, mkw mkw, unt unt) {
        this.l = mlc;
        this.m = unv;
        this.f = mla;
        this.g = mle;
        this.h = mku;
        this.n = mky;
        this.i = mkw;
        this.j = unt;
    }

    public final List<gtw> a() {
        ArrayList arrayList = new ArrayList(8);
        if (!this.k) {
            arrayList.add(this.l);
        } else {
            arrayList.add(this.m);
        }
        arrayList.add(this.f);
        arrayList.add(this.g);
        arrayList.add(this.h);
        if (this.k) {
            arrayList.add(this.j);
        }
        arrayList.add(this.n);
        arrayList.add(this.i);
        return arrayList;
    }

    public final void h(int i2) {
        this.l.a = i2;
        this.m.a = i2;
    }

    public final void i(int i2) {
        this.a.clear();
        e();
        h(i2);
        e();
    }
}
