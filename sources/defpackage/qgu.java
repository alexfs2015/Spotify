package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.Map;

/* renamed from: qgu reason: default package */
public interface qgu {

    /* renamed from: qgu$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Observable<String> a(Flowable<PlayerState> flowable, Scheduler scheduler) {
            return flowable.j().a((Predicate<? super T>) $$Lambda$qgu$09FyD_JNYyJeyCn6g7NQD4uPecQ.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$imo7xjtElMqTbX15bD31FP3GzoM.INSTANCE).a((Predicate<? super T>) $$Lambda$qgu$kMx61gU0EtqeHJ2WOK725kxKnk.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$qgu$MyIzbzezQQh6jhtgXfBthltkg.INSTANCE).a(scheduler);
        }

        public static /* synthetic */ boolean a(PlayerState playerState) {
            return !playerState.contextMetadata().isEmpty();
        }

        public static /* synthetic */ String a(Map map) {
            return (String) map.get("nl.request_id");
        }
    }
}
