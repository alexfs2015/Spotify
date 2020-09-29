package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.spotify.music.artist.model.ArtistModel;
import com.spotify.music.artist.uri.ArtistUri;

/* renamed from: ikk reason: default package */
public abstract class ikk extends uee<ArtistModel> {
    public jjf T;
    public jwv U;
    public ghm V;
    public hec W;
    public hvl X;
    private sih Y;
    private ArtistUri Z;
    protected kqd a;
    private kqe aa;
    public kyi b;

    public void b(Bundle bundle) {
        super.b(bundle);
        this.Y = (sih) fay.a(this.i.getParcelable("artist_uri"));
        this.Z = new ArtistUri(this.Y.toString());
        this.aa = new kqe(this.W, this.V);
        this.a = new kqd(ag(), this, this.T);
    }

    public final void B() {
        super.B();
        this.U.a();
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        if (bundle == null) {
            kqd kqd = this.a;
            jjf jjf = kqd.c;
            bf bfVar = new bf(null, kqd.a.a(), kqd.b.ae_().toString(), null, -1, null, "page", null, (double) jrf.a.a());
            jjf.a(bfVar);
        }
    }

    public final sih ae_() {
        return this.Y;
    }

    public final uef<ArtistModel> ah() {
        return new uef<>(this.aa.a(this.Z.a), vun.a((wrf<T>) this.X.a));
    }

    public final /* synthetic */ Parcelable ai() {
        Bundle bundle = this.i;
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(ikk.class.getClassLoader());
        return (ArtistModel) bundle.getParcelable("artist_model");
    }
}
