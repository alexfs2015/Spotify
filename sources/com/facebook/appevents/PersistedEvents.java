package com.facebook.appevents;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

public class PersistedEvents implements Serializable {
    private static final long serialVersionUID = 20160629001L;
    public HashMap<AccessTokenAppIdPair, List<AppEvent>> events = new HashMap<>();

    static class SerializationProxyV1 implements Serializable {
        private static final long serialVersionUID = 20160629001L;
        private final HashMap<AccessTokenAppIdPair, List<AppEvent>> proxyEvents;

        /* synthetic */ SerializationProxyV1(HashMap hashMap, byte b) {
            this(hashMap);
        }

        private SerializationProxyV1(HashMap<AccessTokenAppIdPair, List<AppEvent>> hashMap) {
            this.proxyEvents = hashMap;
        }

        private Object readResolve() {
            return new PersistedEvents(this.proxyEvents);
        }
    }

    public PersistedEvents() {
    }

    public PersistedEvents(HashMap<AccessTokenAppIdPair, List<AppEvent>> hashMap) {
        this.events.putAll(hashMap);
    }

    public final List<AppEvent> a(AccessTokenAppIdPair accessTokenAppIdPair) {
        return (List) this.events.get(accessTokenAppIdPair);
    }

    public final void a(AccessTokenAppIdPair accessTokenAppIdPair, List<AppEvent> list) {
        if (!this.events.containsKey(accessTokenAppIdPair)) {
            this.events.put(accessTokenAppIdPair, list);
        } else {
            ((List) this.events.get(accessTokenAppIdPair)).addAll(list);
        }
    }

    private Object writeReplace() {
        return new SerializationProxyV1(this.events, 0);
    }
}
