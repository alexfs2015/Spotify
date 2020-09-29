package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import io.reactivex.disposables.Disposables;

/* renamed from: nyr reason: default package */
public final class nyr implements a {
    final uun a;
    private final goy b;
    private final nyp c;

    public nyr(nyi nyi, goy goy, uun uun, nyp nyp, a aVar, final geu geu) {
        this.b = goy;
        this.a = uun;
        this.c = nyp;
        nyi.getClass();
        geu.a((gcp<String>) new $$Lambda$A3AyjAAvLuxfSFjTE9jFPXB_Cuc<String>(nyi));
        aVar.a(new c() {
            public final void a() {
                geu.a.a(Disposables.a());
                super.a();
            }

            public final void c() {
                super.c();
                nyr.this.a.a(ScreenIdentifier.START);
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
