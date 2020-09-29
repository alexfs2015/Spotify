package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: fgh reason: default package */
final class fgh extends ffx {
    private final Set<Class<?>> a;
    private final Set<Class<?>> b;
    private final Set<Class<?>> c;
    private final fft d;

    /* renamed from: fgh$a */
    static class a implements fgk {
        private final Set<Class<?>> a;
        private final fgk b;

        public a(Set<Class<?>> set, fgk fgk) {
            this.a = set;
            this.b = fgk;
        }
    }

    fgh(ffs<?> ffs, fft fft) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (ffw ffw : ffs.b) {
            if (ffw.a()) {
                hashSet.add(ffw.a);
            } else {
                hashSet2.add(ffw.a);
            }
        }
        if (!ffs.d.isEmpty()) {
            hashSet.add(fgk.class);
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = ffs.d;
        this.d = fft;
    }

    public final <T> T a(Class<T> cls) {
        if (this.a.contains(cls)) {
            T a2 = this.d.a(cls);
            return !cls.equals(fgk.class) ? a2 : new a(this.c, (fgk) a2);
        }
        throw new IllegalArgumentException(String.format("Requesting %s is not allowed.", new Object[]{cls}));
    }

    public final <T> fin<T> b(Class<T> cls) {
        if (this.b.contains(cls)) {
            return this.d.b(cls);
        }
        throw new IllegalArgumentException(String.format("Requesting Provider<%s> is not allowed.", new Object[]{cls}));
    }
}
