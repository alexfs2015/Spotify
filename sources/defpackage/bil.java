package defpackage;

import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: bil reason: default package */
final class bil implements bgl<csr> {
    private final /* synthetic */ CountDownLatch a;

    bil(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        csr csr = (csr) obj;
        cow.a(5);
        this.a.countDown();
        csr.destroy();
    }
}
