package defpackage;

import com.spotify.music.spotlets.radio.model.RadioStationModel;
import java.util.List;

/* renamed from: ugf reason: default package */
abstract class ugf extends ugi {
    final List<RadioStationModel> a;

    ugf(List<RadioStationModel> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null savedStations");
    }

    public final List<RadioStationModel> a() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SavedStationsModel{savedStations=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ugi)) {
            return false;
        }
        return this.a.equals(((ugi) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
