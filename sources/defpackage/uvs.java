package defpackage;

import android.graphics.Bitmap;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: uvs reason: default package */
public final class uvs implements vrs {
    private final vrs a;

    public uvs(vrs vrs) {
        this.a = (vrs) fay.a(vrs);
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

    public final int a() {
        return this.a.a();
    }

    public final int b() {
        return this.a.b();
    }
}
