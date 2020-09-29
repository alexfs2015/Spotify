package com.spotify.mobile.android.spotlets.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.spotlets.eventshub.model.$AutoValue_ConcertResult reason: invalid class name */
abstract class C$AutoValue_ConcertResult extends ConcertResult {
    private final String clickThroughUrl;
    private final Concert concert;
    private final Boolean discovery;
    private final Boolean nearUser;
    private final String source;

    C$AutoValue_ConcertResult(Concert concert2, String str, String str2, Boolean bool, Boolean bool2) {
        if (concert2 != null) {
            this.concert = concert2;
            this.clickThroughUrl = str;
            this.source = str2;
            this.nearUser = bool;
            this.discovery = bool2;
            return;
        }
        throw new NullPointerException("Null concert");
    }

    @JsonProperty("concert")
    public Concert getConcert() {
        return this.concert;
    }

    @JsonProperty("clickThruUrl")
    public String getClickThroughUrl() {
        return this.clickThroughUrl;
    }

    @JsonProperty("source")
    public String getSource() {
        return this.source;
    }

    @JsonProperty("nearUser")
    public Boolean getNearUser() {
        return this.nearUser;
    }

    @JsonProperty("discovery")
    public Boolean getDiscovery() {
        return this.discovery;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConcertResult{concert=");
        sb.append(this.concert);
        sb.append(", clickThroughUrl=");
        sb.append(this.clickThroughUrl);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", nearUser=");
        sb.append(this.nearUser);
        sb.append(", discovery=");
        sb.append(this.discovery);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConcertResult) {
            ConcertResult concertResult = (ConcertResult) obj;
            if (this.concert.equals(concertResult.getConcert())) {
                String str = this.clickThroughUrl;
                if (str != null ? str.equals(concertResult.getClickThroughUrl()) : concertResult.getClickThroughUrl() == null) {
                    String str2 = this.source;
                    if (str2 != null ? str2.equals(concertResult.getSource()) : concertResult.getSource() == null) {
                        Boolean bool = this.nearUser;
                        if (bool != null ? bool.equals(concertResult.getNearUser()) : concertResult.getNearUser() == null) {
                            Boolean bool2 = this.discovery;
                            return bool2 != null ? bool2.equals(concertResult.getDiscovery()) : concertResult.getDiscovery() == null;
                        }
                    }
                }
            }
        }
    }

    public int hashCode() {
        int hashCode = (this.concert.hashCode() ^ 1000003) * 1000003;
        String str = this.clickThroughUrl;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.source;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Boolean bool = this.nearUser;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Boolean bool2 = this.discovery;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode4 ^ i;
    }
}
