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

/* renamed from: mwg reason: default package */
public class mwg extends jor implements c, d, fyw, jol, rfq {
    public myh T;
    public wlc<mwh> U;
    public rfn V;
    public mwv W;
    public ljw X;
    private rfo Y;
    private fyt Z;
    public String a;
    public myw b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public static mwg a(String str, fpt fpt, boolean z) {
        ViewUris.aK.a((String) fay.a(str));
        mwg mwg = new mwg();
        Bundle bundle = new Bundle();
        bundle.putString("artist_view_uri", str);
        bundle.putBoolean("is_autoplay_uri", z);
        mwg.g(bundle);
        fpu.a((Fragment) mwg, fpt);
        return mwg;
    }

    public final void a(Context context) {
        super.a(context);
        this.i.remove("is_autoplay_uri");
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.T.b = null;
        return this.b.b.e();
    }

    public final void j(Bundle bundle) {
        super.j(bundle);
        this.b.c = bundle != null ? bundle.getParcelable("view_state") : null;
    }

    public final void g() {
        this.X.a();
        this.T.a((myy) this.b, (rfq) this);
        super.g();
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

    public final String b(Context context) {
        return context.getString(R.string.artist_default_title);
    }

    public final String e() {
        return PageIdentifiers.FREE_TIER_ARTIST.name();
    }

    public final udr ag() {
        return udt.Y;
    }

    public final sih ae_() {
        return ViewUris.aK.a(this.a);
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.FREE_TIER_ARTIST, null);
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        super.a(menu, menuInflater);
        fzb.a(this, menu);
    }

    public final void a(fyt fyt) {
        rfs rfs;
        rfo rfo = this.Y;
        if (rfo != null) {
            mwv mwv = this.W;
            boolean z = rfo.b;
            if (jsl.b(mwv.a)) {
                fpt fpt = mwv.a;
                if (fpt != null && ((Boolean) fpt.a(twt.c)).booleanValue()) {
                    rfs = mwv.b.n().b(z).a();
                    this.V.a(this.a, fyt, this.Y, rfs);
                    this.Z = fyt;
                }
            }
            rfs = mwv.b;
            this.V.a(this.a, fyt, this.Y, rfs);
            this.Z = fyt;
        }
    }

    public final void a(rfo rfo) {
        this.Y = rfo;
        c(true);
        ez.a(p());
    }
}
