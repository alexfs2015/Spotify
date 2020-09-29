package com.spotify.music.features.speakercompanion.model;

import com.spotify.music.features.speakercompanion.model.EntityResultsPageResponse.Payload;
import java.util.List;

/* renamed from: com.spotify.music.features.speakercompanion.model.$AutoValue_EntityResultsPageResponse_Payload reason: invalid class name */
abstract class C$AutoValue_EntityResultsPageResponse_Payload extends Payload {
    private final qhf fulfillment;
    private final List<qhf> results;

    C$AutoValue_EntityResultsPageResponse_Payload(qhf qhf, List<qhf> list) {
        this.fulfillment = qhf;
        this.results = list;
    }

    public qhf fulfillment() {
        return this.fulfillment;
    }

    public List<qhf> results() {
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Payload) {
            Payload payload = (Payload) obj;
            qhf qhf = this.fulfillment;
            if (qhf != null ? qhf.equals(payload.fulfillment()) : payload.fulfillment() == null) {
                List<qhf> list = this.results;
                return list != null ? list.equals(payload.results()) : payload.results() == null;
            }
        }
    }

    public int hashCode() {
        qhf qhf = this.fulfillment;
        int i = 0;
        int hashCode = ((qhf == null ? 0 : qhf.hashCode()) ^ 1000003) * 1000003;
        List<qhf> list = this.results;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode ^ i;
    }
}
