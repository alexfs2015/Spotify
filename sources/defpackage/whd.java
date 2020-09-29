package defpackage;

import defpackage.whc;
import io.netty.util.internal.PlatformDependent;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: whd reason: default package */
public abstract class whd<T extends whc<T>> {
    private final ConcurrentMap<String, T> a = PlatformDependent.j();
    private AtomicInteger b = new AtomicInteger(1);

    /* access modifiers changed from: protected */
    public abstract T a(int i, String str);

    public final T a(String str) {
        c(str);
        return b(str);
    }

    private T b(String str) {
        whc whc;
        whc whc2 = (whc) this.a.get(str);
        if (whc2 == null) {
            T a2 = a(this.b.getAndIncrement(), str);
            whc = (whc) this.a.putIfAbsent(str, a2);
            if (whc == null) {
                return a2;
            }
        } else {
            whc = whc2;
        }
        return whc;
    }

    private static String c(String str) {
        wjk.a(str, "name");
        if (!str.isEmpty()) {
            return str;
        }
        throw new IllegalArgumentException("empty name");
    }
}
