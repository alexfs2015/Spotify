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

/* renamed from: tpi reason: default package */
public class tpi extends jor implements jol, uqr {
    public tnb T;
    public toz a;
    public tpd b;

    public /* synthetic */ uqp aR_() {
        return CC.$default$aR_(this);
    }

    public final Fragment ae() {
        return this;
    }

    public final String e() {
        return "podcast_following_tab";
    }

    public /* synthetic */ ImmutableList<View> f() {
        return CC.$default$f(this);
    }

    public static tpi a(fpt fpt, String str) {
        tpi tpi = new tpi();
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        tpi.g(bundle);
        fpu.a((Fragment) tpi, fpt);
        return tpi;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.b();
        toz toz = this.a;
        toz.f = (ViewGroup) layoutInflater.inflate(R.layout.fragment_tab_list, viewGroup, false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(toz.f.getContext());
        toz.g = (RecyclerView) toz.f.findViewById(R.id.list);
        toz.g.a((i) linearLayoutManager);
        toz.g.setVisibility(0);
        toz.g.a((a) toz.a);
        toz.h = toz.b.a(toz.c, (Context) fay.a(toz.f.getContext()), toz.f);
        toz.h.setVisibility(8);
        toz.f.addView(toz.h);
        toz.i = LoadingView.a(layoutInflater);
        toz.f.addView(toz.i);
        toz.i.a();
        toz.d.a(toz.f.getContext(), toz.f, (a) toz.e.get());
        toz.j = false;
        toz.k = false;
        return toz.f;
    }

    public final String b(Context context) {
        return this.T.b();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.YOURLIBRARY_SHOWS, null);
    }

    public final sih ae_() {
        return ViewUris.bl;
    }

    public final udr ag() {
        return udt.E;
    }

    public final gjf aj() {
        return PageIdentifiers.YOURLIBRARY_SHOWS;
    }

    public final void a(boolean z) {
        CC.$default$a(this, z);
        if (z) {
            toz toz = this.a;
            toz.k = true;
            toz.e();
        }
    }

    public final void am() {
        toz toz = this.a;
        i d = toz.g.d();
        if (d != null) {
            d.a(toz.g, (s) null, 0);
        }
    }
}
