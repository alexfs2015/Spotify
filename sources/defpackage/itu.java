package defpackage;

import android.os.Parcelable;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.creatorartist.model.Autobiography;
import com.spotify.mobile.android.spotlets.creatorartist.model.CreatorAboutModel;
import com.spotify.mobile.android.spotlets.creatorartist.model.Image;
import com.spotify.mobile.android.spotlets.creatorartist.model.ImageModel;
import com.spotify.mobile.android.spotlets.creatorartist.model.LinksModel;
import com.spotify.music.artist.uri.ArtistUri;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: itu reason: default package */
public final class itu extends mit<CreatorAboutModel> {
    private static final Pattern m = Pattern.compile("(\r\n|\n)");
    final ArtistUri a;
    final itw b;
    final itq c;
    String d = "";
    final boolean e;
    int f;
    List<ImageModel> g;
    private final itv n;

    public itu(xii<CreatorAboutModel> xii, xii<SessionState> xii2, ArtistUri artistUri, itq itq, itv itv, itw itw, boolean z) {
        super(xii, xii2);
        this.a = (ArtistUri) fbp.a(artistUri);
        this.c = (itq) fbp.a(itq);
        this.b = itw;
        this.n = itv;
        this.e = z;
    }

    private static String a(String str) {
        return m.matcher(str).replaceAll("<br/>");
    }

    public final /* synthetic */ void a(Parcelable parcelable) {
        CreatorAboutModel creatorAboutModel = (CreatorAboutModel) parcelable;
        super.a(creatorAboutModel);
        String name = creatorAboutModel.name();
        if (!fbo.a(name)) {
            this.d = name;
        }
        this.g = creatorAboutModel.images();
        List unmodifiableList = Collections.unmodifiableList(Lists.a(this.g, $$Lambda$DD0_QgGIvEbboLTDvhK30M4iJaQ.INSTANCE));
        if (!unmodifiableList.isEmpty()) {
            if (this.e) {
                this.n.a((Image) unmodifiableList.get(0));
                this.n.a(true);
                if (unmodifiableList.size() > 1) {
                    this.n.b((Image) unmodifiableList.get(1));
                }
            } else {
                this.n.a(unmodifiableList);
            }
            this.n.ak();
        }
        String biography = creatorAboutModel.biography();
        Autobiography autobiography = creatorAboutModel.autobiography();
        String mainImageUrl = creatorAboutModel.mainImageUrl();
        LinksModel linksModel = null;
        String body = autobiography == null ? null : autobiography.body();
        if (!fbo.a(body)) {
            this.n.a(a(body), mainImageUrl, name);
        } else if (!fbo.a(biography)) {
            this.n.b(a(biography));
        }
        if (autobiography != null) {
            linksModel = autobiography.links();
        }
        if (linksModel != null) {
            String wikipediaLink = linksModel.getWikipediaLink();
            if (!fbo.a(wikipediaLink)) {
                this.n.d(wikipediaLink, true);
                this.c.a(this.a.toString(), "social-wikipedia-link");
            }
            String instagramLink = linksModel.getInstagramLink();
            if (!fbo.a(instagramLink)) {
                this.n.b(instagramLink, true);
                this.c.a(this.a.toString(), "social-instagram-link");
            }
            String facebookLink = linksModel.getFacebookLink();
            if (!fbo.a(facebookLink)) {
                this.n.a(facebookLink, true);
                this.c.a(this.a.toString(), "social-facebook-link");
            }
            String twitterLink = linksModel.getTwitterLink();
            if (!fbo.a(twitterLink)) {
                this.n.c(twitterLink, true);
                this.c.a(this.a.toString(), "social-twitter-link");
            }
        }
    }
}
