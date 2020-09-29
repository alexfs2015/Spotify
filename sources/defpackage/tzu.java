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

/* renamed from: tzu reason: default package */
public class tzu extends jrd implements jqx, tzf, vbw {
    public tza T;
    public sgb U;
    private ViewLoadingTracker V;
    public tzk a;
    public tzd b;

    public static tzu a(fqn fqn, String str) {
        tzu tzu = new tzu();
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        tzu.g(bundle);
        fqo.a((Fragment) tzu, fqn);
        return tzu;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.d();
        View a2 = this.a.a(layoutInflater, viewGroup, bundle);
        this.V = this.U.a(a2, ViewUris.bm.toString(), bundle, rmf.a(PageIdentifiers.YOURLIBRARY_DOWNLOADS, null));
        return a2;
    }

    public final void a() {
        this.V.e();
    }

    public /* synthetic */ void a(boolean z) {
        CC.$default$a(this, z);
    }

    public final Fragment ae() {
        return this;
    }

    public final sso ae_() {
        return ViewUris.bm;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.YOURLIBRARY_DOWNLOADS, null);
    }

    public final uqm ag() {
        return uqo.C;
    }

    public final gkq aj() {
        return PageIdentifiers.YOURLIBRARY_DOWNLOADS;
    }

    public final void am() {
        this.a.a();
    }

    public final String b(Context context) {
        return this.T.b();
    }

    public final void b() {
        this.V.b();
    }

    public final String e() {
        return "podcast_downloads_tab";
    }

    public final void e(Bundle bundle) {
        this.a.a(bundle);
        super.e(bundle);
    }

    public /* synthetic */ vbu f() {
        return CC.$default$f(this);
    }

    public /* synthetic */ ImmutableList<View> g() {
        return CC.$default$g(this);
    }
}
