package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.miniplayer.view.MiniPlayerPageView;

/* renamed from: iuk reason: default package */
public final class iuk extends iqu<PlayerTrack> implements syh {
    private final MiniPlayerPageView a;
    private final iud b;

    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        a((PlayerTrack) obj);
    }

    public iuk(MiniPlayerPageView miniPlayerPageView, iud iud) {
        super(miniPlayerPageView);
        this.a = (MiniPlayerPageView) fay.a(miniPlayerPageView);
        this.b = (iud) fay.a(iud);
    }

    public final void a(PlayerTrack playerTrack) {
        this.a.a(playerTrack);
        this.a.d();
    }

    public final void v() {
        super.v();
        this.a.a(this.b);
    }

    public final void w() {
        super.w();
        this.a.a((iud) null);
    }

    public final void aS_() {
        MiniPlayerPageView miniPlayerPageView = this.a;
        miniPlayerPageView.c.setVisibility(0);
        miniPlayerPageView.b.setVisibility(4);
    }

    public final void z() {
        this.a.d();
    }
}
