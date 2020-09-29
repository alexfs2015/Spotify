package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: sxt reason: default package */
public final class sxt implements skq {
    private final Context a;
    private final szl b;

    public sxt(Context context, szl szl) {
        this.a = (Context) fbp.a(context);
        this.b = (szl) fbp.a(szl);
    }

    private Intent b(String str) {
        return this.b.a(szk.a((String) fbp.a(str)).a());
    }

    public final void a(String str) {
        this.a.startActivity(b(str));
    }

    public final void b(String str, String str2) {
        this.a.startActivity(this.b.a(szk.a((String) fbp.a(str)).b(str2).a()));
    }

    public final void c(String str) {
        if (str == null) {
            str = "";
        }
        Context context = this.a;
        Intent intent = new Intent("com.spotify.mobile.android.ui.action.view.SPOTIFY_URI");
        intent.setFlags(67108864);
        intent.putExtra("fragment_key", (String) fbp.a(str));
        this.a.startActivity(new a((Context) fbp.a(context), intent, 0).a);
    }

    public final void d(String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("force_navigation_key", true);
        Intent b2 = b(str);
        b2.putExtras(bundle);
        this.a.startActivity(b2);
    }
}
