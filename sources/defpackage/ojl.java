package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;

/* renamed from: ojl reason: default package */
public final class ojl implements a {
    final uun a;
    private final goy b;

    public ojl(goy goy, uun uun, a aVar) {
        this.b = (goy) fbp.a(goy);
        this.a = (uun) fbp.a(uun);
        ((a) fbp.a(aVar)).a(new c() {
            public final void c() {
                super.c();
                ojl.this.a.a(ScreenIdentifier.PHONE_NUMBER_START);
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
