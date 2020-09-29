package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: opb reason: default package */
public final class opb {
    private final jjf a;
    private final sih b;

    public opb(jjf jjf, sih sih) {
        this.a = jjf;
        this.b = sih;
    }

    public final InteractionLogger a(gjf gjf) {
        return new InteractionLogger(this.a, this.b, gjf);
    }
}
