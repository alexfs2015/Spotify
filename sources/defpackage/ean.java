package defpackage;

import java.util.Map;

/* renamed from: ean reason: default package */
final class ean implements bgl<ebd> {
    private final /* synthetic */ dhx a;
    private final /* synthetic */ dzv b;
    private final /* synthetic */ coc c;
    private final /* synthetic */ eah d;

    ean(eah eah, dhx dhx, dzv dzv, coc coc) {
        this.d = eah;
        this.a = dhx;
        this.b = dzv;
        this.c = coc;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        synchronized (this.d.a) {
            cow.a(4);
            if (this.d.g == 0) {
                cow.a(4);
                this.d.g = 2;
                this.d.a(this.a);
            }
            this.b.b("/requestReload", (bgl) this.c.a);
        }
    }
}
