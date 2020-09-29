package defpackage;

import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;

/* renamed from: man reason: default package */
public final class man implements wig<hcs> {
    private final wzi<Boolean> a;
    private final wzi<mdl> b;

    private man(wzi<Boolean> wzi, wzi<mdl> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static man a(wzi<Boolean> wzi, wzi<mdl> wzi2) {
        return new man(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        hcs hcs;
        mdl mdl = (mdl) this.b.get();
        String str = "browse-loading-empty-view";
        if (((Boolean) this.a.get()).booleanValue()) {
            hcs = hbb.b().a(hcx.builder().a((hck) HubsCommonComponent.LOADING_SPINNER).a()).a(mdl.a(str)).a();
        } else {
            hcs = hbb.b().c(hcx.builder().a((hck) HubsCommonComponent.LOADING_SPINNER).a()).a(mdl.a(str)).a();
        }
        return (hcs) wil.a(hcs, "Cannot return null from a non-@Nullable @Provides method");
    }
}
