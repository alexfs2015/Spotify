package defpackage;

import org.json.JSONObject;

@cfp
/* renamed from: dlg reason: default package */
public final class dlg implements dlt {
    final dkx a;
    private final cti b;
    private final bhc<cti> c = new dlh(this);
    private final bhc<cti> d = new dli(this);
    private final bhc<cti> e = new dlj(this);

    public dlg(dkx dkx, cti cti) {
        this.a = dkx;
        this.b = cti;
        cti cti2 = this.b;
        cti2.a("/updateActiveView", this.c);
        cti2.a("/untrackActiveViewUnit", this.d);
        cti2.a("/visibilityChanged", this.e);
        String valueOf = String.valueOf(this.a.a.c);
        String str = "Custom JS tracking ad unit: ";
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            new String(str);
        }
        cpn.a(3);
    }

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
        cti cti = this.b;
        cti.b("/visibilityChanged", this.e);
        cti.b("/untrackActiveViewUnit", this.d);
        cti.b("/updateActiveView", this.c);
    }
}
