package defpackage;

import android.util.SparseArray;
import com.google.common.base.Function;

/* renamed from: gyx reason: default package */
public final class gyx {
    private static final gbt<gzr, String> a = $$Lambda$gyx$9ip_LRUKMTfXe5VsbBuUkL38SY.INSTANCE;
    /* access modifiers changed from: private */
    public static final gbt<gyw, Integer> b = $$Lambda$gyx$JkRQGlH6w_YEeb2INrZwKqbhog.INSTANCE;

    public static gbt<gzr, String> a() {
        return a;
    }

    public static <T extends Enum<T> & gyw> gbj<SparseArray<gui<?>>> a(Class<T> cls) {
        return gbj.a(new $$Lambda$gyx$KRiCIHxndoToI9UAdesQ95QutWA(cls));
    }

    public static <T extends Enum<T> & gzr & gyw> gul b(Class<T> cls) {
        final gbg a2 = gbg.a(cls, a);
        return new gul() {
            public final int resolve(gzt gzt) {
                fay.a(gzt);
                return ((Integer) a2.b(gzt.componentId().id()).a((Function<? super T, V>) $$Lambda$gyx$1$af5uBhlZ9MrG32kLxP3c0rjUak.INSTANCE).a(Integer.valueOf(0))).intValue();
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ Integer a(Enum enumR) {
                return (Integer) gyx.b.apply(enumR);
            }
        };
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ SparseArray c(Class cls) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        SparseArray sparseArray = new SparseArray(enumArr.length);
        for (Enum enumR : enumArr) {
            gyw gyw = (gyw) enumR;
            sparseArray.put(gyw.a(), gyw.b());
        }
        return sparseArray;
    }
}
