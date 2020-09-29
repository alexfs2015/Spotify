package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: own reason: default package */
public final class own {
    private final tmt a;
    private final wug b;
    private final String c;

    public own(tmt tmt, wug wug, String str) {
        this.a = tmt;
        this.b = wug;
        this.c = str;
    }

    public final wud<tms> a() {
        return this.a.a(this.b).f(new $$Lambda$own$l4ftKOzF3qKP_BVf7tmf5yiX0k(this)).c(new b()).b().h($$Lambda$own$Asq5FafCc9KKMfJT0CgWzEa7VOA.INSTANCE);
    }

    /* access modifiers changed from: private */
    public tms a(PlayerState playerState) {
        PlayerTrack track = playerState.track();
        if (track != null) {
            String entityUri = playerState.entityUri();
            if (("context".equals(track.provider()) && this.c.equals(entityUri)) || ("queue".equals(track.provider()) && this.c.equals(track.metadata().get("context_uri")))) {
                return tms.a(track.uri(), tmt.a(playerState), playerState.currentPlaybackPosition(), playerState.duration());
            }
        }
        return new a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ tms a(Throwable th) {
        return new b();
    }
}
