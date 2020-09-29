package defpackage;

import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: -$$Lambda$lvs$1$gjuKq0E1XOQRqXQTHGnCzE5cRAY reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$lvs$1$gjuKq0E1XOQRqXQTHGnCzE5cRAY implements Function {
    private final /* synthetic */ Set f$0;

    public /* synthetic */ $$Lambda$lvs$1$gjuKq0E1XOQRqXQTHGnCzE5cRAY(Set set) {
        this.f$0 = set;
    }

    public final Object apply(Object obj) {
        return Collections.singletonMap("suggested_songs", new lve((List) obj).a(this.f$0));
    }
}
