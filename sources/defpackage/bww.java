package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;

/* renamed from: bww reason: default package */
public final class bww extends a {
    public static Account a(bxh bxh) {
        if (bxh != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return bxh.a();
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
