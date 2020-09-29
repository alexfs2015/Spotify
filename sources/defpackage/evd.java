package defpackage;

import android.content.Intent;

/* renamed from: evd reason: default package */
public final /* synthetic */ class evd implements Runnable {
    private final evc a;
    private final int b;
    private final ern c;
    private final Intent d;

    public evd(evc evc, int i, ern ern, Intent intent) {
        this.a = evc;
        this.b = i;
        this.c = ern;
        this.d = intent;
    }

    public final void run() {
        evc evc = this.a;
        int i = this.b;
        ern ern = this.c;
        Intent intent = this.d;
        if (((evg) evc.a).a(i)) {
            ern.k.a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            evc.c().k.a("Completed wakeful intent.");
            ((evg) evc.a).a(intent);
        }
    }
}
