package defpackage;

import java.util.Arrays;

/* renamed from: fdk reason: default package */
public final class fdk<K> extends fdj<K> {
    private transient long[] e;
    private transient int f;
    private transient int g;

    fdk() {
        this(3);
    }

    public fdk(int i) {
        this(i, 1.0f);
    }

    private fdk(int i, float f2) {
        super(i, 1.0f);
    }

    private void c(int i, int i2) {
        if (i == -2) {
            this.f = i2;
        } else {
            long[] jArr = this.e;
            jArr[i] = (jArr[i] & -4294967296L) | (((long) i2) & 4294967295L);
        }
        if (i2 == -2) {
            this.g = i;
            return;
        }
        long[] jArr2 = this.e;
        jArr2[i2] = (4294967295L & jArr2[i2]) | (((long) i) << 32);
    }

    private int i(int i) {
        return (int) (this.e[i] >>> 32);
    }

    /* access modifiers changed from: 0000 */
    public final int a() {
        int i = this.f;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public final int a(int i) {
        int i2 = (int) this.e[i];
        if (i2 == -2) {
            return -1;
        }
        return i2;
    }

    /* access modifiers changed from: 0000 */
    public final int a(int i, int i2) {
        return i == this.c ? i2 : i;
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i, float f2) {
        super.a(i, f2);
        this.f = -2;
        this.g = -2;
        this.e = new long[i];
        Arrays.fill(this.e, -1);
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i, K k, int i2, int i3) {
        super.a(i, k, i2, i3);
        c(this.g, i);
        c(i, -2);
    }

    public final void b() {
        super.b();
        this.f = -2;
        this.g = -2;
    }

    /* access modifiers changed from: 0000 */
    public final void f(int i) {
        super.f(i);
        long[] jArr = this.e;
        int length = jArr.length;
        this.e = Arrays.copyOf(jArr, i);
        Arrays.fill(this.e, length, i, -1);
    }

    /* access modifiers changed from: 0000 */
    public final void h(int i) {
        int i2 = this.c - 1;
        c(i(i), (int) this.e[i]);
        if (i < i2) {
            c(i(i2), i);
            c(i, (int) this.e[i2]);
        }
        super.h(i);
    }
}
