package defpackage;

/* renamed from: gwl reason: default package */
public interface gwl {

    /* renamed from: gwl$a */
    public static final class a {
        private static final gwl a = $$Lambda$gwl$a$DKyzA9YNRYJ5SNtcAkLKYP7rDLE.INSTANCE;

        /* access modifiers changed from: private */
        public static /* synthetic */ int a(gwl gwl, gwl gwl2, hcm hcm) {
            int resolve = gwl.resolve(hcm);
            return resolve == 0 ? gwl2.resolve(hcm) : resolve;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ int a(hcm hcm) {
            return 0;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ int a(String str, int i, hcm hcm) {
            if (hcm.componentId().id().equals(str)) {
                return i;
            }
            return 0;
        }

        public static gwl a() {
            return a;
        }

        public static gwl a(gwl gwl, gwl gwl2) {
            fbp.a(gwl);
            fbp.a(gwl2);
            gwl gwl3 = a;
            return gwl == gwl3 ? gwl2 : gwl2 == gwl3 ? gwl : new $$Lambda$gwl$a$cHCs2NxsWNysMoekhdUH4QqsO4(gwl, gwl2);
        }

        static gwl a(String str, int i) {
            fbp.a(str);
            return new $$Lambda$gwl$a$HBPmvLP4uQIcNM9peqmmlgHiTh4(str, i);
        }
    }

    int resolve(hcm hcm);
}
