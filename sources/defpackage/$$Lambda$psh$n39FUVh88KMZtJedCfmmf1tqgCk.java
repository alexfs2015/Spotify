package defpackage;

import com.spotify.music.libs.web.RxWebToken;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

/* renamed from: -$$Lambda$psh$n39FUVh88KMZtJedCfmmf1tqgCk reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$psh$n39FUVh88KMZtJedCfmmf1tqgCk implements ObservableTransformer {
    private final /* synthetic */ RxWebToken f$0;
    private final /* synthetic */ Scheduler f$1;

    public /* synthetic */ $$Lambda$psh$n39FUVh88KMZtJedCfmmf1tqgCk(RxWebToken rxWebToken, Scheduler scheduler) {
        this.f$0 = rxWebToken;
        this.f$1 = scheduler;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$psh$2rh6mVNhp5qOZC_bsY4uE8JRg0(this.f$0, this.f$1));
    }
}
