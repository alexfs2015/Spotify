package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@cey
/* renamed from: cro reason: default package */
public final class cro extends Thread implements OnFrameAvailableListener, crn {
    private static final float[] e = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private volatile boolean A;
    private volatile boolean B;
    float a;
    float b;
    int c;
    int d;
    private final crl f;
    private final float[] g;
    private final float[] h;
    private final float[] i;
    private final float[] j;
    private final float[] k;
    private final float[] l;
    private final float[] m;
    private float n;
    private SurfaceTexture o;
    private SurfaceTexture p;
    private int q;
    private int r;
    private int s;
    private FloatBuffer t = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
    private final CountDownLatch u;
    private final Object v;
    private EGL10 w;
    private EGLDisplay x;
    private EGLContext y;
    private EGLSurface z;

    private static int a(int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        a("createShader");
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        a("shaderSource");
        GLES20.glCompileShader(glCreateShader);
        a("compileShader");
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        a("getShaderiv");
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Could not compile shader ");
        sb.append(i2);
        sb.append(":");
        String str2 = "SphericalVideoRenderer";
        Log.e(str2, sb.toString());
        Log.e(str2, GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        a("deleteShader");
        return 0;
    }

    private static void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    private static void a(float[] fArr, float f2) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d2 = (double) f2;
        fArr[4] = (float) Math.cos(d2);
        fArr[5] = (float) (-Math.sin(d2));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d2);
        fArr[8] = (float) Math.cos(d2);
    }

    private static void a(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    private static void b(float[] fArr, float f2) {
        double d2 = (double) f2;
        fArr[0] = (float) Math.cos(d2);
        fArr[1] = (float) (-Math.sin(d2));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d2);
        fArr[4] = (float) Math.cos(d2);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private final boolean d() {
        EGLSurface eGLSurface = this.z;
        boolean z2 = false;
        if (!(eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE)) {
            EGL10 egl10 = this.w;
            EGLDisplay eGLDisplay = this.x;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            z2 = this.w.eglDestroySurface(this.x, this.z) | egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT) | false;
            this.z = null;
        }
        EGLContext eGLContext = this.y;
        if (eGLContext != null) {
            z2 |= this.w.eglDestroyContext(this.x, eGLContext);
            this.y = null;
        }
        EGLDisplay eGLDisplay2 = this.x;
        if (eGLDisplay2 == null) {
            return z2;
        }
        boolean eglTerminate = z2 | this.w.eglTerminate(eGLDisplay2);
        this.x = null;
        return eglTerminate;
    }

    public final void a() {
        synchronized (this.v) {
            this.v.notifyAll();
        }
    }

    public final void a(int i2, int i3) {
        synchronized (this.v) {
            this.d = i2;
            this.c = i3;
            this.A = true;
            this.v.notifyAll();
        }
    }

    public final void a(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.d = i2;
        this.c = i3;
        this.p = surfaceTexture;
    }

    public final void b() {
        synchronized (this.v) {
            this.B = true;
            this.p = null;
            this.v.notifyAll();
        }
    }

    public final SurfaceTexture c() {
        if (this.p == null) {
            return null;
        }
        try {
            this.u.await();
        } catch (InterruptedException unused) {
        }
        return this.o;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.s++;
        synchronized (this.v) {
            this.v.notifyAll();
        }
    }

    public cro(Context context) {
        super("SphericalVideoProcessor");
        this.t.put(e).position(0);
        this.g = new float[9];
        this.h = new float[9];
        this.i = new float[9];
        this.j = new float[9];
        this.k = new float[9];
        this.l = new float[9];
        this.m = new float[9];
        this.n = Float.NaN;
        this.f = new crl(context);
        this.f.c = this;
        this.u = new CountDownLatch(1);
        this.v = new Object();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x03ac */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01db A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            android.graphics.SurfaceTexture r0 = r15.p
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "SphericalVideoProcessor started with no output texture."
            defpackage.clu.a(r0)
            java.util.concurrent.CountDownLatch r0 = r15.u
            r0.countDown()
            return
        L_0x000f:
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
            r15.w = r0
            javax.microedition.khronos.egl.EGL10 r0 = r15.w
            java.lang.Object r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglGetDisplay(r1)
            r15.x = r0
            javax.microedition.khronos.egl.EGLDisplay r0 = r15.x
            javax.microedition.khronos.egl.EGLDisplay r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            r2 = 11
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 0
            if (r0 != r1) goto L_0x0031
        L_0x002e:
            r0 = 0
            goto L_0x009e
        L_0x0031:
            int[] r0 = new int[r4]
            javax.microedition.khronos.egl.EGL10 r1 = r15.w
            javax.microedition.khronos.egl.EGLDisplay r8 = r15.x
            boolean r0 = r1.eglInitialize(r8, r0)
            if (r0 != 0) goto L_0x003e
            goto L_0x002e
        L_0x003e:
            int[] r0 = new int[r6]
            javax.microedition.khronos.egl.EGLConfig[] r1 = new javax.microedition.khronos.egl.EGLConfig[r6]
            int[] r10 = new int[r2]
            r10 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r8 = r15.w
            javax.microedition.khronos.egl.EGLDisplay r9 = r15.x
            r12 = 1
            r11 = r1
            r13 = r0
            boolean r8 = r8.eglChooseConfig(r9, r10, r11, r12, r13)
            if (r8 == 0) goto L_0x005b
            r0 = r0[r7]
            if (r0 <= 0) goto L_0x005b
            r0 = r1[r7]
            goto L_0x005c
        L_0x005b:
            r0 = r5
        L_0x005c:
            if (r0 != 0) goto L_0x005f
            goto L_0x002e
        L_0x005f:
            int[] r1 = new int[r3]
            r1 = {12440, 2, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r8 = r15.w
            javax.microedition.khronos.egl.EGLDisplay r9 = r15.x
            javax.microedition.khronos.egl.EGLContext r10 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            javax.microedition.khronos.egl.EGLContext r1 = r8.eglCreateContext(r9, r0, r10, r1)
            r15.y = r1
            javax.microedition.khronos.egl.EGLContext r1 = r15.y
            if (r1 == 0) goto L_0x002e
            javax.microedition.khronos.egl.EGLContext r8 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            if (r1 != r8) goto L_0x0079
            goto L_0x002e
        L_0x0079:
            javax.microedition.khronos.egl.EGL10 r1 = r15.w
            javax.microedition.khronos.egl.EGLDisplay r8 = r15.x
            android.graphics.SurfaceTexture r9 = r15.p
            javax.microedition.khronos.egl.EGLSurface r0 = r1.eglCreateWindowSurface(r8, r0, r9, r5)
            r15.z = r0
            javax.microedition.khronos.egl.EGLSurface r0 = r15.z
            if (r0 == 0) goto L_0x002e
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            if (r0 != r1) goto L_0x008e
            goto L_0x002e
        L_0x008e:
            javax.microedition.khronos.egl.EGL10 r0 = r15.w
            javax.microedition.khronos.egl.EGLDisplay r1 = r15.x
            javax.microedition.khronos.egl.EGLSurface r8 = r15.z
            javax.microedition.khronos.egl.EGLContext r9 = r15.y
            boolean r0 = r0.eglMakeCurrent(r1, r8, r8, r9)
            if (r0 != 0) goto L_0x009d
            goto L_0x002e
        L_0x009d:
            r0 = 1
        L_0x009e:
            r1 = 35633(0x8b31, float:4.9932E-41)
            dsf<java.lang.String> r8 = defpackage.dsp.bh
            dsn r9 = defpackage.dpn.f()
            java.lang.Object r9 = r9.a(r8)
            java.lang.String r9 = (java.lang.String) r9
            T r10 = r8.c
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00c0
            dsn r9 = defpackage.dpn.f()
            java.lang.Object r8 = r9.a(r8)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x00c2
        L_0x00c0:
            java.lang.String r8 = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}"
        L_0x00c2:
            int r1 = a(r1, r8)
            if (r1 != 0) goto L_0x00cb
        L_0x00c8:
            r9 = 0
            goto L_0x014b
        L_0x00cb:
            r8 = 35632(0x8b30, float:4.9931E-41)
            dsf<java.lang.String> r9 = defpackage.dsp.bi
            dsn r10 = defpackage.dpn.f()
            java.lang.Object r10 = r10.a(r9)
            java.lang.String r10 = (java.lang.String) r10
            T r11 = r9.c
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x00ed
            dsn r10 = defpackage.dpn.f()
            java.lang.Object r9 = r10.a(r9)
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x00ef
        L_0x00ed:
            java.lang.String r9 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}"
        L_0x00ef:
            int r8 = a(r8, r9)
            if (r8 != 0) goto L_0x00f6
            goto L_0x00c8
        L_0x00f6:
            int r9 = android.opengl.GLES20.glCreateProgram()
            java.lang.String r10 = "createProgram"
            a(r10)
            if (r9 == 0) goto L_0x014b
            android.opengl.GLES20.glAttachShader(r9, r1)
            java.lang.String r1 = "attachShader"
            a(r1)
            android.opengl.GLES20.glAttachShader(r9, r8)
            java.lang.String r1 = "attachShader"
            a(r1)
            android.opengl.GLES20.glLinkProgram(r9)
            java.lang.String r1 = "linkProgram"
            a(r1)
            int[] r1 = new int[r6]
            r8 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r9, r8, r1, r7)
            java.lang.String r8 = "getProgramiv"
            a(r8)
            r1 = r1[r7]
            if (r1 == r6) goto L_0x0143
            java.lang.String r1 = "SphericalVideoRenderer"
            java.lang.String r8 = "Could not link program: "
            android.util.Log.e(r1, r8)
            java.lang.String r1 = android.opengl.GLES20.glGetProgramInfoLog(r9)
            java.lang.String r8 = "SphericalVideoRenderer"
            android.util.Log.e(r8, r1)
            android.opengl.GLES20.glDeleteProgram(r9)
            java.lang.String r1 = "deleteProgram"
            a(r1)
            goto L_0x00c8
        L_0x0143:
            android.opengl.GLES20.glValidateProgram(r9)
            java.lang.String r1 = "validateProgram"
            a(r1)
        L_0x014b:
            r15.q = r9
            int r1 = r15.q
            android.opengl.GLES20.glUseProgram(r1)
            java.lang.String r1 = "useProgram"
            a(r1)
            int r1 = r15.q
            java.lang.String r8 = "aPosition"
            int r1 = android.opengl.GLES20.glGetAttribLocation(r1, r8)
            r10 = 3
            r11 = 5126(0x1406, float:7.183E-42)
            r12 = 0
            r13 = 12
            java.nio.FloatBuffer r14 = r15.t
            r9 = r1
            android.opengl.GLES20.glVertexAttribPointer(r9, r10, r11, r12, r13, r14)
            java.lang.String r8 = "vertexAttribPointer"
            a(r8)
            android.opengl.GLES20.glEnableVertexAttribArray(r1)
            java.lang.String r1 = "enableVertexAttribArray"
            a(r1)
            int[] r1 = new int[r6]
            android.opengl.GLES20.glGenTextures(r6, r1, r7)
            java.lang.String r8 = "genTextures"
            a(r8)
            r1 = r1[r7]
            r8 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r8, r1)
            java.lang.String r9 = "bindTextures"
            a(r9)
            r9 = 10240(0x2800, float:1.4349E-41)
            r10 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r8, r9, r10)
            java.lang.String r9 = "texParameteri"
            a(r9)
            r9 = 10241(0x2801, float:1.435E-41)
            android.opengl.GLES20.glTexParameteri(r8, r9, r10)
            java.lang.String r9 = "texParameteri"
            a(r9)
            r9 = 10242(0x2802, float:1.4352E-41)
            r10 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r8, r9, r10)
            java.lang.String r9 = "texParameteri"
            a(r9)
            r9 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r8, r9, r10)
            java.lang.String r8 = "texParameteri"
            a(r8)
            int r8 = r15.q
            java.lang.String r9 = "uVMat"
            int r8 = android.opengl.GLES20.glGetUniformLocation(r8, r9)
            r15.r = r8
            r8 = 9
            float[] r8 = new float[r8]
            r8 = {1065353216, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216} // fill-array
            int r9 = r15.r
            android.opengl.GLES20.glUniformMatrix3fv(r9, r6, r7, r8, r7)
            int r8 = r15.q
            if (r8 == 0) goto L_0x01d8
            r8 = 1
            goto L_0x01d9
        L_0x01d8:
            r8 = 0
        L_0x01d9:
            if (r0 == 0) goto L_0x03cf
            if (r8 != 0) goto L_0x01df
            goto L_0x03cf
        L_0x01df:
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r1)
            r15.o = r0
            android.graphics.SurfaceTexture r0 = r15.o
            r0.setOnFrameAvailableListener(r15)
            java.util.concurrent.CountDownLatch r0 = r15.u
            r0.countDown()
            crl r0 = r15.f
            android.os.Handler r1 = r0.b
            if (r1 != 0) goto L_0x022b
            android.hardware.SensorManager r1 = r0.a
            android.hardware.Sensor r1 = r1.getDefaultSensor(r2)
            if (r1 != 0) goto L_0x0204
            java.lang.String r0 = "No Sensor of TYPE_ROTATION_VECTOR"
            defpackage.clu.a(r0)
            goto L_0x022b
        L_0x0204:
            android.os.HandlerThread r2 = new android.os.HandlerThread
            java.lang.String r8 = "OrientationMonitor"
            r2.<init>(r8)
            r2.start()
            android.os.Handler r8 = new android.os.Handler
            android.os.Looper r2 = r2.getLooper()
            r8.<init>(r2)
            r0.b = r8
            android.hardware.SensorManager r2 = r0.a
            android.os.Handler r8 = r0.b
            boolean r1 = r2.registerListener(r0, r1, r7, r8)
            if (r1 != 0) goto L_0x022b
            java.lang.String r1 = "SensorManager.registerListener failed."
            defpackage.clu.a(r1)
            r0.a()
        L_0x022b:
            r0 = 5
            r15.A = r6     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
        L_0x022e:
            boolean r1 = r15.B     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            if (r1 != 0) goto L_0x037b
        L_0x0232:
            int r1 = r15.s     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            if (r1 <= 0) goto L_0x0241
            android.graphics.SurfaceTexture r1 = r15.o     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            r1.updateTexImage()     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            int r1 = r15.s     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            int r1 = r1 - r6
            r15.s = r1     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            goto L_0x0232
        L_0x0241:
            crl r1 = r15.f     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float[] r2 = r15.g     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            boolean r1 = r1.a(r2)     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            r2 = 4
            r8 = 1070141403(0x3fc90fdb, float:1.5707964)
            if (r1 == 0) goto L_0x02c6
            float r1 = r15.n     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            boolean r1 = java.lang.Float.isNaN(r1)     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            if (r1 == 0) goto L_0x02bb
            float[] r1 = r15.g     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float[] r9 = new float[r3]     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            r10 = 0
            r9[r7] = r10     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            r11 = 1065353216(0x3f800000, float:1.0)
            r9[r6] = r11     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            r9[r4] = r10     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float[] r10 = new float[r3]     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            r11 = r1[r7]     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            r12 = r9[r7]     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float r11 = r11 * r12
            r12 = r1[r6]     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            r13 = r9[r6]     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r12 = r1[r4]     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            r13 = r9[r4]     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r10[r7] = r11     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            r11 = r1[r3]     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            r12 = r9[r7]     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float r11 = r11 * r12
            r12 = r1[r2]     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            r13 = r9[r6]     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r12 = r1[r0]     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            r13 = r9[r4]     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r10[r6] = r11     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            r11 = 6
            r11 = r1[r11]     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            r12 = r9[r7]     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float r11 = r11 * r12
            r12 = 7
            r12 = r1[r12]     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            r13 = r9[r6]     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r12 = 8
            r1 = r1[r12]     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            r9 = r9[r4]     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float r1 = r1 * r9
            float r11 = r11 + r1
            r10[r4] = r11     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            r1 = r10[r6]     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            double r11 = (double) r1     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            r1 = r10[r7]     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            double r9 = (double) r1     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            double r9 = java.lang.Math.atan2(r11, r9)     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float r1 = (float) r9     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float r1 = r1 - r8
            float r1 = -r1
            r15.n = r1     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
        L_0x02bb:
            float[] r1 = r15.l     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float r9 = r15.n     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float r10 = r15.a     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float r9 = r9 + r10
            b(r1, r9)     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            goto L_0x02d5
        L_0x02c6:
            float[] r1 = r15.g     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            r9 = -1077342245(0xffffffffbfc90fdb, float:-1.5707964)
            a(r1, r9)     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float[] r1 = r15.l     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float r9 = r15.a     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            b(r1, r9)     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
        L_0x02d5:
            float[] r1 = r15.h     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            a(r1, r8)     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float[] r1 = r15.i     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float[] r8 = r15.l     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float[] r9 = r15.h     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            a(r1, r8, r9)     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float[] r1 = r15.j     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float[] r8 = r15.g     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float[] r9 = r15.i     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            a(r1, r8, r9)     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float[] r1 = r15.k     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float r8 = r15.b     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            a(r1, r8)     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float[] r1 = r15.m     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float[] r8 = r15.k     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float[] r9 = r15.j     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            a(r1, r8, r9)     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            int r1 = r15.r     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float[] r8 = r15.m     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            android.opengl.GLES20.glUniformMatrix3fv(r1, r6, r7, r8, r7)     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            android.opengl.GLES20.glDrawArrays(r0, r7, r2)     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            java.lang.String r1 = "drawArrays"
            a(r1)     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            android.opengl.GLES20.glFinish()     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            javax.microedition.khronos.egl.EGL10 r1 = r15.w     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            javax.microedition.khronos.egl.EGLDisplay r2 = r15.x     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            javax.microedition.khronos.egl.EGLSurface r8 = r15.z     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            r1.eglSwapBuffers(r2, r8)     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            boolean r1 = r15.A     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            if (r1 == 0) goto L_0x0361
            int r1 = r15.d     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            int r2 = r15.c     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            android.opengl.GLES20.glViewport(r7, r7, r1, r2)     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            java.lang.String r1 = "viewport"
            a(r1)     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            int r1 = r15.q     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            java.lang.String r2 = "uFOVx"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r1, r2)     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            int r2 = r15.q     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            java.lang.String r8 = "uFOVy"
            int r2 = android.opengl.GLES20.glGetUniformLocation(r2, r8)     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            int r8 = r15.d     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            int r9 = r15.c     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            r10 = 1063216883(0x3f5f66f3, float:0.87266463)
            if (r8 <= r9) goto L_0x0350
            android.opengl.GLES20.glUniform1f(r1, r10)     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            int r1 = r15.c     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float r1 = (float) r1     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float r1 = r1 * r10
            int r8 = r15.d     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float r8 = (float) r8     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float r1 = r1 / r8
            android.opengl.GLES20.glUniform1f(r2, r1)     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            goto L_0x035f
        L_0x0350:
            int r8 = r15.d     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float r8 = (float) r8     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float r8 = r8 * r10
            int r9 = r15.c     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float r9 = (float) r9     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            float r8 = r8 / r9
            android.opengl.GLES20.glUniform1f(r1, r8)     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
            android.opengl.GLES20.glUniform1f(r2, r10)     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
        L_0x035f:
            r15.A = r7     // Catch:{ IllegalStateException -> 0x03ac, all -> 0x038b }
        L_0x0361:
            java.lang.Object r1 = r15.v     // Catch:{ InterruptedException -> 0x022e }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x022e }
            boolean r2 = r15.B     // Catch:{ all -> 0x0378 }
            if (r2 != 0) goto L_0x0375
            boolean r2 = r15.A     // Catch:{ all -> 0x0378 }
            if (r2 != 0) goto L_0x0375
            int r2 = r15.s     // Catch:{ all -> 0x0378 }
            if (r2 != 0) goto L_0x0375
            java.lang.Object r2 = r15.v     // Catch:{ all -> 0x0378 }
            r2.wait()     // Catch:{ all -> 0x0378 }
        L_0x0375:
            monitor-exit(r1)     // Catch:{ all -> 0x0378 }
            goto L_0x022e
        L_0x0378:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0378 }
            throw r2     // Catch:{ InterruptedException -> 0x022e }
        L_0x037b:
            crl r0 = r15.f
            r0.a()
            android.graphics.SurfaceTexture r0 = r15.o
            r0.setOnFrameAvailableListener(r5)
            r15.o = r5
            r15.d()
            return
        L_0x038b:
            r0 = move-exception
            java.lang.String r1 = "SphericalVideoProcessor died."
            defpackage.clu.a(r1, r0)     // Catch:{ all -> 0x03aa }
            cle r1 = defpackage.bjl.i()     // Catch:{ all -> 0x03aa }
            java.lang.String r2 = "SphericalVideoProcessor.run.2"
            r1.a(r0, r2)     // Catch:{ all -> 0x03aa }
            crl r0 = r15.f
            r0.a()
            android.graphics.SurfaceTexture r0 = r15.o
            r0.setOnFrameAvailableListener(r5)
            r15.o = r5
            r15.d()
            return
        L_0x03aa:
            r0 = move-exception
            goto L_0x03bf
        L_0x03ac:
            defpackage.cow.a(r0)     // Catch:{ all -> 0x03aa }
            crl r0 = r15.f
            r0.a()
            android.graphics.SurfaceTexture r0 = r15.o
            r0.setOnFrameAvailableListener(r5)
            r15.o = r5
            r15.d()
            return
        L_0x03bf:
            crl r1 = r15.f
            r1.a()
            android.graphics.SurfaceTexture r1 = r15.o
            r1.setOnFrameAvailableListener(r5)
            r15.o = r5
            r15.d()
            throw r0
        L_0x03cf:
            javax.microedition.khronos.egl.EGL10 r0 = r15.w
            int r0 = r0.eglGetError()
            java.lang.String r0 = android.opengl.GLUtils.getEGLErrorString(r0)
            java.lang.String r1 = "EGL initialization failed: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x03ea
            java.lang.String r0 = r1.concat(r0)
            goto L_0x03ef
        L_0x03ea:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x03ef:
            defpackage.clu.a(r0)
            cle r1 = defpackage.bjl.i()
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>(r0)
            java.lang.String r0 = "SphericalVideoProcessor.run.1"
            r1.a(r2, r0)
            r15.d()
            java.util.concurrent.CountDownLatch r0 = r15.u
            r0.countDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cro.run():void");
    }
}
