package defpackage;

import java.util.concurrent.TimeUnit;
import rx.internal.util.InternalObservableUtils;

/* renamed from: hhu reason: default package */
public class hhu<T> implements c<T, T> {
    private final int a;
    private final hht b;

    public hhu(int i, hht hht) {
        this.a = i;
        this.b = (hht) fbp.a(hht);
    }

    public /* synthetic */ Object call(Object obj) {
        return xjp.a(((xii) obj).d((long) this.a, TimeUnit.SECONDS), InternalObservableUtils.b(this.b));
    }
}
