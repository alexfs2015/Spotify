package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: eyc reason: default package */
public final class eyc {

    /* renamed from: eyc$a */
    public static final class a implements b {
        public final CountDownLatch a;

        private a() {
            this.a = new CountDownLatch(1);
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public final void a() {
            this.a.countDown();
        }

        public final void a(Exception exc) {
            this.a.countDown();
        }

        public final void a(Object obj) {
            this.a.countDown();
        }
    }

    /* renamed from: eyc$b */
    interface b extends exv, exx, exy<Object> {
    }

    public static <TResult> exz<TResult> a(TResult tresult) {
        eys eys = new eys();
        eys.a(null);
        return eys;
    }

    public static <TResult> TResult a(exz<TResult> exz) {
        if (exz.b()) {
            return exz.d();
        }
        if (exz.c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(exz.e());
    }

    public static <TResult> TResult a(exz<TResult> exz, long j, TimeUnit timeUnit) {
        bxo.c("Must not be called on the main application thread");
        bxo.a(exz, (Object) "Task must not be null");
        bxo.a(timeUnit, (Object) "TimeUnit must not be null");
        if (exz.a()) {
            return a(exz);
        }
        a aVar = new a(0);
        a(exz, aVar);
        if (aVar.a.await(j, timeUnit)) {
            return a(exz);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static void a(exz<?> exz, b bVar) {
        exz.a(eyb.b, (exy<? super TResult>) bVar);
        exz.a(eyb.b, (exx) bVar);
        exz.a(eyb.b, (exv) bVar);
    }
}
