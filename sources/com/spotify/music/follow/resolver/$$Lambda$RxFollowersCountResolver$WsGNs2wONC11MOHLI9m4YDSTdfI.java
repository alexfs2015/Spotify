package com.spotify.music.follow.resolver;

import android.net.Uri;
import com.google.common.base.Function;

/* renamed from: com.spotify.music.follow.resolver.-$$Lambda$RxFollowersCountResolver$WsGNs2wONC11MOHLI9m4YDSTdfI reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RxFollowersCountResolver$WsGNs2wONC11MOHLI9m4YDSTdfI implements Function {
    public static final /* synthetic */ $$Lambda$RxFollowersCountResolver$WsGNs2wONC11MOHLI9m4YDSTdfI INSTANCE = new $$Lambda$RxFollowersCountResolver$WsGNs2wONC11MOHLI9m4YDSTdfI();

    private /* synthetic */ $$Lambda$RxFollowersCountResolver$WsGNs2wONC11MOHLI9m4YDSTdfI() {
    }

    public final Object apply(Object obj) {
        return String.format("\"%s\"", new Object[]{Uri.decode((String) fay.a((String) obj))});
    }
}
