package defpackage;

import android.text.TextUtils;

/* renamed from: etd reason: default package */
final class etd implements Runnable {
    private final /* synthetic */ erb a;
    private final /* synthetic */ ewh b;
    private final /* synthetic */ esr c;

    etd(esr esr, erb erb, ewh ewh) {
        this.c = esr;
        this.a = erb;
        this.b = ewh;
    }

    public final void run() {
        erb erb;
        esr esr = this.c;
        erb erb2 = this.a;
        ewh ewh = this.b;
        boolean z = false;
        if (!(!"_cmp".equals(erb2.a) || erb2.b == null || erb2.b.a.size() == 0)) {
            String d = erb2.b.d("_cis");
            if (!TextUtils.isEmpty(d) && (("referrer broadcast".equals(d) || "referrer API".equals(d)) && esr.a.b.e.g(ewh.a))) {
                z = true;
            }
        }
        if (z) {
            esr.a.q().i.a("Event has been filtered ", erb2.toString());
            erb = new erb("_cmpx", erb2.b, erb2.c, erb2.d);
        } else {
            erb = erb2;
        }
        this.c.a.k();
        this.c.a.a(erb, this.b);
    }
}
