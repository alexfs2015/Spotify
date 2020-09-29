package com.spotify.pushnotifications.model;

final class AutoValue_PushkaMetadata extends PushkaMetadata {
    private final String campaignId;
    private final String messageId;

    AutoValue_PushkaMetadata(String str, String str2) {
        if (str != null) {
            this.messageId = str;
            if (str2 != null) {
                this.campaignId = str2;
                return;
            }
            throw new NullPointerException("Null campaignId");
        }
        throw new NullPointerException("Null messageId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PushkaMetadata) {
            PushkaMetadata pushkaMetadata = (PushkaMetadata) obj;
            return this.messageId.equals(pushkaMetadata.getMessageId()) && this.campaignId.equals(pushkaMetadata.getCampaignId());
        }
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final int hashCode() {
        return ((this.messageId.hashCode() ^ 1000003) * 1000003) ^ this.campaignId.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushkaMetadata{messageId=");
        sb.append(this.messageId);
        sb.append(", campaignId=");
        sb.append(this.campaignId);
        sb.append("}");
        return sb.toString();
    }
}
