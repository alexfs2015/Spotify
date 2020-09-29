package defpackage;

import androidx.fragment.app.Fragment;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.subjects.ReplaySubject;

/* renamed from: pni reason: default package */
public final class pni {
    public String a = "";
    public final ReplaySubject<pnm> b = ReplaySubject.d(1);
    public final kyh c = new $$Lambda$pni$vfk3E50l8KhYguaYhQhzjpunhWU(this);

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Fragment fragment, String str) {
        a(str);
    }

    public final void a(String str) {
        String b2 = b(str);
        if (!this.a.equals(b2)) {
            this.b.onNext(pnm.a(this.a, b2));
            this.a = b2;
        }
    }

    private static String b(String str) {
        return (str.equals(ViewUris.e.toString()) || str.equals(ViewUris.f.toString()) || str.equals(ViewUris.t.toString()) || str.equals("spotify:internal:home")) ? "spotify:home" : str;
    }
}
