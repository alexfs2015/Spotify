package com.spotify.mobile.android.spotlets.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.spotlets.eventshub.model.$AutoValue_ConcertPartner reason: invalid class name */
abstract class C$AutoValue_ConcertPartner extends ConcertPartner {
    private final String concertId;
    private final String partnerId;

    C$AutoValue_ConcertPartner(String str, String str2) {
        if (str != null) {
            this.partnerId = str;
            if (str2 != null) {
                this.concertId = str2;
                return;
            }
            throw new NullPointerException("Null concertId");
        }
        throw new NullPointerException("Null partnerId");
    }

    @JsonProperty("partnerId")
    public String getPartnerId() {
        return this.partnerId;
    }

    @JsonProperty("concertId")
    public String getConcertId() {
        return this.concertId;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConcertPartner{partnerId=");
        sb.append(this.partnerId);
        sb.append(", concertId=");
        sb.append(this.concertId);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConcertPartner) {
            ConcertPartner concertPartner = (ConcertPartner) obj;
            return this.partnerId.equals(concertPartner.getPartnerId()) && this.concertId.equals(concertPartner.getConcertId());
        }
    }

    public int hashCode() {
        return ((this.partnerId.hashCode() ^ 1000003) * 1000003) ^ this.concertId.hashCode();
    }
}
