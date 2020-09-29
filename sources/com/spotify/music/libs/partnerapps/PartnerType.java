package com.spotify.music.libs.partnerapps;

import com.spotify.music.R;

public enum PartnerType {
    GOOGLE_MAPS(R.string.navigation_app_name_googlemaps, "google_maps", "com.google.android.apps.maps", "http://maps.google.com/maps"),
    WAZE(R.string.navigation_app_name_waze, "waze", "com.waze", "waze://spotifysdk/"),
    UNKNOWN(0, "unknown", "", "");
    
    public final String mPackageName;
    private final String mPartnerIntegrationId;
    private final int mPartnerName;
    public final String mRedirectUri;

    private PartnerType(int i, String str, String str2, String str3) {
        this.mPartnerName = i;
        this.mPartnerIntegrationId = str;
        this.mPackageName = str2;
        this.mRedirectUri = str3;
    }

    public static PartnerType a(String str) {
        return GOOGLE_MAPS.mPartnerIntegrationId.equals(str) ? GOOGLE_MAPS : WAZE.mPartnerIntegrationId.equals(str) ? WAZE : UNKNOWN;
    }
}
