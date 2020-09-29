package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.view.Surface;
import com.android.opengl.util.GlUtil;
import com.android.opengl.util.GlUtil.UnsupportedEglVersionException;
import com.android.opengl.util.GlUtil.b;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.video.exo.AggregateException;

/* renamed from: fal reason: default package */
public final class fal extends bec {
    /* access modifiers changed from: private */
    public volatile boolean A;
    private final kas B;
    private float[] C;
    private final boolean l = false;
    private a m;
    private SurfaceTexture n;
    private int o;
    private int p;
    private com.android.opengl.util.GlUtil.a q;
    private com.android.opengl.util.GlUtil.a r;
    private b s;
    private int t;
    private Surface u;
    private int v;
    private int w;
    private EGLSurface x;
    private Surface y;
    /* access modifiers changed from: private */
    public volatile boolean z;

    /* renamed from: fal$a */
    static final class a {
        public EGLDisplay a;
        public EGLContext b;
        public EGLSurface c;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static fal a(Context context, asd<ash> asd, boolean z2, long j, Handler handler, beg beg, int i) {
        fal fal = new fal(context, asd, true, 5000, handler, new kas(beg, handler), 50);
        return fal;
    }

    private fal(Context context, asd<ash> asd, boolean z2, long j, Handler handler, kas kas, int i) {
        super(context, avy.a, j, asd, z2, handler, kas, i);
        this.B = kas;
    }

    private void y() {
        EGLSurface eGLSurface = this.x;
        if (eGLSurface != null && eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglMakeCurrent(this.m.a, this.m.c, this.m.c, this.m.b);
            EGL14.eglDestroySurface(this.m.a, this.x);
            int eglGetError = EGL14.eglGetError();
            if (eglGetError != 12288) {
                Logger.e("Error detaching the surface: %d", Integer.valueOf(eglGetError));
            }
        }
    }

    public final void handleMessage(int i, Object obj) {
        if (i == 1) {
            if (this.m == null) {
                this.m = new a(0);
                try {
                    this.m.a = GlUtil.a();
                    this.m.b = GlUtil.a(this.m.a);
                    this.m.c = GlUtil.b(this.m.a);
                    GlUtil.a(this.m.a, this.m.b, this.m.c, 1, 1);
                    this.p = GlUtil.a(false);
                    this.q = new com.android.opengl.util.GlUtil.a(this.p, "a_position");
                    this.r = new com.android.opengl.util.GlUtil.a(this.p, "a_texcoord");
                    this.s = new b(this.p, "tex_sampler_0");
                    this.t = GLES20.glGetUniformLocation(this.p, "u_transform_mat");
                    this.q.a(new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f}, 4);
                    this.r.a(new float[]{0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f}, 3);
                    this.o = GlUtil.b();
                    this.n = new SurfaceTexture(this.o);
                    this.y = new Surface(this.n);
                    super.handleMessage(1, this.y);
                    this.C = new float[16];
                    Matrix.setIdentityM(this.C, 0);
                    this.A = false;
                    this.n.setOnFrameAvailableListener(new OnFrameAvailableListener() {
                        public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                            fal.this.A = true;
                            fal.this.z = true;
                        }
                    });
                } catch (UnsupportedEglVersionException e) {
                    throw ExoPlaybackException.a(e, this.b);
                }
            }
            y();
            this.B.b = false;
            this.u = (Surface) obj;
            this.x = EGL14.EGL_NO_SURFACE;
            return;
        }
        super.handleMessage(i, obj);
    }

    public final void a(long j, long j2) {
        Surface surface = this.u;
        if (surface != null && surface.isValid() && this.A) {
            if (this.x == EGL14.EGL_NO_SURFACE) {
                Logger.b("Building output EGL surface", new Object[0]);
                this.x = GlUtil.a(this.m.a, (Object) this.u);
                int[] iArr = new int[1];
                EGL14.eglQuerySurface(this.m.a, this.x, 12375, iArr, 0);
                int[] iArr2 = new int[1];
                EGL14.eglQuerySurface(this.m.a, this.x, 12374, iArr2, 0);
                this.v = iArr[0];
                this.w = iArr2[0];
                this.z = true;
            }
            GlUtil.a(this.m.a, this.m.b, this.x, this.v, this.w);
            this.n.updateTexImage();
            this.n.getTransformMatrix(this.C);
            if (this.z) {
                GLES20.glUseProgram(this.p);
                GLES20.glUniformMatrix4fv(this.t, 1, false, this.C, 0);
                b bVar = this.s;
                bVar.b = this.o;
                bVar.c = 0;
                this.q.a();
                this.r.a();
                b bVar2 = this.s;
                if (bVar2.b != 0) {
                    GLES20.glActiveTexture(bVar2.c + 33984);
                    GLES20.glBindTexture(36197, bVar2.b);
                    GLES20.glUniform1i(bVar2.a, bVar2.c);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10242, 33071);
                    GLES20.glTexParameteri(3553, 10243, 33071);
                    GlUtil.e();
                    GLES20.glDrawArrays(5, 0, 4);
                    EGL14.eglSwapBuffers(this.m.a, this.x);
                    this.z = false;
                } else {
                    throw new IllegalStateException("call setSamplerTexId before bind");
                }
            }
            kas kas = this.B;
            Surface surface2 = this.u;
            if (!kas.b) {
                kas.b = true;
                kas.a.post(new Runnable(surface2) {
                    private /* synthetic */ Surface a;

                    {
                        this.a = r2;
                    }

                    public final void run() {
                        kas.this.c.a(this.a);
                    }
                });
            }
        }
        super.a(j, j2);
    }

    public final void x() {
        a aVar;
        AggregateException aggregateException = new AggregateException();
        if (this.m != null) {
            try {
                y();
            } catch (Exception e) {
                aggregateException.a(e);
            }
            try {
                aVar = this.m;
                GlUtil.a(aVar.a, aVar.b);
                aVar.a = null;
                aVar.b = null;
                aVar.c = null;
            } catch (Exception e2) {
                aggregateException.a(e2);
            } catch (Throwable th) {
                aVar.a = null;
                aVar.b = null;
                aVar.c = null;
                throw th;
            }
            this.y.release();
            this.n.release();
        }
        if (!aggregateException.mExceptionList.isEmpty()) {
            throw aggregateException;
        }
    }
}
