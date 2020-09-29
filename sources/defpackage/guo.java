package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;

@Deprecated
/* renamed from: guo reason: default package */
public interface guo {

    /* renamed from: guo$a */
    public static final class a {
        private static final guo a = $$Lambda$guo$a$Yn5qS9SFL3_SgAjlb2bf9qJ8j18.INSTANCE;

        /* renamed from: guo$a$a reason: collision with other inner class name */
        class C0035a implements guo {
            private /* synthetic */ guo a;

            C0035a(guo guo) {
                this.a = guo;
            }

            public final gzt decorate(gzt gzt) {
                gzt decorate = this.a.decorate(gzt);
                List children = gzt.children();
                return (a.d(children) || a.c(children)) ? decorate : new ham(decorate) {
                    public final List<? extends gzt> children() {
                        return a.a((guo) C0035a.this, ((gzt) this.a).children());
                    }
                };
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ gzt a(gzt gzt) {
            return gzt;
        }

        public static guo a(guo guo, guo guo2) {
            fay.a(guo);
            fay.a(guo2);
            guo guo3 = a;
            if (guo == guo3) {
                return guo2;
            }
            if (guo2 == guo3) {
                return guo;
            }
            return new $$Lambda$guo$a$UtFYRdyLajl5mB99dAdLyYdmoqA(guo, guo2);
        }

        public static guo a() {
            return a;
        }

        public static guo a(guo guo) {
            guo guo2 = a;
            if (guo == guo2) {
                return guo2;
            }
            return guo instanceof C0035a ? guo : new C0035a(guo);
        }

        public static List<gzt> a(final guo guo, final List<? extends gzt> list) {
            if (d(list)) {
                return Collections.emptyList();
            }
            if (c(list)) {
                return ImmutableList.d();
            }
            return new AbstractList<gzt>() {
                public final int size() {
                    return list.size();
                }

                public final /* synthetic */ Object get(int i) {
                    return guo.decorate((gzt) list.get(i));
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

    gzt decorate(gzt gzt);
}
