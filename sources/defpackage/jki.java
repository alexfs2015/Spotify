package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.spotify.music.libs.viewuri.ViewUris.SubView;
import java.lang.ref.WeakReference;

/* renamed from: jki reason: default package */
public final class jki {
    final WeakReference<Activity> a;
    private final jkf b;
    private final jjf c;
    private final mbl d;

    public jki(Activity activity, jkf jkf, jjf jjf, mbl mbl) {
        this.a = new WeakReference<>(activity);
        this.b = jkf;
        this.c = jjf;
        this.d = mbl;
    }

    public final void a(haw haw) {
        this.c.a(haw);
    }

    /* access modifiers changed from: 0000 */
    public void a(SubView subView, Uri uri) {
        Context context = (Context) this.a.get();
        if (context != null) {
            this.d.a(context, uri, subView);
        }
    }
}
