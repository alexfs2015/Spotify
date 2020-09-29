package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.spotify.music.artist.model.ArtistModel;
import com.spotify.music.artist.uri.ArtistUri;

/* renamed from: imx reason: default package */
public abstract class imx extends mis<ArtistModel> {
    public jlr T;
    public jyx U;
    public gix V;
    public hgy W;
    public hxx X;
    private sso Y;
    private ArtistUri Z;
    protected ktm a;
    private ktn aa;
    public lbr b;

    public final void B() {
        super.B();
        this.U.a();
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        if (bundle == null) {
            ktm ktm = this.a;
            jlr jlr = ktm.c;
            be beVar = new be(null, ktm.a.a(), ktm.b.ae_().toString(), null, -1, null, "page", null, (double) jtp.a.a());
            jlr.a(beVar);
        }
    }

    public final sso ae_() {
        return this.Y;
    }

    public final mit<ArtistModel> ah() {
        return new mit<>(this.aa.a(this.Z.a), wit.a((xfk<T>) this.X.a));
    }

    public final /* synthetic */ Parcelable ai() {
        Bundle bundle = this.i;
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(imx.class.getClassLoader());
        return (ArtistModel) bundle.getParcelable("artist_model");
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        this.Y = (sso) fbp.a(this.i.getParcelable("artist_uri"));
        this.Z = new ArtistUri(this.Y.toString());
        this.aa = new ktn(this.W, this.V);
        this.a = new ktm(ag(), this, this.T);
    }
}
