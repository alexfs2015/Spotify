package defpackage;

import android.app.Activity;
import android.net.Uri;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.ShareMessengerURLActionButton.a;

/* renamed from: izt reason: default package */
public final class izt {
    public static void a(int i, Uri uri, Activity activity) {
        a aVar = new a();
        aVar.a = activity.getString(i);
        a aVar2 = aVar;
        aVar2.b = uri;
        aVar2.c = true;
        ShareMessengerURLActionButton shareMessengerURLActionButton = new ShareMessengerURLActionButton(aVar2, 0);
        a aVar3 = new a();
        aVar3.d = "6243987495";
        a aVar4 = aVar3;
        aVar4.f = uri;
        aVar4.g = shareMessengerURLActionButton;
        aps.a(activity, new aph(aVar4, 0));
    }
}
