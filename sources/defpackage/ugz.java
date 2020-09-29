package defpackage;

import com.google.common.base.Optional;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.ThumbState;

/* renamed from: ugz reason: default package */
public final class ugz implements wuu<Response, PlayerState, Optional<RadioStationTracksModel>> {
    private final ugu a;
    private final String b;
    private final uhe c;
    private final ThumbState d;

    public final /* synthetic */ Object call(Object obj, Object obj2) {
        PlayerState playerState = (PlayerState) obj2;
        RadioStationModel radioStationModel = this.a.a;
        if (radioStationModel == null) {
            return Optional.e();
        }
        PlayerTrack[] a2 = uhe.a(playerState);
        int i = 0;
        while (true) {
            if (i >= a2.length) {
                break;
            } else if (a2[i].uri().equals(this.b)) {
                a2[i] = uhq.a(a2[i], this.d);
                break;
            } else {
                i++;
            }
        }
        return Optional.b(new RadioStationTracksModel(a2, uhq.a(radioStationModel.nextPageUrl, a2)));
    }

    public ugz(ugu ugu, String str, uhe uhe, ThumbState thumbState) {
        this.a = ugu;
        this.b = str;
        this.c = uhe;
        this.d = thumbState;
    }
}
