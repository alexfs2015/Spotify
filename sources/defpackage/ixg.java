package defpackage;

import android.app.Activity;
import android.net.Uri;
import com.facebook.share.widget.ShareDialog;

/* renamed from: ixg reason: default package */
public final class ixg {
    public static void a(Activity activity, Uri uri) {
        ShareDialog shareDialog = new ShareDialog(activity);
        a aVar = new a();
        aVar.a = uri;
        shareDialog.a(new aop(aVar, 0));
    }
}
