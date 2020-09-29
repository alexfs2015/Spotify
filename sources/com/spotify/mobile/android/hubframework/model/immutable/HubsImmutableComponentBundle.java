package com.spotify.mobile.android.hubframework.model.immutable;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Set;

public class HubsImmutableComponentBundle implements Parcelable, hcj {
    public static final Creator<HubsImmutableComponentBundle> CREATOR = new Creator<HubsImmutableComponentBundle>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Class<hcj> cls = hcj.class;
            Bundle readBundle = parcel.readBundle(hcj.class.getClassLoader());
            return (readBundle == null || readBundle.keySet().isEmpty()) ? HubsImmutableComponentBundle.EMPTY : HubsImmutableComponentBundle.create(readBundle);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new HubsImmutableComponentBundle[i];
        }
    };
    /* access modifiers changed from: private */
    public static final HubsImmutableComponentBundle EMPTY = create();
    private final a mImpl;

    final class a extends b {
        public final Bundle a;

        private a(Bundle bundle) {
            super(0);
            this.a = bundle;
        }

        /* synthetic */ a(HubsImmutableComponentBundle hubsImmutableComponentBundle, Bundle bundle, byte b2) {
            this(bundle);
        }

        private defpackage.hcj.a c() {
            return new b() {
                private final Bundle a = new Bundle(a.this.a);

                public final defpackage.hcj.a a(String str, double d) {
                    this.a.putDouble(str, d);
                    return this;
                }

                public final defpackage.hcj.a a(String str, float f) {
                    this.a.putFloat(str, f);
                    return this;
                }

                public final defpackage.hcj.a a(String str, int i) {
                    this.a.putInt(str, i);
                    return this;
                }

                public final defpackage.hcj.a a(String str, long j) {
                    this.a.putLong(str, j);
                    return this;
                }

                public final defpackage.hcj.a a(String str, Parcelable parcelable) {
                    this.a.putParcelable(str, parcelable);
                    return this;
                }

                public final defpackage.hcj.a a(String str, hcj hcj) {
                    this.a.putParcelable(str, HubsImmutableComponentBundle.fromNullable(hcj));
                    return this;
                }

                public final defpackage.hcj.a a(String str, Serializable serializable) {
                    this.a.putSerializable(str, serializable);
                    return this;
                }

                public final defpackage.hcj.a a(String str, String str2) {
                    this.a.putString(str, str2);
                    return this;
                }

                public final defpackage.hcj.a a(String str, boolean z) {
                    this.a.putBoolean(str, z);
                    return this;
                }

                public final defpackage.hcj.a a(String str, double[] dArr) {
                    this.a.putDoubleArray(str, dArr);
                    return this;
                }

                public final defpackage.hcj.a a(String str, int[] iArr) {
                    this.a.putIntArray(str, iArr);
                    return this;
                }

                public final defpackage.hcj.a a(String str, long[] jArr) {
                    this.a.putLongArray(str, jArr);
                    return this;
                }

                public final defpackage.hcj.a a(String str, hcj[] hcjArr) {
                    HubsImmutableComponentBundle[] hubsImmutableComponentBundleArr;
                    if (hcjArr instanceof HubsImmutableComponentBundle[]) {
                        hubsImmutableComponentBundleArr = (HubsImmutableComponentBundle[]) hcjArr;
                    } else if (hcjArr != null) {
                        HubsImmutableComponentBundle[] hubsImmutableComponentBundleArr2 = new HubsImmutableComponentBundle[hcjArr.length];
                        for (int i = 0; i < hcjArr.length; i++) {
                            hubsImmutableComponentBundleArr2[i] = HubsImmutableComponentBundle.fromNullable(hcjArr[i]);
                        }
                        Parcelable[] parcelableArr = hubsImmutableComponentBundleArr2;
                        hubsImmutableComponentBundleArr = hubsImmutableComponentBundleArr2;
                    } else {
                        hubsImmutableComponentBundleArr = null;
                    }
                    this.a.putParcelableArray(str, hubsImmutableComponentBundleArr);
                    return this;
                }

                public final defpackage.hcj.a a(String str, String[] strArr) {
                    this.a.putStringArray(str, strArr);
                    return this;
                }

                public final defpackage.hcj.a a(String str, boolean[] zArr) {
                    this.a.putBooleanArray(str, zArr);
                    return this;
                }

                public final /* synthetic */ hcj a() {
                    return HubsImmutableComponentBundle.create(new Bundle(this.a));
                }

                /* access modifiers changed from: 0000 */
                public final boolean b() {
                    return this.a.isEmpty();
                }
            };
        }

        public final defpackage.hcj.a a(String str, double d) {
            Class<Double> cls = Double.class;
            return fbn.a(HubsImmutableComponentBundle.this.getTyped(str, Double.class), Double.valueOf(d)) ? this : c().a(str, d);
        }

        public final defpackage.hcj.a a(String str, float f) {
            return fbn.a(HubsImmutableComponentBundle.this.getTyped(str, Float.class), Float.valueOf(f)) ? this : c().a(str, f);
        }

        public final defpackage.hcj.a a(String str, int i) {
            Class<Integer> cls = Integer.class;
            return fbn.a(HubsImmutableComponentBundle.this.getTyped(str, Integer.class), Integer.valueOf(i)) ? this : c().a(str, i);
        }

        public final defpackage.hcj.a a(String str, long j) {
            Class<Long> cls = Long.class;
            return fbn.a(HubsImmutableComponentBundle.this.getTyped(str, Long.class), Long.valueOf(j)) ? this : c().a(str, j);
        }

        public final defpackage.hcj.a a(String str, Parcelable parcelable) {
            Class<Parcelable> cls = Parcelable.class;
            return fbn.a(HubsImmutableComponentBundle.this.getTyped(str, Parcelable.class), parcelable) ? this : c().a(str, parcelable);
        }

        public final defpackage.hcj.a a(String str, hcj hcj) {
            Class<hcj> cls = hcj.class;
            return fbn.a(HubsImmutableComponentBundle.this.getTyped(str, hcj.class), hcj) ? this : c().a(str, hcj);
        }

        public final defpackage.hcj.a a(String str, Serializable serializable) {
            Class<Serializable> cls = Serializable.class;
            return fbn.a(HubsImmutableComponentBundle.this.getTyped(str, Serializable.class), serializable) ? this : c().a(str, serializable);
        }

        public final defpackage.hcj.a a(String str, String str2) {
            Class<String> cls = String.class;
            return fbn.a(HubsImmutableComponentBundle.this.getTyped(str, String.class), str2) ? this : c().a(str, str2);
        }

        public final defpackage.hcj.a a(String str, boolean z) {
            return fbn.a(HubsImmutableComponentBundle.this.getTyped(str, Boolean.class), Boolean.valueOf(z)) ? this : c().a(str, z);
        }

        public final defpackage.hcj.a a(String str, double[] dArr) {
            Class<double[]> cls = double[].class;
            return Arrays.equals((double[]) HubsImmutableComponentBundle.this.getTyped(str, double[].class), dArr) ? this : c().a(str, dArr);
        }

        public final defpackage.hcj.a a(String str, int[] iArr) {
            return Arrays.equals((int[]) HubsImmutableComponentBundle.this.getTyped(str, int[].class), iArr) ? this : c().a(str, iArr);
        }

        public final defpackage.hcj.a a(String str, long[] jArr) {
            return Arrays.equals((long[]) HubsImmutableComponentBundle.this.getTyped(str, long[].class), jArr) ? this : c().a(str, jArr);
        }

        public final defpackage.hcj.a a(String str, hcj[] hcjArr) {
            return Arrays.equals((Object[]) HubsImmutableComponentBundle.this.getTyped(str, hcj[].class), hcjArr) ? this : c().a(str, hcjArr);
        }

        public final defpackage.hcj.a a(String str, String[] strArr) {
            return c().a(str, strArr);
        }

        public final defpackage.hcj.a a(String str, boolean[] zArr) {
            Class<boolean[]> cls = boolean[].class;
            return Arrays.equals((boolean[]) HubsImmutableComponentBundle.this.getTyped(str, boolean[].class), zArr) ? this : c().a(str, zArr);
        }

        public final /* bridge */ /* synthetic */ hcj a() {
            return HubsImmutableComponentBundle.this;
        }

        /* access modifiers changed from: 0000 */
        public final boolean b() {
            return HubsImmutableComponentBundle.this.keySet().isEmpty();
        }
    }

    static abstract class b extends defpackage.hcj.a {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final defpackage.hcj.a a(hcj hcj) {
            return b() ? hcj.toBuilder() : super.a(hcj);
        }

        /* access modifiers changed from: 0000 */
        public abstract boolean b();
    }

    interface c<N extends Number> {
        N get(Number number);
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

    private static boolean arrayEquals(Object obj, Object obj2) {
        Class<String> componentType = obj.getClass().getComponentType();
        if (componentType != (obj2 != null ? obj2.getClass().getComponentType() : null)) {
            return false;
        }
        return componentType == String.class ? Arrays.equals((String[]) obj, (String[]) obj2) : componentType == Long.TYPE ? Arrays.equals((long[]) obj, (long[]) obj2) : componentType == Double.TYPE ? Arrays.equals((double[]) obj, (double[]) obj2) : componentType == Boolean.TYPE ? Arrays.equals((boolean[]) obj, (boolean[]) obj2) : componentType == Integer.TYPE ? Arrays.equals((int[]) obj, (int[]) obj2) : componentType == Float.TYPE ? Arrays.equals((float[]) obj, (float[]) obj2) : componentType == Byte.TYPE ? Arrays.equals((byte[]) obj, (byte[]) obj2) : Arrays.equals((Object[]) obj, (Object[]) obj2);
    }

    private static int arrayHash(Object obj) {
        Class<String> componentType = obj.getClass().getComponentType();
        int i = componentType == String.class ? Arrays.hashCode((String[]) obj) : componentType == Long.TYPE ? Arrays.hashCode((long[]) obj) : componentType == Double.TYPE ? Arrays.hashCode((double[]) obj) : componentType == Boolean.TYPE ? Arrays.hashCode((boolean[]) obj) : obj instanceof hcj[] ? Arrays.hashCode((hcj[]) obj) : componentType == Integer.TYPE ? Arrays.hashCode((int[]) obj) : componentType == Float.TYPE ? Arrays.hashCode((float[]) obj) : obj.hashCode();
        return i + 31;
    }

    public static defpackage.hcj.a builder() {
        return EMPTY.toBuilder();
    }

    public static HubsImmutableComponentBundle create() {
        return new HubsImmutableComponentBundle();
    }

    /* access modifiers changed from: private */
    public static HubsImmutableComponentBundle create(Bundle bundle) {
        return new HubsImmutableComponentBundle(bundle);
    }

    public static HubsImmutableComponentBundle fromNullable(hcj hcj) {
        return hcj == null ? create() : hcj instanceof HubsImmutableComponentBundle ? (HubsImmutableComponentBundle) hcj : (HubsImmutableComponentBundle) builder().a(hcj).a();
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

    public boolean[] boolArray(String str) {
        Class<boolean[]> cls = boolean[].class;
        return (boolean[]) getTyped(str, boolean[].class);
    }

    public Boolean boolValue(String str) {
        Class<Boolean> cls = Boolean.class;
        return (Boolean) getTyped(str, Boolean.class);
    }

    public boolean boolValue(String str, boolean z) {
        Class<Boolean> cls = Boolean.class;
        Boolean bool = (Boolean) getTyped(str, Boolean.class);
        return bool != null ? bool.booleanValue() : z;
    }

    public hcj bundle(String str) {
        Class<hcj> cls = hcj.class;
        return (hcj) getTyped(str, hcj.class);
    }

    public hcj[] bundleArray(String str) {
        Class<hcj[]> cls = hcj[].class;
        return (hcj[]) getTyped(str, hcj[].class);
    }

    public byte[] byteArray(String str) {
        Class<byte[]> cls = byte[].class;
        return (byte[]) getTyped(str, byte[].class);
    }

    public int describeContents() {
        return 0;
    }

    public double[] doubleArray(String str) {
        Class<double[]> cls = double[].class;
        return (double[]) getTyped(str, double[].class);
    }

    public double doubleValue(String str, double d) {
        Double d2 = (Double) getNumber(str, $$Lambda$6ZtFF7R7153xXORygokhHFp_las.INSTANCE);
        return d2 != null ? d2.doubleValue() : d;
    }

    public Double doubleValue(String str) {
        return (Double) getNumber(str, $$Lambda$6ZtFF7R7153xXORygokhHFp_las.INSTANCE);
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

    public float[] floatArray(String str) {
        return (float[]) getTyped(str, float[].class);
    }

    public float floatValue(String str, float f) {
        Float f2 = (Float) getNumber(str, $$Lambda$xjfUSD2jxSwqJjlLIVoQWsfLKK8.INSTANCE);
        return f2 != null ? f2.floatValue() : f;
    }

    public Float floatValue(String str) {
        return (Float) getNumber(str, $$Lambda$xjfUSD2jxSwqJjlLIVoQWsfLKK8.INSTANCE);
    }

    public Object get(String str) {
        return this.mImpl.a.get(str);
    }

    public int hashCode() {
        int i = 1;
        for (String str : keySet()) {
            Object obj = get(str);
            int i2 = obj == null ? 0 : obj.getClass().isArray() ? arrayHash(obj) : obj.hashCode();
            i = (i * 31) + i2;
        }
        return i;
    }

    public int[] intArray(String str) {
        Class<int[]> cls = int[].class;
        return (int[]) getTyped(str, int[].class);
    }

    public int intValue(String str, int i) {
        Integer num = (Integer) getNumber(str, $$Lambda$rJvclf32QaCRdftq__4Y0s9Zq04.INSTANCE);
        return num != null ? num.intValue() : i;
    }

    public Integer intValue(String str) {
        return (Integer) getNumber(str, $$Lambda$rJvclf32QaCRdftq__4Y0s9Zq04.INSTANCE);
    }

    public Set<String> keySet() {
        return this.mImpl.a.keySet();
    }

    public long[] longArray(String str) {
        Class<long[]> cls = long[].class;
        return (long[]) getTyped(str, long[].class);
    }

    public long longValue(String str, long j) {
        Long l = (Long) getNumber(str, $$Lambda$WUFt3SrJayeiiqVvITl2vHdeAVI.INSTANCE);
        return l != null ? l.longValue() : j;
    }

    public Long longValue(String str) {
        return (Long) getNumber(str, $$Lambda$WUFt3SrJayeiiqVvITl2vHdeAVI.INSTANCE);
    }

    public String string(String str) {
        Class<String> cls = String.class;
        return (String) getTyped(str, String.class);
    }

    public String string(String str, String str2) {
        Class<String> cls = String.class;
        String str3 = (String) getTyped(str, String.class);
        return str3 != null ? str3 : str2;
    }

    public String[] stringArray(String str) {
        Class<String[]> cls = String[].class;
        return (String[]) getTyped(str, String[].class);
    }

    public defpackage.hcj.a toBuilder() {
        return this.mImpl;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.mImpl.a);
    }
}
