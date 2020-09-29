package defpackage;

import android.content.Context;
import com.spotify.music.features.assistedcuration.loader.GenresLoader;

/* renamed from: lvw reason: default package */
public final class lvw implements wig<lvv> {
    private final wzi<Context> a;
    private final wzi<GenresLoader> b;
    private final wzi<lvi> c;

    public static lvv a(Context context, GenresLoader genresLoader, Object obj) {
        return new lvv(context, genresLoader, (lvi) obj);
    }

    public final /* synthetic */ Object get() {
        return new lvv((Context) this.a.get(), (GenresLoader) this.b.get(), (lvi) this.c.get());
    }
}
