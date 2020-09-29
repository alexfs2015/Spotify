package defpackage;

import android.content.Context;
import android.media.ExifInterface;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.io.InputStream;

/* renamed from: vrz reason: default package */
public final class vrz extends vrv {
    public vrz(Context context) {
        super(context);
    }

    public final boolean a(vsk vsk) {
        return "file".equals(vsk.d.getScheme());
    }

    public final a a(vsk vsk, int i) {
        InputStream b = b(vsk);
        LoadedFrom loadedFrom = LoadedFrom.DISK;
        int attributeInt = new ExifInterface(vsk.d.getPath()).getAttributeInt("Orientation", 1);
        int i2 = attributeInt != 3 ? attributeInt != 6 ? attributeInt != 8 ? 0 : 270 : 90 : 180;
        return new a(null, b, loadedFrom, i2);
    }
}
