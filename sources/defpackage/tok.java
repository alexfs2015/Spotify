package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.collect.ImmutableList;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: tok reason: default package */
public class tok extends jor implements jol, tng, uqr {
    public tnb T;
    public rwr U;
    private ViewLoadingTracker V;
    private View W;
    public tnl a;
    public tne b;

    public /* synthetic */ uqp aR_() {
        return CC.$default$aR_(this);
    }

    public final Fragment ae() {
        return this;
    }

    public final String e() {
        return "podcast_episodes_tab";
    }

    public /* synthetic */ ImmutableList<View> f() {
        return CC.$default$f(this);
    }

    public static tok a(fpt fpt, String str) {
        tok tok = new tok();
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        tok.g(bundle);
        fpu.a((Fragment) tok, fpt);
        return tok;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.W = this.a.a(layoutInflater, viewGroup, bundle);
        this.V = this.U.a(this.W, ViewUris.bm.toString(), bundle, rdh.a(PageIdentifiers.YOURLIBRARY_EPISODES, null));
        this.a.b();
        return this.W;
    }

    public final void e(Bundle bundle) {
        this.a.a(bundle);
        super.e(bundle);
    }

    public final String b(Context context) {
        return this.T.b();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.YOURLIBRARY_EPISODES, null);
    }

    public final sih ae_() {
        return ViewUris.bm;
    }

    public final udr ag() {
        return udt.D;
    }

    public final gjf aj() {
        return PageIdentifiers.YOURLIBRARY_EPISODES;
    }

    public final void g() {
        super.g();
        this.b.a();
    }

    public final void h() {
        super.h();
        this.b.a.a();
    }

    public final void a(boolean z) {
        CC.$default$a(this, z);
        if (z) {
            this.a.g();
        }
    }

    public final void am() {
        this.a.a();
    }

    public final void a() {
        this.V.e();
    }

    public final void b() {
        this.V.b();
        this.a.h();
    }
}
