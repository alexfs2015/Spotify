package defpackage;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.intentrouter.CommandRunner.a;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: spv reason: default package */
public final class spv implements a<Intent> {
    public final void a(gjr<Intent> gjr) {
        Logger.b("Command started: %s (%s)", gjr.d(), gjr.c());
    }

    public final void b(gjr<Intent> gjr) {
        Logger.b("Command complete: %s (%s)", gjr.d(), gjr.c());
    }

    public final void a(gjr<Intent> gjr, Throwable th) {
        Assertion.a(String.format("Command failed: %s (%s)", new Object[]{gjr.d(), gjr.c()}), th);
    }
}
