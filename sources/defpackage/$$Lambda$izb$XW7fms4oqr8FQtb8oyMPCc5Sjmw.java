package defpackage;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$izb$XW7fms4oqr8FQtb8oyMPCc5Sjmw reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$izb$XW7fms4oqr8FQtb8oyMPCc5Sjmw implements Consumer {
    private final /* synthetic */ Uri f$0;

    public /* synthetic */ $$Lambda$izb$XW7fms4oqr8FQtb8oyMPCc5Sjmw(Uri uri) {
        this.f$0 = uri;
    }

    public final void accept(Object obj) {
        Logger.b("Time to revoke uri: %s", this.f$0);
    }
}
