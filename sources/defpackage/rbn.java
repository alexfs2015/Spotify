package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.MusicPagesLogger;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: rbn reason: default package */
public final class rbn implements wig<MusicPagesLogger> {
    private final wzi<InteractionLogger> a;
    private final wzi<ImpressionLogger> b;

    private rbn(wzi<InteractionLogger> wzi, wzi<ImpressionLogger> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rbn a(wzi<InteractionLogger> wzi, wzi<ImpressionLogger> wzi2) {
        return new rbn(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new MusicPagesLogger((InteractionLogger) this.a.get(), (ImpressionLogger) this.b.get());
    }
}
