package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$mjk$Gflb8U4gn7nBpthlaOvSq5ktbe4 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$mjk$Gflb8U4gn7nBpthlaOvSq5ktbe4 implements Consumer {
    public static final /* synthetic */ $$Lambda$mjk$Gflb8U4gn7nBpthlaOvSq5ktbe4 INSTANCE = new $$Lambda$mjk$Gflb8U4gn7nBpthlaOvSq5ktbe4();

    private /* synthetic */ $$Lambda$mjk$Gflb8U4gn7nBpthlaOvSq5ktbe4() {
    }

    public final void accept(Object obj) {
        Assertion.a("Active scan failed", (Throwable) obj);
    }
}
