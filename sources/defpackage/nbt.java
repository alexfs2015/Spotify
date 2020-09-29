package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.HeaderPolicy;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: nbt reason: default package */
public interface nbt {

    /* renamed from: nbt$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static gum a(Context context, a aVar, jnv jnv, gxz gxz, gvv gvv, spi spi) {
            return gvv.a(context, aVar).a(jnv, spi, gxz).a.a();
        }

        public static gur a(sih sih, gum gum, Context context, nbp nbp) {
            return HubsGlueViewBinderFactories.a(sih).a(HeaderPolicy.ALWAYS_ON_TOP).a((Fragment) nbp).a(gum, context);
        }

        public static nbs a(gup gup, gur gur) {
            return new nbs(gup, gur);
        }

        public static ncb a(nbm nbm, nbs nbs, wug wug) {
            return new ncb(nbm.a(), nbs, wug);
        }

        public static nbm a(nbn nbn) {
            return new nbm(nbn);
        }

        public static nbn a(ghm ghm) {
            return (nbn) ghm.b(nbn.class);
        }

        public static gxz a(jjf jjf, udr udr) {
            return new gya(jjf, udr, new C0077a(ViewUris.aO));
        }
    }

    static {
        b.a("ReferenceTopListEndpoint");
    }
}
