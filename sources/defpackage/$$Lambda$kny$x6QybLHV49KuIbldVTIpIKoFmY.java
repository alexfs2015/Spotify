package defpackage;

import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$kny$x6Q-ybLHV49KuIbldVTIpIKoFmY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kny$x6QybLHV49KuIbldVTIpIKoFmY implements ObservableTransformer {
    private final /* synthetic */ SlotApi f$0;

    public /* synthetic */ $$Lambda$kny$x6QybLHV49KuIbldVTIpIKoFmY(SlotApi slotApi) {
        this.f$0 = slotApi;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$kny$K3qSCgFjI8NsVVHggeSvpSXrXMI(this.f$0));
    }
}
