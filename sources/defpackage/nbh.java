package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.c;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: nbh reason: default package */
public class nbh extends jrd implements c, d, fzq, jqx, ros {
    public ndi T;
    public wzi<nbi> U;
    public rop V;
    public nbw W;
    public lnw X;
    private roq Y;
    private fzn Z;
    public String a;
    public ndx b;

    public static nbh a(String str, fqn fqn, boolean z) {
        ViewUris.aJ.a((String) fbp.a(str));
        nbh nbh = new nbh();
        Bundle bundle = new Bundle();
        bundle.putString("artist_view_uri", str);
        bundle.putBoolean("is_autoplay_uri", z);
        nbh.g(bundle);
        fqo.a((Fragment) nbh, fqn);
        return nbh;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.T.b = null;
        return this.b.b.e();
    }

    public final void a(Context context) {
        super.a(context);
        this.i.remove("is_autoplay_uri");
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        super.a(menu, menuInflater);
        fzv.a(this, menu);
    }

    public final void a(fzn fzn) {
        rou rou;
        roq roq = this.Y;
        if (roq != null) {
            nbw nbw = this.W;
            boolean z = roq.b;
            if (jus.b(nbw.a)) {
                fqn fqn = nbw.a;
                if (fqn != null && ((Boolean) fqn.a(uiw.c)).booleanValue()) {
                    rou = nbw.b.n().b(z).a();
                    this.V.a(this.a, fzn, this.Y, rou);
                    this.Z = fzn;
                }
            }
            rou = nbw.b;
            this.V.a(this.a, fzn, this.Y, rou);
            this.Z = fzn;
        }
    }

    public final void a(roq roq) {
        this.Y = roq;
        c(true);
        ez.a(p());
    }

    public final void aP_() {
        this.X.a();
        this.T.a((ndz) this.b, (ros) this);
        super.aP_();
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.aJ.a(this.a);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.FREE_TIER_ARTIST, null);
    }

    public final uqm ag() {
        return uqo.Y;
    }

    public final String b(Context context) {
        return context.getString(R.string.artist_default_title);
    }

    public final String e() {
        return PageIdentifiers.FREE_TIER_ARTIST.name();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("view_state", this.b.a.a());
    }

    public final void h() {
        super.h();
        this.T.a.a();
        this.X.b();
    }

    public final void j(Bundle bundle) {
        super.j(bundle);
        this.b.c = bundle != null ? bundle.getParcelable("view_state") : null;
    }
}
