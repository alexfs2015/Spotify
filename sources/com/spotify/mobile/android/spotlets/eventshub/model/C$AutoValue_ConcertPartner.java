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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConcertPartner) {
            ConcertPartner concertPartner = (ConcertPartner) obj;
            if (this.partnerId.equals(concertPartner.getPartnerId()) && this.concertId.equals(concertPartner.getConcertId())) {
                return true;
            }
        }
        return false;
    }

    @JsonProperty("concertId")
    public String getConcertId() {
        return this.concertId;
    }

    @JsonProperty("partnerId")
    public String getPartnerId() {
        return this.partnerId;
    }

    public int hashCode() {
        return ((this.partnerId.hashCode() ^ 1000003) * 1000003) ^ this.concertId.hashCode();
    }

    public String toString() {
        String str = "{rsrcrPCetanr=nnrdtpoeaet";
        StringBuilder sb = new StringBuilder("ConcertPartner{partnerId=");
        sb.append(this.partnerId);
        String str2 = "=c mIo,ntdce";
        sb.append(", concertId=");
        sb.append(this.concertId);
        String str3 = "}";
        sb.append("}");
        return sb.toString();
    }
}
