package com.spotify.mobile.android.playlist.navigation;

import com.google.common.base.Optional;
import java.io.Serializable;

public abstract class AllSongsConfiguration implements Serializable {
    public static final AllSongsConfiguration a = new a().a(false).b(false).c(false).a(Optional.e()).b(Optional.e()).a();
    private static final long serialVersionUID = -4313545819262590245L;

    public interface a {
        a a(Optional<Boolean> optional);

        a a(boolean z);

        AllSongsConfiguration a();

        a b(Optional<Integer> optional);

        a b(boolean z);

        a c(boolean z);
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract Optional<Boolean> c();

    public abstract boolean d();

    public abstract Optional<Integer> e();

    public abstract a f();

    public static a g() {
        return new a();
    }
}
