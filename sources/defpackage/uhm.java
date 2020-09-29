package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;

/* renamed from: uhm reason: default package */
public final class uhm implements wun<Optional<RadioStationTracksModel>> {
    private final ugv a;

    public final /* synthetic */ void call(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.b()) {
            ugu ugu = this.a.d;
            RadioStationModel radioStationModel = ugu.a;
            if (radioStationModel != null) {
                this.a.a(radioStationModel, (RadioStationTracksModel) optional.c(), ugu.b.e);
            }
        }
    }

    public uhm(ugv ugv) {
        this.a = ugv;
    }
}
