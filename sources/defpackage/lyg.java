package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.spotify.base.java.logging.Logger;
import java.io.ByteArrayOutputStream;

/* renamed from: lyg reason: default package */
public final class lyg {
    public static byte[] a(Bitmap bitmap, CompressFormat compressFormat, int i) {
        Logger.b("Size of a bitmap is %d %d", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, i, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
