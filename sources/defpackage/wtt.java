package defpackage;

import io.netty.handler.ssl.ApplicationProtocolConfig;
import io.netty.handler.ssl.ApplicationProtocolConfig.Protocol;
import io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior;
import io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior;
import java.util.List;

/* renamed from: wtt reason: default package */
public final class wtt implements wtq {
    private final ApplicationProtocolConfig a;

    public wtt(ApplicationProtocolConfig applicationProtocolConfig) {
        this.a = (ApplicationProtocolConfig) wxq.a(applicationProtocolConfig, "config");
    }

    public final List<String> a() {
        return this.a.a;
    }

    public final Protocol b() {
        return this.a.b;
    }

    public final SelectorFailureBehavior c() {
        return this.a.c;
    }

    public final SelectedListenerFailureBehavior d() {
        return this.a.d;
    }
}
