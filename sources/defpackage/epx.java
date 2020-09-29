package defpackage;

import com.google.android.gms.internal.measurement.zzun;
import com.google.android.gms.internal.measurement.zzve;

/* renamed from: epx reason: default package */
final class epx extends epv<epw, epw> {
    epx() {
    }

    private static void a(Object obj, epw epw) {
        ((enn) obj).zzbzh = epw;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object a() {
        return epw.b();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object a(Object obj) {
        epw epw = (epw) obj;
        epw.e = false;
        return epw;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, int i, int i2) {
        ((epw) obj).a((i << 3) | 5, (Object) Integer.valueOf(i2));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, int i, long j) {
        ((epw) obj).a(i << 3, (Object) Long.valueOf(j));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, int i, zzun zzun) {
        ((epw) obj).a((i << 3) | 2, (Object) zzun);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, int i, Object obj2) {
        ((epw) obj).a((i << 3) | 3, (Object) (epw) obj2);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, eqi eqi) {
        ((epw) obj).a(eqi);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, Object obj2) {
        a(obj, (epw) obj2);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object b(Object obj) {
        return ((enn) obj).zzbzh;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void b(Object obj, int i, long j) {
        ((epw) obj).a((i << 3) | 1, (Object) Long.valueOf(j));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void b(Object obj, eqi eqi) {
        epw epw = (epw) obj;
        if (eqi.a() == e.k) {
            for (int i = epw.a - 1; i >= 0; i--) {
                eqi.a(epw.b[i] >>> 3, epw.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < epw.a; i2++) {
            eqi.a(epw.b[i2] >>> 3, epw.c[i2]);
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void b(Object obj, Object obj2) {
        a(obj, (epw) obj2);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object c(Object obj) {
        epw epw = ((enn) obj).zzbzh;
        if (epw != epw.a()) {
            return epw;
        }
        epw b = epw.b();
        a(obj, b);
        return b;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object c(Object obj, Object obj2) {
        epw epw = (epw) obj;
        epw epw2 = (epw) obj2;
        return epw2.equals(epw.a()) ? epw : epw.a(epw, epw2);
    }

    /* access modifiers changed from: 0000 */
    public final void d(Object obj) {
        ((enn) obj).zzbzh.e = false;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ int e(Object obj) {
        epw epw = (epw) obj;
        int i = epw.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < epw.a; i3++) {
            i2 += zzve.d(epw.b[i3] >>> 3, (zzun) epw.c[i3]);
        }
        epw.d = i2;
        return i2;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ int f(Object obj) {
        return ((epw) obj).c();
    }
}
