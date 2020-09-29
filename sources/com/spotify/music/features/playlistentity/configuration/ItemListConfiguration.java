package com.spotify.music.features.playlistentity.configuration;

import com.google.common.base.Optional;

public abstract class ItemListConfiguration {

    public enum LongClickAction {
        SHOW_CONTEXT_MENU,
        DO_NOTHING
    }

    public interface a {
        a a(Optional<Boolean> optional);

        a a(LongClickAction longClickAction);

        a a(boolean z);

        ItemListConfiguration a();

        a b(boolean z);

        a c(boolean z);

        a d(boolean z);

        a e(boolean z);

        a f(boolean z);

        a g(boolean z);

        a h(boolean z);

        a i(boolean z);

        a j(boolean z);

        a k(boolean z);

        a l(boolean z);

        a m(boolean z);

        a n(boolean z);

        a o(boolean z);

        a p(boolean z);

        a q(boolean z);

        a r(boolean z);

        a s(boolean z);

        a t(boolean z);

        a u(boolean z);

        a v(boolean z);

        a w(boolean z);
    }

    static {
        new defpackage.ont.a().a(false).b(false).c(false).d(false).e(false).f(false).g(false).h(false).i(false).j(false).k(false).l(false).m(false).a(LongClickAction.DO_NOTHING).n(false).o(false).p(false).q(false).a(Optional.b(Boolean.FALSE)).r(false).s(false).t(false).u(false).v(false).w(false).a();
    }

    public static a A() {
        return new defpackage.ont.a();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract boolean m();

    public abstract LongClickAction n();

    public abstract boolean o();

    public abstract boolean p();

    public abstract boolean q();

    public abstract boolean r();

    public abstract Optional<Boolean> s();

    public abstract boolean t();

    public abstract boolean u();

    public abstract boolean v();

    public abstract boolean w();

    public abstract boolean x();

    public abstract boolean y();

    public abstract a z();
}
