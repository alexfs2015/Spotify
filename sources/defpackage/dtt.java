package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.List;

@cey
/* renamed from: dtt reason: default package */
public final class dtt extends dvt implements dug {
    public dtm a;
    public View b;
    private String c;
    private List<dtq> d;
    private String e;
    private dva f;
    private String g;
    private String h;
    private Bundle i;
    private dqz j;
    private car k;
    private String l;
    private Object m = new Object();
    /* access modifiers changed from: private */
    public duc n;

    public dtt(String str, List<dtq> list, String str2, dva dva, String str3, String str4, dtm dtm, Bundle bundle, dqz dqz, View view, car car, String str5) {
        this.c = str;
        this.d = list;
        this.e = str2;
        this.f = dva;
        this.g = str3;
        this.h = str4;
        this.a = dtm;
        this.i = bundle;
        this.j = dqz;
        this.b = view;
        this.k = car;
        this.l = str5;
    }

    public final String a() {
        return this.c;
    }

    public final void a(Bundle bundle) {
        synchronized (this.m) {
            if (this.n == null) {
                clu.a("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.n.b(bundle);
            }
        }
    }

    public final void a(duc duc) {
        synchronized (this.m) {
            this.n = duc;
        }
    }

    public final List b() {
        return this.d;
    }

    public final boolean b(Bundle bundle) {
        synchronized (this.m) {
            if (this.n == null) {
                clu.a("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            boolean a2 = this.n.a(bundle);
            return a2;
        }
    }

    public final car c() {
        return this.k;
    }

    public final void c(Bundle bundle) {
        synchronized (this.m) {
            if (this.n == null) {
                clu.a("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.n.c(bundle);
            }
        }
    }

    public final String d() {
        return this.l;
    }

    public final String e() {
        return this.e;
    }

    public final dva f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final String h() {
        return this.h;
    }

    public final dqz i() {
        return this.j;
    }

    public final car j() {
        return cas.a(this.n);
    }

    public final String k() {
        return "1";
    }

    public final String l() {
        return "";
    }

    public final dtm m() {
        return this.a;
    }

    public final Bundle n() {
        return this.i;
    }

    public final View o() {
        return this.b;
    }

    public final duw p() {
        return this.a;
    }

    public final void q() {
        cmd.a.post(new dtu(this));
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.a = null;
        this.i = null;
        this.m = null;
        this.j = null;
        this.b = null;
    }
}
