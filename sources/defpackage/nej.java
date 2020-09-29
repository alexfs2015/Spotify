package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import io.reactivex.Scheduler;

/* renamed from: nej reason: default package */
public final class nej {
    public final xag a = new xag();
    public final nfd b;
    final gup c;
    final spi d;
    final net e;
    final String f;
    private final njh g;
    private final Scheduler h;
    private final wue<njo> i;

    nej(njh njh, Scheduler scheduler, nfd nfd, gup gup, spi spi, net net, String str) {
        this.g = njh;
        this.h = scheduler;
        this.b = nfd;
        this.c = gup;
        this.d = spi;
        this.e = net;
        this.f = str;
        this.i = new wue<njo>() {
            public final void onCompleted() {
            }

            public final void onError(Throwable th) {
            }

            public final /* synthetic */ void onNext(Object obj) {
                njo njo = (njo) obj;
                gzz a2 = njo.a();
                nej nej = nej.this;
                String[] stringArray = a2.custom().stringArray("ondemand");
                if (!fax.a(nej.f) && stringArray != null && stringArray.length > 0 && nej.e.a.a(net.d, true)) {
                    nej.e.a.a().a(net.d, false).b();
                    nej.d.a(nej.f);
                }
                nej.this.c.a(a2, false);
                nej.this.b.a(a2.custom());
                if (njo.b()) {
                    nej.this.b.f();
                }
                Logger.b("HomeLoad: onNext() -> viewModel id: %s, body size %s:", a2.id(), Integer.valueOf(a2.body().size()));
            }
        };
    }

    public final void a() {
        this.a.a();
        this.a.a(this.g.a((gzz) this.c.d.a()).a(vun.a(this.h)).a(this.i));
    }

    public final View b() {
        return this.b.a;
    }

    public final void a(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null) {
            bundle.setClassLoader(gup.class.getClassLoader());
            parcelable = bundle.getParcelable("com.spotify.music.features.home.nft.presenter.HomePresenter.STATE");
        } else {
            parcelable = null;
        }
        this.c.a(parcelable);
    }

    public final void b(Bundle bundle) {
        bundle.putParcelable("com.spotify.music.features.home.nft.presenter.HomePresenter.STATE", this.c.a());
    }
}
