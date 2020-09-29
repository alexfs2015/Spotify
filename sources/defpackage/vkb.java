package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: vkb reason: default package */
public interface vkb {
    public static final way a = way.e().a("album.artist.name").a();
    public static final way b = way.e().a("trackNumber").a();
    public static final way c = way.e().a("discNumber").a(b).a();
    public static final way d = way.e().a("album.name").a(c).a();
    public static final way e = way.e().a("artist.name").a(d).a();
    public static final way f = way.e().a("").a();
    public static final way g = way.e().a("name").a();
    public static final way h = way.e().a("addTime").a(d).a();
    public static final ImmutableList<way> i = ImmutableList.a(a, b, c, d, e, f, g, h);
}
