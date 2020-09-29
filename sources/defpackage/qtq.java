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

/* renamed from: qtq reason: default package */
public final class qtq implements defpackage.qtl.g<Type, MusicItem> {
    e a = $$Lambda$qtq$k09WzvBs4RiXQKrnDCIVSViqbg.INSTANCE;
    c b = $$Lambda$qtq$lIJs_rbbSIpWN_RYkbMN9TjSafo.INSTANCE;
    private final qzo c;
    private final Picasso d;
    private final qzq e;
    private g f = $$Lambda$qtq$WYljoWcDNc0b29LdjnauQoFZFNg.INSTANCE;
    private a g = $$Lambda$qtq$m2mOHY771axPtRQr3nXhwKwEp44.INSTANCE;
    private d h = $$Lambda$qtq$DfmoaPMyLxPijRjTKD_wNDomFV8.INSTANCE;
    private b i = $$Lambda$qtq$BXA1_Qim9VwL7CJEBYNuUlUwds.INSTANCE;
    private f j = $$Lambda$qtq$DAOiQz6GlI2TFTfOs0wocErsmuE.INSTANCE;

    /* renamed from: qtq$a */
    public interface a {
        void onClearFilterButtonClicked();
    }

    /* renamed from: qtq$b */
    public interface b {
        void onCollapseSectionClicked(MusicItem musicItem, int i);
    }

    /* renamed from: qtq$c */
    public interface c {
        void onDownloadToggleClicked(MusicItem musicItem, int i, boolean z);
    }

    /* renamed from: qtq$d */
    public interface d {
        void onFilterChipClicked(qxd qxd);
    }

    /* renamed from: qtq$e */
    public interface e {
        void onGoToSettingsRequested();
    }

    /* renamed from: qtq$f */
    public interface f {
        void onGroupHeaderClicked(MusicItem musicItem, int i);
    }

    /* renamed from: qtq$g */
    public interface g {
        void onHeaderInfoButtonClicked(MusicItem musicItem, int i);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ View a(DownloadHeaderView downloadHeaderView) {
        return downloadHeaderView;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(MusicItem musicItem, int i2, boolean z) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(MusicItem musicItem, int i2) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(MusicItem musicItem, int i2, boolean z) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(qxd qxd) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(MusicItem musicItem, int i2) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(qxd qxd) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(MusicItem musicItem, int i2) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e(MusicItem musicItem, int i2) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f(MusicItem musicItem, int i2) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void g(MusicItem musicItem, int i2) {
    }

    public qtq(qzo qzo, Picasso picasso, qzq qzq) {
        this.c = qzo;
        this.d = picasso;
        this.e = qzq;
    }

    public final void a(g gVar) {
        this.f = (g) fav.a(gVar, $$Lambda$qtq$RrYJjHbWjBWgL0GPplJImWgQE3s.INSTANCE);
    }

    public final void a(e eVar) {
        this.a = (e) fav.a(eVar, $$Lambda$qtq$na6ZykbbERgC1n6zlUzWpydPBYI.INSTANCE);
    }

    public final void a(c cVar) {
        this.b = (c) fav.a(cVar, $$Lambda$qtq$65i2cX9eGCjaS1dA1tJyvkYTfIk.INSTANCE);
    }

    public final void a(a aVar) {
        this.g = (a) fav.a(aVar, $$Lambda$qtq$6xYakV8U5aLswQPhbOcY3vVD0pQ.INSTANCE);
    }

    public final void a(d dVar) {
        this.h = (d) fav.a(dVar, $$Lambda$qtq$ydeUFF1DXBVxSeg_6xRa0Lq1xc.INSTANCE);
    }

    public final void a(b bVar) {
        this.i = (b) fav.a(bVar, $$Lambda$qtq$_Qm0vUhSt6YL3HHNpcd7rY4JTJY.INSTANCE);
    }

    public final void a(f fVar) {
        this.j = (f) fav.a(fVar, $$Lambda$qtq$4FLa93cmBwZ3k9u2PXnclfeJPQU.INSTANCE);
    }

    public final ImmutableList<defpackage.qtl.c<Type, MusicItem>> a() {
        return ImmutableList.a(defpackage.qtl.c.a(ImmutableSet.d(Type.FILTER_INDICATOR), new $$Lambda$qtq$5NQvMN10Vg0z97lP2g3pt_goaxM(this), new $$Lambda$qtq$aKNXxEaIa4f3LYHPPex3uRHHoNM(this)), defpackage.qtl.c.a(ImmutableSet.d(Type.DOWNLOAD_TOGGLE), new $$Lambda$qtq$5rasscZLicLyiaGCxAqPdnMF1E(this), new $$Lambda$qtq$MWXAwghCyFIaTRapSumTnnJ382c(this)), defpackage.qtl.c.a(ImmutableSet.d(Type.LOADING_INDICATOR), new $$Lambda$qtq$puTgbN8JV2s8g9NBRQwrNFZvCI(this), null), defpackage.qtl.c.a(ImmutableSet.d(Type.PLACEHOLDER), new $$Lambda$qtq$Sgg0fWN_42B9CW0Z5RptlFKz8Qk(this), null), defpackage.qtl.c.a(ImmutableSet.d(Type.SECTION_HEADER), new $$Lambda$qtq$h1lvEFPswkMi8188TkG0kejkYOw(this), new $$Lambda$qtq$wjWWnz3IW6zfTHTJ8ONeoYlu98(this)), defpackage.qtl.c.a(ImmutableSet.d(Type.SECTION_HEADER_WITH_BUTTON), new $$Lambda$qtq$YbZCyh4RDbeX0_X4mnfashsR0r0(this), new $$Lambda$qtq$9tD2VIaqE3TpgPtC_FeS9s2nPc(this)), defpackage.qtl.c.a(ImmutableSet.d(Type.SECTION_HEADER_WITH_SUBTITLE), new $$Lambda$qtq$BQ_ALaYBs3NpvG1JbWoTe983XQ(this), new $$Lambda$qtq$y_aIC39C99_NRO7qJgMm6AeMQqM(this)), defpackage.qtl.c.a(ImmutableSet.d(Type.SECTION_HEADER_CUSTOM), new $$Lambda$qtq$0IYu0Suzpc9LiEETJxuZL3k6cg(this), new $$Lambda$qtq$rb__mZNGo1Pgtp5RbaGf7jFxnkc(this)), defpackage.qtl.c.a(ImmutableSet.d(Type.FILTER_INFO), new $$Lambda$qtq$vS98lECYtvs9vQku3JAUNVpJRZ8(this), new $$Lambda$qtq$D_42lyHbXz9UYimwDmvfYRoX8Y(this)), defpackage.qtl.c.a(ImmutableSet.b(Type.GROUP_HEADER_ALBUM, Type.GROUP_HEADER_ARTIST), new $$Lambda$qtq$MCt2LtLIfQbj88WcO1xBir5GQ(this), new $$Lambda$qtq$pXVDkUZns5txPMRcSL8F6iT38(this)));
    }

    /* access modifiers changed from: private */
    public fqe a(ViewGroup viewGroup) {
        DownloadHeaderView a2 = DownloadHeaderView.a(viewGroup.getContext(), viewGroup);
        a2.setLayoutParams(new LayoutParams(-1, -2));
        return new $$Lambda$qtq$oIMR9fOvDCi1GUnpPN9GUUwPYAk(a2);
    }

    /* access modifiers changed from: private */
    public fqe b(ViewGroup viewGroup) {
        return new $$Lambda$qtq$5q3vG4XuaBBXKMciQXGQOr4KJzU(viewGroup);
    }

    /* access modifiers changed from: private */
    public fqe c(ViewGroup viewGroup) {
        return new $$Lambda$qtq$3G2JJhEa6xUv7bJe2XoFWYktHY(viewGroup);
    }

    /* access modifiers changed from: private */
    public fqe d(ViewGroup viewGroup) {
        return fqb.e().c(viewGroup.getContext(), viewGroup);
    }

    /* access modifiers changed from: private */
    public fqe e(ViewGroup viewGroup) {
        defpackage.qzo.c cVar = new defpackage.qzo.c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.your_library_music_row_section_header_with_action, viewGroup, false));
        fqf.a(cVar);
        return cVar;
    }

    /* access modifiers changed from: private */
    public fqe f(ViewGroup viewGroup) {
        return fqb.e().d(viewGroup.getContext(), viewGroup);
    }

    /* access modifiers changed from: private */
    public fqe g(ViewGroup viewGroup) {
        defpackage.qzo.b bVar = new defpackage.qzo.b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.your_library_music_pages_section_header_row, viewGroup, false));
        fqf.a(bVar);
        return bVar;
    }

    /* access modifiers changed from: private */
    public fqe h(ViewGroup viewGroup) {
        defpackage.qzo.a aVar = new defpackage.qzo.a(LayoutInflater.from(this.c.a).inflate(R.layout.your_library_music_row_info_with_action, viewGroup, false));
        fqf.a(aVar);
        return aVar;
    }

    /* access modifiers changed from: private */
    public fqe j(ViewGroup viewGroup) {
        qzo qzo = this.c;
        Context context = viewGroup.getContext();
        fqb.b();
        fre b2 = frq.b(context, viewGroup);
        int b3 = uts.b(24.0f, context.getResources());
        int b4 = uts.b(40.0f, context.getResources());
        int b5 = uts.b(8.0f, context.getResources());
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
        b2.b().setTypeface(qzo.d);
        defpackage.qzo.AnonymousClass1 r1 = new com.spotify.music.freetiercommon.uicomponents.Rows.b(b2, linearLayout) {
            private /* synthetic */ fre a;
            private /* synthetic */ LinearLayout b;

            {
                this.a = r2;
                this.b = r3;
            }

            public final TextView b() {
                return this.a.b();
            }

            public final void a(CharSequence charSequence) {
                this.a.a(charSequence);
            }

            public final ImageView c() {
                return this.a.c();
            }

            public final void a(View view) {
                this.a.a(view);
            }

            public final View a() {
                return this.a.a();
            }

            public final void b(boolean z) {
                this.a.b(z);
            }

            public final void a(boolean z) {
                this.a.a(z);
            }

            public final View getView() {
                return this.b;
            }

            public final void c(boolean z) {
                this.a.c(z);
            }
        };
        fqf.a(r1);
        return r1;
    }

    /* access modifiers changed from: private */
    public void a(fqe fqe, final MusicItem musicItem, final int i2) {
        DownloadHeaderView downloadHeaderView = (DownloadHeaderView) fqe.getView();
        downloadHeaderView.a(true);
        downloadHeaderView.a = true;
        downloadHeaderView.b = new com.spotify.mobile.android.ui.view.DownloadHeaderView.a() {
            public final void a() {
                qtq.this.a.onGoToSettingsRequested();
            }

            public final void a(boolean z) {
                qtq.this.b.onDownloadToggleClicked(musicItem, i2, z);
            }
        };
        downloadHeaderView.a((uzf) jtc.a(musicItem.p(), new defpackage.uzf.f()));
    }

    /* access modifiers changed from: private */
    public void b(fqe fqe, MusicItem musicItem, int i2) {
        ral ral = (ral) fqe;
        ral.a(musicItem.h());
        TextView a2 = ral.a();
        a2.setText(musicItem.x().a());
        a2.setOnClickListener(new $$Lambda$qtq$R0N022nFQfnYhillmz2BnkJR9xU(this, musicItem, i2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(MusicItem musicItem, int i2, View view) {
        this.f.onHeaderInfoButtonClicked(musicItem, i2);
    }

    /* access modifiers changed from: private */
    public void c(fqe fqe, MusicItem musicItem, int i2) {
        rak rak = (rak) fqe;
        com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.e x = musicItem.x();
        rak.a(musicItem.h());
        rak.b(musicItem.i());
        rak.a(x.f());
        rak.b(x.e());
        rak.a((defpackage.rak.a) new $$Lambda$qtq$O3oQwWOYz5ym53YB0KRgE5Ce_dM(this, musicItem, i2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(MusicItem musicItem, int i2) {
        this.i.onCollapseSectionClicked(musicItem, i2);
    }

    /* access modifiers changed from: private */
    public void d(fqe fqe, MusicItem musicItem, int i2) {
        qzn qzn = (qzn) fqf.a(fqe.getView(), qzn.class);
        qzn.a().setText(musicItem.h());
        qzn.b().setText(musicItem.i());
        qzn.b().setOnClickListener(new $$Lambda$qtq$NRCqpSG5BwyNaSMx19RJ4KtHCUc(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.g.onClearFilterButtonClicked();
    }

    /* access modifiers changed from: private */
    public void e(fqe fqe, MusicItem musicItem, int i2) {
        qxf qxf = (qxf) fqf.a(fqe.getView(), qxf.class);
        if (!(musicItem.a() == Type.FILTER_INDICATOR) || musicItem.q() == null) {
            Assertion.a();
        }
        qxf.a(((com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.d) musicItem.q()).a());
        qxf.a = new $$Lambda$qtq$w4GUrUrgLrc0C7TntfNnH5wvMDM(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(qxd qxd) {
        this.h.onFilterChipClicked(qxd);
    }

    /* access modifiers changed from: private */
    public void f(fqe fqe, MusicItem musicItem, int i2) {
        com.spotify.music.freetiercommon.uicomponents.Rows.b bVar = (com.spotify.music.freetiercommon.uicomponents.Rows.b) fqe;
        bVar.a(musicItem.h());
        ImageView c2 = bVar.c();
        Drawable a2 = this.e.a(musicItem);
        vsl a3 = this.d.a(musicItem.u()).b(a2).a(a2);
        if (musicItem.a() == Type.GROUP_HEADER_ARTIST) {
            a3.a(uvt.a(c2));
        } else {
            a3.a(uvt.a(c2, (utt) new $$Lambda$qtq$Vpuh3HC9gzB5fdOCzgGeCmhNkKM(c2)));
        }
        bVar.getView().setOnClickListener(new $$Lambda$qtq$pZUfmTmg0IpUfsz9g5W6TJNm0iU(this, musicItem, i2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(MusicItem musicItem, int i2, View view) {
        this.j.onGroupHeaderClicked(musicItem, i2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Drawable a(ImageView imageView, Bitmap bitmap) {
        return new BitmapDrawable(imageView.getResources(), bitmap);
    }

    /* access modifiers changed from: private */
    public fqe i(ViewGroup viewGroup) {
        qxf a2 = qxf.a(viewGroup);
        fqf.a(a2);
        return a2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(fqe fqe, MusicItem musicItem, int i2) {
        fsa fsa = (fsa) fqe;
        fsa.a((CharSequence) musicItem.h());
        fsa.b(musicItem.i());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(fqe fqe, MusicItem musicItem, int i2) {
        ((frs) fqe).a((CharSequence) musicItem.h());
    }
}
