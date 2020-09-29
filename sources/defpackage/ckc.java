package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.ByteArrayOutputStream;

/* renamed from: ckc reason: default package */
final class ckc implements Runnable {
    private final /* synthetic */ Bitmap a;
    private final /* synthetic */ cjz b;

    ckc(cjz cjz, Bitmap bitmap) {
        this.b = cjz;
        this.a = bitmap;
    }

    public final void run() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.a.compress(CompressFormat.PNG, 0, byteArrayOutputStream);
        synchronized (this.b.l) {
            this.b.c.g = new dgq();
            this.b.c.g.c = byteArrayOutputStream.toByteArray();
            this.b.c.g.b = "image/png";
            this.b.c.g.a = Integer.valueOf(1);
        }
    }
}
