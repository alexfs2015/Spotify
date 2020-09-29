package defpackage;

import android.os.Bundle;
import com.spotify.cosmos.android.RxResolver;

/* renamed from: nfg reason: default package */
public interface nfg {

    /* renamed from: nfg$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean a(rgz rgz, twu twu, fpt fpt) {
            return rgz.a(fpt) && !twu.a(fpt);
        }

        public static hde a(RxResolver rxResolver, rnf rnf, boolean z) {
            hde hde = new hde(rxResolver, rnf, 12, true, !z, !z, true);
            return hde;
        }

        public static ndq a(ghm ghm) {
            return (ndq) ghm.a(ndq.class);
        }

        public static String a(Bundle bundle) {
            return bundle.getString("space-id", "");
        }
    }
}
