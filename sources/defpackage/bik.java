package defpackage;

import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: bik reason: default package */
final class bik implements bgl<csr> {
    private final /* synthetic */ CountDownLatch a;

    bik(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        csr csr = (csr) obj;
        this.a.countDown();
        csr.o().setVisibility(0);
    }
}
