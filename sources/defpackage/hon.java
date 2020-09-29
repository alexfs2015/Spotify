package defpackage;

import android.os.Handler;
import com.google.common.base.Optional;
import com.spotify.core.orbit.OrbitServiceInterface;

/* renamed from: hon reason: default package */
public final class hon implements wig<hom> {
    private final wzi<Optional<OrbitServiceInterface>> a;
    private final wzi<Handler> b;

    public static hom a(Optional<OrbitServiceInterface> optional, Handler handler) {
        return new hom(optional, handler);
    }

    public final /* synthetic */ Object get() {
        return new hom((Optional) this.a.get(), (Handler) this.b.get());
    }
}
