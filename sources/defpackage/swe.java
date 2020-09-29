package defpackage;

import android.content.Intent;
import com.spotify.music.navigation.NavigationManager;
import io.reactivex.subjects.CompletableSubject;

/* renamed from: swe reason: default package */
public final class swe implements wig<glh<Intent>> {
    private final wzi<koy> a;
    private final wzi<szg> b;
    private final wzi<CompletableSubject> c;
    private final wzi<NavigationManager> d;

    public static glh<Intent> a(koy koy, szg szg, CompletableSubject completableSubject, NavigationManager navigationManager) {
        return (glh) wil.a(CC.a(koy, szg, completableSubject, navigationManager), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((koy) this.a.get(), (szg) this.b.get(), (CompletableSubject) this.c.get(), (NavigationManager) this.d.get());
    }
}
