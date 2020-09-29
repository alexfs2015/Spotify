package defpackage;

import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbav;

/* renamed from: dfm reason: default package */
final class dfm extends dfk<dfl, dfl> {
    dfm() {
    }

    private static void a(Object obj, dfl dfl) {
        ((dcy) obj).zzdtt = dfl;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object a() {
        return dfl.b();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, int i, int i2) {
        ((dfl) obj).a((i << 3) | 5, (Object) Integer.valueOf(i2));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, int i, long j) {
        ((dfl) obj).a(i << 3, (Object) Long.valueOf(j));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, int i, zzbah zzbah) {
        ((dfl) obj).a((i << 3) | 2, (Object) zzbah);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, int i, Object obj2) {
        ((dfl) obj).a((i << 3) | 3, (Object) (dfl) obj2);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, dfw dfw) {
        ((dfl) obj).a(dfw);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, Object obj2) {
        a(obj, (dfl) obj2);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object b(Object obj) {
        return ((dcy) obj).zzdtt;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void b(Object obj, int i, long j) {
        ((dfl) obj).a((i << 3) | 1, (Object) Long.valueOf(j));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void b(Object obj, Object obj2) {
        a(obj, (dfl) obj2);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object c(Object obj) {
        dfl dfl = ((dcy) obj).zzdtt;
        if (dfl != dfl.a()) {
            return dfl;
        }
        dfl b = dfl.b();
        a(obj, b);
        return b;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object c(Object obj, Object obj2) {
        dfl dfl = (dfl) obj;
        dfl dfl2 = (dfl) obj2;
        return dfl2.equals(dfl.a()) ? dfl : dfl.a(dfl, dfl2);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ int f(Object obj) {
        return ((dfl) obj).c();
    }

    /* access modifiers changed from: 0000 */
    public final void d(Object obj) {
        ((dcy) obj).zzdtt.e = false;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ int e(Object obj) {
        dfl dfl = (dfl) obj;
        int i = dfl.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < dfl.a; i3++) {
            i2 += zzbav.d(dfl.b[i3] >>> 3, (zzbah) dfl.c[i3]);
        }
        dfl.d = i2;
        return i2;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void b(Object obj, dfw dfw) {
        dfl dfl = (dfl) obj;
        if (dfw.a() == e.k) {
            for (int i = dfl.a - 1; i >= 0; i--) {
                dfw.a(dfl.b[i] >>> 3, dfl.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < dfl.a; i2++) {
            dfw.a(dfl.b[i2] >>> 3, dfl.c[i2]);
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object a(Object obj) {
        dfl dfl = (dfl) obj;
        dfl.e = false;
        return dfl;
    }
}
