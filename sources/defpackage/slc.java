package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.lyrics.logger.LyricsLogger;

/* renamed from: slc reason: default package */
public final class slc implements vua<LyricsLogger> {
    private final wlc<InteractionLogger> a;
    private final wlc<ImpressionLogger> b;
    private final wlc<PlayerState> c;

    private slc(wlc<InteractionLogger> wlc, wlc<ImpressionLogger> wlc2, wlc<PlayerState> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static slc a(wlc<InteractionLogger> wlc, wlc<ImpressionLogger> wlc2, wlc<PlayerState> wlc3) {
        return new slc(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new LyricsLogger((InteractionLogger) this.a.get(), (ImpressionLogger) this.b.get(), this.c);
    }
}
