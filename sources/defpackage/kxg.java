package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.io.Serializable;

/* renamed from: kxg reason: default package */
public final class kxg {
    private static final fqa[] a = {ind.e, ind.f, ind.g, ind.h, ind.i};

    public final boolean a(fpt fpt) {
        if (fpt != null) {
            if (!"premium".equals(fpt.a(guf.b)) || a(a, "Enabled", fpt)) {
                return true;
            }
        }
        return false;
    }

    private static <T extends Serializable> boolean a(fps<T>[] fpsArr, String str, fpt fpt) {
        if (fpt != null) {
            fbx a2 = fbx.a((E[]) fpsArr);
            fpt.getClass();
            if (!ImmutableList.a(a2.a((Function<? super E, T>) new $$Lambda$oh1lEtzABQ0PdDI2NjN5ziNdc_U<Object,T>(fpt)).a((faz<? super E>) new $$Lambda$kxg$mN3nebJodkI9YhK19t1AZ3IDdJk<Object>(str)).a()).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(String str, Serializable serializable) {
        return serializable != null && serializable.equals(str);
    }
}
