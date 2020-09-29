package defpackage;

import com.spotify.music.builtinauth.cache.AuthCacheRoomDatabase;
import io.reactivex.Scheduler;

/* renamed from: ktr reason: default package */
public final class ktr implements vua<ktq> {
    private final wlc<AuthCacheRoomDatabase> a;
    private final wlc<ktn> b;
    private final wlc<Scheduler> c;

    private ktr(wlc<AuthCacheRoomDatabase> wlc, wlc<ktn> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static ktr a(wlc<AuthCacheRoomDatabase> wlc, wlc<ktn> wlc2, wlc<Scheduler> wlc3) {
        return new ktr(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new ktq((AuthCacheRoomDatabase) this.a.get(), (ktn) this.b.get(), (Scheduler) this.c.get());
    }
}
