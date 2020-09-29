package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.f;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.m;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import io.doist.recyclerviewext.sticky_headers.StickyHeadersLinearLayoutManager;
import java.util.List;

/* renamed from: pek reason: default package */
public final class pek implements pej {
    private final ugx a;
    private final wzi<fyh> b;
    private fyh c;
    private AppBarLayout d;
    private CoordinatorLayout e;
    private RecyclerView f;
    private LoadingView g;
    private fvh h;
    private Parcelable i;

    public pek(ugx ugx, wzi<fyh> wzi) {
        this.a = ugx;
        this.b = wzi;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(float f2) {
        this.c.a(f2);
    }

    public final View a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_podcast_entity_v3, viewGroup, false);
        this.c = (fyh) this.b.get();
        this.c.a(0.0f);
        this.e = (CoordinatorLayout) inflate.findViewById(R.id.coordinator_layout);
        this.d = (AppBarLayout) inflate.findViewById(R.id.header_view);
        this.f = (RecyclerView) inflate.findViewById(R.id.recycler_view);
        AppBarLayout appBarLayout = this.d;
        appBarLayout.setPadding(0, appBarLayout.getPaddingTop() + gau.a(context.getResources()), 0, 0);
        RecyclerView recyclerView = this.f;
        recyclerView.a((i) new StickyHeadersLinearLayoutManager(context));
        nz nzVar = new nz();
        nzVar.k = false;
        recyclerView.a((f) nzVar);
        recyclerView.a((h) new a(), -1);
        recyclerView.setVisibility(0);
        this.f.a((a) this.a);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.header_holder);
        fqv.f();
        fvd a2 = fvg.a(context, viewGroup2);
        a2.a((CharSequence) context.getString(R.string.show_failed_to_load_title));
        a2.a().a((Drawable) new SpotifyIconDrawable(context, SpotifyIcon.WARNING_32));
        a2.getView().setVisibility(8);
        a2.getView().setId(R.id.empty);
        this.h = a2;
        CoordinatorLayout coordinatorLayout = this.e;
        LoadingView a3 = LoadingView.a(layoutInflater);
        a3.b = 0;
        a3.a = new lce(context, coordinatorLayout);
        this.g = a3;
        viewGroup2.addView(this.h.getView(), new LayoutParams(-1, -1));
        viewGroup2.addView(this.g, new LayoutParams(-1, -1));
        return inflate;
    }

    public final AppBarLayout a() {
        return this.d;
    }

    public final void a(Bundle bundle) {
        if (bundle != null) {
            this.i = bundle.getParcelable("layout_manager_state");
        }
    }

    public final void a(itd itd) {
        this.f.a((m) itd);
    }

    public final void a(String str) {
        this.c.a(str);
    }

    public final void a(String str, int i2) {
        this.a.a(str, i2);
    }

    public final void a(String str, boolean z) {
        this.a.a(str, z);
    }

    public final void a(pfq pfq) {
        pfq.a((pfj) new $$Lambda$pek$NNbgNttxnkOrVufr6Wrh1YRPdBs(this));
    }

    public final void a(ugu ugu) {
        this.a.a(ugu);
    }

    public final void b() {
        RecyclerView recyclerView = this.f;
        ugx ugx = this.a;
        ugx.getClass();
        recyclerView.post(new $$Lambda$BjjlY4ywGAn45eDBNhPg331472E(ugx));
    }

    public final void b(Bundle bundle) {
        RecyclerView recyclerView = this.f;
        if (recyclerView != null) {
            i d2 = recyclerView.d();
            if (d2 != null) {
                bundle.putParcelable("layout_manager_state", d2.d());
            }
        }
    }

    public final void b(String str) {
        int a2 = this.a.a(str);
        if (a2 >= 0) {
            this.f.d(a2);
        }
    }

    public final void c() {
        ugx ugx = this.a;
        Class<a> cls = a.class;
        List a2 = ugx.f.a();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= a2.size()) {
                List c2 = ugx.f.c();
                while (true) {
                    if (i2 >= c2.size()) {
                        i3 = -1;
                        break;
                    } else if (((ugt) c2.get(i2)).getClass() == cls) {
                        i3 = i2 + ugx.f.a().size() + ugx.f.b().length;
                        break;
                    } else {
                        i2++;
                    }
                }
            } else if (((ugt) a2.get(i3)).getClass() == cls) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            this.f.d(i3);
        }
    }

    public final void d() {
        this.d.a(false, false, true);
    }

    public final void e() {
        RecyclerView recyclerView = this.f;
        if (recyclerView != null && this.i != null) {
            i d2 = recyclerView.d();
            if (d2 != null) {
                d2.a(this.i);
                this.i = null;
            }
        }
    }

    public final void f() {
        this.g.a();
    }

    public final void g() {
        if (this.g.d()) {
            this.g.b();
        }
    }

    public final void h() {
        g();
        this.e.setVisibility(8);
        this.h.getView().setVisibility(0);
    }

    public final void i() {
        this.d.a(true, true, true);
    }
}
