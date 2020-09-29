package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.spotify.music.R;

/* renamed from: gal reason: default package */
public final class gal {
    private static final short[] e = {0, 1, 2, 2, 1, 3, 4, 5, 6, 6, 5, 7, 8, 9, 10, 10, 9, 11, 12, 13, 14, 14, 13, 15};
    glk a;
    final gai b;
    final a c;
    final gll d = new gll();

    public gal(Context context) {
        a a2 = a.a(context);
        a2.b = R.raw.sparkler_vert;
        a2.c = R.raw.sparkler_frag;
        this.a = new glk(a2.a("aPosition", 0).a("aTimeOffset", 1).a("aSeed", 2));
        this.c = new a(e);
        gam gam = new gam(0, 1, 2, 0.25f, 64);
        this.b = new gai(gam, this.c);
        gll gll = this.d;
        GLES20.glGenTextures(1, gll.a, 0);
        GLES20.glBindTexture(3553, gll.a[0]);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexParameteri(3553, 10242, 10497);
        GLES20.glTexParameteri(3553, 10243, 10497);
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.sparkle_gradient);
        GLUtils.texImage2D(3553, 0, decodeResource, 0);
        decodeResource.recycle();
        GLES20.glBindTexture(3553, 0);
    }
}
