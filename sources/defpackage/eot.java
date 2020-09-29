package defpackage;

import com.google.android.gms.internal.measurement.zzun;
import com.google.android.gms.internal.measurement.zzwe;
import com.google.android.gms.internal.measurement.zzzg;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: eot reason: default package */
final class eot<T> implements epe<T> {
    private final eoo a;
    private final epv<?, ?> b;
    private final boolean c;
    private final end<?> d;

    private eot(epv<?, ?> epv, end<?> end, eoo eoo) {
        this.b = epv;
        this.c = end.a(eoo);
        this.d = end;
        this.a = eoo;
    }

    static <T> eot<T> a(epv<?, ?> epv, end<?> end, eoo eoo) {
        return new eot<>(epv, end, eoo);
    }

    public final int a(T t) {
        int hashCode = this.b.b(t).hashCode();
        return this.c ? (hashCode * 53) + this.d.a((Object) t).hashCode() : hashCode;
    }

    public final T a() {
        return this.a.j().c();
    }

    public final void a(T t, epd epd, enc enc) {
        boolean z;
        epv<?, ?> epv = this.b;
        end<?> end = this.d;
        Object c2 = epv.c(t);
        end.b((Object) t);
        do {
            try {
                if (epd.a() == Integer.MAX_VALUE) {
                    epv.b((Object) t, c2);
                    return;
                }
                int b2 = epd.b();
                if (b2 == 11) {
                    int i = 0;
                    Object obj = null;
                    zzun zzun = null;
                    while (epd.a() != Integer.MAX_VALUE) {
                        int b3 = epd.b();
                        if (b3 == 16) {
                            i = epd.o();
                            obj = end.a(enc, this.a, i);
                        } else if (b3 == 26) {
                            if (obj != null) {
                                end.b();
                            } else {
                                zzun = epd.n();
                            }
                        } else if (!epd.c()) {
                            break;
                        }
                    }
                    if (epd.b() != 12) {
                        throw zzwe.d();
                    } else if (zzun != null) {
                        if (obj != null) {
                            end.c();
                        } else {
                            epv.a(c2, i, zzun);
                        }
                    }
                } else if ((b2 & 7) != 2) {
                    z = epd.c();
                    continue;
                } else if (end.a(enc, this.a, b2 >>> 3) != null) {
                    end.b();
                } else {
                    z = epv.a(c2, epd);
                    continue;
                }
                z = true;
                continue;
            } finally {
                epv.b((Object) t, c2);
            }
        } while (z);
    }

    public final void a(T t, eqi eqi) {
        Iterator c2 = this.d.a((Object) t).c();
        while (c2.hasNext()) {
            Entry entry = (Entry) c2.next();
            eni eni = (eni) entry.getKey();
            if (eni.c() != zzzg.MESSAGE || eni.d() || eni.e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof env) {
                eqi.a(eni.a(), (Object) ((enu) ((env) entry).a.getValue()).c());
            } else {
                eqi.a(eni.a(), entry.getValue());
            }
        }
        epv<?, ?> epv = this.b;
        epv.b(epv.b(t), eqi);
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

    public final int b(T t) {
        epv<?, ?> epv = this.b;
        int e = epv.e(epv.b(t)) + 0;
        if (!this.c) {
            return e;
        }
        eng a2 = this.d.a((Object) t);
        int i = 0;
        for (int i2 = 0; i2 < a2.a.b(); i2++) {
            i += eng.b(a2.a.b(i2));
        }
        for (Entry b2 : a2.a.c()) {
            i += eng.b(b2);
        }
        return e + i;
    }

    public final void b(T t, T t2) {
        epg.a(this.b, t, t2);
        if (this.c) {
            epg.a(this.d, t, t2);
        }
    }

    public final void c(T t) {
        this.b.d(t);
        this.d.c(t);
    }

    public final boolean d(T t) {
        return this.d.a((Object) t).d();
    }
}
