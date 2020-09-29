package com.spotify.music.nowplaying.common.view.pager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.f;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.paste.widgets.carousel.CarouselLayoutManager;
import com.spotify.paste.widgets.carousel.CarouselLayoutManager.MeasureMode;
import com.spotify.paste.widgets.carousel.CarouselView;

public class TrackCarouselView extends CarouselView implements tky {
    private CarouselLayoutManager M;
    private tid N;
    /* access modifiers changed from: private */
    public a O;
    private final a P;

    public TrackCarouselView(Context context) {
        this(context, null);
    }

    public TrackCarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.P = new a() {
            public final void a() {
                TrackCarouselView.this.O.a();
            }

            public final void b() {
                TrackCarouselView.this.O.b();
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(PlayerTrack[] playerTrackArr, PlayerTrack playerTrack, PlayerTrack[] playerTrackArr2) {
        this.N.a(playerTrackArr, playerTrack, playerTrackArr2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(boolean z) {
        this.M.d = z;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(boolean z) {
        this.M.c = z;
    }

    public final void a(tig<ith<PlayerTrack>> tig) {
        super.a((a) tig);
        this.M = new CarouselLayoutManager(MeasureMode.FILL);
        a((i) this.M);
        a((f) new vhq());
        this.N = new tid(this, this.P);
    }

    public final void a(a aVar) {
        this.O = aVar;
    }

    public final void a(PlayerTrack[] playerTrackArr, PlayerTrack playerTrack, PlayerTrack[] playerTrackArr2) {
        post(new Runnable(playerTrackArr, playerTrack, playerTrackArr2) {
            private final /* synthetic */ PlayerTrack[] f$1;
            private final /* synthetic */ PlayerTrack f$2;
            private final /* synthetic */ PlayerTrack[] f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                TrackCarouselView.this.b(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    public final void c(boolean z) {
        post(new Runnable(z) {
            private final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                TrackCarouselView.this.h(this.f$1);
            }
        });
    }

    public final void d(boolean z) {
        post(new Runnable(z) {
            private final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                TrackCarouselView.this.g(this.f$1);
            }
        });
    }

    public final void e(boolean z) {
        this.N.e = z;
    }

    public final void f(boolean z) {
        this.N.d = z;
    }
}
