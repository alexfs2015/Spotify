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
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;

/* renamed from: rai reason: default package */
public final class rai implements kjd<MusicPagesModel, qwj>, rae {
    public final FrameLayout a;
    public final qta b;
    private final RecyclerView c;
    private final qti d;
    private final qwv e;
    private final qzu f;
    private final qzm g;
    private final qzs h;
    /* access modifiers changed from: private */
    public final uqp i;
    private final raf j;
    private final FrameLayout k;
    private final PulldownContainer l;
    private int m = -1;

    public /* synthetic */ void a(String str, String str2, String str3) {
        CC.$default$a(this, str, str2, str3);
    }

    public rai(LayoutInflater layoutInflater, ViewGroup viewGroup, MusicPageId musicPageId, Bundle bundle, qti qti, qwt qwt, qxx qxx, qxz qxz, qyf qyf, quw quw, qwd qwd, qta qta, qzs qzs, rag rag, qzv qzv, qwz qwz, qsr qsr) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        qxx qxx2 = qxx;
        qxz qxz2 = qxz;
        qyf qyf2 = qyf;
        this.d = qti;
        this.b = qta;
        this.h = qzs;
        this.i = (uqp) qwd.getDelegate().d();
        if (qsr.e()) {
            this.a = (FrameLayout) layoutInflater.inflate(R.layout.fragment_your_library_music_page_pulldown, viewGroup, false);
            this.l = (PulldownContainer) this.a.findViewById(R.id.pulldown_container);
        } else {
            this.a = (FrameLayout) layoutInflater.inflate(R.layout.fragment_your_library_music_page, viewGroup, false);
            this.l = null;
        }
        Bundle bundle2 = bundle;
        this.j = rag.a((View) this.a, bundle);
        this.c = (RecyclerView) this.a.findViewById(R.id.recycler_view);
        this.f = qzv.a((qtl<Type, MusicItem>) this.d, this.c);
        this.f.a((qus) quw);
        Context context = layoutInflater.getContext();
        this.c.a((i) new LinearLayoutManager(context));
        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) this.a.findViewById(R.id.recycler_view_fast_scroll);
        recyclerViewFastScroller.setVerticalScrollBarEnabled(true);
        recyclerViewFastScroller.a(this.c);
        recyclerViewFastScroller.setEnabled(true);
        this.c.setVerticalScrollBarEnabled(false);
        this.k = (FrameLayout) this.a.findViewById(R.id.centered_views);
        this.k.addView(qxx2.a);
        this.k.addView(qyf2.a);
        this.k.addView(qxz2.a);
        ViewGroup viewGroup3 = (ViewGroup) this.a.findViewById(R.id.content_container);
        LoadingView a2 = LoadingView.a(layoutInflater, context, viewGroup3);
        this.k.addView(a2);
        viewGroup3.setVisibility(4);
        this.g = new qzm(a2, qxx2, qyf2, qxz2);
        MusicPageId musicPageId2 = musicPageId;
        qwv qwv = new qwv(viewGroup3, (ViewGroup) this.a.findViewById(R.id.filter_view_container), qwt.a(musicPageId), qwz, qsr.e());
        this.e = qwv;
    }

    public final kje<MusicPagesModel> connect(kkn<qwj> kkn) {
        this.d.a(kkn);
        final kje connect = this.b.connect(kkn);
        final kje connect2 = this.f.connect(kkn);
        final kje connect3 = this.g.connect(kkn);
        final kje connect4 = this.h.connect(kkn);
        final kje connect5 = this.e.connect(kkn);
        final kje connect6 = this.j.connect(kkn);
        AnonymousClass1 r1 = new kje<MusicPagesModel>() {
            public final /* synthetic */ void accept(Object obj) {
                MusicPagesModel musicPagesModel = (MusicPagesModel) obj;
                LoadingState n = musicPagesModel.n();
                if (n == LoadingState.LOADED || n == LoadingState.LOADED_EMPTY) {
                    rai.this.i.a(com.spotify.music.yourlibrary.interfaces.LoadingState.LOADED);
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

    public final void a(boolean z) {
        this.c.a(0);
        this.c.a(1);
        if (z) {
            this.c.f(0);
        } else {
            this.c.d(0);
        }
    }

    public final void b(boolean z) {
        if (z) {
            this.e.a();
            return;
        }
        this.e.e();
        this.e.d();
    }

    public final void b() {
        this.e.c();
    }

    public final void a() {
        this.e.b();
    }

    public final void a(YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z) {
        this.i.a(yourLibraryTabsCollapseState, z);
    }

    public final void c(boolean z) {
        this.i.a(z);
    }

    public final void d(boolean z) {
        this.i.b(z);
    }

    public final void a(int i2) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.k.getLayoutParams();
        marginLayoutParams.topMargin = i2;
        this.k.setLayoutParams(marginLayoutParams);
    }

    public final void c() {
        this.c.post(new $$Lambda$rai$ZDWyRSt1RGdIs4Y8q2uhBDDCI(this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004a, code lost:
        if ((r6.c.getHeight() - ((androidx.recyclerview.widget.RecyclerView.u) defpackage.fay.a(r6.c.a(r1, false))).o.getBottom()) > r6.m) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void d() {
        /*
            r6 = this;
            uqp r0 = r6.i
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
            java.lang.Object r4 = defpackage.fay.a(r4)
            androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
            int r5 = r4.k()
            if (r5 != 0) goto L_0x004d
            int r4 = r4.m()
            int r1 = r1 - r3
            if (r4 != r1) goto L_0x004d
            androidx.recyclerview.widget.RecyclerView r4 = r6.c
            androidx.recyclerview.widget.RecyclerView$u r1 = r4.a(r1, r2)
            java.lang.Object r1 = defpackage.fay.a(r1)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rai.d():void");
    }

    public final void b(int i2) {
        this.m = i2;
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
                if (((LinearLayoutManager) fay.a(pulldownContainer.a.d())).k() != 0) {
                    pulldownContainer.a(-pulldownContainer.b, 0);
                }
            }
        }
    }
}
