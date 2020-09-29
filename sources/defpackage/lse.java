package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.music.features.assistedcuration.search.AssistedCurationSearchActivity;

/* renamed from: lse reason: default package */
public final class lse implements saj {
    private final Context a;
    private final fpt b;

    public final void b(String str, String str2) {
    }

    public final void c(String str) {
    }

    public final void d(String str) {
    }

    public lse(Context context, fpt fpt) {
        this.a = (Context) fay.a(context);
        this.b = (fpt) fay.a(fpt);
    }

    public final void a(String str) {
        this.a.startActivity(a(this.a, this.b, str, null));
    }

    public final void a(String str, String str2) {
        this.a.startActivity(a(this.a, this.b, str, str2));
    }

    public final void b(String str) {
        Intent a2 = a(this.a, this.b, str, null);
        a2.setAction("add_track");
        this.a.startActivity(a2);
    }

    public static Intent a(Context context, fpt fpt, String str, String str2) {
        Intent intent = new Intent(context, AssistedCurationSearchActivity.class);
        fpu.a(intent, fpt);
        intent.setData(Uri.parse(str));
        intent.putExtra("ac_search_title", str2);
        return intent;
    }
}
