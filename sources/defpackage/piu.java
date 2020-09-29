package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: piu reason: default package */
public final class piu implements wig<pit> {
    private final wzi<ImpressionLogger> a;

    private piu(wzi<ImpressionLogger> wzi) {
        this.a = wzi;
    }

    public static piu a(wzi<ImpressionLogger> wzi) {
        return new piu(wzi);
    }

    public final /* synthetic */ Object get() {
        return new pit((ImpressionLogger) this.a.get());
    }
}
