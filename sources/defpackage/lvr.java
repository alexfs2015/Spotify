package defpackage;

import android.content.Context;
import com.spotify.music.features.assistedcuration.loader.RecsLoader;

/* renamed from: lvr reason: default package */
public final class lvr implements wig<lvq> {
    private final wzi<Context> a;
    private final wzi<RecsLoader> b;
    private final wzi<lvi> c;
    private final wzi<luk> d;
    private final wzi<lul> e;

    public static lvq a(Context context, RecsLoader recsLoader, Object obj, luk luk, lul lul) {
        lvq lvq = new lvq(context, recsLoader, (lvi) obj, luk, lul);
        return lvq;
    }

    public final /* synthetic */ Object get() {
        lvq lvq = new lvq((Context) this.a.get(), (RecsLoader) this.b.get(), (lvi) this.c.get(), (luk) this.d.get(), (lul) this.e.get());
        return lvq;
    }
}
