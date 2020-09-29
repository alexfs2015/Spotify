package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

@cey
/* renamed from: edz reason: default package */
public final class edz extends edj {
    private final bkw a;

    public edz(bkw bkw) {
        this.a = bkw;
    }

    public final void a(car car) {
        cas.a(car);
    }

    public final void a(car car, car car2, car car3) {
        cas.a(car2);
        cas.a(car3);
        this.a.a((View) cas.a(car));
    }

    public final void b(car car) {
        cas.a(car);
    }

    public final duw k() {
        return null;
    }

    public final car l() {
        bkw bkw = this.a;
        return null;
    }

    public final car m() {
        bkw bkw = this.a;
        return null;
    }

    public final void r() {
    }

    public final String a() {
        return this.a.a;
    }

    public final List b() {
        List<b> list = this.a.b;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (b bVar : list) {
                arrayList.add(new dtq(bVar.a(), bVar.b(), bVar.c()));
            }
        }
        return arrayList;
    }

    public final String c() {
        return this.a.c;
    }

    public final dva d() {
        b bVar = this.a.d;
        if (bVar != null) {
            return new dtq(bVar.a(), bVar.b(), bVar.c());
        }
        return null;
    }

    public final String e() {
        return this.a.e;
    }

    public final String f() {
        return this.a.f;
    }

    public final double g() {
        if (this.a.g != null) {
            return this.a.g.doubleValue();
        }
        return -1.0d;
    }

    public final String h() {
        return this.a.h;
    }

    public final String i() {
        return this.a.i;
    }

    public final dqz j() {
        if (this.a.j != null) {
            return this.a.j.a();
        }
        return null;
    }

    public final car n() {
        Object obj = this.a.k;
        if (obj == null) {
            return null;
        }
        return cas.a(obj);
    }

    public final Bundle o() {
        return this.a.l;
    }

    public final boolean p() {
        return this.a.m;
    }

    public final boolean q() {
        return this.a.n;
    }
}
