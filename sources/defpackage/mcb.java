package defpackage;

import android.net.Uri;
import com.spotify.music.libs.web.RxWebToken;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: mcb reason: default package */
public final class mcb {
    private final RxWebToken a;
    private final mbx b;

    mcb(RxWebToken rxWebToken, mbx mbx) {
        this.a = rxWebToken;
        this.b = mbx;
    }

    public final wud<Uri> a(Uri uri) {
        wud a2 = vun.a((ObservableSource<T>) this.a.a(uri), BackpressureStrategy.BUFFER);
        mbx mbx = this.b;
        mbx.getClass();
        return a2.f(new $$Lambda$pKkxB7qIlAIyvk0oSZDtYzvZvw(mbx)).a(1);
    }
}
