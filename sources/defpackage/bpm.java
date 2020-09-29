package defpackage;

import org.json.JSONObject;

/* renamed from: bpm reason: default package */
final class bpm extends g {
    private final /* synthetic */ JSONObject e;
    private final /* synthetic */ bpf f;

    bpm(bpf bpf, bsy bsy, JSONObject jSONObject) {
        this.f = bpf;
        this.e = jSONObject;
        super(bpf, bsy);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.f.f.c(this.a, this.e);
    }
}
