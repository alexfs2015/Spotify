package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.filterandsort.MusicPagesFiltering;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: -$$Lambda$rfb$IFnxIuhGF1v0V5J_lSVLfB1xftE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rfb$IFnxIuhGF1v0V5J_lSVLfB1xftE implements ObservableTransformer {
    private final /* synthetic */ Scheduler f$0;
    private final /* synthetic */ MusicPagesFiltering f$1;

    public /* synthetic */ $$Lambda$rfb$IFnxIuhGF1v0V5J_lSVLfB1xftE(Scheduler scheduler, MusicPagesFiltering musicPagesFiltering) {
        this.f$0 = scheduler;
        this.f$1 = musicPagesFiltering;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a(this.f$0).h(new $$Lambda$rfb$T7ou8dHUwnsdcq1O9tRUGCw93g8(this.f$1)).a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$j9uANo2AR6ck_BnwJL25gNmPwNU.INSTANCE).a(this.f$0);
    }
}
