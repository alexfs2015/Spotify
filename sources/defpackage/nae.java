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

/* renamed from: nae reason: default package */
public class nae extends jor implements jol, kyf, a, a, udv {
    public foa<Boolean> T;
    public nbk U;
    private b<nba, naw> V;
    public nag a;
    public foa<Boolean> b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "Fullscreen story";
    }

    public static nae a(Bundle bundle) {
        nae nae = new nae();
        nae.g(bundle);
        a.a((Fragment) nae, rju.l);
        return nae;
    }

    public final void ai() {
        q().finish();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nba nba;
        View inflate = layoutInflater.inflate(R.layout.fragment_fullscreen_story, viewGroup, false);
        if (bundle != null) {
            String str = "fullscreen_story_model";
            if (bundle.containsKey(str)) {
                nba = (nba) bundle.getParcelable(str);
                this.V = kjt.a(this.a.a(), nba, kkd.a());
                return inflate;
            }
        }
        nba = nba.i;
        this.V = kjt.a(this.a.a(), nba, kkd.a());
        return inflate;
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        this.V.a(this.U);
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("fullscreen_story_model", (nba) this.V.e());
    }

    public final void z() {
        super.z();
        this.V.c();
        this.T.accept(Boolean.TRUE);
    }

    public final void A() {
        this.T.accept(Boolean.FALSE);
        this.V.d();
        super.A();
    }

    public final void ax_() {
        this.V.b();
        super.ax_();
    }

    public boolean onBackPressed() {
        this.b.accept(Boolean.TRUE);
        return true;
    }

    public final sih ae_() {
        return ViewUris.g;
    }

    public final gjf aj() {
        return PageIdentifiers.FULLSCREEN_STORY;
    }

    public final udr ag() {
        return udt.af;
    }

    public final View ah() {
        return (View) fay.a(this.H);
    }

    public final String e() {
        return udt.af.a();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.FULLSCREEN_STORY, ViewUris.g.toString());
    }
}
