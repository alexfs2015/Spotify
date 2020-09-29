package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: fjp reason: default package */
public final class fjp implements fji, Cloneable {
    public static final fjp a = new fjp();
    public double b = -1.0d;
    public int c = 136;
    public boolean d = true;
    public List<fiu> e = Collections.emptyList();
    public List<fiu> f = Collections.emptyList();

    /* access modifiers changed from: private */
    /* renamed from: a */
    public fjp clone() {
        try {
            return (fjp) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    private boolean a(fjl fjl) {
        return fjl == null || fjl.a() <= this.b;
    }

    private boolean a(fjm fjm) {
        return fjm == null || fjm.a() > this.b;
    }

    public static boolean b(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private static boolean d(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    public final <T> fjh<T> a(fix fix, fko<T> fko) {
        Class<? super T> cls = fko.a;
        boolean a2 = a(cls);
        final boolean z = a2 || a(cls, true);
        final boolean z2 = a2 || a(cls, false);
        if (!z && !z2) {
            return null;
        }
        final fix fix2 = fix;
        final fko<T> fko2 = fko;
        AnonymousClass1 r5 = new fjh<T>() {
            private fjh<T> a;

            private fjh<T> b() {
                fjh<T> fjh = this.a;
                if (fjh != null) {
                    return fjh;
                }
                fjh<T> a2 = fix2.a((fji) fjp.this, fko2);
                this.a = a2;
                return a2;
            }

            public final T a(fkp fkp) {
                if (!z2) {
                    return b().a(fkp);
                }
                fkp.o();
                return null;
            }

            public final void a(fkq fkq, T t) {
                if (z) {
                    fkq.e();
                } else {
                    b().a(fkq, t);
                }
            }
        };
        return r5;
    }

    public boolean a(fjl fjl, fjm fjm) {
        return a(fjl) && a(fjm);
    }

    public boolean a(Class<?> cls) {
        if (this.b == -1.0d || a((fjl) cls.getAnnotation(fjl.class), (fjm) cls.getAnnotation(fjm.class))) {
            return (!this.d && c(cls)) || b(cls);
        }
        return true;
    }

    public boolean a(Class<?> cls, boolean z) {
        for (fiu b2 : z ? this.e : this.f) {
            if (b2.b()) {
                return true;
            }
        }
        return false;
    }

    public boolean c(Class<?> cls) {
        return cls.isMemberClass() && !d(cls);
    }
}
