package defpackage;

import android.content.Context;
import org.json.JSONObject;

@cfp
/* renamed from: dlk reason: default package */
public final class dlk implements dlt {
    final dkx a;
    final Context b;
    final bga c;
    boolean d;
    final bhc<ebu> e = new dlp(this);
    final bhc<ebu> f = new dlq(this);
    final bhc<ebu> g = new dlr(this);
    final bhc<ebu> h = new dls(this);
    private ebl i;

    public dlk(dkx dkx, eay eay, Context context) {
        this.a = dkx;
        this.b = context;
        this.c = new bga(this.b);
        this.i = eay.a();
        this.i.a(new dll(this), new dlm(this));
        String valueOf = String.valueOf(this.a.a.c);
        String str = "Core JS tracking ad unit: ";
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            new String(str);
        }
        cpn.a(3);
    }

    public final void a(JSONObject jSONObject, boolean z) {
        this.i.a(new dln(jSONObject), new cqx());
    }

    public final boolean a() {
        return this.d;
    }

    public final void b() {
        this.i.a(new dlo(this), new cqx());
        this.i.b();
    }
}
