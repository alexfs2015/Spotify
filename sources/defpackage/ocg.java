package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;

/* renamed from: ocg reason: default package */
public final class ocg implements a {
    final ujc a;
    private final gnj b;

    public ocg(gnj gnj, ujc ujc, a aVar) {
        this.b = (gnj) fay.a(gnj);
        this.a = (ujc) fay.a(ujc);
        ((a) fay.a(aVar)).a(new c() {
            public final void c() {
                super.c();
                ocg.this.a.a(ScreenIdentifier.PHONE_NUMBER_START);
            }
        });
    }

    public final void a() {
        this.a.a(ScreenIdentifier.PHONE_NUMBER_START, ClickIdentifier.PHONE_NUMBER_SIGN_UP_BUTTON);
        this.b.a();
    }

    public final void b() {
        this.a.a(ScreenIdentifier.PHONE_NUMBER_START, ClickIdentifier.FACEBOOK_BUTTON);
        this.b.c();
    }

    public final void c() {
        this.a.a(ScreenIdentifier.PHONE_NUMBER_START, ClickIdentifier.CONTINUE_WITH_EMAIL_BUTTON);
        this.b.b();
    }
}
