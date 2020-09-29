package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.music.sociallistening.model.Participant;

/* renamed from: uqa reason: default package */
public abstract class uqa {
    public static final uqa a = new a().a(Optional.e()).b(Optional.e()).a(false).a();

    /* renamed from: uqa$a */
    public static abstract class a {
        public abstract a a(Optional<ImmutableList<Participant>> optional);

        public abstract a a(boolean z);

        public abstract uqa a();

        public abstract a b(Optional<String> optional);
    }

    public abstract Optional<ImmutableList<Participant>> a();

    public final uqa a(boolean z) {
        return d().a(true).a();
    }

    public abstract Optional<String> b();

    public abstract boolean c();

    public abstract a d();
}
