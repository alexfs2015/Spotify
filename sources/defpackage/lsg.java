package defpackage;

import com.spotify.music.features.album.logger.AlbumLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: lsg reason: default package */
public final class lsg implements wig<AlbumLogger> {
    private final wzi<InteractionLogger> a;

    private lsg(wzi<InteractionLogger> wzi) {
        this.a = wzi;
    }

    public static lsg a(wzi<InteractionLogger> wzi) {
        return new lsg(wzi);
    }

    public final /* synthetic */ Object get() {
        return new AlbumLogger((InteractionLogger) this.a.get());
    }
}
