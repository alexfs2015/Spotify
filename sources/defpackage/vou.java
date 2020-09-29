package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.voice.qualifiers.VoiceConsumer;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.concurrent.Callable;

/* renamed from: vou reason: default package */
public interface vou {

    /* renamed from: vou$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Callable<Boolean> a(Context context) {
            return new $$Lambda$vou$gQD6jb_uERLKq6EtnOx7uryEiUo(context);
        }

        public static /* synthetic */ Boolean b(Context context) {
            return Boolean.valueOf(fr.b(context, "android.permission.RECORD_AUDIO") == 0);
        }

        public static vos a(vrh vrh, vpt vpt, vre vre, vqp vqp, rnf rnf, Flowable<PlayerState> flowable, vph vph, Cosmonaut cosmonaut, RxRouter rxRouter, Observable<kxx> observable, jti jti, Callable<Boolean> callable) {
            return new a(0).a(vrh, vpt, vre, vqp, rnf, flowable, vph, cosmonaut, rxRouter, observable, jti, callable).a();
        }

        public static vrh a(vrf vrf, VoiceConsumer voiceConsumer, Optional<String> optional, Single<Boolean> single, Optional<String> optional2) {
            vrc vrc = new vrc(vrf, voiceConsumer, optional, single, optional2);
            return vrc;
        }
    }
}
