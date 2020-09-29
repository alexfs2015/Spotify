package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;

/* renamed from: myb reason: default package */
public final class myb {
    private final rgs a;
    private final gky<HubsJsonViewModel> b;
    private final wlc<rfe> c;
    private final boolean d;

    public myb(rgs rgs, gky<HubsJsonViewModel> gky, wlc<rfe> wlc, boolean z) {
        this.a = rgs;
        this.b = gky;
        this.c = wlc;
        this.d = z;
    }

    public final wud<gzz> a(String str) {
        if (this.d) {
            return vun.a((wrf<T>) ((rfe) this.c.get()).a());
        }
        return vun.a((wrf<T>) this.a.a(str)).d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$myb$75cZHfGLWwqEeW6IEQeEiGQkK4I<Object,Object>(this)).a(gzz.class);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(Uri uri) {
        return this.b.resolve(RequestBuilder.get(uri.toString()).build());
    }
}
