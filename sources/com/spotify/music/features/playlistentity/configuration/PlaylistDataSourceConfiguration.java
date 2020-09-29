package com.spotify.music.features.playlistentity.configuration;

import com.google.common.base.Optional;

public abstract class PlaylistDataSourceConfiguration {
    public static final PlaylistDataSourceConfiguration a = new defpackage.ogu.a().a(false).b(false).c(false).a(Optional.e()).b(Optional.e()).c(Optional.e()).d(Optional.e()).d(false).e(false).f(false).a(DecorationPolicy.LARGE_WITHOUT_VIEWPORT).a();

    public enum DecorationPolicy {
        LARGE_WITH_VIEWPORT,
        LARGE_WITHOUT_VIEWPORT,
        LIMITED_WITHOUT_VIEWPORT
    }

    public interface a {
        a a(Optional<Boolean> optional);

        a a(DecorationPolicy decorationPolicy);

        a a(boolean z);

        PlaylistDataSourceConfiguration a();

        a b(Optional<Boolean> optional);

        a b(boolean z);

        a c(Optional<Boolean> optional);

        a c(boolean z);

        a d(Optional<Integer> optional);

        a d(boolean z);

        a e(boolean z);

        a f(boolean z);
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract Optional<Boolean> d();

    public abstract Optional<Boolean> e();

    public abstract Optional<Boolean> f();

    public abstract Optional<Integer> g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract DecorationPolicy k();

    public abstract a l();

    public static a m() {
        return new defpackage.ogu.a();
    }
}
