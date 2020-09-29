package defpackage;

import android.text.TextUtils;

/* renamed from: esm reason: default package */
final class esm implements Runnable {
    private final /* synthetic */ eqk a;
    private final /* synthetic */ evq b;
    private final /* synthetic */ esa c;

    esm(esa esa, eqk eqk, evq evq) {
        this.c = esa;
        this.a = eqk;
        this.b = evq;
    }

    public final void run() {
        eqk eqk;
        esa esa = this.c;
        eqk eqk2 = this.a;
        evq evq = this.b;
        boolean z = false;
        if (!(!"_cmp".equals(eqk2.a) || eqk2.b == null || eqk2.b.a.size() == 0)) {
            String d = eqk2.b.d("_cis");
            if (!TextUtils.isEmpty(d) && (("referrer broadcast".equals(d) || "referrer API".equals(d)) && esa.a.b.e.g(evq.a))) {
                z = true;
            }
        }
        if (z) {
            esa.a.q().i.a("Event has been filtered ", eqk2.toString());
            eqk = new eqk("_cmpx", eqk2.b, eqk2.c, eqk2.d);
        } else {
            eqk = eqk2;
        }
        this.c.a.k();
        this.c.a.a(eqk, this.b);
    }
}
