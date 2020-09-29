package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: udt reason: default package */
public final class udt {
    public static final udr A = new udr("collection-songs");
    public static final udr B = new udr("collection-podcasts");
    public static final udr C = new udr("collection-podcasts-downloads");
    public static final udr D = new udr("collection-podcasts-episodes");
    public static final udr E = new udr("collection-podcasts-following");
    public static final udr F = new udr("concerts-location_search");
    public static final udr G = new udr("creator-artist-biography");
    public static final udr H = new udr("language-picker");
    public static final udr I = new udr("com.spotify.feature.navigation");
    public static final udr J = new udr("daily-mix-hub");
    public static final udr K = new udr("data-saver-mode");
    public static final udr L = new udr("debug") {
        public final String a() {
            Assertion.a("This can only be used from debug views", false);
            return super.a();
        }
    };
    public static final udr M = new udr("device");
    public static final udr N = new udr("driving-jumpstart");
    public static final udr O = new udr("driving-npv");
    public static final udr P = new udr("driving-mode");
    public static final udr Q = new udr("driving-voice");
    public static final udr R = new udr("eventsender");
    public static final udr S = new udr("facebook-connect");
    public static final udr T = new udr("feed");
    public static final udr U = new udr("find");
    public static final udr V = new udr("find-friends");
    public static final udr W = new udr("follow-feed");
    public static final udr X = new udr("free-tier-album");
    public static final udr Y = new udr("free-tier-artist");
    public static final udr Z = new udr("free-tier-collection");
    public static final udr a = new udr("ads");
    public static final udr aA = new udr("playlist-folder");
    public static final udr aB = new udr("playlist-recommended");
    public static final udr aC = new udr("playlist-all-songs");
    public static final udr aD = new udr("play-queue");
    public static final udr aE = new udr("podcast-episode");
    public static final udr aF = new udr("premium-hub");
    public static final udr aG = new udr("premium-destination");
    public static final udr aH = new udr("quicksilver");
    public static final udr aI = new udr("radio");
    public static final udr aJ = new udr("remoteconfiguration");
    public static final udr aK = new udr("only-for-robolectric") {
        public final String a() {
            Assertion.a("This can only be used from Robolectric", defpackage.kzd.a.a);
            return super.a();
        }
    };
    public static final udr aL = new udr("root");
    public static final udr aM = new udr("scannables");
    public static final udr aN = new udr("search");
    public static final udr aO = new udr("spotify:internal:service");
    public static final udr aP = new udr("settings");
    public static final udr aQ = new udr("share");
    public static final udr aR = new udr("show");
    public static final udr aS = new udr("show-format");
    public static final udr aT = new udr("speaker-companion");
    public static final udr aU = new udr("sponsored-context");
    public static final udr aV = new udr("stations-promo");
    public static final udr aW = new udr("startpage");
    public static final udr aX = new udr("station");
    public static final udr aY = new udr("ta");
    public static final udr aZ = new udr("your-library");
    public static final udr aa = new udr("free-tier-home");
    public static final udr ab = new udr("free-tier-add-to-playlist");
    public static final udr ac = new udr("free-tier-playlist-all-songs-dialog");
    public static final udr ad = new udr("free-tier-taste-onboarding");
    public static final udr ae = new udr("free-tier-track");
    public static final udr af = new udr("fullscreen-story");
    public static final udr ag = new udr("golden-path");
    public static final udr ah = new udr("hidden-content");
    public static final udr ai = new udr("home-mix");
    public static final udr aj = new udr("hub-events");
    public static final udr ak = new udr("concerts-entity");
    public static final udr al = new udr("hub-events-concert-group");
    public static final udr am = new udr("infinite-playback");
    public static final udr an = new udr("licenses");
    public static final udr ao = new udr("listening-history");
    public static final udr ap = new udr("made-for-you-hub");
    public static final udr aq = new udr("media-service");
    public static final udr ar = new udr("mini-player");
    public static final udr as = new udr("new-player");
    public static final udr at = new udr("new-releases-feed");
    public static final udr au = new udr("notification");
    public static final udr av = new udr("notification-settings");
    public static final udr aw = new udr("nowplaying");
    public static final udr ax = new udr("nowplayingv2");
    public static final udr ay = new udr("player-v2");
    public static final udr az = new udr("playlist");
    public static final udr b = new udr("album");
    public static final udr ba = new udr("unknown");
    public static final udr bb = new udr("upsell");
    public static final udr bc = new udr("user-playlists");
    public static final udr bd = new udr("user-profile");
    public static final udr be = new udr("user-profiles");
    public static final udr bf = new udr("user-top-artists");
    public static final udr bg = new udr("voice");
    public static final udr bh = new udr("voice-ads");
    public static final udr bi = new udr("voice-assistant");
    public static final udr bj = new udr("widget");
    public static final udr bk = new udr("wrapped-2019");
    public static final udr c = new udr("anchor-funnel");
    public static final udr d = new udr("apps-settings");
    public static final udr e = new udr("artist");
    public static final udr f = new udr("artist-convert");
    public static final udr g = new udr("concerts-artistpage");
    public static final udr h = new udr("artist-relases");
    public static final udr i = new udr("assisted-curation");
    public static final udr j = new udr("assisted-curation/search");
    public static final udr k = new udr("assisted-curation/search-entity");
    public static final udr l = new udr("auto");
    public static final udr m = new udr("bixby-home-cards");
    public static final udr n = new udr("browse");
    public static final udr o = new udr("cache-migration-settings");
    public static final udr p = new udr("capped-ondemand");
    public static final udr q = new udr("charts-block");
    public static final udr r = new udr("charts-overview");
    public static final udr s = new udr("collection");
    public static final udr t = new udr("collection-album");
    public static final udr u = new udr("collection-albums");
    public static final udr v = new udr("collection-artist");
    public static final udr w = new udr("collection-artists");
    public static final udr x = new udr("collection-offlined-music");
    public static final udr y = new udr("collection-playlists");
    public static final udr z = new udr("collection-radio");

    /* renamed from: udt$a */
    public static final class a {
        public static gjb a(Bundle bundle) {
            fay.a(bundle);
            gjb gjb = (gjb) bundle.getParcelable("FeatureIdentifier.InternalReferrer");
            if (gjb != null) {
                return gjb;
            }
            throw new IllegalArgumentException("The feature identifier is undeclared. Have you forgotten to set it with ArgumentsHelper?");
        }

        public static gjb a(jol jol) {
            fay.a(jol);
            fay.a(jol.ae());
            return a((Bundle) fay.a(jol.ae().i));
        }

        public static void a(Fragment fragment, gjb gjb) {
            fay.a(fragment);
            fay.a(gjb);
            Bundle bundle = fragment.i;
            if (bundle == null) {
                bundle = new Bundle();
                fragment.g(bundle);
            }
            bundle.putParcelable("FeatureIdentifier.InternalReferrer", gjb);
        }

        public static void a(Intent intent, gjb gjb) {
            fay.a(intent);
            fay.a(gjb);
            intent.putExtra("FeatureIdentifier.InternalReferrer", gjb);
        }

        public static gjb a(Intent intent) {
            fay.a(intent);
            return (gjb) intent.getParcelableExtra("FeatureIdentifier.InternalReferrer");
        }
    }

    static {
        new udr("accounts");
        new udr("artist-playlists");
        new udr("artist-related-artists");
        new udr("audio-playback");
        new udr("browse-toppodcast");
        new udr("canvas");
        new udr("chart");
        new udr("personalized-sets");
        new udr("free-tier-chart");
        new udr("free-tier-likes");
        new udr("free-tier-likes/songs");
        new udr("free-tier-notification");
        new udr("free-tier-player");
        new udr("free-tier-playlist-data-saver");
        new udr("nft-assisted-curation");
        new udr("notifications");
        new udr("player");
        new udr("podcast-episode-enhanced-metadata");
        new udr("real-time-recs-notifications");
        new udr("free-tier-audio-ads-player");
        new udr("login");
        new udr("signup");
        new udr("storage");
        new udr("storylines");
        new udr("terms-and-conditions");
        new udr("terms-and-conditions-update");
        new udr(TrackData.TYPE_TRACK);
        new udr("trending-search");
        new udr("user-onboarding");
        new udr("videoplayer");
    }

    public static udr a(Fragment fragment) {
        udr udr = aL;
        if (!(fragment instanceof jol)) {
            return udr;
        }
        jol jol = (jol) fragment;
        gjb a2 = a.a(jol);
        if (rju.w.equals(a2) || (fragment instanceof joq)) {
            return jol.ag();
        }
        return a2.a();
    }
}
