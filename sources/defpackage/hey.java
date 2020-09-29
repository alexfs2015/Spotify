package defpackage;

import java.util.concurrent.TimeUnit;
import rx.internal.util.InternalObservableUtils;

/* renamed from: hey reason: default package */
public class hey<T> implements c<T, T> {
    private final int a;
    private final hex b;

    public /* synthetic */ Object call(Object obj) {
        return wvk.a(((wud) obj).d((long) this.a, TimeUnit.SECONDS), InternalObservableUtils.b(this.b));
    }

    public hey(int i, hex hex) {
        this.a = i;
        this.b = (hex) fay.a(hex);
    }
}
