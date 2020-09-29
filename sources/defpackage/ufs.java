package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.music.R;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: ufs reason: default package */
public final class ufs {
    private final lbb a;
    private final ToastieManager b;
    private final String c;
    private final String d;

    public ufs(lbb lbb, ToastieManager toastieManager, Context context) {
        this.a = lbb;
        this.b = toastieManager;
        this.c = context.getString(R.string.snackbar_mark_as_played);
        this.d = context.getString(R.string.snackbar_undo);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, View view) {
        this.a.b(str);
        this.b.a();
    }

    public final void a(String str) {
        this.b.a(uzy.a(this.c, 3000).c(R.color.cat_white).b(R.color.cat_black).a(this.d).a((OnClickListener) new $$Lambda$ufs$ZzQkHDusYAomA6tUMcyNrKc660(this, str)).a());
    }
}
