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

/* renamed from: hcu reason: default package */
public final class hcu {
    static ImmutableList<hcx> a(Parcel parcel) {
        ArrayList arrayList = new ArrayList(parcel.readInt());
        parcel.readTypedList(arrayList, hcx.CREATOR);
        return ImmutableList.a((Collection<? extends E>) arrayList);
    }

    public static ImmutableList<hcx> a(List<? extends hcm> list) {
        return (list == null || list.isEmpty()) ? ImmutableList.d() : ImmutableList.a(a((Iterable<? extends hcm>) list));
    }

    public static Iterable<hcx> a(Iterable<? extends hcm> iterable) {
        return (!(iterable instanceof ImmutableList) || !fdd.d(iterable, Predicates.a(hcx.class))) ? fcp.a(iterable).a((fbq<? super E>) ObjectPredicate.NOT_NULL).a((Function<? super E, T>) $$Lambda$w_Zzp_eLVmqF2Cb9bavYk7st98.INSTANCE) : iterable;
    }

    public static Iterable<hcx> a(hcm... hcmArr) {
        return hcmArr.length == 0 ? ImmutableList.d() : a((Iterable<? extends hcm>) fcp.a((E[]) hcmArr));
    }

    static void a(Parcel parcel, List<? extends hcx> list) {
        parcel.writeInt(list.size());
        parcel.writeTypedList(list);
    }

    private static boolean a(hcj hcj) {
        return hcj == null || hcj.keySet().isEmpty();
    }

    static boolean a(hcj hcj, hcj hcj2) {
        return hcj == hcj2 || (a(hcj) && a(hcj2));
    }

    static boolean a(hck hck, hck hck2) {
        if (hck == hck2) {
            return true;
        }
        if (hck == null) {
            hck = hcv.unknown();
        }
        if (hck2 == null) {
            hck2 = hcv.unknown();
        }
        return hck.equals(hck2);
    }

    static boolean a(hcl hcl, hcl hcl2) {
        if (hcl == hcl2) {
            return true;
        }
        if (hcl == null) {
            hcl = hcw.empty();
        }
        if (hcl2 == null) {
            hcl2 = hcw.empty();
        }
        return hcl.equals(hcl2);
    }

    static boolean a(hcm hcm, hcm hcm2) {
        if (hcm == hcm2) {
            return true;
        }
        if (hcm == null) {
            hcm = hcx.empty();
        }
        if (hcm2 == null) {
            hcm2 = hcx.empty();
        }
        return hcm.equals(hcm2);
    }

    static boolean a(hco hco, hco hco2) {
        if (hco == hco2) {
            return true;
        }
        if (hco == null) {
            hco = hcy.empty();
        }
        if (hco2 == null) {
            hco2 = hcy.empty();
        }
        return hco.equals(hco2);
    }

    private static boolean a(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    static boolean a(Collection<?> collection, Collection<?> collection2) {
        return collection == collection2 || (a(collection) && a(collection2));
    }

    private static boolean a(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    static boolean a(Map<?, ?> map, Map<?, ?> map2) {
        return map == map2 || (a(map) && a(map2));
    }

    public static Iterable<hcx> b(List<? extends hcm> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return a((Iterable<? extends hcm>) list);
    }
}
