package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: wsf reason: default package */
abstract class wsf<T> {

    /* renamed from: wsf$a */
    static final class a<T> extends wsf<T> {
        private final wry<T, wme> a;

        a(wry<T, wme> wry) {
            this.a = wry;
        }

        /* access modifiers changed from: 0000 */
        public final void a(wsh wsh, T t) {
            if (t != null) {
                try {
                    wsh.d = (wme) this.a.a(t);
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

    /* renamed from: wsf$b */
    static final class b<T> extends wsf<T> {
        private final String a;
        private final wry<T, String> b;
        private final boolean c;

        b(String str, wry<T, String> wry, boolean z) {
            this.a = (String) wsm.a(str, "name == null");
            this.b = wry;
            this.c = z;
        }

        /* access modifiers changed from: 0000 */
        public final void a(wsh wsh, T t) {
            if (t != null) {
                String str = (String) this.b.a(t);
                if (str != null) {
                    wsh.b(this.a, str, this.c);
                }
            }
        }
    }

    /* renamed from: wsf$c */
    static final class c<T> extends wsf<Map<String, T>> {
        private final wry<T, String> a;
        private final boolean b;

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ void a(wsh wsh, Object obj) {
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
                                wsh.b(str, str3, this.b);
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

        c(wry<T, String> wry, boolean z) {
            this.a = wry;
            this.b = z;
        }
    }

    /* renamed from: wsf$d */
    static final class d<T> extends wsf<T> {
        private final String a;
        private final wry<T, String> b;

        d(String str, wry<T, String> wry) {
            this.a = (String) wsm.a(str, "name == null");
            this.b = wry;
        }

        /* access modifiers changed from: 0000 */
        public final void a(wsh wsh, T t) {
            if (t != null) {
                String str = (String) this.b.a(t);
                if (str != null) {
                    wsh.a(this.a, str);
                }
            }
        }
    }

    /* renamed from: wsf$e */
    static final class e<T> extends wsf<Map<String, T>> {
        private final wry<T, String> a;

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ void a(wsh wsh, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            wsh.a(str, (String) this.a.a(value));
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

        e(wry<T, String> wry) {
            this.a = wry;
        }
    }

    /* renamed from: wsf$f */
    static final class f<T> extends wsf<T> {
        private final wlw a;
        private final wry<T, wme> b;

        f(wlw wlw, wry<T, wme> wry) {
            this.a = wlw;
            this.b = wry;
        }

        /* access modifiers changed from: 0000 */
        public final void a(wsh wsh, T t) {
            if (t != null) {
                try {
                    wsh.a(this.a, (wme) this.b.a(t));
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Unable to convert ");
                    sb.append(t);
                    sb.append(" to RequestBody");
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        }
    }

    /* renamed from: wsf$g */
    static final class g<T> extends wsf<Map<String, T>> {
        private final wry<T, wme> a;
        private final String b;

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ void a(wsh wsh, Object obj) {
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
                            wsh.a(wlw.a("Content-Disposition", sb.toString(), "Content-Transfer-Encoding", this.b), (wme) this.a.a(value));
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

        g(wry<T, wme> wry, String str) {
            this.a = wry;
            this.b = str;
        }
    }

    /* renamed from: wsf$h */
    static final class h<T> extends wsf<T> {
        private final String a;
        private final wry<T, String> b;
        private final boolean c;

        h(String str, wry<T, String> wry, boolean z) {
            this.a = (String) wsm.a(str, "name == null");
            this.b = wry;
            this.c = z;
        }

        /* access modifiers changed from: 0000 */
        public final void a(wsh wsh, T t) {
            if (t != null) {
                String str = this.a;
                String str2 = (String) this.b.a(t);
                boolean z = this.c;
                if (wsh.b != null) {
                    String a2 = wsh.a(str2, z);
                    String str3 = wsh.b;
                    StringBuilder sb = new StringBuilder("{");
                    sb.append(str);
                    sb.append("}");
                    String replace = str3.replace(sb.toString(), a2);
                    if (!wsh.a.matcher(replace).matches()) {
                        wsh.b = replace;
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

    /* renamed from: wsf$i */
    static final class i<T> extends wsf<T> {
        private final String a;
        private final wry<T, String> b;
        private final boolean c;

        i(String str, wry<T, String> wry, boolean z) {
            this.a = (String) wsm.a(str, "name == null");
            this.b = wry;
            this.c = z;
        }

        /* access modifiers changed from: 0000 */
        public final void a(wsh wsh, T t) {
            if (t != null) {
                String str = (String) this.b.a(t);
                if (str != null) {
                    wsh.a(this.a, str, this.c);
                }
            }
        }
    }

    /* renamed from: wsf$j */
    static final class j<T> extends wsf<Map<String, T>> {
        private final wry<T, String> a;
        private final boolean b;

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ void a(wsh wsh, Object obj) {
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
                                wsh.a(str, str3, this.b);
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

        j(wry<T, String> wry, boolean z) {
            this.a = wry;
            this.b = z;
        }
    }

    /* renamed from: wsf$k */
    static final class k<T> extends wsf<T> {
        private final wry<T, String> a;
        private final boolean b;

        k(wry<T, String> wry, boolean z) {
            this.a = wry;
            this.b = z;
        }

        /* access modifiers changed from: 0000 */
        public final void a(wsh wsh, T t) {
            if (t != null) {
                wsh.a((String) this.a.a(t), null, this.b);
            }
        }
    }

    /* renamed from: wsf$l */
    static final class l extends wsf<defpackage.wma.b> {
        static final l a = new l();

        /* access modifiers changed from: 0000 */
        public final /* bridge */ /* synthetic */ void a(wsh wsh, Object obj) {
            defpackage.wma.b bVar = (defpackage.wma.b) obj;
            if (bVar != null) {
                wsh.c.a(bVar);
            }
        }

        private l() {
        }
    }

    /* renamed from: wsf$m */
    static final class m extends wsf<Object> {
        m() {
        }

        /* access modifiers changed from: 0000 */
        public final void a(wsh wsh, Object obj) {
            wsm.a(obj, "@Url parameter is null.");
            wsh.b = obj.toString();
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract void a(wsh wsh, T t);

    wsf() {
    }

    /* access modifiers changed from: 0000 */
    public final wsf<Iterable<T>> a() {
        return new wsf<Iterable<T>>() {
            /* access modifiers changed from: 0000 */
            public final /* synthetic */ void a(wsh wsh, Object obj) {
                Iterable<Object> iterable = (Iterable) obj;
                if (iterable != null) {
                    for (Object a2 : iterable) {
                        wsf.this.a(wsh, a2);
                    }
                }
            }
        };
    }

    /* access modifiers changed from: 0000 */
    public final wsf<Object> b() {
        return new wsf<Object>() {
            /* access modifiers changed from: 0000 */
            public final void a(wsh wsh, Object obj) {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        wsf.this.a(wsh, Array.get(obj, i));
                    }
                }
            }
        };
    }
}
