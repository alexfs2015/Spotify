package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;

/* renamed from: uta reason: default package */
public final class uta implements xis<Optional<RadioStationTracksModel>> {
    private final usj a;

    public uta(usj usj) {
        this.a = usj;
    }

    public final /* synthetic */ void call(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.b()) {
            usi usi = this.a.d;
            RadioStationModel radioStationModel = usi.a;
            if (radioStationModel != null) {
                this.a.a(radioStationModel, (RadioStationTracksModel) optional.c(), usi.b.e);
            }
        }
    }
}
