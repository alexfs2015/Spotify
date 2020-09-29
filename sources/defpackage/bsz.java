package defpackage;

import com.google.android.gms.common.api.Status;
import defpackage.btc;
import java.util.concurrent.TimeUnit;

/* renamed from: bsz reason: default package */
public abstract class bsz<R extends btc> {

    /* renamed from: bsz$a */
    public interface a {
        void a(Status status);
    }

    public abstract R a(long j, TimeUnit timeUnit);

    public void a(a aVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void a(btd<? super R> btd);

    public abstract void b();

    public abstract boolean c();

    public Integer d() {
        throw new UnsupportedOperationException();
    }
}
