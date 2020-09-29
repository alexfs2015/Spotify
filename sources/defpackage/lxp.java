package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.music.features.assistedcuration.search.AssistedCurationSearchActivity;

/* renamed from: lxp reason: default package */
public final class lxp implements skp {
    private final Context a;
    private final fqn b;

    public lxp(Context context, fqn fqn) {
        this.a = (Context) fbp.a(context);
        this.b = fqn;
    }

    public final void a(String str) {
        Intent intent = new Intent(this.a, AssistedCurationSearchActivity.class);
        intent.setAction("close_search");
        fqo.a(intent, this.b);
        this.a.startActivity(intent);
    }
}
