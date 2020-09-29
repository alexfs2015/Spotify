package defpackage;

import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: bjb reason: default package */
final class bjb implements bhc<cti> {
    private final /* synthetic */ CountDownLatch a;

    bjb(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        cti cti = (cti) obj;
        this.a.countDown();
        cti.o().setVisibility(0);
    }
}
