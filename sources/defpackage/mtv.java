package defpackage;

import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider.OfflineState;

/* renamed from: mtv reason: default package */
public final class mtv implements vua<gky<OfflineState>> {
    private final wlc<gkz> a;

    private mtv(wlc<gkz> wlc) {
        this.a = wlc;
    }

    public static mtv a(wlc<gkz> wlc) {
        return new mtv(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gky) vuf.a(((gkz) this.a.get()).a(OfflineState.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
