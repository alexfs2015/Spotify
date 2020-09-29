package defpackage;

import android.os.Parcelable;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import java.util.List;

/* renamed from: urw reason: default package */
public abstract class urw implements Parcelable {

    /* renamed from: urw$a */
    static class a extends vbb<RadioStationModel> {
        protected a() {
            super(RadioStationModel.CREATOR);
        }
    }

    public static urw a(List<RadioStationModel> list) {
        return new uru(list);
    }

    public abstract List<RadioStationModel> a();
}
