package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.session.model.LoginResponse.Error;

/* renamed from: -$$Lambda$hfh$JlPX2tRGuHjSgvdYctcS4FqgxPM reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hfh$JlPX2tRGuHjSgvdYctcS4FqgxPM implements gcs {
    public static final /* synthetic */ $$Lambda$hfh$JlPX2tRGuHjSgvdYctcS4FqgxPM INSTANCE = new $$Lambda$hfh$JlPX2tRGuHjSgvdYctcS4FqgxPM();

    private /* synthetic */ $$Lambda$hfh$JlPX2tRGuHjSgvdYctcS4FqgxPM() {
    }

    public final void accept(Object obj) {
        Logger.c("The user failed to autologin: %d (%s)", Integer.valueOf(((Error) obj).status()), ((Error) obj).error());
    }
}
