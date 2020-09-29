package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.List;

@cey
/* renamed from: dtr reason: default package */
public final class dtr extends dvp implements dug {
    public dtm a;
    public View b;
    private String c;
    private List<dtq> d;
    private String e;
    private dva f;
    private String g;
    private double h;
    private String i;
    private String j;
    private Bundle k;
    private dqz l;
    private car m;
    private String n;
    private Object o = new Object();
    /* access modifiers changed from: private */
    public duc p;

    public dtr(String str, List<dtq> list, String str2, dva dva, String str3, double d2, String str4, String str5, dtm dtm, Bundle bundle, dqz dqz, View view, car car, String str6) {
        this.c = str;
        this.d = list;
        this.e = str2;
        this.f = dva;
        this.g = str3;
        this.h = d2;
        this.i = str4;
        this.j = str5;
        this.a = dtm;
        this.k = bundle;
        this.l = dqz;
        this.b = view;
        this.m = car;
        this.n = str6;
    }

    public final String a() {
        return this.c;
    }

    public final void a(Bundle bundle) {
        synchronized (this.o) {
            if (this.p == null) {
                clu.a("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.p.b(bundle);
            }
        }
    }

    public final void a(duc duc) {
        synchronized (this.o) {
            this.p = duc;
        }
    }

    public final List b() {
        return this.d;
    }

    public final boolean b(Bundle bundle) {
        synchronized (this.o) {
            if (this.p == null) {
                clu.a("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            boolean a2 = this.p.a(bundle);
            return a2;
        }
    }

    public final String c() {
        return this.e;
    }

    public final void c(Bundle bundle) {
        synchronized (this.o) {
            if (this.p == null) {
                clu.a("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.p.c(bundle);
            }
        }
    }

    public final dva d() {
        return this.f;
    }

    public final String e() {
        return this.g;
    }

    public final double f() {
        return this.h;
    }

    public final String g() {
        return this.i;
    }

    public final String h() {
        return this.j;
    }

    public final dqz i() {
        return this.l;
    }

    public final car j() {
        return cas.a(this.p);
    }

    public final String k() {
        return "2";
    }

    public final String l() {
        return "";
    }

    public final dtm m() {
        return this.a;
    }

    public final Bundle n() {
        return this.k;
    }

    public final View o() {
        return this.b;
    }

    public final car p() {
        return this.m;
    }

    public final String q() {
        return this.n;
    }

    public final duw r() {
        return this.a;
    }

    public final void s() {
        cmd.a.post(new dts(this));
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = 0.0d;
        this.i = null;
        this.j = null;
        this.a = null;
        this.k = null;
        this.o = null;
        this.l = null;
        this.b = null;
    }
}
