package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: bvg reason: default package */
abstract class bvg<T> extends bux {
    protected final exj<T> a;

    public bvg(int i, exj<T> exj) {
        super(4);
        this.a = exj;
    }

    public void a(btc btc, boolean z) {
    }

    /* access modifiers changed from: protected */
    public abstract void d(a<?> aVar);

    public void a(Status status) {
        this.a.b(new ApiException(status));
    }

    public void a(RuntimeException runtimeException) {
        this.a.b(runtimeException);
    }

    public final void a(a<?> aVar) {
        try {
            d(aVar);
        } catch (DeadObjectException e) {
            a(bua.a((RemoteException) e));
            throw e;
        } catch (RemoteException e2) {
            a(bua.a(e2));
        } catch (RuntimeException e3) {
            a(e3);
        }
    }
}
