package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

@cey
/* renamed from: edq reason: default package */
public final class edq extends edg {
    private final bkt a;

    public edq(bkt bkt) {
        this.a = bkt;
    }

    public final void a(car car) {
        cas.a(car);
    }

    public final void a(car car, car car2, car car3) {
        cas.a(car2);
        cas.a(car3);
        cas.a(car);
    }

    public final void b(car car) {
        this.a.a((View) cas.a(car));
    }

    public final void c(car car) {
        cas.a(car);
    }

    public final void g() {
    }

    public final boolean h() {
        return this.a.a();
    }

    public final boolean i() {
        return this.a.b();
    }

    public final Bundle j() {
        return this.a.c();
    }

    public final car k() {
        bkt bkt = this.a;
        return null;
    }

    public final duw m() {
        return null;
    }

    public final car n() {
        bkt bkt = this.a;
        return null;
    }

    public final car o() {
        return null;
    }

    public final String a() {
        return this.a.b;
    }

    public final List b() {
        List<b> list = this.a.c;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar : list) {
            arrayList.add(new dtq(bVar.a(), bVar.b(), bVar.c()));
        }
        return arrayList;
    }

    public final String c() {
        return this.a.d;
    }

    public final dva d() {
        b bVar = this.a.e;
        if (bVar != null) {
            return new dtq(bVar.a(), bVar.b(), bVar.c());
        }
        return null;
    }

    public final String e() {
        return this.a.f;
    }

    public final String f() {
        return this.a.g;
    }

    public final dqz l() {
        if (this.a.a != null) {
            return this.a.a.a();
        }
        return null;
    }
}
