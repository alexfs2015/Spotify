package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: dgd reason: default package */
final class dgd implements Cloneable {
    dgb<?, ?> a;
    Object b;
    List<dgh> c = new ArrayList();

    dgd() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final dgd clone() {
        Object clone;
        dgd dgd = new dgd();
        try {
            dgd.a = this.a;
            if (this.c == null) {
                dgd.c = null;
            } else {
                dgd.c.addAll(this.c);
            }
            if (this.b != null) {
                if (this.b instanceof dgf) {
                    clone = (dgf) ((dgf) this.b).clone();
                } else if (this.b instanceof byte[]) {
                    clone = ((byte[]) this.b).clone();
                } else {
                    int i = 0;
                    if (this.b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.b;
                        byte[][] bArr2 = new byte[bArr.length][];
                        dgd.b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.b instanceof boolean[]) {
                        clone = ((boolean[]) this.b).clone();
                    } else if (this.b instanceof int[]) {
                        clone = ((int[]) this.b).clone();
                    } else if (this.b instanceof long[]) {
                        clone = ((long[]) this.b).clone();
                    } else if (this.b instanceof float[]) {
                        clone = ((float[]) this.b).clone();
                    } else if (this.b instanceof double[]) {
                        clone = ((double[]) this.b).clone();
                    } else if (this.b instanceof dgf[]) {
                        dgf[] dgfArr = (dgf[]) this.b;
                        dgf[] dgfArr2 = new dgf[dgfArr.length];
                        dgd.b = dgfArr2;
                        while (i < dgfArr.length) {
                            dgfArr2[i] = (dgf) dgfArr[i].clone();
                            i++;
                        }
                    }
                }
                dgd.b = clone;
            }
            return dgd;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: 0000 */
    public final int a() {
        if (this.b == null) {
            int i = 0;
            for (dgh dgh : this.c) {
                i += dfz.c(dgh.a) + 0 + dgh.b.length;
            }
            return i;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    public final void a(dfz dfz) {
        if (this.b == null) {
            for (dgh dgh : this.c) {
                dfz.b(dgh.a);
                dfz.b(dgh.b);
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dgd)) {
            return false;
        }
        dgd dgd = (dgd) obj;
        if (this.b == null || dgd.b == null) {
            List<dgh> list = this.c;
            if (list != null) {
                List<dgh> list2 = dgd.c;
                if (list2 != null) {
                    return list.equals(list2);
                }
            }
            try {
                return Arrays.equals(b(), dgd.b());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else {
            dgb<?, ?> dgb = this.a;
            if (dgb != dgd.a) {
                return false;
            }
            if (!dgb.a.isArray()) {
                return this.b.equals(dgd.b);
            }
            Object obj2 = this.b;
            return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) dgd.b) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) dgd.b) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) dgd.b) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) dgd.b) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) dgd.b) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) dgd.b) : Arrays.deepEquals((Object[]) obj2, (Object[]) dgd.b);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(b()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private final byte[] b() {
        byte[] bArr = new byte[a()];
        a(dfz.a(bArr, bArr.length));
        return bArr;
    }
}
