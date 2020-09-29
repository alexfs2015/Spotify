package defpackage;

import io.reactivex.functions.Cancellable;
import java.util.concurrent.ExecutorService;

/* renamed from: -$$Lambda$UdQHzuG9fixedUW5qCiRJo_2EIk reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$UdQHzuG9fixedUW5qCiRJo_2EIk implements Cancellable {
    private final /* synthetic */ ExecutorService f$0;

    public /* synthetic */ $$Lambda$UdQHzuG9fixedUW5qCiRJo_2EIk(ExecutorService executorService) {
        this.f$0 = executorService;
    }

    public final void cancel() {
        this.f$0.shutdown();
    }
}
