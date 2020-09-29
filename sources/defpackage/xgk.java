package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: xgk reason: default package */
abstract class xgk<T> {

    /* renamed from: xgk$a */
    static final class a<T> extends xgk<T> {
        private final xgd<T, xak> a;

        a(xgd<T, xak> xgd) {
            this.a = xgd;
        }

        /* access modifiers changed from: 0000 */
        public final void a(xgm xgm, T t) {
            if (t != null) {
                try {
                    xgm.d = (xak) this.a.a(t);
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Unable to convert ");
                    sb.append(t);
                    sb.append(" to RequestBody");
                    throw new RuntimeException(sb.toString(), e);
                }
            } else {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
        }
    }

    /* renamed from: xgk$b */
    static final class b<T> extends xgk<T> {
        private final String a;
        private final xgd<T, String> b;
        private final boolean c;

        b(String str, xgd<T, String> xgd, boolean z) {
            this.a = (String) xgr.a(str, "name == null");
            this.b = xgd;
            this.c = z;
        }

        /* access modifiers changed from: 0000 */
        public final void a(xgm xgm, T t) {
            if (t != null) {
                String str = (String) this.b.a(t);
                if (str != null) {
                    xgm.b(this.a, str, this.c);
                }
            }
        }
    }

    /* renamed from: xgk$c */
    static final class c<T> extends xgk<Map<String, T>> {
        private final xgd<T, String> a;
        private final boolean b;

        c(xgd<T, String> xgd, boolean z) {
            this.a = xgd;
            this.b = z;
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ void a(xgm xgm, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        String str2 = "'.";
                        if (value != null) {
                            String str3 = (String) this.a.a(value);
                            if (str3 != null) {
                                xgm.b(str, str3, this.b);
                            } else {
                                StringBuilder sb = new StringBuilder("Field map value '");
                                sb.append(value);
                                sb.append("' converted to null by ");
                                sb.append(this.a.getClass().getName());
                                sb.append(" for key '");
                                sb.append(str);
                                sb.append(str2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder("Field map contained null value for key '");
                            sb2.append(str);
                            sb2.append(str2);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Field map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Field map was null.");
        }
    }

    /* renamed from: xgk$d */
    static final class d<T> extends xgk<T> {
        private final String a;
        private final xgd<T, String> b;

        d(String str, xgd<T, String> xgd) {
            this.a = (String) xgr.a(str, "name == null");
            this.b = xgd;
        }

        /* access modifiers changed from: 0000 */
        public final void a(xgm xgm, T t) {
            if (t != null) {
                String str = (String) this.b.a(t);
                if (str != null) {
                    xgm.a(this.a, str);
                }
            }
        }
    }

    /* renamed from: xgk$e */
    static final class e<T> extends xgk<Map<String, T>> {
        private final xgd<T, String> a;

        e(xgd<T, String> xgd) {
            this.a = xgd;
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ void a(xgm xgm, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            xgm.a(str, (String) this.a.a(value));
                        } else {
                            StringBuilder sb = new StringBuilder("Header map contained null value for key '");
                            sb.append(str);
                            sb.append("'.");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Header map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Header map was null.");
        }
    }

    /* renamed from: xgk$f */
    static final class f<T> extends xgk<T> {
        private final xac a;
        private final xgd<T, xak> b;

        f(xac xac, xgd<T, xak> xgd) {
            this.a = xac;
            this.b = xgd;
        }

        /* access modifiers changed from: 0000 */
        public final void a(xgm xgm, T t) {
            if (t != null) {
                try {
                    xgm.a(this.a, (xak) this.b.a(t));
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Unable to convert ");
                    sb.append(t);
                    sb.append(" to RequestBody");
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        }
    }

    /* renamed from: xgk$g */
    static final class g<T> extends xgk<Map<String, T>> {
        private final xgd<T, xak> a;
        private final String b;

        g(xgd<T, xak> xgd, String str) {
            this.a = xgd;
            this.b = str;
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ void a(xgm xgm, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            StringBuilder sb = new StringBuilder("form-data; name=\"");
                            sb.append(str);
                            sb.append("\"");
                            xgm.a(xac.a("Content-Disposition", sb.toString(), "Content-Transfer-Encoding", this.b), (xak) this.a.a(value));
                        } else {
                            StringBuilder sb2 = new StringBuilder("Part map contained null value for key '");
                            sb2.append(str);
                            sb2.append("'.");
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Part map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Part map was null.");
        }
    }

    /* renamed from: xgk$h */
    static final class h<T> extends xgk<T> {
        private final String a;
        private final xgd<T, String> b;
        private final boolean c;

        h(String str, xgd<T, String> xgd, boolean z) {
            this.a = (String) xgr.a(str, "name == null");
            this.b = xgd;
            this.c = z;
        }

        /* access modifiers changed from: 0000 */
        public final void a(xgm xgm, T t) {
            if (t != null) {
                String str = this.a;
                String str2 = (String) this.b.a(t);
                boolean z = this.c;
                if (xgm.b != null) {
                    String a2 = xgm.a(str2, z);
                    String str3 = xgm.b;
                    StringBuilder sb = new StringBuilder("{");
                    sb.append(str);
                    sb.append("}");
                    String replace = str3.replace(sb.toString(), a2);
                    if (!xgm.a.matcher(replace).matches()) {
                        xgm.b = replace;
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("@Path parameters shouldn't perform path traversal ('.' or '..'): ");
                    sb2.append(str2);
                    throw new IllegalArgumentException(sb2.toString());
                }
                throw new AssertionError();
            }
            StringBuilder sb3 = new StringBuilder("Path parameter \"");
            sb3.append(this.a);
            sb3.append("\" value must not be null.");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* renamed from: xgk$i */
    static final class i<T> extends xgk<T> {
        private final String a;
        private final xgd<T, String> b;
        private final boolean c;

        i(String str, xgd<T, String> xgd, boolean z) {
            this.a = (String) xgr.a(str, "name == null");
            this.b = xgd;
            this.c = z;
        }

        /* access modifiers changed from: 0000 */
        public final void a(xgm xgm, T t) {
            if (t != null) {
                String str = (String) this.b.a(t);
                if (str != null) {
                    xgm.a(this.a, str, this.c);
                }
            }
        }
    }

    /* renamed from: xgk$j */
    static final class j<T> extends xgk<Map<String, T>> {
        private final xgd<T, String> a;
        private final boolean b;

        j(xgd<T, String> xgd, boolean z) {
            this.a = xgd;
            this.b = z;
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ void a(xgm xgm, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        String str2 = "'.";
                        if (value != null) {
                            String str3 = (String) this.a.a(value);
                            if (str3 != null) {
                                xgm.a(str, str3, this.b);
                            } else {
                                StringBuilder sb = new StringBuilder("Query map value '");
                                sb.append(value);
                                sb.append("' converted to null by ");
                                sb.append(this.a.getClass().getName());
                                sb.append(" for key '");
                                sb.append(str);
                                sb.append(str2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder("Query map contained null value for key '");
                            sb2.append(str);
                            sb2.append(str2);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Query map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Query map was null.");
        }
    }

    /* renamed from: xgk$k */
    static final class k<T> extends xgk<T> {
        private final xgd<T, String> a;
        private final boolean b;

        k(xgd<T, String> xgd, boolean z) {
            this.a = xgd;
            this.b = z;
        }

        /* access modifiers changed from: 0000 */
        public final void a(xgm xgm, T t) {
            if (t != null) {
                xgm.a((String) this.a.a(t), null, this.b);
            }
        }
    }

    /* renamed from: xgk$l */
    static final class l extends xgk<defpackage.xag.b> {
        static final l a = new l();

        private l() {
        }

        /* access modifiers changed from: 0000 */
        public final /* bridge */ /* synthetic */ void a(xgm xgm, Object obj) {
            defpackage.xag.b bVar = (defpackage.xag.b) obj;
            if (bVar != null) {
                xgm.c.a(bVar);
            }
        }
    }

    /* renamed from: xgk$m */
    static final class m extends xgk<Object> {
        m() {
        }

        /* access modifiers changed from: 0000 */
        public final void a(xgm xgm, Object obj) {
            xgr.a(obj, "@Url parameter is null.");
            xgm.b = obj.toString();
        }
    }

    xgk() {
    }

    /* access modifiers changed from: 0000 */
    public final xgk<Iterable<T>> a() {
        return new xgk<Iterable<T>>() {
            /* access modifiers changed from: 0000 */
            public final /* synthetic */ void a(xgm xgm, Object obj) {
                Iterable<Object> iterable = (Iterable) obj;
                if (iterable != null) {
                    for (Object a2 : iterable) {
                        xgk.this.a(xgm, a2);
                    }
                }
            }
        };
    }

    /* access modifiers changed from: 0000 */
    public abstract void a(xgm xgm, T t);

    /* access modifiers changed from: 0000 */
    public final xgk<Object> b() {
        return new xgk<Object>() {
            /* access modifiers changed from: 0000 */
            public final void a(xgm xgm, Object obj) {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        xgk.this.a(xgm, Array.get(obj, i));
                    }
                }
            }
        };
    }
}
