package defpackage;

/* renamed from: nng reason: default package */
public interface nng {

    /* renamed from: nng$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static hhm<hcs> a(boolean z, njk njk, nms nms, rof rof) {
            a aVar = new a();
            if (z) {
                aVar.a(nms).a(rof);
            }
            return hhm.a(aVar.a(njk).a);
        }

        public static nka a(boolean z) {
            return z ? new nna() : new nos();
        }

        public static noh a(boolean z, nkf nkf) {
            return z ? new nod(nkf) : new nog(nkf);
        }

        public static ssl a(fqn fqn, who<ssf> who) {
            return jus.b(fqn) ? ssl.a : (ssl) who.get();
        }
    }
}
