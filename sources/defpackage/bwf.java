package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;

/* renamed from: bwf reason: default package */
public final class bwf extends a {
    public static Account a(bwq bwq) {
        if (bwq != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return bwq.a();
            } catch (RemoteException unused) {
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }

    public final Account a() {
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        throw new NoSuchMethodError();
    }
}
