package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: snm reason: default package */
public final class snm implements saj {
    private final Context a;
    private final spe b;

    public snm(Context context, spe spe) {
        this.a = (Context) fay.a(context);
        this.b = (spe) fay.a(spe);
    }

    public final void c(String str) {
        if (str == null) {
            str = "";
        }
        Context context = this.a;
        Intent intent = new Intent("com.spotify.mobile.android.ui.action.view.SPOTIFY_URI");
        intent.setFlags(67108864);
        intent.putExtra("fragment_key", (String) fay.a(str));
        this.a.startActivity(new a((Context) fay.a(context), intent, 0).a);
    }

    public final void d(String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("force_navigation_key", true);
        Intent b2 = b(str);
        b2.putExtras(bundle);
        this.a.startActivity(b2);
    }

    public final void b(String str, String str2) {
        this.a.startActivity(this.b.a(spd.a((String) fay.a(str)).b(str2).a()));
    }

    public final void a(String str) {
        this.a.startActivity(b(str));
    }

    private Intent b(String str) {
        return this.b.a(spd.a((String) fay.a(str)).a());
    }
}
