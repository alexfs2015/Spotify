package defpackage;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.eventsender.CoreEventsTransmitter;

/* renamed from: lki reason: default package */
public final class lki implements a {
    private final gec a;
    private final CoreEventsTransmitter b;

    public final String c() {
        return "EventSender";
    }

    public lki(gec gec, CoreEventsTransmitter coreEventsTransmitter) {
        this.a = gec;
        this.b = coreEventsTransmitter;
    }

    public final void a() {
        this.a.a();
        try {
            this.b.registerSdk();
        } catch (UnsatisfiedLinkError e) {
            Assertion.b("Failed to register CoreEventsTransmitter", (Throwable) e);
        }
    }

    public final void b() {
        this.a.b();
    }
}
