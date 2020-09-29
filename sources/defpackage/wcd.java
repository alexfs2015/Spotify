package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.player.model.PlayerState;
import com.spotify.voice.api.qualifiers.VoiceConsumer;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Single;

/* renamed from: wcd reason: default package */
public interface wcd {

    /* renamed from: wcd$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static gcr<Void, Boolean> a(Context context) {
            return new $$Lambda$wcd$yJkr6_70leYDhVcgRouYW3a1qA(context);
        }

        public static /* synthetic */ Boolean a(Context context, Void voidR) {
            return Boolean.valueOf(fr.b(context, "android.permission.RECORD_AUDIO") == 0);
        }

        public static wca a(wep wep, wcu wcu, wem wem, wdx wdx, rwl rwl, Flowable<PlayerState> flowable, wci wci, Cosmonaut cosmonaut, RxRouter rxRouter, Observable<lbg> observable, jvq jvq, gcr<Void, Boolean> gcr) {
            return new a(0).a(wep, wcu, wem, wdx, rwl, flowable, wci, cosmonaut, rxRouter, observable, jvq, gcr).a();
        }

        public static wep a(wen wen, VoiceConsumer voiceConsumer, Optional<String> optional, Single<Boolean> single, Optional<String> optional2) {
            wek wek = new wek(wen, voiceConsumer, optional, single, optional2);
            return wek;
        }
    }
}
