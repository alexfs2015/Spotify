package defpackage;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseIntArray;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: jse reason: default package */
public final class jse {
    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static <T extends Enum<?>> void a(Parcel parcel, T t) {
        parcel.writeInt(t == null ? -1 : t.ordinal());
    }

    public static <T extends Enum<?>> T a(Parcel parcel, Class<T> cls) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return null;
        }
        return ((Enum[]) cls.getEnumConstants())[readInt];
    }

    public static void a(Parcel parcel, Set<String> set) {
        parcel.writeInt(set.size());
        for (String writeString : set) {
            parcel.writeString(writeString);
        }
    }

    public static Set<String> b(Parcel parcel) {
        int readInt = parcel.readInt();
        HashSet hashSet = new HashSet(readInt);
        for (int i = 0; i < readInt; i++) {
            hashSet.add(parcel.readString());
        }
        return hashSet;
    }

    public static void a(Parcel parcel, Map<String, ? extends Parcelable> map, int i) {
        a(parcel, map, jvm.a(), jvm.b(), i);
    }

    public static void a(Parcel parcel, Map<String, String> map) {
        a(parcel, map, jvm.a(), jvm.a(), 0);
    }

    private static <K, V> void a(Parcel parcel, Map<K, V> map, jvk<? super K> jvk, jvk<? super V> jvk2, int i) {
        parcel.writeInt(map.size());
        for (Entry entry : map.entrySet()) {
            fay.a(entry.getKey());
            fay.a(entry.getValue());
            jvk.a(entry.getKey(), parcel, i);
            jvk2.a(entry.getValue(), parcel, i);
        }
    }

    public static <V> ImmutableMap<String, V> a(Parcel parcel, Creator<V> creator) {
        return a(parcel, jvm.c(), creator);
    }

    private static <K, V> ImmutableMap<K, V> a(Parcel parcel, Creator<? extends K> creator, Creator<? extends V> creator2) {
        int readInt = parcel.readInt();
        a g = ImmutableMap.g();
        while (true) {
            int i = readInt - 1;
            if (readInt <= 0) {
                return g.b();
            }
            g.b(creator.createFromParcel(parcel), creator2.createFromParcel(parcel));
            readInt = i;
        }
    }

    public static void a(Parcel parcel, String str) {
        if (str != null) {
            a(parcel, true);
            parcel.writeString(str);
            return;
        }
        a(parcel, false);
    }

    public static String c(Parcel parcel) {
        if (a(parcel)) {
            return parcel.readString();
        }
        return null;
    }

    public static void a(Parcel parcel, SparseIntArray sparseIntArray) {
        if (sparseIntArray == null) {
            parcel.writeInt(-1);
            return;
        }
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            parcel.writeInt(sparseIntArray.keyAt(i));
            parcel.writeInt(sparseIntArray.valueAt(i));
        }
    }

    public static void a(Parcel parcel, Parcelable parcelable, int i) {
        if (VERSION.SDK_INT >= 23) {
            parcel.writeTypedObject(parcelable, i);
            return;
        }
        boolean z = parcelable != null;
        a(parcel, z);
        if (z) {
            parcelable.writeToParcel(parcel, i);
        }
    }

    public static <T extends Parcelable> T b(Parcel parcel, Creator<T> creator) {
        if (VERSION.SDK_INT >= 23) {
            return (Parcelable) parcel.readTypedObject(creator);
        }
        if (a(parcel)) {
            return (Parcelable) creator.createFromParcel(parcel);
        }
        return null;
    }
}
