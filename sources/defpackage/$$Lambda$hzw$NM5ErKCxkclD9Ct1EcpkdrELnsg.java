package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hzw$NM5ErKCxkclD9Ct1EcpkdrELnsg reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hzw$NM5ErKCxkclD9Ct1EcpkdrELnsg implements Consumer {
    public static final /* synthetic */ $$Lambda$hzw$NM5ErKCxkclD9Ct1EcpkdrELnsg INSTANCE = new $$Lambda$hzw$NM5ErKCxkclD9Ct1EcpkdrELnsg();

    private /* synthetic */ $$Lambda$hzw$NM5ErKCxkclD9Ct1EcpkdrELnsg() {
    }

    public final void accept(Object obj) {
        Logger.b("[Marquee] - enable marquee %s", ((Response) obj).getBodyString());
    }
}
