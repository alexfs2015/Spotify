package defpackage;

import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;
import com.google.android.gms.internal.ads.zzbex;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: dex reason: default package */
final class dex<T> implements dfj<T> {
    private final deq a;
    private final dgb<?, ?> b;
    private final boolean c;
    private final ddg<?> d;

    private dex(dgb<?, ?> dgb, ddg<?> ddg, deq deq) {
        this.b = dgb;
        this.c = ddg.a(deq);
        this.d = ddg;
        this.a = deq;
    }

    static <T> dex<T> a(dgb<?, ?> dgb, ddg<?> ddg, deq deq) {
        return new dex<>(dgb, ddg, deq);
    }

    public final int a(T t) {
        int hashCode = this.b.b(t).hashCode();
        return this.c ? (hashCode * 53) + this.d.a((Object) t).hashCode() : hashCode;
    }

    public final T a() {
        return this.a.l().f();
    }

    public final void a(T t, dfi dfi, dde dde) {
        boolean z;
        dgb<?, ?> dgb = this.b;
        ddg<?> ddg = this.d;
        Object c2 = dgb.c(t);
        ddg.b((Object) t);
        do {
            try {
                if (dfi.a() == Integer.MAX_VALUE) {
                    dgb.b((Object) t, c2);
                    return;
                }
                int b2 = dfi.b();
                if (b2 == 11) {
                    int i = 0;
                    Object obj = null;
                    zzbah zzbah = null;
                    while (dfi.a() != Integer.MAX_VALUE) {
                        int b3 = dfi.b();
                        if (b3 == 16) {
                            i = dfi.o();
                            obj = ddg.a(dde, this.a, i);
                        } else if (b3 == 26) {
                            if (obj != null) {
                                ddg.b();
                            } else {
                                zzbah = dfi.n();
                            }
                        } else if (!dfi.c()) {
                            break;
                        }
                    }
                    if (dfi.b() != 12) {
                        throw zzbbu.e();
                    } else if (zzbah != null) {
                        if (obj != null) {
                            ddg.c();
                        } else {
                            dgb.a(c2, i, zzbah);
                        }
                    }
                } else if ((b2 & 7) != 2) {
                    z = dfi.c();
                    continue;
                } else if (ddg.a(dde, this.a, b2 >>> 3) != null) {
                    ddg.b();
                } else {
                    z = dgb.a(c2, dfi);
                    continue;
                }
                z = true;
                continue;
            } finally {
                dgb.b((Object) t, c2);
            }
        } while (z);
    }

    public final void a(T t, dgn dgn) {
        int i;
        Object obj;
        Iterator c2 = this.d.a((Object) t).c();
        while (c2.hasNext()) {
            Entry entry = (Entry) c2.next();
            ddl ddl = (ddl) entry.getKey();
            if (ddl.c() != zzbex.MESSAGE || ddl.d() || ddl.e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof ddw) {
                i = ddl.a();
                obj = ((ddv) ((ddw) entry).a.getValue()).c();
            } else {
                i = ddl.a();
                obj = entry.getValue();
            }
            dgn.a(i, obj);
        }
        dgb<?, ?> dgb = this.b;
        dgb.b(dgb.b(t), dgn);
    }

    public final void a(T t, byte[] bArr, int i, int i2, dcn dcn) {
        ddp ddp = (ddp) t;
        dgc dgc = ddp.zzdtt;
        if (dgc == dgc.a()) {
            dgc = dgc.b();
            ddp.zzdtt = dgc;
        }
        dgc dgc2 = dgc;
        while (i < i2) {
            int a2 = dcm.a(bArr, i, dcn);
            int i3 = dcn.a;
            if (i3 != 11) {
                i = (i3 & 7) == 2 ? dcm.a(i3, bArr, a2, i2, dgc2, dcn) : dcm.a(i3, bArr, a2, i2, dcn);
            } else {
                int i4 = 0;
                zzbah zzbah = null;
                while (a2 < i2) {
                    a2 = dcm.a(bArr, a2, dcn);
                    int i5 = dcn.a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3 && i7 == 2) {
                            a2 = dcm.e(bArr, a2, dcn);
                            zzbah = (zzbah) dcn.c;
                        }
                    } else if (i7 == 0) {
                        a2 = dcm.a(bArr, a2, dcn);
                        i4 = dcn.a;
                    }
                    if (i5 == 12) {
                        break;
                    }
                    a2 = dcm.a(i5, bArr, a2, i2, dcn);
                }
                if (zzbah != null) {
                    dgc2.a((i4 << 3) | 2, (Object) zzbah);
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

    public final int b(T t) {
        dgb<?, ?> dgb = this.b;
        int e = dgb.e(dgb.b(t)) + 0;
        if (!this.c) {
            return e;
        }
        ddj a2 = this.d.a((Object) t);
        int i = 0;
        for (int i2 = 0; i2 < a2.a.b(); i2++) {
            i += ddj.b(a2.a.b(i2));
        }
        for (Entry b2 : a2.a.c()) {
            i += ddj.b(b2);
        }
        return e + i;
    }

    public final void b(T t, T t2) {
        dfl.a(this.b, t, t2);
        if (this.c) {
            dfl.a(this.d, t, t2);
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
