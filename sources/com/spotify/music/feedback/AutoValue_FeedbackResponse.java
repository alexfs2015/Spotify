package com.spotify.music.feedback;

final class AutoValue_FeedbackResponse extends FeedbackResponse {
    private final String contextUri;
    private final String entityUri;
    private final String feature;
    private final String feedbackUrl;
    private final String intention;
    private final String reason;
    private final String type;

    AutoValue_FeedbackResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (str != null) {
            this.entityUri = str;
            if (str2 != null) {
                this.contextUri = str2;
                this.reason = str3;
                this.feedbackUrl = str4;
                this.feature = str5;
                if (str6 != null) {
                    this.intention = str6;
                    this.type = str7;
                    return;
                }
                throw new NullPointerException("Null intention");
            }
            throw new NullPointerException("Null contextUri");
        }
        throw new NullPointerException("Null entityUri");
    }

    public final String contextUri() {
        return this.contextUri;
    }

    public final String entityUri() {
        return this.entityUri;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FeedbackResponse) {
            FeedbackResponse feedbackResponse = (FeedbackResponse) obj;
            if (this.entityUri.equals(feedbackResponse.entityUri()) && this.contextUri.equals(feedbackResponse.contextUri())) {
                String str = this.reason;
                if (str != null ? str.equals(feedbackResponse.reason()) : feedbackResponse.reason() == null) {
                    String str2 = this.feedbackUrl;
                    if (str2 != null ? str2.equals(feedbackResponse.feedbackUrl()) : feedbackResponse.feedbackUrl() == null) {
                        String str3 = this.feature;
                        if (str3 != null ? str3.equals(feedbackResponse.feature()) : feedbackResponse.feature() == null) {
                            if (this.intention.equals(feedbackResponse.intention())) {
                                String str4 = this.type;
                                return str4 != null ? str4.equals(feedbackResponse.type()) : feedbackResponse.type() == null;
                            }
                        }
                    }
                }
            }
        }
    }

    public final String feature() {
        return this.feature;
    }

    public final String feedbackUrl() {
        return this.feedbackUrl;
    }

    public final int hashCode() {
        int hashCode = (((this.entityUri.hashCode() ^ 1000003) * 1000003) ^ this.contextUri.hashCode()) * 1000003;
        String str = this.reason;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.feedbackUrl;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.feature;
        int hashCode4 = (((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.intention.hashCode()) * 1000003;
        String str4 = this.type;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 ^ i;
    }

    public final String intention() {
        return this.intention;
    }

    public final String reason() {
        return this.reason;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedbackResponse{entityUri=");
        sb.append(this.entityUri);
        sb.append(", contextUri=");
        sb.append(this.contextUri);
        sb.append(", reason=");
        sb.append(this.reason);
        sb.append(", feedbackUrl=");
        sb.append(this.feedbackUrl);
        sb.append(", feature=");
        sb.append(this.feature);
        sb.append(", intention=");
        sb.append(this.intention);
        sb.append(", type=");
        sb.append(this.type);
        sb.append("}");
        return sb.toString();
    }

    public final String type() {
        return this.type;
    }
}
