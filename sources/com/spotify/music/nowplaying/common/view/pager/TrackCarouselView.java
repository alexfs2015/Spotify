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

public class TrackCarouselView extends CarouselView implements tar {
    private CarouselLayoutManager N;
    private sxw O;
    /* access modifiers changed from: private */
    public a P;
    private final a Q;

    public TrackCarouselView(Context context) {
        this(context, null);
    }

    public TrackCarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Q = new a() {
            public final void a() {
                TrackCarouselView.this.P.a();
            }

            public final void b() {
                TrackCarouselView.this.P.b();
            }
        };
    }

    public final void a(sxz<iqu<PlayerTrack>> sxz) {
        super.a((a) sxz);
        this.N = new CarouselLayoutManager(MeasureMode.FILL);
        a((i) this.N);
        a((f) new uwa());
        this.O = new sxw(this, this.Q);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(PlayerTrack[] playerTrackArr, PlayerTrack playerTrack, PlayerTrack[] playerTrackArr2) {
        this.O.a(playerTrackArr, playerTrack, playerTrackArr2);
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

    /* access modifiers changed from: private */
    public /* synthetic */ void h(boolean z) {
        this.N.c = z;
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

    /* access modifiers changed from: private */
    public /* synthetic */ void g(boolean z) {
        this.N.d = z;
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
        this.O.e = z;
    }

    public final void f(boolean z) {
        this.O.d = z;
    }

    public final void a(a aVar) {
        this.P = aVar;
    }
}
