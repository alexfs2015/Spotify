package defpackage;

import com.spotify.music.features.assistedcuration.search.AssistedCurationSearchLogger;

/* renamed from: lwc reason: default package */
public final class lwc implements wig<AssistedCurationSearchLogger> {
    private final wzi<jlr> a;

    private lwc(wzi<jlr> wzi) {
        this.a = wzi;
    }

    public static lwc a(wzi<jlr> wzi) {
        return new lwc(wzi);
    }

    public final /* synthetic */ Object get() {
        return new AssistedCurationSearchLogger((jlr) this.a.get());
    }
}
