package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLEngine;

/* renamed from: wtg reason: default package */
class wtg implements wtf {
    static final defpackage.wtf.d a = new defpackage.wtf.d() {
        public final defpackage.wtf.c a(SSLEngine sSLEngine, Set<String> set) {
            return new b((wtm) sSLEngine, set);
        }
    };
    static final defpackage.wtf.d b = new defpackage.wtf.d() {
        public final defpackage.wtf.c a(SSLEngine sSLEngine, Set<String> set) {
            return new d((wtm) sSLEngine, set);
        }
    };
    static final defpackage.wtf.b c = new defpackage.wtf.b() {
        public final defpackage.wtf.a a(SSLEngine sSLEngine, List<String> list) {
            return new a((wtm) sSLEngine, list);
        }
    };
    static final defpackage.wtf.b d = new defpackage.wtf.b() {
        public final defpackage.wtf.a a(SSLEngine sSLEngine, List<String> list) {
            return new c((wtm) sSLEngine, list);
        }
    };
    private final List<String> e;
    private final defpackage.wtf.d f;
    private final defpackage.wtf.b g;
    private final e h;

    /* renamed from: wtg$a */
    public static final class a extends c {
        public a(wtm wtm, List<String> list) {
            super(wtm, list);
        }
    }

    /* renamed from: wtg$b */
    public static final class b extends d {
        public b(wtm wtm, Set<String> set) {
            super(wtm, set);
        }
    }

    /* renamed from: wtg$c */
    public static class c implements defpackage.wtf.a {
        private final wtm a;
        private final List<String> b;

        public c(wtm wtm, List<String> list) {
            this.a = wtm;
            this.b = list;
        }
    }

    /* renamed from: wtg$d */
    public static class d implements defpackage.wtf.c {
        private final wtm a;
        private final Set<String> b;

        public d(wtm wtm, Set<String> set) {
            this.a = wtm;
            this.b = set;
        }
    }

    protected wtg(e eVar, defpackage.wtf.d dVar, defpackage.wtf.b bVar, Iterable<String> iterable) {
        this(eVar, dVar, bVar, wsz.a(iterable));
    }

    private wtg(e eVar, defpackage.wtf.d dVar, defpackage.wtf.b bVar, List<String> list) {
        this.h = (e) wxq.a(eVar, "wrapperFactory");
        this.f = (defpackage.wtf.d) wxq.a(dVar, "selectorFactory");
        this.g = (defpackage.wtf.b) wxq.a(bVar, "listenerFactory");
        this.e = Collections.unmodifiableList((List) wxq.a(list, "protocols"));
    }

    public List<String> a() {
        return this.e;
    }

    public e b() {
        return this.h;
    }

    public defpackage.wtf.b c() {
        return this.g;
    }

    public defpackage.wtf.d d() {
        return this.f;
    }
}
