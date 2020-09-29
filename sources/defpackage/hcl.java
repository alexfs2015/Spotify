package defpackage;

import java.util.Map;

/* renamed from: hcl reason: default package */
public interface hcl {

    /* renamed from: hcl$a */
    public static abstract class a {
        public final a a(defpackage.hcp.a aVar) {
            return a(aVar.a());
        }

        public abstract a a(hcp hcp);

        public final a a(Enum<?> enumR) {
            return a(hch.a(enumR));
        }

        public abstract a a(String str);

        public abstract a a(Map<String, ? extends hcp> map);

        public abstract hcl a();

        public abstract a b(hcp hcp);
    }

    hcp background();

    Map<String, ? extends hcp> custom();

    String icon();

    hcp main();

    a toBuilder();
}
