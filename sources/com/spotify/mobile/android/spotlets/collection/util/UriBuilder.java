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
    public vns l;
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

    public final UriBuilder a(String str) {
        Assertion.a("Base uri does not contain the username placeholder.", this.q.contains("<username>"));
        this.r = str;
        return this;
    }

    public final UriBuilder b(String str) {
        Assertion.a("Base uri does not contain the album id placeholder.", this.q.contains("<b62-album-id>"));
        this.s = str;
        return this;
    }

    public final UriBuilder c(String str) {
        Assertion.a("Base uri does not contain the artist id placeholder.", this.q.contains("<b62-artist-id>"));
        this.t = str;
        return this;
    }

    public final UriBuilder a(SortOption sortOption) {
        this.l = sortOption != null ? jsr.a(sortOption) : null;
        return this;
    }

    public final UriBuilder d(String str) {
        Assertion.b("Filter string cannot contain the , character.", str.contains(","));
        this.y.add(str);
        return this;
    }

    public final UriBuilder a(Integer num, Integer num2) {
        this.u = num;
        this.v = num2;
        return this;
    }

    public final UriBuilder a(int i2) {
        this.w = Integer.valueOf(i2);
        return this;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder(this.q);
        boolean z2 = false;
        Assertion.b("play() and offline() cannot be set at the same time.", this.j && this.k);
        if (this.j) {
            sb.append(sb.charAt(sb.length() - 1) == '/' ? "play" : "/play");
        }
        if (this.k) {
            sb.append(sb.charAt(sb.length() - 1) == '/' ? "offline" : "/offline");
        }
        a(sb);
        b(sb);
        c(sb);
        for (String str : this.x) {
            sb.append('&');
            sb.append(str);
        }
        if (this.i) {
            sb.append("&group&groupByFullField=1");
        } else if (this.h) {
            sb.append("&group");
        }
        if (!(this.u == null || this.v == null)) {
            sb.append(String.format(Locale.US, "&start=%d&length=%d", new Object[]{this.u, this.v}));
        }
        if (this.w != null) {
            sb.append(String.format(Locale.US, "&updateThrottling=%d", new Object[]{this.w}));
        }
        Format format = this.o;
        if (format != null) {
            sb.append(String.format("&responseFormat=%s", new Object[]{format.toString().toLowerCase(Locale.US)}));
        }
        if (!this.A.isEmpty()) {
            sb.append("&excludedPaths=");
            for (String str2 : this.A) {
                if (z2) {
                    sb.append(',');
                }
                sb.append(Uri.encode(str2));
                z2 = true;
            }
        }
        return sb.toString();
    }

    private static void a(StringBuilder sb, String str, String str2) {
        int indexOf = sb.indexOf(str);
        if (indexOf != -1) {
            sb.replace(indexOf, str.length() + indexOf, str2);
        }
    }

    private void a(StringBuilder sb) {
        if (!fax.a(this.r)) {
            a(sb, "<username>", Uri.encode(this.r));
        }
        if (!fax.a(this.s)) {
            a(sb, "<b62-album-id>", Uri.encode(this.s));
        }
        if (!fax.a(this.t)) {
            a(sb, "<b62-artist-id>", Uri.encode(this.t));
        }
        if (!fax.a((String) null)) {
            a(sb, "<b62-show-id>", Uri.encode(null));
        }
        if (!fax.a((String) null)) {
            a(sb, "<playlist-uri>", Uri.encode(null));
        }
    }

    private void b(StringBuilder sb) {
        sb.append("?sort=");
        vns vns = this.l;
        if (vns != null) {
            sb.append(a(vns));
        }
        if (!fax.a((String) null)) {
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
        if (!fax.a(this.a)) {
            sb.append(String.format(Locale.US, "text contains %s", new Object[]{Uri.encode(Uri.encode(this.a))}));
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.b) {
            if (z2) {
                sb.append(',');
            }
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
            sb.append("inCollection eq true");
            z2 = true;
        }
        if (this.e) {
            if (z2) {
                sb.append(',');
            }
            sb.append("startedPlaying ne true,isPlayed ne true");
            z2 = true;
        }
        if (this.f) {
            if (z2) {
                sb.append(',');
            }
            sb.append("available eq true");
            z2 = true;
        }
        if (this.g) {
            if (z2) {
                sb.append(',');
            }
            sb.append("hasValidLocalVersion eq true");
            z2 = true;
        }
        for (String str : this.y) {
            if (z2) {
                sb.append(',');
            }
            sb.append(str);
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
            sb.append("&tracksFilter=");
            for (String str2 : this.z) {
                if (z3) {
                    sb.append(',');
                }
                sb.append(str2);
                z3 = true;
            }
        }
    }

    private String a(vns vns) {
        vns c2 = vns.c();
        boolean b2 = vns.b();
        if (p.contains(vns.a())) {
            b2 = !b2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Uri.encode(vns.a()));
        String str = "";
        sb.append(b2 ? " DESC" : str);
        if (c2 != null) {
            StringBuilder sb2 = new StringBuilder(",");
            sb2.append(a(c2));
            str = sb2.toString();
        }
        sb.append(str);
        return sb.toString();
    }
}
