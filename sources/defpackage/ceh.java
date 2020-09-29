package defpackage;

import android.content.Context;
import org.json.JSONObject;

@cey
/* renamed from: ceh reason: default package */
public final class ceh implements ced<csr> {
    final bfj a = new bfj(this.c);
    final dui b;
    final Context c;
    final bis d;
    String e;
    private cpr<csr> f;
    private final coy g;
    private final dhx h;

    public final cpr<JSONObject> a(JSONObject jSONObject) {
        return cpg.a(this.f, (cpb<? super A, ? extends B>) new cej<Object,Object>(this, jSONObject), cpx.a);
    }

    public final void a() {
        cpg.a(this.f, (cpd<V>) new cer<V>(), cpx.a);
    }

    public final void a(String str, bgl<? super csr> bgl) {
        cpg.a(this.f, (cpd<V>) new ceo<V>(str, bgl), cpx.a);
    }

    public final void a(String str, JSONObject jSONObject) {
        cpg.a(this.f, (cpd<V>) new ceq<V>(str, jSONObject), cpx.a);
    }

    public final cpr<JSONObject> b(JSONObject jSONObject) {
        return cpg.a(this.f, (cpb<? super A, ? extends B>) new cek<Object,Object>(this, jSONObject), cpx.a);
    }

    public final void b(String str, bgl<? super csr> bgl) {
        cpg.a(this.f, (cpd<V>) new cep<V>(str, bgl), cpx.a);
    }

    public final cpr<JSONObject> c(JSONObject jSONObject) {
        return cpg.a(this.f, (cpb<? super A, ? extends B>) new cel<Object,Object>(this, jSONObject), cpx.a);
    }

    public final cpr<JSONObject> d(JSONObject jSONObject) {
        return cpg.a(this.f, (cpb<? super A, ? extends B>) new cem<Object,Object>(this, jSONObject), cpx.a);
    }

    public ceh(Context context, bis bis, String str, dhx dhx, coy coy) {
        cow.a(4);
        this.c = context;
        this.d = bis;
        this.h = dhx;
        this.g = coy;
        this.e = str;
        bjl.f();
        Context context2 = this.c;
        coy coy2 = this.g;
        String str2 = (String) dpn.f().a(dsp.bV);
        dhx dhx2 = this.h;
        bki i = this.d.i();
        cpq a2 = cpg.a(null);
        csz csz = new csz(context2, dhx2, coy2, i, str2);
        cpr a3 = cpg.a((cpr<A>) a2, (cpb<? super A, ? extends B>) csz, cpx.a);
        this.b = new dui(bis, str);
        this.f = cpg.a(a3, (cpb<? super A, ? extends B>) new cei<Object,Object>(this), cpx.b);
        cpe.a(this.f, "WebViewNativeAdsUtil.constructor");
    }
}
