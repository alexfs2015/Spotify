package com.spotify.music.eventsender;

import java.nio.charset.Charset;

public class CoreEventsTransmitter {
    private final gdy mEventPublisher;

    public native void registerSdk();

    public CoreEventsTransmitter(gdy gdy) {
        this.mEventPublisher = gdy;
    }

    public void send(byte[] bArr, byte[] bArr2) {
        this.mEventPublisher.a(new String(bArr, Charset.forName("UTF-8")), bArr2);
    }
}
