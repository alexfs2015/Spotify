package defpackage;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;

/* renamed from: bur reason: default package */
public abstract class bur {
    private final int a;

    public bur(int i) {
        this.a = i;
    }

    static /* synthetic */ Status a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (caf.a() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    public abstract void a(a<?> aVar);

    public abstract void a(btt btt, boolean z);

    public abstract void a(Status status);

    public abstract void a(RuntimeException runtimeException);
}
