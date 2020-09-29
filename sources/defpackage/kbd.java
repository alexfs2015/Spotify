package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.spotify.mobile.android.video.VideoSurfaceView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: kbd reason: default package */
public final class kbd {
    private static final Comparator<VideoSurfaceView> b = $$Lambda$kbd$wpydTRBlwvFOJ6aprAZwhmSQIfw.INSTANCE;
    final Set<a> a = new HashSet();
    private final OnAttachStateChangeListener c = new OnAttachStateChangeListener() {
        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            fbp.a(view instanceof VideoSurfaceView, (Object) "The view must be an instance of VideoSurfaceView");
            kbd.this.b((VideoSurfaceView) view);
        }
    };
    /* access modifiers changed from: private */
    public final List<VideoSurfaceView> d = new ArrayList();

    /* renamed from: kbd$a */
    interface a {
        void c(VideoSurfaceView videoSurfaceView);

        void d(VideoSurfaceView videoSurfaceView);

        void i();

        void j();

        void k();
    }

    static /* synthetic */ void a(kbd kbd, VideoSurfaceView videoSurfaceView) {
        for (a d2 : kbd.a) {
            d2.d(videoSurfaceView);
        }
    }

    static /* synthetic */ void b(kbd kbd, VideoSurfaceView videoSurfaceView) {
        for (a c2 : kbd.a) {
            c2.c(videoSurfaceView);
        }
    }

    /* access modifiers changed from: private */
    public void c(VideoSurfaceView videoSurfaceView) {
        for (a j : this.a) {
            j.j();
        }
    }

    /* access modifiers changed from: private */
    public void d(VideoSurfaceView videoSurfaceView) {
        for (a k : this.a) {
            k.k();
        }
    }

    /* access modifiers changed from: 0000 */
    public final VideoSurfaceView a(kaa kaa) {
        for (VideoSurfaceView videoSurfaceView : this.d) {
            if (videoSurfaceView.a(kaa)) {
                return videoSurfaceView;
            }
        }
        return null;
    }

    public final void a(final VideoSurfaceView videoSurfaceView) {
        if (!this.d.contains(videoSurfaceView)) {
            this.d.add(0, videoSurfaceView);
            Collections.sort(this.d, b);
            for (a i : this.a) {
                i.i();
            }
            videoSurfaceView.j = new $$Lambda$kbd$h8Vne9Rl_wiUxzAoZNrYIDx8xU4(this);
            videoSurfaceView.addOnAttachStateChangeListener(this.c);
            videoSurfaceView.g = new SurfaceTextureListener() {
                public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                    kbd.a(kbd.this, videoSurfaceView);
                }

                public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    kbd.this.d.remove(videoSurfaceView);
                    kbd.this.c(videoSurfaceView);
                    return true;
                }

                public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                    kbd.b(kbd.this, videoSurfaceView);
                }

                public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }
            };
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(a aVar) {
        this.a.remove(aVar);
    }

    public final void b(VideoSurfaceView videoSurfaceView) {
        if (this.d.remove(videoSurfaceView)) {
            videoSurfaceView.j = null;
            videoSurfaceView.removeOnAttachStateChangeListener(this.c);
            c(videoSurfaceView);
        }
    }
}
