package defpackage;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;

/* renamed from: siz reason: default package */
final class siz implements siu {
    private final Context a;

    public siz(Context context) {
        this.a = context;
    }

    public final String a() {
        return b();
    }

    private String b() {
        int i = 3;
        while (i > 0) {
            try {
                Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.a);
                if (!advertisingIdInfo.isLimitAdTrackingEnabled()) {
                    return advertisingIdInfo.getId();
                }
            } catch (IOException e) {
                Logger.b(e, "Error connecting to Google Play services (e.g.the old version of the service doesn't support getting AdvertisingId).", new Object[0]);
            } catch (GooglePlayServicesNotAvailableException unused) {
                Logger.b("Google Play services is not available entirely.", new Object[0]);
            } catch (GooglePlayServicesRepairableException unused2) {
                Logger.b("Encountered a recoverable error connecting to Google Play services.", new Object[0]);
                i--;
            }
            i = 0;
        }
        return "";
    }
}
