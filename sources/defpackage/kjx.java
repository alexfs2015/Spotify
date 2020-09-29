package defpackage;

import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: kjx reason: default package */
public abstract class kjx<M, F> {
    /* access modifiers changed from: protected */
    public abstract M a();

    public abstract Set<F> b();

    protected kjx() {
    }

    public final boolean c() {
        return a() != null;
    }

    public final M a(M m) {
        kkr.a(m);
        return c() ? d() : m;
    }

    public final M d() {
        if (c()) {
            return a();
        }
        throw new NoSuchElementException("there is no model in this Next<>");
    }

    public static <M, F> kjx<M, F> a(M m, Set<? extends F> set) {
        return new kjc(m, kkq.a(set));
    }

    public static <M, F> kjx<M, F> b(M m) {
        return new kjc(m, Collections.emptySet());
    }

    public static <M, F> kjx<M, F> a(Set<? extends F> set) {
        return new kjc(null, kkq.a(set));
    }

    public static <M, F> kjx<M, F> e() {
        return new kjc(null, Collections.emptySet());
    }
}
