package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.HeaderPolicy;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: nhi reason: default package */
public interface nhi {

    /* renamed from: nhi$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static gwm a(Context context, a aVar, jqh jqh, has has, gxw gxw, szp szp) {
            return gxw.a(context, aVar).a(jqh, szp, has).a.a();
        }

        public static gwr a(sso sso, gwm gwm, Context context, nhe nhe) {
            return HubsGlueViewBinderFactories.a(sso).a(HeaderPolicy.ALWAYS_ON_TOP).a((Fragment) nhe).a(gwm, context);
        }

        public static has a(jlr jlr, uqm uqm) {
            return new hat(jlr, uqm, new C0078a(ViewUris.aN));
        }

        public static nhb a(nhc nhc) {
            return new nhb(nhc);
        }

        public static nhc a(gix gix) {
            return (nhc) gix.b(nhc.class);
        }

        public static nhh a(gwp gwp, gwr gwr) {
            return new nhh(gwp, gwr);
        }

        public static nhq a(nhb nhb, nhh nhh, xil xil) {
            return new nhq(nhb.a(), nhh, xil);
        }
    }

    static {
        b.a("ReferenceTopListEndpoint");
    }
}
