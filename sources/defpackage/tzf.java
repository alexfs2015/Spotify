package defpackage;

import android.net.Uri;
import com.squareup.picasso.Picasso;

/* renamed from: tzf reason: default package */
public abstract class tzf implements tyz {
    /* access modifiers changed from: protected */
    public abstract Uri a();

    public static tzf a(Uri uri) {
        return new tyw(uri);
    }

    public final vsl a(Picasso picasso) {
        return picasso.a(a());
    }
}
