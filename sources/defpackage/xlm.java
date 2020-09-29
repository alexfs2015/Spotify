package defpackage;

import java.util.concurrent.TimeUnit;
import rx.internal.subscriptions.SequentialSubscription;

/* renamed from: xlm reason: default package */
public final class xlm {
    public static final long a = TimeUnit.MINUTES.toNanos(Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: xlm$a */
    public interface a {
        long a();
    }

    public static xip a(defpackage.xil.a aVar, xir xir, long j, long j2, TimeUnit timeUnit, a aVar2) {
        long j3 = j;
        TimeUnit timeUnit2 = timeUnit;
        final long nanos = timeUnit2.toNanos(j2);
        final long nanos2 = TimeUnit.MILLISECONDS.toNanos(aVar.a());
        final long nanos3 = timeUnit2.toNanos(j3) + nanos2;
        SequentialSubscription sequentialSubscription = new SequentialSubscription();
        SequentialSubscription sequentialSubscription2 = new SequentialSubscription(sequentialSubscription);
        final xir xir2 = xir;
        final SequentialSubscription sequentialSubscription3 = sequentialSubscription2;
        AnonymousClass1 r16 = r3;
        final defpackage.xil.a aVar3 = aVar;
        AnonymousClass1 r3 = new xir(null) {
            private long a;
            private long b = nanos2;
            private long c = nanos3;

            public final void call() {
                long j2;
                xir2.call();
                if (!sequentialSubscription3.isUnsubscribed()) {
                    a aVar = null;
                    long a2 = aVar != null ? aVar.a() : TimeUnit.MILLISECONDS.toNanos(aVar3.a());
                    long j3 = xlm.a + a2;
                    long j4 = this.b;
                    if (j3 < j4 || a2 >= j4 + nanos + xlm.a) {
                        long j5 = nanos;
                        long j6 = a2 + j5;
                        long j7 = this.a + 1;
                        this.a = j7;
                        this.c = j6 - (j5 * j7);
                        j2 = j6;
                    } else {
                        long j8 = this.c;
                        long j9 = this.a + 1;
                        this.a = j9;
                        j2 = j8 + (j9 * nanos);
                    }
                    this.b = a2;
                    sequentialSubscription3.b(aVar3.a(this, j2 - a2, TimeUnit.NANOSECONDS));
                }
            }
        };
        sequentialSubscription.b(aVar.a(r16, j3, timeUnit2));
        return sequentialSubscription2;
    }
}
