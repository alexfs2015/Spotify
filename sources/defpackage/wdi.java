package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: wdi reason: default package */
public final class wdi extends wdl {

    /* renamed from: wdi$a */
    static final class a extends wdb<CharSequence, CharSequence, a> {
        private C0086a<Object> c;

        /* renamed from: wdi$a$a reason: collision with other inner class name */
        interface C0086a<T> {
            CharSequence a(T t);
        }

        public final /* synthetic */ wdd a(Object obj, Iterable iterable) {
            CharSequence charSequence = (CharSequence) obj;
            C0086a c2 = c();
            StringBuilder sb = iterable instanceof Collection ? new StringBuilder(((Collection) iterable).size() * 10) : new StringBuilder();
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    sb.append(c2.a(next));
                    sb.append(',');
                    next = it.next();
                }
                sb.append(c2.a(next));
            }
            super.c(charSequence, sb);
            return this;
        }

        public final /* synthetic */ wdd a(Object obj, Object obj2) {
            CharSequence charSequence = (CharSequence) obj;
            CharSequence a = wjn.a((CharSequence) obj2);
            CharSequence charSequence2 = (CharSequence) super.a(charSequence);
            if (charSequence2 == null) {
                super.a(charSequence, a);
            } else {
                StringBuilder sb = new StringBuilder(charSequence2.length() + 1 + a.length());
                sb.append(charSequence2);
                sb.append(',');
                sb.append(a);
                super.c(charSequence, sb);
            }
            return this;
        }

        public final /* synthetic */ List b(Object obj) {
            List b = super.b((CharSequence) obj);
            if (b.isEmpty()) {
                return b;
            }
            if (b.size() == 1) {
                return wjn.b((CharSequence) b.get(0));
            }
            throw new IllegalStateException("CombinedHttpHeaders should only have one value");
        }

        public final /* synthetic */ wdd d(Object obj, Object obj2) {
            CharSequence charSequence = (CharSequence) obj;
            C0086a c2 = c();
            Object[] objArr = {obj2};
            StringBuilder sb = new StringBuilder(10);
            sb.append(c2.a(objArr[0]));
            super.c(charSequence, sb);
            return this;
        }

        private C0086a<Object> c() {
            if (this.c == null) {
                this.c = new C0086a<Object>() {
                    public final CharSequence a(Object obj) {
                        return wjn.a((CharSequence) a.this.b.b(obj));
                    }
                };
            }
            return this.c;
        }

        public a(whe<CharSequence> whe, wdg<CharSequence> wdg, c<CharSequence> cVar) {
            super(whe, wdg, cVar);
        }
    }

    public wdi(boolean z) {
        super((wdb<CharSequence, CharSequence, ?>) new a<CharSequence,CharSequence,Object>(wgw.c, a(z), b(z)));
    }
}
