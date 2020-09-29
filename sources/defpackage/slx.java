package defpackage;

import android.content.Intent;
import com.spotify.music.navigation.NavigationManager;
import io.reactivex.subjects.CompletableSubject;

/* renamed from: slx reason: default package */
public final class slx implements vua<gjw<Intent>> {
    private final wlc<klp> a;
    private final wlc<soz> b;
    private final wlc<CompletableSubject> c;
    private final wlc<NavigationManager> d;

    public static gjw<Intent> a(klp klp, soz soz, CompletableSubject completableSubject, NavigationManager navigationManager) {
        return (gjw) vuf.a(CC.a(klp, soz, completableSubject, navigationManager), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((klp) this.a.get(), (soz) this.b.get(), (CompletableSubject) this.c.get(), (NavigationManager) this.d.get());
    }
}
