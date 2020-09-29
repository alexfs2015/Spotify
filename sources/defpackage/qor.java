package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.spotify.mobile.android.util.LinkType;
import com.squareup.picasso.Picasso;

/* renamed from: qor reason: default package */
public final class qor {
    public static void a(Picasso picasso, Context context, ImageView imageView, String str, String str2) {
        boolean z;
        if (str2 == null) {
            imageView.setImageDrawable(gaa.l(context));
            return;
        }
        LinkType linkType = jva.a(str).b;
        wgr a = picasso.a(str2);
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
            a.a(gaa.a(context)).a(vhj.a(imageView));
        } else if (jvb.a(linkType)) {
            a.a(gaa.e(context)).a(imageView);
        } else {
            a.a(gaa.d(context)).a(imageView);
        }
    }
}
