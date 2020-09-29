package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.spotify.android.flags.UnmappableValueException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: fqq reason: default package */
public final class fqq implements fqn {
    public static final Creator<fqq> CREATOR = new Creator<fqq>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            SparseIntArray sparseIntArray;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                sparseIntArray = null;
            } else {
                SparseIntArray sparseIntArray2 = new SparseIntArray(readInt);
                while (readInt > 0) {
                    sparseIntArray2.append(parcel.readInt(), parcel.readInt());
                    readInt--;
                }
                sparseIntArray = sparseIntArray2;
            }
            fqq fqq = new fqq((SparseIntArray) fbp.a(sparseIntArray), parcel.createStringArray(), parcel.readSparseArray(getClass().getClassLoader()), new SparseArray(), 0);
            return fqq;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new fqq[i];
        }
    };
    private static final Map<String, Serializable> a = Collections.synchronizedMap(new LinkedHashMap(64));
    private final SparseIntArray b;
    private final String[] c;
    private final SparseArray<Object> d;
    private final SparseArray<WeakReference<fqs>> e;

    /* renamed from: fqq$a */
    public static class a {
        private SparseIntArray a = new SparseIntArray();
        private Map<String, Integer> b = new HashMap(100);
        private int c;
        private SparseArray<Object> d = new SparseArray<>();
        private SparseArray<WeakReference<fqs>> e = new SparseArray<>();

        public final a a(fqm<?> fqm, fqs fqs) {
            this.e.put(fqm.b.intValue(), new WeakReference(fqs));
            return this;
        }

        public final a a(fqm<?> fqm, Serializable serializable) {
            this.d.put(fqm.b.intValue(), serializable);
            return this;
        }

        public final a a(fqm<?> fqm, String str) {
            Integer num = (Integer) this.b.get(str);
            if (num == null) {
                num = Integer.valueOf(this.c);
                this.c++;
                this.b.put(str, num);
            }
            this.a.put(fqm.b.intValue(), num.intValue());
            return this;
        }

        public final fqq a() {
            String[] strArr = new String[this.b.size()];
            for (Entry entry : this.b.entrySet()) {
                strArr[((Integer) entry.getValue()).intValue()] = (String) entry.getKey();
            }
            fqq fqq = new fqq(this.a, strArr, this.d, this.e, 0);
            this.a = null;
            this.b = null;
            this.d = null;
            this.e = null;
            return fqq;
        }
    }

    private fqq(SparseIntArray sparseIntArray, String[] strArr, SparseArray<Object> sparseArray, SparseArray<WeakReference<fqs>> sparseArray2) {
        this.b = sparseIntArray;
        this.c = strArr;
        this.d = sparseArray;
        this.e = sparseArray2;
    }

    /* synthetic */ fqq(SparseIntArray sparseIntArray, String[] strArr, SparseArray sparseArray, SparseArray sparseArray2, byte b2) {
        this(sparseIntArray, strArr, sparseArray, sparseArray2);
    }

    public static Map<String, Serializable> b() {
        return a;
    }

    private <T extends Serializable> T c(fqm<T> fqm) {
        String str = null;
        T t = (Serializable) this.d.get(fqm.b.intValue(), null);
        if (t == null) {
            int i = this.b.get(fqm.b.intValue(), -1);
            if (i != -1) {
                str = this.c[i];
            }
        }
        if (t == null && str == null) {
            StringBuilder sb = new StringBuilder("Value for ");
            sb.append(fqm.a);
            sb.append(" has not been set");
            throw new IllegalStateException(sb.toString());
        } else if (t != null) {
            return t;
        } else {
            try {
                return fqm.b(str);
            } catch (UnmappableValueException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public final <T extends Serializable> T a(fqm<T> fqm) {
        String str = null;
        T t = (Serializable) this.d.get(fqm.b.intValue(), null);
        if (t == null) {
            int i = this.b.get(fqm.b.intValue(), -1);
            if (i != -1) {
                str = this.c[i];
            }
        } else {
            a.remove(fqm.a);
            a.put(fqm.a, t);
        }
        if (t == null && str == null) {
            StringBuilder sb = new StringBuilder("Value for ");
            sb.append(fqm.a);
            sb.append(" has not been set. Don't panic and check if you have registered your FlagProvider in the FeatureFlags class.");
            throw new IllegalStateException(sb.toString());
        }
        if (t == null) {
            try {
                t = fqm.b(str);
                WeakReference weakReference = (WeakReference) this.e.get(fqm.b.intValue());
                if (weakReference != null) {
                    fqs fqs = (fqs) weakReference.get();
                    if (fqs != null) {
                        fqs.a(fqm, str);
                    }
                }
                a.remove(fqm.a);
                a.put(fqm.a, t);
            } catch (UnmappableValueException e2) {
                throw new AssertionError(e2);
            }
        }
        return t;
    }

    public final boolean a() {
        return true;
    }

    public final boolean a(fqn fqn, fqm<?> fqm) {
        if (!(fqn instanceof fqq)) {
            return c(fqm).equals(fqn.a(fqm));
        }
        return c(fqm).equals(((fqq) fqn).c(fqm));
    }

    public final <T extends Serializable> boolean b(fqm<T> fqm) {
        return fqm.a(a(fqm));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        juo.a(parcel, this.b);
        parcel.writeStringArray(this.c);
        parcel.writeSparseArray(this.d);
    }
}
