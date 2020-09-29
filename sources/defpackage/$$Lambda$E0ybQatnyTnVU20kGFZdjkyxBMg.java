package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: -$$Lambda$E0ybQatnyTnVU20kGFZdjkyxBMg reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$E0ybQatnyTnVU20kGFZdjkyxBMg implements a {
    private final /* synthetic */ CountDownLatch f$0;

    public /* synthetic */ $$Lambda$E0ybQatnyTnVU20kGFZdjkyxBMg(CountDownLatch countDownLatch) {
        this.f$0 = countDownLatch;
    }

    public final void onInitialized() {
        this.f$0.countDown();
    }
}
