package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;

/* renamed from: myc reason: default package */
public final class myc implements vua<myb> {
    private final wlc<rgs> a;
    private final wlc<gky<HubsJsonViewModel>> b;
    private final wlc<rfe> c;
    private final wlc<Boolean> d;

    private myc(wlc<rgs> wlc, wlc<gky<HubsJsonViewModel>> wlc2, wlc<rfe> wlc3, wlc<Boolean> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static myc a(wlc<rgs> wlc, wlc<gky<HubsJsonViewModel>> wlc2, wlc<rfe> wlc3, wlc<Boolean> wlc4) {
        return new myc(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new myb((rgs) this.a.get(), (gky) this.b.get(), this.c, ((Boolean) this.d.get()).booleanValue());
    }
}
