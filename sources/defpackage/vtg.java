package defpackage;

import com.spotify.remoteconfig.AndroidFeatureSearchProperties;
import com.spotify.remoteconfig.AndroidFeatureSearchProperties.NewPodcastResultComponents;

/* renamed from: vtg reason: default package */
public final class vtg extends AndroidFeatureSearchProperties {
    private final boolean a;
    private final NewPodcastResultComponents b;

    /* renamed from: vtg$a */
    public static final class a extends com.spotify.remoteconfig.AndroidFeatureSearchProperties.a {
        private Boolean a;
        private NewPodcastResultComponents b;

        public final com.spotify.remoteconfig.AndroidFeatureSearchProperties.a a(NewPodcastResultComponents newPodcastResultComponents) {
            if (newPodcastResultComponents != null) {
                this.b = newPodcastResultComponents;
                return this;
            }
            throw new NullPointerException("Null newPodcastResultComponents");
        }

        public final com.spotify.remoteconfig.AndroidFeatureSearchProperties.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final AndroidFeatureSearchProperties a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" enableSearchProto");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" newPodcastResultComponents");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new vtg(this.a.booleanValue(), this.b, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private vtg(boolean z, NewPodcastResultComponents newPodcastResultComponents) {
        this.a = z;
        this.b = newPodcastResultComponents;
    }

    /* synthetic */ vtg(boolean z, NewPodcastResultComponents newPodcastResultComponents, byte b2) {
        this(z, newPodcastResultComponents);
    }

    public final boolean a() {
        return this.a;
    }

    public final NewPodcastResultComponents b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AndroidFeatureSearchProperties) {
            AndroidFeatureSearchProperties androidFeatureSearchProperties = (AndroidFeatureSearchProperties) obj;
            return this.a == androidFeatureSearchProperties.a() && this.b.equals(androidFeatureSearchProperties.b());
        }
    }

    public final int hashCode() {
        return (((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidFeatureSearchProperties{enableSearchProto=");
        sb.append(this.a);
        sb.append(", newPodcastResultComponents=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
