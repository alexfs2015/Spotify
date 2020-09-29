package defpackage;

import android.net.Uri;
import com.spotify.music.libs.web.RxWebToken;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: mge reason: default package */
public final class mge {
    private final RxWebToken a;
    private final mga b;

    mge(RxWebToken rxWebToken, mga mga) {
        this.a = rxWebToken;
        this.b = mga;
    }

    public final xii<Uri> a(Uri uri) {
        xii a2 = wit.a((ObservableSource<T>) this.a.a(uri), BackpressureStrategy.BUFFER);
        mga mga = this.b;
        mga.getClass();
        return a2.e((xiy<? super T, ? extends R>) new $$Lambda$1SLVj4D3pIPCwnGWHUSHSk3QRzY<Object,Object>(mga)).a(1);
    }
}
