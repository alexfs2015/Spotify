package defpackage;

import com.spotify.music.eventsender.CoreEventsTransmitter;

/* renamed from: loa reason: default package */
public final class loa implements wig<CoreEventsTransmitter> {
    private final wzi<gfj> a;

    private loa(wzi<gfj> wzi) {
        this.a = wzi;
    }

    public static loa a(wzi<gfj> wzi) {
        return new loa(wzi);
    }

    public final /* synthetic */ Object get() {
        return new CoreEventsTransmitter((gfj) this.a.get());
    }
}
