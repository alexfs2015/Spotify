package defpackage;

/* renamed from: gul reason: default package */
public interface gul {

    /* renamed from: gul$a */
    public static final class a {
        private static final gul a = $$Lambda$gul$a$7FTctD9Gadip2rkdPEuUCHc6HmA.INSTANCE;

        /* access modifiers changed from: private */
        public static /* synthetic */ int a(gzt gzt) {
            return 0;
        }

        public static gul a() {
            return a;
        }

        public static gul a(gul gul, gul gul2) {
            fay.a(gul);
            fay.a(gul2);
            gul gul3 = a;
            if (gul == gul3) {
                return gul2;
            }
            if (gul2 == gul3) {
                return gul;
            }
            return new $$Lambda$gul$a$2aR3rk5HKu2mlYGCfolJi2ET1aM(gul, gul2);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ int a(gul gul, gul gul2, gzt gzt) {
            int resolve = gul.resolve(gzt);
            return resolve == 0 ? gul2.resolve(gzt) : resolve;
        }

        static gul a(String str, int i) {
            fay.a(str);
            return new $$Lambda$gul$a$VddabWE1talOe3ObXpSmRm1Gg1A(str, i);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ int a(String str, int i, gzt gzt) {
            if (gzt.componentId().id().equals(str)) {
                return i;
            }
            return 0;
        }
    }

    int resolve(gzt gzt);
}
