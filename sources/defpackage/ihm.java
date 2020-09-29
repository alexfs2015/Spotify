package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.Flowable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: ihm reason: default package */
public interface ihm {

    /* renamed from: ihm$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Ad a(Ad ad, PlayerState playerState) {
            return ad;
        }

        public static Flowable<Boolean> a(Flowable<Ad> flowable) {
            return flowable.c((Function<? super T, ? extends R>) $$Lambda$5g2LcLEnNqpEDUwJ4NrKPF9Ang.INSTANCE);
        }

        public static Flowable<Long> a(Flowable<Ad> flowable, Flowable<PlayerState> flowable2, Flowable<Long> flowable3) {
            return Flowable.a((xfk<? extends T1>) flowable.a((Predicate<? super T>) $$Lambda$sVGzRPruqHktC587ohyBQjM1_Ds.INSTANCE), (xfk<? extends T2>) flowable2, (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$ihm$zqpw1ZXaFJ_uL_lMqYL5xXNSVA.INSTANCE).e(new $$Lambda$ihm$gXmJ8ml75dg5g7DchBH77V1V0sE(flowable3)).a(Functions.a());
        }

        public static /* synthetic */ boolean a(PlayerState playerState) {
            return (playerState.duration() == -1 || playerState.positionAsOfTimestamp() == -1) ? false : true;
        }

        public static Flowable<PlayerState> b(Flowable<PlayerState> flowable) {
            return flowable.a((Predicate<? super T>) $$Lambda$ihm$TE2C6rXunWNKVcqIB7mtLw_ROhA.INSTANCE);
        }
    }
}
