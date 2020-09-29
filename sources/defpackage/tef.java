package defpackage;

import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContextIndex;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;

/* renamed from: tef reason: default package */
public final class tef implements c<PlayerState, tfg> {
    private final teb a;

    public final /* synthetic */ Object call(Object obj) {
        wud wud = (wud) obj;
        return wud.d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$tef$ytGTnTfkoTAY1GvorcWUtnSmtDI<Object,Object>(this)).b(wud, (wuu<? super T, ? super T2, ? extends R>) new $$Lambda$tef$LGOyQ0p_BAx9EFZ7BGv5hSiYvng<Object,Object,Object>(this));
    }

    public tef(teb teb) {
        this.a = teb;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(PlayerState playerState) {
        return this.a.a(playerState.contextUri());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ tfg a(tee tee, PlayerState playerState) {
        String str;
        a aVar = new a();
        String str2 = (String) playerState.contextMetadata().get("image_url");
        if (str2 == null || str2.isEmpty()) {
            str2 = "";
        } else {
            String str3 = "spotify:image:";
            if (!str2.startsWith(str3)) {
                StringBuilder sb = new StringBuilder(str3);
                sb.append(str2);
                str2 = sb.toString();
            }
        }
        a a2 = aVar.e(str2).a(Integer.toString(0)).b("current-item").a(playerState.index() != null ? playerState.index() : new PlayerContextIndex(0, 0)).a(playerState.positionAsOfTimestamp());
        teb teb = this.a;
        PlayerTrack track = playerState.track();
        if (tek.a(track) || PlayerTrackUtil.isSuggestedTrack(track)) {
            str = (String) playerState.contextMetadata().get("context_description");
        } else {
            str = teb.a.a(playerState).b(teb.b);
        }
        if (TextUtils.isEmpty(str)) {
            LinkType linkType = jst.a(playerState.contextUri()).b;
            if (track != null && !tek.a(track)) {
                if (linkType == LinkType.TRACK) {
                    str = (String) track.metadata().get("title");
                } else if (linkType == LinkType.ARTIST) {
                    str = (String) track.metadata().get("artist_name");
                } else if (linkType == LinkType.ALBUM) {
                    str = (String) track.metadata().get("album_title");
                } else if (linkType == LinkType.GENRE_RADIO) {
                    str = teb.b.getString(R.string.driving_genre_radio_fallback_title);
                }
            }
            str = teb.b.getString(R.string.driving_fallback_suggested_music);
        }
        return a2.c(str).d(tee.a()).a(tee.b()).a(tee.c()).a(new hcz(playerState.contextUri())).a();
    }
}
