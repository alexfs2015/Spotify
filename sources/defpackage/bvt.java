package defpackage;

import com.google.android.gms.common.api.Status;
import defpackage.btc;
import java.lang.ref.WeakReference;

/* renamed from: bvt reason: default package */
public final class bvt<R extends btc> extends btf<R> implements btd<R> {
    volatile bte<? super R> a;
    final Object b;
    private Status c;
    private final WeakReference<bsy> d;

    private static void a(btc btc) {
        if (btc instanceof bta) {
        }
    }

    private final void a(Status status) {
        synchronized (this.b) {
            this.c = status;
            b(this.c);
        }
    }

    private final boolean a() {
        this.d.get();
        bte<? super R> bte = this.a;
        return false;
    }

    private final void b(Status status) {
        synchronized (this.b) {
            if (a()) {
                bte<? super R> bte = this.a;
            }
        }
    }

    public final void onResult(R r) {
        synchronized (this.b) {
            if (!r.B_().c()) {
                a(r.B_());
                a((btc) r);
            } else if (a()) {
                bte<? super R> bte = this.a;
            }
        }
    }
}
