package com.spotify.mobile.android.video;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.video.thumbnails.ThumbnailView;
import com.spotify.music.R;
import java.util.List;

public class VideoSurfaceView extends FrameLayout implements azs {
    public SubtitlesView a;
    public ProgressBar b;
    public jxy c;
    public jzc d;
    public VideoSurfacePriority e = VideoSurfacePriority.MEDIUM;
    public Surface f;
    public SurfaceTextureListener g;
    public boolean h;
    public kcb i;
    public a j;
    private TextureView k;
    private ScaleType l = ScaleType.ASPECT_FIT;
    private Matrix m;
    private Handler n = new Handler();
    private int o;
    private int p;
    private View q;
    private ThumbnailView r;
    private TextView s;
    private final Runnable t = new Runnable() {
        public final void run() {
            if (VideoSurfaceView.this.b != null) {
                VideoSurfaceView.this.b.setVisibility(0);
            }
        }
    };
    private final SurfaceTextureListener u = new SurfaceTextureListener() {
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            VideoSurfaceView.this.f = new Surface(surfaceTexture);
            if (VideoSurfaceView.this.g != null) {
                VideoSurfaceView.this.g.onSurfaceTextureAvailable(surfaceTexture, i, i2);
            }
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            if (VideoSurfaceView.this.g != null) {
                VideoSurfaceView.this.g.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
            }
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            boolean onSurfaceTextureDestroyed = VideoSurfaceView.this.g != null ? VideoSurfaceView.this.g.onSurfaceTextureDestroyed(surfaceTexture) : true;
            if (VideoSurfaceView.this.f != null) {
                VideoSurfaceView.this.f.release();
            }
            return onSurfaceTextureDestroyed;
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (VideoSurfaceView.this.g != null) {
                VideoSurfaceView.this.g.onSurfaceTextureUpdated(surfaceTexture);
            }
        }
    };

    public enum ScaleType {
        ASPECT_FIT(16),
        ASPECT_FILL(32),
        STRETCH(64);
        
        final int mType;

        private ScaleType(int i) {
            this.mType = i;
        }
    }

    public interface a {
        void onPredicateChanged(VideoSurfaceView videoSurfaceView);
    }

    public VideoSurfaceView(Context context, boolean z) {
        super(context);
        a(context, z, VideoSurfacePriority.MEDIUM);
    }

    /* JADX INFO: finally extract failed */
    public VideoSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, defpackage.ksv.a.a, 0, 0);
        try {
            if (!obtainStyledAttributes.hasValue(defpackage.ksv.a.b)) {
                Assertion.b("fullscreen attribute on VideoSurfaceView must be explicitly defined!");
            }
            boolean z = obtainStyledAttributes.getBoolean(defpackage.ksv.a.b, false);
            VideoSurfacePriority a2 = VideoSurfacePriority.a(obtainStyledAttributes.getInt(defpackage.ksv.a.c, VideoSurfacePriority.MEDIUM.mValue));
            obtainStyledAttributes.recycle();
            a(context, z, a2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    VideoSurfaceView(Context context, TextureView textureView, ProgressBar progressBar, SubtitlesView subtitlesView, View view, kcb kcb, ThumbnailView thumbnailView, TextView textView, VideoSurfacePriority videoSurfacePriority) {
        super(context);
        this.k = textureView;
        this.b = progressBar;
        this.a = subtitlesView;
        this.q = view;
        this.i = kcb;
        this.r = thumbnailView;
        this.s = textView;
        this.e = videoSurfacePriority;
    }

    private void a(Context context, boolean z, VideoSurfacePriority videoSurfacePriority) {
        this.h = z;
        this.e = videoSurfacePriority;
        this.m = new Matrix();
        LayoutInflater.from(context).inflate(R.layout.video_surface_view, this, true);
        this.k = (TextureView) findViewById(R.id.texture_view);
        this.a = (SubtitlesView) findViewById(R.id.subtitle_view);
        this.b = (ProgressBar) findViewById(R.id.throbber);
        this.q = findViewById(R.id.seek_thumbnail);
        this.r = (ThumbnailView) findViewById(R.id.seek_thumbnail_image);
        this.s = (TextView) findViewById(R.id.seek_thumbnail_timestamp);
        this.k.setSurfaceTextureListener(this.u);
    }

    public final void a(List<azi> list) {
        SubtitlesView subtitlesView = this.a;
        if (subtitlesView != null) {
            if (list.size() > 0) {
                subtitlesView.setText(fau.a("\n").a((Iterable<?>) Lists.a(list, new Function<azi, CharSequence>() {
                    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
                        return ((azi) obj).a;
                    }
                })));
                subtitlesView.setVisibility(0);
                return;
            }
            subtitlesView.c();
        }
    }

    public final void a(ScaleType scaleType) {
        this.l = scaleType;
        SurfaceTextureListener surfaceTextureListener = this.u;
        TextureView textureView = this.k;
        surfaceTextureListener.onSurfaceTextureSizeChanged(textureView != null ? textureView.getSurfaceTexture() : null, getWidth(), getHeight());
    }

    public final void a() {
        a aVar = this.j;
        if (aVar != null) {
            aVar.onPredicateChanged(this);
        }
    }

    public final void a(int i2, int i3) {
        if (this.o != i2 || this.p != i3) {
            this.o = i2;
            this.p = i3;
            forceLayout();
            (getParent() != null ? getParent() : this).requestLayout();
        }
    }

    public final void b() {
        a(false);
        jzc jzc = this.d;
        if (jzc != null) {
            jzc.b();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011d, code lost:
        if (r13.l == com.spotify.mobile.android.video.VideoSurfaceView.ScaleType.a) goto L_0x0126;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x014d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            int r0 = r13.o
            r1 = 0
            if (r0 != 0) goto L_0x001a
            int r0 = r13.p
            if (r0 != 0) goto L_0x001a
            super.onMeasure(r14, r15)
            android.widget.ProgressBar r14 = r13.b
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            r14.measure(r15, r0)
            return
        L_0x001a:
            int r0 = r13.p
            double r2 = (double) r0
            int r0 = r13.o
            double r4 = (double) r0
            java.lang.Double.isNaN(r2)
            java.lang.Double.isNaN(r4)
            double r2 = r2 / r4
            int r0 = android.view.View.MeasureSpec.getMode(r14)
            int r4 = android.view.View.MeasureSpec.getMode(r15)
            com.spotify.mobile.android.video.VideoSurfaceView$ScaleType r5 = r13.l
            int r5 = r5.mType
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 1073741824(0x40000000, float:2.0)
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 1
            r10 = 2
            if (r0 != r8) goto L_0x0044
            int r0 = android.view.View.MeasureSpec.getSize(r14)
            r5 = r5 | r9
            goto L_0x004d
        L_0x0044:
            if (r0 != r7) goto L_0x0049
            r5 = r5 | r10
            r0 = 0
            goto L_0x004d
        L_0x0049:
            r5 = r5 | r9
            r0 = 2147483647(0x7fffffff, float:NaN)
        L_0x004d:
            if (r4 != r8) goto L_0x0056
            int r4 = android.view.View.MeasureSpec.getSize(r15)
            r5 = r5 | 4
            goto L_0x0061
        L_0x0056:
            if (r4 != r7) goto L_0x005c
            r5 = r5 | 8
            r4 = 0
            goto L_0x0061
        L_0x005c:
            r5 = r5 | 4
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x0061:
            r6 = 21
            if (r5 == r6) goto L_0x00ea
            r6 = 22
            if (r5 == r6) goto L_0x00da
            r6 = 25
            if (r5 == r6) goto L_0x00c8
            r2 = 26
            if (r5 == r2) goto L_0x00bf
            r2 = 37
            if (r5 == r2) goto L_0x00ea
            r2 = 38
            if (r5 == r2) goto L_0x00b4
            r2 = 41
            if (r5 == r2) goto L_0x00a9
            r2 = 42
            if (r5 == r2) goto L_0x00bf
            r2 = 69
            if (r5 == r2) goto L_0x00ea
            r2 = 70
            if (r5 == r2) goto L_0x00b4
            r2 = 73
            if (r5 == r2) goto L_0x00a9
            r0 = 74
            if (r5 == r0) goto L_0x00bf
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "Invalid combination: "
            r14.<init>(r15)
            java.lang.String r15 = java.lang.Integer.toHexString(r5)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            com.spotify.mobile.android.util.Assertion.a(r14)
            r14 = 0
            r15 = 0
            goto L_0x00f6
        L_0x00a9:
            int r14 = r13.o
            int r14 = java.lang.Math.min(r14, r0)
            int r15 = android.view.View.MeasureSpec.getSize(r15)
            goto L_0x00f6
        L_0x00b4:
            int r14 = android.view.View.MeasureSpec.getSize(r14)
            int r15 = r13.p
            int r15 = java.lang.Math.min(r15, r4)
            goto L_0x00f6
        L_0x00bf:
            int r14 = android.view.View.MeasureSpec.getSize(r14)
            int r15 = android.view.View.MeasureSpec.getSize(r15)
            goto L_0x00f6
        L_0x00c8:
            int r14 = android.view.View.MeasureSpec.getSize(r15)
            double r4 = (double) r14
            java.lang.Double.isNaN(r4)
            double r4 = r4 / r2
            int r15 = (int) r4
            int r15 = java.lang.Math.min(r15, r0)
            r12 = r15
            r15 = r14
            r14 = r12
            goto L_0x00f6
        L_0x00da:
            int r14 = android.view.View.MeasureSpec.getSize(r14)
            double r5 = (double) r14
            java.lang.Double.isNaN(r5)
            double r5 = r5 * r2
            int r15 = (int) r5
            int r15 = java.lang.Math.min(r15, r4)
            goto L_0x00f6
        L_0x00ea:
            int r14 = r13.o
            int r14 = java.lang.Math.min(r14, r0)
            int r15 = r13.p
            int r15 = java.lang.Math.min(r15, r4)
        L_0x00f6:
            int r0 = r13.p
            double r2 = (double) r0
            int r0 = r13.o
            double r4 = (double) r0
            java.lang.Double.isNaN(r2)
            java.lang.Double.isNaN(r4)
            double r2 = r2 / r4
            double r4 = (double) r14
            java.lang.Double.isNaN(r4)
            double r4 = r4 * r2
            int r0 = (int) r4
            if (r15 <= r0) goto L_0x0120
            com.spotify.mobile.android.video.VideoSurfaceView$ScaleType r4 = r13.l
            com.spotify.mobile.android.video.VideoSurfaceView$ScaleType r5 = com.spotify.mobile.android.video.VideoSurfaceView.ScaleType.ASPECT_FILL
            if (r4 != r5) goto L_0x0119
            double r4 = (double) r15
            java.lang.Double.isNaN(r4)
        L_0x0116:
            double r4 = r4 / r2
            int r0 = (int) r4
            goto L_0x0135
        L_0x0119:
            com.spotify.mobile.android.video.VideoSurfaceView$ScaleType r2 = r13.l
            com.spotify.mobile.android.video.VideoSurfaceView$ScaleType r3 = com.spotify.mobile.android.video.VideoSurfaceView.ScaleType.ASPECT_FIT
            if (r2 != r3) goto L_0x0134
            goto L_0x0126
        L_0x0120:
            com.spotify.mobile.android.video.VideoSurfaceView$ScaleType r4 = r13.l
            com.spotify.mobile.android.video.VideoSurfaceView$ScaleType r5 = com.spotify.mobile.android.video.VideoSurfaceView.ScaleType.ASPECT_FILL
            if (r4 != r5) goto L_0x0129
        L_0x0126:
            r2 = r0
            r0 = r14
            goto L_0x0136
        L_0x0129:
            com.spotify.mobile.android.video.VideoSurfaceView$ScaleType r0 = r13.l
            com.spotify.mobile.android.video.VideoSurfaceView$ScaleType r4 = com.spotify.mobile.android.video.VideoSurfaceView.ScaleType.ASPECT_FIT
            if (r0 != r4) goto L_0x0134
            double r4 = (double) r15
            java.lang.Double.isNaN(r4)
            goto L_0x0116
        L_0x0134:
            r0 = r14
        L_0x0135:
            r2 = r15
        L_0x0136:
            int[] r3 = new int[r10]
            r3[r1] = r0
            r3[r9] = r2
            r0 = r3[r1]
            r2 = r3[r9]
            int r3 = r14 - r0
            int r3 = r3 / r10
            int r4 = r15 - r2
            int r4 = r4 / r10
            r5 = 0
        L_0x0147:
            int r6 = r13.getChildCount()
            if (r5 >= r6) goto L_0x01e6
            android.view.View r6 = r13.getChildAt(r5)
            android.widget.ProgressBar r7 = r13.b
            if (r6 != r7) goto L_0x0161
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            r6.measure(r7, r9)
            goto L_0x018a
        L_0x0161:
            android.view.View r7 = r13.q
            if (r6 != r7) goto L_0x017f
            r7 = 2131430391(0x7f0b0bf7, float:1.8482482E38)
            android.view.View r7 = r6.findViewById(r7)
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            float r9 = (float) r15
            r10 = 1050253722(0x3e99999a, float:0.3)
            float r9 = r9 * r10
            int r9 = (int) r9
            r7.height = r9
            float r9 = (float) r14
            float r9 = r9 * r10
            int r9 = (int) r9
            r7.width = r9
        L_0x017f:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r8)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r8)
            r6.measure(r7, r9)
        L_0x018a:
            com.spotify.mobile.android.video.SubtitlesView r7 = r13.a
            if (r6 != r7) goto L_0x01e2
            android.content.res.Resources r6 = r13.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            com.spotify.mobile.android.video.SubtitlesView r7 = r13.a
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r7 = (android.widget.FrameLayout.LayoutParams) r7
            int r9 = r13.getWidth()
            float r9 = (float) r9
            r10 = 1015222895(0x3c83126f, float:0.016)
            float r9 = r9 * r10
            float r9 = r9 * r6
            int r9 = (int) r9
            int r10 = r15 / 2
            int r11 = r2 / 2
            int r10 = r10 - r11
            int r10 = r10 + r9
            r7.setMargins(r1, r1, r1, r10)
            com.spotify.mobile.android.video.SubtitlesView r9 = r13.a
            r9.setLayoutParams(r7)
            int r7 = r13.getWidth()
            float r7 = (float) r7
            r9 = 989399404(0x3af9096c, float:0.0019)
            float r7 = r7 * r9
            r9 = 1073741824(0x40000000, float:2.0)
            float r7 = java.lang.Math.max(r9, r7)
            float r7 = r7 * r6
            int r6 = (int) r7
            int r7 = r13.getWidth()
            float r7 = (float) r7
            r9 = 1012202996(0x3c54fdf4, float:0.013)
            float r7 = r7 * r9
            com.spotify.mobile.android.video.SubtitlesView r9 = r13.a
            r9.setTextSize(r7)
            com.spotify.mobile.android.video.SubtitlesView r7 = r13.a
            r7.setPadding(r6, r6, r6, r6)
        L_0x01e2:
            int r5 = r5 + 1
            goto L_0x0147
        L_0x01e6:
            android.view.TextureView r1 = r13.k
            android.graphics.Matrix r5 = r13.m
            r1.getTransform(r5)
            android.graphics.Matrix r1 = r13.m
            float r0 = (float) r0
            float r5 = (float) r14
            float r0 = r0 / r5
            float r2 = (float) r2
            float r5 = (float) r15
            float r2 = r2 / r5
            r1.setScale(r0, r2)
            android.graphics.Matrix r0 = r13.m
            float r1 = (float) r3
            float r2 = (float) r4
            r0.postTranslate(r1, r2)
            android.view.TextureView r0 = r13.k
            android.graphics.Matrix r1 = r13.m
            r0.setTransform(r1)
            r13.setMeasuredDimension(r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.video.VideoSurfaceView.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        int paddingLeft = getPaddingLeft();
        int paddingRight = (((i4 - i2) - getPaddingRight()) - paddingLeft) / 2;
        int paddingBottom = (((i5 - i3) - getPaddingBottom()) - getPaddingTop()) / 2;
        int measuredWidth = this.b.getMeasuredWidth() / 2;
        int measuredHeight = this.b.getMeasuredHeight() / 2;
        this.b.layout(paddingRight - measuredWidth, paddingBottom - measuredHeight, paddingRight + measuredWidth, paddingBottom + measuredHeight);
    }

    public final boolean a(jya jya) {
        if (this.k == null) {
            return false;
        }
        jxy jxy = this.c;
        if (jxy != null) {
            return jxy.a(jya);
        }
        return true;
    }

    public final void a(boolean z) {
        if (z) {
            this.n.postDelayed(this.t, 800);
            return;
        }
        this.n.removeCallbacks(this.t);
        this.b.setVisibility(8);
    }
}
