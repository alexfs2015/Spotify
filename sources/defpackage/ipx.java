package defpackage;

import android.content.Context;
import com.spotify.music.R;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: ipx reason: default package */
public final class ipx {
    private final Context a;
    private final ToastieManager b;
    private final jsz c;

    public ipx(Context context, ToastieManager toastieManager, jsz jsz) {
        this.a = (Context) fay.a(context);
        this.b = (ToastieManager) fay.a(toastieManager);
        this.c = (jsz) fay.a(jsz);
    }

    public final void a(int i) {
        uos a2 = uos.a(this.a.getString(i), 3000).c(R.color.cat_white).b(R.color.cat_black).a();
        if (this.b.b()) {
            this.b.a(a2);
        } else {
            this.b.a = a2;
        }
    }
}
