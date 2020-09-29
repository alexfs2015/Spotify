package defpackage;

import android.graphics.Bitmap;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: vhi reason: default package */
public final class vhi implements wfy {
    private final wfy a;

    public vhi(wfy wfy) {
        this.a = (wfy) fbp.a(wfy);
    }

    public final int a() {
        return this.a.a();
    }

    public final Bitmap a(String str) {
        Bitmap a2 = this.a.a(str);
        if (a2 == null) {
            return null;
        }
        if (!a2.isRecycled()) {
            return a2;
        }
        StringBuilder sb = new StringBuilder("Bitmap for: (");
        sb.append(str);
        sb.append(") recycled while in mem cache.");
        Assertion.b(sb.toString());
        return null;
    }

    public final void a(String str, Bitmap bitmap) {
        this.a.a(str, bitmap);
    }

    public final int b() {
        return this.a.b();
    }
}
