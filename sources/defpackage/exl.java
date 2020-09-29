package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: exl reason: default package */
public final class exl {

    /* renamed from: exl$a */
    public static final class a implements b {
        public final CountDownLatch a;

        private a() {
            this.a = new CountDownLatch(1);
        }

        public final void a(Object obj) {
            this.a.countDown();
        }

        public final void a(Exception exc) {
            this.a.countDown();
        }

        public final void a() {
            this.a.countDown();
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: exl$b */
    interface b extends exe, exg, exh<Object> {
    }

    public static <TResult> exi<TResult> a(TResult tresult) {
        eyb eyb = new eyb();
        eyb.a(null);
        return eyb;
    }

    public static <TResult> TResult a(exi<TResult> exi) {
        if (exi.b()) {
            return exi.d();
        }
        if (exi.c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(exi.e());
    }

    public static void a(exi<?> exi, b bVar) {
        exi.a(exk.b, (exh<? super TResult>) bVar);
        exi.a(exk.b, (exg) bVar);
        exi.a(exk.b, (exe) bVar);
    }

    public static <TResult> TResult a(exi<TResult> exi, long j, TimeUnit timeUnit) {
        bwx.c("Must not be called on the main application thread");
        bwx.a(exi, (Object) "Task must not be null");
        bwx.a(timeUnit, (Object) "TimeUnit must not be null");
        if (exi.a()) {
            return a(exi);
        }
        a aVar = new a(0);
        a(exi, aVar);
        if (aVar.a.await(j, timeUnit)) {
            return a(exi);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }
}
