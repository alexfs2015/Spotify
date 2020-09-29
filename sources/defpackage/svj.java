package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.lyrics.logger.LyricsLogger;

/* renamed from: svj reason: default package */
public final class svj implements wig<LyricsLogger> {
    private final wzi<InteractionLogger> a;
    private final wzi<ImpressionLogger> b;
    private final wzi<PlayerState> c;

    private svj(wzi<InteractionLogger> wzi, wzi<ImpressionLogger> wzi2, wzi<PlayerState> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static svj a(wzi<InteractionLogger> wzi, wzi<ImpressionLogger> wzi2, wzi<PlayerState> wzi3) {
        return new svj(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new LyricsLogger((InteractionLogger) this.a.get(), (ImpressionLogger) this.b.get(), this.c);
    }
}
