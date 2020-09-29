package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.fullscreen.story.mobius.view.FullscreenStoryViewState;
import com.spotify.stories.v1.view.proto.Story;

/* renamed from: nba reason: default package */
public abstract class nba implements Parcelable {
    public static final nba i = new a().a(Optional.e()).a(-1).a(0).b(0).a(ImmutableList.d()).a(FullscreenStoryViewState.LOADING).b(Optional.e()).a(true).a();

    /* renamed from: nba$a */
    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(long j);

        public abstract a a(Optional<Story> optional);

        public abstract a a(ImmutableList<Boolean> immutableList);

        public abstract a a(FullscreenStoryViewState fullscreenStoryViewState);

        public abstract a a(boolean z);

        public abstract nba a();

        public abstract a b(long j);

        public abstract a b(Optional<Boolean> optional);
    }

    /* renamed from: nba$b */
    static class b {
        b() {
        }
    }

    /* renamed from: nba$c */
    static class c {
        c() {
        }

        public static Optional<Story> a(Parcel parcel) {
            try {
                byte[] createByteArray = parcel.createByteArray();
                if (createByteArray == null) {
                    return Optional.e();
                }
                Story a = Story.a(createByteArray);
                if (a.equals(Story.l())) {
                    return Optional.e();
                }
                return Optional.b(a);
            } catch (Exception unused) {
                return Optional.e();
            }
        }
    }

    public abstract FullscreenStoryViewState a();

    public abstract int b();

    public abstract Optional<Story> c();

    public abstract ImmutableList<Boolean> d();

    public abstract long e();

    public abstract long f();

    public abstract Optional<Boolean> g();

    public abstract boolean h();

    public abstract a i();

    public final nba a(FullscreenStoryViewState fullscreenStoryViewState) {
        return i().a(fullscreenStoryViewState).a();
    }

    public final nba a(boolean z) {
        return i().a(z).a();
    }
}
