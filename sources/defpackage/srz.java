package defpackage;

import com.spotify.music.libs.stationspromo.StationsPromoFlags;
import com.spotify.music.libs.stationspromo.StationsPromoFlags.StationsPromoVariants;

/* renamed from: srz reason: default package */
public final class srz {
    private final rqb a;

    public srz(rqb rqb) {
        this.a = rqb;
    }

    public final boolean a(fqn fqn) {
        return this.a.a(fqn) && fqn.a(StationsPromoFlags.a) == StationsPromoVariants.STATIONS;
    }
}
