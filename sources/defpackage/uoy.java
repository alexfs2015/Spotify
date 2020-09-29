package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.sociallistening.model.Participant;

/* renamed from: uoy reason: default package */
public abstract class uoy {
    public static final uoy a;

    /* renamed from: uoy$a */
    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(long j);

        public abstract a a(ImmutableList<Participant> immutableList);

        public abstract a a(String str);

        public abstract a a(boolean z);

        public abstract uoy a();

        public abstract a b(String str);

        public abstract a b(boolean z);

        public abstract a c(String str);

        public abstract a c(boolean z);

        public abstract a d(boolean z);

        public abstract a e(boolean z);

        public abstract a f(boolean z);

        public abstract a g(boolean z);

        public abstract a h(boolean z);
    }

    static {
        String str = "";
        a = new a().a(false).a(0).a(str).b(false).a(0).c(false).d(false).e(false).f(false).g(false).h(false).b(str).c(str).a(ImmutableList.d()).a();
    }

    public final uoy a(int i) {
        return o().a(i).a();
    }

    public final uoy a(String str) {
        return o().c(str).a();
    }

    public final uoy a(boolean z) {
        return o().c(z).a();
    }

    public abstract boolean a();

    public abstract long b();

    public final uoy b(boolean z) {
        return o().d(true).a();
    }

    public abstract String c();

    public final uoy c(boolean z) {
        return o().g(z).a();
    }

    public abstract int d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract String l();

    public abstract ImmutableList<Participant> m();

    public abstract String n();

    public abstract a o();

    public final uoy p() {
        String str = "";
        return o().a(str).b(false).c(false).d(false).e(false).f(false).g(false).h(false).b(str).a(ImmutableList.d()).a();
    }

    public final boolean q() {
        return m().size() >= 2;
    }
}
