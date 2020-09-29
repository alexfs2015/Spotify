package defpackage;

import android.content.Context;
import com.spotify.music.features.assistedcuration.loader.RecsLoader;

/* renamed from: lvt reason: default package */
public final class lvt implements wig<lvs> {
    private final wzi<Context> a;
    private final wzi<RecsLoader> b;
    private final wzi<lvi> c;

    public static lvs a(Context context, RecsLoader recsLoader, Object obj) {
        return new lvs(context, recsLoader, (lvi) obj);
    }

    public final /* synthetic */ Object get() {
        return new lvs((Context) this.a.get(), (RecsLoader) this.b.get(), (lvi) this.c.get());
    }
}
