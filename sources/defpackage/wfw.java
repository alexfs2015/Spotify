package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: wfw reason: default package */
public final class wfw extends wgs {
    private static final int a = 22;
    private final AssetManager b;

    public wfw(Context context) {
        this.b = context.getAssets();
    }

    public final a a(wgq wgq, int i) {
        return new a(this.b.open(wgq.d.toString().substring(a)), LoadedFrom.DISK);
    }

    public final boolean a(wgq wgq) {
        Uri uri = wgq.d;
        if ("file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty()) {
            if ("android_asset".equals(uri.getPathSegments().get(0))) {
                return true;
            }
        }
        return false;
    }
}
