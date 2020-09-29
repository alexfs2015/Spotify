package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$mtt$7qGQvM1b5Lc-MCeuYIskh3kjBAk reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$mtt$7qGQvM1b5LcMCeuYIskh3kjBAk implements Consumer {
    public static final /* synthetic */ $$Lambda$mtt$7qGQvM1b5LcMCeuYIskh3kjBAk INSTANCE = new $$Lambda$mtt$7qGQvM1b5LcMCeuYIskh3kjBAk();

    private /* synthetic */ $$Lambda$mtt$7qGQvM1b5LcMCeuYIskh3kjBAk() {
    }

    public final void accept(Object obj) {
        Assertion.a("Connection state error", (Throwable) obj);
    }
}
