package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLEngine;

/* renamed from: wfa reason: default package */
class wfa implements wez {
    static final defpackage.wez.d a = new defpackage.wez.d() {
        public final defpackage.wez.c a(SSLEngine sSLEngine, Set<String> set) {
            return new b((wfg) sSLEngine, set);
        }
    };
    static final defpackage.wez.d b = new defpackage.wez.d() {
        public final defpackage.wez.c a(SSLEngine sSLEngine, Set<String> set) {
            return new d((wfg) sSLEngine, set);
        }
    };
    static final defpackage.wez.b c = new defpackage.wez.b() {
        public final defpackage.wez.a a(SSLEngine sSLEngine, List<String> list) {
            return new a((wfg) sSLEngine, list);
        }
    };
    static final defpackage.wez.b d = new defpackage.wez.b() {
        public final defpackage.wez.a a(SSLEngine sSLEngine, List<String> list) {
            return new c((wfg) sSLEngine, list);
        }
    };
    private final List<String> e;
    private final defpackage.wez.d f;
    private final defpackage.wez.b g;
    private final e h;

    /* renamed from: wfa$a */
    public static final class a extends c {
        public a(wfg wfg, List<String> list) {
            super(wfg, list);
        }
    }

    /* renamed from: wfa$b */
    public static final class b extends d {
        public b(wfg wfg, Set<String> set) {
            super(wfg, set);
        }
    }

    /* renamed from: wfa$c */
    public static class c implements defpackage.wez.a {
        private final wfg a;
        private final List<String> b;

        public c(wfg wfg, List<String> list) {
            this.a = wfg;
            this.b = list;
        }
    }

    /* renamed from: wfa$d */
    public static class d implements defpackage.wez.c {
        private final wfg a;
        private final Set<String> b;

        public d(wfg wfg, Set<String> set) {
            this.a = wfg;
            this.b = set;
        }
    }

    protected wfa(e eVar, defpackage.wez.d dVar, defpackage.wez.b bVar, Iterable<String> iterable) {
        this(eVar, dVar, bVar, wet.a(iterable));
    }

    private wfa(e eVar, defpackage.wez.d dVar, defpackage.wez.b bVar, List<String> list) {
        this.h = (e) wjk.a(eVar, "wrapperFactory");
        this.f = (defpackage.wez.d) wjk.a(dVar, "selectorFactory");
        this.g = (defpackage.wez.b) wjk.a(bVar, "listenerFactory");
        this.e = Collections.unmodifiableList((List) wjk.a(list, "protocols"));
    }

    public List<String> a() {
        return this.e;
    }

    public defpackage.wez.d d() {
        return this.f;
    }

    public defpackage.wez.b c() {
        return this.g;
    }

    public e b() {
        return this.h;
    }
}
