package defpackage;

import android.content.res.Resources;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;

/* renamed from: may reason: default package */
public final class may implements vua<max> {
    private final wlc<Resources> a;
    private final wlc<wuh<HubsJsonViewModel>> b;
    private final wlc<wug> c;
    private final wlc<wug> d;
    private final wlc<rfd> e;

    private may(wlc<Resources> wlc, wlc<wuh<HubsJsonViewModel>> wlc2, wlc<wug> wlc3, wlc<wug> wlc4, wlc<rfd> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static may a(wlc<Resources> wlc, wlc<wuh<HubsJsonViewModel>> wlc2, wlc<wug> wlc3, wlc<wug> wlc4, wlc<rfd> wlc5) {
        may may = new may(wlc, wlc2, wlc3, wlc4, wlc5);
        return may;
    }

    public final /* synthetic */ Object get() {
        max max = new max((Resources) this.a.get(), (wuh) this.b.get(), (wug) this.c.get(), (wug) this.d.get(), (rfd) this.e.get());
        return max;
    }
}
