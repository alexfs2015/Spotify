package defpackage;

import com.spotify.music.features.addtoplaylist.AddToPlaylistLogger;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: lms reason: default package */
public final class lms implements vua<AddToPlaylistLogger> {
    private final wlc<InteractionLogger> a;
    private final wlc<ImpressionLogger> b;
    private final wlc<jjf> c;

    private lms(wlc<InteractionLogger> wlc, wlc<ImpressionLogger> wlc2, wlc<jjf> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static lms a(wlc<InteractionLogger> wlc, wlc<ImpressionLogger> wlc2, wlc<jjf> wlc3) {
        return new lms(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new AddToPlaylistLogger((InteractionLogger) this.a.get(), (ImpressionLogger) this.b.get(), (jjf) this.c.get());
    }
}
