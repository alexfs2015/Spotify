package defpackage;

import android.app.Activity;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent.Event;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ijj reason: default package */
public final class ijj extends jyr {
    WeakReference<Activity> a;
    public Disposable b;
    final Map<String, Ad> c = new HashMap();
    public final DisposableObserver<AdSlotEvent> d = new DisposableObserver<AdSlotEvent>() {
        public final void onComplete() {
        }

        public final void onError(Throwable th) {
        }

        public final /* synthetic */ void onNext(Object obj) {
            AdSlotEvent adSlotEvent = (AdSlotEvent) obj;
            ijj ijj = ijj.this;
            Event event = adSlotEvent.getEvent();
            if (event == Event.AVAILABLE) {
                Logger.b("Moat Tracker Initializer: Caching AdSlotEvent for Ad Uri: %s", adSlotEvent.getAd().uri());
                ijj.c.put(adSlotEvent.getAd().uri(), adSlotEvent.getAd());
                return;
            }
            if (event == Event.DISCARD) {
                Logger.b("Moat Tracker Initializer: Removing from cache AdSlotEvent for Ad Uri: %s", adSlotEvent.getAd().uri());
                ijj.c.remove(adSlotEvent.getAd().uri());
            }
        }
    };

    public final void onActivityResumed(Activity activity) {
        this.a = new WeakReference<>(activity);
    }
}
