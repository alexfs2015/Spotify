package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: dgu reason: default package */
final class dgu implements Cloneable {
    dgs<?, ?> a;
    Object b;
    List<dgy> c = new ArrayList();

    dgu() {
    }

    private final byte[] b() {
        byte[] bArr = new byte[a()];
        a(dgq.a(bArr, bArr.length));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final dgu clone() {
        Object clone;
        dgu dgu = new dgu();
        try {
            dgu.a = this.a;
            if (this.c == null) {
                dgu.c = null;
            } else {
                dgu.c.addAll(this.c);
            }
            if (this.b != null) {
                if (this.b instanceof dgw) {
                    clone = (dgw) ((dgw) this.b).clone();
                } else if (this.b instanceof byte[]) {
                    clone = ((byte[]) this.b).clone();
                } else {
                    int i = 0;
                    if (this.b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.b;
                        byte[][] bArr2 = new byte[bArr.length][];
                        dgu.b = bArr2;
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
                    } else if (this.b instanceof dgw[]) {
                        dgw[] dgwArr = (dgw[]) this.b;
                        dgw[] dgwArr2 = new dgw[dgwArr.length];
                        dgu.b = dgwArr2;
                        while (i < dgwArr.length) {
                            dgwArr2[i] = (dgw) dgwArr[i].clone();
                            i++;
                        }
                    }
                }
                dgu.b = clone;
            }
            return dgu;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: 0000 */
    public final int a() {
        if (this.b == null) {
            int i = 0;
            for (dgy dgy : this.c) {
                i += dgq.c(dgy.a) + 0 + dgy.b.length;
            }
            return i;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    public final void a(dgq dgq) {
        if (this.b == null) {
            for (dgy dgy : this.c) {
                dgq.b(dgy.a);
                dgq.b(dgy.b);
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dgu)) {
            return false;
        }
        dgu dgu = (dgu) obj;
        if (this.b == null || dgu.b == null) {
            List<dgy> list = this.c;
            if (list != null) {
                List<dgy> list2 = dgu.c;
                if (list2 != null) {
                    return list.equals(list2);
                }
            }
            try {
                return Arrays.equals(b(), dgu.b());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else {
            dgs<?, ?> dgs = this.a;
            if (dgs != dgu.a) {
                return false;
            }
            if (!dgs.a.isArray()) {
                return this.b.equals(dgu.b);
            }
            Object obj2 = this.b;
            return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) dgu.b) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) dgu.b) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) dgu.b) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) dgu.b) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) dgu.b) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) dgu.b) : Arrays.deepEquals((Object[]) obj2, (Object[]) dgu.b);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(b()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
