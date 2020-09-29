package defpackage;

import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;
import com.google.android.gms.internal.ads.zzbex;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: deg reason: default package */
final class deg<T> implements des<T> {
    private final ddz a;
    private final dfk<?, ?> b;
    private final boolean c;
    private final dcp<?> d;

    private deg(dfk<?, ?> dfk, dcp<?> dcp, ddz ddz) {
        this.b = dfk;
        this.c = dcp.a(ddz);
        this.d = dcp;
        this.a = ddz;
    }

    static <T> deg<T> a(dfk<?, ?> dfk, dcp<?> dcp, ddz ddz) {
        return new deg<>(dfk, dcp, ddz);
    }

    public final int a(T t) {
        int hashCode = this.b.b(t).hashCode();
        return this.c ? (hashCode * 53) + this.d.a((Object) t).hashCode() : hashCode;
    }

    public final T a() {
        return this.a.l().f();
    }

    public final void a(T t, der der, dcn dcn) {
        boolean z;
        dfk<?, ?> dfk = this.b;
        dcp<?> dcp = this.d;
        Object c2 = dfk.c(t);
        dcp.b((Object) t);
        do {
            try {
                if (der.a() == Integer.MAX_VALUE) {
                    dfk.b((Object) t, c2);
                    return;
                }
                int b2 = der.b();
                if (b2 == 11) {
                    int i = 0;
                    Object obj = null;
                    zzbah zzbah = null;
                    while (der.a() != Integer.MAX_VALUE) {
                        int b3 = der.b();
                        if (b3 == 16) {
                            i = der.o();
                            obj = dcp.a(dcn, this.a, i);
                        } else if (b3 == 26) {
                            if (obj != null) {
                                dcp.b();
                            } else {
                                zzbah = der.n();
                            }
                        } else if (!der.c()) {
                            break;
                        }
                    }
                    if (der.b() != 12) {
                        throw zzbbu.e();
                    } else if (zzbah != null) {
                        if (obj != null) {
                            dcp.c();
                        } else {
                            dfk.a(c2, i, zzbah);
                        }
                    }
                } else if ((b2 & 7) != 2) {
                    z = der.c();
                    continue;
                } else if (dcp.a(dcn, this.a, b2 >>> 3) != null) {
                    dcp.b();
                } else {
                    z = dfk.a(c2, der);
                    continue;
                }
                z = true;
                continue;
            } finally {
                dfk.b((Object) t, c2);
            }
        } while (z);
    }

    public final void a(T t, byte[] bArr, int i, int i2, dbw dbw) {
        dcy dcy = (dcy) t;
        dfl dfl = dcy.zzdtt;
        if (dfl == dfl.a()) {
            dfl = dfl.b();
            dcy.zzdtt = dfl;
        }
        dfl dfl2 = dfl;
        while (i < i2) {
            int a2 = dbv.a(bArr, i, dbw);
            int i3 = dbw.a;
            if (i3 != 11) {
                i = (i3 & 7) == 2 ? dbv.a(i3, bArr, a2, i2, dfl2, dbw) : dbv.a(i3, bArr, a2, i2, dbw);
            } else {
                int i4 = 0;
                zzbah zzbah = null;
                while (a2 < i2) {
                    a2 = dbv.a(bArr, a2, dbw);
                    int i5 = dbw.a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3 && i7 == 2) {
                            a2 = dbv.e(bArr, a2, dbw);
                            zzbah = (zzbah) dbw.c;
                        }
                    } else if (i7 == 0) {
                        a2 = dbv.a(bArr, a2, dbw);
                        i4 = dbw.a;
                    }
                    if (i5 == 12) {
                        break;
                    }
                    a2 = dbv.a(i5, bArr, a2, i2, dbw);
                }
                if (zzbah != null) {
                    dfl2.a((i4 << 3) | 2, (Object) zzbah);
                }
                i = a2;
            }
        }
        if (i != i2) {
            throw zzbbu.g();
        }
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

    public final void b(T t, T t2) {
        deu.a(this.b, t, t2);
        if (this.c) {
            deu.a(this.d, t, t2);
        }
    }

    public final void c(T t) {
        this.b.d(t);
        this.d.c(t);
    }

    public final boolean d(T t) {
        return this.d.a((Object) t).d();
    }

    public final void a(T t, dfw dfw) {
        int i;
        Object obj;
        Iterator c2 = this.d.a((Object) t).c();
        while (c2.hasNext()) {
            Entry entry = (Entry) c2.next();
            dcu dcu = (dcu) entry.getKey();
            if (dcu.c() != zzbex.MESSAGE || dcu.d() || dcu.e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof ddf) {
                i = dcu.a();
                obj = ((dde) ((ddf) entry).a.getValue()).c();
            } else {
                i = dcu.a();
                obj = entry.getValue();
            }
            dfw.a(i, obj);
        }
        dfk<?, ?> dfk = this.b;
        dfk.b(dfk.b(t), dfw);
    }

    public final int b(T t) {
        dfk<?, ?> dfk = this.b;
        int e = dfk.e(dfk.b(t)) + 0;
        if (!this.c) {
            return e;
        }
        dcs a2 = this.d.a((Object) t);
        int i = 0;
        for (int i2 = 0; i2 < a2.a.b(); i2++) {
            i += dcs.b(a2.a.b(i2));
        }
        for (Entry b2 : a2.a.c()) {
            i += dcs.b(b2);
        }
        return e + i;
    }
}
