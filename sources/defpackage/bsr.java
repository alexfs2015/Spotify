package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: bsr reason: default package */
public final class bsr {

    /* renamed from: bsr$a */
    public static abstract class a<R extends bsl, A extends defpackage.bsc.b> extends BasePendingResult<R> implements b<R> {
        final c<A> b;
        final bsc<?> c;

        /* access modifiers changed from: protected */
        public abstract void a(A a);

        protected a(bsc<?> bsc, bsh bsh) {
            super((bsh) bwx.a(bsh, (Object) "GoogleApiClient must not be null"));
            bwx.a(bsc, (Object) "Api must not be null");
            this.b = bsc.b();
            this.c = bsc;
        }

        public final void b(A a) {
            if (a instanceof bxc) {
                a = ((bxc) a).a;
            }
            try {
                a(a);
            } catch (DeadObjectException e) {
                a((RemoteException) e);
                throw e;
            } catch (RemoteException e2) {
                a(e2);
            }
        }

        public final void b(Status status) {
            bwx.b(!status.c(), "Failed result must not be success");
            a(a(status));
        }

        private void a(RemoteException remoteException) {
            b(new Status(8, remoteException.getLocalizedMessage(), null));
        }

        public final /* bridge */ /* synthetic */ void a(Object obj) {
            super.a((bsl) obj);
        }
    }

    /* renamed from: bsr$b */
    public interface b<R> {
        void a(R r);
    }
}
