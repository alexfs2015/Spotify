package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$mwe$dx7oJIiAmpewpXOaEv5LgIT1Ink reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$mwe$dx7oJIiAmpewpXOaEv5LgIT1Ink implements Consumer {
    private final /* synthetic */ String f$0;

    public /* synthetic */ $$Lambda$mwe$dx7oJIiAmpewpXOaEv5LgIT1Ink(String str) {
        this.f$0 = str;
    }

    public final void accept(Object obj) {
        Logger.b("Failed to fetch follow data for %s", this.f$0);
    }
}
