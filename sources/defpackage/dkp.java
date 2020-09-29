package defpackage;

import org.json.JSONObject;

@cey
/* renamed from: dkp reason: default package */
public final class dkp implements dlc {
    final dkg a;
    private final csr b;
    private final bgl<csr> c = new dkq(this);
    private final bgl<csr> d = new dkr(this);
    private final bgl<csr> e = new dks(this);

    public final void a(JSONObject jSONObject, boolean z) {
        if (!z) {
            this.b.b("AFMA_updateActiveView", jSONObject);
        } else {
            this.a.c(this);
        }
    }

    public final boolean a() {
        return true;
    }

    public final void b() {
        csr csr = this.b;
        csr.b("/visibilityChanged", this.e);
        csr.b("/untrackActiveViewUnit", this.d);
        csr.b("/updateActiveView", this.c);
    }

    public dkp(dkg dkg, csr csr) {
        this.a = dkg;
        this.b = csr;
        csr csr2 = this.b;
        csr2.a("/updateActiveView", this.c);
        csr2.a("/untrackActiveViewUnit", this.d);
        csr2.a("/visibilityChanged", this.e);
        String valueOf = String.valueOf(this.a.a.c);
        String str = "Custom JS tracking ad unit: ";
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            new String(str);
        }
        cow.a(3);
    }
}
