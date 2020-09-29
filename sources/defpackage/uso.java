package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: uso reason: default package */
public final class uso implements a {
    private final Player a;
    private final url b;
    private final usn c;
    private usp d;

    public uso(Player player, url url, usn usn) {
        this.a = player;
        this.b = url;
        this.c = usn;
    }

    public final void a() {
        this.c.c();
        this.a.skipToPreviousTrack();
    }

    public final void a(usp usp) {
        this.d = (usp) fay.a(usp);
        this.d.a((a) this);
        this.b.a((a<T>) new $$Lambda$uso$97q1ZfpmYG6yKR9L9KS7eGAURLw<T>(this));
    }

    /* access modifiers changed from: private */
    public void a(PlayerState playerState) {
        this.d.a(playerState.restrictions().disallowSkippingPrevReasons().isEmpty() || playerState.restrictions().disallowSeekingReasons().isEmpty());
    }
}
