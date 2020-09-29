package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$ihc$e5HHgao4MeR4jqnKCfKi_JVd5rU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ihc$e5HHgao4MeR4jqnKCfKi_JVd5rU implements Consumer {
    private final /* synthetic */ String f$0;
    private final /* synthetic */ String f$1;

    public /* synthetic */ $$Lambda$ihc$e5HHgao4MeR4jqnKCfKi_JVd5rU(String str, String str2) {
        this.f$0 = str;
        this.f$1 = str2;
    }

    public final void accept(Object obj) {
        Logger.b("Failed to resolve %s for %s slot", this.f$0, this.f$1);
    }
}
