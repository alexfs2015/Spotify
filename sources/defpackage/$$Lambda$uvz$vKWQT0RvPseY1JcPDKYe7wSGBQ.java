package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: -$$Lambda$uvz$vKWQT0R-vPseY1JcPDKYe7wSGBQ reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$uvz$vKWQT0RvPseY1JcPDKYe7wSGBQ implements a {
    private final /* synthetic */ String f$0;

    public /* synthetic */ $$Lambda$uvz$vKWQT0RvPseY1JcPDKYe7wSGBQ(String str) {
        this.f$0 = str;
    }

    public final boolean doFilter(PlayerState playerState) {
        return this.f$0.equalsIgnoreCase(playerState.contextUri());
    }
}
