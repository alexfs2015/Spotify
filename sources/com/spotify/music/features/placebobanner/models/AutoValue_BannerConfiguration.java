package com.spotify.music.features.placebobanner.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

final class AutoValue_BannerConfiguration extends BannerConfiguration {
    private final int backgroundColor;
    private final String configurationId;
    private final long expiresAfterSec;
    private final List<PlaceboBannerView> placeboBannerViews;
    private final long receivedOn;
    private final int showDelaySeconds;
    private final List<String> targetUris;
    private final long timeWindowSeconds;

    static final class a implements com.spotify.music.features.placebobanner.models.BannerConfiguration.a {
        private String a;
        private Integer b;
        private Long c;
        private Long d;
        private List<PlaceboBannerView> e;
        private Integer f;
        private List<String> g;
        private Long h;

        /* synthetic */ a(BannerConfiguration bannerConfiguration, byte b2) {
            this(bannerConfiguration);
        }

        a() {
        }

        private a(BannerConfiguration bannerConfiguration) {
            this.a = bannerConfiguration.configurationId();
            this.b = Integer.valueOf(bannerConfiguration.backgroundColor());
            this.c = Long.valueOf(bannerConfiguration.receivedOn());
            this.d = Long.valueOf(bannerConfiguration.expiresAfterSec());
            this.e = bannerConfiguration.placeboBannerViews();
            this.f = Integer.valueOf(bannerConfiguration.showDelaySeconds());
            this.g = bannerConfiguration.targetUris();
            this.h = Long.valueOf(bannerConfiguration.timeWindowSeconds());
        }

        public final com.spotify.music.features.placebobanner.models.BannerConfiguration.a a(String str) {
            this.a = str;
            return this;
        }

        public final com.spotify.music.features.placebobanner.models.BannerConfiguration.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final com.spotify.music.features.placebobanner.models.BannerConfiguration.a a(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        public final com.spotify.music.features.placebobanner.models.BannerConfiguration.a b(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        public final com.spotify.music.features.placebobanner.models.BannerConfiguration.a a(List<PlaceboBannerView> list) {
            this.e = list;
            return this;
        }

        public final com.spotify.music.features.placebobanner.models.BannerConfiguration.a b(int i) {
            this.f = Integer.valueOf(i);
            return this;
        }

        public final com.spotify.music.features.placebobanner.models.BannerConfiguration.a b(List<String> list) {
            this.g = list;
            return this;
        }

        public final com.spotify.music.features.placebobanner.models.BannerConfiguration.a c(long j) {
            this.h = Long.valueOf(j);
            return this;
        }

        public final BannerConfiguration a() {
            String str = "";
            if (this.b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" backgroundColor");
                str = sb.toString();
            }
            if (this.c == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" receivedOn");
                str = sb2.toString();
            }
            if (this.d == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" expiresAfterSec");
                str = sb3.toString();
            }
            if (this.f == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" showDelaySeconds");
                str = sb4.toString();
            }
            if (this.h == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" timeWindowSeconds");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                AutoValue_BannerConfiguration autoValue_BannerConfiguration = new AutoValue_BannerConfiguration(this.a, this.b.intValue(), this.c.longValue(), this.d.longValue(), this.e, this.f.intValue(), this.g, this.h.longValue());
                return autoValue_BannerConfiguration;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }

    private AutoValue_BannerConfiguration(String str, int i, long j, long j2, List<PlaceboBannerView> list, int i2, List<String> list2, long j3) {
        this.configurationId = str;
        this.backgroundColor = i;
        this.receivedOn = j;
        this.expiresAfterSec = j2;
        this.placeboBannerViews = list;
        this.showDelaySeconds = i2;
        this.targetUris = list2;
        this.timeWindowSeconds = j3;
    }

    @JsonProperty("configurationId")
    public final String configurationId() {
        return this.configurationId;
    }

    @JsonProperty("backgroundColor")
    public final int backgroundColor() {
        return this.backgroundColor;
    }

    @JsonProperty("receivedOn")
    public final long receivedOn() {
        return this.receivedOn;
    }

    @JsonProperty("expiresAfterSec")
    public final long expiresAfterSec() {
        return this.expiresAfterSec;
    }

    @JsonProperty("views")
    public final List<PlaceboBannerView> placeboBannerViews() {
        return this.placeboBannerViews;
    }

    @JsonProperty("showDelaySeconds")
    public final int showDelaySeconds() {
        return this.showDelaySeconds;
    }

    @JsonProperty("targetUris")
    public final List<String> targetUris() {
        return this.targetUris;
    }

    @JsonProperty("timeWindowSeconds")
    public final long timeWindowSeconds() {
        return this.timeWindowSeconds;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BannerConfiguration{configurationId=");
        sb.append(this.configurationId);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", receivedOn=");
        sb.append(this.receivedOn);
        sb.append(", expiresAfterSec=");
        sb.append(this.expiresAfterSec);
        sb.append(", placeboBannerViews=");
        sb.append(this.placeboBannerViews);
        sb.append(", showDelaySeconds=");
        sb.append(this.showDelaySeconds);
        sb.append(", targetUris=");
        sb.append(this.targetUris);
        sb.append(", timeWindowSeconds=");
        sb.append(this.timeWindowSeconds);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BannerConfiguration) {
            BannerConfiguration bannerConfiguration = (BannerConfiguration) obj;
            String str = this.configurationId;
            if (str != null ? str.equals(bannerConfiguration.configurationId()) : bannerConfiguration.configurationId() == null) {
                if (this.backgroundColor == bannerConfiguration.backgroundColor() && this.receivedOn == bannerConfiguration.receivedOn() && this.expiresAfterSec == bannerConfiguration.expiresAfterSec()) {
                    List<PlaceboBannerView> list = this.placeboBannerViews;
                    if (list != null ? list.equals(bannerConfiguration.placeboBannerViews()) : bannerConfiguration.placeboBannerViews() == null) {
                        if (this.showDelaySeconds == bannerConfiguration.showDelaySeconds()) {
                            List<String> list2 = this.targetUris;
                            if (list2 != null ? list2.equals(bannerConfiguration.targetUris()) : bannerConfiguration.targetUris() == null) {
                                if (this.timeWindowSeconds == bannerConfiguration.timeWindowSeconds()) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.configurationId;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.backgroundColor) * 1000003;
        long j = this.receivedOn;
        int i2 = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.expiresAfterSec;
        int i3 = (i2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        List<PlaceboBannerView> list = this.placeboBannerViews;
        int hashCode2 = (((i3 ^ (list == null ? 0 : list.hashCode())) * 1000003) ^ this.showDelaySeconds) * 1000003;
        List<String> list2 = this.targetUris;
        if (list2 != null) {
            i = list2.hashCode();
        }
        int i4 = (hashCode2 ^ i) * 1000003;
        long j3 = this.timeWindowSeconds;
        return i4 ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final com.spotify.music.features.placebobanner.models.BannerConfiguration.a toBuilder() {
        return new a(this, 0);
    }
}
