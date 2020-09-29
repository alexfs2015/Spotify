package com.spotify.mobile.android.spotlets.collection.util;

import android.net.Uri;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.playlist.models.Show.MediaType;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public final class UriBuilder {
    private static final ImmutableSet<String> p = ImmutableSet.a("addTime", "publishDate", "number", "rowId");
    private final Set<String> A = new HashSet();
    public String a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public way l;
    public MediaType m;
    public MediaType n;
    public Format o;
    private final String q;
    private String r;
    private String s;
    private String t;
    private Integer u;
    private Integer v;
    private Integer w;
    private final Set<String> x = new HashSet();
    private final Set<String> y = new HashSet();
    private final Set<String> z = new HashSet();

    public enum Format {
        JSON,
        PROTOBUF
    }

    public UriBuilder(String str) {
        Assertion.a((Object) str);
        Assertion.b("Base uri should not contain a question mark (?).", str.contains("?"));
        this.q = str;
    }

    private String a(way way) {
        String str;
        way c2 = way.c();
        boolean b2 = way.b();
        if (p.contains(way.a())) {
            b2 = !b2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Uri.encode(way.a()));
        String str2 = "";
        String str3 = "";
        if (b2) {
            str = " DESC";
        } else {
            String str4 = str3;
            str = str3;
        }
        sb.append(str);
        if (c2 != null) {
            StringBuilder sb2 = new StringBuilder(",");
            sb2.append(a(c2));
            str3 = sb2.toString();
        }
        sb.append(str3);
        return sb.toString();
    }

    private void a(StringBuilder sb) {
        if (!fbo.a(this.r)) {
            String str = "e>ssmu<rna";
            a(sb, "<username>", Uri.encode(this.r));
        }
        if (!fbo.a(this.s)) {
            String str2 = "6>im2mbub-<-ld";
            a(sb, "<b62-album-id>", Uri.encode(this.s));
        }
        if (!fbo.a(this.t)) {
            String str3 = "-sa2o6trd>tib<i";
            a(sb, "<b62-artist-id>", Uri.encode(this.t));
        }
        if (!fbo.a((String) null)) {
            String str4 = "sod-bb2h6-><i";
            a(sb, "<b62-show-id>", Uri.encode(null));
        }
        if (!fbo.a((String) null)) {
            a(sb, "<playlist-uri>", Uri.encode(null));
        }
    }

    private static void a(StringBuilder sb, String str, String str2) {
        int indexOf = sb.indexOf(str);
        if (indexOf != -1) {
            sb.replace(indexOf, str.length() + indexOf, str2);
        }
    }

    private void b(StringBuilder sb) {
        sb.append("?sort=");
        way way = this.l;
        if (way != null) {
            sb.append(a(way));
        }
        if (!fbo.a((String) null)) {
            if (this.l != null) {
                sb.append(',');
            }
            sb.append(Uri.encode(null));
        }
    }

    private void c(StringBuilder sb) {
        boolean z2;
        sb.append("&filter=");
        boolean z3 = false;
        if (!fbo.a(this.a)) {
            String str = "eatisxbcn ttns%o";
            sb.append(String.format(Locale.US, "text contains %s", new Object[]{Uri.encode(Uri.encode(this.a))}));
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.b) {
            if (z2) {
                sb.append(',');
            }
            String str2 = "vqa ebftOllliaaerteenifu";
            sb.append("availableOffline eq true");
            z2 = true;
        }
        if (this.c) {
            if (z2) {
                sb.append(',');
            }
            sb.append("complete eq true");
            z2 = true;
        }
        if (this.d) {
            if (z2) {
                sb.append(',');
            }
            String str3 = "eetqrnoCp cioiuntlel";
            sb.append("inCollection eq true");
            z2 = true;
        }
        if (this.e) {
            if (z2) {
                sb.append(',');
            }
            String str4 = "irrueteiat y ePdsarnPntlee ylaguse,dtn ";
            sb.append("startedPlaying ne true,isPlayed ne true");
            z2 = true;
        }
        if (this.f) {
            if (z2) {
                sb.append(',');
            }
            String str5 = "trslaeeb ulieavaq";
            sb.append("available eq true");
            z2 = true;
        }
        if (this.g) {
            if (z2) {
                sb.append(',');
            }
            String str6 = "uotmLnVhaca sroaVser dliiqel";
            sb.append("hasValidLocalVersion eq true");
            z2 = true;
        }
        for (String str7 : this.y) {
            if (z2) {
                sb.append(',');
            }
            sb.append(str7);
            z2 = true;
        }
        if (this.m != null) {
            if (z2) {
                sb.append(',');
            }
            sb.append("mediaTypeEnum eq ");
            sb.append(this.m.ordinal());
            z2 = true;
        }
        if (this.n != null) {
            if (z2) {
                sb.append(',');
            }
            sb.append("mediaTypeEnum ne ");
            sb.append(this.n.ordinal());
        }
        if (!this.z.isEmpty()) {
            String str8 = "&i=lorrtsFtack";
            sb.append("&tracksFilter=");
            for (String str9 : this.z) {
                if (z3) {
                    sb.append(',');
                }
                sb.append(str9);
                z3 = true;
            }
        }
    }

    public final UriBuilder a(int i2) {
        this.w = Integer.valueOf(i2);
        return this;
    }

    public final UriBuilder a(SortOption sortOption) {
        this.l = sortOption != null ? juy.a(sortOption) : null;
        return this;
    }

    public final UriBuilder a(Integer num, Integer num2) {
        this.u = num;
        this.v = num2;
        return this;
    }

    public final UriBuilder a(String str) {
        Assertion.a("Base uri does not contain the username placeholder.", this.q.contains("<username>"));
        this.r = str;
        return this;
    }

    public final String a() {
        String str;
        StringBuilder sb = new StringBuilder(this.q);
        boolean z2 = false;
        Assertion.b("play() and offline() cannot be set at the same time.", this.j && this.k);
        if (this.j) {
            sb.append(sb.charAt(sb.length() - 1) == '/' ? "play" : "/play");
        }
        if (this.k) {
            if (sb.charAt(sb.length() - 1) == '/') {
                String str2 = "eilofbn";
                str = "offline";
            } else {
                String str3 = "fnefolb/";
                str = "/offline";
            }
            sb.append(str);
        }
        a(sb);
        b(sb);
        c(sb);
        for (String str4 : this.x) {
            sb.append('&');
            sb.append(str4);
        }
        if (this.i) {
            String str5 = "=Bo1&uotupFlrug&pFrileydl";
            sb.append("&group&groupByFullField=1");
        } else if (this.h) {
            sb.append("&group");
        }
        if (!(this.u == null || this.v == null)) {
            String str6 = "dtt&s&hlpe%tdn=gar=";
            sb.append(String.format(Locale.US, "&start=%d&length=%d", new Object[]{this.u, this.v}));
        }
        if (this.w != null) {
            String str7 = "nuatthrlTt&=geiotdd%";
            sb.append(String.format(Locale.US, "&updateThrottling=%d", new Object[]{this.w}));
        }
        Format format = this.o;
        if (format != null) {
            sb.append(String.format("&responseFormat=%s", new Object[]{format.toString().toLowerCase(Locale.US)}));
        }
        if (!this.A.isEmpty()) {
            String str8 = "tushl&xs=Pcdaed";
            sb.append("&excludedPaths=");
            for (String str9 : this.A) {
                if (z2) {
                    sb.append(',');
                }
                sb.append(Uri.encode(str9));
                z2 = true;
            }
        }
        return sb.toString();
    }

    public final UriBuilder b(String str) {
        String str2 = "6b-m2mda>lu<ib";
        Assertion.a("Base uri does not contain the album id placeholder.", this.q.contains("<b62-album-id>"));
        this.s = str;
        return this;
    }

    public final UriBuilder c(String str) {
        Assertion.a("Base uri does not contain the artist id placeholder.", this.q.contains("<b62-artist-id>"));
        this.t = str;
        return this;
    }

    public final UriBuilder d(String str) {
        String str2 = ",";
        String str3 = ",reto ontolghcrt.ciaitneas eit na  hn crrFnat";
        Assertion.b("Filter string cannot contain the , character.", str.contains(","));
        this.y.add(str);
        return this;
    }
}
