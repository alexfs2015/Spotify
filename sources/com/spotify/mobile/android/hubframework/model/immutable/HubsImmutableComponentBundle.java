package com.spotify.mobile.android.hubframework.model.immutable;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Set;

public class HubsImmutableComponentBundle implements Parcelable, gzq {
    public static final Creator<HubsImmutableComponentBundle> CREATOR = new Creator<HubsImmutableComponentBundle>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new HubsImmutableComponentBundle[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Bundle readBundle = parcel.readBundle(gzq.class.getClassLoader());
            if (readBundle == null || readBundle.keySet().isEmpty()) {
                return HubsImmutableComponentBundle.EMPTY;
            }
            return HubsImmutableComponentBundle.create(readBundle);
        }
    };
    /* access modifiers changed from: private */
    public static final HubsImmutableComponentBundle EMPTY = create();
    private final a mImpl;

    final class a extends b {
        public final Bundle a;

        /* synthetic */ a(HubsImmutableComponentBundle hubsImmutableComponentBundle, Bundle bundle, byte b2) {
            this(bundle);
        }

        private a(Bundle bundle) {
            super(0);
            this.a = bundle;
        }

        public final defpackage.gzq.a a(String str, String str2) {
            if (faw.a(HubsImmutableComponentBundle.this.getTyped(str, String.class), str2)) {
                return this;
            }
            return c().a(str, str2);
        }

        public final defpackage.gzq.a a(String str, int i) {
            if (faw.a(HubsImmutableComponentBundle.this.getTyped(str, Integer.class), Integer.valueOf(i))) {
                return this;
            }
            return c().a(str, i);
        }

        public final defpackage.gzq.a a(String str, long j) {
            if (faw.a(HubsImmutableComponentBundle.this.getTyped(str, Long.class), Long.valueOf(j))) {
                return this;
            }
            return c().a(str, j);
        }

        public final defpackage.gzq.a a(String str, float f) {
            if (faw.a(HubsImmutableComponentBundle.this.getTyped(str, Float.class), Float.valueOf(f))) {
                return this;
            }
            return c().a(str, f);
        }

        public final defpackage.gzq.a a(String str, double d) {
            if (faw.a(HubsImmutableComponentBundle.this.getTyped(str, Double.class), Double.valueOf(d))) {
                return this;
            }
            return c().a(str, d);
        }

        public final defpackage.gzq.a a(String str, boolean z) {
            if (faw.a(HubsImmutableComponentBundle.this.getTyped(str, Boolean.class), Boolean.valueOf(z))) {
                return this;
            }
            return c().a(str, z);
        }

        public final defpackage.gzq.a a(String str, gzq gzq) {
            if (faw.a(HubsImmutableComponentBundle.this.getTyped(str, gzq.class), gzq)) {
                return this;
            }
            return c().a(str, gzq);
        }

        public final defpackage.gzq.a a(String str, String[] strArr) {
            return c().a(str, strArr);
        }

        public final defpackage.gzq.a a(String str, int[] iArr) {
            if (Arrays.equals((int[]) HubsImmutableComponentBundle.this.getTyped(str, int[].class), iArr)) {
                return this;
            }
            return c().a(str, iArr);
        }

        public final defpackage.gzq.a a(String str, long[] jArr) {
            if (Arrays.equals((long[]) HubsImmutableComponentBundle.this.getTyped(str, long[].class), jArr)) {
                return this;
            }
            return c().a(str, jArr);
        }

        public final defpackage.gzq.a a(String str, double[] dArr) {
            if (Arrays.equals((double[]) HubsImmutableComponentBundle.this.getTyped(str, double[].class), dArr)) {
                return this;
            }
            return c().a(str, dArr);
        }

        public final defpackage.gzq.a a(String str, gzq[] gzqArr) {
            if (Arrays.equals((Object[]) HubsImmutableComponentBundle.this.getTyped(str, gzq[].class), gzqArr)) {
                return this;
            }
            return c().a(str, gzqArr);
        }

        public final defpackage.gzq.a a(String str, Serializable serializable) {
            if (faw.a(HubsImmutableComponentBundle.this.getTyped(str, Serializable.class), serializable)) {
                return this;
            }
            return c().a(str, serializable);
        }

        public final defpackage.gzq.a a(String str, Parcelable parcelable) {
            if (faw.a(HubsImmutableComponentBundle.this.getTyped(str, Parcelable.class), parcelable)) {
                return this;
            }
            return c().a(str, parcelable);
        }

        public final defpackage.gzq.a a(String str, boolean[] zArr) {
            if (Arrays.equals((boolean[]) HubsImmutableComponentBundle.this.getTyped(str, boolean[].class), zArr)) {
                return this;
            }
            return c().a(str, zArr);
        }

        /* access modifiers changed from: 0000 */
        public final boolean b() {
            return HubsImmutableComponentBundle.this.keySet().isEmpty();
        }

        private defpackage.gzq.a c() {
            return new b() {
                private final Bundle a = new Bundle(a.this.a);

                public final defpackage.gzq.a a(String str, String str2) {
                    this.a.putString(str, str2);
                    return this;
                }

                public final defpackage.gzq.a a(String str, int i) {
                    this.a.putInt(str, i);
                    return this;
                }

                public final defpackage.gzq.a a(String str, long j) {
                    this.a.putLong(str, j);
                    return this;
                }

                public final defpackage.gzq.a a(String str, float f) {
                    this.a.putFloat(str, f);
                    return this;
                }

                public final defpackage.gzq.a a(String str, double d) {
                    this.a.putDouble(str, d);
                    return this;
                }

                public final defpackage.gzq.a a(String str, boolean z) {
                    this.a.putBoolean(str, z);
                    return this;
                }

                public final defpackage.gzq.a a(String str, gzq gzq) {
                    this.a.putParcelable(str, HubsImmutableComponentBundle.fromNullable(gzq));
                    return this;
                }

                public final defpackage.gzq.a a(String str, String[] strArr) {
                    this.a.putStringArray(str, strArr);
                    return this;
                }

                public final defpackage.gzq.a a(String str, int[] iArr) {
                    this.a.putIntArray(str, iArr);
                    return this;
                }

                public final defpackage.gzq.a a(String str, long[] jArr) {
                    this.a.putLongArray(str, jArr);
                    return this;
                }

                public final defpackage.gzq.a a(String str, double[] dArr) {
                    this.a.putDoubleArray(str, dArr);
                    return this;
                }

                public final defpackage.gzq.a a(String str, gzq[] gzqArr) {
                    HubsImmutableComponentBundle[] hubsImmutableComponentBundleArr;
                    if (gzqArr instanceof HubsImmutableComponentBundle[]) {
                        hubsImmutableComponentBundleArr = (HubsImmutableComponentBundle[]) gzqArr;
                    } else if (gzqArr != null) {
                        HubsImmutableComponentBundle[] hubsImmutableComponentBundleArr2 = new HubsImmutableComponentBundle[gzqArr.length];
                        for (int i = 0; i < gzqArr.length; i++) {
                            hubsImmutableComponentBundleArr2[i] = HubsImmutableComponentBundle.fromNullable(gzqArr[i]);
                        }
                        hubsImmutableComponentBundleArr = hubsImmutableComponentBundleArr2;
                    } else {
                        hubsImmutableComponentBundleArr = null;
                    }
                    this.a.putParcelableArray(str, hubsImmutableComponentBundleArr);
                    return this;
                }

                public final defpackage.gzq.a a(String str, Serializable serializable) {
                    this.a.putSerializable(str, serializable);
                    return this;
                }

                public final defpackage.gzq.a a(String str, Parcelable parcelable) {
                    this.a.putParcelable(str, parcelable);
                    return this;
                }

                public final defpackage.gzq.a a(String str, boolean[] zArr) {
                    this.a.putBooleanArray(str, zArr);
                    return this;
                }

                /* access modifiers changed from: 0000 */
                public final boolean b() {
                    return this.a.isEmpty();
                }

                public final /* synthetic */ gzq a() {
                    return HubsImmutableComponentBundle.create(new Bundle(this.a));
                }
            };
        }

        public final /* bridge */ /* synthetic */ gzq a() {
            return HubsImmutableComponentBundle.this;
        }
    }

    static abstract class b extends defpackage.gzq.a {
        /* access modifiers changed from: 0000 */
        public abstract boolean b();

        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final defpackage.gzq.a a(gzq gzq) {
            return b() ? gzq.toBuilder() : super.a(gzq);
        }
    }

    interface c<N extends Number> {
        N get(Number number);
    }

    public int describeContents() {
        return 0;
    }

    public static HubsImmutableComponentBundle fromNullable(gzq gzq) {
        if (gzq == null) {
            return create();
        }
        if (gzq instanceof HubsImmutableComponentBundle) {
            return (HubsImmutableComponentBundle) gzq;
        }
        return (HubsImmutableComponentBundle) builder().a(gzq).a();
    }

    public static HubsImmutableComponentBundle create() {
        return new HubsImmutableComponentBundle();
    }

    /* access modifiers changed from: private */
    public static HubsImmutableComponentBundle create(Bundle bundle) {
        return new HubsImmutableComponentBundle(bundle);
    }

    public static defpackage.gzq.a builder() {
        return EMPTY.toBuilder();
    }

    public defpackage.gzq.a toBuilder() {
        return this.mImpl;
    }

    protected HubsImmutableComponentBundle() {
        this(new Bundle());
    }

    protected HubsImmutableComponentBundle(Bundle bundle) {
        this.mImpl = new a(this, bundle, 0);
    }

    protected HubsImmutableComponentBundle(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        this.mImpl = hubsImmutableComponentBundle.mImpl;
    }

    public String string(String str) {
        return (String) getTyped(str, String.class);
    }

    public String string(String str, String str2) {
        String str3 = (String) getTyped(str, String.class);
        return str3 != null ? str3 : str2;
    }

    public int intValue(String str, int i) {
        Integer num = (Integer) getNumber(str, $$Lambda$rJvclf32QaCRdftq__4Y0s9Zq04.INSTANCE);
        return num != null ? num.intValue() : i;
    }

    public Integer intValue(String str) {
        return (Integer) getNumber(str, $$Lambda$rJvclf32QaCRdftq__4Y0s9Zq04.INSTANCE);
    }

    public long longValue(String str, long j) {
        Long l = (Long) getNumber(str, $$Lambda$WUFt3SrJayeiiqVvITl2vHdeAVI.INSTANCE);
        return l != null ? l.longValue() : j;
    }

    public Long longValue(String str) {
        return (Long) getNumber(str, $$Lambda$WUFt3SrJayeiiqVvITl2vHdeAVI.INSTANCE);
    }

    public float floatValue(String str, float f) {
        Float f2 = (Float) getNumber(str, $$Lambda$xjfUSD2jxSwqJjlLIVoQWsfLKK8.INSTANCE);
        return f2 != null ? f2.floatValue() : f;
    }

    public Float floatValue(String str) {
        return (Float) getNumber(str, $$Lambda$xjfUSD2jxSwqJjlLIVoQWsfLKK8.INSTANCE);
    }

    public double doubleValue(String str, double d) {
        Double d2 = (Double) getNumber(str, $$Lambda$6ZtFF7R7153xXORygokhHFp_las.INSTANCE);
        return d2 != null ? d2.doubleValue() : d;
    }

    public Double doubleValue(String str) {
        return (Double) getNumber(str, $$Lambda$6ZtFF7R7153xXORygokhHFp_las.INSTANCE);
    }

    public boolean boolValue(String str, boolean z) {
        Boolean bool = (Boolean) getTyped(str, Boolean.class);
        return bool != null ? bool.booleanValue() : z;
    }

    public Boolean boolValue(String str) {
        return (Boolean) getTyped(str, Boolean.class);
    }

    public gzq bundle(String str) {
        return (gzq) getTyped(str, gzq.class);
    }

    public String[] stringArray(String str) {
        return (String[]) getTyped(str, String[].class);
    }

    public int[] intArray(String str) {
        return (int[]) getTyped(str, int[].class);
    }

    public byte[] byteArray(String str) {
        return (byte[]) getTyped(str, byte[].class);
    }

    public long[] longArray(String str) {
        return (long[]) getTyped(str, long[].class);
    }

    public float[] floatArray(String str) {
        return (float[]) getTyped(str, float[].class);
    }

    public double[] doubleArray(String str) {
        return (double[]) getTyped(str, double[].class);
    }

    public gzq[] bundleArray(String str) {
        return (gzq[]) getTyped(str, gzq[].class);
    }

    public boolean[] boolArray(String str) {
        return (boolean[]) getTyped(str, boolean[].class);
    }

    public Set<String> keySet() {
        return this.mImpl.a.keySet();
    }

    public Object get(String str) {
        return this.mImpl.a.get(str);
    }

    private <N extends Number> N getNumber(String str, c<N> cVar) {
        Number number = (Number) getTyped(str, Number.class);
        if (number != null) {
            return cVar.get(number);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public <T> T getTyped(String str, Class<T> cls) {
        T t = this.mImpl.a.get(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.mImpl.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HubsImmutableComponentBundle)) {
            return false;
        }
        HubsImmutableComponentBundle hubsImmutableComponentBundle = (HubsImmutableComponentBundle) obj;
        Bundle bundle = this.mImpl.a;
        Bundle bundle2 = hubsImmutableComponentBundle.mImpl.a;
        if (!bundle.keySet().equals(bundle2.keySet())) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj2 = bundle.get(str);
            if (obj2 == null) {
                if (bundle2.get(str) != null) {
                    return false;
                }
            } else if (obj2.getClass().isArray()) {
                if (!arrayEquals(obj2, bundle2.get(str))) {
                    return false;
                }
            } else if (!obj2.equals(bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    private static boolean arrayEquals(Object obj, Object obj2) {
        Class<String> componentType = obj.getClass().getComponentType();
        if (componentType != (obj2 != null ? obj2.getClass().getComponentType() : null)) {
            return false;
        }
        if (componentType == String.class) {
            return Arrays.equals((String[]) obj, (String[]) obj2);
        }
        if (componentType == Long.TYPE) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if (componentType == Double.TYPE) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if (componentType == Boolean.TYPE) {
            return Arrays.equals((boolean[]) obj, (boolean[]) obj2);
        }
        if (componentType == Integer.TYPE) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if (componentType == Float.TYPE) {
            return Arrays.equals((float[]) obj, (float[]) obj2);
        }
        if (componentType == Byte.TYPE) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        return Arrays.equals((Object[]) obj, (Object[]) obj2);
    }

    public int hashCode() {
        int i;
        int i2 = 1;
        for (String str : keySet()) {
            Object obj = get(str);
            if (obj == null) {
                i = 0;
            } else if (obj.getClass().isArray()) {
                i = arrayHash(obj);
            } else {
                i = obj.hashCode();
            }
            i2 = (i2 * 31) + i;
        }
        return i2;
    }

    private static int arrayHash(Object obj) {
        int i;
        Class<String> componentType = obj.getClass().getComponentType();
        if (componentType == String.class) {
            i = Arrays.hashCode((String[]) obj);
        } else if (componentType == Long.TYPE) {
            i = Arrays.hashCode((long[]) obj);
        } else if (componentType == Double.TYPE) {
            i = Arrays.hashCode((double[]) obj);
        } else if (componentType == Boolean.TYPE) {
            i = Arrays.hashCode((boolean[]) obj);
        } else if (obj instanceof gzq[]) {
            i = Arrays.hashCode((gzq[]) obj);
        } else if (componentType == Integer.TYPE) {
            i = Arrays.hashCode((int[]) obj);
        } else if (componentType == Float.TYPE) {
            i = Arrays.hashCode((float[]) obj);
        } else {
            i = obj.hashCode();
        }
        return i + 31;
    }
}
