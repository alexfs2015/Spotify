package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: mxn reason: default package */
public class mxn extends jrd implements d, fzq, jqx, ros, uqq {
    public naj T;
    public wzi<mxo> U;
    public rop V;
    public rou W;
    public lnw X;
    private final a Y = new a();
    private roq Z;
    public String a;
    private boolean aa;
    private fzn ab;
    public nar b;

    /* renamed from: mxn$a */
    public class a {
        public a() {
        }
    }

    public static mxn a(String str, fqn fqn, boolean z) {
        return a(str, fqn, false, null);
    }

    public static mxn a(String str, fqn fqn, boolean z, String str2) {
        ViewUris.aI.a(str);
        mxn mxn = new mxn();
        Bundle bundle = new Bundle();
        bundle.putString("album_view_uri", str);
        bundle.putString("autoplay_track_uri", str2);
        bundle.putBoolean("is_autoplay_uri", z);
        mxn.g(bundle);
        fqo.a((Fragment) mxn, fqn);
        return mxn;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.T.b();
        return this.b.b.e();
    }

    public final void a(Context context) {
        super.a(context);
        this.i.remove("is_autoplay_uri");
        this.i.remove("autoplay_track_uri");
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzv.a(this, menu);
    }

    public final void a(fzn fzn) {
        roq roq = this.Z;
        if (roq != null) {
            this.V.a(this.a, fzn, roq, this.W);
            this.ab = fzn;
        }
    }

    public final void a(roq roq) {
        this.Z = roq;
        c(true);
        ez.a(p());
    }

    public final void aP_() {
        this.X.a();
        super.aP_();
        this.T.a(this.b, this);
        this.aa = true;
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.aI.a(this.a);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.FREE_TIER_ALBUM, null);
    }

    public final uqm ag() {
        return uqo.X;
    }

    public final gkq aj() {
        return PageIdentifiers.FREE_TIER_ALBUM;
    }

    public final String b(Context context) {
        return context.getString(R.string.album_title_default);
    }

    public final String e() {
        return PageIdentifiers.FREE_TIER_ALBUM.name();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("view_state", this.b.a.a());
    }

    public final void h() {
        super.h();
        this.T.a();
        this.aa = false;
        this.X.b();
    }

    public final void j(Bundle bundle) {
        super.j(bundle);
        this.b.c = bundle != null ? bundle.getParcelable("view_state") : null;
    }
}
