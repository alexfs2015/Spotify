package defpackage;

import androidx.fragment.app.Fragment;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.subjects.ReplaySubject;

/* renamed from: pwe reason: default package */
public final class pwe {
    public String a = "";
    public final ReplaySubject<pwi> b = ReplaySubject.d(1);
    public final lbq c = new $$Lambda$pwe$oFrVuI3hgF7uw1KYsDDfRb8wLWE(this);

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Fragment fragment, String str) {
        a(str);
    }

    private static String b(String str) {
        return (str.equals(ViewUris.d.toString()) || str.equals(ViewUris.e.toString()) || str.equals(ViewUris.s.toString()) || str.equals("spotify:internal:home")) ? "spotify:home" : str;
    }

    public final void a(String str) {
        String b2 = b(str);
        if (!this.a.equals(b2)) {
            this.b.onNext(pwi.a(this.a, b2));
            this.a = b2;
        }
    }
}
