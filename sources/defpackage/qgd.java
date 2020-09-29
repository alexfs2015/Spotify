package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.spotify.mobile.android.util.LinkType;
import com.squareup.picasso.Picasso;

/* renamed from: qgd reason: default package */
public final class qgd {
    public static void a(Picasso picasso, Context context, ImageView imageView, String str, String str2) {
        boolean z;
        if (str2 == null) {
            imageView.setImageDrawable(fzg.l(context));
            return;
        }
        LinkType linkType = jst.a(str).b;
        vsl a = picasso.a(str2);
        switch (AnonymousClass1.a[linkType.ordinal()]) {
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            a.a(fzg.a(context)).a(uvt.a(imageView));
        } else if (jsu.a(linkType)) {
            a.a(fzg.e(context)).a(imageView);
        } else {
            a.a(fzg.d(context)).a(imageView);
        }
    }
}
