package defpackage;

import com.spotify.music.libs.stationspromo.StationsPromoFlags;
import com.spotify.music.libs.stationspromo.StationsPromoFlags.StationsPromoVariants;

/* renamed from: shs reason: default package */
public final class shs {
    private final rgz a;

    public shs(rgz rgz) {
        this.a = rgz;
    }

    public final boolean a(fpt fpt) {
        return this.a.a(fpt) && fpt.a(StationsPromoFlags.a) == StationsPromoVariants.STATIONS;
    }
}
