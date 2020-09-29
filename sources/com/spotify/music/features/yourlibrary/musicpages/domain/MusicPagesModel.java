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

        public abstract a a(Optional<vca> optional);

        public abstract a a(LoadingState loadingState);

        public abstract a a(String str);

        public abstract a a(rdc rdc);

        public abstract a a(rfa rfa);

        public abstract a a(rgq rgq);

        public abstract a a(vbl vbl);

        public abstract a a(vbz vbz);

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

    public static a x() {
        return new defpackage.rew.a().a(Optional.e()).b(Optional.e()).c(Optional.e()).a(0).b(0).a(rdc.i).a("").d(Optional.e()).e(Optional.e()).g(Optional.e()).h(Optional.e()).a(LoadingState.LOADING).a(false).b(false).f(Optional.e()).c(false).a(vbl.g()).a(vbz.d).d(false).e(false).a((rfa) new d());
    }

    public final MusicPagesModel a(vbl vbl) {
        return w().a(vbl).a();
    }

    public final MusicPagesModel a(vca vca) {
        return w().a(Optional.b(vca)).a();
    }

    public abstract rgq a();

    public abstract Optional<vca> b();

    public abstract Optional<ImmutableMap<String, Boolean>> c();

    public abstract Optional<PagePrefs> d();

    public abstract String e();

    public abstract int f();

    public abstract int g();

    public abstract rdc h();

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

    public abstract vbl t();

    public abstract vbz u();

    public abstract rfa v();

    public abstract a w();
}
