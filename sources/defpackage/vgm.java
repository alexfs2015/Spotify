package defpackage;

import com.spotify.remoteconfig.AndroidLibsShareProperties;
import com.spotify.remoteconfig.AndroidLibsShareProperties.FacebookShareStoryVsFeed;

/* renamed from: vgm reason: default package */
public final class vgm extends AndroidLibsShareProperties {
    private final boolean a;
    private final FacebookShareStoryVsFeed b;

    /* renamed from: vgm$a */
    public static final class a extends com.spotify.remoteconfig.AndroidLibsShareProperties.a {
        private Boolean a;
        private FacebookShareStoryVsFeed b;

        public final com.spotify.remoteconfig.AndroidLibsShareProperties.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.remoteconfig.AndroidLibsShareProperties.a a(FacebookShareStoryVsFeed facebookShareStoryVsFeed) {
            if (facebookShareStoryVsFeed != null) {
                this.b = facebookShareStoryVsFeed;
                return this;
            }
            throw new NullPointerException("Null facebookShareStoryVsFeed");
        }

        public final AndroidLibsShareProperties a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" enableShareReorderingExperiment");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" facebookShareStoryVsFeed");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new vgm(this.a.booleanValue(), this.b, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ vgm(boolean z, FacebookShareStoryVsFeed facebookShareStoryVsFeed, byte b2) {
        this(z, facebookShareStoryVsFeed);
    }

    private vgm(boolean z, FacebookShareStoryVsFeed facebookShareStoryVsFeed) {
        this.a = z;
        this.b = facebookShareStoryVsFeed;
    }

    public final boolean a() {
        return this.a;
    }

    public final FacebookShareStoryVsFeed b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidLibsShareProperties{enableShareReorderingExperiment=");
        sb.append(this.a);
        sb.append(", facebookShareStoryVsFeed=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AndroidLibsShareProperties) {
            AndroidLibsShareProperties androidLibsShareProperties = (AndroidLibsShareProperties) obj;
            return this.a == androidLibsShareProperties.a() && this.b.equals(androidLibsShareProperties.b());
        }
    }

    public final int hashCode() {
        return (((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
