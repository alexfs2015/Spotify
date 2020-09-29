package defpackage;

import com.google.common.base.Optional;

/* renamed from: uuq reason: default package */
public final class uuq<T> {
    private static final a a = $$Lambda$uuq$2ugJUfF8DLqXy02seETmlgYXeM.INSTANCE;
    private final T b;
    private Optional<T> c = Optional.e();
    private a d = a;

    /* renamed from: uuq$a */
    public interface a {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b() {
    }

    private uuq(T t) {
        this.b = t;
    }

    public static <T> uuq<T> a(T t) {
        return new uuq<>(t);
    }

    public final T a() {
        return this.c.b() ? this.c.c() : this.b;
    }
}
