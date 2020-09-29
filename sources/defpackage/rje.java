package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.LoadingState;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import com.spotify.music.features.yourlibrary.musicpages.view.PulldownContainer;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;

/* renamed from: rje reason: default package */
public final class rje implements kmm<MusicPagesModel, rey>, rja {
    public final FrameLayout a;
    public final rbp b;
    private final RecyclerView c;
    private final rbx d;
    private final rfk e;
    private final riq f;
    private final rii g;
    private final rio h;
    /* access modifiers changed from: private */
    public final vbu i;
    private final rjb j;
    private final FrameLayout k;
    private final PulldownContainer l;
    private int m = -1;
    /* access modifiers changed from: private */
    public MusicPagesModel n;

    public rje(LayoutInflater layoutInflater, ViewGroup viewGroup, MusicPageId musicPageId, Bundle bundle, rbx rbx, rfi rfi, rgm rgm, rgo rgo, rgu rgu, rdl rdl, res res, rbp rbp, rio rio, rjc rjc, rir rir, rfo rfo, rbg rbg) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        rgm rgm2 = rgm;
        rgo rgo2 = rgo;
        rgu rgu2 = rgu;
        this.d = rbx;
        this.b = rbp;
        this.h = rio;
        this.i = (vbu) res.getDelegate().d();
        if (rbg.e()) {
            this.a = (FrameLayout) layoutInflater.inflate(R.layout.fragment_your_library_music_page_pulldown, viewGroup, false);
            this.l = (PulldownContainer) this.a.findViewById(R.id.pulldown_container);
        } else {
            this.a = (FrameLayout) layoutInflater.inflate(R.layout.fragment_your_library_music_page, viewGroup, false);
            this.l = null;
        }
        Bundle bundle2 = bundle;
        this.j = rjc.a((View) this.a, bundle);
        this.c = (RecyclerView) this.a.findViewById(R.id.recycler_view);
        this.f = rir.a((rca<Type, MusicItem>) this.d, this.c);
        this.f.a((rdh) rdl);
        Context context = layoutInflater.getContext();
        this.c.a((i) new LinearLayoutManager(context));
        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) this.a.findViewById(R.id.recycler_view_fast_scroll);
        recyclerViewFastScroller.setVerticalScrollBarEnabled(true);
        recyclerViewFastScroller.a(this.c);
        recyclerViewFastScroller.setEnabled(true);
        this.c.setVerticalScrollBarEnabled(false);
        this.k = (FrameLayout) this.a.findViewById(R.id.centered_views);
        this.k.addView(rgm2.a);
        this.k.addView(rgu2.a);
        this.k.addView(rgo2.a);
        ViewGroup viewGroup3 = (ViewGroup) this.a.findViewById(R.id.content_container);
        LoadingView a2 = LoadingView.a(layoutInflater, context, viewGroup3);
        this.k.addView(a2);
        viewGroup3.setVisibility(4);
        this.g = new rii(a2, rgm2, rgu2, rgo2);
        MusicPageId musicPageId2 = musicPageId;
        rfk rfk = new rfk(viewGroup3, (ViewGroup) this.a.findViewById(R.id.filter_view_container), rfi.a(musicPageId), rfo, rbg.e());
        this.e = rfk;
        DebugFlag debugFlag = DebugFlag.YOUR_LIBRARY_MUSIC_PAGES_ENABLE_DEBUG_OVERLAY;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004a, code lost:
        if ((r6.c.getHeight() - ((androidx.recyclerview.widget.RecyclerView.u) defpackage.fbp.a(r6.c.a(r1, false))).o.getBottom()) > r6.m) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void d() {
        /*
            r6 = this;
            vbu r0 = r6.i
            androidx.recyclerview.widget.RecyclerView r1 = r6.c
            androidx.recyclerview.widget.RecyclerView$a r1 = r1.c()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x004d
            int r1 = r1.b()
            if (r1 != 0) goto L_0x0014
        L_0x0012:
            r2 = 1
            goto L_0x004d
        L_0x0014:
            androidx.recyclerview.widget.RecyclerView r4 = r6.c
            androidx.recyclerview.widget.RecyclerView$i r4 = r4.d()
            androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
            java.lang.Object r4 = defpackage.fbp.a(r4)
            androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
            int r5 = r4.k()
            if (r5 != 0) goto L_0x004d
            int r4 = r4.m()
            int r1 = r1 - r3
            if (r4 != r1) goto L_0x004d
            androidx.recyclerview.widget.RecyclerView r4 = r6.c
            androidx.recyclerview.widget.RecyclerView$u r1 = r4.a(r1, r2)
            java.lang.Object r1 = defpackage.fbp.a(r1)
            androidx.recyclerview.widget.RecyclerView$u r1 = (androidx.recyclerview.widget.RecyclerView.u) r1
            androidx.recyclerview.widget.RecyclerView r4 = r6.c
            int r4 = r4.getHeight()
            android.view.View r1 = r1.o
            int r1 = r1.getBottom()
            int r4 = r4 - r1
            int r1 = r6.m
            if (r4 <= r1) goto L_0x004d
            goto L_0x0012
        L_0x004d:
            r1 = r2 ^ 1
            r0.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rje.d():void");
    }

    public final void a() {
        this.e.b();
    }

    public final void a(int i2) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.k.getLayoutParams();
        marginLayoutParams.topMargin = i2;
        this.k.setLayoutParams(marginLayoutParams);
    }

    public final void a(YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z) {
        this.i.a(yourLibraryTabsCollapseState, z);
    }

    public /* synthetic */ void a(String str, String str2, String str3) {
        CC.$default$a(this, str, str2, str3);
    }

    public final void a(boolean z) {
        this.c.a(0);
        this.c.a(1);
        if (z) {
            this.c.f(0);
        } else {
            this.c.d(0);
        }
    }

    public final void b() {
        this.e.c();
    }

    public final void b(int i2) {
        this.m = i2;
    }

    public final void b(boolean z) {
        if (z) {
            this.e.a();
            return;
        }
        this.e.e();
        this.e.d();
    }

    public final void c() {
        this.c.post(new $$Lambda$rje$pNCeEkdRSV4aoed0XXK3GNw7WI(this));
    }

    public final void c(boolean z) {
        this.i.a(z);
    }

    public final kmn<MusicPagesModel> connect(knw<rey> knw) {
        this.d.a(knw);
        final kmn connect = this.b.connect(knw);
        final kmn connect2 = this.f.connect(knw);
        final kmn connect3 = this.g.connect(knw);
        final kmn connect4 = this.h.connect(knw);
        final kmn connect5 = this.e.connect(knw);
        final kmn connect6 = this.j.connect(knw);
        AnonymousClass1 r1 = new kmn<MusicPagesModel>() {
            public final /* synthetic */ void accept(Object obj) {
                MusicPagesModel musicPagesModel = (MusicPagesModel) obj;
                rje.this.n = musicPagesModel;
                LoadingState n = musicPagesModel.n();
                if (n == LoadingState.LOADED || n == LoadingState.LOADED_EMPTY) {
                    rje.this.i.a(com.spotify.music.yourlibrary.interfaces.LoadingState.LOADED);
                }
                connect.accept(musicPagesModel);
                connect2.accept(musicPagesModel);
                connect3.accept(musicPagesModel);
                connect4.accept(musicPagesModel);
                connect5.accept(musicPagesModel);
                connect6.accept(musicPagesModel);
            }

            public final void dispose() {
                connect.dispose();
                connect2.dispose();
                connect3.dispose();
                connect4.dispose();
                connect5.dispose();
                connect6.dispose();
            }
        };
        return r1;
    }

    public final void d(boolean z) {
        this.i.b(z);
    }

    public final void e(boolean z) {
        PulldownContainer pulldownContainer = this.l;
        if (pulldownContainer != null) {
            pulldownContainer.c = z;
            if (!pulldownContainer.c) {
                if (pulldownContainer.a == null) {
                    int i2 = 1;
                    while (true) {
                        if (i2 >= pulldownContainer.getChildCount()) {
                            Assertion.b("RecyclerView was not found!");
                            break;
                        }
                        View childAt = pulldownContainer.getChildAt(i2);
                        if (childAt instanceof RecyclerView) {
                            pulldownContainer.a = (RecyclerView) childAt;
                            break;
                        }
                        i2++;
                    }
                }
                if (((LinearLayoutManager) fbp.a(pulldownContainer.a.d())).k() != 0) {
                    pulldownContainer.a(-pulldownContainer.b, 0);
                }
            }
        }
    }
}
