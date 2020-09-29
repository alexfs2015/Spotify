package defpackage;

import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContextIndex;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;

/* renamed from: top reason: default package */
public final class top implements c<PlayerState, tpq> {
    private final tol a;

    public top(tol tol) {
        this.a = tol;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ tpq a(too too, PlayerState playerState) {
        a aVar = new a();
        String str = (String) playerState.contextMetadata().get("image_url");
        if (str == null || str.isEmpty()) {
            str = "";
        } else {
            String str2 = "spotify:image:";
            if (!str.startsWith(str2)) {
                StringBuilder sb = new StringBuilder(str2);
                sb.append(str);
                str = sb.toString();
            }
        }
        a a2 = aVar.e(str).a(Integer.toString(0)).b("current-item").a(playerState.index() != null ? playerState.index() : new PlayerContextIndex(0, 0)).a(playerState.positionAsOfTimestamp());
        tol tol = this.a;
        PlayerTrack track = playerState.track();
        String b = (tou.a(track) || PlayerTrackUtil.isSuggestedTrack(track)) ? (String) playerState.contextMetadata().get("context_description") : tol.a.a(playerState).b(tol.b);
        if (TextUtils.isEmpty(b)) {
            LinkType linkType = jva.a(playerState.contextUri()).b;
            if (track != null && !tou.a(track)) {
                if (linkType == LinkType.TRACK) {
                    b = (String) track.metadata().get("title");
                } else if (linkType == LinkType.ARTIST) {
                    b = (String) track.metadata().get("artist_name");
                } else if (linkType == LinkType.ALBUM) {
                    b = (String) track.metadata().get("album_title");
                } else if (linkType == LinkType.GENRE_RADIO) {
                    b = tol.b.getString(R.string.driving_genre_radio_fallback_title);
                }
            }
            b = tol.b.getString(R.string.driving_fallback_suggested_music);
        }
        return a2.c(b).d(too.a()).a(too.b()).a(too.c()).a(new hfv(playerState.contextUri())).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(PlayerState playerState) {
        return this.a.a(playerState.contextUri());
    }

    public final /* synthetic */ Object call(Object obj) {
        xii xii = (xii) obj;
        return xii.d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$top$HP2wrjMYnvHhAB68ncLyKUbYk<Object,Object>(this)).b(xii, (xiz<? super T, ? super T2, ? extends R>) new $$Lambda$top$k7AWJ9m5F1o5_eACrQbUHusg4Io<Object,Object,Object>(this));
    }
}
