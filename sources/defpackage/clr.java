package defpackage;

import org.json.JSONObject;

@cfp
/* renamed from: clr reason: default package */
public final class clr {
    public final cgl a;
    public final cgp b;
    public final ecq c;
    public final dpt d;
    public final int e;
    public final long f;
    public final long g;
    public final JSONObject h;
    public final dny i;
    public final boolean j;

    public clr(cgl cgl, cgp cgp, int i2, long j2, long j3, doc doc) {
        this.a = cgl;
        this.b = cgp;
        this.c = null;
        this.d = null;
        this.e = i2;
        this.f = j2;
        this.g = j3;
        this.h = null;
        this.i = new dny(doc);
        this.j = false;
    }

    public clr(cgl cgl, cgp cgp, ecq ecq, dpt dpt, int i2, long j2, long j3, JSONObject jSONObject, dny dny, Boolean bool) {
        this.a = cgl;
        this.b = cgp;
        this.c = ecq;
        this.d = dpt;
        this.e = i2;
        this.f = j2;
        this.g = j3;
        this.h = jSONObject;
        this.i = dny;
        boolean z = bool != null ? bool.booleanValue() : cov.a(cgl.c);
        this.j = z;
    }
}
