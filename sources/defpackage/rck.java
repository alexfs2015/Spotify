package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.bans.BansLoader;

/* renamed from: rck reason: default package */
public final class rck implements wig<rcj> {
    private final wzi<BansLoader> a;

    private rck(wzi<BansLoader> wzi) {
        this.a = wzi;
    }

    public static rck a(wzi<BansLoader> wzi) {
        return new rck(wzi);
    }

    public final /* synthetic */ Object get() {
        return new rcj((BansLoader) this.a.get());
    }
}
