package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: bti reason: default package */
public final class bti {

    /* renamed from: bti$a */
    public static abstract class a<R extends btc, A extends defpackage.bst.b> extends BasePendingResult<R> implements b<R> {
        final c<A> b;
        final bst<?> c;

        protected a(bst<?> bst, bsy bsy) {
            super((bsy) bxo.a(bsy, (Object) "GoogleApiClient must not be null"));
            bxo.a(bst, (Object) "Api must not be null");
            this.b = bst.b();
            this.c = bst;
        }

        private void a(RemoteException remoteException) {
            b(new Status(8, remoteException.getLocalizedMessage(), null));
        }

        /* access modifiers changed from: protected */
        public abstract void a(A a);

        public final /* bridge */ /* synthetic */ void a(Object obj) {
            super.a((btc) obj);
        }

        public final void b(A a) {
            if (a instanceof bxt) {
                a = ((bxt) a).a;
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
            bxo.b(!status.c(), "Failed result must not be success");
            a(a(status));
        }
    }

    /* renamed from: bti$b */
    public interface b<R> {
        void a(R r);
    }
}
