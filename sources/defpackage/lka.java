package defpackage;

import com.spotify.music.eventsender.CoreEventsTransmitter;

/* renamed from: lka reason: default package */
public final class lka implements vua<CoreEventsTransmitter> {
    private final wlc<gdy> a;

    private lka(wlc<gdy> wlc) {
        this.a = wlc;
    }

    public static lka a(wlc<gdy> wlc) {
        return new lka(wlc);
    }

    public final /* synthetic */ Object get() {
        return new CoreEventsTransmitter((gdy) this.a.get());
    }
}
