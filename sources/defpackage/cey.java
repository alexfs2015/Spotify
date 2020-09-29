package defpackage;

import android.content.Context;
import org.json.JSONObject;

@cfp
/* renamed from: cey reason: default package */
public final class cey implements ceu<cti> {
    final bga a = new bga(this.c);
    final duz b;
    final Context c;
    final bjj d;
    String e;
    private cqi<cti> f;
    private final cpp g;
    private final dio h;

    public cey(Context context, bjj bjj, String str, dio dio, cpp cpp) {
        cpn.a(4);
        this.c = context;
        this.d = bjj;
        this.h = dio;
        this.g = cpp;
        this.e = str;
        bkc.f();
        Context context2 = this.c;
        cpp cpp2 = this.g;
        String str2 = (String) dqe.f().a(dtg.bV);
        dio dio2 = this.h;
        bkz i = this.d.i();
        cqh a2 = cpx.a(null);
        ctq ctq = new ctq(context2, dio2, cpp2, i, str2);
        cqi a3 = cpx.a((cqi<A>) a2, (cps<? super A, ? extends B>) ctq, cqo.a);
        this.b = new duz(bjj, str);
        this.f = cpx.a(a3, (cps<? super A, ? extends B>) new cez<Object,Object>(this), cqo.b);
        cpv.a(this.f, "WebViewNativeAdsUtil.constructor");
    }

    public final cqi<JSONObject> a(JSONObject jSONObject) {
        return cpx.a(this.f, (cps<? super A, ? extends B>) new cfa<Object,Object>(this, jSONObject), cqo.a);
    }

    public final void a() {
        cpx.a(this.f, (cpu<V>) new cfi<V>(), cqo.a);
    }

    public final void a(String str, bhc<? super cti> bhc) {
        cpx.a(this.f, (cpu<V>) new cff<V>(str, bhc), cqo.a);
    }

    public final void a(String str, JSONObject jSONObject) {
        cpx.a(this.f, (cpu<V>) new cfh<V>(str, jSONObject), cqo.a);
    }

    public final cqi<JSONObject> b(JSONObject jSONObject) {
        return cpx.a(this.f, (cps<? super A, ? extends B>) new cfb<Object,Object>(this, jSONObject), cqo.a);
    }

    public final void b(String str, bhc<? super cti> bhc) {
        cpx.a(this.f, (cpu<V>) new cfg<V>(str, bhc), cqo.a);
    }

    public final cqi<JSONObject> c(JSONObject jSONObject) {
        return cpx.a(this.f, (cps<? super A, ? extends B>) new cfc<Object,Object>(this, jSONObject), cqo.a);
    }

    public final cqi<JSONObject> d(JSONObject jSONObject) {
        return cpx.a(this.f, (cps<? super A, ? extends B>) new cfd<Object,Object>(this, jSONObject), cqo.a);
    }
}
