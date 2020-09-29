package defpackage;

import com.google.common.base.Optional;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.ThumbState;

/* renamed from: usn reason: default package */
public final class usn implements xiz<Response, PlayerState, Optional<RadioStationTracksModel>> {
    private final usi a;
    private final String b;
    private final uss c;
    private final ThumbState d;

    public usn(usi usi, String str, uss uss, ThumbState thumbState) {
        this.a = usi;
        this.b = str;
        this.c = uss;
        this.d = thumbState;
    }

    public final /* synthetic */ Object call(Object obj, Object obj2) {
        PlayerState playerState = (PlayerState) obj2;
        RadioStationModel radioStationModel = this.a.a;
        if (radioStationModel == null) {
            return Optional.e();
        }
        PlayerTrack[] a2 = uss.a(playerState);
        int i = 0;
        while (true) {
            if (i >= a2.length) {
                break;
            } else if (a2[i].uri().equals(this.b)) {
                a2[i] = ute.a(a2[i], this.d);
                break;
            } else {
                i++;
            }
        }
        return Optional.b(new RadioStationTracksModel(a2, ute.a(radioStationModel.nextPageUrl, a2)));
    }
}
