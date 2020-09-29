package defpackage;

/* renamed from: aty reason: default package */
final class aty {
    private static final int A = bdw.g("sosn");
    private static final int B = bdw.g("tvsh");
    private static final int C = bdw.g("----");
    private static final String[] D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};
    private static final int a = bdw.g("nam");
    private static final int b = bdw.g("trk");
    private static final int c = bdw.g("cmt");
    private static final int d = bdw.g("day");
    private static final int e = bdw.g("ART");
    private static final int f = bdw.g("too");
    private static final int g = bdw.g("alb");
    private static final int h = bdw.g("com");
    private static final int i = bdw.g("wrt");
    private static final int j = bdw.g("lyr");
    private static final int k = bdw.g("gen");
    private static final int l = bdw.g("covr");
    private static final int m = bdw.g("gnre");
    private static final int n = bdw.g("grp");
    private static final int o = bdw.g("disk");
    private static final int p = bdw.g("trkn");
    private static final int q = bdw.g("tmpo");
    private static final int r = bdw.g("cpil");
    private static final int s = bdw.g("aART");
    private static final int t = bdw.g("sonm");
    private static final int u = bdw.g("soal");
    private static final int v = bdw.g("soar");
    private static final int w = bdw.g("soaa");
    private static final int x = bdw.g("soco");
    private static final int y = bdw.g("rtng");
    private static final int z = bdw.g("pgap");

    private static aws a(int i2, String str, bdj bdj) {
        int i3 = bdj.i();
        if (bdj.i() == att.aE) {
            bdj.d(8);
            return new aws(str, null, bdj.f(i3 - 16));
        }
        StringBuilder sb = new StringBuilder("Failed to parse text attribute: ");
        sb.append(att.c(i2));
        bdd.c("MetadataUtil", sb.toString());
        return null;
    }

    private static awp a(int i2, String str, bdj bdj, boolean z2, boolean z3) {
        int b2 = b(bdj);
        if (z3) {
            b2 = Math.min(1, b2);
        }
        if (b2 < 0) {
            StringBuilder sb = new StringBuilder("Failed to parse uint8 attribute: ");
            sb.append(att.c(i2));
            bdd.c("MetadataUtil", sb.toString());
            return null;
        } else if (z2) {
            return new aws(str, null, Integer.toString(b2));
        } else {
            return new awm("und", str, Integer.toString(b2));
        }
    }

    private static aws b(int i2, String str, bdj bdj) {
        int i3 = bdj.i();
        if (bdj.i() == att.aE && i3 >= 22) {
            bdj.d(10);
            int d2 = bdj.d();
            if (d2 > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(d2);
                String sb2 = sb.toString();
                int d3 = bdj.d();
                if (d3 > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(d3);
                    sb2 = sb3.toString();
                }
                return new aws(str, null, sb2);
            }
        }
        StringBuilder sb4 = new StringBuilder("Failed to parse index/count attribute: ");
        sb4.append(att.c(i2));
        bdd.c("MetadataUtil", sb4.toString());
        return null;
    }

    private static int b(bdj bdj) {
        bdj.d(4);
        if (bdj.i() == att.aE) {
            bdj.d(8);
            return bdj.c();
        }
        bdd.c("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static a a(bdj bdj) {
        a aVar;
        int i2 = bdj.b + bdj.i();
        int i3 = bdj.i();
        int i4 = i3 >>> 24;
        String str = "TCON";
        String str2 = "MetadataUtil";
        a aVar2 = null;
        if (i4 == 169 || i4 == 65533) {
            int i5 = 16777215 & i3;
            if (i5 == c) {
                int i6 = bdj.i();
                if (bdj.i() == att.aE) {
                    bdj.d(8);
                    String f2 = bdj.f(i6 - 16);
                    aVar2 = new awm("und", f2, f2);
                } else {
                    StringBuilder sb = new StringBuilder("Failed to parse comment attribute: ");
                    sb.append(att.c(i3));
                    bdd.c(str2, sb.toString());
                }
                bdj.c(i2);
                return aVar2;
            }
            if (i5 != a) {
                if (i5 != b) {
                    if (i5 != h) {
                        if (i5 != i) {
                            if (i5 == d) {
                                aws a2 = a(i3, "TDRC", bdj);
                                bdj.c(i2);
                                return a2;
                            } else if (i5 == e) {
                                aws a3 = a(i3, "TPE1", bdj);
                                bdj.c(i2);
                                return a3;
                            } else if (i5 == f) {
                                aws a4 = a(i3, "TSSE", bdj);
                                bdj.c(i2);
                                return a4;
                            } else if (i5 == g) {
                                aws a5 = a(i3, "TALB", bdj);
                                bdj.c(i2);
                                return a5;
                            } else if (i5 == j) {
                                aws a6 = a(i3, "USLT", bdj);
                                bdj.c(i2);
                                return a6;
                            } else if (i5 == k) {
                                aws a7 = a(i3, str, bdj);
                                bdj.c(i2);
                                return a7;
                            } else if (i5 == n) {
                                aws a8 = a(i3, "TIT1", bdj);
                                bdj.c(i2);
                                return a8;
                            }
                        }
                    }
                    aws a9 = a(i3, "TCOM", bdj);
                    bdj.c(i2);
                    return a9;
                }
            }
            aws a10 = a(i3, "TIT2", bdj);
            bdj.c(i2);
            return a10;
        }
        try {
            if (i3 == m) {
                int b2 = b(bdj);
                String str3 = (b2 <= 0 || b2 > 148) ? null : D[b2 - 1];
                if (str3 != null) {
                    aVar = new aws(str, null, str3);
                } else {
                    bdd.c(str2, "Failed to parse standard genre code");
                    aVar = null;
                }
                return aVar;
            } else if (i3 == o) {
                aws b3 = b(i3, "TPOS", bdj);
                bdj.c(i2);
                return b3;
            } else if (i3 == p) {
                aws b4 = b(i3, "TRCK", bdj);
                bdj.c(i2);
                return b4;
            } else if (i3 == q) {
                awp a11 = a(i3, "TBPM", bdj, true, false);
                bdj.c(i2);
                return a11;
            } else if (i3 == r) {
                awp a12 = a(i3, "TCMP", bdj, true, true);
                bdj.c(i2);
                return a12;
            } else if (i3 == l) {
                int i7 = bdj.i();
                if (bdj.i() == att.aE) {
                    int b5 = att.b(bdj.i());
                    String str4 = b5 == 13 ? "image/jpeg" : b5 == 14 ? "image/png" : null;
                    if (str4 == null) {
                        StringBuilder sb2 = new StringBuilder("Unrecognized cover art flags: ");
                        sb2.append(b5);
                        bdd.c(str2, sb2.toString());
                    } else {
                        bdj.d(4);
                        byte[] bArr = new byte[(i7 - 16)];
                        bdj.a(bArr, 0, bArr.length);
                        aVar2 = new awi(str4, null, 3, bArr);
                    }
                } else {
                    bdd.c(str2, "Failed to parse cover art attribute");
                }
                bdj.c(i2);
                return aVar2;
            } else if (i3 == s) {
                aws a13 = a(i3, "TPE2", bdj);
                bdj.c(i2);
                return a13;
            } else if (i3 == t) {
                aws a14 = a(i3, "TSOT", bdj);
                bdj.c(i2);
                return a14;
            } else if (i3 == u) {
                aws a15 = a(i3, "TSO2", bdj);
                bdj.c(i2);
                return a15;
            } else if (i3 == v) {
                aws a16 = a(i3, "TSOA", bdj);
                bdj.c(i2);
                return a16;
            } else if (i3 == w) {
                aws a17 = a(i3, "TSOP", bdj);
                bdj.c(i2);
                return a17;
            } else if (i3 == x) {
                aws a18 = a(i3, "TSOC", bdj);
                bdj.c(i2);
                return a18;
            } else if (i3 == y) {
                awp a19 = a(i3, "ITUNESADVISORY", bdj, false, false);
                bdj.c(i2);
                return a19;
            } else if (i3 == z) {
                awp a20 = a(i3, "ITUNESGAPLESS", bdj, false, true);
                bdj.c(i2);
                return a20;
            } else if (i3 == A) {
                aws a21 = a(i3, "TVSHOWSORT", bdj);
                bdj.c(i2);
                return a21;
            } else if (i3 == B) {
                aws a22 = a(i3, "TVSHOW", bdj);
                bdj.c(i2);
                return a22;
            } else if (i3 == C) {
                awp a23 = a(bdj, i2);
                bdj.c(i2);
                return a23;
            }
        } finally {
            bdj.c(i2);
        }
        StringBuilder sb3 = new StringBuilder("Skipped unknown metadata entry: ");
        sb3.append(att.c(i3));
        bdd.a(str2, sb3.toString());
        bdj.c(i2);
        return null;
    }

    private static awp a(bdj bdj, int i2) {
        String str = null;
        String str2 = null;
        int i3 = -1;
        int i4 = -1;
        while (bdj.b < i2) {
            int i5 = bdj.b;
            int i6 = bdj.i();
            int i7 = bdj.i();
            bdj.d(4);
            if (i7 == att.aC) {
                str = bdj.f(i6 - 12);
            } else if (i7 == att.aD) {
                str2 = bdj.f(i6 - 12);
            } else {
                if (i7 == att.aE) {
                    i3 = i5;
                    i4 = i6;
                }
                bdj.d(i6 - 12);
            }
        }
        if (str == null || str2 == null || i3 == -1) {
            return null;
        }
        bdj.c(i3);
        bdj.d(16);
        return new awq(str, str2, bdj.f(i4 - 16));
    }
}
