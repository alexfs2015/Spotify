package defpackage;

import com.google.android.gms.internal.measurement.zzun;
import com.google.android.gms.internal.measurement.zzve;

/* renamed from: epg reason: default package */
final class epg extends epe<epf, epf> {
    epg() {
    }

    private static void a(Object obj, epf epf) {
        ((emw) obj).zzbzh = epf;
    }

    /* access modifiers changed from: 0000 */
    public final void d(Object obj) {
        ((emw) obj).zzbzh.e = false;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ int f(Object obj) {
        return ((epf) obj).c();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ int e(Object obj) {
        epf epf = (epf) obj;
        int i = epf.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < epf.a; i3++) {
            i2 += zzve.d(epf.b[i3] >>> 3, (zzun) epf.c[i3]);
        }
        epf.d = i2;
        return i2;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object c(Object obj, Object obj2) {
        epf epf = (epf) obj;
        epf epf2 = (epf) obj2;
        if (epf2.equals(epf.a())) {
            return epf;
        }
        return epf.a(epf, epf2);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void b(Object obj, epr epr) {
        epf epf = (epf) obj;
        if (epr.a() == e.k) {
            for (int i = epf.a - 1; i >= 0; i--) {
                epr.a(epf.b[i] >>> 3, epf.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < epf.a; i2++) {
            epr.a(epf.b[i2] >>> 3, epf.c[i2]);
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, epr epr) {
        ((epf) obj).a(epr);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void b(Object obj, Object obj2) {
        a(obj, (epf) obj2);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object c(Object obj) {
        epf epf = ((emw) obj).zzbzh;
        if (epf != epf.a()) {
            return epf;
        }
        epf b = epf.b();
        a(obj, b);
        return b;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object b(Object obj) {
        return ((emw) obj).zzbzh;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, Object obj2) {
        a(obj, (epf) obj2);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object a(Object obj) {
        epf epf = (epf) obj;
        epf.e = false;
        return epf;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object a() {
        return epf.b();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, int i, Object obj2) {
        ((epf) obj).a((i << 3) | 3, (Object) (epf) obj2);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, int i, zzun zzun) {
        ((epf) obj).a((i << 3) | 2, (Object) zzun);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void b(Object obj, int i, long j) {
        ((epf) obj).a((i << 3) | 1, (Object) Long.valueOf(j));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, int i, int i2) {
        ((epf) obj).a((i << 3) | 5, (Object) Integer.valueOf(i2));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, int i, long j) {
        ((epf) obj).a(i << 3, (Object) Long.valueOf(j));
    }
}
