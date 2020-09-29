package com.spotify.music.features.payfail;

import com.spotify.mobile.android.cosmos.RequestBuilder;
import java.util.concurrent.Callable;

/* renamed from: com.spotify.music.features.payfail.-$$Lambda$PaymentFailureRepository$Nw9QypdX4IK1ZBrkFD04qaAEKos reason: invalid class name */
public final /* synthetic */ class $$Lambda$PaymentFailureRepository$Nw9QypdX4IK1ZBrkFD04qaAEKos implements Callable {
    public static final /* synthetic */ $$Lambda$PaymentFailureRepository$Nw9QypdX4IK1ZBrkFD04qaAEKos INSTANCE = new $$Lambda$PaymentFailureRepository$Nw9QypdX4IK1ZBrkFD04qaAEKos();

    private /* synthetic */ $$Lambda$PaymentFailureRepository$Nw9QypdX4IK1ZBrkFD04qaAEKos() {
    }

    public final Object call() {
        return RequestBuilder.get("sp://offline/v1/resources").build();
    }
}
