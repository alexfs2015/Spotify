package defpackage;

import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: kng reason: default package */
public abstract class kng<M, F> {
    protected kng() {
    }

    public static <M, F> kng<M, F> a(M m, Set<? extends F> set) {
        return new kml(m, knz.a(set));
    }

    public static <M, F> kng<M, F> a(Set<? extends F> set) {
        return new kml(null, knz.a(set));
    }

    public static <M, F> kng<M, F> b(M m) {
        return new kml(m, Collections.emptySet());
    }

    public static <M, F> kng<M, F> e() {
        return new kml(null, Collections.emptySet());
    }

    /* access modifiers changed from: protected */
    public abstract M a();

    public final M a(M m) {
        koa.a(m);
        return c() ? d() : m;
    }

    public abstract Set<F> b();

    public final boolean c() {
        return a() != null;
    }

    public final M d() {
        if (c()) {
            return a();
        }
        throw new NoSuchElementException("there is no model in this Next<>");
    }
}
