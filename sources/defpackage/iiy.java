package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;

/* renamed from: iiy reason: default package */
public final class iiy {
    private final HashMap<String, String> a = new HashMap<>();
    private final hzw b;
    private final CompositeDisposable c = new CompositeDisposable();

    public iiy(hzw hzw) {
        this.b = hzw;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(String str, String str2, Response response) {
        if (response.getStatus() == 202) {
            Logger.b("Flashpoint - %s reported successfully with data (%s)", str, str2);
            return;
        }
        Logger.b("Flashpoint - Failed to report %s event with data (%s). Error code: %s", str, str2, Integer.valueOf(response.getStatus()));
    }

    public final void a() {
        Logger.c("StatePoster is stopped.", new Object[0]);
        this.c.c();
    }

    public final void a(String str, String str2) {
        this.a.put("value", str2);
        this.c.a(this.b.a(str, this.a).a((Consumer<? super T>) new $$Lambda$iiy$TDL6kBFVV12kTrWaxpoveKQofe0<Object>(str, str2), (Consumer<? super Throwable>) new $$Lambda$iiy$zKZvKcNId6P2e6QKiaXWigS036M<Object>(str, str2)));
    }
}
