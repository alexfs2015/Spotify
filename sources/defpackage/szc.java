package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: szc reason: default package */
public final class szc implements a, a<PlayerState> {
    private final szh a;
    private final url b;
    private final szf c;
    private final taw d;
    private final usd e;
    private szd f;
    private PlayerState g;
    private sze h;

    public final /* synthetic */ void onChanged(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        PlayerTrack playerTrack = (PlayerTrack) fay.a(playerState.track());
        boolean z = true;
        this.f.a(!InterruptionUtil.isInterruptionUri(playerTrack.uri()));
        szd szd = this.f;
        LinkType linkType = jst.a(playerTrack.uri()).b;
        if (!(linkType == LinkType.TRACK || linkType == LinkType.SHOW_EPISODE)) {
            z = false;
        }
        szd.setEnabled(z);
        this.g = playerState;
    }

    public szc(szh szh, usd usd, url url, szf szf, taw taw) {
        this.a = szh;
        this.e = usd;
        this.b = url;
        this.c = szf;
        this.d = taw;
    }

    public final void a() {
        if (this.g != null) {
            this.e.k();
            this.a.a((PlayerTrack) fay.a(this.g.track()), this.g.contextUri(), this.d.apply(this.g), this.h);
        }
    }

    public final void a(szd szd) {
        this.f = (szd) fay.a(szd);
        this.f.a((a) this);
        this.b.a((a<T>) this);
        this.c.a((a<T>) new $$Lambda$RIC59jtJt5pr3jc7Xo3xePquXjM<T>(this));
    }

    public final void a(sze sze) {
        this.h = sze;
    }
}
