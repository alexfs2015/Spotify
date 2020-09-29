package defpackage;

import com.google.android.gms.common.api.Status;
import defpackage.bsl;
import java.util.concurrent.TimeUnit;

/* renamed from: bsi reason: default package */
public abstract class bsi<R extends bsl> {

    /* renamed from: bsi$a */
    public interface a {
        void a(Status status);
    }

    public abstract R a(long j, TimeUnit timeUnit);

    public abstract void a(bsm<? super R> bsm);

    public abstract void b();

    public abstract boolean c();

    public void a(a aVar) {
        throw new UnsupportedOperationException();
    }

    public Integer d() {
        throw new UnsupportedOperationException();
    }
}
