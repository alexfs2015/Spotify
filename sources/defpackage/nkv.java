package defpackage;

import android.os.Bundle;
import com.spotify.cosmos.android.RxResolver;

/* renamed from: nkv reason: default package */
public interface nkv {

    /* renamed from: nkv$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static hga a(RxResolver rxResolver, rwl rwl, boolean z) {
            hga hga = new hga(rxResolver, rwl, 12, true, !z, !z, true);
            return hga;
        }

        public static String a(Bundle bundle) {
            return bundle.getString("space-id", "");
        }

        public static njf a(gix gix) {
            return (njf) gix.a(njf.class);
        }

        public static boolean a(rqb rqb, uix uix, fqn fqn) {
            return rqb.a(fqn) && !uix.a(fqn);
        }
    }
}
