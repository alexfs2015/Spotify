package defpackage;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;
import com.spotify.libgl.prog.ShaderException;
import com.spotify.mobile.android.util.Assertion;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: trj reason: default package */
public final class trj implements Renderer {
    private final glj a;

    public trj(glj glj) {
        this.a = (glj) fbp.a(glj);
    }

    public final void onDrawFrame(GL10 gl10) {
        this.a.b();
        this.a.c();
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        this.a.a(i, i2);
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        try {
            this.a.a();
        } catch (ShaderException e) {
            Assertion.a("Failed to initialize easter egg renderer", (Throwable) e);
        }
    }
}
