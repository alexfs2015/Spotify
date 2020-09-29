package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.spotify.music.libs.viewuri.ViewUris.SubView;
import java.lang.ref.WeakReference;

/* renamed from: jmu reason: default package */
public final class jmu {
    final WeakReference<Activity> a;
    private final jmr b;
    private final jlr c;
    private final mfo d;

    public jmu(Activity activity, jmr jmr, jlr jlr, mfo mfo) {
        this.a = new WeakReference<>(activity);
        this.b = jmr;
        this.c = jlr;
        this.d = mfo;
    }

    /* access modifiers changed from: 0000 */
    public void a(SubView subView, Uri uri) {
        Context context = (Context) this.a.get();
        if (context != null) {
            this.d.a(context, uri, subView);
        }
    }

    public final void a(hdp hdp) {
        this.c.a(hdp);
    }
}
