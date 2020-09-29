package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: tdr reason: default package */
public final class tdr implements a<PlayerState> {
    public final url a;
    public tfo b;
    private final fpt c;
    private final raq d;
    private final rgz e;
    private String f = "";

    public final /* synthetic */ void onChanged(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        PlayerTrack track = playerState.track();
        String uri = track != null ? track.uri() : "";
        if (!this.f.equals(uri)) {
            this.f = uri;
            if (this.e.a(this.c)) {
                this.b.b();
            } else if (this.d.a(playerState) || uhq.g(playerState.contextUri()) || uhq.f(playerState.contextUri())) {
                this.b.b();
            } else {
                this.b.a();
            }
        }
    }

    public tdr(url url, fpt fpt, raq raq, rgz rgz) {
        this.a = url;
        this.c = fpt;
        this.d = raq;
        this.e = rgz;
    }
}
