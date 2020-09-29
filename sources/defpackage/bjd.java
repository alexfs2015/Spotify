package defpackage;

import android.os.RemoteException;
import android.view.View;
import java.util.Map;

/* renamed from: bjd reason: default package */
final class bjd implements bhc<cti> {
    private final /* synthetic */ eds a;
    private final /* synthetic */ bii b;
    private final /* synthetic */ edw c;

    bjd(eds eds, bii bii, edw edw) {
        this.a = eds;
        this.b = bii;
        this.c = edw;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        cti cti = (cti) obj;
        View o = cti.o();
        try {
            if (this.a == null) {
                if (this.c != null) {
                    if (!this.c.i()) {
                        this.c.a(cbj.a(o));
                        this.b.a.e();
                        return;
                    }
                    biy.a(cti);
                }
            } else if (!this.a.k()) {
                this.a.a(cbj.a(o));
                this.b.a.e();
            } else {
                biy.a(cti);
            }
        } catch (RemoteException unused) {
            cpn.a(5);
        }
    }
}
