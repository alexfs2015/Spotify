package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: bjl reason: default package */
final class bjl implements Callable<duw> {
    private final /* synthetic */ int a;
    private final /* synthetic */ JSONArray b;
    private final /* synthetic */ int c;
    private final /* synthetic */ clr d;
    private final /* synthetic */ bjj e;

    bjl(bjj bjj, int i, JSONArray jSONArray, int i2, clr clr) {
        this.e = bjj;
        this.a = i;
        this.b = jSONArray;
        this.c = i2;
        this.d = clr;
    }

    public final /* synthetic */ Object call() {
        if (this.a >= this.b.length()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.b.get(this.a));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ads", jSONArray);
        bjj bjj = new bjj(this.e.e.c, this.e.i, this.e.e.i, this.e.e.b, this.e.o, this.e.e.e, true);
        bjj.a(this.e.e, bjj.e);
        bjj.z_();
        bjj.a(this.e.b);
        dtt dtt = bjj.a;
        int i = this.a;
        dtt.a("num_ads_requested", String.valueOf(this.c));
        dtt.a("ad_index", String.valueOf(i));
        cgl cgl = this.d.a;
        Bundle bundle = cgl.c.c != null ? new Bundle(cgl.c.c) : new Bundle();
        bundle.putString("_ad", jSONObject.toString());
        dpp dpp = r5;
        dpp dpp2 = new dpp(cgl.c.a, cgl.c.b, bundle, cgl.c.d, cgl.c.e, cgl.c.f, cgl.c.g, cgl.c.h, cgl.c.i, cgl.c.j, cgl.c.k, cgl.c.l, cgl.c.m, cgl.c.n, cgl.c.o, cgl.c.p, cgl.c.q, cgl.c.r);
        cgm cgm = new cgm(cgl.b, dpp, cgl.d, cgl.e, cgl.f, cgl.g, cgl.i, cgl.j, cgl.k, cgl.l, cgl.n, cgl.z, cgl.o, cgl.p, cgl.q, cgl.r, cgl.s, cgl.t, cgl.u, cgl.v, cgl.w, cgl.x, cgl.y, cgl.B, cgl.C, cgl.I, cgl.D, cgl.E, cgl.F, cgl.G, cpx.a(cgl.H), cgl.J, cgl.K, cgl.L, cgl.M, cgl.N, cgl.O, cgl.P, cgl.Q, cgl.U, cpx.a(cgl.h), cgl.V, cgl.W, cgl.X, 1, cgl.Z, cgl.aa, cgl.ab, cgl.ac);
        bjj.a(cgm, bjj.a);
        return (duw) bjj.j.get();
    }
}
