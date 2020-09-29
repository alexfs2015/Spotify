package com.spotify.mobile.android.cosmos.player.v2.rx.transformers;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.functions.Function;

/* renamed from: com.spotify.mobile.android.cosmos.player.v2.rx.transformers.-$$Lambda$JSb0l8EbCs4tWmYc8vpglb3xNDg reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$JSb0l8EbCs4tWmYc8vpglb3xNDg implements Function {
    public static final /* synthetic */ $$Lambda$JSb0l8EbCs4tWmYc8vpglb3xNDg INSTANCE = new $$Lambda$JSb0l8EbCs4tWmYc8vpglb3xNDg();

    private /* synthetic */ $$Lambda$JSb0l8EbCs4tWmYc8vpglb3xNDg() {
    }

    public final Object apply(Object obj) {
        return ((PlayerTrack) obj).uri();
    }
}
