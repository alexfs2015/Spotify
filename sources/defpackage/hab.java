package defpackage;

import android.os.Parcel;
import com.google.common.base.Function;
import com.google.common.base.Predicates;
import com.google.common.base.Predicates.ObjectPredicate;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: hab reason: default package */
public final class hab {
    public static ImmutableList<hae> a(List<? extends gzt> list) {
        if (list == null || list.isEmpty()) {
            return ImmutableList.d();
        }
        return ImmutableList.a(a((Iterable<? extends gzt>) list));
    }

    public static Iterable<hae> b(List<? extends gzt> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return a((Iterable<? extends gzt>) list);
    }

    public static Iterable<hae> a(gzt... gztArr) {
        if (gztArr.length == 0) {
            return ImmutableList.d();
        }
        return a((Iterable<? extends gzt>) fbx.a((E[]) gztArr));
    }

    public static Iterable<hae> a(Iterable<? extends gzt> iterable) {
        return (!(iterable instanceof ImmutableList) || !fcl.d(iterable, Predicates.a(hae.class))) ? fbx.a(iterable).a((faz<? super E>) ObjectPredicate.NOT_NULL).a((Function<? super E, T>) $$Lambda$w2c47pcbYDKgUUTAfb92pjCxPCo.INSTANCE) : iterable;
    }

    static ImmutableList<hae> a(Parcel parcel) {
        ArrayList arrayList = new ArrayList(parcel.readInt());
        parcel.readTypedList(arrayList, hae.CREATOR);
        return ImmutableList.a((Collection<? extends E>) arrayList);
    }

    static void a(Parcel parcel, List<? extends hae> list) {
        parcel.writeInt(list.size());
        parcel.writeTypedList(list);
    }

    static boolean a(gzr gzr, gzr gzr2) {
        if (gzr == gzr2) {
            return true;
        }
        if (gzr == null) {
            gzr = hac.unknown();
        }
        if (gzr2 == null) {
            gzr2 = hac.unknown();
        }
        return gzr.equals(gzr2);
    }

    static boolean a(gzv gzv, gzv gzv2) {
        if (gzv == gzv2) {
            return true;
        }
        if (gzv == null) {
            gzv = haf.empty();
        }
        if (gzv2 == null) {
            gzv2 = haf.empty();
        }
        return gzv.equals(gzv2);
    }

    static boolean a(gzs gzs, gzs gzs2) {
        if (gzs == gzs2) {
            return true;
        }
        if (gzs == null) {
            gzs = had.empty();
        }
        if (gzs2 == null) {
            gzs2 = had.empty();
        }
        return gzs.equals(gzs2);
    }

    static boolean a(gzt gzt, gzt gzt2) {
        if (gzt == gzt2) {
            return true;
        }
        if (gzt == null) {
            gzt = hae.empty();
        }
        if (gzt2 == null) {
            gzt2 = hae.empty();
        }
        return gzt.equals(gzt2);
    }

    static boolean a(Map<?, ?> map, Map<?, ?> map2) {
        return map == map2 || (a(map) && a(map2));
    }

    static boolean a(Collection<?> collection, Collection<?> collection2) {
        return collection == collection2 || (a(collection) && a(collection2));
    }

    static boolean a(gzq gzq, gzq gzq2) {
        return gzq == gzq2 || (a(gzq) && a(gzq2));
    }

    private static boolean a(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    private static boolean a(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    private static boolean a(gzq gzq) {
        return gzq == null || gzq.keySet().isEmpty();
    }
}
