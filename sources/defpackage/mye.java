package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;

/* renamed from: mye reason: default package */
public final class mye implements vua<gky<HubsJsonViewModel>> {
    private final wlc<gkz> a;

    private mye(wlc<gkz> wlc) {
        this.a = wlc;
    }

    public static mye a(wlc<gkz> wlc) {
        return new mye(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gky) vuf.a(((gkz) this.a.get()).a(HubsJsonViewModel.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
