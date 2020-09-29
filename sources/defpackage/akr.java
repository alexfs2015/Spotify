package defpackage;

import android.content.Context;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.PersistedEvents;
import java.util.HashMap;
import java.util.Set;

/* renamed from: akr reason: default package */
final class akr {
    private final HashMap<AccessTokenAppIdPair, akx> a = new HashMap<>();

    public final synchronized void a(PersistedEvents persistedEvents) {
        if (persistedEvents != null) {
            for (AccessTokenAppIdPair accessTokenAppIdPair : persistedEvents.events.keySet()) {
                akx b = b(accessTokenAppIdPair);
                for (AppEvent a2 : persistedEvents.a(accessTokenAppIdPair)) {
                    b.a(a2);
                }
            }
        }
    }

    public final synchronized void a(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        b(accessTokenAppIdPair).a(appEvent);
    }

    public final synchronized Set<AccessTokenAppIdPair> a() {
        return this.a.keySet();
    }

    public final synchronized akx a(AccessTokenAppIdPair accessTokenAppIdPair) {
        return (akx) this.a.get(accessTokenAppIdPair);
    }

    public final synchronized int b() {
        int i;
        i = 0;
        for (akx a2 : this.a.values()) {
            i += a2.a();
        }
        return i;
    }

    private synchronized akx b(AccessTokenAppIdPair accessTokenAppIdPair) {
        akx akx;
        akx = (akx) this.a.get(accessTokenAppIdPair);
        if (akx == null) {
            Context g = akc.g();
            akx = new akx(alu.a(g), AppEventsLogger.b(g));
        }
        this.a.put(accessTokenAppIdPair, akx);
        return akx;
    }
}
