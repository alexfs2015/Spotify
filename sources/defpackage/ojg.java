package defpackage;

import com.spotify.mobile.android.util.SpotifyError;
import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import com.spotify.music.spotlets.tracker.identifier.DialogIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ErrorTypeIdentifier;
import com.spotify.music.spotlets.tracker.identifier.EventIdentifier;
import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;

/* renamed from: ojg reason: default package */
public final class ojg implements ojf {
    private final uun a;
    private final oje b;

    public ojg(uun uun) {
        this.a = (uun) fbp.a(uun);
        this.b = new oje(uun);
    }

    public final void a() {
        this.a.a(ScreenIdentifier.PHONE_NUMBER_PHONE_NUMBER, EventIdentifier.OTP_REQUEST_SUCCESS);
    }

    public final void a(ScreenIdentifier screenIdentifier) {
        this.a.a(screenIdentifier, EventIdentifier.OTP_SESSION_EXPIRED);
        this.a.a(screenIdentifier, DialogIdentifier.PHONE_NUMBER_TIMEOUT);
    }

    public final void a(ScreenIdentifier screenIdentifier, SpotifyError spotifyError) {
        String valueOf = String.valueOf(spotifyError.mCode);
        this.a.a(screenIdentifier, ErrorTypeIdentifier.NO_CONNECTION, null, valueOf);
    }

    public final void b() {
        this.a.a(ScreenIdentifier.PHONE_NUMBER_PHONE_NUMBER, EventIdentifier.OTP_REQUEST_FAILURE);
    }

    public final void b(ScreenIdentifier screenIdentifier) {
        this.a.a(screenIdentifier);
    }

    public final void c() {
        this.b.a.clear();
    }

    public final void c(ScreenIdentifier screenIdentifier) {
        this.a.b(screenIdentifier);
    }

    public final void d() {
        this.a.a(ScreenIdentifier.PHONE_NUMBER_PHONE_NUMBER, ClickIdentifier.SHOW_CALLING_CODES_BUTTON);
    }

    public final void d(ScreenIdentifier screenIdentifier) {
        this.a.a(screenIdentifier, DialogIdentifier.PHONE_NUMBER_ERROR);
    }

    public final void e() {
        this.a.a(ScreenIdentifier.PHONE_NUMBER_PHONE_NUMBER, InputFieldIdentifier.CALLING_CODE);
    }

    public final void f() {
        this.b.a(InputFieldIdentifier.PHONE_NUMBER, ScreenIdentifier.PHONE_NUMBER_PHONE_NUMBER);
    }

    public final void g() {
        this.a.a(ScreenIdentifier.PHONE_NUMBER_PHONE_NUMBER, ClickIdentifier.REQUEST_OTP_BUTTON);
    }

    public final void h() {
        this.a.a(ScreenIdentifier.PHONE_NUMBER_OTP, EventIdentifier.OTP_VALIDATION_SUCCESS);
    }

    public final void i() {
        this.a.a(ScreenIdentifier.PHONE_NUMBER_OTP, EventIdentifier.OTP_VALIDATION_FAILURE);
    }

    public final void j() {
        this.a.a(ScreenIdentifier.PHONE_NUMBER_OTP, DialogIdentifier.PHONE_NUMBER_RESEND_TOO_EARLY);
    }

    public final void k() {
        this.a.a(ScreenIdentifier.PHONE_NUMBER_OTP, EventIdentifier.OTP_REQUEST_SUCCESS);
    }

    public final void l() {
        this.a.a(ScreenIdentifier.PHONE_NUMBER_OTP, EventIdentifier.OTP_REQUEST_FAILURE);
    }

    public final void m() {
        this.b.a(InputFieldIdentifier.OTP, ScreenIdentifier.PHONE_NUMBER_OTP);
    }

    public final void n() {
        this.a.a(ScreenIdentifier.PHONE_NUMBER_OTP, ClickIdentifier.RESEND_SMS_BUTTON);
    }

    public final void o() {
        this.a.a(ScreenIdentifier.PHONE_NUMBER_OTP, ClickIdentifier.EDIT_PHONE_NUMBER_BUTTON);
    }

    public final void p() {
        this.a.a(ScreenIdentifier.PHONE_NUMBER_OTP, ClickIdentifier.VALIDATE_OTP_BUTTON);
    }

    public final void q() {
        this.a.a(ScreenIdentifier.PHONE_NUMBER_PHONE_NUMBER, DialogIdentifier.PHONE_NUMBER_INVALID_NUMBER);
    }

    public final void r() {
        this.a.a(ScreenIdentifier.PHONE_NUMBER_OTP, DialogIdentifier.PHONE_NUMBER_TOO_MANY_TRIES);
    }

    public final void s() {
        this.a.a(ScreenIdentifier.PHONE_NUMBER_OTP, DialogIdentifier.PHONE_NUMBER_TRY_AGAIN_LATER);
    }
}
