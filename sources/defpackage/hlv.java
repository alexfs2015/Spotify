package defpackage;

import android.os.Handler;
import com.google.common.base.Optional;
import com.spotify.core.orbit.OrbitServiceInterface;

/* renamed from: hlv reason: default package */
public final class hlv implements vua<hlu> {
    private final wlc<Optional<OrbitServiceInterface>> a;
    private final wlc<Handler> b;

    public static hlu a(Optional<OrbitServiceInterface> optional, Handler handler) {
        return new hlu(optional, handler);
    }

    public final /* synthetic */ Object get() {
        return new hlu((Optional) this.a.get(), (Handler) this.b.get());
    }
}
