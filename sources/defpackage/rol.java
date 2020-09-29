package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: rol reason: default package */
public final class rol implements wig<rok> {
    private final wzi<ImpressionLogger> a;
    private final wzi<roi> b;

    private rol(wzi<ImpressionLogger> wzi, wzi<roi> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rol a(wzi<ImpressionLogger> wzi, wzi<roi> wzi2) {
        return new rol(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rok((ImpressionLogger) this.a.get(), (roi) this.b.get());
    }
}
