package com.spotify.music.eventsender;

import java.nio.charset.Charset;

public class CoreEventsTransmitter {
    private final gfj mEventPublisher;

    public CoreEventsTransmitter(gfj gfj) {
        this.mEventPublisher = gfj;
    }

    public native void registerSdk();

    public void send(byte[] bArr, byte[] bArr2) {
        this.mEventPublisher.a(new String(bArr, Charset.forName("UTF-8")), bArr2);
    }
}
