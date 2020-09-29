package defpackage;

import android.util.SparseArray;
import com.google.common.base.Function;

/* renamed from: hbq reason: default package */
public final class hbq {
    private static final gcr<hck, String> a = $$Lambda$hbq$yhTNXk8qctSIxbObOVuxypg7X5I.INSTANCE;
    /* access modifiers changed from: private */
    public static final gcr<hbp, Integer> b = $$Lambda$hbq$fFI_gxaTuGhFnAktMI4PnaTCXLw.INSTANCE;

    public static <T extends Enum<T> & hbp> gch<SparseArray<gwi<?>>> a(Class<T> cls) {
        return gch.a(new $$Lambda$hbq$W2BYKTkNxRnPcG01SKEwMMoUnNE(cls));
    }

    public static gcr<hck, String> a() {
        return a;
    }

    public static <T extends Enum<T> & hck & hbp> gwl b(Class<T> cls) {
        final gce a2 = gce.a(cls, a);
        return new gwl() {
            /* access modifiers changed from: private */
            public static /* synthetic */ Integer a(Enum enumR) {
                return (Integer) hbq.b.apply(enumR);
            }

            public final int resolve(hcm hcm) {
                fbp.a(hcm);
                return ((Integer) a2.b(hcm.componentId().id()).a((Function<? super T, V>) $$Lambda$hbq$1$M8JBjOaJLVw5FfzUIcQ5v9d5oX8.INSTANCE).a(Integer.valueOf(0))).intValue();
            }
        };
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ SparseArray c(Class cls) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        SparseArray sparseArray = new SparseArray(enumArr.length);
        for (Enum enumR : enumArr) {
            hbp hbp = (hbp) enumR;
            sparseArray.put(hbp.a(), hbp.b());
        }
        return sparseArray;
    }
}
