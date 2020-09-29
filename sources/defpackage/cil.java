package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: cil reason: default package */
final class cil implements Callable<cii> {
    private final /* synthetic */ Context a;
    private final /* synthetic */ cik b;

    cil(cik cik, Context context) {
        this.b = cik;
        this.a = context;
    }

    public final /* synthetic */ Object call() {
        cii cii;
        cim cim = (cim) this.b.a.get(this.a);
        if (cim != null) {
            if (!(cim.a + ((Long) dqe.f().a(dtg.bo)).longValue() < bkc.l().a())) {
                if (((Boolean) dqe.f().a(dtg.bn)).booleanValue()) {
                    cii = new cij(this.a, cim.b).a();
                    this.b.a.put(this.a, new cim(cii));
                    return cii;
                }
            }
        }
        cii = new cij(this.a).a();
        this.b.a.put(this.a, new cim(cii));
        return cii;
    }
}
