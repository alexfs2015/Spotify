package defpackage;

import com.spotify.music.spotlets.offline.util.OffliningLogger;

/* renamed from: pis reason: default package */
public final class pis implements wig<pir> {
    private final wzi<String> a;
    private final wzi<OffliningLogger> b;
    private final wzi<jlr> c;
    private final wzi<jtp> d;

    private pis(wzi<String> wzi, wzi<OffliningLogger> wzi2, wzi<jlr> wzi3, wzi<jtp> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static pis a(wzi<String> wzi, wzi<OffliningLogger> wzi2, wzi<jlr> wzi3, wzi<jtp> wzi4) {
        return new pis(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new pir((String) this.a.get(), (OffliningLogger) this.b.get(), (jlr) this.c.get(), (jtp) this.d.get());
    }
}
