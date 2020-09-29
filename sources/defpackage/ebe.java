package defpackage;

import java.util.Map;

/* renamed from: ebe reason: default package */
final class ebe implements bhc<ebu> {
    private final /* synthetic */ dio a;
    private final /* synthetic */ eam b;
    private final /* synthetic */ cot c;
    private final /* synthetic */ eay d;

    ebe(eay eay, dio dio, eam eam, cot cot) {
        this.d = eay;
        this.a = dio;
        this.b = eam;
        this.c = cot;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        synchronized (this.d.a) {
            cpn.a(4);
            if (this.d.g == 0) {
                cpn.a(4);
                this.d.g = 2;
                this.d.a(this.a);
            }
            this.b.b("/requestReload", (bhc) this.c.a);
        }
    }
}
