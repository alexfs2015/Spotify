package defpackage;

import com.google.android.gms.internal.measurement.zzzq;
import defpackage.eql;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: eqm reason: default package */
public final class eqm<M extends eql<M>, T> {
    protected final Class<T> a;
    protected final boolean b;
    private final int c;
    private int d;

    private final Object a(eqj eqj) {
        String str = "Error creating instance of class ";
        Class<T> componentType = this.b ? this.a.getComponentType() : this.a;
        try {
            int i = this.c;
            if (i == 10) {
                eqq eqq = (eqq) componentType.newInstance();
                int i2 = this.d >>> 3;
                if (eqj.c < eqj.d) {
                    eqj.c++;
                    eqq.a(eqj);
                    eqj.a((i2 << 3) | 4);
                    eqj.c--;
                    return eqq;
                }
                throw zzzq.d();
            } else if (i == 11) {
                eqq eqq2 = (eqq) componentType.newInstance();
                eqj.a(eqq2);
                return eqq2;
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
    public final int a(Object obj) {
        int i = this.d >>> 3;
        int i2 = this.c;
        if (i2 == 10) {
            return (eqk.c(i << 3) << 1) + ((eqq) obj).e();
        } else if (i2 == 11) {
            return eqk.b(i, (eqq) obj);
        } else {
            StringBuilder sb = new StringBuilder(24);
            sb.append("Unknown type ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public final T a(List<eqs> list) {
        if (list == null) {
            return null;
        }
        if (this.b) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                eqs eqs = (eqs) list.get(i);
                if (eqs.b.length != 0) {
                    byte[] bArr = eqs.b;
                    arrayList.add(a(eqj.a(bArr, bArr.length)));
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
            eqs eqs2 = (eqs) list.get(list.size() - 1);
            Class<T> cls2 = this.a;
            byte[] bArr2 = eqs2.b;
            return cls2.cast(a(eqj.a(bArr2, bArr2.length)));
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Object obj, eqk eqk) {
        try {
            eqk.b(this.d);
            int i = this.c;
            if (i == 10) {
                int i2 = this.d >>> 3;
                ((eqq) obj).a(eqk);
                eqk.c(i2, 4);
            } else if (i == 11) {
                eqk.a((eqq) obj);
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqm)) {
            return false;
        }
        eqm eqm = (eqm) obj;
        return this.c == eqm.c && this.a == eqm.a && this.d == eqm.d && this.b == eqm.b;
    }

    public final int hashCode() {
        return ((((((this.c + 1147) * 31) + this.a.hashCode()) * 31) + this.d) * 31) + (this.b ? 1 : 0);
    }
}
