package defpackage;

import android.content.Context;
import com.spotify.core.orbit.OrbitServiceInterface;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.mobile.android.cosmos.router.QueuingRemoteNativeRouter;
import com.spotify.mobile.android.service.StateRestoreFileDeleter;
import com.spotify.mobile.android.service.StateRestoreFileDeleter.DeletionPolicy;
import com.spotify.music.R;
import java.util.Iterator;

/* renamed from: hie reason: default package */
public final class hie {
    public final Context a;
    public final FireAndForgetResolver b;
    public final jlp c;
    public hpo d = new hjj();
    public hpl e = new hjh();
    public jvn f;
    private final hiw g;
    private final a h;
    private final StateRestoreFileDeleter i;
    private final hpp j;

    hie(Context context, hiw hiw, StateRestoreFileDeleter stateRestoreFileDeleter, a aVar, FireAndForgetResolver fireAndForgetResolver, hpp hpp, jlp jlp) {
        this.a = context;
        this.g = hiw;
        this.i = stateRestoreFileDeleter;
        this.h = aVar;
        this.b = fireAndForgetResolver;
        this.j = hpp;
        this.c = jlp;
    }

    public final void a(QueuingRemoteNativeRouter queuingRemoteNativeRouter, OrbitServiceInterface orbitServiceInterface) {
        this.e = this.h.a(orbitServiceInterface.getImageLoader());
        this.f = jvn.a(this.a);
        this.f.a((jvs) new hjz(orbitServiceInterface));
        this.f.c();
        queuingRemoteNativeRouter.onNativeRouterInitialized();
        this.b.reset();
        this.g.b.cancel(R.id.notification_no_storage_device);
        this.d = this.j.a(orbitServiceInterface.getOrbitSession());
        this.i.c.a().a(StateRestoreFileDeleter.b, DeletionPolicy.BASIC.ordinal()).a(StateRestoreFileDeleter.a, 0).b();
        jlp jlp = this.c;
        jlp.b = this.d;
        Iterator it = jlp.a.iterator();
        while (it.hasNext()) {
            hdp hdp = (hdp) it.next();
            it.remove();
            jlp.b.a(hdp.a());
        }
    }
}
