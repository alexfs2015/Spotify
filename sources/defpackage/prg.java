package defpackage;

import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.profile.model.LoadingState;
import com.spotify.music.features.profile.model.ProfileListItem;

/* renamed from: prg reason: default package */
public abstract class prg implements Parcelable {
    public static final prg c = new a().a(LoadingState.NOT_LOADED).a(ImmutableList.d()).a();

    /* renamed from: prg$a */
    public static abstract class a {
        public abstract a a(ImmutableList<ProfileListItem> immutableList);

        public abstract a a(LoadingState loadingState);

        public abstract prg a();
    }

    /* renamed from: prg$b */
    public static class b {
    }

    public static prg e() {
        return c.a(LoadingState.FAILED);
    }

    public static a f() {
        return new a();
    }

    public abstract LoadingState a();

    public final prg a(LoadingState loadingState) {
        return c().a(loadingState).a();
    }

    public abstract ImmutableList<ProfileListItem> b();

    public abstract a c();
}
