package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: nbm reason: default package */
public class nbm extends jrd implements jqx, a {
    public wzi<nbk> T;
    private sso U;
    private String V;
    public gwr a;
    public ndg b;

    public static nbm a(jva jva, String str, fqn fqn) {
        fbp.a(jva.b == LinkType.ARTIST_RELEASES, (Object) "SpotifyLink needs to be of link type Artists releases");
        nbm nbm = new nbm();
        Bundle bundle = new Bundle();
        bundle.putString("view_uri", jva.h());
        bundle.putString("title", str);
        nbm.g(bundle);
        fqo.a((Fragment) nbm, fqn);
        return nbm;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.a.e();
    }

    public final void a(Context context) {
        Bundle bundle = (Bundle) fbp.a(this.i);
        this.U = ViewUris.aJ.a((String) fbp.a(bundle.getString("view_uri")));
        this.V = bundle.getString("title");
        super.a(context);
    }

    public final void aP_() {
        super.aP_();
        this.b.a(this.U.toString());
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return this.U;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.FREE_TIER_ARTIST_SUBPAGE, null);
    }

    public final uqm ag() {
        return uqo.h;
    }

    public final String b(Context context) {
        String str = this.V;
        return str == null ? context.getString(R.string.artist_releases_default_title) : str;
    }

    public final String e() {
        return PageIdentifiers.FREE_TIER_ARTIST_SUBPAGE.name();
    }

    public final void h() {
        super.h();
        this.b.a.a();
    }
}
