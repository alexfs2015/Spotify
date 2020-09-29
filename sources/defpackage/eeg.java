package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

@cfp
/* renamed from: eeg reason: default package */
public final class eeg extends edu {
    private final blj a;

    public eeg(blj blj) {
        this.a = blj;
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

    public final double f() {
        return this.a.g;
    }

    public final String g() {
        return this.a.h;
    }

    public final String h() {
        return this.a.i;
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

    public final drq m() {
        if (this.a.a != null) {
            return this.a.a.a();
        }
        return null;
    }

    public final cbi n() {
        blj blj = this.a;
        return null;
    }

    public final dvn o() {
        return null;
    }

    public final cbi p() {
        blj blj = this.a;
        return null;
    }

    public final cbi q() {
        return null;
    }
}
