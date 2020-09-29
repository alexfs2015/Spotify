package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ffn reason: default package */
final class ffn extends ffd {
    private final Set<Class<?>> a;
    private final Set<Class<?>> b;
    private final Set<Class<?>> c;
    private final fez d;

    /* renamed from: ffn$a */
    static class a implements ffq {
        private final Set<Class<?>> a;
        private final ffq b;

        public a(Set<Class<?>> set, ffq ffq) {
            this.a = set;
            this.b = ffq;
        }
    }

    ffn(fey<?> fey, fez fez) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (ffc ffc : fey.b) {
            if (ffc.a()) {
                hashSet.add(ffc.a);
            } else {
                hashSet2.add(ffc.a);
            }
        }
        if (!fey.d.isEmpty()) {
            hashSet.add(ffq.class);
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = fey.d;
        this.d = fez;
    }

    public final <T> T a(Class<T> cls) {
        if (this.a.contains(cls)) {
            T a2 = this.d.a(cls);
            if (!cls.equals(ffq.class)) {
                return a2;
            }
            return new a(this.c, (ffq) a2);
        }
        throw new IllegalArgumentException(String.format("Requesting %s is not allowed.", new Object[]{cls}));
    }

    public final <T> fht<T> b(Class<T> cls) {
        if (this.b.contains(cls)) {
            return this.d.b(cls);
        }
        throw new IllegalArgumentException(String.format("Requesting Provider<%s> is not allowed.", new Object[]{cls}));
    }
}
