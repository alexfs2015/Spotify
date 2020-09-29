package com.spotify.music.playlist.ui;

public abstract class ItemConfiguration {

    public enum HeartAndBan {
        NO_HEART_OR_BAN,
        ONLY_HEART,
        HEART_AND_BAN
    }

    public enum LongClickAction {
        SHOW_CONTEXT_MENU,
        DO_NOTHING
    }

    public interface a {
        a a(HeartAndBan heartAndBan);

        a a(LongClickAction longClickAction);

        a a(boolean z);

        ItemConfiguration a();

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
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract HeartAndBan d();

    public abstract LongClickAction e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract boolean m();

    public abstract boolean n();

    public abstract boolean o();

    public abstract boolean p();

    public abstract a q();

    public static a r() {
        return new defpackage.tkb.a().a(false).b(false).c(false).a(HeartAndBan.NO_HEART_OR_BAN).a(LongClickAction.DO_NOTHING).d(false).e(false).f(false).g(false).h(false).i(false).j(false).k(false).l(false).m(false).n(false);
    }
}
