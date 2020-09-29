package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

@cey
/* renamed from: edp reason: default package */
public final class edp extends edd {
    private final bks a;

    public edp(bks bks) {
        this.a = bks;
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

    public final void i() {
    }

    public final boolean j() {
        return this.a.a();
    }

    public final boolean k() {
        return this.a.b();
    }

    public final Bundle l() {
        return this.a.c();
    }

    public final car n() {
        bks bks = this.a;
        return null;
    }

    public final duw o() {
        return null;
    }

    public final car p() {
        bks bks = this.a;
        return null;
    }

    public final car q() {
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

    public final double f() {
        return this.a.g;
    }

    public final String g() {
        return this.a.h;
    }

    public final String h() {
        return this.a.i;
    }

    public final dqz m() {
        if (this.a.a != null) {
            return this.a.a.a();
        }
        return null;
    }
}
