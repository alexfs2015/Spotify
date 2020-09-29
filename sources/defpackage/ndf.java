package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;

/* renamed from: ndf reason: default package */
public final class ndf implements wig<gmm<HubsJsonViewModel>> {
    private final wzi<gmn> a;

    private ndf(wzi<gmn> wzi) {
        this.a = wzi;
    }

    public static ndf a(wzi<gmn> wzi) {
        return new ndf(wzi);
    }

    public final /* synthetic */ Object get() {
        return (gmm) wil.a(((gmn) this.a.get()).a(HubsJsonViewModel.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
