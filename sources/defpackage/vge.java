package defpackage;

import com.spotify.remoteconfig.AndroidFeatureUserProperties;
import com.spotify.remoteconfig.AndroidFeatureUserProperties.ProfileViewMoreLinkTextResource;

/* renamed from: vge reason: default package */
public final class vge extends AndroidFeatureUserProperties {
    private final ProfileViewMoreLinkTextResource a;

    /* renamed from: vge$a */
    public static final class a extends com.spotify.remoteconfig.AndroidFeatureUserProperties.a {
        private ProfileViewMoreLinkTextResource a;

        public final com.spotify.remoteconfig.AndroidFeatureUserProperties.a a(ProfileViewMoreLinkTextResource profileViewMoreLinkTextResource) {
            if (profileViewMoreLinkTextResource != null) {
                this.a = profileViewMoreLinkTextResource;
                return this;
            }
            throw new NullPointerException("Null profileViewMoreLinkTextResource");
        }

        public final AndroidFeatureUserProperties a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" profileViewMoreLinkTextResource");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new vge(this.a, 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ vge(ProfileViewMoreLinkTextResource profileViewMoreLinkTextResource, byte b) {
        this(profileViewMoreLinkTextResource);
    }

    private vge(ProfileViewMoreLinkTextResource profileViewMoreLinkTextResource) {
        this.a = profileViewMoreLinkTextResource;
    }

    public final ProfileViewMoreLinkTextResource a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidFeatureUserProperties{profileViewMoreLinkTextResource=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidFeatureUserProperties)) {
            return false;
        }
        return this.a.equals(((AndroidFeatureUserProperties) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
