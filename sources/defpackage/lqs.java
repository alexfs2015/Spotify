package defpackage;

import com.spotify.music.features.addtoplaylist.AddToPlaylistLogger;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: lqs reason: default package */
public final class lqs implements wig<AddToPlaylistLogger> {
    private final wzi<InteractionLogger> a;
    private final wzi<ImpressionLogger> b;
    private final wzi<jlr> c;

    private lqs(wzi<InteractionLogger> wzi, wzi<ImpressionLogger> wzi2, wzi<jlr> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static lqs a(wzi<InteractionLogger> wzi, wzi<ImpressionLogger> wzi2, wzi<jlr> wzi3) {
        return new lqs(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new AddToPlaylistLogger((InteractionLogger) this.a.get(), (ImpressionLogger) this.b.get(), (jlr) this.c.get());
    }
}
