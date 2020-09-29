package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: myn reason: default package */
public final class myn implements wig<rok> {
    private final wzi<ImpressionLogger> a;
    private final wzi<roi> b;

    private myn(wzi<ImpressionLogger> wzi, wzi<roi> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static myn a(wzi<ImpressionLogger> wzi, wzi<roi> wzi2) {
        return new myn(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (rok) wil.a(new rok((ImpressionLogger) this.a.get(), (roi) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
