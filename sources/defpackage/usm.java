package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.ThumbState;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: usm reason: default package */
public final class usm {
    final Map<String, ThumbState> a = new HashMap();
    RadioStationTracksModel b;
    int c;
    boolean d;
    public final sso e;
    final Set<String> f = new LinkedHashSet();

    public usm(RadioStationTracksModel radioStationTracksModel, sso sso) {
        fbp.a(radioStationTracksModel);
        this.c = 0;
        this.e = sso;
        this.b = radioStationTracksModel;
        a(radioStationTracksModel);
    }

    public final ThumbState a(String str) {
        ThumbState thumbState = (ThumbState) this.a.get(str);
        return thumbState == null ? ThumbState.NONE : thumbState;
    }

    public final String a() {
        if (this.f.isEmpty()) {
            return "";
        }
        String queryParameter = Uri.parse(this.b.nextPageUrl).getQueryParameter("salt");
        String join = TextUtils.join(",", this.f);
        StringBuilder sb = new StringBuilder("salt=");
        sb.append(queryParameter);
        sb.append("&prev_tracks=");
        sb.append(join);
        return sb.toString();
    }

    public final void a(RadioStationTracksModel radioStationTracksModel) {
        PlayerTrack[] playerTrackArr;
        fbp.a(radioStationTracksModel);
        fbp.a(radioStationTracksModel.tracks);
        this.b = radioStationTracksModel;
        for (PlayerTrack playerTrack : radioStationTracksModel.tracks) {
            this.a.put(playerTrack.uri(), ute.a(playerTrack));
        }
        this.d = false;
    }

    public final void a(String str, ThumbState thumbState) {
        if (!fbn.a(a(str), thumbState)) {
            this.a.put(str, thumbState);
            this.d = true;
        }
    }
}
