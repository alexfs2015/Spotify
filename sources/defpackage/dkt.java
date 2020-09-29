package defpackage;

import android.content.Context;
import org.json.JSONObject;

@cey
/* renamed from: dkt reason: default package */
public final class dkt implements dlc {
    final dkg a;
    final Context b;
    final bfj c;
    boolean d;
    final bgl<ebd> e = new dky(this);
    final bgl<ebd> f = new dkz(this);
    final bgl<ebd> g = new dla(this);
    final bgl<ebd> h = new dlb(this);
    private eau i;

    public final void a(JSONObject jSONObject, boolean z) {
        this.i.a(new dkw(jSONObject), new cqg());
    }

    public final boolean a() {
        return this.d;
    }

    public final void b() {
        this.i.a(new dkx(this), new cqg());
        this.i.b();
    }

    public dkt(dkg dkg, eah eah, Context context) {
        this.a = dkg;
        this.b = context;
        this.c = new bfj(this.b);
        this.i = eah.a();
        this.i.a(new dku(this), new dkv(this));
        String valueOf = String.valueOf(this.a.a.c);
        String str = "Core JS tracking ad unit: ";
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            new String(str);
        }
        cow.a(3);
    }
}
