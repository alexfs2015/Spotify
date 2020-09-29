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
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;

/* renamed from: pdz reason: default package */
public class pdz extends jrd implements c, d, fzq, jqx, jwn<vml>, uqq {
    private ViewLoadingTracker T;
    public sgb a;
    public pec b;

    public static pdz a(String str, fqn fqn) {
        Bundle bundle = new Bundle();
        bundle.putString("uri", str);
        pdz pdz = new pdz();
        pdz.g(bundle);
        fqo.a((Fragment) pdz, fqn);
        return pdz;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = this.b.a(layoutInflater, (Context) fbp.a(n()), viewGroup);
        this.T = this.a.a(a2, ae_().toString(), bundle, rmf.a(PageIdentifiers.SHOWS_AUDIO, null));
        return a2;
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzv.a(this, menu);
    }

    public final void a(fzn fzn) {
        this.b.a(fzn);
    }

    public final /* synthetic */ void a(Object obj) {
        vml vml = (vml) obj;
        c(true);
        this.b.a(vml, (Context) fbp.a(p()));
        this.T.b();
    }

    public final void a(String str) {
        c(false);
        this.b.a(str);
        this.T.e();
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return sso.a((String) fbp.a(((Bundle) fbp.a(this.i)).getString("uri")));
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.SHOWS_AUDIO, null);
    }

    public final uqm ag() {
        return uqo.aR;
    }

    public final gkq aj() {
        return PageIdentifiers.SHOWS_AUDIO;
    }

    public final void aw_() {
        super.aw_();
        this.T.e();
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return "show";
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.T.a(bundle);
    }
}
