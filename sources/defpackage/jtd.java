package defpackage;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.web.RxWebToken;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;

@Deprecated
/* renamed from: jtd reason: default package */
public final class jtd {
    private a a;
    private final RxWebToken b;
    private final SerialDisposable c = new SerialDisposable();

    /* renamed from: jtd$a */
    public interface a {
        void onWebTokenUriReady(Uri uri);
    }

    public static jtd a(RxWebToken rxWebToken) {
        return new jtd(rxWebToken);
    }

    public jtd(RxWebToken rxWebToken) {
        this.b = rxWebToken;
    }

    public final synchronized void a(String str, a aVar) {
        this.a = aVar;
        this.c.a(this.b.a(Uri.parse(str)).a((Consumer<? super T>) new $$Lambda$jtd$2v8OpPOGuoRZESrXOZWoolQUK_Q<Object>(this), (Consumer<? super Throwable>) new $$Lambda$jtd$pgQXVIrfQC__pvcYn1AIh_Fxvg<Object>(this)));
    }

    public final synchronized void a() {
        this.c.bf_();
        this.a = null;
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
}
