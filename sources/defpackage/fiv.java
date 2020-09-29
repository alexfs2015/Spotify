package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: fiv reason: default package */
public final class fiv implements fio, Cloneable {
    public static final fiv a = new fiv();
    public double b = -1.0d;
    public int c = 136;
    public boolean d = true;
    public List<fia> e = Collections.emptyList();
    public List<fia> f = Collections.emptyList();

    /* access modifiers changed from: private */
    /* renamed from: a */
    public fiv clone() {
        try {
            return (fiv) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean a(Class<?> cls) {
        if (this.b != -1.0d && !a((fir) cls.getAnnotation(fir.class), (fis) cls.getAnnotation(fis.class))) {
            return true;
        }
        if ((this.d || !c(cls)) && !b(cls)) {
            return false;
        }
        return true;
    }

    public boolean a(Class<?> cls, boolean z) {
        for (fia b2 : z ? this.e : this.f) {
            if (b2.b()) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public boolean c(Class<?> cls) {
        return cls.isMemberClass() && !d(cls);
    }

    private static boolean d(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    public boolean a(fir fir, fis fis) {
        return a(fir) && a(fis);
    }

    private boolean a(fir fir) {
        return fir == null || fir.a() <= this.b;
    }

    private boolean a(fis fis) {
        return fis == null || fis.a() > this.b;
    }

    public final <T> fin<T> a(fid fid, fju<T> fju) {
        Class<? super T> cls = fju.a;
        boolean a2 = a(cls);
        final boolean z = a2 || a(cls, true);
        final boolean z2 = a2 || a(cls, false);
        if (!z && !z2) {
            return null;
        }
        final fid fid2 = fid;
        final fju<T> fju2 = fju;
        AnonymousClass1 r5 = new fin<T>() {
            private fin<T> a;

            public final T a(fjv fjv) {
                if (!z2) {
                    return b().a(fjv);
                }
                fjv.o();
                return null;
            }

            public final void a(fjw fjw, T t) {
                if (z) {
                    fjw.e();
                } else {
                    b().a(fjw, t);
                }
            }

            private fin<T> b() {
                fin<T> fin = this.a;
                if (fin != null) {
                    return fin;
                }
                fin<T> a2 = fid2.a((fio) fiv.this, fju2);
                this.a = a2;
                return a2;
            }
        };
        return r5;
    }
}
