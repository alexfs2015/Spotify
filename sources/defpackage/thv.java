package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext.Metadata;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: thv reason: default package */
public final class thv implements thr, a<PlayerState> {
    private final Player a;
    private final vcq b;
    private final rka c;
    private final vde d;
    private final thq e;
    private final sso f;
    private ths g;

    public thv(Player player, vcq vcq, rka rka, vde vde, thq thq, sso sso) {
        this.a = player;
        this.b = vcq;
        this.c = rka;
        this.d = vde;
        this.e = thq;
        this.f = sso;
    }

    public final void a() {
        PlayerState playerState = (PlayerState) fbp.a(this.a.getLastPlayerState());
        PlayerTrack playerTrack = (PlayerTrack) fbp.a(playerState.track());
        String uri = playerTrack.uri();
        String contextUri = playerState.contextUri();
        String str = "";
        String str2 = (String) jvi.a(playerState.contextMetadata().get("context_description"), str);
        String str3 = (String) jvi.a(playerState.contextMetadata().get(Metadata.FORMAT_LIST_TYPE), str);
        boolean containsKey = playerTrack.metadata().containsKey(PlayerTrack.Metadata.DISLIKE_FEEDBACK_SELECTED);
        this.d.b(containsKey);
        if (containsKey) {
            this.c.e(uri, contextUri, str3, this.e.a());
        } else if (this.e.b()) {
            this.c.g(playerTrack.uri(), contextUri, str3, this.e.a());
        } else {
            this.c.a(playerTrack, contextUri, str2, this.f, str3, this.e.a());
        }
    }

    public final void a(ths ths) {
        this.g = (ths) fbp.a(ths);
        this.g.a((a) this);
        this.b.a((a<T>) this);
    }

    public final /* synthetic */ void onChanged(Object obj) {
        PlayerTrack playerTrack = (PlayerTrack) fbp.a(((PlayerState) obj).track());
        boolean z = !Boolean.parseBoolean((String) playerTrack.metadata().get("collection.in_collection"));
        boolean containsKey = playerTrack.metadata().containsKey(PlayerTrack.Metadata.DISLIKE_FEEDBACK_SELECTED);
        this.g.setEnabled(z);
        this.g.a(containsKey);
    }
}
