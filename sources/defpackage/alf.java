package defpackage;

import android.content.Context;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.PersistedEvents;
import java.util.HashMap;
import java.util.Set;

/* renamed from: alf reason: default package */
final class alf {
    private final HashMap<AccessTokenAppIdPair, all> a = new HashMap<>();

    private synchronized all b(AccessTokenAppIdPair accessTokenAppIdPair) {
        all all;
        all = (all) this.a.get(accessTokenAppIdPair);
        if (all == null) {
            Context g = akq.g();
            all = new all(ami.a(g), AppEventsLogger.b(g));
        }
        this.a.put(accessTokenAppIdPair, all);
        return all;
    }

    public final synchronized all a(AccessTokenAppIdPair accessTokenAppIdPair) {
        return (all) this.a.get(accessTokenAppIdPair);
    }

    public final synchronized Set<AccessTokenAppIdPair> a() {
        return this.a.keySet();
    }

    public final synchronized void a(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        b(accessTokenAppIdPair).a(appEvent);
    }

    public final synchronized void a(PersistedEvents persistedEvents) {
        if (persistedEvents != null) {
            for (AccessTokenAppIdPair accessTokenAppIdPair : persistedEvents.events.keySet()) {
                all b = b(accessTokenAppIdPair);
                for (AppEvent a2 : persistedEvents.a(accessTokenAppIdPair)) {
                    b.a(a2);
                }
            }
        }
    }

    public final synchronized int b() {
        int i;
        i = 0;
        for (all a2 : this.a.values()) {
            i += a2.a();
        }
        return i;
    }
}
