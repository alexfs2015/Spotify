package defpackage;

import com.google.common.base.Function;
import com.spotify.music.features.trendingsearch.util.TrendingSearchesBehaviorFlag;
import java.io.Serializable;
import java.util.Locale;

/* renamed from: qok reason: default package */
public final class qok {
    private final rgz a;

    qok(rgz rgz) {
        this.a = rgz;
    }

    public final boolean a(fpt fpt) {
        return b(fpt) || c(fpt);
    }

    public static boolean b(fpt fpt) {
        return fpt.a(qoj.a) != TrendingSearchesBehaviorFlag.CONTROL;
    }

    private boolean c(fpt fpt) {
        return this.a.a(fpt) && a(qoj.b, fpt);
    }

    private static <T extends Serializable> boolean a(fps<T>[] fpsArr, fpt fpt) {
        return a(fpsArr, $$Lambda$qok$0hA36Ow1z_Oz6moCtYtduyhiRns.INSTANCE, fpt);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Serializable serializable) {
        if (serializable != null) {
            if (faw.a("enabled", serializable.toString().toLowerCase(Locale.getDefault()))) {
                return true;
            }
        }
        return false;
    }

    private static <T extends Serializable> boolean a(fps<T>[] fpsArr, faz<T> faz, fpt fpt) {
        if (fpt != null) {
            fbx a2 = fbx.a((E[]) fpsArr);
            fpt.getClass();
            if (a2.a((Function<? super E, T>) new $$Lambda$oh1lEtzABQ0PdDI2NjN5ziNdc_U<Object,T>(fpt)).b(faz)) {
                return true;
            }
        }
        return false;
    }
}
