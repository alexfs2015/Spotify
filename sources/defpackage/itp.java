package defpackage;

import com.spotify.mobile.android.spotlets.eventshub.locationsearch.model.Location;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: itp reason: default package */
public final class itp {
    static final b<Object, Integer> b = b.a("concerts_location_geonameid");
    static final b<Object, String> c = b.a("concerts_location_name");
    final SpSharedPreferences<Object> a;

    public itp(SpSharedPreferences<Object> spSharedPreferences) {
        this.a = spSharedPreferences;
    }

    public final Location a() {
        Location location = Location.EMPTY;
        int a2 = this.a.a(b, location.mGeonameId);
        String a3 = this.a.a(c, location.mLocationName);
        return (a2 == -1 || fax.a(a3)) ? location : new Location(a2, a3);
    }
}
