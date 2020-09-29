package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.List;

@cfp
/* renamed from: dui reason: default package */
public final class dui extends dwg implements dux {
    public dud a;
    public View b;
    private String c;
    private List<duh> d;
    private String e;
    private dvr f;
    private String g;
    private double h;
    private String i;
    private String j;
    private Bundle k;
    private drq l;
    private cbi m;
    private String n;
    private Object o = new Object();
    /* access modifiers changed from: private */
    public dut p;

    public dui(String str, List<duh> list, String str2, dvr dvr, String str3, double d2, String str4, String str5, dud dud, Bundle bundle, drq drq, View view, cbi cbi, String str6) {
        this.c = str;
        this.d = list;
        this.e = str2;
        this.f = dvr;
        this.g = str3;
        this.h = d2;
        this.i = str4;
        this.j = str5;
        this.a = dud;
        this.k = bundle;
        this.l = drq;
        this.b = view;
        this.m = cbi;
        this.n = str6;
    }

    public final String a() {
        return this.c;
    }

    public final void a(Bundle bundle) {
        synchronized (this.o) {
            if (this.p == null) {
                cml.a("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.p.b(bundle);
            }
        }
    }

    public final void a(dut dut) {
        synchronized (this.o) {
            this.p = dut;
        }
    }

    public final List b() {
        return this.d;
    }

    public final boolean b(Bundle bundle) {
        synchronized (this.o) {
            if (this.p == null) {
                cml.a("#002 Attempt to record impression before native ad initialized.");
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
                cml.a("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.p.c(bundle);
            }
        }
    }

    public final dvr d() {
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

    public final drq i() {
        return this.l;
    }

    public final cbi j() {
        return cbj.a(this.p);
    }

    public final String k() {
        return "2";
    }

    public final String l() {
        return "";
    }

    public final dud m() {
        return this.a;
    }

    public final Bundle n() {
        return this.k;
    }

    public final View o() {
        return this.b;
    }

    public final cbi p() {
        return this.m;
    }

    public final String q() {
        return this.n;
    }

    public final dvn r() {
        return this.a;
    }

    public final void s() {
        cmu.a.post(new duj(this));
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
