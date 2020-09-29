package defpackage;

import com.google.android.gms.internal.measurement.zzzq;
import defpackage.epu;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: epv reason: default package */
public final class epv<M extends epu<M>, T> {
    protected final Class<T> a;
    protected final boolean b;
    private final int c;
    private int d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epv)) {
            return false;
        }
        epv epv = (epv) obj;
        return this.c == epv.c && this.a == epv.a && this.d == epv.d && this.b == epv.b;
    }

    public final int hashCode() {
        return ((((((this.c + 1147) * 31) + this.a.hashCode()) * 31) + this.d) * 31) + (this.b ? 1 : 0);
    }

    /* access modifiers changed from: 0000 */
    public final T a(List<eqb> list) {
        if (list == null) {
            return null;
        }
        if (this.b) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                eqb eqb = (eqb) list.get(i);
                if (eqb.b.length != 0) {
                    byte[] bArr = eqb.b;
                    arrayList.add(a(eps.a(bArr, bArr.length)));
                }
            }
            int size = arrayList.size();
            if (size == 0) {
                return null;
            }
            Class<T> cls = this.a;
            T cast = cls.cast(Array.newInstance(cls.getComponentType(), size));
            for (int i2 = 0; i2 < size; i2++) {
                Array.set(cast, i2, arrayList.get(i2));
            }
            return cast;
        } else if (list.isEmpty()) {
            return null;
        } else {
            eqb eqb2 = (eqb) list.get(list.size() - 1);
            Class<T> cls2 = this.a;
            byte[] bArr2 = eqb2.b;
            return cls2.cast(a(eps.a(bArr2, bArr2.length)));
        }
    }

    private final Object a(eps eps) {
        String str = "Error creating instance of class ";
        Class<T> componentType = this.b ? this.a.getComponentType() : this.a;
        try {
            int i = this.c;
            if (i == 10) {
                epz epz = (epz) componentType.newInstance();
                int i2 = this.d >>> 3;
                if (eps.c < eps.d) {
                    eps.c++;
                    epz.a(eps);
                    eps.a((i2 << 3) | 4);
                    eps.c--;
                    return epz;
                }
                throw zzzq.d();
            } else if (i == 11) {
                epz epz2 = (epz) componentType.newInstance();
                eps.a(epz2);
                return epz2;
            } else {
                int i3 = this.c;
                StringBuilder sb = new StringBuilder(24);
                sb.append("Unknown type ");
                sb.append(i3);
                throw new IllegalArgumentException(sb.toString());
            }
        } catch (InstantiationException e) {
            String valueOf = String.valueOf(componentType);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb2.append(str);
            sb2.append(valueOf);
            throw new IllegalArgumentException(sb2.toString(), e);
        } catch (IllegalAccessException e2) {
            String valueOf2 = String.valueOf(componentType);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
            sb3.append(str);
            sb3.append(valueOf2);
            throw new IllegalArgumentException(sb3.toString(), e2);
        } catch (IOException e3) {
            throw new IllegalArgumentException("Error reading extension field", e3);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Object obj, ept ept) {
        try {
            ept.b(this.d);
            int i = this.c;
            if (i == 10) {
                int i2 = this.d >>> 3;
                ((epz) obj).a(ept);
                ept.c(i2, 4);
            } else if (i == 11) {
                ept.a((epz) obj);
            } else {
                int i3 = this.c;
                StringBuilder sb = new StringBuilder(24);
                sb.append("Unknown type ");
                sb.append(i3);
                throw new IllegalArgumentException(sb.toString());
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final int a(Object obj) {
        int i = this.d >>> 3;
        int i2 = this.c;
        if (i2 == 10) {
            return (ept.c(i << 3) << 1) + ((epz) obj).e();
        } else if (i2 == 11) {
            return ept.b(i, (epz) obj);
        } else {
            StringBuilder sb = new StringBuilder(24);
            sb.append("Unknown type ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
