package defpackage;

import android.content.Context;
import com.spotify.music.features.assistedcuration.loader.GenresLoader;

/* renamed from: lrx reason: default package */
public final class lrx implements vua<lrw> {
    private final wlc<Context> a;
    private final wlc<GenresLoader> b;
    private final wlc<lrj> c;

    public static lrw a(Context context, GenresLoader genresLoader, Object obj) {
        return new lrw(context, genresLoader, (lrj) obj);
    }

    public final /* synthetic */ Object get() {
        return new lrw((Context) this.a.get(), (GenresLoader) this.b.get(), (lrj) this.c.get());
    }
}
