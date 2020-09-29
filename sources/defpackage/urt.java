package defpackage;

import com.spotify.music.spotlets.radio.model.RadioStationModel;
import java.util.List;

/* renamed from: urt reason: default package */
abstract class urt extends urw {
    final List<RadioStationModel> a;

    urt(List<RadioStationModel> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null savedStations");
    }

    public final List<RadioStationModel> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof urw)) {
            return false;
        }
        return this.a.equals(((urw) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SavedStationsModel{savedStations=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
