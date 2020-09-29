package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.s;
import com.google.common.collect.ImmutableList;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: ubl reason: default package */
public class ubl extends jrd implements jqx, vbw {
    public tza T;
    public ubc a;
    public ubg b;

    public static ubl a(fqn fqn, String str) {
        ubl ubl = new ubl();
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        ubl.g(bundle);
        fqo.a((Fragment) ubl, fqn);
        return ubl;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.b();
        ubc ubc = this.a;
        ubc.f = (ViewGroup) layoutInflater.inflate(R.layout.fragment_tab_list, viewGroup, false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ubc.f.getContext());
        ubc.g = (RecyclerView) ubc.f.findViewById(R.id.list);
        ubc.g.a((i) linearLayoutManager);
        ubc.g.setVisibility(0);
        ubc.g.a((a) ubc.a);
        ubc.h = ubc.b.a(ubc.c, (Context) fbp.a(ubc.f.getContext()), ubc.f);
        ubc.h.setVisibility(8);
        ubc.f.addView(ubc.h);
        ubc.i = LoadingView.a(layoutInflater);
        ubc.f.addView(ubc.i);
        ubc.i.a();
        ubc.d.a(ubc.f.getContext(), ubc.f, (a) ubc.e.get());
        ubc.j = false;
        ubc.k = false;
        return ubc.f;
    }

    public final void a(boolean z) {
        CC.$default$a(this, z);
        if (z) {
            ubc ubc = this.a;
            ubc.k = true;
            ubc.e();
        }
    }

    public final Fragment ae() {
        return this;
    }

    public final sso ae_() {
        return ViewUris.bk;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.YOURLIBRARY_SHOWS, null);
    }

    public final uqm ag() {
        return uqo.E;
    }

    public final gkq aj() {
        return PageIdentifiers.YOURLIBRARY_SHOWS;
    }

    public final void am() {
        ubc ubc = this.a;
        i d = ubc.g.d();
        if (d != null) {
            d.a(ubc.g, (s) null, 0);
        }
    }

    public final String b(Context context) {
        return this.T.b();
    }

    public final String e() {
        return "podcast_following_tab";
    }

    public /* synthetic */ vbu f() {
        return CC.$default$f(this);
    }

    public /* synthetic */ ImmutableList<View> g() {
        return CC.$default$g(this);
    }
}
