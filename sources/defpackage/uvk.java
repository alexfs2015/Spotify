package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

/* renamed from: uvk reason: default package */
public final class uvk implements vst {
    public static final uvk a = new uvk();
    private a b = new a() {
        public final int a(Bitmap bitmap) {
            return uvj.b(uus.a(bitmap).a());
        }
    };

    /* renamed from: uvk$a */
    interface a {
        int a(Bitmap bitmap);
    }

    public final String a() {
        return "color_extract";
    }

    private uvk() {
    }

    public final Bitmap a(Bitmap bitmap) {
        if (bitmap == null || bitmap.getConfig() == null) {
            return bitmap;
        }
        int a2 = this.b.a(bitmap);
        bitmap.recycle();
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Config.ARGB_8888);
        createBitmap.setPixel(0, 0, a2);
        return createBitmap;
    }
}
