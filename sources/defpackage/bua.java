package defpackage;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;

/* renamed from: bua reason: default package */
public abstract class bua {
    private final int a;

    public bua(int i) {
        this.a = i;
    }

    public abstract void a(a<?> aVar);

    public abstract void a(btc btc, boolean z);

    public abstract void a(Status status);

    public abstract void a(RuntimeException runtimeException);

    static /* synthetic */ Status a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (bzo.a() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }
}
