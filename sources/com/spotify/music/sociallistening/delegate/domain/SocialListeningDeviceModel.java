package com.spotify.music.sociallistening.delegate.domain;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.music.sociallistening.model.Participant;

public abstract class SocialListeningDeviceModel {
    public static final SocialListeningDeviceModel a = new defpackage.ubc.a().a(false).a(Optional.e()).b(Optional.e()).a(ScannableImageLoadState.NOT_LOADED).a(b.a).a();

    public enum ScannableImageLoadState {
        NOT_LOADED,
        LOADED,
        FAILED_TO_LOAD
    }

    public static abstract class a {
        public abstract a a(Optional<uax> optional);

        public abstract a a(ScannableImageLoadState scannableImageLoadState);

        public abstract a a(b bVar);

        public abstract a a(boolean z);

        public abstract SocialListeningDeviceModel a();

        public abstract a b(Optional<Boolean> optional);
    }

    public static abstract class b {
        public static final b a = new defpackage.ubd.a().a(false).a(ImmutableList.d()).b(false).a(Optional.e()).b(Optional.e()).c(false).d(false).e(false).f(false).g(false).h(false).a();

        public static abstract class a {
            public abstract a a(Optional<Integer> optional);

            public abstract a a(ImmutableList<Participant> immutableList);

            public abstract a a(boolean z);

            public abstract b a();

            public abstract a b(Optional<String> optional);

            public abstract a b(boolean z);

            public abstract a c(boolean z);

            public abstract a d(boolean z);

            public abstract a e(boolean z);

            public abstract a f(boolean z);

            public abstract a g(boolean z);

            public abstract a h(boolean z);
        }

        public abstract boolean a();

        public abstract ImmutableList<Participant> b();

        public abstract boolean c();

        public abstract Optional<Integer> d();

        public abstract Optional<String> e();

        public abstract boolean f();

        public abstract boolean g();

        public abstract boolean h();

        public abstract boolean i();

        public abstract boolean j();

        public abstract boolean k();

        public abstract a l();
    }

    public abstract boolean a();

    public abstract Optional<uax> b();

    public abstract Optional<Boolean> c();

    public abstract ScannableImageLoadState d();

    public abstract b e();

    public abstract a f();

    public final SocialListeningDeviceModel a(uax uax) {
        return f().a(Optional.b(uax)).a();
    }

    public final SocialListeningDeviceModel a(ScannableImageLoadState scannableImageLoadState) {
        return f().a(scannableImageLoadState).a();
    }
}
