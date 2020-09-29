package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import java.util.Locale;

/* renamed from: tzb reason: default package */
public abstract class tzb implements Parcelable {
    /* access modifiers changed from: protected */
    public abstract tyz a();

    /* access modifiers changed from: protected */
    public abstract tyy b();

    public static tzb a(Uri uri) {
        return new tyt(tzf.a(uri), null);
    }

    public final void a(ImageView imageView, Picasso picasso, uvj uvj, tzp tzp) {
        rgh rgh;
        vsl a = a().a(picasso);
        tyy b = b();
        if (tzp == null || b == null) {
            rgh = null;
        } else if (b instanceof tza) {
            rgh = new rgh(tzp.a, ((tza) b).a());
            Drawable a2 = rgh.a();
            a = a.a(a2).b(a2);
        } else {
            throw new IllegalArgumentException(String.format(Locale.getDefault(), "Effect type %s could not be resolved", new Object[]{b.getClass().getCanonicalName()}));
        }
        if (uvj == null && rgh == null) {
            a.a(imageView);
        } else if (uvj == null) {
            a.a(uvt.a(imageView, (utt) rgh));
        } else if (rgh == null) {
            a.a(uvt.a(imageView, uvj));
        } else {
            a.a(uvt.a(imageView, (utt) rgh, (vrt) uvj));
        }
    }

    public final void a(ImageView imageView, Picasso picasso) {
        a(imageView, picasso, null, null);
    }
}
