package defpackage;

import android.app.Activity;
import com.spotify.music.activesessionbanner.ActiveSessionBannerLogger;
import com.spotify.music.libs.partnerapps.PartnerType;

/* renamed from: kpq reason: default package */
public interface kpq {

    /* renamed from: kpq$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static kpx a(kpu kpu, kpz kpz, kqj kqj, ActiveSessionBannerLogger activeSessionBannerLogger, kql kql, Activity activity) {
            PartnerType partnerType = PartnerType.GOOGLE_MAPS;
            kpz kpz2 = kpz;
            kpu kpu2 = kpu;
            ActiveSessionBannerLogger activeSessionBannerLogger2 = activeSessionBannerLogger;
            Activity activity2 = activity;
            kpx kpx = new kpx(activeSessionBannerLogger2, activity2, kpz.a(partnerType), kpu.a(partnerType), kqj, kqn.a("google-maps-integration", "google-maps-banner"), kql);
            return kpx;
        }

        public static kpx a(kpu kpu, kpz kpz, kqq kqq, ActiveSessionBannerLogger activeSessionBannerLogger, kqs kqs, Activity activity) {
            PartnerType partnerType = PartnerType.WAZE;
            kpz kpz2 = kpz;
            kpu kpu2 = kpu;
            ActiveSessionBannerLogger activeSessionBannerLogger2 = activeSessionBannerLogger;
            Activity activity2 = activity;
            kpx kpx = new kpx(activeSessionBannerLogger2, activity2, kpz.a(partnerType), kpu.a(partnerType), kqq, kqn.a("waze-integration", "waze-goto-banner"), kqs);
            return kpx;
        }
    }
}
