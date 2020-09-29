package defpackage;

import android.content.Intent;

/* renamed from: eum reason: default package */
public final /* synthetic */ class eum implements Runnable {
    private final eul a;
    private final int b;
    private final eqw c;
    private final Intent d;

    public eum(eul eul, int i, eqw eqw, Intent intent) {
        this.a = eul;
        this.b = i;
        this.c = eqw;
        this.d = intent;
    }

    public final void run() {
        eul eul = this.a;
        int i = this.b;
        eqw eqw = this.c;
        Intent intent = this.d;
        if (((eup) eul.a).a(i)) {
            eqw.k.a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            eul.c().k.a("Completed wakeful intent.");
            ((eup) eul.a).a(intent);
        }
    }
}
