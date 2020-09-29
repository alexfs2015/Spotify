package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.Map;

/* renamed from: qpi reason: default package */
public interface qpi {

    /* renamed from: qpi$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Observable<String> a(Flowable<PlayerState> flowable, Scheduler scheduler) {
            return flowable.j().a((Predicate<? super T>) $$Lambda$qpi$eVzMDsbyqE8C7zEpPJBK3d2qRgM.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$imo7xjtElMqTbX15bD31FP3GzoM.INSTANCE).a((Predicate<? super T>) $$Lambda$qpi$ZzByKIbR9o1odv8Y1cMkhXsJ0.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$qpi$slKrsXD2SuAKHVhXj9xBXBr24Jw.INSTANCE).a(scheduler);
        }

        public static /* synthetic */ String a(Map map) {
            return (String) map.get("nl.request_id");
        }

        public static /* synthetic */ boolean a(PlayerState playerState) {
            return !playerState.contextMetadata().isEmpty();
        }
    }
}
