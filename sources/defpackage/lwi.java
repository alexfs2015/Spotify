package defpackage;

import com.spotify.music.features.assistedcuration.search.AssistedCurationSearchLogger;

/* renamed from: lwi reason: default package */
public final class lwi implements wig<lwh> {
    private final wzi<lwd> a;
    private final wzi<AssistedCurationSearchLogger> b;
    private final wzi<squ> c;

    private lwi(wzi<lwd> wzi, wzi<AssistedCurationSearchLogger> wzi2, wzi<squ> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static lwi a(wzi<lwd> wzi, wzi<AssistedCurationSearchLogger> wzi2, wzi<squ> wzi3) {
        return new lwi(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new lwh((lwd) this.a.get(), (AssistedCurationSearchLogger) this.b.get(), (squ) this.c.get());
    }
}
