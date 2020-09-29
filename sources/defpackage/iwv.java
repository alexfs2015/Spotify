package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.miniplayer.view.MiniPlayerPageView;

/* renamed from: iwv reason: default package */
public final class iwv extends ith<PlayerTrack> implements tio {
    private final MiniPlayerPageView a;
    private final iwo b;

    public iwv(MiniPlayerPageView miniPlayerPageView, iwo iwo) {
        super(miniPlayerPageView);
        this.a = (MiniPlayerPageView) fbp.a(miniPlayerPageView);
        this.b = (iwo) fbp.a(iwo);
    }

    public final void A() {
        this.a.d();
    }

    public final void a(PlayerTrack playerTrack) {
        this.a.a(playerTrack);
        this.a.d();
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        a((PlayerTrack) obj);
    }

    public final void aQ_() {
        MiniPlayerPageView miniPlayerPageView = this.a;
        miniPlayerPageView.c.setVisibility(0);
        miniPlayerPageView.b.setVisibility(4);
    }

    public final void w() {
        super.w();
        this.a.a(this.b);
    }

    public final void x() {
        super.x();
        this.a.a((iwo) null);
    }
}
