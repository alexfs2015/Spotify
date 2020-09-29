package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.mobile.android.util.Assertion;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: jod reason: default package */
public final class jod {
    public static Optional<bj> a(Offer offer, String str, Reason reason, String str2, String str3, String str4, sso sso) {
        if (!a(reason, str2, str3, str4)) {
            return Optional.e();
        }
        bj bjVar = new bj(String.valueOf(offer), str, reason.mAdSlotName, str2, str3, str4, sso.toString());
        return Optional.b(bjVar);
    }

    public static boolean a(Reason reason, String str, String str2) {
        if (!Arrays.asList(new String[]{"cross-promo", LogMessage.SEVERITY_INFO, "paywall"}).contains(str)) {
            Logger.b("Attempted to log invalid offer promotional display type: %s", str);
        }
        if (!Arrays.asList(new String[]{"add-to-queue", "play-on-demand", "enable-extreme-quality", "disable-shuffle", "ad-is-playing", "content-unavailable", "skip-limit-reached", "cap-limit-reached", "offline-sync-content", "offline-sync-quality", "offline-sync-cellular", "offline-mode", "listen-offline", "trial-ended", "user-initiated"}).contains(reason.mAdSlotName)) {
            Logger.b("Attempted to log invalid reason type for upsell: %s", reason.mAdSlotName);
        }
        if (!Arrays.asList(new String[]{"banner", "full-page", "inline", "popup", "tooltip"}).contains(str2)) {
            Logger.b("Attempted to log invalid style for upsell: %s", str2);
        }
        return true;
    }

    private static boolean a(Reason reason, String str, String str2, String str3) {
        if (Arrays.asList(new String[]{"close", "get"}).contains(str2)) {
            return a(reason, str, str3);
        }
        Assertion.b(String.format(Locale.US, "Attempted to log invalid offer interaction: %s", new Object[]{str2}));
        return false;
    }
}
