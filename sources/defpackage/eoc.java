package defpackage;

import com.google.android.gms.internal.measurement.zzun;
import com.google.android.gms.internal.measurement.zzwe;
import com.google.android.gms.internal.measurement.zzzg;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: eoc reason: default package */
final class eoc<T> implements eon<T> {
    private final enx a;
    private final epe<?, ?> b;
    private final boolean c;
    private final emm<?> d;

    private eoc(epe<?, ?> epe, emm<?> emm, enx enx) {
        this.b = epe;
        this.c = emm.a(enx);
        this.d = emm;
        this.a = enx;
    }

    static <T> eoc<T> a(epe<?, ?> epe, emm<?> emm, enx enx) {
        return new eoc<>(epe, emm, enx);
    }

    public final T a() {
        return this.a.j().c();
    }

    public final boolean a(T t, T t2) {
        if (!this.b.b(t).equals(this.b.b(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.a((Object) t).equals(this.d.a((Object) t2));
        }
        return true;
    }

    public final int a(T t) {
        int hashCode = this.b.b(t).hashCode();
        return this.c ? (hashCode * 53) + this.d.a((Object) t).hashCode() : hashCode;
    }

    public final void b(T t, T t2) {
        eop.a(this.b, t, t2);
        if (this.c) {
            eop.a(this.d, t, t2);
        }
    }

    public final void a(T t, epr epr) {
        Iterator c2 = this.d.a((Object) t).c();
        while (c2.hasNext()) {
            Entry entry = (Entry) c2.next();
            emr emr = (emr) entry.getKey();
            if (emr.c() != zzzg.MESSAGE || emr.d() || emr.e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof ene) {
                epr.a(emr.a(), (Object) ((end) ((ene) entry).a.getValue()).c());
            } else {
                epr.a(emr.a(), entry.getValue());
            }
        }
        epe<?, ?> epe = this.b;
        epe.b(epe.b(t), epr);
    }

    public final void a(T t, eom eom, eml eml) {
        boolean z;
        epe<?, ?> epe = this.b;
        emm<?> emm = this.d;
        Object c2 = epe.c(t);
        emm.b((Object) t);
        do {
            try {
                if (eom.a() == Integer.MAX_VALUE) {
                    epe.b((Object) t, c2);
                    return;
                }
                int b2 = eom.b();
                if (b2 == 11) {
                    int i = 0;
                    Object obj = null;
                    zzun zzun = null;
                    while (eom.a() != Integer.MAX_VALUE) {
                        int b3 = eom.b();
                        if (b3 == 16) {
                            i = eom.o();
                            obj = emm.a(eml, this.a, i);
                        } else if (b3 == 26) {
                            if (obj != null) {
                                emm.b();
                            } else {
                                zzun = eom.n();
                            }
                        } else if (!eom.c()) {
                            break;
                        }
                    }
                    if (eom.b() != 12) {
                        throw zzwe.d();
                    } else if (zzun != null) {
                        if (obj != null) {
                            emm.c();
                        } else {
                            epe.a(c2, i, zzun);
                        }
                    }
                } else if ((b2 & 7) != 2) {
                    z = eom.c();
                    continue;
                } else if (emm.a(eml, this.a, b2 >>> 3) != null) {
                    emm.b();
                } else {
                    z = epe.a(c2, eom);
                    continue;
                }
                z = true;
                continue;
            } finally {
                epe.b((Object) t, c2);
            }
        } while (z);
    }

    public final void c(T t) {
        this.b.d(t);
        this.d.c(t);
    }

    public final boolean d(T t) {
        return this.d.a((Object) t).d();
    }

    public final int b(T t) {
        epe<?, ?> epe = this.b;
        int e = epe.e(epe.b(t)) + 0;
        if (!this.c) {
            return e;
        }
        emp a2 = this.d.a((Object) t);
        int i = 0;
        for (int i2 = 0; i2 < a2.a.b(); i2++) {
            i += emp.b(a2.a.b(i2));
        }
        for (Entry b2 : a2.a.c()) {
            i += emp.b(b2);
        }
        return e + i;
    }
}
