package defpackage;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$jbm$5N4PlEDBMFkruZIOn5pQSacERbc reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$jbm$5N4PlEDBMFkruZIOn5pQSacERbc implements Consumer {
    private final /* synthetic */ Uri f$0;

    public /* synthetic */ $$Lambda$jbm$5N4PlEDBMFkruZIOn5pQSacERbc(Uri uri) {
        this.f$0 = uri;
    }

    public final void accept(Object obj) {
        Logger.b("Time to revoke uri: %s", this.f$0);
    }
}
