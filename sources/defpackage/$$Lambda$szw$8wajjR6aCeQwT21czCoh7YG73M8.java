package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$szw$8wajjR6aCeQwT21czCoh7YG73M8 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$szw$8wajjR6aCeQwT21czCoh7YG73M8 implements Consumer {
    private final /* synthetic */ Object f$0;

    public /* synthetic */ $$Lambda$szw$8wajjR6aCeQwT21czCoh7YG73M8(Object obj) {
        this.f$0 = obj;
    }

    public final void accept(Object obj) {
        Logger.b("AppReadyCommand(%x): session state ready.", Integer.valueOf(this.f$0.hashCode()));
    }
}
