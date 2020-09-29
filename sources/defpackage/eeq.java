package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

@cfp
/* renamed from: eeq reason: default package */
public final class eeq extends eea {
    private final bln a;

    public eeq(bln bln) {
        this.a = bln;
    }

    public final String a() {
        return this.a.a;
    }

    public final void a(cbi cbi) {
        cbj.a(cbi);
    }

    public final void a(cbi cbi, cbi cbi2, cbi cbi3) {
        cbj.a(cbi2);
        cbj.a(cbi3);
        this.a.a((View) cbj.a(cbi));
    }

    public final List b() {
        List<b> list = this.a.b;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (b bVar : list) {
                arrayList.add(new duh(bVar.a(), bVar.b(), bVar.c()));
            }
        }
        return arrayList;
    }

    public final void b(cbi cbi) {
        cbj.a(cbi);
    }

    public final String c() {
        return this.a.c;
    }

    public final dvr d() {
        b bVar = this.a.d;
        if (bVar != null) {
            return new duh(bVar.a(), bVar.b(), bVar.c());
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

    public final drq j() {
        if (this.a.j != null) {
            return this.a.j.a();
        }
        return null;
    }

    public final dvn k() {
        return null;
    }

    public final cbi l() {
        bln bln = this.a;
        return null;
    }

    public final cbi m() {
        bln bln = this.a;
        return null;
    }

    public final cbi n() {
        Object obj = this.a.k;
        if (obj == null) {
            return null;
        }
        return cbj.a(obj);
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

    public final void r() {
    }
}
