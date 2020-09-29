package defpackage;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.web.RxWebToken;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;

@Deprecated
/* renamed from: jvj reason: default package */
public final class jvj {
    private a a;
    private final RxWebToken b;
    private final SerialDisposable c = new SerialDisposable();

    /* renamed from: jvj$a */
    public interface a {
        void onWebTokenUriReady(Uri uri);
    }

    public jvj(RxWebToken rxWebToken) {
        this.b = rxWebToken;
    }

    public static jvj a(RxWebToken rxWebToken) {
        return new jvj(rxWebToken);
    }

    /* access modifiers changed from: private */
    public void a(Uri uri) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.onWebTokenUriReady(uri);
        }
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        Logger.e(th, "Unable to load web token", new Object[0]);
    }

    public final synchronized void a() {
        this.c.bd_();
        this.a = null;
    }

    public final synchronized void a(String str, a aVar) {
        this.a = aVar;
        this.c.a(this.b.a(Uri.parse(str)).a((Consumer<? super T>) new $$Lambda$jvj$fBNYn468nrgFUMsMyRICnvazc<Object>(this), (Consumer<? super Throwable>) new $$Lambda$jvj$rUdHQ3dg_15arqBIUrjauavv1VE<Object>(this)));
    }
}
