package defpackage;

import com.spotify.music.features.payfail.BannerModel;
import com.spotify.music.features.payfail.BannerModel.Content;

/* renamed from: oad reason: default package */
public final class oad extends BannerModel {
    private final Content a;
    private final int b;

    public oad(Content content, int i) {
        if (content != null) {
            this.a = content;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null content");
    }

    public final Content a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BannerModel{content=");
        sb.append(this.a);
        sb.append(", downloadedContentCount=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BannerModel) {
            BannerModel bannerModel = (BannerModel) obj;
            return this.a.equals(bannerModel.a()) && this.b == bannerModel.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }
}
