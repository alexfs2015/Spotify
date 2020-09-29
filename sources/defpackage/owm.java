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

/* renamed from: owm reason: default package */
public class owm extends jor implements c, d, fyw, jol, juf<uzx>, udv {
    private ViewLoadingTracker T;
    public rwr a;
    public owp b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return "show";
    }

    public final /* synthetic */ void a(Object obj) {
        uzx uzx = (uzx) obj;
        c(true);
        this.b.a(uzx, (Context) fay.a(p()));
        this.T.b();
    }

    public static owm a(String str, fpt fpt) {
        Bundle bundle = new Bundle();
        bundle.putString("uri", str);
        owm owm = new owm();
        owm.g(bundle);
        fpu.a((Fragment) owm, fpt);
        return owm;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = this.b.a(layoutInflater, (Context) fay.a(n()), viewGroup);
        this.T = this.a.a(a2, ae_().toString(), bundle, rdh.a(PageIdentifiers.SHOWS_AUDIO, null));
        return a2;
    }

    public final void a(String str) {
        c(false);
        this.b.a(str);
        this.T.e();
    }

    public final gjf aj() {
        return PageIdentifiers.SHOWS_AUDIO;
    }

    public final void ax_() {
        super.ax_();
        this.T.e();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.T.a(bundle);
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzb.a(this, menu);
    }

    public final void a(fyt fyt) {
        this.b.a(fyt);
    }

    public final udr ag() {
        return udt.aR;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.SHOWS_AUDIO, null);
    }

    public final sih ae_() {
        return sih.a((String) fay.a(((Bundle) fay.a(this.i)).getString("uri")));
    }
}
