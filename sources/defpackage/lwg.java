package defpackage;

import com.spotify.music.features.assistedcuration.search.AssistedCurationSearchLogger;

/* renamed from: lwg reason: default package */
public final class lwg implements wig<lwf> {
    private final wzi<lwd> a;
    private final wzi<AssistedCurationSearchLogger> b;
    private final wzi<sin> c;
    private final wzi<sqb> d;
    private final wzi<squ> e;

    private lwg(wzi<lwd> wzi, wzi<AssistedCurationSearchLogger> wzi2, wzi<sin> wzi3, wzi<sqb> wzi4, wzi<squ> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static lwg a(wzi<lwd> wzi, wzi<AssistedCurationSearchLogger> wzi2, wzi<sin> wzi3, wzi<sqb> wzi4, wzi<squ> wzi5) {
        lwg lwg = new lwg(wzi, wzi2, wzi3, wzi4, wzi5);
        return lwg;
    }

    public final /* synthetic */ Object get() {
        lwf lwf = new lwf((lwd) this.a.get(), (AssistedCurationSearchLogger) this.b.get(), (sin) this.c.get(), (sqb) this.d.get(), (squ) this.e.get());
        return lwf;
    }
}
