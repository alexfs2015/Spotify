package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.connection.OfflineState;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$ura$oTcqcOzj4n4UscVQavDUwV7tn48 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ura$oTcqcOzj4n4UscVQavDUwV7tn48 implements Consumer {
    public static final /* synthetic */ $$Lambda$ura$oTcqcOzj4n4UscVQavDUwV7tn48 INSTANCE = new $$Lambda$ura$oTcqcOzj4n4UscVQavDUwV7tn48();

    private /* synthetic */ $$Lambda$ura$oTcqcOzj4n4UscVQavDUwV7tn48() {
    }

    public final void accept(Object obj) {
        Logger.b("PUT OfflineState %s", Boolean.valueOf(((OfflineState) obj).offline()));
    }
}
