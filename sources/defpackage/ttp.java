package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.music.R;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: ttp reason: default package */
public final class ttp {
    private final kxs a;
    private final ToastieManager b;
    private final String c;
    private final String d;

    public ttp(kxs kxs, ToastieManager toastieManager, Context context) {
        this.a = kxs;
        this.b = toastieManager;
        this.c = context.getString(R.string.snackbar_mark_as_played);
        this.d = context.getString(R.string.snackbar_undo);
    }

    public final void a(String str) {
        this.b.a(uos.a(this.c, 3000).c(R.color.cat_white).b(R.color.cat_black).a(this.d).a((OnClickListener) new $$Lambda$ttp$HfwWd8Ei2T7MRd8ARzPmZN3RPOA(this, str)).a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, View view) {
        this.a.b(str);
        this.b.a();
    }
}
