package defpackage;

import android.content.res.Resources;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.music.R;
import com.spotify.music.connection.OfflineReason;

/* renamed from: nde reason: default package */
public final class nde {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    private final String g;
    private final String h;

    /* renamed from: nde$1 reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[OfflineReason.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.music.connection.OfflineReason[] r0 = com.spotify.music.connection.OfflineReason.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.connection.OfflineReason r1 = com.spotify.music.connection.OfflineReason.AP_CONNECTION_PROBLEM     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.connection.OfflineReason r1 = com.spotify.music.connection.OfflineReason.NO_INTERNET     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.connection.OfflineReason r1 = com.spotify.music.connection.OfflineReason.FORCED_OFFLINE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nde.AnonymousClass1.<clinit>():void");
        }
    }

    public nde(Resources resources) {
        this.g = resources.getString(R.string.error_general_title);
        this.h = resources.getString(R.string.error_general_body);
        this.a = resources.getString(R.string.error_no_connection_title);
        this.b = resources.getString(R.string.error_no_connection_body);
        this.c = resources.getString(R.string.error_spotify_service_unavailable_title);
        this.d = resources.getString(R.string.error_spotify_service_unavailable_body);
        this.e = resources.getString(R.string.home_download_music_podcasts);
        this.f = resources.getString(R.string.home_download_podcasts);
    }

    public final gzz a() {
        return a(SpotifyIconV2.WARNING, this.g, this.h, "home-error-empty-view");
    }

    public static gzz b() {
        String str = "home-loading-empty-view";
        return gyi.b().c(hae.builder().a((gzr) HubsCommonComponent.LOADING_SPINNER).e(a(str)).c(HubsImmutableComponentBundle.builder().a("ui:group", str).a()).a()).a();
    }

    public static gzz a(SpotifyIconV2 spotifyIconV2, String str, String str2, String str3) {
        return gyi.b().c(hae.builder().a((gzr) HubsGlueComponent.EMPTY_VIEW).a(had.builder().a((Enum<?>) spotifyIconV2)).a(haf.builder().a(str).d(str2)).e(a(str3)).c(HubsImmutableComponentBundle.builder().a("ui:group", str3).a()).a()).a();
    }

    public static boolean a(gzz gzz, String str) {
        if (!gyi.a(gzz) || gzz.overlays().isEmpty() || !str.equals(a((gzt) gzz.overlays().get(0)))) {
            return false;
        }
        return true;
    }

    private static String a(gzt gzt) {
        return gzt.custom().string("tag");
    }

    public static boolean a(gzz gzz) {
        return a(gzz, "home-no-network-empty-view") || a(gzz, "home-no-spotify-service-empty-view");
    }

    public static gzq a(String str) {
        return HubsImmutableComponentBundle.builder().a("tag", str).a();
    }
}
