package com.spotify.music.features.speakercompanion.model;

import com.spotify.music.features.speakercompanion.model.EntityResultsPageResponse.Payload;
import java.util.List;

/* renamed from: com.spotify.music.features.speakercompanion.model.$AutoValue_EntityResultsPageResponse_Payload reason: invalid class name */
abstract class C$AutoValue_EntityResultsPageResponse_Payload extends Payload {
    private final qpt fulfillment;
    private final List<qpt> results;

    C$AutoValue_EntityResultsPageResponse_Payload(qpt qpt, List<qpt> list) {
        this.fulfillment = qpt;
        this.results = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Payload) {
            Payload payload = (Payload) obj;
            qpt qpt = this.fulfillment;
            if (qpt != null ? qpt.equals(payload.fulfillment()) : payload.fulfillment() == null) {
                List<qpt> list = this.results;
                return list != null ? list.equals(payload.results()) : payload.results() == null;
            }
        }
    }

    public qpt fulfillment() {
        return this.fulfillment;
    }

    public int hashCode() {
        qpt qpt = this.fulfillment;
        int i = 0;
        int hashCode = ((qpt == null ? 0 : qpt.hashCode()) ^ 1000003) * 1000003;
        List<qpt> list = this.results;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode ^ i;
    }

    public List<qpt> results() {
        return this.results;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Payload{fulfillment=");
        sb.append(this.fulfillment);
        sb.append(", results=");
        sb.append(this.results);
        sb.append("}");
        return sb.toString();
    }
}
