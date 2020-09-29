package com.spotify.voiceassistant.models.v1;

final class AutoValue_ParsedQuery extends ParsedQuery {
    private static final long serialVersionUID = 7705541758140322385L;
    private final String intent;
    private final String uri;

    static final class Builder extends com.spotify.voiceassistant.models.v1.ParsedQuery.Builder {
        private String intent;
        private String uri;

        Builder() {
        }

        public final com.spotify.voiceassistant.models.v1.ParsedQuery.Builder intent(String str) {
            if (str != null) {
                this.intent = str;
                return this;
            }
            throw new NullPointerException("Null intent");
        }

        public final com.spotify.voiceassistant.models.v1.ParsedQuery.Builder uri(String str) {
            if (str != null) {
                this.uri = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public final ParsedQuery build() {
            String str = "";
            if (this.intent == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" intent");
                str = sb.toString();
            }
            if (this.uri == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" uri");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_ParsedQuery(this.intent, this.uri);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private AutoValue_ParsedQuery(String str, String str2) {
        this.intent = str;
        this.uri = str2;
    }

    @fiq(a = "intent")
    public final String intent() {
        return this.intent;
    }

    @fiq(a = "uri")
    public final String uri() {
        return this.uri;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParsedQuery{intent=");
        sb.append(this.intent);
        sb.append(", uri=");
        sb.append(this.uri);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ParsedQuery) {
            ParsedQuery parsedQuery = (ParsedQuery) obj;
            return this.intent.equals(parsedQuery.intent()) && this.uri.equals(parsedQuery.uri());
        }
    }

    public final int hashCode() {
        return ((this.intent.hashCode() ^ 1000003) * 1000003) ^ this.uri.hashCode();
    }
}
