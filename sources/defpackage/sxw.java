package defpackage;

import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.paste.widgets.carousel.CarouselLayoutManager;
import com.spotify.paste.widgets.carousel.CarouselView;
import com.spotify.paste.widgets.carousel.CarouselView.c;

/* renamed from: sxw reason: default package */
public final class sxw {
    final CarouselView a;
    final a b;
    int c;
    public boolean d;
    public boolean e;
    private final sxz<?> f;
    private int g = -1;

    /* renamed from: sxw$a */
    public interface a {
        void a();

        void b();
    }

    public sxw(CarouselView carouselView, a aVar) {
        this.b = (a) fay.a(aVar);
        this.a = (CarouselView) fay.a(carouselView);
        CarouselView carouselView2 = this.a;
        ((uwd) carouselView2.d()).a((defpackage.uwd.a) new $$Lambda$sxw$lVKrRMJSFEwfhcDGqT8HuuEdmEY(this));
        fay.a(carouselView.c() instanceof sxz, (Object) "Carousel must have a PlayerTracksCarouselAdapter.");
        this.f = (sxz) fay.a((sxz) carouselView.c());
        this.a.a((com.spotify.paste.widgets.carousel.CarouselView.a) new c() {
            public final void a(int i) {
                if (i > sxw.this.c) {
                    sxw.this.b.a();
                } else if (i < sxw.this.c) {
                    sxw.this.b.b();
                }
                sxw.this.c = i;
            }

            public final void a(int i, int i2, float f) {
                super.a(i, i2, f);
                sxw sxw = sxw.this;
                if (((CarouselLayoutManager) fay.a((CarouselLayoutManager) sxw.a.d())).e) {
                    if (i < i2 && sxw.d) {
                        sxw.a(i2);
                    } else if (i > i2 && sxw.e) {
                        sxw.a(i2);
                    }
                }
            }

            public final void b(int i) {
                super.b(i);
                u g = sxw.this.a.g(i);
                if (g instanceof syh) {
                    ((syh) g).z();
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

    public final void a(PlayerTrack[] playerTrackArr, PlayerTrack playerTrack, PlayerTrack[] playerTrackArr2) {
        a(playerTrackArr, playerTrack, playerTrackArr2, new Handler());
    }

    private void a(PlayerTrack[] playerTrackArr, PlayerTrack playerTrack, PlayerTrack[] playerTrackArr2, Handler handler) {
        int length = playerTrackArr != null ? playerTrackArr.length : 0;
        boolean a2 = this.f.a();
        int a3 = this.f.a(playerTrackArr, playerTrack, playerTrackArr2, handler);
        if (a3 != 0 || this.c != length) {
            tcr.a(playerTrack);
            tcr.a(playerTrackArr2);
            tcr.a(playerTrackArr);
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
        if (g2 instanceof syh) {
            ((syh) g2).aS_();
        }
    }
}
