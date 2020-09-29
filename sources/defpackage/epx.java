package defpackage;

import com.google.android.gms.internal.measurement.zzzk;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: epx reason: default package */
final class epx implements Cloneable {
    epv<?, ?> a;
    Object b;
    List<eqb> c = new ArrayList();

    epx() {
    }

    /* access modifiers changed from: 0000 */
    public final int a() {
        Object obj = this.b;
        if (obj != null) {
            epv<?, ?> epv = this.a;
            if (!epv.b) {
                return epv.a(obj);
            }
            int length = Array.getLength(obj);
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                Object obj2 = Array.get(obj, i2);
                if (obj2 != null) {
                    i += epv.a(obj2);
                }
            }
            return i;
        }
        int i3 = 0;
        for (eqb eqb : this.c) {
            i3 += ept.c(eqb.a) + 0 + eqb.b.length;
        }
        return i3;
    }

    /* access modifiers changed from: 0000 */
    public final void a(ept ept) {
        Object obj = this.b;
        if (obj != null) {
            epv<?, ?> epv = this.a;
            if (epv.b) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    Object obj2 = Array.get(obj, i);
                    if (obj2 != null) {
                        epv.a(obj2, ept);
                    }
                }
                return;
            }
            epv.a(obj, ept);
            return;
        }
        for (eqb eqb : this.c) {
            ept.b(eqb.a);
            byte[] bArr = eqb.b;
            int length2 = bArr.length;
            if (ept.a.remaining() >= length2) {
                ept.a.put(bArr, 0, length2);
            } else {
                throw new zzzk(ept.a.position(), ept.a.limit());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof epx)) {
            return false;
        }
        epx epx = (epx) obj;
        if (this.b == null || epx.b == null) {
            List<eqb> list = this.c;
            if (list != null) {
                List<eqb> list2 = epx.c;
                if (list2 != null) {
                    return list.equals(list2);
                }
            }
            try {
                return Arrays.equals(b(), epx.b());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else {
            epv<?, ?> epv = this.a;
            if (epv != epx.a) {
                return false;
            }
            if (!epv.a.isArray()) {
                return this.b.equals(epx.b);
            }
            Object obj2 = this.b;
            if (obj2 instanceof byte[]) {
                return Arrays.equals((byte[]) obj2, (byte[]) epx.b);
            }
            if (obj2 instanceof int[]) {
                return Arrays.equals((int[]) obj2, (int[]) epx.b);
            }
            if (obj2 instanceof long[]) {
                return Arrays.equals((long[]) obj2, (long[]) epx.b);
            }
            if (obj2 instanceof float[]) {
                return Arrays.equals((float[]) obj2, (float[]) epx.b);
            }
            if (obj2 instanceof double[]) {
                return Arrays.equals((double[]) obj2, (double[]) epx.b);
            }
            if (obj2 instanceof boolean[]) {
                return Arrays.equals((boolean[]) obj2, (boolean[]) epx.b);
            }
            return Arrays.deepEquals((Object[]) obj2, (Object[]) epx.b);
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
        a(ept.a(bArr, bArr.length));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final epx clone() {
        epx epx = new epx();
        try {
            epx.a = this.a;
            if (this.c == null) {
                epx.c = null;
            } else {
                epx.c.addAll(this.c);
            }
            if (this.b != null) {
                if (this.b instanceof epz) {
                    epx.b = (epz) ((epz) this.b).clone();
                } else if (this.b instanceof byte[]) {
                    epx.b = ((byte[]) this.b).clone();
                } else {
                    int i = 0;
                    if (this.b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.b;
                        byte[][] bArr2 = new byte[bArr.length][];
                        epx.b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.b instanceof boolean[]) {
                        epx.b = ((boolean[]) this.b).clone();
                    } else if (this.b instanceof int[]) {
                        epx.b = ((int[]) this.b).clone();
                    } else if (this.b instanceof long[]) {
                        epx.b = ((long[]) this.b).clone();
                    } else if (this.b instanceof float[]) {
                        epx.b = ((float[]) this.b).clone();
                    } else if (this.b instanceof double[]) {
                        epx.b = ((double[]) this.b).clone();
                    } else if (this.b instanceof epz[]) {
                        epz[] epzArr = (epz[]) this.b;
                        epz[] epzArr2 = new epz[epzArr.length];
                        epx.b = epzArr2;
                        while (i < epzArr.length) {
                            epzArr2[i] = (epz) epzArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return epx;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
