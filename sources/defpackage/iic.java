package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.Targetings;
import io.reactivex.observers.DisposableObserver;

/* renamed from: iic reason: default package */
public final class iic extends DisposableObserver<Targetings> {
    public final void onComplete() {
        Logger.b("Ad Targeting - request for updating targeting information completed", new Object[0]);
    }

    public final void onError(Throwable th) {
        Logger.b("Ad Targeting - Error in making request to targeting endpoint: %s", th.getMessage());
    }

    public final /* synthetic */ void onNext(Object obj) {
        Logger.b("Ad Targeting - Targeting information posted successfully", new Object[0]);
    }
}
