package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import java.util.concurrent.Callable;

/* renamed from: voz reason: default package */
interface voz {

    /* renamed from: voz$a */
    public interface a {
        voz a(vrh vrh, vpt vpt, vre vre, vqp vqp, rnf rnf, Flowable<PlayerState> flowable, vph vph, Cosmonaut cosmonaut, RxRouter rxRouter, Observable<kxx> observable, jti jti, Callable<Boolean> callable);
    }

    vot a();
}
