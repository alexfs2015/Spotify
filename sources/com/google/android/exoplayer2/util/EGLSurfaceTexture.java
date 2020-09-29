package com.google.android.exoplayer2.util;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

public final class EGLSurfaceTexture implements OnFrameAvailableListener, Runnable {
    public static final int[] a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public final int[] b;
    public EGLDisplay c;
    public EGLContext d;
    public EGLSurface e;
    public SurfaceTexture f;
    private final Handler g;
    private final a h;

    public static final class GlException extends RuntimeException {
        public /* synthetic */ GlException(String str, byte b) {
            this(str);
        }

        private GlException(String str) {
            super(str);
        }
    }

    public interface a {
    }

    public EGLSurfaceTexture(Handler handler) {
        this(handler, null);
    }

    private EGLSurfaceTexture(Handler handler, a aVar) {
        this.g = handler;
        this.h = null;
        this.b = new int[1];
    }

    public final void a() {
        this.g.removeCallbacks(this);
        try {
            if (this.f != null) {
                this.f.release();
                GLES20.glDeleteTextures(1, this.b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.c, this.e);
            }
            EGLContext eGLContext = this.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.c, eGLContext);
            }
            if (bdw.a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.c);
            }
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.g.post(this);
    }

    public final void run() {
        SurfaceTexture surfaceTexture = this.f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
