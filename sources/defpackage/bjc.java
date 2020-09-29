package defpackage;

import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: bjc reason: default package */
final class bjc implements bhc<cti> {
    private final /* synthetic */ CountDownLatch a;

    bjc(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        cti cti = (cti) obj;
        cpn.a(5);
        this.a.countDown();
        cti.destroy();
    }
}
