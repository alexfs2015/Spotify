package com.spotify.mobile.android.util.loader;

final class AutoValue_SettingsState extends SettingsState {
    private final String accessPoint;
    private final boolean automix;
    private final boolean crossfade;
    private final int crossfadeTimeSeconds;
    private final boolean downloadOver3g;
    private final int downloadQuality;
    private final boolean facebookConnected;
    private final boolean gapless;
    private final boolean localDevicesOnly;
    private final int loudnessEnvironment;
    private final boolean normalize;
    private final boolean offlineMode;
    private final boolean playExplicitContent;
    private final boolean privateSession;
    private final int secondsToOfflineExpiry;
    private final boolean showUnavailableTracks;
    private final int streamQuality;
    private final String webgateUrl;

    static final class a extends com.spotify.mobile.android.util.loader.SettingsState.a {
        Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Integer e;
        private Integer f;
        private String g;
        private Boolean h;
        private Integer i;
        private Boolean j;
        private Boolean k;
        private Boolean l;
        private Integer m;
        private Boolean n;
        private Integer o;
        private Boolean p;
        private Boolean q;
        private String r;

        a() {
        }

        public final com.spotify.mobile.android.util.loader.SettingsState.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.mobile.android.util.loader.SettingsState.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.mobile.android.util.loader.SettingsState.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.mobile.android.util.loader.SettingsState.a a(int i2) {
            this.e = Integer.valueOf(i2);
            return this;
        }

        public final com.spotify.mobile.android.util.loader.SettingsState.a b(int i2) {
            this.f = Integer.valueOf(i2);
            return this;
        }

        public final com.spotify.mobile.android.util.loader.SettingsState.a a(String str) {
            if (str != null) {
                this.g = str;
                return this;
            }
            throw new NullPointerException("Null accessPoint");
        }

        public final com.spotify.mobile.android.util.loader.SettingsState.a d(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.mobile.android.util.loader.SettingsState.a c(int i2) {
            this.i = Integer.valueOf(i2);
            return this;
        }

        public final com.spotify.mobile.android.util.loader.SettingsState.a e(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.mobile.android.util.loader.SettingsState.a f(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.mobile.android.util.loader.SettingsState.a g(boolean z) {
            this.l = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.mobile.android.util.loader.SettingsState.a d(int i2) {
            this.m = Integer.valueOf(i2);
            return this;
        }

        public final com.spotify.mobile.android.util.loader.SettingsState.a h(boolean z) {
            this.n = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.mobile.android.util.loader.SettingsState.a e(int i2) {
            this.o = Integer.valueOf(i2);
            return this;
        }

        public final com.spotify.mobile.android.util.loader.SettingsState.a i(boolean z) {
            this.p = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.mobile.android.util.loader.SettingsState.a j(boolean z) {
            this.q = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.mobile.android.util.loader.SettingsState.a b(String str) {
            if (str != null) {
                this.r = str;
                return this;
            }
            throw new NullPointerException("Null webgateUrl");
        }

        public final SettingsState a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" offlineMode");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" playExplicitContent");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" privateSession");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" downloadOver3g");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" downloadQuality");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" streamQuality");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" accessPoint");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" facebookConnected");
                str = sb8.toString();
            }
            if (this.i == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" secondsToOfflineExpiry");
                str = sb9.toString();
            }
            if (this.j == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" gapless");
                str = sb10.toString();
            }
            if (this.k == null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(" automix");
                str = sb11.toString();
            }
            if (this.l == null) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(" normalize");
                str = sb12.toString();
            }
            if (this.m == null) {
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append(" loudnessEnvironment");
                str = sb13.toString();
            }
            if (this.n == null) {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str);
                sb14.append(" crossfade");
                str = sb14.toString();
            }
            if (this.o == null) {
                StringBuilder sb15 = new StringBuilder();
                sb15.append(str);
                sb15.append(" crossfadeTimeSeconds");
                str = sb15.toString();
            }
            if (this.p == null) {
                StringBuilder sb16 = new StringBuilder();
                sb16.append(str);
                sb16.append(" showUnavailableTracks");
                str = sb16.toString();
            }
            if (this.q == null) {
                StringBuilder sb17 = new StringBuilder();
                sb17.append(str);
                sb17.append(" localDevicesOnly");
                str = sb17.toString();
            }
            if (this.r == null) {
                StringBuilder sb18 = new StringBuilder();
                sb18.append(str);
                sb18.append(" webgateUrl");
                str = sb18.toString();
            }
            if (str.isEmpty()) {
                AutoValue_SettingsState autoValue_SettingsState = new AutoValue_SettingsState(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.intValue(), this.f.intValue(), this.g, this.h.booleanValue(), this.i.intValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), this.m.intValue(), this.n.booleanValue(), this.o.intValue(), this.p.booleanValue(), this.q.booleanValue(), this.r);
                return autoValue_SettingsState;
            }
            StringBuilder sb19 = new StringBuilder("Missing required properties:");
            sb19.append(str);
            throw new IllegalStateException(sb19.toString());
        }
    }

    private AutoValue_SettingsState(boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, String str, boolean z5, int i3, boolean z6, boolean z7, boolean z8, int i4, boolean z9, int i5, boolean z10, boolean z11, String str2) {
        this.offlineMode = z;
        this.playExplicitContent = z2;
        this.privateSession = z3;
        this.downloadOver3g = z4;
        this.downloadQuality = i;
        this.streamQuality = i2;
        this.accessPoint = str;
        this.facebookConnected = z5;
        this.secondsToOfflineExpiry = i3;
        this.gapless = z6;
        this.automix = z7;
        this.normalize = z8;
        this.loudnessEnvironment = i4;
        this.crossfade = z9;
        this.crossfadeTimeSeconds = i5;
        this.showUnavailableTracks = z10;
        this.localDevicesOnly = z11;
        this.webgateUrl = str2;
    }

    public final boolean offlineMode() {
        return this.offlineMode;
    }

    public final boolean playExplicitContent() {
        return this.playExplicitContent;
    }

    public final boolean privateSession() {
        return this.privateSession;
    }

    public final boolean downloadOver3g() {
        return this.downloadOver3g;
    }

    public final int downloadQuality() {
        return this.downloadQuality;
    }

    public final int streamQuality() {
        return this.streamQuality;
    }

    public final String accessPoint() {
        return this.accessPoint;
    }

    public final boolean facebookConnected() {
        return this.facebookConnected;
    }

    public final int secondsToOfflineExpiry() {
        return this.secondsToOfflineExpiry;
    }

    public final boolean gapless() {
        return this.gapless;
    }

    public final boolean automix() {
        return this.automix;
    }

    public final boolean normalize() {
        return this.normalize;
    }

    public final int loudnessEnvironment() {
        return this.loudnessEnvironment;
    }

    public final boolean crossfade() {
        return this.crossfade;
    }

    public final int crossfadeTimeSeconds() {
        return this.crossfadeTimeSeconds;
    }

    public final boolean showUnavailableTracks() {
        return this.showUnavailableTracks;
    }

    public final boolean localDevicesOnly() {
        return this.localDevicesOnly;
    }

    public final String webgateUrl() {
        return this.webgateUrl;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsState{offlineMode=");
        sb.append(this.offlineMode);
        sb.append(", playExplicitContent=");
        sb.append(this.playExplicitContent);
        sb.append(", privateSession=");
        sb.append(this.privateSession);
        sb.append(", downloadOver3g=");
        sb.append(this.downloadOver3g);
        sb.append(", downloadQuality=");
        sb.append(this.downloadQuality);
        sb.append(", streamQuality=");
        sb.append(this.streamQuality);
        sb.append(", accessPoint=");
        sb.append(this.accessPoint);
        sb.append(", facebookConnected=");
        sb.append(this.facebookConnected);
        sb.append(", secondsToOfflineExpiry=");
        sb.append(this.secondsToOfflineExpiry);
        sb.append(", gapless=");
        sb.append(this.gapless);
        sb.append(", automix=");
        sb.append(this.automix);
        sb.append(", normalize=");
        sb.append(this.normalize);
        sb.append(", loudnessEnvironment=");
        sb.append(this.loudnessEnvironment);
        sb.append(", crossfade=");
        sb.append(this.crossfade);
        sb.append(", crossfadeTimeSeconds=");
        sb.append(this.crossfadeTimeSeconds);
        sb.append(", showUnavailableTracks=");
        sb.append(this.showUnavailableTracks);
        sb.append(", localDevicesOnly=");
        sb.append(this.localDevicesOnly);
        sb.append(", webgateUrl=");
        sb.append(this.webgateUrl);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SettingsState) {
            SettingsState settingsState = (SettingsState) obj;
            return this.offlineMode == settingsState.offlineMode() && this.playExplicitContent == settingsState.playExplicitContent() && this.privateSession == settingsState.privateSession() && this.downloadOver3g == settingsState.downloadOver3g() && this.downloadQuality == settingsState.downloadQuality() && this.streamQuality == settingsState.streamQuality() && this.accessPoint.equals(settingsState.accessPoint()) && this.facebookConnected == settingsState.facebookConnected() && this.secondsToOfflineExpiry == settingsState.secondsToOfflineExpiry() && this.gapless == settingsState.gapless() && this.automix == settingsState.automix() && this.normalize == settingsState.normalize() && this.loudnessEnvironment == settingsState.loudnessEnvironment() && this.crossfade == settingsState.crossfade() && this.crossfadeTimeSeconds == settingsState.crossfadeTimeSeconds() && this.showUnavailableTracks == settingsState.showUnavailableTracks() && this.localDevicesOnly == settingsState.localDevicesOnly() && this.webgateUrl.equals(settingsState.webgateUrl());
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = ((((((((((((((((((((((((((((((((this.offlineMode ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.playExplicitContent ? 1231 : 1237)) * 1000003) ^ (this.privateSession ? 1231 : 1237)) * 1000003) ^ (this.downloadOver3g ? 1231 : 1237)) * 1000003) ^ this.downloadQuality) * 1000003) ^ this.streamQuality) * 1000003) ^ this.accessPoint.hashCode()) * 1000003) ^ (this.facebookConnected ? 1231 : 1237)) * 1000003) ^ this.secondsToOfflineExpiry) * 1000003) ^ (this.gapless ? 1231 : 1237)) * 1000003) ^ (this.automix ? 1231 : 1237)) * 1000003) ^ (this.normalize ? 1231 : 1237)) * 1000003) ^ this.loudnessEnvironment) * 1000003) ^ (this.crossfade ? 1231 : 1237)) * 1000003) ^ this.crossfadeTimeSeconds) * 1000003) ^ (this.showUnavailableTracks ? 1231 : 1237)) * 1000003;
        if (!this.localDevicesOnly) {
            i = 1237;
        }
        return ((hashCode ^ i) * 1000003) ^ this.webgateUrl.hashCode();
    }
}
