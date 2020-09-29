package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.List;

@cfp
/* renamed from: duk reason: default package */
public final class duk extends dwk implements dux {
    public dud a;
    public View b;
    private String c;
    private List<duh> d;
    private String e;
    private dvr f;
    private String g;
    private String h;
    private Bundle i;
    private drq j;
    private cbi k;
    private String l;
    private Object m = new Object();
    /* access modifiers changed from: private */
    public dut n;

    public duk(String str, List<duh> list, String str2, dvr dvr, String str3, String str4, dud dud, Bundle bundle, drq drq, View view, cbi cbi, String str5) {
        this.c = str;
        this.d = list;
        this.e = str2;
        this.f = dvr;
        this.g = str3;
        this.h = str4;
        this.a = dud;
        this.i = bundle;
        this.j = drq;
        this.b = view;
        this.k = cbi;
        this.l = str5;
    }

    public final String a() {
        return this.c;
    }

    public final void a(Bundle bundle) {
        synchronized (this.m) {
            if (this.n == null) {
                cml.a("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.n.b(bundle);
            }
        }
    }

    public final void a(dut dut) {
        synchronized (this.m) {
            this.n = dut;
        }
    }

    public final List b() {
        return this.d;
    }

    public final boolean b(Bundle bundle) {
        synchronized (this.m) {
            if (this.n == null) {
                cml.a("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            boolean a2 = this.n.a(bundle);
            return a2;
        }
    }

    public final cbi c() {
        return this.k;
    }

    public final void c(Bundle bundle) {
        synchronized (this.m) {
            if (this.n == null) {
                cml.a("#003 Attempt to report touch event before native ad initialized.");
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

    public final dvr f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final String h() {
        return this.h;
    }

    public final drq i() {
        return this.j;
    }

    public final cbi j() {
        return cbj.a(this.n);
    }

    public final String k() {
        return "1";
    }

    public final String l() {
        return "";
    }

    public final dud m() {
        return this.a;
    }

    public final Bundle n() {
        return this.i;
    }

    public final View o() {
        return this.b;
    }

    public final dvn p() {
        return this.a;
    }

    public final void q() {
        cmu.a.post(new dul(this));
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
