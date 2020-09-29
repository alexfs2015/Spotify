package defpackage;

import org.json.JSONObject;

/* renamed from: bpn reason: default package */
final class bpn extends g {
    private final /* synthetic */ JSONObject e;
    private final /* synthetic */ bpf f;

    bpn(bpf bpf, bsy bsy, JSONObject jSONObject) {
        this.f = bpf;
        this.e = jSONObject;
        super(bpf, bsy);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.f.f.b(this.a, this.e);
    }
}
