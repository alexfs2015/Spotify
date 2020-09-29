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
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.b;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;

/* renamed from: riv reason: default package */
public final class riv implements kmm<MusicPagesModel, rey>, rja {
    public final FrameLayout a;
    public final rbp b;
    private final RecyclerView c;
    private final ViewGroup d;
    private final rbv e;
    private final reu f;
    private final ret g = new ret();
    private final rbg h;
    private final rfk i;
    private final Context j;
    private final ImmutableList<kmm<MusicPagesModel, rey>> k;
    private boolean l;
    /* access modifiers changed from: private */
    public MusicPagesModel m;

    public riv(LayoutInflater layoutInflater, ViewGroup viewGroup, MusicPageId musicPageId, Bundle bundle, rbv rbv, rfi rfi, rgm rgm, rgo rgo, rgu rgu, rdl rdl, reu reu, rif rif, rio rio, rbp rbp, riy riy, rjc rjc, rir rir, rbg rbg, rfo rfo, a aVar) {
        int i2;
        LayoutInflater layoutInflater2 = layoutInflater;
        MusicPageId musicPageId2 = musicPageId;
        rgm rgm2 = rgm;
        rgo rgo2 = rgo;
        rgu rgu2 = rgu;
        a g2 = ImmutableList.g();
        this.e = rbv;
        this.f = reu;
        this.h = rbg;
        this.b = rbp;
        g2.c(this.b);
        g2.c(rio);
        g2.c(this.g);
        ViewGroup viewGroup2 = viewGroup;
        this.a = (FrameLayout) layoutInflater.inflate(R.layout.fragment_your_library_music_page_drill_down, viewGroup, false);
        g2.c(rjc.a((View) this.a, bundle));
        this.c = (RecyclerView) this.a.findViewById(R.id.recycler_view);
        riq a2 = rir.a((rca<Type, MusicItem>) this.e, this.c);
        a2.a((rdh) rdl);
        g2.c(a2);
        this.j = layoutInflater.getContext();
        this.c.a((i) new LinearLayoutManager(this.j));
        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) this.a.findViewById(R.id.recycler_view_fast_scroll);
        boolean z = true;
        recyclerViewFastScroller.setVerticalScrollBarEnabled(true);
        recyclerViewFastScroller.a(this.c);
        recyclerViewFastScroller.setEnabled(true);
        this.c.setVerticalScrollBarEnabled(false);
        f(true);
        this.a.addView(rgm2.a);
        this.a.addView(rgu2.a);
        this.a.addView(rgo2.a);
        ViewGroup viewGroup3 = (ViewGroup) this.a.findViewById(R.id.content_container);
        LoadingView a3 = LoadingView.a(layoutInflater, this.j, viewGroup3);
        this.a.addView(a3);
        viewGroup3.setVisibility(4);
        a3.a();
        g2.c(new rii(a3, rgm2, rgu2, rgo2));
        boolean z2 = musicPageId2 == MusicPageId.SONGS && this.h.f();
        this.d = (ViewGroup) this.a.findViewById(R.id.filter_view_container);
        rfk rfk = new rfk(this.a, this.d, rfi.a(musicPageId), rfo, z2);
        this.i = rfk;
        g2.c(this.i);
        if (musicPageId2 != MusicPageId.SONGS) {
            z = false;
        }
        if (z) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.a.findViewById(R.id.header_layout);
            rih rih = new rih(coordinatorLayout, rif, riy, this.d, rbg, aVar);
            g2.c(rih);
            if (z2) {
                AppBarLayout appBarLayout = (AppBarLayout) coordinatorLayout.findViewById(R.id.header_view);
                i2 = vgl.c(this.a.getContext(), R.attr.actionBarSize);
                this.d.setVisibility(0);
                appBarLayout.a((b) new $$Lambda$riv$mOXzo5FMN5Ih_AOhQMYYEc1C53Y(this, appBarLayout));
            } else {
                i2 = gau.c(this.j);
            }
            ViewGroup viewGroup4 = this.d;
            viewGroup4.setPadding(viewGroup4.getPaddingLeft(), i2, this.d.getPaddingRight(), this.d.getPaddingBottom());
        }
        this.k = g2.a();
        DebugFlag debugFlag = DebugFlag.YOUR_LIBRARY_MUSIC_PAGES_ENABLE_DEBUG_OVERLAY;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AppBarLayout appBarLayout, AppBarLayout appBarLayout2, int i2) {
        boolean z = appBarLayout.getVisibility() == 0;
        if (!this.l && z) {
            int measuredHeight = this.d.getMeasuredHeight() - this.d.getPaddingTop();
            this.d.setAlpha(Math.max(0.0f, ((float) (measuredHeight + i2)) / ((float) measuredHeight)));
            this.d.setTop(i2);
        }
    }

    private void f(boolean z) {
        this.c.setPadding(0, vfj.c((float) ((z ? 24 : 0) + (this.h.d.a() ? 16 : 0)), this.j.getResources()), 0, 0);
        this.c.setClipToPadding(false);
    }

    public final void a() {
        this.i.b();
    }

    public /* synthetic */ void a(int i2) {
        CC.$default$a(this, i2);
    }

    public /* synthetic */ void a(YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z) {
        CC.$default$a(this, yourLibraryTabsCollapseState, z);
    }

    public final void a(String str, String str2, String str3) {
        reu reu = this.f;
        ret ret = this.g;
        ret.getClass();
        reu.a(str, str2, str3, new $$Lambda$BIOgpVqg8sTrHYW69seZJlkL7yk(ret));
    }

    public final void a(boolean z) {
        if (z) {
            this.c.f(0);
        } else {
            this.c.d(0);
        }
    }

    public /* synthetic */ void b() {
        CC.$default$b(this);
    }

    public /* synthetic */ void b(int i2) {
        CC.$default$b((rja) this, i2);
    }

    public final void b(boolean z) {
        this.l = z;
        if (z) {
            this.i.a();
            f(!this.h.a());
            this.d.setTop(0);
            this.d.setAlpha(1.0f);
            return;
        }
        this.i.d();
        f(true);
    }

    public /* synthetic */ void c() {
        CC.$default$c(this);
    }

    public /* synthetic */ void c(boolean z) {
        CC.$default$c(this, z);
    }

    public final kmn<MusicPagesModel> connect(knw<rey> knw) {
        this.e.a(knw);
        a g2 = ImmutableList.g();
        fdz R_ = this.k.R_();
        while (R_.hasNext()) {
            g2.c(((kmm) R_.next()).connect(knw));
        }
        final ImmutableList b2 = g2.a();
        return new kmn<MusicPagesModel>() {
            public final /* synthetic */ void accept(Object obj) {
                MusicPagesModel musicPagesModel = (MusicPagesModel) obj;
                riv.this.m = musicPagesModel;
                fdz R_ = b2.R_();
                while (R_.hasNext()) {
                    ((kmn) R_.next()).accept(musicPagesModel);
                }
            }

            public final void dispose() {
                fdz R_ = b2.R_();
                while (R_.hasNext()) {
                    ((kmn) R_.next()).dispose();
                }
            }
        };
    }

    public /* synthetic */ void d(boolean z) {
        CC.$default$d(this, z);
    }

    public /* synthetic */ void e(boolean z) {
        CC.$default$e(this, z);
    }
}
