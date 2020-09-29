package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: -$$Lambda$uku$EPfvd_DfiHXFmAlvOey-IcHsFW0 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$uku$EPfvd_DfiHXFmAlvOeyIcHsFW0 implements a {
    private final /* synthetic */ String f$0;

    public /* synthetic */ $$Lambda$uku$EPfvd_DfiHXFmAlvOeyIcHsFW0(String str) {
        this.f$0 = str;
    }

    public final boolean doFilter(PlayerState playerState) {
        return this.f$0.equalsIgnoreCase(playerState.contextUri());
    }
}
