package defpackage;

import android.app.Activity;
import com.spotify.music.activesessionbanner.ActiveSessionBannerLogger;
import com.spotify.music.libs.partnerapps.PartnerType;

/* renamed from: kmh reason: default package */
public interface kmh {

    /* renamed from: kmh$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static kmo a(kml kml, kmq kmq, kna kna, ActiveSessionBannerLogger activeSessionBannerLogger, knc knc, Activity activity) {
            PartnerType partnerType = PartnerType.GOOGLE_MAPS;
            kmq kmq2 = kmq;
            kml kml2 = kml;
            ActiveSessionBannerLogger activeSessionBannerLogger2 = activeSessionBannerLogger;
            Activity activity2 = activity;
            kmo kmo = new kmo(activeSessionBannerLogger2, activity2, kmq.a(partnerType), kml.a(partnerType), kna, kne.a("google-maps-integration", "google-maps-banner"), knc);
            return kmo;
        }

        public static kmo a(kml kml, kmq kmq, knh knh, ActiveSessionBannerLogger activeSessionBannerLogger, knj knj, Activity activity) {
            PartnerType partnerType = PartnerType.WAZE;
            kmq kmq2 = kmq;
            kml kml2 = kml;
            ActiveSessionBannerLogger activeSessionBannerLogger2 = activeSessionBannerLogger;
            Activity activity2 = activity;
            kmo kmo = new kmo(activeSessionBannerLogger2, activity2, kmq.a(partnerType), kml.a(partnerType), knh, kne.a("waze-integration", "waze-goto-banner"), knj);
            return kmo;
        }
    }
}
