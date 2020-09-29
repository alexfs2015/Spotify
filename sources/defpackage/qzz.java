package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;

/* renamed from: qzz reason: default package */
public final class qzz implements kjd<MusicPagesModel, qwj>, rae {
    public final FrameLayout a;
    public final qta b;
    private final RecyclerView c = ((RecyclerView) this.a.findViewById(R.id.recycler_view));
    private final qtg d;
    private final qwf e;
    private final qwe f;
    private final qzu g;
    private final qzs h;
    private final qsr i;
    private final raf j;
    private final qzm k;
    private final qzl l;
    private final qwv m;
    private final Context n;
    /* access modifiers changed from: private */
    public MusicPagesModel o;

    public /* synthetic */ void a(int i2) {
        CC.$default$a(this, i2);
    }

    public /* synthetic */ void a(YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z) {
        CC.$default$a(this, yourLibraryTabsCollapseState, z);
    }

    public /* synthetic */ void b() {
        CC.$default$b(this);
    }

    public /* synthetic */ void b(int i2) {
        CC.$default$b((rae) this, i2);
    }

    public /* synthetic */ void c() {
        CC.$default$c(this);
    }

    public /* synthetic */ void c(boolean z) {
        CC.$default$c(this, z);
    }

    public /* synthetic */ void d(boolean z) {
        CC.$default$d(this, z);
    }

    public /* synthetic */ void e(boolean z) {
        CC.$default$e(this, z);
    }

    public qzz(LayoutInflater layoutInflater, ViewGroup viewGroup, MusicPageId musicPageId, Bundle bundle, qtg qtg, qwt qwt, qxx qxx, qxz qxz, qyf qyf, quw quw, qwf qwf, qzj qzj, qzs qzs, qta qta, rac rac, rag rag, qzv qzv, qsr qsr, qwz qwz) {
        LayoutInflater layoutInflater2 = layoutInflater;
        qxx qxx2 = qxx;
        qxz qxz2 = qxz;
        qyf qyf2 = qyf;
        this.d = qtg;
        this.e = qwf;
        this.h = qzs;
        this.b = qta;
        this.i = qsr;
        ViewGroup viewGroup2 = viewGroup;
        this.a = (FrameLayout) layoutInflater.inflate(R.layout.fragment_your_library_music_page_drill_down, viewGroup, false);
        Bundle bundle2 = bundle;
        this.j = rag.a((View) this.a, bundle);
        this.g = qzv.a((qtl<Type, MusicItem>) this.d, this.c);
        this.g.a((qus) quw);
        this.n = layoutInflater.getContext();
        this.c.a((i) new LinearLayoutManager(this.n));
        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) this.a.findViewById(R.id.recycler_view_fast_scroll);
        recyclerViewFastScroller.setVerticalScrollBarEnabled(true);
        recyclerViewFastScroller.a(this.c);
        recyclerViewFastScroller.setEnabled(true);
        this.c.setVerticalScrollBarEnabled(false);
        f(true);
        this.a.addView(qxx2.a);
        this.a.addView(qyf2.a);
        this.a.addView(qxz2.a);
        ViewGroup viewGroup3 = (ViewGroup) this.a.findViewById(R.id.content_container);
        LoadingView a2 = LoadingView.a(layoutInflater, this.n, viewGroup3);
        this.a.addView(a2);
        viewGroup3.setVisibility(4);
        a2.a();
        this.k = new qzm(a2, qxx2, qyf2, qxz2);
        int c2 = gaa.c(this.n);
        ViewGroup viewGroup4 = (ViewGroup) this.a.findViewById(R.id.filter_view_container);
        boolean f2 = this.i.f();
        if (f2) {
            viewGroup4.setVisibility(0);
        }
        MusicPageId musicPageId2 = musicPageId;
        qwv qwv = new qwv(this.a, viewGroup4, qwt.a(musicPageId), qwz, f2);
        this.m = qwv;
        viewGroup4.setPadding(viewGroup4.getPaddingLeft(), c2, viewGroup4.getPaddingRight(), viewGroup4.getPaddingBottom());
        qzl qzl = new qzl((CoordinatorLayout) this.a.findViewById(R.id.header_layout), qzj, rac, viewGroup4, qsr, this.m);
        this.l = qzl;
        this.f = new qwe();
    }

    public final kje<MusicPagesModel> connect(kkn<qwj> kkn) {
        this.d.a(kkn);
        final kje connect = this.g.connect(kkn);
        final kje connect2 = this.k.connect(kkn);
        final kje connect3 = this.h.connect(kkn);
        final kje connect4 = this.l.connect(kkn);
        final kje connect5 = this.b.connect(kkn);
        final kje connect6 = this.m.connect(kkn);
        final kje connect7 = this.j.connect(kkn);
        final kje connect8 = this.f.connect(kkn);
        AnonymousClass1 r1 = new kje<MusicPagesModel>() {
            public final /* synthetic */ void accept(Object obj) {
                MusicPagesModel musicPagesModel = (MusicPagesModel) obj;
                qzz.this.o = musicPagesModel;
                connect.accept(musicPagesModel);
                connect2.accept(musicPagesModel);
                connect3.accept(musicPagesModel);
                connect4.accept(musicPagesModel);
                connect5.accept(musicPagesModel);
                connect6.accept(musicPagesModel);
                connect7.accept(musicPagesModel);
                connect8.accept(musicPagesModel);
            }

            public final void dispose() {
                connect.dispose();
                connect2.dispose();
                connect3.dispose();
                connect4.dispose();
                connect5.dispose();
                connect6.dispose();
                connect7.dispose();
                connect8.dispose();
            }
        };
        return r1;
    }

    public final void a(boolean z) {
        if (z) {
            this.c.f(0);
        } else {
            this.c.d(0);
        }
    }

    public final void a(String str, String str2, String str3) {
        qwf qwf = this.e;
        qwe qwe = this.f;
        qwe.getClass();
        qwf.a(str, str2, str3, new $$Lambda$N13iLK89NZggiFz2JQcSI2cujvE(qwe));
    }

    public final void b(boolean z) {
        if (z) {
            this.m.a();
            f(!this.i.a());
            return;
        }
        this.m.d();
        f(true);
    }

    public final void a() {
        this.m.b();
    }

    private void f(boolean z) {
        this.c.setPadding(0, z ? uts.c(24.0f, this.n.getResources()) : 0, 0, 0);
        this.c.setClipToPadding(false);
    }
}
