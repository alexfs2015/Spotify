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

/* renamed from: fpw reason: default package */
public final class fpw implements fpt {
    public static final Creator<fpw> CREATOR = new Creator<fpw>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new fpw[i];
        }

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
            fpw fpw = new fpw((SparseIntArray) fay.a(sparseIntArray), parcel.createStringArray(), parcel.readSparseArray(getClass().getClassLoader()), new SparseArray(), 0);
            return fpw;
        }
    };
    private static final Map<String, Serializable> a = Collections.synchronizedMap(new LinkedHashMap(64));
    private final SparseIntArray b;
    private final String[] c;
    private final SparseArray<Object> d;
    private final SparseArray<WeakReference<fpy>> e;

    /* renamed from: fpw$a */
    public static class a {
        private SparseIntArray a = new SparseIntArray();
        private Map<String, Integer> b = new HashMap(100);
        private int c;
        private SparseArray<Object> d = new SparseArray<>();
        private SparseArray<WeakReference<fpy>> e = new SparseArray<>();

        public final a a(fps<?> fps, String str) {
            Integer num = (Integer) this.b.get(str);
            if (num == null) {
                num = Integer.valueOf(this.c);
                this.c++;
                this.b.put(str, num);
            }
            this.a.put(fps.b.intValue(), num.intValue());
            return this;
        }

        public final a a(fps<?> fps, Serializable serializable) {
            this.d.put(fps.b.intValue(), serializable);
            return this;
        }

        public final a a(fps<?> fps, fpy fpy) {
            this.e.put(fps.b.intValue(), new WeakReference(fpy));
            return this;
        }

        public final fpw a() {
            String[] strArr = new String[this.b.size()];
            for (Entry entry : this.b.entrySet()) {
                strArr[((Integer) entry.getValue()).intValue()] = (String) entry.getKey();
            }
            fpw fpw = new fpw(this.a, strArr, this.d, this.e, 0);
            this.a = null;
            this.b = null;
            this.d = null;
            this.e = null;
            return fpw;
        }
    }

    public final boolean a() {
        return true;
    }

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ fpw(SparseIntArray sparseIntArray, String[] strArr, SparseArray sparseArray, SparseArray sparseArray2, byte b2) {
        this(sparseIntArray, strArr, sparseArray, sparseArray2);
    }

    private fpw(SparseIntArray sparseIntArray, String[] strArr, SparseArray<Object> sparseArray, SparseArray<WeakReference<fpy>> sparseArray2) {
        this.b = sparseIntArray;
        this.c = strArr;
        this.d = sparseArray;
        this.e = sparseArray2;
    }

    public final <T extends Serializable> T a(fps<T> fps) {
        String str = null;
        T t = (Serializable) this.d.get(fps.b.intValue(), null);
        if (t == null) {
            int i = this.b.get(fps.b.intValue(), -1);
            if (i != -1) {
                str = this.c[i];
            }
        } else {
            a.remove(fps.a);
            a.put(fps.a, t);
        }
        if (t == null && str == null) {
            StringBuilder sb = new StringBuilder("Value for ");
            sb.append(fps.a);
            sb.append(" has not been set. Don't panic and check if you have registered your FlagProvider in the FeatureFlags class.");
            throw new IllegalStateException(sb.toString());
        }
        if (t == null) {
            try {
                t = fps.b(str);
                WeakReference weakReference = (WeakReference) this.e.get(fps.b.intValue());
                if (weakReference != null) {
                    fpy fpy = (fpy) weakReference.get();
                    if (fpy != null) {
                        fpy.a(fps, str);
                    }
                }
                a.remove(fps.a);
                a.put(fps.a, t);
            } catch (UnmappableValueException e2) {
                throw new AssertionError(e2);
            }
        }
        return t;
    }

    public final <T extends Serializable> boolean b(fps<T> fps) {
        return fps.a(a(fps));
    }

    private <T extends Serializable> T c(fps<T> fps) {
        String str = null;
        T t = (Serializable) this.d.get(fps.b.intValue(), null);
        if (t == null) {
            int i = this.b.get(fps.b.intValue(), -1);
            if (i != -1) {
                str = this.c[i];
            }
        }
        if (t == null && str == null) {
            StringBuilder sb = new StringBuilder("Value for ");
            sb.append(fps.a);
            sb.append(" has not been set");
            throw new IllegalStateException(sb.toString());
        } else if (t != null) {
            return t;
        } else {
            try {
                return fps.b(str);
            } catch (UnmappableValueException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public final boolean a(fpt fpt, fps<?> fps) {
        if (!(fpt instanceof fpw)) {
            return c(fps).equals(fpt.a(fps));
        }
        return c(fps).equals(((fpw) fpt).c(fps));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        jse.a(parcel, this.b);
        parcel.writeStringArray(this.c);
        parcel.writeSparseArray(this.d);
    }

    public static Map<String, Serializable> b() {
        return a;
    }
}
