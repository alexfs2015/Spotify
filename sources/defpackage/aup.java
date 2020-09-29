package defpackage;

/* renamed from: aup reason: default package */
final class aup {
    private static final int A = ben.g("sosn");
    private static final int B = ben.g("tvsh");
    private static final int C = ben.g("----");
    private static final String[] D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};
    private static final int a = ben.g("nam");
    private static final int b = ben.g("trk");
    private static final int c = ben.g("cmt");
    private static final int d = ben.g("day");
    private static final int e = ben.g("ART");
    private static final int f = ben.g("too");
    private static final int g = ben.g("alb");
    private static final int h = ben.g("com");
    private static final int i = ben.g("wrt");
    private static final int j = ben.g("lyr");
    private static final int k = ben.g("gen");
    private static final int l = ben.g("covr");
    private static final int m = ben.g("gnre");
    private static final int n = ben.g("grp");
    private static final int o = ben.g("disk");
    private static final int p = ben.g("trkn");
    private static final int q = ben.g("tmpo");
    private static final int r = ben.g("cpil");
    private static final int s = ben.g("aART");
    private static final int t = ben.g("sonm");
    private static final int u = ben.g("soal");
    private static final int v = ben.g("soar");
    private static final int w = ben.g("soaa");
    private static final int x = ben.g("soco");
    private static final int y = ben.g("rtng");
    private static final int z = ben.g("pgap");

    public static a a(bea bea) {
        a aVar;
        int i2 = bea.b + bea.i();
        int i3 = bea.i();
        int i4 = i3 >>> 24;
        String str = "TCON";
        String str2 = "MetadataUtil";
        a aVar2 = null;
        if (i4 == 169 || i4 == 65533) {
            int i5 = 16777215 & i3;
            if (i5 == c) {
                int i6 = bea.i();
                if (bea.i() == auk.aE) {
                    bea.d(8);
                    String f2 = bea.f(i6 - 16);
                    aVar2 = new axd("und", f2, f2);
                } else {
                    StringBuilder sb = new StringBuilder("Failed to parse comment attribute: ");
                    sb.append(auk.c(i3));
                    bdu.c(str2, sb.toString());
                }
                bea.c(i2);
                return aVar2;
            }
            if (i5 != a) {
                if (i5 != b) {
                    if (i5 != h) {
                        if (i5 != i) {
                            if (i5 == d) {
                                axj a2 = a(i3, "TDRC", bea);
                                bea.c(i2);
                                return a2;
                            } else if (i5 == e) {
                                axj a3 = a(i3, "TPE1", bea);
                                bea.c(i2);
                                return a3;
                            } else if (i5 == f) {
                                axj a4 = a(i3, "TSSE", bea);
                                bea.c(i2);
                                return a4;
                            } else if (i5 == g) {
                                axj a5 = a(i3, "TALB", bea);
                                bea.c(i2);
                                return a5;
                            } else if (i5 == j) {
                                axj a6 = a(i3, "USLT", bea);
                                bea.c(i2);
                                return a6;
                            } else if (i5 == k) {
                                axj a7 = a(i3, str, bea);
                                bea.c(i2);
                                return a7;
                            } else if (i5 == n) {
                                axj a8 = a(i3, "TIT1", bea);
                                bea.c(i2);
                                return a8;
                            }
                        }
                    }
                    axj a9 = a(i3, "TCOM", bea);
                    bea.c(i2);
                    return a9;
                }
            }
            axj a10 = a(i3, "TIT2", bea);
            bea.c(i2);
            return a10;
        }
        try {
            if (i3 == m) {
                int b2 = b(bea);
                String str3 = (b2 <= 0 || b2 > 148) ? null : D[b2 - 1];
                if (str3 != null) {
                    aVar = new axj(str, null, str3);
                } else {
                    bdu.c(str2, "Failed to parse standard genre code");
                    aVar = null;
                }
                return aVar;
            } else if (i3 == o) {
                axj b3 = b(i3, "TPOS", bea);
                bea.c(i2);
                return b3;
            } else if (i3 == p) {
                axj b4 = b(i3, "TRCK", bea);
                bea.c(i2);
                return b4;
            } else if (i3 == q) {
                axg a11 = a(i3, "TBPM", bea, true, false);
                bea.c(i2);
                return a11;
            } else if (i3 == r) {
                axg a12 = a(i3, "TCMP", bea, true, true);
                bea.c(i2);
                return a12;
            } else if (i3 == l) {
                int i7 = bea.i();
                if (bea.i() == auk.aE) {
                    int b5 = auk.b(bea.i());
                    String str4 = b5 == 13 ? "image/jpeg" : b5 == 14 ? "image/png" : null;
                    if (str4 == null) {
                        StringBuilder sb2 = new StringBuilder("Unrecognized cover art flags: ");
                        sb2.append(b5);
                        bdu.c(str2, sb2.toString());
                    } else {
                        bea.d(4);
                        byte[] bArr = new byte[(i7 - 16)];
                        bea.a(bArr, 0, bArr.length);
                        aVar2 = new awz(str4, null, 3, bArr);
                    }
                } else {
                    bdu.c(str2, "Failed to parse cover art attribute");
                }
                bea.c(i2);
                return aVar2;
            } else if (i3 == s) {
                axj a13 = a(i3, "TPE2", bea);
                bea.c(i2);
                return a13;
            } else if (i3 == t) {
                axj a14 = a(i3, "TSOT", bea);
                bea.c(i2);
                return a14;
            } else if (i3 == u) {
                axj a15 = a(i3, "TSO2", bea);
                bea.c(i2);
                return a15;
            } else if (i3 == v) {
                axj a16 = a(i3, "TSOA", bea);
                bea.c(i2);
                return a16;
            } else if (i3 == w) {
                axj a17 = a(i3, "TSOP", bea);
                bea.c(i2);
                return a17;
            } else if (i3 == x) {
                axj a18 = a(i3, "TSOC", bea);
                bea.c(i2);
                return a18;
            } else if (i3 == y) {
                axg a19 = a(i3, "ITUNESADVISORY", bea, false, false);
                bea.c(i2);
                return a19;
            } else if (i3 == z) {
                axg a20 = a(i3, "ITUNESGAPLESS", bea, false, true);
                bea.c(i2);
                return a20;
            } else if (i3 == A) {
                axj a21 = a(i3, "TVSHOWSORT", bea);
                bea.c(i2);
                return a21;
            } else if (i3 == B) {
                axj a22 = a(i3, "TVSHOW", bea);
                bea.c(i2);
                return a22;
            } else if (i3 == C) {
                axg a23 = a(bea, i2);
                bea.c(i2);
                return a23;
            }
        } finally {
            bea.c(i2);
        }
        StringBuilder sb3 = new StringBuilder("Skipped unknown metadata entry: ");
        sb3.append(auk.c(i3));
        bdu.a(str2, sb3.toString());
        bea.c(i2);
        return null;
    }

    private static axg a(int i2, String str, bea bea, boolean z2, boolean z3) {
        int b2 = b(bea);
        if (z3) {
            b2 = Math.min(1, b2);
        }
        if (b2 < 0) {
            StringBuilder sb = new StringBuilder("Failed to parse uint8 attribute: ");
            sb.append(auk.c(i2));
            bdu.c("MetadataUtil", sb.toString());
            return null;
        } else if (z2) {
            return new axj(str, null, Integer.toString(b2));
        } else {
            return new axd("und", str, Integer.toString(b2));
        }
    }

    private static axg a(bea bea, int i2) {
        String str = null;
        String str2 = null;
        int i3 = -1;
        int i4 = -1;
        while (bea.b < i2) {
            int i5 = bea.b;
            int i6 = bea.i();
            int i7 = bea.i();
            bea.d(4);
            if (i7 == auk.aC) {
                str = bea.f(i6 - 12);
            } else if (i7 == auk.aD) {
                str2 = bea.f(i6 - 12);
            } else {
                if (i7 == auk.aE) {
                    i3 = i5;
                    i4 = i6;
                }
                bea.d(i6 - 12);
            }
        }
        if (str == null || str2 == null || i3 == -1) {
            return null;
        }
        bea.c(i3);
        bea.d(16);
        return new axh(str, str2, bea.f(i4 - 16));
    }

    private static axj a(int i2, String str, bea bea) {
        int i3 = bea.i();
        if (bea.i() == auk.aE) {
            bea.d(8);
            return new axj(str, null, bea.f(i3 - 16));
        }
        StringBuilder sb = new StringBuilder("Failed to parse text attribute: ");
        sb.append(auk.c(i2));
        bdu.c("MetadataUtil", sb.toString());
        return null;
    }

    private static int b(bea bea) {
        bea.d(4);
        if (bea.i() == auk.aE) {
            bea.d(8);
            return bea.c();
        }
        bdu.c("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static axj b(int i2, String str, bea bea) {
        int i3 = bea.i();
        if (bea.i() == auk.aE && i3 >= 22) {
            bea.d(10);
            int d2 = bea.d();
            if (d2 > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(d2);
                String sb2 = sb.toString();
                int d3 = bea.d();
                if (d3 > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(d3);
                    sb2 = sb3.toString();
                }
                return new axj(str, null, sb2);
            }
        }
        StringBuilder sb4 = new StringBuilder("Failed to parse index/count attribute: ");
        sb4.append(auk.c(i2));
        bdu.c("MetadataUtil", sb4.toString());
        return null;
    }
}
