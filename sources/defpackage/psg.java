package defpackage;

import android.os.Parcelable;
import com.spotify.music.features.profile.model.LoadingState;

/* renamed from: psg reason: default package */
public abstract class psg implements Parcelable {
    public static final psg p;

    /* renamed from: psg$a */
    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(LoadingState loadingState);

        public abstract a a(String str);

        public abstract a a(prg prg);

        public abstract a a(boolean z);

        public abstract psg a();

        public abstract a b(int i);

        public abstract a b(String str);

        public abstract a b(prg prg);

        public abstract a b(boolean z);

        public abstract a c(int i);

        public abstract a c(String str);

        public abstract a c(boolean z);

        public abstract a d(String str);

        public abstract a d(boolean z);

        public abstract a e(boolean z);
    }

    static {
        String str = "";
        p = new a().a(str).b(str).c((String) null).a(false).b(false).d(str).c(false).a(0).b(0).c(0).d(false).e(false).a(LoadingState.NOT_LOADED).a(prg.c).b(prg.c).a();
    }

    public abstract String a();

    public final psg a(LoadingState loadingState) {
        return p().a(loadingState).a();
    }

    public final psg a(String str) {
        return p().d(str).a();
    }

    public final psg a(prg prg) {
        return p().a(prg).a();
    }

    public abstract String b();

    public final psg b(prg prg) {
        return p().b(prg).a();
    }

    public abstract String c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract String f();

    public abstract boolean g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract LoadingState m();

    public abstract prg n();

    public abstract prg o();

    public abstract a p();

    public final String q() {
        return (String) fbp.a(jva.b(a()).h());
    }

    public final String r() {
        return !b().isEmpty() ? b() : a();
    }
}
