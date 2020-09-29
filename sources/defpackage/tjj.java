package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: tjj reason: default package */
public final class tjj implements a, a<PlayerState> {
    private final tjo a;
    private final vcq b;
    private final tjm c;
    private final tld d;
    private final vdi e;
    private tjk f;
    private PlayerState g;
    private tjl h;

    public tjj(tjo tjo, vdi vdi, vcq vcq, tjm tjm, tld tld) {
        this.a = tjo;
        this.e = vdi;
        this.b = vcq;
        this.c = tjm;
        this.d = tld;
    }

    public final void a() {
        if (this.g != null) {
            this.e.k();
            this.a.a((PlayerTrack) fbp.a(this.g.track()), this.g.contextUri(), this.d.apply(this.g), this.h);
        }
    }

    public final void a(tjk tjk) {
        this.f = (tjk) fbp.a(tjk);
        this.f.a((a) this);
        this.b.a((a<T>) this);
        this.c.a((a<T>) new $$Lambda$5bagclgab67muliZSdwTA3cntc<T>(this));
    }

    public final void a(tjl tjl) {
        this.h = tjl;
    }

    public final /* synthetic */ void onChanged(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        PlayerTrack playerTrack = (PlayerTrack) fbp.a(playerState.track());
        boolean z = true;
        this.f.a(!InterruptionUtil.isInterruptionUri(playerTrack.uri()));
        tjk tjk = this.f;
        LinkType linkType = jva.a(playerTrack.uri()).b;
        if (!(linkType == LinkType.TRACK || linkType == LinkType.SHOW_EPISODE)) {
            z = false;
        }
        tjk.setEnabled(z);
        this.g = playerState;
    }
}
