package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: nlx reason: default package */
public final class nlx implements wig<nlw> {
    private final wzi<ImpressionLogger> a;
    private final wzi<roi> b;

    private nlx(wzi<ImpressionLogger> wzi, wzi<roi> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nlx a(wzi<ImpressionLogger> wzi, wzi<roi> wzi2) {
        return new nlx(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new nlw((ImpressionLogger) this.a.get(), (roi) this.b.get());
    }
}
