package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.List;

@cey
/* renamed from: dty reason: default package */
public final class dty extends dwv implements dug {
    private String a;
    private List<dtq> b;
    private String c;
    private dva d;
    private String e;
    private String f;
    private double g;
    private String h;
    private String i;
    private dtm j;
    private dqz k;
    private View l;
    private car m;
    private String n;
    private Bundle o;
    private Object p = new Object();
    /* access modifiers changed from: private */
    public duc q;

    public dty(String str, List<dtq> list, String str2, dva dva, String str3, String str4, double d2, String str5, String str6, dtm dtm, dqz dqz, View view, car car, String str7, Bundle bundle) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = dva;
        this.e = str3;
        this.f = str4;
        this.g = d2;
        this.h = str5;
        this.i = str6;
        this.j = dtm;
        this.k = dqz;
        this.l = view;
        this.m = car;
        this.n = str7;
        this.o = bundle;
    }

    public final String a() {
        return this.a;
    }

    public final void a(Bundle bundle) {
        synchronized (this.p) {
            if (this.q == null) {
                clu.a("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.q.b(bundle);
            }
        }
    }

    public final void a(duc duc) {
        synchronized (this.p) {
            this.q = duc;
        }
    }

    public final void a(dws dws) {
        this.q.a(dws);
    }

    public final List b() {
        return this.b;
    }

    public final boolean b(Bundle bundle) {
        synchronized (this.p) {
            if (this.q == null) {
                clu.a("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            boolean a2 = this.q.a(bundle);
            return a2;
        }
    }

    public final String c() {
        return this.c;
    }

    public final void c(Bundle bundle) {
        synchronized (this.p) {
            if (this.q == null) {
                clu.a("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.q.c(bundle);
            }
        }
    }

    public final dva d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final String f() {
        return this.f;
    }

    public final double g() {
        return this.g;
    }

    public final String h() {
        return this.h;
    }

    public final String i() {
        return this.i;
    }

    public final dqz j() {
        return this.k;
    }

    public final String k() {
        return "6";
    }

    public final String l() {
        return "";
    }

    public final dtm m() {
        return this.j;
    }

    public final car n() {
        return cas.a(this.q);
    }

    public final View o() {
        return this.l;
    }

    public final car p() {
        return this.m;
    }

    public final String q() {
        return this.n;
    }

    public final Bundle r() {
        return this.o;
    }

    public final duw s() {
        return this.j;
    }

    public final void t() {
        cmd.a.post(new dtz(this));
    }

    public final void u() {
        this.q.c();
    }
}
