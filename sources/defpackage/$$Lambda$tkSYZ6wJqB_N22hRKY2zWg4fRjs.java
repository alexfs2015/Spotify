package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: -$$Lambda$tkSYZ6wJqB_N22hRKY2zWg4fRjs reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$tkSYZ6wJqB_N22hRKY2zWg4fRjs implements a {
    private final /* synthetic */ CountDownLatch f$0;

    public /* synthetic */ $$Lambda$tkSYZ6wJqB_N22hRKY2zWg4fRjs(CountDownLatch countDownLatch) {
        this.f$0 = countDownLatch;
    }

    public final void onInitialized() {
        this.f$0.countDown();
    }
}
