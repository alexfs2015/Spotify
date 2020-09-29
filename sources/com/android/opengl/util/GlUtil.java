package com.android.opengl.util;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Build.VERSION;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public final class GlUtil {
    private static final String a = String.format(Locale.US, "attribute vec4 %1$s;      \nattribute vec3 %2$s;      \nvarying vec2 v_texcoord;  \nvoid main() {             \n  gl_Position = %1$s;     \n  v_texcoord = %2$s.xy;   \n}                         \n", new Object[]{"a_position", "a_texcoord"});
    private static Set<String> b;
    private static final int[] c = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    public static final class UnsupportedEglVersionException extends Exception {
        private static final long serialVersionUID = 42;
    }

    public static final class a {
        private final int a;
        private Buffer b;
        private int c;

        public a(int i, String str) {
            this.a = GLES20.glGetAttribLocation(i, str);
        }

        public final void a() {
            if (this.b != null) {
                GLES20.glBindBuffer(34962, 0);
                GLES20.glVertexAttribPointer(this.a, this.c, 5126, false, 0, this.b);
                GLES20.glEnableVertexAttribArray(this.a);
                GlUtil.e();
                return;
            }
            throw new IllegalStateException("call setBuffer before bind");
        }

        public final void a(float[] fArr, int i) {
            this.b = ByteBuffer.allocateDirect(fArr.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).position(0);
            this.c = i;
        }
    }

    public static final class b {
        public final int a;
        public int b;
        public int c;

        public b(int i, String str) {
            this.a = GLES20.glGetUniformLocation(i, str);
        }
    }

    static {
        HashSet hashSet = new HashSet();
        b = hashSet;
        hashSet.add("shamu");
        b.add("angler");
        b.add("bullhead");
    }

    private static int a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] != 0) {
                return glCreateShader;
            }
            String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
            GLES20.glDeleteShader(glCreateShader);
            StringBuilder sb = new StringBuilder("could not compile shader ");
            sb.append(i);
            sb.append(':');
            sb.append(glGetShaderInfoLog);
            throw new RuntimeException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("could not create shader: ");
        sb2.append(GLES20.glGetError());
        throw new RuntimeException(sb2.toString());
    }

    public static int a(boolean z) {
        String str;
        String str2;
        if (z) {
            str = a("/sdcard/Android/data/com.spotify.music.debug/files/shader.vert", a);
        } else {
            str = a;
        }
        if (z) {
            str2 = a("/sdcard/Android/data/com.spotify.music.debug/files/shader.frag", d());
        } else {
            str2 = d();
        }
        int a2 = a(35633, str);
        int a3 = a(35632, str2);
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, a2);
            GLES20.glAttachShader(glCreateProgram, a3);
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] == 1) {
                return glCreateProgram;
            }
            String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
            GLES20.glDeleteProgram(glCreateProgram);
            StringBuilder sb = new StringBuilder("could not link shader ");
            sb.append(glGetProgramInfoLog);
            throw new RuntimeException(sb.toString());
        }
        throw new RuntimeException("could not create shader program");
    }

    public static EGLContext a(EGLDisplay eGLDisplay) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, c(eGLDisplay), EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        EGL14.eglTerminate(eGLDisplay);
        throw new UnsupportedEglVersionException();
    }

    public static EGLDisplay a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new IllegalStateException("no EGL display");
        } else if (EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0)) {
            return eglGetDisplay;
        } else {
            throw new IllegalStateException("error in eglInitialize");
        }
    }

    public static EGLSurface a(EGLDisplay eGLDisplay, Object obj) {
        return EGL14.eglCreateWindowSurface(eGLDisplay, c(eGLDisplay), obj, new int[]{12344}, 0);
    }

    private static String a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append(10);
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0023 A[SYNTHETIC, Splitter:B:14:0x0023] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0031 A[SYNTHETIC, Splitter:B:23:0x0031] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "Exception during closing file."
            r1 = 0
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x002e, all -> 0x0020 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x002e, all -> 0x0020 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x002e, all -> 0x0020 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x002e, all -> 0x0020 }
            java.lang.String r5 = a(r4)     // Catch:{ Exception -> 0x002f, all -> 0x001d }
            r4.close()     // Catch:{ IOException -> 0x0016 }
            goto L_0x001c
        L_0x0016:
            r4 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.spotify.base.java.logging.Logger.e(r4, r0, r1)
        L_0x001c:
            return r5
        L_0x001d:
            r5 = move-exception
            r2 = r4
            goto L_0x0021
        L_0x0020:
            r5 = move-exception
        L_0x0021:
            if (r2 == 0) goto L_0x002d
            r2.close()     // Catch:{ IOException -> 0x0027 }
            goto L_0x002d
        L_0x0027:
            r4 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.spotify.base.java.logging.Logger.e(r4, r0, r1)
        L_0x002d:
            throw r5
        L_0x002e:
            r4 = r2
        L_0x002f:
            if (r4 == 0) goto L_0x003b
            r4.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x003b
        L_0x0035:
            r4 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.spotify.base.java.logging.Logger.e(r4, r0, r1)
        L_0x003b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.opengl.util.GlUtil.a(java.lang.String, java.lang.String):java.lang.String");
    }

    public static void a(EGLDisplay eGLDisplay, EGLContext eGLContext) {
        if (eGLDisplay != null) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            int eglGetError = EGL14.eglGetError();
            if (eglGetError == 12288) {
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                    int eglGetError2 = EGL14.eglGetError();
                    if (eglGetError2 != 12288) {
                        StringBuilder sb = new StringBuilder("error destroying context: ");
                        sb.append(eglGetError2);
                        throw new RuntimeException(sb.toString());
                    }
                }
                EGL14.eglTerminate(eGLDisplay);
                int eglGetError3 = EGL14.eglGetError();
                if (eglGetError3 != 12288) {
                    StringBuilder sb2 = new StringBuilder("error terminating display: ");
                    sb2.append(eglGetError3);
                    throw new RuntimeException(sb2.toString());
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder("error releasing context: ");
            sb3.append(eglGetError);
            throw new RuntimeException(sb3.toString());
        }
    }

    public static void a(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2) {
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        GLES20.glViewport(0, 0, i, i2);
        GLES20.glScissor(0, 0, i, i2);
    }

    public static int b() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        e();
        return iArr[0];
    }

    public static EGLSurface b(EGLDisplay eGLDisplay) {
        return EGL14.eglCreatePbufferSurface(eGLDisplay, c(eGLDisplay), new int[]{12375, 1, 12374, 1, 12344}, 0);
    }

    private static EGLConfig c(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, c, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new RuntimeException("eglChooseConfig failed");
    }

    private static String d() {
        return (!b.contains(Build.DEVICE) || VERSION.SDK_INT < 23) ? "#extension GL_OES_EGL_image_external : require                   \nprecision mediump float;                                         \nuniform samplerExternalOES tex_sampler_0;                        \nuniform mat4 u_transform_mat;                                    \nvarying vec2 v_texcoord;                                         \nvoid main() {                                                    \n  vec2 texCoord = (u_transform_mat * vec4(v_texcoord, 0, 1)).st; \n  gl_FragColor = texture2D(tex_sampler_0, texCoord);             \n}                                                                \n" : "#extension GL_OES_EGL_image_external : require                                                               \nprecision mediump float;                                                                                     \nuniform samplerExternalOES tex_sampler_0;                                                                    \nvarying vec2 v_texcoord;                                                                                     \nvoid main() {                                                                                                \n  mat4 transformMat = mat4(1.0, 0.0, 0.0, 0.0, 0.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0); \n  vec2 texCoord = (transformMat * vec4(v_texcoord, 0, 1)).st;                                                \n  gl_FragColor = texture2D(tex_sampler_0, texCoord);                                                         \n}                                                                                                            \n";
    }

    /* access modifiers changed from: private */
    public static void e() {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder("gl error: ");
            sb.append(Integer.toHexString(glGetError));
            throw new RuntimeException(sb.toString());
        }
    }
}
