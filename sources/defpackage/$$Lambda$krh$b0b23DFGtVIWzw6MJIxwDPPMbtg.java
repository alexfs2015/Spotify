package defpackage;

import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$krh$b0b23DFGtVIWzw6MJIxwDPPMbtg reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$krh$b0b23DFGtVIWzw6MJIxwDPPMbtg implements ObservableTransformer {
    private final /* synthetic */ SlotApi f$0;

    public /* synthetic */ $$Lambda$krh$b0b23DFGtVIWzw6MJIxwDPPMbtg(SlotApi slotApi) {
        this.f$0 = slotApi;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$krh$f2OJ5g8Hmoi9tqoqwYtGZH8YJ2U(this.f$0));
    }
}
