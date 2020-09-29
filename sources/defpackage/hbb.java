package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: hbb reason: default package */
public final class hbb {
    private static final gch<hcs> a = gch.a(new a<hcs>() {
        public final /* synthetic */ Object create() {
            return hdb.builder().a("hubs/placeholder").a();
        }
    });
    private static final gch<hcs> b = gch.a(new a<hcs>() {
        public final /* synthetic */ Object create() {
            return hbb.b().c(hcx.builder().a((hck) HubsCommonComponent.LOADING_SPINNER).a()).a();
        }
    });

    public static hcs a() {
        return (hcs) b.a();
    }

    public static hcs a(SpotifyIconV2 spotifyIconV2, String str, String str2) {
        return a(spotifyIconV2, str, str2, HubsImmutableComponentBundle.create());
    }

    public static hcs a(SpotifyIconV2 spotifyIconV2, String str, String str2, hcj hcj) {
        return b().c(hcx.builder().a((hck) HubsGlueComponent.EMPTY_VIEW).a(hcw.builder().a((Enum<?>) spotifyIconV2)).a(hcy.builder().a(str).d(str2)).e(hcj).a()).a();
    }

    public static boolean a(hcs hcs) {
        return "hubs/placeholder".equals(hcs.id());
    }

    public static a b() {
        return ((hcs) a.a()).toBuilder();
    }
}
