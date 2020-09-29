package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.sociallistening.model.Participant;

/* renamed from: ucd reason: default package */
public abstract class ucd {
    public static final ucd a;

    /* renamed from: ucd$a */
    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(ImmutableList<Participant> immutableList);

        public abstract a a(String str);

        public abstract a a(boolean z);

        public abstract ucd a();

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

    public abstract boolean a();

    public abstract String b();

    public abstract int c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract String k();

    public abstract ImmutableList<Participant> l();

    public abstract String m();

    public abstract a n();

    public final ucd a(boolean z) {
        return n().a(z).a();
    }

    public final ucd a(int i) {
        return n().a(i).a();
    }

    public final ucd b(boolean z) {
        return n().c(z).a();
    }

    public final ucd c(boolean z) {
        return n().d(true).a();
    }

    public final ucd d(boolean z) {
        return n().g(z).a();
    }

    public final ucd a(String str) {
        return n().c(str).a();
    }

    public final ucd o() {
        String str = "";
        return n().a(str).b(false).c(false).d(false).e(false).f(false).g(false).h(false).b(str).a(ImmutableList.d()).a();
    }

    public final boolean p() {
        return l().size() >= 2;
    }

    static {
        String str = "";
        a = new a().a(false).a(str).b(false).a(0).c(false).d(false).e(false).f(false).g(false).h(false).b(str).c(str).a(ImmutableList.d()).a();
    }
}
