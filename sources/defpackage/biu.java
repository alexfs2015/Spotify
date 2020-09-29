package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: biu reason: default package */
final class biu implements Callable<duf> {
    private final /* synthetic */ int a;
    private final /* synthetic */ JSONArray b;
    private final /* synthetic */ int c;
    private final /* synthetic */ cla d;
    private final /* synthetic */ bis e;

    biu(bis bis, int i, JSONArray jSONArray, int i2, cla cla) {
        this.e = bis;
        this.a = i;
        this.b = jSONArray;
        this.c = i2;
        this.d = cla;
    }

    public final /* synthetic */ Object call() {
        if (this.a >= this.b.length()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.b.get(this.a));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ads", jSONArray);
        bis bis = new bis(this.e.e.c, this.e.i, this.e.e.i, this.e.e.b, this.e.o, this.e.e.e, true);
        bis.a(this.e.e, bis.e);
        bis.z_();
        bis.a(this.e.b);
        dtc dtc = bis.a;
        int i = this.a;
        dtc.a("num_ads_requested", String.valueOf(this.c));
        dtc.a("ad_index", String.valueOf(i));
        cfu cfu = this.d.a;
        Bundle bundle = cfu.c.c != null ? new Bundle(cfu.c.c) : new Bundle();
        bundle.putString("_ad", jSONObject.toString());
        doy doy = r5;
        doy doy2 = new doy(cfu.c.a, cfu.c.b, bundle, cfu.c.d, cfu.c.e, cfu.c.f, cfu.c.g, cfu.c.h, cfu.c.i, cfu.c.j, cfu.c.k, cfu.c.l, cfu.c.m, cfu.c.n, cfu.c.o, cfu.c.p, cfu.c.q, cfu.c.r);
        cfv cfv = new cfv(cfu.b, doy, cfu.d, cfu.e, cfu.f, cfu.g, cfu.i, cfu.j, cfu.k, cfu.l, cfu.n, cfu.z, cfu.o, cfu.p, cfu.q, cfu.r, cfu.s, cfu.t, cfu.u, cfu.v, cfu.w, cfu.x, cfu.y, cfu.B, cfu.C, cfu.I, cfu.D, cfu.E, cfu.F, cfu.G, cpg.a(cfu.H), cfu.J, cfu.K, cfu.L, cfu.M, cfu.N, cfu.O, cfu.P, cfu.Q, cfu.U, cpg.a(cfu.h), cfu.V, cfu.W, cfu.X, 1, cfu.Z, cfu.aa, cfu.ab, cfu.ac);
        bis.a(cfv, bis.a);
        return (duf) bis.j.get();
    }
}
