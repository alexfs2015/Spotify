package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.squareup.picasso.Downloader;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: uvu reason: default package */
public final class uvu implements vua<uvt> {
    private final wlc<Context> a;
    private final wlc<Downloader> b;
    private final wlc<List<vsm>> c;
    private final wlc<Callable<Boolean>> d;
    private final wlc<Optional<ExecutorService>> e;

    private uvu(wlc<Context> wlc, wlc<Downloader> wlc2, wlc<List<vsm>> wlc3, wlc<Callable<Boolean>> wlc4, wlc<Optional<ExecutorService>> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static uvu a(wlc<Context> wlc, wlc<Downloader> wlc2, wlc<List<vsm>> wlc3, wlc<Callable<Boolean>> wlc4, wlc<Optional<ExecutorService>> wlc5) {
        uvu uvu = new uvu(wlc, wlc2, wlc3, wlc4, wlc5);
        return uvu;
    }

    public final /* synthetic */ Object get() {
        uvt uvt = new uvt((Context) this.a.get(), (Downloader) this.b.get(), (List) this.c.get(), (Callable) this.d.get(), (Optional) this.e.get());
        return uvt;
    }
}
