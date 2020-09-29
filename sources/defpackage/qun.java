package defpackage;

import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

/* renamed from: qun reason: default package */
public abstract class qun implements Parcelable, qut {
    public static final qun h;
    public static final qun i;

    /* renamed from: qun$a */
    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(ImmutableList<MusicItem> immutableList);

        public abstract a a(MusicItem musicItem);

        public abstract a a(qum qum);

        public abstract a a(qun qun);

        public abstract a a(boolean z);

        public abstract qun a();

        public abstract a b(int i);
    }

    /* renamed from: qun$b */
    public static class b {
    }

    public abstract boolean a();

    public abstract int b();

    public abstract int c();

    public abstract ImmutableList<MusicItem> d();

    public abstract MusicItem e();

    public abstract qum f();

    public abstract qun g();

    public abstract a h();

    public final boolean j() {
        for (qun qun = this; qun != null; qun = qun.g()) {
            if (!qun.d().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public int k() {
        qun g = g();
        return b() + (g != null ? g.k() : 0);
    }

    public final MusicItem a(int i2) {
        qun qun = this;
        while (true) {
            if (i2 >= qun.b()) {
                qun g = qun.g();
                if (g == null) {
                    break;
                }
                i2 -= qun.b();
                qun = g;
            } else if (i2 >= qun.c() && i2 - qun.c() < qun.d().size()) {
                return (MusicItem) qun.d().get(i2 - qun.c());
            }
        }
        return qun.e();
    }

    public final boolean l() {
        for (qun qun = this; qun != null; qun = qun.g()) {
            if (qun.a()) {
                return true;
            }
        }
        return false;
    }

    public final qum m() {
        qun qun = this;
        while (((qun) fay.a(qun)).f() == null && qun.g() != null) {
            qun = (qun) fay.a(qun.g());
        }
        return qun.f();
    }

    public static a n() {
        return new a();
    }

    static {
        qun a2 = new a().a(false).a(0).b(0).a(ImmutableList.d()).a(MusicItem.p).a((qum) null).a((qun) null).a();
        h = a2;
        i = a2.h().a(true).a();
    }
}
