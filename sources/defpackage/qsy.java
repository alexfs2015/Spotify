package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.MusicPagesLogger;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: qsy reason: default package */
public final class qsy implements vua<MusicPagesLogger> {
    private final wlc<InteractionLogger> a;
    private final wlc<ImpressionLogger> b;

    private qsy(wlc<InteractionLogger> wlc, wlc<ImpressionLogger> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qsy a(wlc<InteractionLogger> wlc, wlc<ImpressionLogger> wlc2) {
        return new qsy(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new MusicPagesLogger((InteractionLogger) this.a.get(), (ImpressionLogger) this.b.get());
    }
}
