package com.spotify.music.features.connect.cast.discovery;

public final class DiscoveryEvent {
    public final EventType a;
    public final DiscoveredDevice b;

    public enum EventType {
        DISCOVER,
        LOST
    }

    public DiscoveryEvent(EventType eventType, DiscoveredDevice discoveredDevice) {
        this.a = eventType;
        this.b = discoveredDevice;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoveryEvent)) {
            return false;
        }
        DiscoveryEvent discoveryEvent = (DiscoveryEvent) obj;
        return this.a == discoveryEvent.a && this.b.equals(discoveryEvent.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
