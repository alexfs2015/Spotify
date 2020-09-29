package defpackage;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.connect.model.GaiaDeviceCapability;
import com.spotify.mobile.android.connect.model.GaiaDeviceRedirectUrisAndroid;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: mgf reason: default package */
public final class mgf {
    public static ArrayList<mfn> a(List<GaiaDeviceCapability> list, String str) {
        ArrayList<mfn> arrayList = new ArrayList<>();
        if (list != null) {
            for (GaiaDeviceCapability gaiaDeviceCapability : list) {
                try {
                    String id = gaiaDeviceCapability.getId();
                    String a = a(gaiaDeviceCapability.getLocalizedTitles(), gaiaDeviceCapability.getDefaultTitle());
                    String iconUrl = gaiaDeviceCapability.getIconUrl();
                    fay.a(gaiaDeviceCapability.getGaiaDeviceRedirectUris());
                    fay.a(gaiaDeviceCapability.getGaiaDeviceRedirectUris().getAndroidUris());
                    GaiaDeviceRedirectUrisAndroid androidUris = gaiaDeviceCapability.getGaiaDeviceRedirectUris().getAndroidUris();
                    Uri build = Uri.parse(androidUris.getUri()).buildUpon().appendQueryParameter(androidUris.getRedirectBackAppParam(), jst.a("spotify:connect-device-picker").h()).appendQueryParameter(androidUris.getDeviceNameParam(), str).build();
                    fay.a(gaiaDeviceCapability.getGaiaDeviceRedirectUris());
                    fay.a(gaiaDeviceCapability.getGaiaDeviceRedirectUris().getAndroidUris());
                    fay.a(gaiaDeviceCapability.getGaiaDeviceRedirectUris().getAndroidUris().getFallbackUrl());
                    mfn mfn = new mfn(id, a, iconUrl, build, Uri.parse(gaiaDeviceCapability.getGaiaDeviceRedirectUris().getAndroidUris().getFallbackUrl()));
                    arrayList.add(mfn);
                } catch (NullPointerException unused) {
                    Logger.d("Capability not added", new Object[0]);
                }
            }
        }
        return arrayList;
    }

    private static String a(Map<String, String> map, String str) {
        String str2 = (String) map.get(SpotifyLocale.a());
        if (str2 != null) {
            return str2;
        }
        for (Entry entry : map.entrySet()) {
            if (gnd.a(Locale.getDefault()).equalsIgnoreCase(((String) entry.getKey()).substring(0, 2))) {
                return (String) entry.getValue();
            }
        }
        return str;
    }
}
