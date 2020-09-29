package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import java.io.InputStream;

/* renamed from: cej reason: default package */
final class cej implements coi<duh> {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ double b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ String d;
    private final /* synthetic */ ced e;

    cej(ced ced, boolean z, double d2, boolean z2, String str) {
        this.e = ced;
        this.a = z;
        this.b = d2;
        this.c = z2;
        this.d = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final duh a(InputStream inputStream) {
        Bitmap bitmap;
        Options options = new Options();
        options.inDensity = (int) (this.b * 160.0d);
        if (!this.c) {
            options.inPreferredConfig = Config.RGB_565;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            bitmap = BitmapFactory.decodeStream(inputStream, null, options);
        } catch (Exception e2) {
            cml.a("Error grabbing image.", e2);
            bitmap = null;
        }
        if (bitmap == null) {
            this.e.a(2, this.a);
            return null;
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (caf.e() && cml.a()) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int allocationByteCount = bitmap.getAllocationByteCount();
            long j = uptimeMillis2 - uptimeMillis;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(108);
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j);
            sb.append(" on ui thread: ");
            sb.append(z);
            sb.toString();
            cml.a();
        }
        return new duh(new BitmapDrawable(Resources.getSystem(), bitmap), Uri.parse(this.d), this.b);
    }

    public final /* synthetic */ Object a() {
        this.e.a(2, this.a);
        return null;
    }
}
