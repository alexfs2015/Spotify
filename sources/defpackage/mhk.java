package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: mhk reason: default package */
public final class mhk extends grv {
    public final mgm f;
    final mgq g;
    public final mgg h;
    final mgi i;
    public final uay j;
    public boolean k;
    private final mgo l;
    private final uba m;
    private final mgk n;

    public mhk(mgo mgo, uba uba, mgm mgm, mgq mgq, mgg mgg, mgk mgk, mgi mgi, uay uay) {
        this.l = mgo;
        this.m = uba;
        this.f = mgm;
        this.g = mgq;
        this.h = mgg;
        this.n = mgk;
        this.i = mgi;
        this.j = uay;
    }

    public final void h(int i2) {
        this.l.a = i2;
        this.m.a = i2;
    }

    public final List<gru> a() {
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

    public final void i(int i2) {
        this.a.clear();
        e();
        h(i2);
        e();
    }
}
