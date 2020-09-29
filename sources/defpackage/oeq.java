package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.m;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.music.R;
import com.spotify.music.features.nowplayingbar.view.carousel.CarouselView;
import com.spotify.paste.spotifyicon.SpotifyIconView;

/* renamed from: oeq reason: default package */
public final class oeq implements kmm<ofi, odq> {
    public final View a;
    /* access modifiers changed from: private */
    public final FrameLayout b = ((FrameLayout) this.a.findViewById(R.id.accessory_container));
    private final SpotifyIconView c = ((SpotifyIconView) this.a.findViewById(R.id.accessory_button));
    /* access modifiers changed from: private */
    public final VideoSurfaceView d = ((VideoSurfaceView) this.a.findViewById(R.id.video_surface));
    /* access modifiers changed from: private */
    public final kbd e;
    /* access modifiers changed from: private */
    public final ImageButton f = ((ImageButton) this.a.findViewById(R.id.play_pause_button));
    private final ImageButton g = ((ImageButton) this.a.findViewById(R.id.skip_next_button));
    /* access modifiers changed from: private */
    public final CarouselView h = ((CarouselView) this.a.findViewById(R.id.tracks_carousel_view));
    /* access modifiers changed from: private */
    public final oew i;
    /* access modifiers changed from: private */
    public final oes j;
    /* access modifiers changed from: private */
    public final jut<ProgressBar> k = new jut<>((ProgressBar) this.a.findViewById(R.id.progress_bar), Optional.e());
    /* access modifiers changed from: private */
    public final knw<Boolean> l;
    private final Resources m;
    /* access modifiers changed from: private */
    public final oel n;

    public oeq(LayoutInflater layoutInflater, ViewGroup viewGroup, knw<Boolean> knw, Resources resources, kbd kbd, oes oes, oel oel) {
        this.m = resources;
        this.e = kbd;
        this.j = oes;
        this.l = knw;
        this.n = oel;
        this.a = layoutInflater.inflate(R.layout.now_playing_bar, viewGroup, false);
        this.i = new oew(resources);
        this.h.a((a) this.i);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ofh a(ofg ofg, ofm ofm) {
        return new ofa(ofm, ofg);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Context context, a aVar) {
        this.e.b(this.d);
        this.c.setVisibility(0);
        this.d.setVisibility(8);
        this.c.setImageDrawable((Drawable) aVar.a.apply(context));
        this.c.setContentDescription(this.m.getString(aVar.b));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Context context, b bVar) {
        this.e.b(this.d);
        this.c.setVisibility(0);
        this.d.setVisibility(8);
        this.c.setImageDrawable((Drawable) bVar.a.apply(context));
        this.c.setContentDescription(this.m.getString(bVar.c));
        this.c.setActivated(bVar.b);
    }

    static /* synthetic */ void a(oeq oeq, b bVar) {
        oez oez = bVar.b;
        Context context = oeq.b.getContext();
        oez.a(new $$Lambda$oeq$qWPDkf9077_gMXcE4RgNSfG5bfI(oeq, context), new $$Lambda$oeq$Nk1hyeHeLnoCwvPzrEy6OvWCEO0(oeq, context), new $$Lambda$oeq$rr_ODNLIOF82WzNyyptBhNpzUig(oeq));
        ofj ofj = bVar.c;
        ImageButton imageButton = oeq.f;
        imageButton.setImageDrawable((Drawable) ofj.a().apply(imageButton.getContext()));
        oeq.f.setContentDescription(oeq.m.getString(ofj.b()));
        ofl ofl = bVar.d;
        ImageButton imageButton2 = oeq.g;
        imageButton2.setImageDrawable(vdd.f(imageButton2.getContext()));
        oeq.g.setEnabled(ofl.a());
        ImageButton imageButton3 = oeq.g;
        imageButton3.setVisibility(((Boolean) ofl.b().apply(imageButton3.getContext())).booleanValue() ? 0 : 8);
        ofn ofn = bVar.a;
        ofg ofg = bVar.e;
        oew oew = oeq.i;
        ImmutableList<ofh> immutableList = (ImmutableList) fbp.a(ImmutableList.a(fcp.a((Iterable<E>) ofn.a()).a((Function<? super E, T>) new $$Lambda$oeq$YwP1Th2_OKj27eYNazkbqq0g4aM<Object,T>(ofg)).a()));
        b a2 = oa.a(new oeu(oew.a, oew.e, immutableList));
        oew.e = immutableList;
        a2.a((a) oew);
        oeq.h.d(ofn.b());
        oeq.h.L.c = ofn.c();
        oeq.h.L.d = ofn.d();
        ofk ofk = bVar.f;
        oeq.k.a(ofk.a(), ofk.b(), ofk.c());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        this.c.setVisibility(8);
        this.d.setVisibility(0);
        this.e.a(this.d);
    }

    public final kmn<ofi> connect(knw<odq> knw) {
        kmn connect = this.n.connect(knw);
        this.a.setOnClickListener(new $$Lambda$oeq$J_lpIzs38vohxsTUSdwjwf1z9PM(connect));
        this.i.d = new $$Lambda$oeq$2pjhV9TNZsFAn4Kv7hWGSZ358E(connect);
        this.b.setOnClickListener(new $$Lambda$oeq$iS573uNMDA33Gb24w3vEoNNwYg(connect));
        this.f.setOnClickListener(new $$Lambda$oeq$2V8WdIQnkbvgNDDhcuFKeIHIls(connect));
        this.g.setOnClickListener(new $$Lambda$oeq$qt6GNg46V4wvifZF6byijlGEs(connect));
        CarouselView carouselView = this.h;
        $$Lambda$oeq$WRM0p5dxLxrpQlBaYeWXyQfqYpQ r1 = new $$Lambda$oeq$WRM0p5dxLxrpQlBaYeWXyQfqYpQ(connect);
        $$Lambda$oeq$_SF3nD4zzebX3Bgk0U_mH9PN2Z4 r2 = new $$Lambda$oeq$_SF3nD4zzebX3Bgk0U_mH9PN2Z4(connect);
        carouselView.M = r1;
        carouselView.N = r2;
        carouselView.a((m) this.j);
        return new kmn<ofi>() {
            /* access modifiers changed from: private */
            public /* synthetic */ void a(a aVar) {
                oeq.this.n.a((oeo) null);
                oeq.this.l.accept(Boolean.FALSE);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(b bVar) {
                oeq.this.n.a(bVar.g);
                oeq.a(oeq.this, bVar);
                oeq.this.l.accept(Boolean.TRUE);
            }

            public final /* synthetic */ void accept(Object obj) {
                ((ofi) obj).a(new $$Lambda$oeq$1$2OcTA9bGEKEODwby6jB79Uj4UBU(this), new $$Lambda$oeq$1$oqyzkpcQqSyA5hVQqQYa_wzoc8(this));
            }

            public final void dispose() {
                oeq.this.a.setOnClickListener(null);
                oeq.this.i.d = null;
                oeq.this.b.setOnClickListener(null);
                oeq.this.f.setOnClickListener(null);
                oeq.this.k.a();
                oeq.this.h.b((m) oeq.this.j);
                oeq.this.e.b(oeq.this.d);
            }
        };
    }
}
