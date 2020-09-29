package defpackage;

import android.os.RemoteException;

/* renamed from: eem reason: default package */
final class eem implements cva<Object, Object> {
    private final /* synthetic */ eec a;
    private final /* synthetic */ ecv b;
    private final /* synthetic */ eek c;

    eem(eek eek, eec eec, ecv ecv) {
        this.c = eek;
        this.a = eec;
        this.b = ecv;
    }

    public final void a(String str) {
        try {
            this.a.a(str);
        } catch (RemoteException e) {
            cow.a("", e);
        }
    }
}
