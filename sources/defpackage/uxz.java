package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: uxz reason: default package */
public interface uxz {
    public static final vns a = vns.e().a("album.artist.name").a();
    public static final vns b = vns.e().a("trackNumber").a();
    public static final vns c = vns.e().a("discNumber").a(b).a();
    public static final vns d = vns.e().a("album.name").a(c).a();
    public static final vns e = vns.e().a("artist.name").a(d).a();
    public static final vns f = vns.e().a("").a();
    public static final vns g = vns.e().a("name").a();
    public static final vns h = vns.e().a("addTime").a(d).a();
    public static final ImmutableList<vns> i = ImmutableList.a(a, b, c, d, e, f, g, h);
}
