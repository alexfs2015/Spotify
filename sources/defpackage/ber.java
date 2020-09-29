package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import com.google.android.exoplayer2.util.EGLSurfaceTexture.GlException;

/* renamed from: ber reason: default package */
public final class ber extends Surface {
    private static int b;
    private static boolean c;
    private boolean a;
    private final a d;
    private boolean e;

    /* renamed from: ber$a */
    static class a extends HandlerThread implements Callback {
        Handler a;
        private EGLSurfaceTexture b;
        private Error c;
        private RuntimeException d;
        private ber e;

        public a() {
            super("dummySurface");
        }

        public final ber a(int i) {
            boolean z;
            start();
            this.a = new Handler(getLooper(), this);
            this.b = new EGLSurfaceTexture(this.a);
            synchronized (this) {
                z = false;
                this.a.obtainMessage(1, i, 0).sendToTarget();
                while (this.e == null && this.d == null && this.c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.d;
            if (runtimeException == null) {
                Error error = this.c;
                if (error == null) {
                    return (ber) bdl.a(this.e);
                }
                throw error;
            }
            throw runtimeException;
        }

        public final boolean handleMessage(Message message) {
            EGLSurface eGLSurface;
            Message message2 = message;
            int i = message2.what;
            if (i == 1) {
                try {
                    int i2 = message2.arg1;
                    bdl.a(this.b);
                    EGLSurfaceTexture eGLSurfaceTexture = this.b;
                    EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                    if (eglGetDisplay != null) {
                        int[] iArr = new int[2];
                        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                            eGLSurfaceTexture.c = eglGetDisplay;
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            int[] iArr2 = new int[1];
                            boolean eglChooseConfig = EGL14.eglChooseConfig(eGLSurfaceTexture.c, EGLSurfaceTexture.a, 0, eGLConfigArr, 0, 1, iArr2, 0);
                            if (!eglChooseConfig || iArr2[0] <= 0 || eGLConfigArr[0] == null) {
                                throw new GlException(ben.a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]), 0);
                            }
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            EGLContext eglCreateContext = EGL14.eglCreateContext(eGLSurfaceTexture.c, eGLConfig, EGL14.EGL_NO_CONTEXT, i2 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                            if (eglCreateContext != null) {
                                eGLSurfaceTexture.d = eglCreateContext;
                                EGLDisplay eGLDisplay = eGLSurfaceTexture.c;
                                EGLContext eGLContext = eGLSurfaceTexture.d;
                                if (i2 == 1) {
                                    eGLSurface = EGL14.EGL_NO_SURFACE;
                                } else {
                                    eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i2 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                                    if (eGLSurface == null) {
                                        throw new GlException("eglCreatePbufferSurface failed", 0);
                                    }
                                }
                                if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
                                    eGLSurfaceTexture.e = eGLSurface;
                                    GLES20.glGenTextures(1, eGLSurfaceTexture.b, 0);
                                    int glGetError = GLES20.glGetError();
                                    if (glGetError == 0) {
                                        eGLSurfaceTexture.f = new SurfaceTexture(eGLSurfaceTexture.b[0]);
                                        eGLSurfaceTexture.f.setOnFrameAvailableListener(eGLSurfaceTexture);
                                        this.e = new ber(this, (SurfaceTexture) bdl.a(this.b.f), i2 != 0, 0);
                                        synchronized (this) {
                                            notify();
                                        }
                                        return true;
                                    }
                                    StringBuilder sb = new StringBuilder("glGenTextures failed. Error: ");
                                    sb.append(Integer.toHexString(glGetError));
                                    throw new GlException(sb.toString(), 0);
                                }
                                throw new GlException("eglMakeCurrent failed", 0);
                            }
                            throw new GlException("eglCreateContext failed", 0);
                        }
                        throw new GlException("eglInitialize failed", 0);
                    }
                    throw new GlException("eglGetDisplay failed", 0);
                } catch (RuntimeException e2) {
                    bdu.b("DummySurface", "Failed to initialize dummy surface", e2);
                    this.d = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e3) {
                    try {
                        bdu.b("DummySurface", "Failed to initialize dummy surface", e3);
                        this.c = e3;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
            } else if (i != 2) {
                return true;
            } else {
                try {
                    bdl.a(this.b);
                    this.b.a();
                } catch (Throwable th2) {
                    quit();
                    throw th2;
                }
                quit();
                return true;
            }
        }
    }

    private ber(a aVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.d = aVar;
        this.a = z;
    }

    /* synthetic */ ber(a aVar, SurfaceTexture surfaceTexture, boolean z, byte b2) {
        this(aVar, surfaceTexture, z);
    }

    public static ber a(Context context, boolean z) {
        if (ben.a >= 17) {
            int i = 0;
            bdl.b(!z || a(context));
            a aVar = new a();
            if (z) {
                i = b;
            }
            return aVar.a(i);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    public static synchronized boolean a(Context context) {
        int i;
        int i2;
        synchronized (ber.class) {
            if (!c) {
                if (ben.a >= 24) {
                    if (ben.a < 26) {
                        if (!"samsung".equals(ben.c)) {
                            if ("XT1650".equals(ben.d)) {
                            }
                        }
                    }
                    if (ben.a >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                        if (eglQueryString != null) {
                            if (eglQueryString.contains("EGL_EXT_protected_content")) {
                                i2 = eglQueryString.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                                b = i2;
                                c = true;
                            }
                        }
                    }
                }
                i2 = 0;
                b = i2;
                c = true;
            }
            i = b;
        }
        return i != 0;
    }

    public final void release() {
        super.release();
        synchronized (this.d) {
            if (!this.e) {
                a aVar = this.d;
                bdl.a(aVar.a);
                aVar.a.sendEmptyMessage(2);
                this.e = true;
            }
        }
    }
}
