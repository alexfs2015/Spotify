package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

/* renamed from: vhb reason: default package */
public final class vhb implements wgz {
    public static final vhb a = new vhb();
    private a b = new a() {
        public final int a(Bitmap bitmap) {
            return vha.b(vgj.a(bitmap).a());
        }
    };

    /* renamed from: vhb$a */
    interface a {
        int a(Bitmap bitmap);
    }

    private vhb() {
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

    public final String a() {
        return "color_extract";
    }
}
