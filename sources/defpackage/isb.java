package defpackage;

import android.os.Parcelable;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.eventshub.model.ArtistConcertsModel;
import com.spotify.music.artist.uri.ArtistUri;

/* renamed from: isb reason: default package */
public final class isb extends uef<ArtistConcertsModel> {
    public final irz a;
    public final udr b;
    public String c;

    public final /* synthetic */ void a(Parcelable parcelable) {
        ArtistConcertsModel artistConcertsModel = (ArtistConcertsModel) parcelable;
        super.a(artistConcertsModel);
        this.c = String.format("spotify:artist:%s:concerts", new Object[]{new ArtistUri(artistConcertsModel.getArtist().getUri()).a});
        irz irz = this.a;
        bf bfVar = new bf(this.c, this.b.a(), null, null, -1, null, "page", null, (double) jrf.a.a());
        irz.a.a(bfVar);
    }

    public isb(wud<ArtistConcertsModel> wud, wud<SessionState> wud2, irz irz, udr udr) {
        super(wud, wud2);
        this.a = (irz) fay.a(irz);
        this.b = (udr) fay.a(udr);
    }

    public final isc a() {
        return (isc) super.c();
    }

    public final void b() {
        this.l = null;
        ((isc) super.c()).aj();
    }

    public final /* bridge */ /* synthetic */ ued c() {
        return (isc) super.c();
    }
}
