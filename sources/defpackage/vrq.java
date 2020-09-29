package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: vrq reason: default package */
public final class vrq extends vsm {
    private static final int a = 22;
    private final AssetManager b;

    public vrq(Context context) {
        this.b = context.getAssets();
    }

    public final boolean a(vsk vsk) {
        Uri uri = vsk.d;
        if ("file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty()) {
            if ("android_asset".equals(uri.getPathSegments().get(0))) {
                return true;
            }
        }
        return false;
    }

    public final a a(vsk vsk, int i) {
        return new a(this.b.open(vsk.d.toString().substring(a)), LoadedFrom.DISK);
    }
}
