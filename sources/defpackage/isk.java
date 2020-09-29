package defpackage;

import android.content.Context;
import com.spotify.music.R;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: isk reason: default package */
public final class isk {
    private final Context a;
    private final ToastieManager b;
    private final jvf c;

    public isk(Context context, ToastieManager toastieManager, jvf jvf) {
        this.a = (Context) fbp.a(context);
        this.b = (ToastieManager) fbp.a(toastieManager);
        this.c = (jvf) fbp.a(jvf);
    }

    public final void a(int i) {
        uzy a2 = uzy.a(this.a.getString(i), 3000).c(R.color.cat_white).b(R.color.cat_black).a();
        if (this.b.b()) {
            this.b.a(a2);
        } else {
            this.b.a = a2;
        }
    }
}
