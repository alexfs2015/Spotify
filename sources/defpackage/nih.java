package defpackage;

import com.spotify.music.features.hiddencontent.loader.BansLoader;
import com.spotify.music.features.hiddencontent.loader.BansLoader.BansResponse;

/* renamed from: nih reason: default package */
public final class nih implements wig<BansLoader> {
    private final wzi<gmm<BansResponse>> a;

    private nih(wzi<gmm<BansResponse>> wzi) {
        this.a = wzi;
    }

    public static nih a(wzi<gmm<BansResponse>> wzi) {
        return new nih(wzi);
    }

    public final /* synthetic */ Object get() {
        return new BansLoader((gmm) this.a.get());
    }
}
