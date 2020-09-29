package com.spotify.music.features.yourlibrary.musicpages.domain;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs;

public abstract class MusicPagesModel {

    public enum LoadingState {
        LOADING,
        LOADED,
        LOADED_PARTIALLY,
        LOADED_EMPTY,
        LOADED_EMPTY_WITH_FILTER,
        LOADED_EMPTY_WITH_TEXT_FILTER
    }

    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(Optional<uqv> optional);

        public abstract a a(LoadingState loadingState);

        public abstract a a(String str);

        public abstract a a(qun qun);

        public abstract a a(qwl qwl);

        public abstract a a(qyb qyb);

        public abstract a a(uqg uqg);

        public abstract a a(uqu uqu);

        public abstract a a(boolean z);

        public abstract MusicPagesModel a();

        public abstract a b(int i);

        public abstract a b(Optional<ImmutableMap<String, Boolean>> optional);

        public abstract a b(boolean z);

        public abstract a c(Optional<PagePrefs> optional);

        public abstract a c(boolean z);

        public abstract a d(Optional<Boolean> optional);

        public abstract a d(boolean z);

        public abstract a e(Optional<Boolean> optional);

        public abstract a e(boolean z);

        public abstract a f(Optional<Boolean> optional);

        public abstract a g(Optional<Boolean> optional);

        public abstract a h(Optional<Boolean> optional);
    }

    public abstract qyb a();

    public abstract Optional<uqv> b();

    public abstract Optional<ImmutableMap<String, Boolean>> c();

    public abstract Optional<PagePrefs> d();

    public abstract String e();

    public abstract int f();

    public abstract int g();

    public abstract qun h();

    public abstract Optional<Boolean> i();

    public abstract Optional<Boolean> j();

    public abstract Optional<Boolean> k();

    public abstract Optional<Boolean> l();

    public abstract Optional<Boolean> m();

    public abstract LoadingState n();

    public abstract boolean o();

    public abstract boolean p();

    public abstract boolean q();

    public abstract boolean r();

    public abstract boolean s();

    public abstract uqg t();

    public abstract uqu u();

    public abstract qwl v();

    public abstract a w();

    public final MusicPagesModel a(uqv uqv) {
        return w().a(Optional.b(uqv)).a();
    }

    public final MusicPagesModel a(uqg uqg) {
        return w().a(uqg).a();
    }

    public static a x() {
        return new defpackage.qwh.a().a(Optional.e()).b(Optional.e()).c(Optional.e()).a(0).b(0).a(qun.i).a("").d(Optional.e()).e(Optional.e()).g(Optional.e()).h(Optional.e()).a(LoadingState.LOADING).a(false).b(false).f(Optional.e()).c(false).a(uqg.g()).a(uqu.d).d(false).e(false).a((qwl) new d());
    }
}
