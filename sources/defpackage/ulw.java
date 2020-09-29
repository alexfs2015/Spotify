package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import java.util.Locale;

/* renamed from: ulw reason: default package */
public abstract class ulw implements Parcelable {
    public static ulw a(Uri uri) {
        return new ulo(uma.a(uri), null);
    }

    /* access modifiers changed from: protected */
    public abstract ulu a();

    public final void a(ImageView imageView, Picasso picasso) {
        a(imageView, picasso, null, null);
    }

    public final void a(ImageView imageView, Picasso picasso, vha vha, umk umk) {
        rpj rpj;
        wgr a = a().a(picasso);
        ult b = b();
        if (umk == null || b == null) {
            rpj = null;
        } else if (b instanceof ulv) {
            rpj = new rpj(umk.a, ((ulv) b).a());
            Drawable a2 = rpj.a();
            a = a.a(a2).b(a2);
        } else {
            throw new IllegalArgumentException(String.format(Locale.getDefault(), "Effect type %s could not be resolved", new Object[]{b.getClass().getCanonicalName()}));
        }
        if (vha == null && rpj == null) {
            a.a(imageView);
        } else if (vha == null) {
            a.a(vhj.a(imageView, (vfk) rpj));
        } else if (rpj == null) {
            a.a(vhj.a(imageView, vha));
        } else {
            a.a(vhj.a(imageView, (vfk) rpj, (wfz) vha));
        }
    }

    /* access modifiers changed from: protected */
    public abstract ult b();
}
