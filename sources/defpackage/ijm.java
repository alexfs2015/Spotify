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

/* renamed from: ijm reason: default package */
public final class ijm implements keu {
    public final ijj a;
    private final ijp b;
    private final Application c;

    public ijm(ijp ijp, ijj ijj, Application application) {
        this.b = ijp;
        this.a = ijj;
        this.c = application;
    }

    public final ket a(kaa kaa, VideoSurfaceView videoSurfaceView) {
        if (!a.a && PlayerTrackUtil.isAdInMetadata(kaa.e())) {
            MoatOptions moatOptions = new MoatOptions();
            moatOptions.loggingEnabled = false;
            MoatAnalytics.getInstance().start(moatOptions, this.c);
            Logger.b("MOAT_SDK - Initialization started", new Object[0]);
        }
        Ad ad = (Ad) this.a.c.remove(kbg.b(kaa));
        if (ad == null) {
            Logger.b("MOAT_SDK - Ad object is null", new Object[0]);
            return new ijl();
        } else if (!ad.isMeasuredByMoat()) {
            Logger.b("MOAT_SDK - Not measured by MOAT", new Object[0]);
            return new ijl();
        } else {
            ijj ijj = this.a;
            if ((ijj.a == null || ijj.a.get() == null) ? false : true) {
                Logger.b("MOAT_SDK - Initializing Moat Tracker", new Object[0]);
                return new ijo((ReactiveVideoTracker) MoatFactory.create().createCustomTracker(new ReactiveVideoTrackerPlugin("spotifynativeapp525794473702")), ad, this.b.a, videoSurfaceView);
            }
            Logger.b("MOAT_SDK - Missing expected Activity", new Object[0]);
            StringBuilder sb = new StringBuilder("Missing expected Activity. Cannot create tracker for ad ");
            sb.append(ad.id());
            Assertion.b(sb.toString());
            return new ijl();
        }
    }

    public final void a() {
        ijj ijj = this.a;
        if (ijj.b != null) {
            ijj.b.bd_();
        }
    }
}
