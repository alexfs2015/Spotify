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

/* renamed from: tnu reason: default package */
public class tnu extends jor implements jol, tng, uqr {
    public tnb T;
    public rwr U;
    private ViewLoadingTracker V;
    public tnl a;
    public tne b;

    public /* synthetic */ void a(boolean z) {
        CC.$default$a(this, z);
    }

    public /* synthetic */ uqp aR_() {
        return CC.$default$aR_(this);
    }

    public final Fragment ae() {
        return this;
    }

    public final String e() {
        return "podcast_downloads_tab";
    }

    public /* synthetic */ ImmutableList<View> f() {
        return CC.$default$f(this);
    }

    public static tnu a(fpt fpt, String str) {
        tnu tnu = new tnu();
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        tnu.g(bundle);
        fpu.a((Fragment) tnu, fpt);
        return tnu;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = this.a.a(layoutInflater, viewGroup, bundle);
        this.V = this.U.a(a2, ViewUris.bn.toString(), bundle, rdh.a(PageIdentifiers.YOURLIBRARY_DOWNLOADS, null));
        return a2;
    }

    public final void e(Bundle bundle) {
        this.a.a(bundle);
        super.e(bundle);
    }

    public final void g() {
        super.g();
        this.b.a();
    }

    public final void h() {
        super.h();
        this.b.a.a();
    }

    public final String b(Context context) {
        return this.T.b();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.YOURLIBRARY_DOWNLOADS, null);
    }

    public final sih ae_() {
        return ViewUris.bn;
    }

    public final udr ag() {
        return udt.C;
    }

    public final gjf aj() {
        return PageIdentifiers.YOURLIBRARY_DOWNLOADS;
    }

    public final void am() {
        this.a.a();
    }

    public final void a() {
        this.V.e();
    }

    public final void b() {
        this.V.b();
    }
}
