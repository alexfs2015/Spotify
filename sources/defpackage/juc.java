package defpackage;

import com.spotify.mobile.android.util.LinkType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: juc reason: default package */
public final class juc {
    public static final Pattern d = Pattern.compile(":");
    public static final Pattern e = Pattern.compile("\\?");
    public static final Pattern f = Pattern.compile("#");
    public static final Pattern g = Pattern.compile("/");
    public final List<String> a;
    final LinkType b;
    public final List<String> c;
    private final String h;
    private final Map<String, String> i;
    private final String j;
    private final LinkType k;
    private final boolean l;
    private final String m;
    private final String n;
    private final List<String> o;

    /* renamed from: juc$a */
    public static class a {
        final String a;
        final List<String> b = new ArrayList();
        final Map<String, String> c = new LinkedHashMap();
        String d;
        LinkType e;
        boolean f;
        String g;
        String h;
        final List<String> i = new ArrayList();
        final List<String> j = new ArrayList();

        public a(String str) {
            this.a = str;
        }

        public final a a(String str) {
            this.b.add(str);
            return this;
        }

        public final a b(String str) {
            this.d = str;
            return this;
        }

        public final a a(LinkType linkType) {
            this.e = linkType;
            return this;
        }

        public final a a(boolean z) {
            this.f = z;
            return this;
        }

        public final a c(String str) {
            this.g = str;
            return this;
        }

        public final a d(String str) {
            this.h = str;
            return this;
        }

        public final a e(String str) {
            this.i.add(str);
            return this;
        }

        public final a f(String str) {
            this.j.add(str);
            return this;
        }

        public final juc a() {
            return new juc(this, 0);
        }
    }

    /* synthetic */ juc(a aVar, byte b2) {
        this(aVar);
    }

    static {
        Pattern.compile("\\=|\\&");
    }

    private juc(a aVar) {
        this.h = aVar.a;
        this.a = aVar.b;
        this.i = aVar.c;
        this.j = aVar.d;
        this.b = aVar.e;
        this.k = null;
        this.l = aVar.f;
        this.m = aVar.g;
        this.n = aVar.h;
        this.c = aVar.i;
        this.o = aVar.j;
    }

    public final boolean a(String str) {
        return new b(this.j).b(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("mLinkName = ");
        sb.append(this.h);
        sb.append(", pattern = ");
        sb.append(this.a);
        sb.append(", verifier = ");
        sb.append(this.j);
        sb.append(", mLinkType = ");
        sb.append(this.b);
        sb.append(", mParentLinkType = ");
        sb.append(this.k);
        sb.append(", mIsPublic = ");
        sb.append(this.l);
        sb.append(", mOwner = ");
        sb.append(this.m);
        sb.append(", mDescription = ");
        sb.append(this.n);
        sb.append(", mExamples = ");
        sb.append(this.c);
        sb.append(", mCounterExamples = ");
        sb.append(this.o);
        sb.append(10);
        return sb.toString();
    }
}
