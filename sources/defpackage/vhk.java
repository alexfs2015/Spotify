package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.squareup.picasso.Downloader;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: vhk reason: default package */
public final class vhk implements wig<vhj> {
    private final wzi<Context> a;
    private final wzi<Downloader> b;
    private final wzi<List<wgs>> c;
    private final wzi<Optional<ExecutorService>> d;

    private vhk(wzi<Context> wzi, wzi<Downloader> wzi2, wzi<List<wgs>> wzi3, wzi<Optional<ExecutorService>> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static vhk a(wzi<Context> wzi, wzi<Downloader> wzi2, wzi<List<wgs>> wzi3, wzi<Optional<ExecutorService>> wzi4) {
        return new vhk(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new vhj((Context) this.a.get(), (Downloader) this.b.get(), (List) this.c.get(), (Optional) this.d.get());
    }
}
