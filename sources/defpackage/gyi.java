package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: gyi reason: default package */
public final class gyi {
    private static final gbj<gzz> a = gbj.a(new a<gzz>() {
        public final /* synthetic */ Object create() {
            return hai.builder().a("hubs/placeholder").a();
        }
    });
    private static final gbj<gzz> b = gbj.a(new a<gzz>() {
        public final /* synthetic */ Object create() {
            return gyi.b().c(hae.builder().a((gzr) HubsCommonComponent.LOADING_SPINNER).a()).a();
        }
    });

    public static gzz a(SpotifyIconV2 spotifyIconV2, String str, String str2) {
        return a(spotifyIconV2, str, str2, HubsImmutableComponentBundle.create());
    }

    public static gzz a(SpotifyIconV2 spotifyIconV2, String str, String str2, gzq gzq) {
        return b().c(hae.builder().a((gzr) HubsGlueComponent.EMPTY_VIEW).a(had.builder().a((Enum<?>) spotifyIconV2)).a(haf.builder().a(str).d(str2)).e(gzq).a()).a();
    }

    public static gzz a() {
        return (gzz) b.a();
    }

    public static a b() {
        return ((gzz) a.a()).toBuilder();
    }

    public static boolean a(gzz gzz) {
        return "hubs/placeholder".equals(gzz.id());
    }
}
