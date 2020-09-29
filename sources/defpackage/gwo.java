package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;

@Deprecated
/* renamed from: gwo reason: default package */
public interface gwo {

    /* renamed from: gwo$a */
    public static final class a {
        private static final gwo a = $$Lambda$gwo$a$5hDX3QJ2mDenhehhhy1cPSFeHC0.INSTANCE;

        /* renamed from: gwo$a$a reason: collision with other inner class name */
        class C0036a implements gwo {
            private /* synthetic */ gwo a;

            C0036a(gwo gwo) {
                this.a = gwo;
            }

            public final hcm decorate(hcm hcm) {
                hcm decorate = this.a.decorate(hcm);
                List children = hcm.children();
                return (a.d(children) || a.c(children)) ? decorate : new hdf(decorate) {
                    public final List<? extends hcm> children() {
                        return a.a((gwo) C0036a.this, ((hcm) this.a).children());
                    }
                };
            }
        }

        public static gwo a() {
            return a;
        }

        public static gwo a(gwo gwo) {
            gwo gwo2 = a;
            return gwo == gwo2 ? gwo2 : gwo instanceof C0036a ? gwo : new C0036a(gwo);
        }

        public static gwo a(gwo gwo, gwo gwo2) {
            fbp.a(gwo);
            fbp.a(gwo2);
            gwo gwo3 = a;
            return gwo == gwo3 ? gwo2 : gwo2 == gwo3 ? gwo : new $$Lambda$gwo$a$FYBB0556v4cKojMUtHezM6XG2lU(gwo, gwo2);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ hcm a(hcm hcm) {
            return hcm;
        }

        public static List<hcm> a(final gwo gwo, final List<? extends hcm> list) {
            return d(list) ? Collections.emptyList() : c(list) ? ImmutableList.d() : new AbstractList<hcm>() {
                public final /* synthetic */ Object get(int i) {
                    return gwo.decorate((hcm) list.get(i));
                }

                public final int size() {
                    return list.size();
                }
            };
        }

        /* access modifiers changed from: private */
        public static boolean c(List<?> list) {
            return list == ImmutableList.d();
        }

        /* access modifiers changed from: private */
        public static boolean d(List<?> list) {
            return list == Collections.emptyList();
        }
    }

    hcm decorate(hcm hcm);
}
