package defpackage;

import com.google.android.gms.internal.measurement.zzun;
import com.google.android.gms.internal.measurement.zzwe;

/* renamed from: epv reason: default package */
abstract class epv<T, B> {
    epv() {
    }

    /* access modifiers changed from: 0000 */
    public abstract B a();

    /* access modifiers changed from: 0000 */
    public abstract T a(B b);

    /* access modifiers changed from: 0000 */
    public abstract void a(B b, int i, int i2);

    /* access modifiers changed from: 0000 */
    public abstract void a(B b, int i, long j);

    /* access modifiers changed from: 0000 */
    public abstract void a(B b, int i, zzun zzun);

    /* access modifiers changed from: 0000 */
    public abstract void a(B b, int i, T t);

    /* access modifiers changed from: 0000 */
    public abstract void a(T t, eqi eqi);

    /* access modifiers changed from: 0000 */
    public abstract void a(Object obj, T t);

    /* access modifiers changed from: 0000 */
    public final boolean a(B b, epd epd) {
        int b2 = epd.b();
        int i = b2 >>> 3;
        int i2 = b2 & 7;
        if (i2 == 0) {
            a(b, i, epd.g());
            return true;
        } else if (i2 == 1) {
            b(b, i, epd.i());
            return true;
        } else if (i2 == 2) {
            a(b, i, epd.n());
            return true;
        } else if (i2 == 3) {
            Object a = a();
            int i3 = 4 | (i << 3);
            while (epd.a() != Integer.MAX_VALUE) {
                if (!a((B) a, epd)) {
                    break;
                }
            }
            if (i3 == epd.b()) {
                a(b, i, (T) a(a));
                return true;
            }
            throw zzwe.d();
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                a(b, i, epd.j());
                return true;
            }
            throw zzwe.e();
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract T b(Object obj);

    /* access modifiers changed from: 0000 */
    public abstract void b(B b, int i, long j);

    /* access modifiers changed from: 0000 */
    public abstract void b(T t, eqi eqi);

    /* access modifiers changed from: 0000 */
    public abstract void b(Object obj, B b);

    /* access modifiers changed from: 0000 */
    public abstract B c(Object obj);

    /* access modifiers changed from: 0000 */
    public abstract T c(T t, T t2);

    /* access modifiers changed from: 0000 */
    public abstract void d(Object obj);

    /* access modifiers changed from: 0000 */
    public abstract int e(T t);

    /* access modifiers changed from: 0000 */
    public abstract int f(T t);
}
