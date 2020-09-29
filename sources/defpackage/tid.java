package defpackage;

import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.paste.widgets.carousel.CarouselLayoutManager;
import com.spotify.paste.widgets.carousel.CarouselView;
import com.spotify.paste.widgets.carousel.CarouselView.c;

/* renamed from: tid reason: default package */
public final class tid {
    final CarouselView a;
    final a b;
    int c;
    public boolean d;
    public boolean e;
    private final tig<?> f;
    private int g = -1;

    /* renamed from: tid$a */
    public interface a {
        void a();

        void b();
    }

    public tid(CarouselView carouselView, a aVar) {
        this.b = (a) fbp.a(aVar);
        this.a = (CarouselView) fbp.a(carouselView);
        CarouselView carouselView2 = this.a;
        ((vht) carouselView2.d()).a((defpackage.vht.a) new $$Lambda$tid$dUBEjPcKRrnFu6pYvWgZjrb8zXM(this));
        fbp.a(carouselView.c() instanceof tig, (Object) "Carousel must have a PlayerTracksCarouselAdapter.");
        this.f = (tig) fbp.a((tig) carouselView.c());
        this.a.a((com.spotify.paste.widgets.carousel.CarouselView.a) new c() {
            public final void a(int i) {
                if (i > tid.this.c) {
                    tid.this.b.a();
                } else if (i < tid.this.c) {
                    tid.this.b.b();
                }
                tid.this.c = i;
            }

            public final void a(int i, int i2, float f) {
                super.a(i, i2, f);
                tid tid = tid.this;
                if (((CarouselLayoutManager) fbp.a((CarouselLayoutManager) tid.a.d())).e) {
                    if (i < i2 && tid.d) {
                        tid.a(i2);
                    } else if (i > i2 && tid.e) {
                        tid.a(i2);
                    }
                }
            }

            public final void b(int i) {
                super.b(i);
                u g = tid.this.a.g(i);
                if (g instanceof tio) {
                    ((tio) g).A();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        int i = this.g;
        if (i != -1 && z) {
            this.a.f(i);
            this.g = -1;
        }
    }

    private void a(PlayerTrack[] playerTrackArr, PlayerTrack playerTrack, PlayerTrack[] playerTrackArr2, Handler handler) {
        int length = playerTrackArr != null ? playerTrackArr.length : 0;
        boolean a2 = this.f.a();
        int a3 = this.f.a(playerTrackArr, playerTrack, playerTrackArr2, handler);
        if (a3 != 0 || this.c != length) {
            tmy.a(playerTrack);
            tmy.a(playerTrackArr2);
            tmy.a(playerTrackArr);
            if (a2 || a3 == 2) {
                this.a.d(length);
            } else if (a3 == 1) {
                this.g = length;
            } else if (this.c != length) {
                this.a.f(length);
            }
            this.c = length;
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(int i) {
        u g2 = this.a.g(i);
        if (g2 instanceof tio) {
            ((tio) g2).aQ_();
        }
    }

    public final void a(PlayerTrack[] playerTrackArr, PlayerTrack playerTrack, PlayerTrack[] playerTrackArr2) {
        a(playerTrackArr, playerTrack, playerTrackArr2, new Handler());
    }
}
