package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: nfl reason: default package */
public class nfl extends jrd implements jqx, lbp, a, a, uqq {
    public fou<Boolean> T;
    public ngv U;
    private b<ngi, nge> V;
    public nfn a;
    public fou<Boolean> b;

    public static nfl a(Bundle bundle) {
        nfl nfl = new nfl();
        nfl.g(bundle);
        a.a((Fragment) nfl, rta.l);
        return nfl;
    }

    public final void A() {
        this.T.accept(Boolean.FALSE);
        this.V.d();
        super.A();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ngi ngi;
        View inflate = layoutInflater.inflate(R.layout.fragment_fullscreen_story, viewGroup, false);
        if (bundle != null) {
            String str = "fullscreen_story_model";
            if (bundle.containsKey(str)) {
                ngi = (ngi) bundle.getParcelable(str);
                this.V = knc.a(this.a.a(), ngi, knm.a());
                return inflate;
            }
        }
        ngi = ngi.i;
        this.V = knc.a(this.a.a(), ngi, knm.a());
        return inflate;
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.f;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.FULLSCREEN_STORY, ViewUris.f.toString());
    }

    public final uqm ag() {
        return uqo.af;
    }

    public final View ah() {
        return (View) fbp.a(this.H);
    }

    public final void ai() {
        q().finish();
    }

    public final gkq aj() {
        return PageIdentifiers.FULLSCREEN_STORY;
    }

    public final void aw_() {
        this.V.b();
        super.aw_();
    }

    public final String b(Context context) {
        return "Fullscreen story";
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        this.V.a(this.U);
    }

    public final String e() {
        return uqo.af.a();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("fullscreen_story_model", (ngi) this.V.e());
    }

    public boolean onBackPressed() {
        this.b.accept(Boolean.TRUE);
        return true;
    }

    public final void z() {
        super.z();
        this.V.c();
        this.T.accept(Boolean.TRUE);
    }
}
