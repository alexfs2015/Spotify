package androidx.mediarouter.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.spotify.music.R;
import java.lang.ref.WeakReference;

public class MediaRouteActionProvider extends hu {
    private final nd a;
    private final a e;
    private nc f = nc.c;
    private ms g = ms.a();
    private MediaRouteButton h;

    static final class a extends defpackage.nd.a {
        private final WeakReference<MediaRouteActionProvider> a;

        public a(MediaRouteActionProvider mediaRouteActionProvider) {
            this.a = new WeakReference<>(mediaRouteActionProvider);
        }

        public final void a(nd ndVar, f fVar) {
            d(ndVar);
        }

        public final void b(nd ndVar, f fVar) {
            d(ndVar);
        }

        public final void c(nd ndVar, f fVar) {
            d(ndVar);
        }

        public final void a(nd ndVar) {
            d(ndVar);
        }

        public final void b(nd ndVar) {
            d(ndVar);
        }

        public final void c(nd ndVar) {
            d(ndVar);
        }

        private void d(nd ndVar) {
            MediaRouteActionProvider mediaRouteActionProvider = (MediaRouteActionProvider) this.a.get();
            if (mediaRouteActionProvider != null) {
                mediaRouteActionProvider.f();
            } else {
                ndVar.a((defpackage.nd.a) this);
            }
        }
    }

    public final boolean d() {
        return true;
    }

    public MediaRouteActionProvider(Context context) {
        super(context);
        this.a = nd.a(context);
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
        nc ncVar = this.f;
        if (ncVar != null) {
            if (!mediaRouteButton2.c.equals(ncVar)) {
                if (mediaRouteButton2.e) {
                    if (!mediaRouteButton2.c.c()) {
                        mediaRouteButton2.a.a((defpackage.nd.a) mediaRouteButton2.b);
                    }
                    if (!ncVar.c()) {
                        mediaRouteButton2.a.a(ncVar, mediaRouteButton2.b, 0);
                    }
                }
                mediaRouteButton2.c = ncVar;
                mediaRouteButton2.c();
            }
            MediaRouteButton mediaRouteButton3 = this.h;
            if (mediaRouteButton3.h) {
                mediaRouteButton3.h = false;
                mediaRouteButton3.b();
                mediaRouteButton3.c();
            }
            MediaRouteButton mediaRouteButton4 = this.h;
            ms msVar = this.g;
            if (msVar != null) {
                mediaRouteButton4.d = msVar;
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

    public final boolean e() {
        return nd.a(this.f, 1);
    }
}
