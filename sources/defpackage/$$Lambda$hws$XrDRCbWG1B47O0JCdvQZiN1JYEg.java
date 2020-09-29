package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hws$XrDRCbWG1B47O0JCdvQZiN1JYEg reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hws$XrDRCbWG1B47O0JCdvQZiN1JYEg implements Consumer {
    private final /* synthetic */ String f$0;

    public /* synthetic */ $$Lambda$hws$XrDRCbWG1B47O0JCdvQZiN1JYEg(String str) {
        this.f$0 = str;
    }

    public final void accept(Object obj) {
        Logger.b("preroll - failed to fetch preroll with view uri: %s", this.f$0);
    }
}
