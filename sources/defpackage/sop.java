package defpackage;

import android.net.Uri;
import com.google.common.base.Optional;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/* renamed from: sop reason: default package */
public final class sop {
    private final som a;
    private final gio b;

    public sop(som som, gio gio) {
        this.a = som;
        this.b = gio;
    }

    public final Single<String> a() {
        String host = Uri.parse("https://app-report.spotify.com/").getHost();
        if (host != null) {
            this.b.a = Optional.b(host);
        }
        return this.a.a().f($$Lambda$sop$e0BmK5E8pHif5QpeiqZ3aGLW7Y.INSTANCE).b(Schedulers.b()).a(AndroidSchedulers.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(wsj wsj) {
        return (String) Optional.c(wsj.a.a.a("Authorization")).a("");
    }
}
