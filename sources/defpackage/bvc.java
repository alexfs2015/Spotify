package defpackage;

import com.google.android.gms.common.api.Status;
import defpackage.bsl;
import java.lang.ref.WeakReference;

/* renamed from: bvc reason: default package */
public final class bvc<R extends bsl> extends bso<R> implements bsm<R> {
    volatile bsn<? super R> a;
    final Object b;
    private Status c;
    private final WeakReference<bsh> d;

    public final void onResult(R r) {
        synchronized (this.b) {
            if (!r.B_().c()) {
                a(r.B_());
                a((bsl) r);
            } else if (a()) {
                bsn<? super R> bsn = this.a;
            }
        }
    }

    private final void a(Status status) {
        synchronized (this.b) {
            this.c = status;
            b(this.c);
        }
    }

    private final void b(Status status) {
        synchronized (this.b) {
            if (a()) {
                bsn<? super R> bsn = this.a;
            }
        }
    }

    private final boolean a() {
        this.d.get();
        bsn<? super R> bsn = this.a;
        return false;
    }

    private static void a(bsl bsl) {
        if (bsl instanceof bsj) {
        }
    }
}
