package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;

/* renamed from: sxo reason: default package */
public final class sxo implements sxk, a<PlayerState> {
    private final Player a;
    private final url b;
    private final rbe c;
    private final urz d;
    private final sxj e;
    private final sih f;
    private sxl g;

    public final /* synthetic */ void onChanged(Object obj) {
        PlayerTrack playerTrack = (PlayerTrack) fay.a(((PlayerState) obj).track());
        boolean z = !Boolean.parseBoolean((String) playerTrack.metadata().get("collection.in_collection"));
        boolean containsKey = playerTrack.metadata().containsKey(Metadata.DISLIKE_FEEDBACK_SELECTED);
        this.g.setEnabled(z);
        this.g.a(containsKey);
    }

    public sxo(Player player, url url, rbe rbe, urz urz, sxj sxj, sih sih) {
        this.a = player;
        this.b = url;
        this.c = rbe;
        this.d = urz;
        this.e = sxj;
        this.f = sih;
    }

    public final void a() {
        PlayerState playerState = (PlayerState) fay.a(this.a.getLastPlayerState());
        PlayerTrack playerTrack = (PlayerTrack) fay.a(playerState.track());
        String uri = playerTrack.uri();
        String contextUri = playerState.contextUri();
        String str = "";
        String str2 = (String) jtc.a(playerState.contextMetadata().get("context_description"), str);
        String str3 = (String) jtc.a(playerState.contextMetadata().get(PlayerContext.Metadata.FORMAT_LIST_TYPE), str);
        boolean containsKey = playerTrack.metadata().containsKey(Metadata.DISLIKE_FEEDBACK_SELECTED);
        this.d.b(containsKey);
        if (containsKey) {
            this.c.e(uri, contextUri, str3, this.e.a());
        } else if (this.e.b()) {
            this.c.g(playerTrack.uri(), contextUri, str3, this.e.a());
        } else {
            this.c.a(playerTrack, contextUri, str2, this.f, str3, this.e.a());
        }
    }

    public final void a(sxl sxl) {
        this.g = (sxl) fay.a(sxl);
        this.g.a((a) this);
        this.b.a((a<T>) this);
    }
}
