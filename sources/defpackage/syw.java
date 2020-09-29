package defpackage;

import android.net.Uri;
import com.google.common.base.Optional;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/* renamed from: syw reason: default package */
public final class syw {
    private final syt a;
    private final gjz b;

    public syw(syt syt, gjz gjz) {
        this.a = syt;
        this.b = gjz;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(xgo xgo) {
        return (String) Optional.c(xgo.a.a.a("Authorization")).a("");
    }

    public final Single<String> a() {
        String host = Uri.parse("https://app-report.spotify.com/").getHost();
        if (host != null) {
            this.b.a = Optional.b(host);
        }
        return this.a.a().f($$Lambda$syw$rGEiOnJ0njwHBLvQ5nI7PpbJv6M.INSTANCE).b(Schedulers.b()).a(AndroidSchedulers.a());
    }
}
