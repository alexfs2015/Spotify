package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import io.reactivex.Scheduler;

/* renamed from: njy reason: default package */
public final class njy {
    public final xok a = new xok();
    public final nks b;
    final gwp c;
    final szp d;
    final nki e;
    final String f;
    private final npd g;
    private final Scheduler h;
    private final xij<npk> i;

    njy(npd npd, Scheduler scheduler, nks nks, gwp gwp, szp szp, nki nki, String str) {
        this.g = npd;
        this.h = scheduler;
        this.b = nks;
        this.c = gwp;
        this.d = szp;
        this.e = nki;
        this.f = str;
        this.i = new xij<npk>() {
            public final void onCompleted() {
            }

            public final void onError(Throwable th) {
            }

            public final /* synthetic */ void onNext(Object obj) {
                npk npk = (npk) obj;
                hcs a2 = npk.a();
                njy njy = njy.this;
                String[] stringArray = a2.custom().stringArray("ondemand");
                if (!fbo.a(njy.f) && stringArray != null && stringArray.length > 0 && njy.e.a.a(nki.d, true)) {
                    njy.e.a.a().a(nki.d, false).b();
                    njy.d.a(njy.f);
                }
                njy.this.c.a(a2, false);
                njy.this.b.a(a2.custom());
                if (npk.b()) {
                    njy.this.b.f();
                }
                Logger.b("HomeLoad: onNext() -> viewModel id: %s, body size %s:", a2.id(), Integer.valueOf(a2.body().size()));
            }
        };
    }

    public final void a() {
        this.a.a();
        this.a.a(this.g.a((hcs) this.c.d.a()).a(wit.a(this.h)).a(this.i));
    }

    public final void a(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null) {
            bundle.setClassLoader(gwp.class.getClassLoader());
            parcelable = bundle.getParcelable("com.spotify.music.features.home.nft.presenter.HomePresenter.STATE");
        } else {
            parcelable = null;
        }
        this.c.a(parcelable);
    }

    public final View b() {
        return this.b.a;
    }

    public final void b(Bundle bundle) {
        bundle.putParcelable("com.spotify.music.features.home.nft.presenter.HomePresenter.STATE", this.c.a());
    }
}
