package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: uqo reason: default package */
public final class uqo {
    public static final uqm A = new uqm("collection-songs");
    public static final uqm B = new uqm("collection-podcasts");
    public static final uqm C = new uqm("collection-podcasts-downloads");
    public static final uqm D = new uqm("collection-podcasts-episodes");
    public static final uqm E = new uqm("collection-podcasts-following");
    public static final uqm F = new uqm("concerts-location_search");
    public static final uqm G = new uqm("creator-artist-biography");
    public static final uqm H = new uqm("language-picker");
    public static final uqm I = new uqm("com.spotify.feature.navigation");
    public static final uqm J = new uqm("daily-mix-hub");
    public static final uqm K = new uqm("data-saver-mode");
    public static final uqm L = new uqm("debug") {
        public final String a() {
            Assertion.a("This can only be used from debug views", false);
            return super.a();
        }
    };
    public static final uqm M = new uqm("device");
    public static final uqm N = new uqm("driving-jumpstart");
    public static final uqm O = new uqm("driving-npv");
    public static final uqm P = new uqm("driving-mode");
    public static final uqm Q = new uqm("driving-voice");
    public static final uqm R = new uqm("eventsender");
    public static final uqm S = new uqm("facebook-connect");
    public static final uqm T = new uqm("feed");
    public static final uqm U = new uqm("find");
    public static final uqm V = new uqm("find-friends");
    public static final uqm W = new uqm("follow-feed");
    public static final uqm X = new uqm("free-tier-album");
    public static final uqm Y = new uqm("free-tier-artist");
    public static final uqm Z = new uqm("free-tier-collection");
    public static final uqm a = new uqm("ads");
    public static final uqm aA = new uqm("playlist-folder");
    public static final uqm aB = new uqm("playlist-recommended");
    public static final uqm aC = new uqm("playlist-all-songs");
    public static final uqm aD = new uqm("play-queue");
    public static final uqm aE = new uqm("podcast-episode");
    public static final uqm aF = new uqm("premium-hub");
    public static final uqm aG = new uqm("premium-destination");
    public static final uqm aH = new uqm("quicksilver");
    public static final uqm aI = new uqm("radio");
    public static final uqm aJ = new uqm("remoteconfiguration");
    public static final uqm aK = new uqm("only-for-robolectric") {
        public final String a() {
            Assertion.a("This can only be used from Robolectric", defpackage.lcm.a.a);
            return super.a();
        }
    };
    public static final uqm aL = new uqm("root");
    public static final uqm aM = new uqm("scannables");
    public static final uqm aN = new uqm("search");
    public static final uqm aO = new uqm("spotify:internal:service");
    public static final uqm aP = new uqm("settings");
    public static final uqm aQ = new uqm("share");
    public static final uqm aR = new uqm("show");
    public static final uqm aS = new uqm("show-format");
    public static final uqm aT = new uqm("speaker-companion");
    public static final uqm aU = new uqm("sponsored-context");
    public static final uqm aV = new uqm("stations-promo");
    public static final uqm aW = new uqm("startpage");
    public static final uqm aX = new uqm("station");
    public static final uqm aY = new uqm("ta");
    public static final uqm aZ = new uqm("your-library");
    public static final uqm aa = new uqm("free-tier-home");
    public static final uqm ab = new uqm("free-tier-add-to-playlist");
    public static final uqm ac = new uqm("free-tier-playlist-all-songs-dialog");
    public static final uqm ad = new uqm("free-tier-taste-onboarding");
    public static final uqm ae = new uqm("free-tier-track");
    public static final uqm af = new uqm("fullscreen-story");
    public static final uqm ag = new uqm("golden-path");
    public static final uqm ah = new uqm("hidden-content");
    public static final uqm ai = new uqm("home-mix");
    public static final uqm aj = new uqm("hub-events");
    public static final uqm ak = new uqm("concerts-entity");
    public static final uqm al = new uqm("hub-events-concert-group");
    public static final uqm am = new uqm("infinite-playback");
    public static final uqm an = new uqm("licenses");
    public static final uqm ao = new uqm("listening-history");
    public static final uqm ap = new uqm("made-for-you-hub");
    public static final uqm aq = new uqm("media-service");
    public static final uqm ar = new uqm("mini-player");
    public static final uqm as = new uqm("new-player");
    public static final uqm at = new uqm("new-releases-feed");
    public static final uqm au = new uqm("notification");
    public static final uqm av = new uqm("notification-settings");
    public static final uqm aw = new uqm("nowplaying");
    public static final uqm ax = new uqm("nowplayingv2");
    public static final uqm ay = new uqm("player-v2");
    public static final uqm az = new uqm("playlist");
    public static final uqm b = new uqm("album");
    public static final uqm ba = new uqm("unknown");
    public static final uqm bb = new uqm("upsell");
    public static final uqm bc = new uqm("user-playlists");
    public static final uqm bd = new uqm("user-profile");
    public static final uqm be = new uqm("user-profiles");
    public static final uqm bf = new uqm("user-top-artists");
    public static final uqm bg = new uqm("voice");
    public static final uqm bh = new uqm("voice-ads");
    public static final uqm bi = new uqm("voice-assistant");
    public static final uqm bj = new uqm("widget");
    public static final uqm bk = new uqm("wrapped-2019");
    public static final uqm c = new uqm("anchor-funnel");
    public static final uqm d = new uqm("apps-settings");
    public static final uqm e = new uqm("artist");
    public static final uqm f = new uqm("artist-convert");
    public static final uqm g = new uqm("concerts-artistpage");
    public static final uqm h = new uqm("artist-relases");
    public static final uqm i = new uqm("assisted-curation");
    public static final uqm j = new uqm("assisted-curation/search");
    public static final uqm k = new uqm("assisted-curation/search-entity");
    public static final uqm l = new uqm("auto");
    public static final uqm m = new uqm("bixby-home-cards");
    public static final uqm n = new uqm("browse");
    public static final uqm o = new uqm("cache-migration-settings");
    public static final uqm p = new uqm("capped-ondemand");
    public static final uqm q = new uqm("charts-block");
    public static final uqm r = new uqm("charts-overview");
    public static final uqm s = new uqm("collection");
    public static final uqm t = new uqm("collection-album");
    public static final uqm u = new uqm("collection-albums");
    public static final uqm v = new uqm("collection-artist");
    public static final uqm w = new uqm("collection-artists");
    public static final uqm x = new uqm("collection-offlined-music");
    public static final uqm y = new uqm("collection-playlists");
    public static final uqm z = new uqm("collection-radio");

    /* renamed from: uqo$a */
    public static final class a {
        public static gkm a(Intent intent) {
            fbp.a(intent);
            return (gkm) intent.getParcelableExtra("FeatureIdentifier.InternalReferrer");
        }

        public static gkm a(Bundle bundle) {
            fbp.a(bundle);
            gkm gkm = (gkm) bundle.getParcelable("FeatureIdentifier.InternalReferrer");
            if (gkm != null) {
                return gkm;
            }
            throw new IllegalArgumentException("The feature identifier is undeclared. Have you forgotten to set it with ArgumentsHelper?");
        }

        public static gkm a(jqx jqx) {
            fbp.a(jqx);
            fbp.a(jqx.ae());
            return a((Bundle) fbp.a(jqx.ae().i));
        }

        public static void a(Intent intent, gkm gkm) {
            fbp.a(intent);
            fbp.a(gkm);
            intent.putExtra("FeatureIdentifier.InternalReferrer", gkm);
        }

        public static void a(Fragment fragment, gkm gkm) {
            fbp.a(fragment);
            fbp.a(gkm);
            Bundle bundle = fragment.i;
            if (bundle == null) {
                bundle = new Bundle();
                fragment.g(bundle);
            }
            bundle.putParcelable("FeatureIdentifier.InternalReferrer", gkm);
        }
    }

    static {
        new uqm("accounts");
        new uqm("artist-playlists");
        new uqm("artist-related-artists");
        new uqm("audio-playback");
        new uqm("browse-toppodcast");
        new uqm("canvas");
        new uqm("chart");
        new uqm("personalized-sets");
        new uqm("free-tier-chart");
        new uqm("free-tier-likes");
        new uqm("free-tier-likes/songs");
        new uqm("free-tier-notification");
        new uqm("free-tier-player");
        new uqm("free-tier-playlist-data-saver");
        new uqm("nft-assisted-curation");
        new uqm("notifications");
        new uqm("player");
        new uqm("podcast-episode-enhanced-metadata");
        new uqm("real-time-recs-notifications");
        new uqm("free-tier-audio-ads-player");
        new uqm("login");
        new uqm("signup");
        new uqm("storage");
        new uqm("storylines");
        new uqm("terms-and-conditions");
        new uqm("terms-and-conditions-update");
        new uqm(TrackData.TYPE_TRACK);
        new uqm("trending-search");
        new uqm("user-onboarding");
        new uqm("videoplayer");
    }

    public static uqm a(Fragment fragment) {
        uqm uqm = aL;
        if (!(fragment instanceof jqx)) {
            return uqm;
        }
        jqx jqx = (jqx) fragment;
        gkm a2 = a.a(jqx);
        return (rta.w.equals(a2) || (fragment instanceof jrc)) ? jqx.ag() : a2.a();
    }
}
