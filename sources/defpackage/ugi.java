package defpackage;

import android.os.Parcelable;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import java.util.List;

/* renamed from: ugi reason: default package */
public abstract class ugi implements Parcelable {

    /* renamed from: ugi$a */
    static class a extends upw<RadioStationModel> {
        protected a() {
            super(RadioStationModel.CREATOR);
        }
    }

    public abstract List<RadioStationModel> a();

    public static ugi a(List<RadioStationModel> list) {
        return new ugg(list);
    }
}
