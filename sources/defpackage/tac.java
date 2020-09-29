package defpackage;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.intentrouter.CommandRunner.a;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: tac reason: default package */
public final class tac implements a<Intent> {
    public final void a(glc<Intent> glc) {
        Logger.b("Command started: %s (%s)", glc.d(), glc.c());
    }

    public final void a(glc<Intent> glc, Throwable th) {
        Assertion.a(String.format("Command failed: %s (%s)", new Object[]{glc.d(), glc.c()}), th);
    }

    public final void b(glc<Intent> glc) {
        Logger.b("Command complete: %s (%s)", glc.d(), glc.c());
    }
}
