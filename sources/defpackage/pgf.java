package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.viewuri.ViewUris.SubView;
import java.lang.ref.WeakReference;

/* renamed from: pgf reason: default package */
public final class pgf implements gvk {
    private final WeakReference<Activity> b;
    private final mbl c;
    private final jro d;
    private final gya e;
    private final pgh f;

    public pgf(Activity activity, mbl mbl, jro jro, gya gya, pgh pgh) {
        this.b = new WeakReference<>(activity);
        this.c = mbl;
        this.d = jro;
        this.e = gya;
        this.f = pgh;
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String string = gzp.data().string("uri");
        if (string == null) {
            this.e.logInteraction(mbt.g().a(this.d).a().c().toString(), guy.b, "mismatched-intent", null);
            Assertion.b("The URI is null.");
        } else {
            this.e.logInteraction(string, guy.b, null, null);
        }
        Activity activity = (Activity) this.b.get();
        if (activity != null) {
            a a = mbt.g().a(SubView.NONE).a("").a(this.d);
            if (!TextUtils.isEmpty(string)) {
                a.a(Uri.parse(string));
            }
            mbl.a(activity, a.a());
        }
    }
}
