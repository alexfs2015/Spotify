package defpackage;

import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider;

/* renamed from: mzj reason: default package */
public final class mzj implements wig<mzi> {
    private final wzi<hhc> a;
    private final wzi<String> b;
    private final wzi<AlbumOfflineStateProvider> c;

    private mzj(wzi<hhc> wzi, wzi<String> wzi2, wzi<AlbumOfflineStateProvider> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static mzj a(wzi<hhc> wzi, wzi<String> wzi2, wzi<AlbumOfflineStateProvider> wzi3) {
        return new mzj(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new mzi((hhc) this.a.get(), (String) this.b.get(), (AlbumOfflineStateProvider) this.c.get());
    }
}
