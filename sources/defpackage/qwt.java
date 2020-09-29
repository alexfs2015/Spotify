package defpackage;

import com.google.common.base.Function;
import com.spotify.music.features.trendingsearch.util.TrendingSearchesBehaviorFlag;
import java.io.Serializable;
import java.util.Locale;

/* renamed from: qwt reason: default package */
public final class qwt {
    private final rqb a;

    qwt(rqb rqb) {
        this.a = rqb;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Serializable serializable) {
        if (serializable != null) {
            if (fbn.a("enabled", serializable.toString().toLowerCase(Locale.getDefault()))) {
                return true;
            }
        }
        return false;
    }

    private static <T extends Serializable> boolean a(fqm<T>[] fqmArr, fbq<T> fbq, fqn fqn) {
        if (fqn != null) {
            fcp a2 = fcp.a((E[]) fqmArr);
            fqn.getClass();
            if (a2.a((Function<? super E, T>) new $$Lambda$MJue5oiF_VBCQ1bvmk6guH_iZ7g<Object,T>(fqn)).b(fbq)) {
                return true;
            }
        }
        return false;
    }

    private static <T extends Serializable> boolean a(fqm<T>[] fqmArr, fqn fqn) {
        return a(fqmArr, $$Lambda$qwt$OU_W9tqGcf_tX8w0NFA8YCiVTNA.INSTANCE, fqn);
    }

    public static boolean b(fqn fqn) {
        return fqn.a(qws.a) != TrendingSearchesBehaviorFlag.CONTROL;
    }

    private boolean c(fqn fqn) {
        return this.a.a(fqn) && a(qws.b, fqn);
    }

    public final boolean a(fqn fqn) {
        return b(fqn) || c(fqn);
    }
}
