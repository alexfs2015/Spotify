package defpackage;

import com.spotify.music.follow.FollowManager;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

/* renamed from: -$$Lambda$psh$wArSC8ee4rYtDaFz_iR3PFWTeA4 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$psh$wArSC8ee4rYtDaFz_iR3PFWTeA4 implements ObservableTransformer {
    private final /* synthetic */ pqz f$0;
    private final /* synthetic */ Scheduler f$1;
    private final /* synthetic */ FollowManager f$2;

    public /* synthetic */ $$Lambda$psh$wArSC8ee4rYtDaFz_iR3PFWTeA4(pqz pqz, Scheduler scheduler, FollowManager followManager) {
        this.f$0 = pqz;
        this.f$1 = scheduler;
        this.f$2 = followManager;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$psh$IpChA3QStxf5sehQPSWcpchLgyw(this.f$0, this.f$1, this.f$2));
    }
}
