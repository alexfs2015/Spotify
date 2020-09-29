package defpackage;

import android.content.Context;
import com.spotify.core.orbit.OrbitServiceInterface;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.mobile.android.cosmos.router.QueuingRemoteNativeRouter;
import com.spotify.mobile.android.service.StateRestoreFileDeleter;
import com.spotify.mobile.android.service.StateRestoreFileDeleter.DeletionPolicy;
import com.spotify.music.R;
import java.util.Iterator;

/* renamed from: hfi reason: default package */
public final class hfi {
    public final Context a;
    public final FireAndForgetResolver b;
    public final jjd c;
    public hmx d = new hgn();
    public hmu e = new hgl();
    public jth f;
    private final hga g;
    private final a h;
    private final StateRestoreFileDeleter i;
    private final hmy j;

    hfi(Context context, hga hga, StateRestoreFileDeleter stateRestoreFileDeleter, a aVar, FireAndForgetResolver fireAndForgetResolver, hmy hmy, jjd jjd) {
        this.a = context;
        this.g = hga;
        this.i = stateRestoreFileDeleter;
        this.h = aVar;
        this.b = fireAndForgetResolver;
        this.j = hmy;
        this.c = jjd;
    }

    public final void a(QueuingRemoteNativeRouter queuingRemoteNativeRouter, OrbitServiceInterface orbitServiceInterface) {
        this.e = this.h.a(orbitServiceInterface.getImageLoader());
        this.f = new jth(this.a);
        this.f.a(new hhf(orbitServiceInterface));
        this.f.b();
        queuingRemoteNativeRouter.onNativeRouterInitialized();
        this.b.reset();
        this.g.b.cancel(R.id.notification_no_storage_device);
        this.d = this.j.a(orbitServiceInterface.getOrbitSession());
        this.i.c.a().a(StateRestoreFileDeleter.b, DeletionPolicy.BASIC.ordinal()).a(StateRestoreFileDeleter.a, 0).b();
        jjd jjd = this.c;
        jjd.b = this.d;
        Iterator it = jjd.a.iterator();
        while (it.hasNext()) {
            haw haw = (haw) it.next();
            it.remove();
            jjd.b.a(haw.a());
        }
    }
}
