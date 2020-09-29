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

/* renamed from: mwl reason: default package */
public class mwl extends jor implements jol, a {
    public wlc<mwj> T;
    private sih U;
    private String V;
    public gur a;
    public myf b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.a.e();
    }

    public final void g() {
        super.g();
        this.b.a(this.U.toString());
    }

    public final void h() {
        super.h();
        this.b.a.a();
    }

    public final String b(Context context) {
        String str = this.V;
        return str == null ? context.getString(R.string.artist_releases_default_title) : str;
    }

    public final String e() {
        return PageIdentifiers.FREE_TIER_ARTIST_SUBPAGE.name();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.FREE_TIER_ARTIST_SUBPAGE, null);
    }

    public final udr ag() {
        return udt.h;
    }

    public final sih ae_() {
        return this.U;
    }

    public static mwl a(jst jst, String str, fpt fpt) {
        fay.a(jst.b == LinkType.ARTIST_RELEASES, (Object) "SpotifyLink needs to be of link type Artists releases");
        mwl mwl = new mwl();
        Bundle bundle = new Bundle();
        bundle.putString("view_uri", jst.h());
        bundle.putString("title", str);
        mwl.g(bundle);
        fpu.a((Fragment) mwl, fpt);
        return mwl;
    }

    public final void a(Context context) {
        Bundle bundle = (Bundle) fay.a(this.i);
        this.U = ViewUris.aK.a((String) fay.a(bundle.getString("view_uri")));
        this.V = bundle.getString("title");
        super.a(context);
    }
}
