package defpackage;

import com.spotify.music.features.assistedcuration.search.AssistedCurationSearchLogger;

/* renamed from: lwk reason: default package */
public final class lwk implements wig<lwj> {
    private final wzi<lwd> a;
    private final wzi<AssistedCurationSearchLogger> b;
    private final wzi<sqe> c;
    private final wzi<squ> d;

    private lwk(wzi<lwd> wzi, wzi<AssistedCurationSearchLogger> wzi2, wzi<sqe> wzi3, wzi<squ> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static lwk a(wzi<lwd> wzi, wzi<AssistedCurationSearchLogger> wzi2, wzi<sqe> wzi3, wzi<squ> wzi4) {
        return new lwk(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new lwj((lwd) this.a.get(), (AssistedCurationSearchLogger) this.b.get(), (sqe) this.c.get(), (squ) this.d.get());
    }
}
