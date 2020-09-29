package com.spotify.music.features.speakercompanion.model;

import com.spotify.music.features.speakercompanion.model.EntityResultsPageResponse.Payload;

final class AutoValue_EntityResultsPageResponse extends EntityResultsPageResponse {
    private final boolean eligible;
    private final Payload payload;
    private final String uid;

    AutoValue_EntityResultsPageResponse(boolean z, String str, Payload payload2) {
        this.eligible = z;
        this.uid = str;
        this.payload = payload2;
    }

    public final boolean eligible() {
        return this.eligible;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EntityResultsPageResponse) {
            EntityResultsPageResponse entityResultsPageResponse = (EntityResultsPageResponse) obj;
            if (this.eligible == entityResultsPageResponse.eligible()) {
                String str = this.uid;
                if (str != null ? str.equals(entityResultsPageResponse.uid()) : entityResultsPageResponse.uid() == null) {
                    Payload payload2 = this.payload;
                    return payload2 != null ? payload2.equals(entityResultsPageResponse.payload()) : entityResultsPageResponse.payload() == null;
                }
            }
        }
    }

    public final int hashCode() {
        int i = ((this.eligible ? 1231 : 1237) ^ 1000003) * 1000003;
        String str = this.uid;
        int i2 = 0;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Payload payload2 = this.payload;
        if (payload2 != null) {
            i2 = payload2.hashCode();
        }
        return hashCode ^ i2;
    }

    public final Payload payload() {
        return this.payload;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EntityResultsPageResponse{eligible=");
        sb.append(this.eligible);
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append("}");
        return sb.toString();
    }

    public final String uid() {
        return this.uid;
    }
}
