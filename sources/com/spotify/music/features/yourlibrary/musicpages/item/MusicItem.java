package com.spotify.music.features.yourlibrary.musicpages.item;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData;
import com.spotify.mobile.android.util.Assertion;
import java.util.EnumSet;
import java.util.List;

public abstract class MusicItem implements Parcelable, defpackage.qtl.a<Type> {
    private static final EnumSet<Type> a = EnumSet.of(Type.SECTION_HEADER, Type.SECTION_HEADER_WITH_BUTTON, Type.SECTION_HEADER_WITH_SUBTITLE, Type.SECTION_HEADER_CUSTOM);
    public static final MusicItem p = z().a(0).a(Type.PLACEHOLDER).a();

    public enum Type {
        ADD_ARTISTS_BUTTON("add_artists_button"),
        ALBUM("album"),
        ARTIST("artist"),
        ARTIST_TWO_LINES("artist_two_lines"),
        BANNED_ARTISTS("banned_artists"),
        BANNED_TRACKS("banned_tracks"),
        CREATE_PLAYLIST_BUTTON("create_playlist_button"),
        DOWNLOAD_TOGGLE("download_toggle"),
        FAVORITE_SONGS("favorite_songs"),
        FAVORITE_SONGS_EMPTY("favorite_songs_empty"),
        FILTER_INDICATOR("filter_indicator"),
        FILTER_INFO("filter_info"),
        FOLDER("folder"),
        GROUP_HEADER_ALBUM("group_header_album"),
        GROUP_HEADER_ARTIST("group_header_artist"),
        LOADING_INDICATOR("loading_indicator"),
        PLACEHOLDER("placeholder"),
        PLAYLIST("playlist"),
        SECTION_HEADER("section-header"),
        SECTION_HEADER_CUSTOM("section-header-custom"),
        SECTION_HEADER_WITH_BUTTON("section-header-with-action-button"),
        SECTION_HEADER_WITH_SUBTITLE("section-header-with-subtitle"),
        TRACK(TrackData.TYPE_TRACK),
        TRACK_SHUFFLE_ONLY("track_shuffle_only");
        
        public static final Type[] y = null;
        private final String mStringValue;

        static {
            y = values();
        }

        private Type(String str) {
            this.mStringValue = str;
        }

        public final String toString() {
            return this.mStringValue;
        }
    }

    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(long j);

        public abstract a a(Type type);

        public abstract a a(b bVar);

        public abstract a a(Boolean bool);

        public abstract a a(String str);

        public abstract a a(uzf uzf);

        public abstract a a(boolean z);

        public abstract MusicItem a();

        public abstract a b(int i);

        public abstract a b(String str);

        public abstract a b(boolean z);

        public abstract a c(String str);

        public abstract a c(boolean z);

        public abstract a d(String str);

        public abstract a d(boolean z);

        public abstract a e(String str);
    }

    public interface b extends Parcelable {
    }

    public static class c {
    }

    public static abstract class d implements b {

        public static abstract class a {
            public abstract a a(List<qxd> list);

            public abstract d a();
        }

        public abstract List<qxd> a();

        public static a b() {
            return new defpackage.qxj.a();
        }
    }

    public static abstract class e implements b {

        public static abstract class a {
            public abstract a a(String str);

            public abstract a a(boolean z);

            public abstract e a();

            public abstract a b(String str);

            public abstract a b(boolean z);

            public abstract a c(String str);

            public abstract a d(String str);

            public abstract a e(String str);
        }

        public abstract String a();

        public abstract String b();

        public abstract String c();

        public abstract String d();

        public abstract boolean e();

        public abstract boolean f();

        public abstract String g();

        static {
            h().a();
        }

        public static a h() {
            String str = "";
            return new defpackage.qxk.a().a(str).b(str).c(str).d(str).a(false).b(false).e(str);
        }
    }

    public static abstract class f implements b {

        public static abstract class a {
            public abstract a a(String str);

            public abstract a a(boolean z);

            public abstract f a();

            public abstract a b(String str);

            public abstract a b(boolean z);

            public abstract a c(boolean z);

            public abstract a d(boolean z);

            public abstract a e(boolean z);

            public abstract a f(boolean z);

            public abstract a g(boolean z);

            public abstract a h(boolean z);
        }

        public abstract boolean a();

        public abstract boolean b();

        public abstract boolean c();

        public abstract boolean d();

        public abstract boolean e();

        public abstract boolean f();

        public abstract boolean g();

        public abstract boolean h();

        public abstract String i();

        public abstract String j();

        public abstract a k();

        public static a l() {
            return new defpackage.qxl.a();
        }
    }

    public abstract long b();

    /* renamed from: c */
    public abstract Type a();

    public abstract boolean d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract String h();

    public abstract String i();

    public abstract String j();

    public abstract String k();

    public abstract String l();

    public abstract int m();

    public abstract int n();

    public abstract Boolean o();

    public abstract uzf p();

    public abstract b q();

    public abstract a r();

    public final String u() {
        if (l().isEmpty()) {
            return null;
        }
        return l();
    }

    public boolean v() {
        return a() == Type.TRACK || a() == Type.TRACK_SHUFFLE_ONLY;
    }

    public final f w() {
        if (!v() || q() == null) {
            Assertion.a();
        }
        return (f) q();
    }

    private boolean s() {
        return a.contains(a());
    }

    public final e x() {
        if (!s() || q() == null) {
            Assertion.a();
        }
        return (e) q();
    }

    public static MusicItem a(long j, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z3, uzf uzf) {
        qxm qxm = new qxm(j, Type.PLAYLIST, true, z, false, false, str, str2, str3, str4, str5, i, i2, Boolean.valueOf(z3), uzf, null);
        return qxm;
    }

    public static MusicItem a(long j, boolean z, String str, String str2, String str3, int i, int i2) {
        qxm qxm = new qxm(j, Type.FOLDER, true, false, false, false, str, str2, str3, str3, "", i, i2, null, null, null);
        return qxm;
    }

    public static MusicItem a(long j, String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, boolean z2, boolean z3, uzf uzf) {
        boolean z4 = z2;
        boolean z5 = z3;
        qxm qxm = new qxm(j, Type.ALBUM, true, z4, z5, false, str, str2, str3, str4, str5, i, i2, Boolean.valueOf(z), uzf, null);
        return qxm;
    }

    public static MusicItem a(long j, Type type, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, String str4, String str5, int i, int i2, uzf uzf) {
        qxm qxm = new qxm(j, type, z, z2, z3, z4, str, str2, str3, str4, str5, i, i2, null, uzf, null);
        return qxm;
    }

    public static MusicItem a(long j, Type type, boolean z, String str, String str2, String str3, String str4, String str5, int i, int i2, uzf uzf, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str6, String str7) {
        long j2 = j;
        Type type2 = type;
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        int i3 = i;
        int i4 = i2;
        uzf uzf2 = uzf;
        qxp qxp = r19;
        qxp qxp2 = new qxp(z2, z3, z4, z5, z6, z7, false, z9, str6, str7);
        qxm qxm = new qxm(j2, type2, true, false, false, false, str8, str9, str10, str11, str12, i3, i4, null, uzf2, qxp);
        return qxm;
    }

    public static a y() {
        return new defpackage.qxi.a().b(-1);
    }

    public static a z() {
        String str = "";
        return new defpackage.qxi.a().a(str).b(str).c(str).d(str).a(0).e(str).a((Boolean) null).a((uzf) new defpackage.uzf.f()).a(true).b(false).c(false).d(false).b(-1);
    }

    public static Creator<MusicItem> A() {
        return new Creator<MusicItem>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new qxm[i];
            }

            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                return (MusicItem) qxm.CREATOR.createFromParcel(parcel);
            }
        };
    }
}
