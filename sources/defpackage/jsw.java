package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion.Note;
import com.spotify.mobile.android.util.Assertion.RecoverableAssertionError;
import com.spotify.mobile.android.util.Assertion.a;

/* renamed from: jsw reason: default package */
public final class jsw implements a {
    public final void a(AssertionError assertionError) {
        Logger.e(assertionError, "", new Object[0]);
        throw assertionError;
    }

    public final void a(RecoverableAssertionError recoverableAssertionError) {
        Logger.e(recoverableAssertionError, "", new Object[0]);
        throw recoverableAssertionError;
    }

    public final void a(Note note) {
        Logger.e(note, "", new Object[0]);
    }

    public final void a(Throwable th) {
        Logger.b("%s", th.getMessage());
        throw th;
    }
}
