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

/* renamed from: uak reason: default package */
public class uak extends jrd implements jqx, tzf, vbw {
    public tza T;
    public sgb U;
    private ViewLoadingTracker V;
    private View W;
    public tzk a;
    public tzd b;

    public static uak a(fqn fqn, String str) {
        uak uak = new uak();
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        uak.g(bundle);
        fqo.a((Fragment) uak, fqn);
        return uak;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.d();
        this.W = this.a.a(layoutInflater, viewGroup, bundle);
        this.V = this.U.a(this.W, ViewUris.bl.toString(), bundle, rmf.a(PageIdentifiers.YOURLIBRARY_EPISODES, null));
        this.a.b();
        return this.W;
    }

    public final void a() {
        this.V.e();
    }

    public final void a(boolean z) {
        CC.$default$a(this, z);
        if (z) {
            this.a.g();
        }
    }

    public final Fragment ae() {
        return this;
    }

    public final sso ae_() {
        return ViewUris.bl;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.YOURLIBRARY_EPISODES, null);
    }

    public final uqm ag() {
        return uqo.D;
    }

    public final gkq aj() {
        return PageIdentifiers.YOURLIBRARY_EPISODES;
    }

    public final void am() {
        this.a.a();
    }

    public final String b(Context context) {
        return this.T.b();
    }

    public final void b() {
        this.V.b();
        this.a.h();
    }

    public final String e() {
        return "podcast_episodes_tab";
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
