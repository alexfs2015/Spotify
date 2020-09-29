package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: kjn reason: default package */
public abstract class kjn<M, F> {
    public abstract M a();

    public abstract Set<F> b();

    public static <M, F> kjn<M, F> a(M m) {
        return new kjb(m, Collections.emptySet());
    }

    public static <M, F> kjn<M, F> a(M m, Set<F> set) {
        return new kjb(m, set);
    }
}
