package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.Flowable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: iez reason: default package */
public interface iez {

    /* renamed from: iez$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Ad a(Ad ad, PlayerState playerState) {
            return ad;
        }

        public static Flowable<Boolean> a(Flowable<Ad> flowable) {
            return flowable.c((Function<? super T, ? extends R>) $$Lambda$5g2LcLEnNqpEDUwJ4NrKPF9Ang.INSTANCE);
        }

        public static Flowable<Long> a(Flowable<Ad> flowable, Flowable<PlayerState> flowable2, Flowable<Long> flowable3) {
            return Flowable.a((wrf<? extends T1>) flowable.a((Predicate<? super T>) $$Lambda$sVGzRPruqHktC587ohyBQjM1_Ds.INSTANCE), (wrf<? extends T2>) flowable2, (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$iez$FZmftR8BmyJOv10Nd4teYkc0KkE.INSTANCE).e(new $$Lambda$iez$H10wP2zCYt5qUVcGB3MDMa5EgA(flowable3)).a(Functions.a());
        }

        public static Flowable<PlayerState> b(Flowable<PlayerState> flowable) {
            return flowable.a((Predicate<? super T>) $$Lambda$iez$2hh1pv2nN057m06pdGuFyk_OB6M.INSTANCE);
        }

        public static /* synthetic */ boolean a(PlayerState playerState) {
            return (playerState.duration() == -1 || playerState.positionAsOfTimestamp() == -1) ? false : true;
        }
    }
}
