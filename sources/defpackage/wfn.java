package defpackage;

import io.netty.handler.ssl.ApplicationProtocolConfig;
import io.netty.handler.ssl.ApplicationProtocolConfig.Protocol;
import io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior;
import io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior;
import java.util.List;

/* renamed from: wfn reason: default package */
public final class wfn implements wfk {
    private final ApplicationProtocolConfig a;

    public wfn(ApplicationProtocolConfig applicationProtocolConfig) {
        this.a = (ApplicationProtocolConfig) wjk.a(applicationProtocolConfig, "config");
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
