package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.viewuri.ViewUris.SubView;
import java.lang.ref.WeakReference;

/* renamed from: pnw reason: default package */
public final class pnw implements gxk {
    private final WeakReference<Activity> b;
    private final mfo c;
    private final jty d;
    private final hat e;
    private final pnu f;

    public pnw(Activity activity, mfo mfo, jty jty, hat hat, pnu pnu) {
        this.b = new WeakReference<>(activity);
        this.c = mfo;
        this.d = jty;
        this.e = hat;
        this.f = pnu;
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String string = hci.data().string("uri");
        if (string == null) {
            this.e.logInteraction(mfw.g().a(this.d).a().c().toString(), gwy.b, "mismatched-intent", null);
            Assertion.b("The URI is null.");
        } else {
            this.e.logInteraction(string, gwy.b, null, null);
        }
        Activity activity = (Activity) this.b.get();
        if (activity != null) {
            a a = mfw.g().a(SubView.NONE).a("").a(this.d);
            if (!TextUtils.isEmpty(string)) {
                a.a(Uri.parse(string));
            }
            mfo.a(activity, a.a());
        }
    }
}
