package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.List;

@cfp
/* renamed from: dup reason: default package */
public final class dup extends dxm implements dux {
    private String a;
    private List<duh> b;
    private String c;
    private dvr d;
    private String e;
    private String f;
    private double g;
    private String h;
    private String i;
    private dud j;
    private drq k;
    private View l;
    private cbi m;
    private String n;
    private Bundle o;
    private Object p = new Object();
    /* access modifiers changed from: private */
    public dut q;

    public dup(String str, List<duh> list, String str2, dvr dvr, String str3, String str4, double d2, String str5, String str6, dud dud, drq drq, View view, cbi cbi, String str7, Bundle bundle) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = dvr;
        this.e = str3;
        this.f = str4;
        this.g = d2;
        this.h = str5;
        this.i = str6;
        this.j = dud;
        this.k = drq;
        this.l = view;
        this.m = cbi;
        this.n = str7;
        this.o = bundle;
    }

    public final String a() {
        return this.a;
    }

    public final void a(Bundle bundle) {
        synchronized (this.p) {
            if (this.q == null) {
                cml.a("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.q.b(bundle);
            }
        }
    }

    public final void a(dut dut) {
        synchronized (this.p) {
            this.q = dut;
        }
    }

    public final void a(dxj dxj) {
        this.q.a(dxj);
    }

    public final List b() {
        return this.b;
    }

    public final boolean b(Bundle bundle) {
        synchronized (this.p) {
            if (this.q == null) {
                cml.a("#002 Attempt to record impression before native ad initialized.");
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
                cml.a("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.q.c(bundle);
            }
        }
    }

    public final dvr d() {
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

    public final drq j() {
        return this.k;
    }

    public final String k() {
        return "6";
    }

    public final String l() {
        return "";
    }

    public final dud m() {
        return this.j;
    }

    public final cbi n() {
        return cbj.a(this.q);
    }

    public final View o() {
        return this.l;
    }

    public final cbi p() {
        return this.m;
    }

    public final String q() {
        return this.n;
    }

    public final Bundle r() {
        return this.o;
    }

    public final dvn s() {
        return this.j;
    }

    public final void t() {
        cmu.a.post(new duq(this));
    }

    public final void u() {
        this.q.c();
    }
}
