package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: toa reason: default package */
public final class toa implements a<PlayerState> {
    public final vcq a;
    public tqd b;
    private final fqn c;
    private final rjm d;
    private final rqb e;
    private String f = "";

    public toa(vcq vcq, fqn fqn, rjm rjm, rqb rqb) {
        this.a = vcq;
        this.c = fqn;
        this.d = rjm;
        this.e = rqb;
    }

    public final /* synthetic */ void onChanged(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        PlayerTrack track = playerState.track();
        String uri = track != null ? track.uri() : "";
        if (!this.f.equals(uri)) {
            this.f = uri;
            if (this.e.a(this.c)) {
                this.b.b();
            } else if (this.d.a(playerState) || ute.f(playerState.contextUri()) || ute.e(playerState.contextUri())) {
                this.b.b();
            } else {
                this.b.a();
            }
        }
    }
}
