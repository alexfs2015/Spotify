package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.SingleSource;

/* renamed from: mfi reason: default package */
public final class mfi implements wig<xim<HubsJsonViewModel>> {
    private final wzi<sso> a;
    private final wzi<mez> b;

    private mfi(wzi<sso> wzi, wzi<mez> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static mfi a(wzi<sso> wzi, wzi<mez> wzi2) {
        return new mfi(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        mez mez = (mez) this.b.get();
        String sso = ((sso) this.a.get()).toString();
        return (xim) wil.a((sso.endsWith(":regional") || sso.endsWith(":viral") || sso.endsWith(":language")) ? wit.a((SingleSource<T>) mez.a(sso.substring(sso.lastIndexOf(58) + 1))) : wit.a((SingleSource<T>) mez.a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
