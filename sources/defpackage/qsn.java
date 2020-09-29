package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import androidx.viewpager.widget.ViewPager.e;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.Behavior.a;
import com.google.android.material.appbar.AppBarLayout.b;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSortedMap;
import com.spotify.music.R;
import com.spotify.music.features.yourlibrary.container.view.FloatingContainerLayout;
import com.spotify.music.features.yourlibrary.container.view.GroupedTabLayout;
import com.spotify.music.features.yourlibrary.container.view.ListenableScrollingViewBehavior;
import com.spotify.music.features.yourlibrary.container.view.LockableAppBarBehavior;
import com.spotify.music.features.yourlibrary.container.view.LockableViewPager;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.PublishSubject;

/* renamed from: qsn reason: default package */
public final class qsn implements kjd<qrx, qrv>, kyf, qsm {
    public final View a;
    public final LockableViewPager b;
    public final LockableAppBarBehavior c;
    /* access modifiers changed from: private */
    public final GroupedTabLayout d;
    /* access modifiers changed from: private */
    public final AppBarLayout e;
    private final qsc f;
    /* access modifiers changed from: private */
    public final qrk g;
    /* access modifiers changed from: private */
    public final qsi h;
    /* access modifiers changed from: private */
    public final qsk i;
    /* access modifiers changed from: private */
    public e j;
    private final int k;

    /* renamed from: qsn$5 reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] a = new int[YourLibraryTabsCollapseState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState[] r0 = com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState r1 = com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState.EXPANDED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState r1 = com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState.COLLAPSED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState r1 = com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState.SHOW_BOTTOM_TABS_ONLY     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qsn.AnonymousClass5.<clinit>():void");
        }
    }

    public qsn(LayoutInflater layoutInflater, ViewGroup viewGroup, Context context, qrk qrk, qsi qsi, qsd qsd, qsa qsa, qsk qsk, qri qri) {
        this.g = qrk;
        this.h = qsi;
        this.i = qsk;
        qsi qsi2 = this.h;
        boolean a2 = uur.a(context);
        if (qsi2.c != a2) {
            qsi2.c = a2;
            qsi2.c();
        }
        this.a = layoutInflater.inflate(R.layout.fragment_your_library, viewGroup, false);
        this.d = (GroupedTabLayout) this.a.findViewById(R.id.tab_layout);
        GroupedTabLayout groupedTabLayout = this.d;
        groupedTabLayout.d = qrk;
        groupedTabLayout.e = qsa;
        if (qri.a()) {
            this.d.setVisibility(4);
        }
        this.b = (LockableViewPager) this.a.findViewById(R.id.view_pager);
        this.e = (AppBarLayout) this.a.findViewById(R.id.appbar_layout);
        this.c = new LockableAppBarBehavior();
        this.c.a(new a() {
        });
        this.k = this.d.getMinimumHeight();
        this.f = new qsc((Activity) qsd.a(qsd.a.get(), 1), (GroupedTabLayout) qsd.a(this.d, 2));
    }

    public final kje<qrx> connect(final kkn<qrv> kkn) {
        final PublishSubject a2 = PublishSubject.a();
        this.j = new e() {
            private int a;

            public final void a(int i, float f, int i2) {
            }

            public final void b(int i) {
                this.a = i;
                YourLibraryPageId d = qsn.this.h.d(i);
                Optional c2 = qsn.this.h.c(d);
                if (c2.b()) {
                    uqr uqr = (uqr) c2.c();
                    kkn.accept(new e(d, uqr.aj().a(), uqr.ae_().toString()));
                }
            }

            public final void a(int i) {
                if (i == 0) {
                    kkn.accept(new d(qsn.this.h.d(this.a)));
                }
            }
        };
        this.b.a(this.j);
        this.f.a();
        d dVar = (d) this.e.getLayoutParams();
        dVar.a((Behavior) this.c);
        this.e.setLayoutParams(dVar);
        final AnonymousClass2 r1 = new b() {
            private int a = -1;
            private int b = -1;

            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                int b2 = appBarLayout.b();
                if (b2 != this.a) {
                    this.a = b2;
                    kkn.accept(new b(b2));
                }
                if (i != this.b) {
                    this.b = i;
                    kkn.accept(new k(b2 + i));
                }
            }
        };
        final Disposable a3 = a2.c((Function<? super T, ? extends R>) $$Lambda$UkMlxGgxvhEro8LSFniAJUZ5Wf0.INSTANCE).a((Predicate<? super T>) $$Lambda$qsn$t5dW05xsXIEuASsLKXwbyP6VOg.INSTANCE).c(1).a((Consumer<? super T>) new $$Lambda$qsn$o7zn6mOqNjAq4MPBPrF1T3E3vSw<Object>(this, r1), (Consumer<? super Throwable>) $$Lambda$qsn$y6BPLxfTWjJbsORoNHSsEvNhU.INSTANCE);
        FrameLayout frameLayout = (FrameLayout) this.a.findViewById(R.id.content_container);
        ListenableScrollingViewBehavior listenableScrollingViewBehavior = new ListenableScrollingViewBehavior();
        FloatingContainerLayout floatingContainerLayout = (FloatingContainerLayout) frameLayout.findViewById(R.id.floating_view_container);
        floatingContainerLayout.a = this.h;
        listenableScrollingViewBehavior.a(floatingContainerLayout);
        listenableScrollingViewBehavior.a(this.d);
        LockableViewPager lockableViewPager = this.b;
        lockableViewPager.e = floatingContainerLayout;
        floatingContainerLayout.b = lockableViewPager.c;
        floatingContainerLayout.a();
        d dVar2 = (d) frameLayout.getLayoutParams();
        dVar2.a((Behavior) listenableScrollingViewBehavior);
        frameLayout.setLayoutParams(dVar2);
        qsk qsk = this.i;
        qsk.a.a(qsk.b, false);
        return new kje<qrx>() {
            public final /* synthetic */ void accept(Object obj) {
                qrx qrx = (qrx) obj;
                if (qsn.this.d.getVisibility() == 4 && qrx.b().b() && qrx.b().c() == YourLibraryPageId.MUSIC_PLAYLISTS) {
                    qsn.this.d.setVisibility(0);
                }
                a2.onNext(qrx);
                qsn.this.g.accept(qrx.c());
            }

            public final void dispose() {
                qsn.this.b.b(qsn.this.j);
                qsn.this.e.b(r1);
                a3.bf_();
                qsk f = qsn.this.i;
                f.a.a(f.b);
            }
        };
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(ImmutableSortedMap immutableSortedMap) {
        return !immutableSortedMap.isEmpty();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, ImmutableSortedMap immutableSortedMap) {
        this.h.a(immutableSortedMap);
        this.b.a((sa) this.h);
        GroupedTabLayout groupedTabLayout = this.d;
        LockableViewPager lockableViewPager = this.b;
        if (groupedTabLayout.a != null) {
            if (groupedTabLayout.b != null) {
                groupedTabLayout.a.b(groupedTabLayout.b);
                groupedTabLayout.b = null;
            }
            if (groupedTabLayout.c != null) {
                groupedTabLayout.a.b(groupedTabLayout.c);
                groupedTabLayout.c = null;
            }
        }
        groupedTabLayout.a = lockableViewPager;
        if (groupedTabLayout.a != null) {
            groupedTabLayout.b = new GroupedTabLayout.b(groupedTabLayout);
            groupedTabLayout.a.a(groupedTabLayout.b);
            sa saVar = lockableViewPager.b;
            if (saVar != null) {
                groupedTabLayout.a(saVar);
            }
            groupedTabLayout.c = new GroupedTabLayout.a(groupedTabLayout, 0);
            groupedTabLayout.a.a(groupedTabLayout.c);
        }
        this.e.a(bVar);
    }

    public final void a(YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z) {
        int i2 = AnonymousClass5.a[yourLibraryTabsCollapseState.ordinal()];
        if (i2 == 1) {
            this.d.setMinimumHeight(this.k);
            this.e.a(true, z, true);
        } else if (i2 != 2) {
            if (i2 == 3) {
                this.d.setMinimumHeight(this.k);
                this.e.a(false, z, true);
            }
        } else {
            this.d.setMinimumHeight(0);
            this.e.a(false, z, true);
        }
    }

    public final void a(YourLibraryPageId yourLibraryPageId, boolean z, boolean z2) {
        this.b.post(new $$Lambda$qsn$RMwJCQYrKQrZ0lb1Ic_vXh9DBOg(this, yourLibraryPageId, z2, z));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(YourLibraryPageId yourLibraryPageId, boolean z, boolean z2) {
        int a2 = this.h.a(yourLibraryPageId);
        if (!z || this.b.c != a2) {
            this.b.a(a2, z2);
        } else {
            this.j.b(a2);
        }
        if (this.d.getVisibility() == 4) {
            this.d.post(new $$Lambda$qsn$uzN41J6QCnhIEPq_aVrCW9ADIno(this));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.d.setAlpha(0.0f);
        this.d.setVisibility(0);
        this.d.animate().alpha(1.0f).setDuration(100);
    }

    public final void a(YourLibraryPageId yourLibraryPageId, boolean z) {
        Optional c2 = this.h.c(yourLibraryPageId);
        if (c2.b()) {
            ((uqr) c2.c()).a(z);
        }
    }

    public final void a(YourLibraryPageId yourLibraryPageId) {
        uqr b2 = this.h.b(yourLibraryPageId);
        if (b2 != null) {
            b2.am();
        }
    }

    public final void a(boolean z) {
        this.c.b = z;
    }

    public final void b(boolean z) {
        this.b.f = z;
    }

    public final void a() {
        this.f.a();
    }

    public final boolean onBackPressed() {
        int i2 = this.b.c;
        if (i2 >= this.h.b.size()) {
            return false;
        }
        uqr uqr = (uqr) this.h.c(this.h.d(i2)).d();
        if (uqr instanceof kyf) {
            return ((kyf) uqr).onBackPressed();
        }
        return false;
    }
}
