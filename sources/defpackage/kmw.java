package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: kmw reason: default package */
public abstract class kmw<M, F> {
    public static <M, F> kmw<M, F> a(M m) {
        return new kmk(m, Collections.emptySet());
    }

    public static <M, F> kmw<M, F> a(M m, Set<F> set) {
        return new kmk(m, set);
    }

    public abstract M a();

    public abstract Set<F> b();
}
