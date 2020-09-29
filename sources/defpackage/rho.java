package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.recsloader.RecsTrack;

/* renamed from: rho reason: default package */
public abstract class rho {
    public static final rho a = new a().a("").a(15).a(false).a(ImmutableList.d()).b(ImmutableList.d()).c(ImmutableList.d()).d(ImmutableList.d()).a(Optional.e()).a();

    /* renamed from: rho$a */
    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(Optional<Boolean> optional);

        public abstract a a(ImmutableList<String> immutableList);

        public abstract a a(String str);

        public abstract a a(boolean z);

        public abstract rho a();

        public abstract a b(ImmutableList<RecsTrack> immutableList);

        public abstract a c(ImmutableList<MusicItem> immutableList);

        public abstract a d(ImmutableList<MusicItem> immutableList);
    }

    public abstract String a();

    public final rho a(ImmutableList<MusicItem> immutableList) {
        return i().d(immutableList).a();
    }

    public final rho a(boolean z) {
        return i().a(z).a();
    }

    public abstract int b();

    public abstract boolean c();

    public abstract ImmutableList<String> d();

    public abstract ImmutableList<RecsTrack> e();

    public abstract ImmutableList<MusicItem> f();

    public abstract ImmutableList<MusicItem> g();

    public abstract Optional<Boolean> h();

    public abstract a i();
}
