package defpackage;

import android.content.Context;
import android.media.ExifInterface;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.io.InputStream;

/* renamed from: wgf reason: default package */
public final class wgf extends wgb {
    public wgf(Context context) {
        super(context);
    }

    public final a a(wgq wgq, int i) {
        InputStream b = b(wgq);
        LoadedFrom loadedFrom = LoadedFrom.DISK;
        int attributeInt = new ExifInterface(wgq.d.getPath()).getAttributeInt("Orientation", 1);
        int i2 = attributeInt != 3 ? attributeInt != 6 ? attributeInt != 8 ? 0 : 270 : 90 : 180;
        return new a(null, b, loadedFrom, i2);
    }

    public final boolean a(wgq wgq) {
        return "file".equals(wgq.d.getScheme());
    }
}
