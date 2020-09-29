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

/* renamed from: jzd reason: default package */
public final class jzd {
    private static final Comparator<VideoSurfaceView> b = $$Lambda$jzd$xv5dUqrXky0PKusxP2Qx2Y40Hys.INSTANCE;
    final Set<a> a = new HashSet();
    private final OnAttachStateChangeListener c = new OnAttachStateChangeListener() {
        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            fay.a(view instanceof VideoSurfaceView, (Object) "The view must be an instance of VideoSurfaceView");
            jzd.this.b((VideoSurfaceView) view);
        }
    };
    /* access modifiers changed from: private */
    public final List<VideoSurfaceView> d = new ArrayList();

    /* renamed from: jzd$a */
    interface a {
        void c(VideoSurfaceView videoSurfaceView);

        void d(VideoSurfaceView videoSurfaceView);

        void i();

        void j();

        void k();
    }

    public final void a(final VideoSurfaceView videoSurfaceView) {
        if (!this.d.contains(videoSurfaceView)) {
            this.d.add(0, videoSurfaceView);
            Collections.sort(this.d, b);
            for (a i : this.a) {
                i.i();
            }
            videoSurfaceView.j = new $$Lambda$jzd$akEYXjZX10XYEWA85V6z6sG4zm8(this);
            videoSurfaceView.addOnAttachStateChangeListener(this.c);
            videoSurfaceView.g = new SurfaceTextureListener() {
                public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }

                public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                    jzd.a(jzd.this, videoSurfaceView);
                }

                public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                    jzd.b(jzd.this, videoSurfaceView);
                }

                public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    jzd.this.d.remove(videoSurfaceView);
                    jzd.this.c(videoSurfaceView);
                    return true;
                }
            };
        }
    }

    public final void b(VideoSurfaceView videoSurfaceView) {
        if (this.d.remove(videoSurfaceView)) {
            videoSurfaceView.j = null;
            videoSurfaceView.removeOnAttachStateChangeListener(this.c);
            c(videoSurfaceView);
        }
    }

    /* access modifiers changed from: 0000 */
    public final VideoSurfaceView a(jya jya) {
        for (VideoSurfaceView videoSurfaceView : this.d) {
            if (videoSurfaceView.a(jya)) {
                return videoSurfaceView;
            }
        }
        return null;
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
    public final void a(a aVar) {
        this.a.remove(aVar);
    }

    static /* synthetic */ void a(jzd jzd, VideoSurfaceView videoSurfaceView) {
        for (a d2 : jzd.a) {
            d2.d(videoSurfaceView);
        }
    }

    static /* synthetic */ void b(jzd jzd, VideoSurfaceView videoSurfaceView) {
        for (a c2 : jzd.a) {
            c2.c(videoSurfaceView);
        }
    }
}
