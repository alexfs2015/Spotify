package com.spotify.music.podcast.freetierlikes.tabs;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.f;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.m;
import androidx.recyclerview.widget.RecyclerView.s;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import java.util.ArrayList;

public final class TabsEpisodeListViewBinderImpl implements tzk {
    private final ugx a;
    private final tzg b;
    private final tza c;
    private final txa d;
    private final who<a> e;
    private final krv f;
    private final sih g;
    private RecyclerView h;
    private LoadingView i;
    private View j;
    private Bundle k;
    private final boolean l;
    private boolean m;
    private boolean n;
    private AnchorImpression o;

    enum AnchorImpression {
        EMPTY_VIEW,
        LINK
    }

    public TabsEpisodeListViewBinderImpl(ugx ugx, tzg tzg, tza tza, txa txa, who<a> who, krv krv, boolean z, sih sih) {
        this.b = tzg;
        this.c = tza;
        this.d = txa;
        this.e = who;
        this.a = ugx;
        this.f = krv;
        this.l = z;
        this.g = sih;
    }

    private boolean i() {
        return this.l && this.c.a() == YourLibraryPageId.PODCAST_EPISODES;
    }

    private void j() {
        if (this.m && this.n && i()) {
            if (this.j.getVisibility() == 0) {
                if (this.o != AnchorImpression.EMPTY_VIEW) {
                    this.o = AnchorImpression.EMPTY_VIEW;
                    this.f.b();
                }
            } else if (this.o != AnchorImpression.LINK) {
                this.o = AnchorImpression.LINK;
                this.f.a();
            }
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_tab_list, viewGroup, false);
        this.k = bundle;
        this.h = (RecyclerView) inflate.findViewById(R.id.list);
        Context context = inflate.getContext();
        RecyclerView recyclerView = this.h;
        recyclerView.a((i) new LinearLayoutManager(context));
        nz nzVar = new nz();
        nzVar.k = false;
        recyclerView.a((f) nzVar);
        recyclerView.setVisibility(0);
        this.h.a((a) this.a);
        this.h.a((m) this.g);
        ViewGroup viewGroup2 = (ViewGroup) this.h.getParent();
        ViewGroup viewGroup3 = (ViewGroup) inflate;
        this.i = LoadingView.a(layoutInflater);
        viewGroup3.addView(this.i);
        if (this.a.g.isEmpty()) {
            this.i.a();
        }
        Context context2 = viewGroup2.getContext();
        if (context2 != null) {
            this.j = this.b.a(this.c, context2, viewGroup2);
            this.j.setVisibility(8);
            viewGroup2.addView(this.j);
        }
        this.d.a(viewGroup2.getContext(), viewGroup2, (a) this.e.get());
        this.m = false;
        this.n = false;
        this.o = null;
        return inflate;
    }

    public final void a() {
        i d2 = this.h.d();
        if (d2 != null) {
            d2.a(this.h, (s) null, 0);
        }
    }

    public final void a(Bundle bundle) {
        RecyclerView recyclerView = this.h;
        if (recyclerView != null && recyclerView.d() != null) {
            bundle.putParcelable("recycler_view_layout_manager_state", ((i) fbp.a(this.h.d())).d());
        }
    }

    public final void a(String str, int i2) {
        this.a.a(str, i2);
    }

    public final void a(String str, boolean z) {
        this.a.a(str, z);
    }

    public final void a(vkv[] vkvArr) {
        ugx ugx = this.a;
        ugu ugu = new ugu();
        if (i()) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new a());
            ugu.a = arrayList;
        }
        ugu.b = vkvArr;
        ugx.a(ugu);
    }

    public final void b() {
        ugx ugx = this.a;
        ugx.d.a(true);
        ugx.e.a(true);
        ugx.e();
    }

    public final void c() {
        this.i.c();
        this.i.a();
    }

    public final void d() {
        LoadingView loadingView = this.i;
        if (loadingView != null && loadingView.d()) {
            this.i.b();
        }
    }

    public final void e() {
        this.j.setVisibility(0);
        this.h.setVisibility(8);
        ugx ugx = this.a;
        ugx.g.clear();
        ugx.f = null;
        ugx.e();
    }

    public final void f() {
        this.j.setVisibility(8);
        this.h.setVisibility(0);
        i d2 = this.h.d();
        Bundle bundle = this.k;
        if (bundle != null && d2 != null) {
            d2.a(bundle.getParcelable("recycler_view_layout_manager_state"));
            this.k = null;
        }
    }

    public final void g() {
        this.m = true;
        this.o = null;
        j();
    }

    public final void h() {
        this.n = true;
        j();
    }
}
