package com.spotify.music.libs.podcast.loader;

import android.net.Uri;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SortOption;
import java.util.Locale;

public final class ShowUriBuilder {
    private static final ImmutableSet<String> r = ImmutableSet.a("addTime", "publishDate", "number", "rowId");
    public final String a;
    public String b;
    public String c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public SortOption h;
    public Integer i;
    public Integer j;
    public Double k;
    public Integer l;
    public Integer m;
    public Format n;
    public boolean o;
    public boolean p;
    public Integer q;
    private Integer s;
    private Integer t;
    private Integer u;

    public enum Format {
        JSON,
        PROTOBUF
    }

    public ShowUriBuilder(String str) {
        Assertion.a((Object) str);
        Assertion.b(str.contains("?"), "Base uri should not contain a question mark (?).", new Object[0]);
        this.a = str;
    }

    private static String a(SortOption sortOption) {
        SortOption sortOption2 = sortOption.mSecondarySortOption;
        boolean b2 = sortOption.b();
        if (r.contains(sortOption.mKey)) {
            b2 = !b2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(sortOption.mKey);
        String str = "";
        sb.append(b2 ? " DESC" : str);
        if (sortOption2 != null) {
            StringBuilder sb2 = new StringBuilder(",");
            sb2.append(a(sortOption2));
            str = sb2.toString();
        }
        sb.append(str);
        return sb.toString();
    }

    private void a(StringBuilder sb) {
        if (!fbo.a(this.b)) {
            a(sb, "<b62-show-id>", Uri.encode(this.b));
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
        SortOption sortOption = this.h;
        if (sortOption != null) {
            sb.append(Uri.encode(a(sortOption)));
        }
    }

    private void c(StringBuilder sb) {
        sb.append("&filter=");
        sb.append(Uri.encode("available eq true"));
        if (this.d) {
            sb.append(Uri.encode(",availableOffline eq true"));
        }
        if (this.e) {
            sb.append(Uri.encode(",inCollection eq true"));
        }
        if (this.f) {
            sb.append(Uri.encode(",startedPlaying ne true,isPlayed ne true"));
        }
        if (this.j != null) {
            sb.append(Uri.encode(String.format(Locale.US, ",timePlayed > %s", new Object[]{this.j})));
        }
        if (this.g) {
            sb.append(Uri.encode(",hasTimeLeft eq true"));
        }
        if (this.p) {
            sb.append(Uri.encode(",unique eq true"));
        }
        if (this.q != null) {
            sb.append(Uri.encode(String.format(Locale.US, ",daysLastPlayed < %s", new Object[]{this.q})));
        }
        if (this.o) {
            sb.append(Uri.encode(",videoEpisode eq false"));
        }
    }

    public final ShowUriBuilder a(int i2) {
        this.u = Integer.valueOf(100);
        return this;
    }

    public final ShowUriBuilder a(Integer num, Integer num2) {
        this.s = num;
        this.t = num2;
        return this;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder(this.a);
        Assertion.b(false, "Only one at a time. play() and offline() cannot be set at the same time.", new Object[0]);
        a(sb);
        b(sb);
        c(sb);
        if (!(this.s == null || this.t == null)) {
            sb.append(String.format(Locale.US, "&start=%d&length=%d", new Object[]{this.s, this.t}));
        }
        if (this.u != null) {
            sb.append(String.format(Locale.US, "&updateThrottling=%d", new Object[]{this.u}));
        }
        Format format = this.n;
        if (format != null) {
            sb.append(String.format("&responseFormat=%s", new Object[]{format.toString().toLowerCase(Locale.US)}));
        }
        String str = this.c;
        if (str != null) {
            sb.append(String.format("&includeInRange=%s", new Object[]{str}));
        }
        Integer num = this.i;
        if (num != null) {
            sb.append(String.format("&includeInRangeContext=%s", new Object[]{num}));
        }
        Double d2 = this.k;
        if (d2 != null) {
            sb.append(String.format("&relTimeLeftTolerance=%s", new Object[]{d2}));
        }
        Integer num2 = this.l;
        if (num2 != null) {
            sb.append(String.format("&absTimeLeftTolerance=%s", new Object[]{num2}));
        }
        Integer num3 = this.m;
        if (num3 != null) {
            sb.append(String.format("&length=%s", new Object[]{num3}));
        }
        return sb.toString();
    }
}
