package defpackage;

import android.app.Application;
import com.moat.analytics.mobile.spot.MoatAnalytics;
import com.moat.analytics.mobile.spot.MoatFactory;
import com.moat.analytics.mobile.spot.MoatOptions;
import com.moat.analytics.mobile.spot.ReactiveVideoTracker;
import com.moat.analytics.mobile.spot.ReactiveVideoTrackerPlugin;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.video.VideoSurfaceView;

/* renamed from: igz reason: default package */
public final class igz implements kct {
    public final igw a;
    private final ihc b;
    private final Application c;

    public igz(ihc ihc, igw igw, Application application) {
        this.b = ihc;
        this.a = igw;
        this.c = application;
    }

    public final void a() {
        igw igw = this.a;
        if (igw.b != null) {
            igw.b.bf_();
        }
    }

    public final kcs a(jya jya, VideoSurfaceView videoSurfaceView) {
        if (!a.a && PlayerTrackUtil.isAdInMetadata(jya.e())) {
            MoatOptions moatOptions = new MoatOptions();
            moatOptions.loggingEnabled = false;
            MoatAnalytics.getInstance().start(moatOptions, this.c);
            Logger.b("MOAT_SDK - Initialization started", new Object[0]);
        }
        Ad ad = (Ad) this.a.c.remove(jzg.b(jya));
        if (ad == null) {
            Logger.b("MOAT_SDK - Ad object is null", new Object[0]);
            return new igy();
        } else if (!ad.isMeasuredByMoat()) {
            Logger.b("MOAT_SDK - Not measured by MOAT", new Object[0]);
            return new igy();
        } else {
            igw igw = this.a;
            if ((igw.a == null || igw.a.get() == null) ? false : true) {
                Logger.b("MOAT_SDK - Initializing Moat Tracker", new Object[0]);
                return new ihb((ReactiveVideoTracker) MoatFactory.create().createCustomTracker(new ReactiveVideoTrackerPlugin("spotifynativeapp525794473702")), ad, this.b.a, videoSurfaceView);
            }
            Logger.b("MOAT_SDK - Missing expected Activity", new Object[0]);
            StringBuilder sb = new StringBuilder("Missing expected Activity. Cannot create tracker for ad ");
            sb.append(ad.id());
            Assertion.b(sb.toString());
            return new igy();
        }
    }
}
