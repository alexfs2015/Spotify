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
import androidx.recyclerview.widget.RecyclerView.s;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import java.util.ArrayList;

public final class TabsEpisodeListViewBinderImpl implements tnl {
    private final tuu a;
    private final tnh b;
    private final tnb c;
    private final tli d;
    private final vti<a> e;
    private final kom f;
    private RecyclerView g;
    private LoadingView h;
    private View i;
    private Bundle j;
    private final boolean k;
    private boolean l;
    private boolean m;
    private AnchorImpression n;

    enum AnchorImpression {
        EMPTY_VIEW,
        LINK
    }

    public TabsEpisodeListViewBinderImpl(tuu tuu, tnh tnh, tnb tnb, tli tli, vti<a> vti, kom kom, boolean z) {
        this.b = tnh;
        this.c = tnb;
        this.d = tli;
        this.e = vti;
        this.a = tuu;
        this.f = kom;
        this.k = z;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_tab_list, viewGroup, false);
        this.j = bundle;
        this.g = (RecyclerView) inflate.findViewById(R.id.list);
        Context context = inflate.getContext();
        RecyclerView recyclerView = this.g;
        recyclerView.a((i) new LinearLayoutManager(context));
        nu nuVar = new nu();
        nuVar.k = false;
        recyclerView.a((f) nuVar);
        recyclerView.setVisibility(0);
        this.g.a((a) this.a);
        ViewGroup viewGroup2 = (ViewGroup) this.g.getParent();
        ViewGroup viewGroup3 = (ViewGroup) inflate;
        this.h = LoadingView.a(layoutInflater);
        viewGroup3.addView(this.h);
        if (this.a.h.isEmpty()) {
            this.h.a();
        }
        Context context2 = viewGroup2.getContext();
        if (context2 != null) {
            this.i = this.b.a(this.c, context2, viewGroup2);
            this.i.setVisibility(8);
            viewGroup2.addView(this.i);
        }
        this.d.a(viewGroup2.getContext(), viewGroup2, (a) this.e.get());
        this.l = false;
        this.m = false;
        this.n = null;
        return inflate;
    }

    public final void a(uys[] uysArr) {
        tuu tuu = this.a;
        tur tur = new tur();
        if (i()) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new a());
            tur.a = arrayList;
        }
        tur.b = uysArr;
        tuu.a(tur);
    }

    public final void c() {
        this.h.c();
        this.h.a();
    }

    public final void d() {
        LoadingView loadingView = this.h;
        if (loadingView != null && loadingView.d()) {
            this.h.b();
        }
    }

    public final void a(String str, boolean z) {
        this.a.a(str, z);
    }

    public final void g() {
        this.l = true;
        this.n = null;
        j();
    }

    public final void h() {
        this.m = true;
        j();
    }

    public final void e() {
        this.i.setVisibility(0);
        this.g.setVisibility(8);
        tuu tuu = this.a;
        tuu.h.clear();
        tuu.g = null;
        tuu.e();
    }

    public final void f() {
        this.i.setVisibility(8);
        this.g.setVisibility(0);
        i d2 = this.g.d();
        Bundle bundle = this.j;
        if (bundle != null && d2 != null) {
            d2.a(bundle.getParcelable("recycler_view_layout_manager_state"));
            this.j = null;
        }
    }

    public final void a() {
        i d2 = this.g.d();
        if (d2 != null) {
            d2.a(this.g, (s) null, 0);
        }
    }

    public final void b() {
        tuu tuu = this.a;
        tuu.d.a(true);
        tuu.e.a(true);
        tuu.e();
    }

    public final void a(Bundle bundle) {
        RecyclerView recyclerView = this.g;
        if (recyclerView != null && recyclerView.d() != null) {
            bundle.putParcelable("recycler_view_layout_manager_state", ((i) fay.a(this.g.d())).d());
        }
    }

    private boolean i() {
        return this.k && this.c.a() == YourLibraryPageId.PODCAST_EPISODES;
    }

    private void j() {
        if (this.l && this.m && i()) {
            if (this.i.getVisibility() == 0) {
                if (this.n != AnchorImpression.EMPTY_VIEW) {
                    this.n = AnchorImpression.EMPTY_VIEW;
                    this.f.b();
                }
            } else if (this.n != AnchorImpression.LINK) {
                this.n = AnchorImpression.LINK;
                this.f.a();
            }
        }
    }
}
