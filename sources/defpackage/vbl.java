package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;

/* renamed from: vbl reason: default package */
public abstract class vbl {

    /* renamed from: vbl$a */
    public static abstract class a {
        public abstract a a(ImmutableList<b> immutableList);

        public abstract a a(String str);

        public abstract a a(boolean z);

        public abstract vbl a();

        public abstract a b(String str);

        public abstract a b(boolean z);
    }

    /* renamed from: vbl$b */
    public static abstract class b {

        /* renamed from: vbl$b$a */
        public static abstract class a {
            public abstract a a(SpotifyIconV2 spotifyIconV2);

            public abstract a a(String str);

            public abstract a a(boolean z);

            public abstract b a();

            public abstract a b(String str);
        }

        public abstract String a();

        public abstract boolean b();

        public abstract String c();

        public abstract SpotifyIconV2 d();
    }

    public static vbl g() {
        String str = "";
        return new a().a(false).a(str).b(false).b(str).a(ImmutableList.d()).a();
    }

    public final vbl a(ImmutableList<b> immutableList) {
        return f().a(immutableList).a();
    }

    public abstract boolean a();

    public abstract String b();

    public abstract boolean c();

    public abstract String d();

    public abstract ImmutableList<b> e();

    public abstract a f();
}
