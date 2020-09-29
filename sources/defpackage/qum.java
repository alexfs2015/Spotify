package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;

/* renamed from: qum reason: default package */
public abstract class qum implements Parcelable {
    public static final qum f = new a().a(0).b(0).a(b.d).a(ImmutableMap.f()).a(false).b(false).a((Boolean) null).a();

    /* renamed from: qum$a */
    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(ImmutableMap<String, String> immutableMap);

        public abstract a a(Boolean bool);

        public abstract a a(b bVar);

        public abstract a a(boolean z);

        public abstract qum a();

        public abstract a b(int i);

        public abstract a b(boolean z);
    }

    /* renamed from: qum$b */
    public static abstract class b implements Parcelable {
        public static final b d = new a().a(false).a("").a(ImmutableMap.f()).a();

        /* renamed from: qum$b$a */
        public static abstract class a {
            public abstract a a(ImmutableMap<String, Boolean> immutableMap);

            public abstract a a(String str);

            public abstract a a(vns vns);

            public abstract a a(boolean z);

            public abstract b a();
        }

        public abstract boolean a();

        public abstract String b();

        public abstract vns c();

        public abstract ImmutableMap<String, Boolean> d();

        public static a f() {
            return new a();
        }
    }

    /* renamed from: qum$c */
    public static class c {
        public static ImmutableMap<String, Boolean> a(Parcel parcel) {
            int readInt = parcel.readInt();
            com.google.common.collect.ImmutableMap.a g = ImmutableMap.g();
            for (int i = 0; i < readInt; i++) {
                g.b((String) fay.a(parcel.readString()), Boolean.valueOf(jse.a(parcel)));
            }
            return g.b();
        }
    }

    /* renamed from: qum$d */
    public static class d {
        public static ImmutableMap<String, String> a(Parcel parcel) {
            int readInt = parcel.readInt();
            com.google.common.collect.ImmutableMap.a g = ImmutableMap.g();
            for (int i = 0; i < readInt; i++) {
                g.b((String) fay.a(parcel.readString()), (String) fay.a(parcel.readString()));
            }
            return g.b();
        }
    }

    public abstract int a();

    public abstract int b();

    public abstract b c();

    public abstract ImmutableMap<String, String> d();

    public abstract Boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract a h();

    public static a j() {
        return new a();
    }

    public final qum a(int i) {
        return h().a(i).a();
    }
}
