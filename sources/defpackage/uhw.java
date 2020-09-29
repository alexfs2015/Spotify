package defpackage;

import com.spotify.music.spotlets.scannables.model.IdModel;

/* renamed from: uhw reason: default package */
public final class uhw implements vua<gky<IdModel>> {
    private final wlc<gkz> a;

    private uhw(wlc<gkz> wlc) {
        this.a = wlc;
    }

    public static uhw a(wlc<gkz> wlc) {
        return new uhw(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gky) vuf.a(((gkz) this.a.get()).a(IdModel.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
