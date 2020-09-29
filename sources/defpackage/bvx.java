package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: bvx reason: default package */
abstract class bvx<T> extends bvo {
    protected final eya<T> a;

    public bvx(int i, eya<T> eya) {
        super(4);
        this.a = eya;
    }

    public final void a(a<?> aVar) {
        try {
            d(aVar);
        } catch (DeadObjectException e) {
            a(bur.a((RemoteException) e));
            throw e;
        } catch (RemoteException e2) {
            a(bur.a(e2));
        } catch (RuntimeException e3) {
            a(e3);
        }
    }

    public void a(btt btt, boolean z) {
    }

    public void a(Status status) {
        this.a.b(new ApiException(status));
    }

    public void a(RuntimeException runtimeException) {
        this.a.b(runtimeException);
    }

    /* access modifiers changed from: protected */
    public abstract void d(a<?> aVar);
}
