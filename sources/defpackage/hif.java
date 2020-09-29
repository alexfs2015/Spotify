package defpackage;

import android.content.Context;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.mobile.android.service.StateRestoreFileDeleter;

/* renamed from: hif reason: default package */
public final class hif implements wig<hie> {
    private final wzi<Context> a;
    private final wzi<hiw> b;
    private final wzi<StateRestoreFileDeleter> c;
    private final wzi<a> d;
    private final wzi<FireAndForgetResolver> e;
    private final wzi<hpp> f;
    private final wzi<jlp> g;

    private hif(wzi<Context> wzi, wzi<hiw> wzi2, wzi<StateRestoreFileDeleter> wzi3, wzi<a> wzi4, wzi<FireAndForgetResolver> wzi5, wzi<hpp> wzi6, wzi<jlp> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static hif a(wzi<Context> wzi, wzi<hiw> wzi2, wzi<StateRestoreFileDeleter> wzi3, wzi<a> wzi4, wzi<FireAndForgetResolver> wzi5, wzi<hpp> wzi6, wzi<jlp> wzi7) {
        hif hif = new hif(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return hif;
    }

    public final /* synthetic */ Object get() {
        hie hie = new hie((Context) this.a.get(), (hiw) this.b.get(), (StateRestoreFileDeleter) this.c.get(), (a) this.d.get(), (FireAndForgetResolver) this.e.get(), (hpp) this.f.get(), (jlp) this.g.get());
        return hie;
    }
}
