package defpackage;

import com.spotify.music.features.album.logger.AlbumLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: log reason: default package */
public final class log implements vua<AlbumLogger> {
    private final wlc<InteractionLogger> a;

    private log(wlc<InteractionLogger> wlc) {
        this.a = wlc;
    }

    public static log a(wlc<InteractionLogger> wlc) {
        return new log(wlc);
    }

    public final /* synthetic */ Object get() {
        return new AlbumLogger((InteractionLogger) this.a.get());
    }
}
