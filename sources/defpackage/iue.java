package defpackage;

import android.os.Parcelable;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.eventshub.model.ArtistConcertsModel;
import com.spotify.music.artist.uri.ArtistUri;

/* renamed from: iue reason: default package */
public final class iue extends mit<ArtistConcertsModel> {
    public final iuc a;
    public final uqm b;
    public String c;

    public iue(xii<ArtistConcertsModel> xii, xii<SessionState> xii2, iuc iuc, uqm uqm) {
        super(xii, xii2);
        this.a = (iuc) fbp.a(iuc);
        this.b = (uqm) fbp.a(uqm);
    }

    public final iuf a() {
        return (iuf) super.c();
    }

    public final /* synthetic */ void a(Parcelable parcelable) {
        ArtistConcertsModel artistConcertsModel = (ArtistConcertsModel) parcelable;
        super.a(artistConcertsModel);
        this.c = String.format("spotify:artist:%s:concerts", new Object[]{new ArtistUri(artistConcertsModel.getArtist().getUri()).a});
        iuc iuc = this.a;
        be beVar = new be(this.c, this.b.a(), null, null, -1, null, "page", null, (double) jtp.a.a());
        iuc.a.a(beVar);
    }

    public final void b() {
        this.l = null;
        ((iuf) super.c()).aj();
    }

    public final /* bridge */ /* synthetic */ mir c() {
        return (iuf) super.c();
    }
}
