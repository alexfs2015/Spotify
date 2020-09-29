package defpackage;

import com.google.android.gms.internal.measurement.zzzk;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: eqo reason: default package */
final class eqo implements Cloneable {
    eqm<?, ?> a;
    Object b;
    List<eqs> c = new ArrayList();

    eqo() {
    }

    private final byte[] b() {
        byte[] bArr = new byte[a()];
        a(eqk.a(bArr, bArr.length));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final eqo clone() {
        eqo eqo = new eqo();
        try {
            eqo.a = this.a;
            if (this.c == null) {
                eqo.c = null;
            } else {
                eqo.c.addAll(this.c);
            }
            if (this.b != null) {
                if (this.b instanceof eqq) {
                    eqo.b = (eqq) ((eqq) this.b).clone();
                } else if (this.b instanceof byte[]) {
                    eqo.b = ((byte[]) this.b).clone();
                } else {
                    int i = 0;
                    if (this.b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.b;
                        byte[][] bArr2 = new byte[bArr.length][];
                        eqo.b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.b instanceof boolean[]) {
                        eqo.b = ((boolean[]) this.b).clone();
                    } else if (this.b instanceof int[]) {
                        eqo.b = ((int[]) this.b).clone();
                    } else if (this.b instanceof long[]) {
                        eqo.b = ((long[]) this.b).clone();
                    } else if (this.b instanceof float[]) {
                        eqo.b = ((float[]) this.b).clone();
                    } else if (this.b instanceof double[]) {
                        eqo.b = ((double[]) this.b).clone();
                    } else if (this.b instanceof eqq[]) {
                        eqq[] eqqArr = (eqq[]) this.b;
                        eqq[] eqqArr2 = new eqq[eqqArr.length];
                        eqo.b = eqqArr2;
                        while (i < eqqArr.length) {
                            eqqArr2[i] = (eqq) eqqArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return eqo;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: 0000 */
    public final int a() {
        Object obj = this.b;
        if (obj != null) {
            eqm<?, ?> eqm = this.a;
            if (!eqm.b) {
                return eqm.a(obj);
            }
            int length = Array.getLength(obj);
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                Object obj2 = Array.get(obj, i2);
                if (obj2 != null) {
                    i += eqm.a(obj2);
                }
            }
            return i;
        }
        int i3 = 0;
        for (eqs eqs : this.c) {
            i3 += eqk.c(eqs.a) + 0 + eqs.b.length;
        }
        return i3;
    }

    /* access modifiers changed from: 0000 */
    public final void a(eqk eqk) {
        Object obj = this.b;
        if (obj != null) {
            eqm<?, ?> eqm = this.a;
            if (eqm.b) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    Object obj2 = Array.get(obj, i);
                    if (obj2 != null) {
                        eqm.a(obj2, eqk);
                    }
                }
                return;
            }
            eqm.a(obj, eqk);
            return;
        }
        for (eqs eqs : this.c) {
            eqk.b(eqs.a);
            byte[] bArr = eqs.b;
            int length2 = bArr.length;
            if (eqk.a.remaining() >= length2) {
                eqk.a.put(bArr, 0, length2);
            } else {
                throw new zzzk(eqk.a.position(), eqk.a.limit());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eqo)) {
            return false;
        }
        eqo eqo = (eqo) obj;
        if (this.b == null || eqo.b == null) {
            List<eqs> list = this.c;
            if (list != null) {
                List<eqs> list2 = eqo.c;
                if (list2 != null) {
                    return list.equals(list2);
                }
            }
            try {
                return Arrays.equals(b(), eqo.b());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else {
            eqm<?, ?> eqm = this.a;
            if (eqm != eqo.a) {
                return false;
            }
            if (!eqm.a.isArray()) {
                return this.b.equals(eqo.b);
            }
            Object obj2 = this.b;
            return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) eqo.b) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) eqo.b) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) eqo.b) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) eqo.b) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) eqo.b) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) eqo.b) : Arrays.deepEquals((Object[]) obj2, (Object[]) eqo.b);
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
