package io.netty.handler.ssl;

import java.util.Collections;
import java.util.List;

public final class ApplicationProtocolConfig {
    public final List<String> a = Collections.emptyList();
    public final Protocol b = Protocol.NONE;
    public final SelectorFailureBehavior c = SelectorFailureBehavior.CHOOSE_MY_LAST_PROTOCOL;
    public final SelectedListenerFailureBehavior d = SelectedListenerFailureBehavior.ACCEPT;

    public enum Protocol {
        NONE,
        NPN,
        ALPN,
        NPN_AND_ALPN
    }

    public enum SelectedListenerFailureBehavior {
        ACCEPT,
        FATAL_ALERT,
        CHOOSE_MY_LAST_PROTOCOL
    }

    public enum SelectorFailureBehavior {
        FATAL_ALERT,
        NO_ADVERTISE,
        CHOOSE_MY_LAST_PROTOCOL
    }

    static {
        new ApplicationProtocolConfig();
    }

    private ApplicationProtocolConfig() {
    }
}
