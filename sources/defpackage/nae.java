package defpackage;

import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider;

/* renamed from: nae reason: default package */
public final class nae implements wig<nad> {
    private final wzi<String> a;
    private final wzi<AlbumOfflineStateProvider> b;

    private nae(wzi<String> wzi, wzi<AlbumOfflineStateProvider> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nae a(wzi<String> wzi, wzi<AlbumOfflineStateProvider> wzi2) {
        return new nae(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new nad((String) this.a.get(), (AlbumOfflineStateProvider) this.b.get());
    }
}
