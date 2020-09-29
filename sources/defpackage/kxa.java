package defpackage;

import com.spotify.music.builtinauth.cache.AuthCacheRoomDatabase;
import io.reactivex.Scheduler;

/* renamed from: kxa reason: default package */
public final class kxa implements wig<kwz> {
    private final wzi<AuthCacheRoomDatabase> a;
    private final wzi<kww> b;
    private final wzi<Scheduler> c;

    private kxa(wzi<AuthCacheRoomDatabase> wzi, wzi<kww> wzi2, wzi<Scheduler> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static kxa a(wzi<AuthCacheRoomDatabase> wzi, wzi<kww> wzi2, wzi<Scheduler> wzi3) {
        return new kxa(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new kwz((AuthCacheRoomDatabase) this.a.get(), (kww) this.b.get(), (Scheduler) this.c.get());
    }
}
