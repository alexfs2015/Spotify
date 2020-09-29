package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

@cfp
/* renamed from: eeh reason: default package */
public final class eeh extends edx {
    private final blk a;

    public eeh(blk blk) {
        this.a = blk;
    }

    public final String a() {
        return this.a.b;
    }

    public final void a(cbi cbi) {
        cbj.a(cbi);
    }

    public final void a(cbi cbi, cbi cbi2, cbi cbi3) {
        cbj.a(cbi2);
        cbj.a(cbi3);
        cbj.a(cbi);
    }

    public final List b() {
        List<b> list = this.a.c;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar : list) {
            arrayList.add(new duh(bVar.a(), bVar.b(), bVar.c()));
        }
        return arrayList;
    }

    public final void b(cbi cbi) {
        this.a.a((View) cbj.a(cbi));
    }

    public final String c() {
        return this.a.d;
    }

    public final void c(cbi cbi) {
        cbj.a(cbi);
    }

    public final dvr d() {
        b bVar = this.a.e;
        if (bVar != null) {
            return new duh(bVar.a(), bVar.b(), bVar.c());
        }
        return null;
    }

    public final String e() {
        return this.a.f;
    }

    public final String f() {
        return this.a.g;
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

    public final cbi k() {
        blk blk = this.a;
        return null;
    }

    public final drq l() {
        if (this.a.a != null) {
            return this.a.a.a();
        }
        return null;
    }

    public final dvn m() {
        return null;
    }

    public final cbi n() {
        blk blk = this.a;
        return null;
    }

    public final cbi o() {
        return null;
    }
}
