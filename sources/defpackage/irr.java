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

/* renamed from: irr reason: default package */
public final class irr extends uef<CreatorAboutModel> {
    private static final Pattern m = Pattern.compile("(\r\n|\n)");
    final ArtistUri a;
    final irt b;
    final irn c;
    String d = "";
    final boolean e;
    int f;
    List<ImageModel> g;
    private final irs n;

    public final /* synthetic */ void a(Parcelable parcelable) {
        CreatorAboutModel creatorAboutModel = (CreatorAboutModel) parcelable;
        super.a(creatorAboutModel);
        String name = creatorAboutModel.name();
        if (!fax.a(name)) {
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
        if (!fax.a(body)) {
            this.n.a(a(body), mainImageUrl, name);
        } else if (!fax.a(biography)) {
            this.n.b(a(biography));
        }
        if (autobiography != null) {
            linksModel = autobiography.links();
        }
        if (linksModel != null) {
            String wikipediaLink = linksModel.getWikipediaLink();
            if (!fax.a(wikipediaLink)) {
                this.n.d(wikipediaLink, true);
                this.c.a(this.a.toString(), "social-wikipedia-link");
            }
            String instagramLink = linksModel.getInstagramLink();
            if (!fax.a(instagramLink)) {
                this.n.b(instagramLink, true);
                this.c.a(this.a.toString(), "social-instagram-link");
            }
            String facebookLink = linksModel.getFacebookLink();
            if (!fax.a(facebookLink)) {
                this.n.a(facebookLink, true);
                this.c.a(this.a.toString(), "social-facebook-link");
            }
            String twitterLink = linksModel.getTwitterLink();
            if (!fax.a(twitterLink)) {
                this.n.c(twitterLink, true);
                this.c.a(this.a.toString(), "social-twitter-link");
            }
        }
    }

    private static String a(String str) {
        return m.matcher(str).replaceAll("<br/>");
    }

    public irr(wud<CreatorAboutModel> wud, wud<SessionState> wud2, ArtistUri artistUri, irn irn, irs irs, irt irt, boolean z) {
        super(wud, wud2);
        this.a = (ArtistUri) fay.a(artistUri);
        this.c = (irn) fay.a(irn);
        this.b = irt;
        this.n = irs;
        this.e = z;
    }
}
