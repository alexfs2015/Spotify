package com.spotify.mobile.android.playlist.navigation;

import com.google.common.base.Optional;

final class AutoValue_AllSongsConfiguration extends AllSongsConfiguration {
    private static final long serialVersionUID = -4313545819262590245L;
    private final Optional<Boolean> availableItemsOnly;
    private final boolean contextAwareSharing;
    private final boolean includeEpisodes;
    private final Optional<Integer> limitRangeTo;
    private final boolean showRankingNumbers;

    static final class a implements com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration.a {
        private Boolean a;
        private Boolean b;
        private Optional<Boolean> c;
        private Boolean d;
        private Optional<Integer> e;

        a() {
            this.c = Optional.e();
            this.e = Optional.e();
        }

        private a(AllSongsConfiguration allSongsConfiguration) {
            this.c = Optional.e();
            this.e = Optional.e();
            this.a = Boolean.valueOf(allSongsConfiguration.a());
            this.b = Boolean.valueOf(allSongsConfiguration.b());
            this.c = allSongsConfiguration.c();
            this.d = Boolean.valueOf(allSongsConfiguration.d());
            this.e = allSongsConfiguration.e();
        }

        /* synthetic */ a(AllSongsConfiguration allSongsConfiguration, byte b2) {
            this(allSongsConfiguration);
        }

        public final com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration.a a(Optional<Boolean> optional) {
            if (optional != null) {
                this.c = optional;
                return this;
            }
            String str = "lusslllaNlIabayneveOt i";
            throw new NullPointerException("Null availableItemsOnly");
        }

        public final com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final AllSongsConfiguration a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                String str2 = "ocimlddsspeuen E";
                sb.append(" includeEpisodes");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                String str3 = "nm uowiNRhaegnorkss";
                sb2.append(" showRankingNumbers");
                str = sb2.toString();
            }
            if (this.d == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                String str4 = "aaowxbteSrAhcgrntnie";
                sb3.append(" contextAwareSharing");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                AutoValue_AllSongsConfiguration autoValue_AllSongsConfiguration = new AutoValue_AllSongsConfiguration(this.a.booleanValue(), this.b.booleanValue(), this.c, this.d.booleanValue(), this.e, 0);
                return autoValue_AllSongsConfiguration;
            }
            String str5 = "pseMidb tr ieo:rqesrgesiunrp";
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration.a b(Optional<Integer> optional) {
            if (optional != null) {
                this.e = optional;
                return this;
            }
            String str = "NutemRntlil laogi";
            throw new NullPointerException("Null limitRangeTo");
        }

        public final com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }
    }

    private AutoValue_AllSongsConfiguration(boolean z, boolean z2, Optional<Boolean> optional, boolean z3, Optional<Integer> optional2) {
        this.includeEpisodes = z;
        this.showRankingNumbers = z2;
        this.availableItemsOnly = optional;
        this.contextAwareSharing = z3;
        this.limitRangeTo = optional2;
    }

    /* synthetic */ AutoValue_AllSongsConfiguration(boolean z, boolean z2, Optional optional, boolean z3, Optional optional2, byte b) {
        this(z, z2, optional, z3, optional2);
    }

    public final boolean a() {
        return this.includeEpisodes;
    }

    public final boolean b() {
        return this.showRankingNumbers;
    }

    public final Optional<Boolean> c() {
        return this.availableItemsOnly;
    }

    public final boolean d() {
        return this.contextAwareSharing;
    }

    public final Optional<Integer> e() {
        return this.limitRangeTo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AllSongsConfiguration) {
            AllSongsConfiguration allSongsConfiguration = (AllSongsConfiguration) obj;
            return this.includeEpisodes == allSongsConfiguration.a() && this.showRankingNumbers == allSongsConfiguration.b() && this.availableItemsOnly.equals(allSongsConfiguration.c()) && this.contextAwareSharing == allSongsConfiguration.d() && this.limitRangeTo.equals(allSongsConfiguration.e());
        }
    }

    public final com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration.a f() {
        return new a(this, 0);
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = ((((((this.includeEpisodes ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.showRankingNumbers ? 1231 : 1237)) * 1000003) ^ this.availableItemsOnly.hashCode()) * 1000003;
        if (!this.contextAwareSharing) {
            i = 1237;
        }
        return ((hashCode ^ i) * 1000003) ^ this.limitRangeTo.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AllSongsConfiguration{includeEpisodes=");
        sb.append(this.includeEpisodes);
        String str = "sesohbuiaNn,knrs gw=m";
        sb.append(", showRankingNumbers=");
        sb.append(this.showRankingNumbers);
        String str2 = "sitmaa I,lnvel=Obamly";
        sb.append(", availableItemsOnly=");
        sb.append(this.availableItemsOnly);
        String str3 = "wAo,oxagS=cirn trtnahe";
        sb.append(", contextAwareSharing=");
        sb.append(this.contextAwareSharing);
        String str4 = "ngimeb,atRoil T";
        sb.append(", limitRangeTo=");
        sb.append(this.limitRangeTo);
        sb.append("}");
        return sb.toString();
    }
}
