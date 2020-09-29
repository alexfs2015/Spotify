package defpackage;

import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbav;

/* renamed from: dgd reason: default package */
final class dgd extends dgb<dgc, dgc> {
    dgd() {
    }

    private static void a(Object obj, dgc dgc) {
        ((ddp) obj).zzdtt = dgc;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object a() {
        return dgc.b();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object a(Object obj) {
        dgc dgc = (dgc) obj;
        dgc.e = false;
        return dgc;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, int i, int i2) {
        ((dgc) obj).a((i << 3) | 5, (Object) Integer.valueOf(i2));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, int i, long j) {
        ((dgc) obj).a(i << 3, (Object) Long.valueOf(j));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, int i, zzbah zzbah) {
        ((dgc) obj).a((i << 3) | 2, (Object) zzbah);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, int i, Object obj2) {
        ((dgc) obj).a((i << 3) | 3, (Object) (dgc) obj2);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, dgn dgn) {
        ((dgc) obj).a(dgn);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Object obj, Object obj2) {
        a(obj, (dgc) obj2);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object b(Object obj) {
        return ((ddp) obj).zzdtt;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void b(Object obj, int i, long j) {
        ((dgc) obj).a((i << 3) | 1, (Object) Long.valueOf(j));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void b(Object obj, dgn dgn) {
        dgc dgc = (dgc) obj;
        if (dgn.a() == e.k) {
            for (int i = dgc.a - 1; i >= 0; i--) {
                dgn.a(dgc.b[i] >>> 3, dgc.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < dgc.a; i2++) {
            dgn.a(dgc.b[i2] >>> 3, dgc.c[i2]);
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void b(Object obj, Object obj2) {
        a(obj, (dgc) obj2);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object c(Object obj) {
        dgc dgc = ((ddp) obj).zzdtt;
        if (dgc != dgc.a()) {
            return dgc;
        }
        dgc b = dgc.b();
        a(obj, b);
        return b;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object c(Object obj, Object obj2) {
        dgc dgc = (dgc) obj;
        dgc dgc2 = (dgc) obj2;
        return dgc2.equals(dgc.a()) ? dgc : dgc.a(dgc, dgc2);
    }

    /* access modifiers changed from: 0000 */
    public final void d(Object obj) {
        ((ddp) obj).zzdtt.e = false;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ int e(Object obj) {
        dgc dgc = (dgc) obj;
        int i = dgc.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < dgc.a; i3++) {
            i2 += zzbav.d(dgc.b[i3] >>> 3, (zzbah) dgc.c[i3]);
        }
        dgc.d = i2;
        return i2;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ int f(Object obj) {
        return ((dgc) obj).c();
    }
}
