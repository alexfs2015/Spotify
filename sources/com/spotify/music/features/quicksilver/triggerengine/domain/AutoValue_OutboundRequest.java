package com.spotify.music.features.quicksilver.triggerengine.domain;

final class AutoValue_OutboundRequest extends OutboundRequest {
    private static final long serialVersionUID = 1;
    private final String format;
    private final String pattern;
    private final String triggerType;

    static final class a implements com.spotify.music.features.quicksilver.triggerengine.domain.OutboundRequest.a {
        private String a;
        private String b;
        private String c;

        a() {
        }

        public final com.spotify.music.features.quicksilver.triggerengine.domain.OutboundRequest.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null triggerType");
        }

        public final com.spotify.music.features.quicksilver.triggerengine.domain.OutboundRequest.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null pattern");
        }

        public final com.spotify.music.features.quicksilver.triggerengine.domain.OutboundRequest.a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null format");
        }

        public final OutboundRequest a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" triggerType");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" pattern");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" format");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_OutboundRequest(this.a, this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ AutoValue_OutboundRequest(String str, String str2, String str3, byte b) {
        this(str, str2, str3);
    }

    private AutoValue_OutboundRequest(String str, String str2, String str3) {
        this.triggerType = str;
        this.pattern = str2;
        this.format = str3;
    }

    public final String a() {
        return this.triggerType;
    }

    public final String b() {
        return this.pattern;
    }

    public final String c() {
        return this.format;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutboundRequest{triggerType=");
        sb.append(this.triggerType);
        sb.append(", pattern=");
        sb.append(this.pattern);
        sb.append(", format=");
        sb.append(this.format);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OutboundRequest) {
            OutboundRequest outboundRequest = (OutboundRequest) obj;
            return this.triggerType.equals(outboundRequest.a()) && this.pattern.equals(outboundRequest.b()) && this.format.equals(outboundRequest.c());
        }
    }

    public final int hashCode() {
        return ((((this.triggerType.hashCode() ^ 1000003) * 1000003) ^ this.pattern.hashCode()) * 1000003) ^ this.format.hashCode();
    }
}
