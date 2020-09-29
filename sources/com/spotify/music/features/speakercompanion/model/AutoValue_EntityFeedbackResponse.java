package com.spotify.music.features.speakercompanion.model;

final class AutoValue_EntityFeedbackResponse extends EntityFeedbackResponse {
    private final boolean eligible;
    private final EntityFeedback payload;

    AutoValue_EntityFeedbackResponse(boolean z, EntityFeedback entityFeedback) {
        this.eligible = z;
        this.payload = entityFeedback;
    }

    public final boolean eligible() {
        return this.eligible;
    }

    public final EntityFeedback payload() {
        return this.payload;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EntityFeedbackResponse{eligible=");
        sb.append(this.eligible);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EntityFeedbackResponse) {
            EntityFeedbackResponse entityFeedbackResponse = (EntityFeedbackResponse) obj;
            if (this.eligible == entityFeedbackResponse.eligible()) {
                EntityFeedback entityFeedback = this.payload;
                return entityFeedback != null ? entityFeedback.equals(entityFeedbackResponse.payload()) : entityFeedbackResponse.payload() == null;
            }
        }
    }

    public final int hashCode() {
        int i = ((this.eligible ? 1231 : 1237) ^ 1000003) * 1000003;
        EntityFeedback entityFeedback = this.payload;
        return i ^ (entityFeedback == null ? 0 : entityFeedback.hashCode());
    }
}
