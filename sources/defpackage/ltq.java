package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.music.features.assistedcuration.search.AssistedCurationSearchActivity;

/* renamed from: ltq reason: default package */
public final class ltq implements sai {
    private final Context a;
    private final fpt b;

    public ltq(Context context, fpt fpt) {
        this.a = (Context) fay.a(context);
        this.b = fpt;
    }

    public final void a(String str) {
        Intent intent = new Intent(this.a, AssistedCurationSearchActivity.class);
        intent.setAction("close_search");
        fpu.a(intent, this.b);
        this.a.startActivity(intent);
    }
}
