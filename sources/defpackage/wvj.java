package defpackage;

import defpackage.wvi;
import io.netty.util.internal.PlatformDependent;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: wvj reason: default package */
public abstract class wvj<T extends wvi<T>> {
    private final ConcurrentMap<String, T> a = PlatformDependent.j();
    private AtomicInteger b = new AtomicInteger(1);

    private T b(String str) {
        wvi wvi;
        wvi wvi2 = (wvi) this.a.get(str);
        if (wvi2 == null) {
            T a2 = a(this.b.getAndIncrement(), str);
            wvi = (wvi) this.a.putIfAbsent(str, a2);
            if (wvi == null) {
                return a2;
            }
        } else {
            wvi = wvi2;
        }
        return wvi;
    }

    private static String c(String str) {
        wxq.a(str, "name");
        if (!str.isEmpty()) {
            return str;
        }
        throw new IllegalArgumentException("empty name");
    }

    /* access modifiers changed from: protected */
    public abstract T a(int i, String str);

    public final T a(String str) {
        c(str);
        return b(str);
    }
}
