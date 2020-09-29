package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;
import com.squareup.picasso.Picasso;

/* renamed from: rcf reason: default package */
public final class rcf implements defpackage.rca.g<Type, MusicItem> {
    e a = $$Lambda$rcf$tRA4AyL951CCY2itOfMXH_mrYx0.INSTANCE;
    c b = $$Lambda$rcf$_LsDWR0HAX3R1EO3vP_zANzKQb8.INSTANCE;
    private final rik c;
    private final Picasso d;
    private final rim e;
    private g f = $$Lambda$rcf$vnzkG8m5ajZP3WmXB9YSKaCyPlw.INSTANCE;
    private a g = $$Lambda$rcf$rCnHeBcF6_spUCGJJ_yQ9KlglQo.INSTANCE;
    private d h = $$Lambda$rcf$ndttfe3aKWlYFgCgWstozOhwsCQ.INSTANCE;
    private b i = $$Lambda$rcf$ufPqGzfpioHYQ7RMm3UGebaNnOc.INSTANCE;
    private f j = $$Lambda$rcf$LbJcjVL6jScKYGCELBJQLEI9xW8.INSTANCE;

    /* renamed from: rcf$a */
    public interface a {
        void onClearFilterButtonClicked();
    }

    /* renamed from: rcf$b */
    public interface b {
        void onCollapseSectionClicked(MusicItem musicItem, int i);
    }

    /* renamed from: rcf$c */
    public interface c {
        void onDownloadToggleClicked(MusicItem musicItem, int i, boolean z);
    }

    /* renamed from: rcf$d */
    public interface d {
        void onFilterChipClicked(rfs rfs);
    }

    /* renamed from: rcf$e */
    public interface e {
        void onGoToSettingsRequested();
    }

    /* renamed from: rcf$f */
    public interface f {
        void onGroupHeaderClicked(MusicItem musicItem, int i);
    }

    /* renamed from: rcf$g */
    public interface g {
        void onHeaderInfoButtonClicked(MusicItem musicItem, int i);
    }

    public rcf(rik rik, Picasso picasso, rim rim) {
        this.c = rik;
        this.d = picasso;
        this.e = rim;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Drawable a(ImageView imageView, Bitmap bitmap) {
        return new BitmapDrawable(imageView.getResources(), bitmap);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ View a(DownloadHeaderView downloadHeaderView) {
        return downloadHeaderView;
    }

    /* access modifiers changed from: private */
    public fqy a(ViewGroup viewGroup) {
        DownloadHeaderView a2 = DownloadHeaderView.a(viewGroup.getContext(), viewGroup);
        a2.setLayoutParams(new LayoutParams(-1, -2));
        return new $$Lambda$rcf$h_YQ3qtAgqipFPbFHS3q1ok2hHQ(a2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.g.onClearFilterButtonClicked();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(MusicItem musicItem, int i2) {
        this.i.onCollapseSectionClicked(musicItem, i2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(MusicItem musicItem, int i2, View view) {
        this.j.onGroupHeaderClicked(musicItem, i2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(MusicItem musicItem, int i2, boolean z) {
    }

    /* access modifiers changed from: private */
    public void a(fqy fqy, final MusicItem musicItem, final int i2) {
        DownloadHeaderView downloadHeaderView = (DownloadHeaderView) fqy.getView();
        downloadHeaderView.a(true);
        downloadHeaderView.a = true;
        downloadHeaderView.b = new com.spotify.mobile.android.ui.view.DownloadHeaderView.a() {
            public final void a() {
                rcf.this.a.onGoToSettingsRequested();
            }

            public final void a(boolean z) {
                rcf.this.b.onDownloadToggleClicked(musicItem, i2, z);
            }
        };
        downloadHeaderView.a((vli) jvi.a(musicItem.p(), new defpackage.vli.f()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rfs rfs) {
        this.h.onFilterChipClicked(rfs);
    }

    /* access modifiers changed from: private */
    public fqy b(ViewGroup viewGroup) {
        return new $$Lambda$rcf$JyszATymcX1tnRv1WQ_PF5dvok(viewGroup);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(MusicItem musicItem, int i2) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(MusicItem musicItem, int i2, View view) {
        this.f.onHeaderInfoButtonClicked(musicItem, i2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(MusicItem musicItem, int i2, boolean z) {
    }

    /* access modifiers changed from: private */
    public void b(fqy fqy, MusicItem musicItem, int i2) {
        rjh rjh = (rjh) fqy;
        rjh.a(musicItem.h());
        TextView a2 = rjh.a();
        a2.setText(musicItem.x().a());
        a2.setOnClickListener(new $$Lambda$rcf$DJpzw1_MLnSx643lkRW2v44_ho(this, musicItem, i2));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(rfs rfs) {
    }

    /* access modifiers changed from: private */
    public fqy c(ViewGroup viewGroup) {
        return new $$Lambda$rcf$4HDivs4xRg2tgBNg4wel16LTKdA(viewGroup);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(MusicItem musicItem, int i2) {
    }

    /* access modifiers changed from: private */
    public void c(fqy fqy, MusicItem musicItem, int i2) {
        rjg rjg = (rjg) fqy;
        com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.e x = musicItem.x();
        rjg.a(musicItem.h());
        rjg.b(musicItem.i());
        rjg.a(x.f());
        rjg.b(x.e());
        rjg.a((defpackage.rjg.a) new $$Lambda$rcf$7xX3sA7N3WC3rbit0IBtaBWKAAs(this, musicItem, i2));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(rfs rfs) {
    }

    /* access modifiers changed from: private */
    public fqy d(ViewGroup viewGroup) {
        return fqv.e().c(viewGroup.getContext(), viewGroup);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(MusicItem musicItem, int i2) {
    }

    /* access modifiers changed from: private */
    public void d(fqy fqy, MusicItem musicItem, int i2) {
        rij rij = (rij) fqz.a(fqy.getView(), rij.class);
        rij.a().setText(musicItem.h());
        rij.b().setText(musicItem.i());
        rij.b().setOnClickListener(new $$Lambda$rcf$PZqNKckketUqUCpIoeHfBUllQCU(this));
    }

    /* access modifiers changed from: private */
    public fqy e(ViewGroup viewGroup) {
        defpackage.rik.c cVar = new defpackage.rik.c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.your_library_music_row_section_header_with_action, viewGroup, false));
        fqz.a(cVar);
        return cVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e(MusicItem musicItem, int i2) {
    }

    /* access modifiers changed from: private */
    public void e(fqy fqy, MusicItem musicItem, int i2) {
        rfu rfu = (rfu) fqz.a(fqy.getView(), rfu.class);
        if (!(musicItem.a() == Type.FILTER_INDICATOR) || musicItem.q() == null) {
            Assertion.a();
        }
        rfu.a(((com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.d) musicItem.q()).a());
        rfu.a = new $$Lambda$rcf$p7ud0vNxXh8beWM9xESUJ22_ROg(this);
    }

    /* access modifiers changed from: private */
    public fqy f(ViewGroup viewGroup) {
        return fqv.e().d(viewGroup.getContext(), viewGroup);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f(MusicItem musicItem, int i2) {
    }

    /* access modifiers changed from: private */
    public void f(fqy fqy, MusicItem musicItem, int i2) {
        com.spotify.music.freetiercommon.uicomponents.Rows.b bVar = (com.spotify.music.freetiercommon.uicomponents.Rows.b) fqy;
        bVar.a(musicItem.h());
        ImageView c2 = bVar.c();
        Drawable a2 = this.e.a(musicItem);
        wgr a3 = this.d.a(musicItem.u()).b(a2).a(a2);
        if (musicItem.a() == Type.GROUP_HEADER_ARTIST) {
            a3.a(vhj.a(c2));
        } else {
            a3.a(vhj.a(c2, (vfk) new $$Lambda$rcf$7izPHLndJ5g_RImYHqAnotRfQbE(c2)));
        }
        bVar.getView().setOnClickListener(new $$Lambda$rcf$ib1xLO0rMO76lPKe7N_N8xnQZBQ(this, musicItem, i2));
    }

    /* access modifiers changed from: private */
    public fqy g(ViewGroup viewGroup) {
        defpackage.rik.b bVar = new defpackage.rik.b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.your_library_music_pages_section_header_row, viewGroup, false));
        fqz.a(bVar);
        return bVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void g(MusicItem musicItem, int i2) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(fqy fqy, MusicItem musicItem, int i2) {
        fsu fsu = (fsu) fqy;
        fsu.a((CharSequence) musicItem.h());
        fsu.b(musicItem.i());
    }

    /* access modifiers changed from: private */
    public fqy h(ViewGroup viewGroup) {
        defpackage.rik.a aVar = new defpackage.rik.a(LayoutInflater.from(this.c.a).inflate(R.layout.your_library_music_row_info_with_action, viewGroup, false));
        fqz.a(aVar);
        return aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(fqy fqy, MusicItem musicItem, int i2) {
        ((fsm) fqy).a((CharSequence) musicItem.h());
    }

    /* access modifiers changed from: private */
    public fqy i(ViewGroup viewGroup) {
        rfu a2 = rfu.a(viewGroup);
        fqz.a(a2);
        return a2;
    }

    /* access modifiers changed from: private */
    public fqy j(ViewGroup viewGroup) {
        rik rik = this.c;
        Context context = viewGroup.getContext();
        fqv.b();
        fry b2 = fsk.b(context, viewGroup);
        int b3 = vfj.b(24.0f, context.getResources());
        int b4 = vfj.b(40.0f, context.getResources());
        int b5 = vfj.b(8.0f, context.getResources());
        int i2 = b3 + b4 + b5;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, i2));
        linearLayout.setMinimumHeight(i2);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(0, b3, 0, b5);
        ImageView c2 = b2.c();
        ViewGroup.LayoutParams layoutParams = b2.c().getLayoutParams();
        layoutParams.height = b4;
        layoutParams.width = b4;
        c2.setLayoutParams(layoutParams);
        c2.setMinimumHeight(b4);
        c2.setMinimumWidth(b4);
        linearLayout.addView(b2.getView());
        b2.getView().setDuplicateParentStateEnabled(true);
        jm.a(b2.b(), 2132017669);
        defpackage.rik.AnonymousClass1 r1 = new com.spotify.music.freetiercommon.uicomponents.Rows.b(b2, linearLayout) {
            private /* synthetic */ fry a;
            private /* synthetic */ LinearLayout b;

            {
                this.a = r2;
                this.b = r3;
            }

            public final View a() {
                return this.a.a();
            }

            public final void a(View view) {
                this.a.a(view);
            }

            public final void a(CharSequence charSequence) {
                this.a.a(charSequence);
            }

            public final void a(boolean z) {
                this.a.a(z);
            }

            public final TextView b() {
                return this.a.b();
            }

            public final void b(boolean z) {
                this.a.b(z);
            }

            public final ImageView c() {
                return this.a.c();
            }

            public final void c(boolean z) {
                this.a.c(z);
            }

            public final View getView() {
                return this.b;
            }
        };
        fqz.a(r1);
        return r1;
    }

    public final ImmutableList<defpackage.rca.c<Type, MusicItem>> a() {
        return ImmutableList.a(defpackage.rca.c.a(ImmutableSet.d(Type.FILTER_INDICATOR), new $$Lambda$rcf$uJC0aM5XUwuvAYiQCMTOFdAaki0(this), new $$Lambda$rcf$jyy89YCUMVYw5Pn_vhMRxobTeeo(this)), defpackage.rca.c.a(ImmutableSet.d(Type.DOWNLOAD_TOGGLE), new $$Lambda$rcf$R_wQbH5ebutQJ_K4mR_nGt1fgyM(this), new $$Lambda$rcf$RhT_I7PbQZJ35dIFgjxM5E853o(this)), defpackage.rca.c.a(ImmutableSet.d(Type.LOADING_INDICATOR), new $$Lambda$rcf$TpHM3qrDPZYXwjw2k7JnlJoDFls(this), null), defpackage.rca.c.a(ImmutableSet.d(Type.PLACEHOLDER), new $$Lambda$rcf$jJpXONwsk2YTLvyokBAV6XZE3lY(this), null), defpackage.rca.c.a(ImmutableSet.d(Type.SECTION_HEADER), new $$Lambda$rcf$SYFRQHhbbS3lJpfa9_LCZnJUD8(this), new $$Lambda$rcf$DJyFs9EgcNA0zZPSYCpKjPVbta8(this)), defpackage.rca.c.a(ImmutableSet.d(Type.SECTION_HEADER_WITH_BUTTON), new $$Lambda$rcf$TT1Gb7C4jXwpJcoROOO723wlpVM(this), new $$Lambda$rcf$kqvmB5LYs_JJnCj6VGr1SPMspTw(this)), defpackage.rca.c.a(ImmutableSet.d(Type.SECTION_HEADER_WITH_SUBTITLE), new $$Lambda$rcf$n5cEETLYv__ll4tdDQgMmqb9QOg(this), new $$Lambda$rcf$NN4SBhiV0Wftg8e4baeePU6EIHA(this)), defpackage.rca.c.a(ImmutableSet.d(Type.SECTION_HEADER_CUSTOM), new $$Lambda$rcf$P4yZtxgjicBjFSqkwolAt9LkW8M(this), new $$Lambda$rcf$TtDudJ5_Tt2ycYhWqBswYl9NOc(this)), defpackage.rca.c.a(ImmutableSet.d(Type.FILTER_INFO), new $$Lambda$rcf$c8E5Dk5qn0xsFkLoLEtL287lsE(this), new $$Lambda$rcf$l5NKlJuFq_JCk5iFxIZnDCOc(this)), defpackage.rca.c.a(ImmutableSet.b(Type.GROUP_HEADER_ALBUM, Type.GROUP_HEADER_ARTIST), new $$Lambda$rcf$T7bRmZNSfF5hjKqn110rC887kTs(this), new $$Lambda$rcf$EQ6Rh4PCYZ3gff0mu0KEscehHY(this)));
    }

    public final void a(a aVar) {
        this.g = (a) fbm.a(aVar, $$Lambda$rcf$ebZ5ViGUlz7xWZewPb4t7YGPdM.INSTANCE);
    }

    public final void a(b bVar) {
        this.i = (b) fbm.a(bVar, $$Lambda$rcf$hglVJqzOPRDuYc84ph14qbJjo3s.INSTANCE);
    }

    public final void a(c cVar) {
        this.b = (c) fbm.a(cVar, $$Lambda$rcf$YFdyfx3R3ZcNVF730CsqL6ipa0.INSTANCE);
    }

    public final void a(d dVar) {
        this.h = (d) fbm.a(dVar, $$Lambda$rcf$DHnhl4snhx3zY4iEzsYIQW_TA9c.INSTANCE);
    }

    public final void a(e eVar) {
        this.a = (e) fbm.a(eVar, $$Lambda$rcf$PHtHycm8xMzK2WPblBszjiTGLnI.INSTANCE);
    }

    public final void a(f fVar) {
        this.j = (f) fbm.a(fVar, $$Lambda$rcf$iBoHRmTB4LO7J1bWXAAPgUQFncI.INSTANCE);
    }

    public final void a(g gVar) {
        this.f = (g) fbm.a(gVar, $$Lambda$rcf$jw3DmeBSr7MDzE89aGK0mEpII.INSTANCE);
    }
}
