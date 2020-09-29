package com.spotify.music.features.connect.cast.discovery;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DiscoveryConfiguration {
    private static final mer d = new mer("CC32E753", "Spotify Production");
    private static final ImmutableList<mer> e = new a().c(new mer("6B7652A6", "Spotify Employee Dogfooding")).c(new mer("DF630089", "Spotify Google Dogfooding")).a();
    @JsonProperty("discoverySupport")
    public final ConcurrentMap<DiscoveryTechnology, FeatureFlagOverrideValue> a;
    @JsonProperty("ids")
    public final ConcurrentMap<DiscoveryTechnology, mer> b;
    @JsonIgnore
    public final boolean c;

    /* renamed from: com.spotify.music.features.connect.cast.discovery.DiscoveryConfiguration$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[DiscoveryTechnology.values().length];

        static {
            try {
                a[DiscoveryTechnology.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public enum FeatureFlagOverrideValue {
        a(r2),
        b(r3),
        c(r4);
        
        private final String mValue;

        private FeatureFlagOverrideValue(String str) {
            this.mValue = str;
        }
    }

    @JsonCreator
    public DiscoveryConfiguration(@JsonProperty("discoverySupport") ConcurrentMap<DiscoveryTechnology, FeatureFlagOverrideValue> concurrentMap, @JsonProperty("ids") ConcurrentMap<DiscoveryTechnology, mer> concurrentMap2) {
        this.c = concurrentMap2 == null || concurrentMap == null;
        if (concurrentMap2 == null) {
            concurrentMap2 = new ConcurrentHashMap<>(0);
        }
        this.b = concurrentMap2;
        if (concurrentMap == null) {
            concurrentMap = new ConcurrentHashMap<>(0);
        }
        this.a = concurrentMap;
    }

    public DiscoveryConfiguration() {
        this.a = new ConcurrentHashMap(10);
        this.b = new ConcurrentHashMap(10);
        this.c = false;
    }

    public static mer a(DiscoveryTechnology discoveryTechnology) {
        if (AnonymousClass1.a[discoveryTechnology.ordinal()] != 1) {
            return new mer();
        }
        return d;
    }

    public static ImmutableList<mer> b(DiscoveryTechnology discoveryTechnology) {
        if (AnonymousClass1.a[discoveryTechnology.ordinal()] != 1) {
            return new a().a();
        }
        return e;
    }

    @JsonIgnore
    public final mer c(DiscoveryTechnology discoveryTechnology) {
        return (mer) this.b.get(discoveryTechnology);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoveryConfiguration)) {
            return false;
        }
        DiscoveryConfiguration discoveryConfiguration = (DiscoveryConfiguration) obj;
        return this.a.equals(discoveryConfiguration.a) && this.b.equals(discoveryConfiguration.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
