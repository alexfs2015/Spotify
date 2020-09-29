package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion.Note;
import com.spotify.mobile.android.util.Assertion.RecoverableAssertionError;
import com.spotify.mobile.android.util.Assertion.a;

/* renamed from: jsa reason: default package */
public final class jsa implements a {
    private final jsq a;

    public jsa(jsq jsq) {
        this.a = jsq;
    }

    public final void a(AssertionError assertionError) {
        Logger.e(assertionError, "", new Object[0]);
        throw assertionError;
    }

    public final void a(RecoverableAssertionError recoverableAssertionError) {
        Throwable cause = recoverableAssertionError.getCause();
        if (cause != null) {
            Logger.b("%s: %s", recoverableAssertionError.getMessage(), cause.getMessage());
        } else {
            Logger.b("%s", recoverableAssertionError.getMessage());
        }
        String str = recoverableAssertionError.mDetails;
        if (str != null) {
            Logger.b("Details: %s", str);
        }
        this.a.a(recoverableAssertionError);
    }

    public final void a(Note note) {
        a((RecoverableAssertionError) note);
    }

    public final void a(Throwable th) {
        Logger.b("%s", th.getMessage());
        this.a.a(th);
    }
}
