package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.ByteArrayOutputStream;

/* renamed from: ckt reason: default package */
final class ckt implements Runnable {
    private final /* synthetic */ Bitmap a;
    private final /* synthetic */ ckq b;

    ckt(ckq ckq, Bitmap bitmap) {
        this.b = ckq;
        this.a = bitmap;
    }

    public final void run() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.a.compress(CompressFormat.PNG, 0, byteArrayOutputStream);
        synchronized (this.b.l) {
            this.b.c.g = new dhh();
            this.b.c.g.c = byteArrayOutputStream.toByteArray();
            this.b.c.g.b = "image/png";
            this.b.c.g.a = Integer.valueOf(1);
        }
    }
}
