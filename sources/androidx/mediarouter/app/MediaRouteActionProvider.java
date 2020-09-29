package androidx.mediarouter.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.spotify.music.R;
import java.lang.ref.WeakReference;

public class MediaRouteActionProvider extends hu {
    private final ni a;
    private final a e;
    private nh f = nh.c;
    private mx g = mx.a();
    private MediaRouteButton h;

    static final class a extends defpackage.ni.a {
        private final WeakReference<MediaRouteActionProvider> a;

        public a(MediaRouteActionProvider mediaRouteActionProvider) {
            this.a = new WeakReference<>(mediaRouteActionProvider);
        }

        private void d(ni niVar) {
            MediaRouteActionProvider mediaRouteActionProvider = (MediaRouteActionProvider) this.a.get();
            if (mediaRouteActionProvider != null) {
                mediaRouteActionProvider.f();
            } else {
                niVar.a((defpackage.ni.a) this);
            }
        }

        public final void a(ni niVar) {
            d(niVar);
        }

        public final void a(ni niVar, f fVar) {
            d(niVar);
        }

        public final void b(ni niVar) {
            d(niVar);
        }

        public final void b(ni niVar, f fVar) {
            d(niVar);
        }

        public final void c(ni niVar) {
            d(niVar);
        }

        public final void c(ni niVar, f fVar) {
            d(niVar);
        }
    }

    public MediaRouteActionProvider(Context context) {
        super(context);
        this.a = ni.a(context);
        this.e = new a(this);
    }

    public final View a() {
        if (this.h != null) {
            Log.e("MRActionProvider", "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
        }
        this.h = new MediaRouteButton(this.b);
        MediaRouteButton mediaRouteButton = this.h;
        cr.a(mediaRouteButton, mediaRouteButton.getContext().getString(R.string.mr_button_content_description));
        MediaRouteButton mediaRouteButton2 = this.h;
        nh nhVar = this.f;
        if (nhVar != null) {
            if (!mediaRouteButton2.c.equals(nhVar)) {
                if (mediaRouteButton2.e) {
                    if (!mediaRouteButton2.c.c()) {
                        mediaRouteButton2.a.a((defpackage.ni.a) mediaRouteButton2.b);
                    }
                    if (!nhVar.c()) {
                        mediaRouteButton2.a.a(nhVar, mediaRouteButton2.b, 0);
                    }
                }
                mediaRouteButton2.c = nhVar;
                mediaRouteButton2.c();
            }
            MediaRouteButton mediaRouteButton3 = this.h;
            if (mediaRouteButton3.h) {
                mediaRouteButton3.h = false;
                mediaRouteButton3.b();
                mediaRouteButton3.c();
            }
            MediaRouteButton mediaRouteButton4 = this.h;
            mx mxVar = this.g;
            if (mxVar != null) {
                mediaRouteButton4.d = mxVar;
                mediaRouteButton4.setLayoutParams(new LayoutParams(-2, -1));
                return this.h;
            }
            throw new IllegalArgumentException("factory must not be null");
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final boolean b() {
        MediaRouteButton mediaRouteButton = this.h;
        if (mediaRouteButton != null) {
            return mediaRouteButton.a();
        }
        return false;
    }

    public final boolean d() {
        return true;
    }

    public final boolean e() {
        return ni.a(this.f, 1);
    }
}
