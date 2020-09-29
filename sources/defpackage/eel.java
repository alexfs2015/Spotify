package defpackage;

import android.os.RemoteException;

/* renamed from: eel reason: default package */
final class eel implements cva<Object, Object> {
    private final /* synthetic */ eea a;
    private final /* synthetic */ ecv b;

    eel(eea eea, ecv ecv) {
        this.a = eea;
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
