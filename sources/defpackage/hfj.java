package defpackage;

import android.content.Context;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.mobile.android.service.StateRestoreFileDeleter;

/* renamed from: hfj reason: default package */
public final class hfj implements vua<hfi> {
    private final wlc<Context> a;
    private final wlc<hga> b;
    private final wlc<StateRestoreFileDeleter> c;
    private final wlc<a> d;
    private final wlc<FireAndForgetResolver> e;
    private final wlc<hmy> f;
    private final wlc<jjd> g;

    private hfj(wlc<Context> wlc, wlc<hga> wlc2, wlc<StateRestoreFileDeleter> wlc3, wlc<a> wlc4, wlc<FireAndForgetResolver> wlc5, wlc<hmy> wlc6, wlc<jjd> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static hfj a(wlc<Context> wlc, wlc<hga> wlc2, wlc<StateRestoreFileDeleter> wlc3, wlc<a> wlc4, wlc<FireAndForgetResolver> wlc5, wlc<hmy> wlc6, wlc<jjd> wlc7) {
        hfj hfj = new hfj(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return hfj;
    }

    public final /* synthetic */ Object get() {
        hfi hfi = new hfi((Context) this.a.get(), (hga) this.b.get(), (StateRestoreFileDeleter) this.c.get(), (a) this.d.get(), (FireAndForgetResolver) this.e.get(), (hmy) this.f.get(), (jjd) this.g.get());
        return hfi;
    }
}
