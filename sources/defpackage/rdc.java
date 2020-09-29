package defpackage;

import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

/* renamed from: rdc reason: default package */
public abstract class rdc implements Parcelable, rdi {
    public static final rdc h;
    public static final rdc i;

    /* renamed from: rdc$a */
    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(ImmutableList<MusicItem> immutableList);

        public abstract a a(MusicItem musicItem);

        public abstract a a(rdb rdb);

        public abstract a a(rdc rdc);

        public abstract a a(boolean z);

        public abstract rdc a();

        public abstract a b(int i);
    }

    /* renamed from: rdc$b */
    public static class b {
    }

    static {
        rdc a2 = new a().a(false).a(0).b(0).a(ImmutableList.d()).a(MusicItem.p).a((rdb) null).a((rdc) null).a();
        h = a2;
        i = a2.h().a(true).a();
    }

    public static a n() {
        return new a();
    }

    public final MusicItem a(int i2) {
        rdc rdc = this;
        while (true) {
            if (i2 >= rdc.b()) {
                rdc g = rdc.g();
                if (g == null) {
                    break;
                }
                i2 -= rdc.b();
                rdc = g;
            } else if (i2 >= rdc.c() && i2 - rdc.c() < rdc.d().size()) {
                return (MusicItem) rdc.d().get(i2 - rdc.c());
            }
        }
        return rdc.e();
    }

    public abstract boolean a();

    public abstract int b();

    public abstract int c();

    public abstract ImmutableList<MusicItem> d();

    public abstract MusicItem e();

    public abstract rdb f();

    public abstract rdc g();

    public abstract a h();

    public final boolean j() {
        for (rdc rdc = this; rdc != null; rdc = rdc.g()) {
            if (!rdc.d().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public int k() {
        rdc g = g();
        return b() + (g != null ? g.k() : 0);
    }

    public final boolean l() {
        for (rdc rdc = this; rdc != null; rdc = rdc.g()) {
            if (rdc.a()) {
                return true;
            }
        }
        return false;
    }

    public final rdb m() {
        rdc rdc = this;
        while (((rdc) fbp.a(rdc)).f() == null && rdc.g() != null) {
            rdc = (rdc) fbp.a(rdc.g());
        }
        return rdc.f();
    }
}
