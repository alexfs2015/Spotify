package defpackage;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.eventsender.CoreEventsTransmitter;

/* renamed from: loi reason: default package */
public final class loi implements a {
    private final gfn a;
    private final CoreEventsTransmitter b;

    public loi(gfn gfn, CoreEventsTransmitter coreEventsTransmitter) {
        this.a = gfn;
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

    public final String c() {
        return "EventSender";
    }
}
