package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import io.reactivex.disposables.Disposables;

/* renamed from: nso reason: default package */
public final class nso implements a {
    final ujc a;
    private final gnj b;
    private final nsm c;

    public nso(nsf nsf, gnj gnj, ujc ujc, nsm nsm, a aVar, final gdj gdj) {
        this.b = gnj;
        this.a = ujc;
        this.c = nsm;
        nsf.getClass();
        gdj.a((gbr<String>) new $$Lambda$GNNHEJOhWGM24IUzE2cQkvUfENQ<String>(nsf));
        aVar.a(new c() {
            public final void c() {
                super.c();
                nso.this.a.a(ScreenIdentifier.START);
            }

            public final void a() {
                gdj.a.a(Disposables.a());
                super.a();
            }
        });
    }

    public final void a() {
        this.a.a(ScreenIdentifier.START, ClickIdentifier.FACEBOOK_BUTTON);
        this.b.c();
    }

    public final void b() {
        this.a.a(ScreenIdentifier.START, ClickIdentifier.LOGIN_BUTTON);
        this.c.a();
        this.b.a((String) null);
    }

    public final void c() {
        this.a.a(ScreenIdentifier.START, ClickIdentifier.SIGN_UP_BUTTON);
    }
}
