package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLES30;
import com.spotify.base.java.logging.Logger;
import com.spotify.libgl.prog.ShaderException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: gjz reason: default package */
public final class gjz {
    public int a;
    private final a b;
    private final HashMap<String, Integer> c = new HashMap<>();

    /* renamed from: gjz$a */
    public static class a {
        final Context a;
        public int b;
        public int c;
        final Map<String, Integer> d = new HashMap();
        int e = -1;

        private a(Context context) {
            this.a = context;
        }

        public static a a(Context context) {
            return new a(context);
        }

        public final a a(String str, int i) {
            this.d.put(str, Integer.valueOf(i));
            return this;
        }
    }

    public gjz(a aVar) {
        this.b = aVar;
        int a2 = a(35633, this.b.b);
        int a3 = a(35632, this.b.c);
        this.a = GLES20.glCreateProgram();
        GLES20.glAttachShader(this.a, a2);
        GLES20.glAttachShader(this.a, a3);
        for (Entry entry : this.b.d.entrySet()) {
            GLES20.glBindAttribLocation(this.a, ((Integer) entry.getValue()).intValue(), (String) entry.getKey());
        }
        if (this.b.e >= 0) {
            GLES30.glTransformFeedbackVaryings(this.a, null, this.b.e);
        }
        GLES20.glLinkProgram(this.a);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.a, 35714, iArr, 0);
        if (iArr[0] == 0) {
            String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(this.a);
            GLES20.glDeleteProgram(this.a);
            this.a = 0;
            StringBuilder sb = new StringBuilder();
            a aVar2 = this.b;
            sb.append(null);
            sb.append(": failed to link program: \n");
            sb.append(glGetProgramInfoLog);
            throw new ShaderException(sb.toString());
        } else if (this.a == 0) {
            throw new ShaderException("Failed to create program");
        }
    }

    private int a(int i, int i2) {
        try {
            String a2 = gkb.a(this.b.a, i2);
            int glCreateShader = GLES20.glCreateShader(i);
            GLES20.glShaderSource(glCreateShader, a2);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
                a aVar = this.b;
                Logger.d("%s: failed to compile shader: \n%s", null, glGetShaderInfoLog);
                GLES20.glDeleteShader(glCreateShader);
                StringBuilder sb = new StringBuilder();
                a aVar2 = this.b;
                sb.append(null);
                sb.append(": failed to compile shader: \n");
                sb.append(glGetShaderInfoLog);
                throw new ShaderException(sb.toString());
            } else if (glCreateShader != 0) {
                return glCreateShader;
            } else {
                throw new ShaderException("Failed to create shader");
            }
        } catch (IOException e) {
            throw new ShaderException("Failed to load shader source", e);
        }
    }

    public final int a(String str) {
        if (!this.c.containsKey(str)) {
            this.c.put(str, Integer.valueOf(GLES20.glGetUniformLocation(this.a, str)));
        }
        return ((Integer) this.c.get(str)).intValue();
    }

    public final void a(String str, float f) {
        GLES20.glUniform1f(a(str), f);
    }

    public final void a(String str, float f, float f2) {
        GLES20.glUniform2f(a(str), f, f2);
    }
}
