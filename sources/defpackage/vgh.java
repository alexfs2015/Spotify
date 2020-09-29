package defpackage;

import com.google.common.base.Optional;

/* renamed from: vgh reason: default package */
public final class vgh<T> {
    private static final a a = $$Lambda$vgh$UHFXzjvKpDsq0IDNHlW3Tx68xo.INSTANCE;
    private final T b;
    private Optional<T> c = Optional.e();
    private a d = a;

    /* renamed from: vgh$a */
    public interface a {
    }

    private vgh(T t) {
        this.b = t;
    }

    public static <T> vgh<T> a(T t) {
        return new vgh<>(t);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b() {
    }

    public final T a() {
        return this.c.b() ? this.c.c() : this.b;
    }
}
