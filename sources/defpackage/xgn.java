package defpackage;

import com.spotify.cosmos.router.Request;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: xgn reason: default package */
final class xgn {
    final String a;
    private final Method b;
    private final xad c;
    private final String d;
    private final xac e;
    private final xaf f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final xgk<?>[] j;

    /* renamed from: xgn$a */
    static final class a {
        private static final Pattern r = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        private static final Pattern s = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
        final xgp a;
        final Method b;
        final Annotation[] c;
        final Annotation[][] d;
        final Type[] e;
        boolean f;
        boolean g;
        boolean h;
        boolean i;
        String j;
        boolean k;
        boolean l;
        boolean m;
        String n;
        xac o;
        xaf p;
        xgk<?>[] q;
        private boolean t;
        private boolean u;
        private boolean v;
        private boolean w;
        private Set<String> x;

        a(xgp xgp, Method method) {
            this.a = xgp;
            this.b = method;
            this.c = method.getAnnotations();
            this.e = method.getGenericParameterTypes();
            this.d = method.getParameterAnnotations();
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Class<?>, code=java.lang.Class, for r1v0, types: [java.lang.Class<?>, java.lang.Class] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.Class<?> a(java.lang.Class r1) {
            /*
                java.lang.Class r0 = java.lang.Boolean.TYPE
                if (r0 != r1) goto L_0x0007
                java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
                return r1
            L_0x0007:
                java.lang.Class r0 = java.lang.Byte.TYPE
                if (r0 != r1) goto L_0x000e
                java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
                return r1
            L_0x000e:
                java.lang.Class r0 = java.lang.Character.TYPE
                if (r0 != r1) goto L_0x0015
                java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
                return r1
            L_0x0015:
                java.lang.Class r0 = java.lang.Double.TYPE
                if (r0 != r1) goto L_0x001c
                java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
                return r1
            L_0x001c:
                java.lang.Class r0 = java.lang.Float.TYPE
                if (r0 != r1) goto L_0x0023
                java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
                return r1
            L_0x0023:
                java.lang.Class r0 = java.lang.Integer.TYPE
                if (r0 != r1) goto L_0x002a
                java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
                return r1
            L_0x002a:
                java.lang.Class r0 = java.lang.Long.TYPE
                if (r0 != r1) goto L_0x0031
                java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
                return r1
            L_0x0031:
                java.lang.Class r0 = java.lang.Short.TYPE
                if (r0 != r1) goto L_0x0037
                java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xgn.a.a(java.lang.Class):java.lang.Class");
        }

        private static Set<String> a(String str) {
            Matcher matcher = r.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void a(int i2, Type type) {
            if (xgr.d(type)) {
                throw xgr.a(this.b, i2, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        /* access modifiers changed from: 0000 */
        public xac a(String[] strArr) {
            defpackage.xac.a aVar = new defpackage.xac.a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw xgr.a(this.b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.p = xaf.a(trim);
                    } catch (IllegalArgumentException e2) {
                        throw xgr.a(this.b, (Throwable) e2, "Malformed content type: %s", trim);
                    }
                } else {
                    aVar.a(substring, trim);
                }
            }
            return aVar.a();
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
            if ("android.net.Uri".equals(((java.lang.Class) r12).getName()) != false) goto L_0x004f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public defpackage.xgk<?> a(int r11, java.lang.reflect.Type r12, java.lang.annotation.Annotation[] r13, java.lang.annotation.Annotation r14) {
            /*
                r10 = this;
                boolean r0 = r14 instanceof defpackage.xif
                java.lang.String r1 = "@Path parameters may not be used with @Url."
                r2 = 1
                r3 = 0
                if (r0 == 0) goto L_0x0099
                r10.a(r11, r12)
                boolean r13 = r10.i
                if (r13 != 0) goto L_0x008e
                boolean r13 = r10.t
                if (r13 != 0) goto L_0x0085
                boolean r13 = r10.u
                if (r13 != 0) goto L_0x007a
                boolean r13 = r10.v
                if (r13 != 0) goto L_0x006f
                boolean r13 = r10.w
                if (r13 != 0) goto L_0x0064
                java.lang.String r13 = r10.n
                if (r13 != 0) goto L_0x0055
                r10.i = r2
                java.lang.Class<xad> r13 = defpackage.xad.class
                if (r12 == r13) goto L_0x004f
                java.lang.Class<java.lang.String> r13 = java.lang.String.class
                if (r12 == r13) goto L_0x004f
                java.lang.Class<java.net.URI> r13 = java.net.URI.class
                if (r12 == r13) goto L_0x004f
                boolean r13 = r12 instanceof java.lang.Class
                if (r13 == 0) goto L_0x0044
                java.lang.Class r12 = (java.lang.Class) r12
                java.lang.String r12 = r12.getName()
                java.lang.String r13 = "android.net.Uri"
                boolean r12 = r13.equals(r12)
                if (r12 == 0) goto L_0x0044
                goto L_0x004f
            L_0x0044:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.String r14 = "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x004f:
                xgk$m r11 = new xgk$m
                r11.<init>()
                return r11
            L_0x0055:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r2]
                java.lang.String r14 = r10.j
                r13[r3] = r14
                java.lang.String r14 = "@Url cannot be used with @%s URL"
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x0064:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.String r14 = "A @Url parameter must not come after a @QueryMap."
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x006f:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.String r14 = "A @Url parameter must not come after a @QueryName."
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x007a:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.String r14 = "A @Url parameter must not come after a @Query."
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x0085:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r1, r13)
                throw r11
            L_0x008e:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.String r14 = "Multiple @Url method annotations found."
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x0099:
                boolean r0 = r14 instanceof defpackage.xia
                r4 = 2
                if (r0 == 0) goto L_0x0140
                r10.a(r11, r12)
                boolean r0 = r10.u
                if (r0 != 0) goto L_0x0135
                boolean r0 = r10.v
                if (r0 != 0) goto L_0x012a
                boolean r0 = r10.w
                if (r0 != 0) goto L_0x011f
                boolean r0 = r10.i
                if (r0 != 0) goto L_0x0116
                java.lang.String r0 = r10.n
                if (r0 == 0) goto L_0x0107
                r10.t = r2
                xia r14 = (defpackage.xia) r14
                java.lang.String r0 = r14.a()
                java.util.regex.Pattern r1 = s
                java.util.regex.Matcher r1 = r1.matcher(r0)
                boolean r1 = r1.matches()
                if (r1 == 0) goto L_0x00f2
                java.util.Set<java.lang.String> r1 = r10.x
                boolean r1 = r1.contains(r0)
                if (r1 == 0) goto L_0x00e1
                xgp r11 = r10.a
                xgd r11 = r11.a(r12, r13)
                xgk$h r12 = new xgk$h
                boolean r13 = r14.b()
                r12.<init>(r0, r11, r13)
                return r12
            L_0x00e1:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.String r14 = r10.n
                r13[r3] = r14
                r13[r2] = r0
                java.lang.String r14 = "URL \"%s\" does not contain \"{%s}\"."
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x00f2:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.util.regex.Pattern r14 = r
                java.lang.String r14 = r14.pattern()
                r13[r3] = r14
                r13[r2] = r0
                java.lang.String r14 = "@Path parameter name must match %s. Found: %s"
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x0107:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r2]
                java.lang.String r14 = r10.j
                r13[r3] = r14
                java.lang.String r14 = "@Path can only be used with relative url on @%s"
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x0116:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r1, r13)
                throw r11
            L_0x011f:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.String r14 = "A @Path parameter must not come after a @QueryMap."
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x012a:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.String r14 = "A @Path parameter must not come after a @QueryName."
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x0135:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.String r14 = "A @Path parameter must not come after a @Query."
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x0140:
                boolean r0 = r14 instanceof defpackage.xib
                java.lang.String r1 = "<String>)"
                java.lang.String r5 = " must include generic type (e.g., "
                if (r0 == 0) goto L_0x01cd
                r10.a(r11, r12)
                xib r14 = (defpackage.xib) r14
                java.lang.String r0 = r14.a()
                boolean r14 = r14.b()
                java.lang.Class r4 = defpackage.xgr.a(r12)
                r10.u = r2
                java.lang.Class<java.lang.Iterable> r2 = java.lang.Iterable.class
                boolean r2 = r2.isAssignableFrom(r4)
                if (r2 == 0) goto L_0x01a3
                boolean r2 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r2 == 0) goto L_0x017d
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r11 = defpackage.xgr.a(r3, r12)
                xgp r12 = r10.a
                xgd r11 = r12.a(r11, r13)
                xgk$i r12 = new xgk$i
                r12.<init>(r0, r11, r14)
                xgk r11 = r12.a()
                return r11
            L_0x017d:
                java.lang.reflect.Method r12 = r10.b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r4.getSimpleName()
                r13.append(r14)
                r13.append(r5)
                java.lang.String r14 = r4.getSimpleName()
                r13.append(r14)
                r13.append(r1)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r3]
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r13, r14)
                throw r11
            L_0x01a3:
                boolean r11 = r4.isArray()
                if (r11 == 0) goto L_0x01c1
                java.lang.Class r11 = r4.getComponentType()
                java.lang.Class r11 = a(r11)
                xgp r12 = r10.a
                xgd r11 = r12.a(r11, r13)
                xgk$i r12 = new xgk$i
                r12.<init>(r0, r11, r14)
                xgk r11 = r12.b()
                return r11
            L_0x01c1:
                xgp r11 = r10.a
                xgd r11 = r11.a(r12, r13)
                xgk$i r12 = new xgk$i
                r12.<init>(r0, r11, r14)
                return r12
            L_0x01cd:
                boolean r0 = r14 instanceof defpackage.xid
                if (r0 == 0) goto L_0x0252
                r10.a(r11, r12)
                xid r14 = (defpackage.xid) r14
                boolean r14 = r14.a()
                java.lang.Class r0 = defpackage.xgr.a(r12)
                r10.v = r2
                java.lang.Class<java.lang.Iterable> r2 = java.lang.Iterable.class
                boolean r2 = r2.isAssignableFrom(r0)
                if (r2 == 0) goto L_0x0228
                boolean r2 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r2 == 0) goto L_0x0202
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r11 = defpackage.xgr.a(r3, r12)
                xgp r12 = r10.a
                xgd r11 = r12.a(r11, r13)
                xgk$k r12 = new xgk$k
                r12.<init>(r11, r14)
                xgk r11 = r12.a()
                return r11
            L_0x0202:
                java.lang.reflect.Method r12 = r10.b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r0.getSimpleName()
                r13.append(r14)
                r13.append(r5)
                java.lang.String r14 = r0.getSimpleName()
                r13.append(r14)
                r13.append(r1)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r3]
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r13, r14)
                throw r11
            L_0x0228:
                boolean r11 = r0.isArray()
                if (r11 == 0) goto L_0x0246
                java.lang.Class r11 = r0.getComponentType()
                java.lang.Class r11 = a(r11)
                xgp r12 = r10.a
                xgd r11 = r12.a(r11, r13)
                xgk$k r12 = new xgk$k
                r12.<init>(r11, r14)
                xgk r11 = r12.b()
                return r11
            L_0x0246:
                xgp r11 = r10.a
                xgd r11 = r11.a(r12, r13)
                xgk$k r12 = new xgk$k
                r12.<init>(r11, r14)
                return r12
            L_0x0252:
                boolean r0 = r14 instanceof defpackage.xic
                java.lang.String r6 = "Map must include generic types (e.g., Map<String, String>)"
                if (r0 == 0) goto L_0x02be
                r10.a(r11, r12)
                java.lang.Class r0 = defpackage.xgr.a(r12)
                r10.w = r2
                java.lang.Class<java.util.Map> r1 = java.util.Map.class
                boolean r1 = r1.isAssignableFrom(r0)
                if (r1 == 0) goto L_0x02b3
                java.lang.Class<java.util.Map> r1 = java.util.Map.class
                java.lang.reflect.Type r12 = defpackage.xgr.a(r12, r0, r1)
                boolean r0 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto L_0x02aa
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r0 = defpackage.xgr.a(r3, r12)
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                if (r1 != r0) goto L_0x0293
                java.lang.reflect.Type r11 = defpackage.xgr.a(r2, r12)
                xgp r12 = r10.a
                xgd r11 = r12.a(r11, r13)
                xgk$j r12 = new xgk$j
                xic r14 = (defpackage.xic) r14
                boolean r13 = r14.a()
                r12.<init>(r11, r13)
                return r12
            L_0x0293:
                java.lang.reflect.Method r12 = r10.b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                java.lang.String r14 = "@QueryMap keys must be of type String: "
                r13.<init>(r14)
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r3]
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r13, r14)
                throw r11
            L_0x02aa:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r6, r13)
                throw r11
            L_0x02b3:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.String r14 = "@QueryMap parameter type must be Map."
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x02be:
                boolean r0 = r14 instanceof defpackage.xhq
                if (r0 == 0) goto L_0x0341
                r10.a(r11, r12)
                xhq r14 = (defpackage.xhq) r14
                java.lang.String r14 = r14.a()
                java.lang.Class r0 = defpackage.xgr.a(r12)
                java.lang.Class<java.lang.Iterable> r2 = java.lang.Iterable.class
                boolean r2 = r2.isAssignableFrom(r0)
                if (r2 == 0) goto L_0x0317
                boolean r2 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r2 == 0) goto L_0x02f1
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r11 = defpackage.xgr.a(r3, r12)
                xgp r12 = r10.a
                xgd r11 = r12.a(r11, r13)
                xgk$d r12 = new xgk$d
                r12.<init>(r14, r11)
                xgk r11 = r12.a()
                return r11
            L_0x02f1:
                java.lang.reflect.Method r12 = r10.b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r0.getSimpleName()
                r13.append(r14)
                r13.append(r5)
                java.lang.String r14 = r0.getSimpleName()
                r13.append(r14)
                r13.append(r1)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r3]
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r13, r14)
                throw r11
            L_0x0317:
                boolean r11 = r0.isArray()
                if (r11 == 0) goto L_0x0335
                java.lang.Class r11 = r0.getComponentType()
                java.lang.Class r11 = a(r11)
                xgp r12 = r10.a
                xgd r11 = r12.a(r11, r13)
                xgk$d r12 = new xgk$d
                r12.<init>(r14, r11)
                xgk r11 = r12.b()
                return r11
            L_0x0335:
                xgp r11 = r10.a
                xgd r11 = r11.a(r12, r13)
                xgk$d r12 = new xgk$d
                r12.<init>(r14, r11)
                return r12
            L_0x0341:
                boolean r0 = r14 instanceof defpackage.xhr
                if (r0 == 0) goto L_0x03a3
                r10.a(r11, r12)
                java.lang.Class r14 = defpackage.xgr.a(r12)
                java.lang.Class<java.util.Map> r0 = java.util.Map.class
                boolean r0 = r0.isAssignableFrom(r14)
                if (r0 == 0) goto L_0x0398
                java.lang.Class<java.util.Map> r0 = java.util.Map.class
                java.lang.reflect.Type r12 = defpackage.xgr.a(r12, r14, r0)
                boolean r14 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r14 == 0) goto L_0x038f
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r14 = defpackage.xgr.a(r3, r12)
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                if (r0 != r14) goto L_0x0378
                java.lang.reflect.Type r11 = defpackage.xgr.a(r2, r12)
                xgp r12 = r10.a
                xgd r11 = r12.a(r11, r13)
                xgk$e r12 = new xgk$e
                r12.<init>(r11)
                return r12
            L_0x0378:
                java.lang.reflect.Method r12 = r10.b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                java.lang.String r0 = "@HeaderMap keys must be of type String: "
                r13.<init>(r0)
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r3]
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r13, r14)
                throw r11
            L_0x038f:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r6, r13)
                throw r11
            L_0x0398:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.String r14 = "@HeaderMap parameter type must be Map."
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x03a3:
                boolean r0 = r14 instanceof defpackage.xhk
                if (r0 == 0) goto L_0x043b
                r10.a(r11, r12)
                boolean r0 = r10.l
                if (r0 == 0) goto L_0x0430
                xhk r14 = (defpackage.xhk) r14
                java.lang.String r0 = r14.a()
                boolean r14 = r14.b()
                r10.f = r2
                java.lang.Class r2 = defpackage.xgr.a(r12)
                java.lang.Class<java.lang.Iterable> r4 = java.lang.Iterable.class
                boolean r4 = r4.isAssignableFrom(r2)
                if (r4 == 0) goto L_0x0406
                boolean r4 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r4 == 0) goto L_0x03e0
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r11 = defpackage.xgr.a(r3, r12)
                xgp r12 = r10.a
                xgd r11 = r12.a(r11, r13)
                xgk$b r12 = new xgk$b
                r12.<init>(r0, r11, r14)
                xgk r11 = r12.a()
                return r11
            L_0x03e0:
                java.lang.reflect.Method r12 = r10.b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r2.getSimpleName()
                r13.append(r14)
                r13.append(r5)
                java.lang.String r14 = r2.getSimpleName()
                r13.append(r14)
                r13.append(r1)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r3]
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r13, r14)
                throw r11
            L_0x0406:
                boolean r11 = r2.isArray()
                if (r11 == 0) goto L_0x0424
                java.lang.Class r11 = r2.getComponentType()
                java.lang.Class r11 = a(r11)
                xgp r12 = r10.a
                xgd r11 = r12.a(r11, r13)
                xgk$b r12 = new xgk$b
                r12.<init>(r0, r11, r14)
                xgk r11 = r12.b()
                return r11
            L_0x0424:
                xgp r11 = r10.a
                xgd r11 = r11.a(r12, r13)
                xgk$b r12 = new xgk$b
                r12.<init>(r0, r11, r14)
                return r12
            L_0x0430:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.String r14 = "@Field parameters can only be used with form encoding."
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x043b:
                boolean r0 = r14 instanceof defpackage.xhl
                if (r0 == 0) goto L_0x04b4
                r10.a(r11, r12)
                boolean r0 = r10.l
                if (r0 == 0) goto L_0x04a9
                java.lang.Class r0 = defpackage.xgr.a(r12)
                java.lang.Class<java.util.Map> r1 = java.util.Map.class
                boolean r1 = r1.isAssignableFrom(r0)
                if (r1 == 0) goto L_0x049e
                java.lang.Class<java.util.Map> r1 = java.util.Map.class
                java.lang.reflect.Type r12 = defpackage.xgr.a(r12, r0, r1)
                boolean r0 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto L_0x0495
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r0 = defpackage.xgr.a(r3, r12)
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                if (r1 != r0) goto L_0x047e
                java.lang.reflect.Type r11 = defpackage.xgr.a(r2, r12)
                xgp r12 = r10.a
                xgd r11 = r12.a(r11, r13)
                r10.f = r2
                xgk$c r12 = new xgk$c
                xhl r14 = (defpackage.xhl) r14
                boolean r13 = r14.a()
                r12.<init>(r11, r13)
                return r12
            L_0x047e:
                java.lang.reflect.Method r12 = r10.b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                java.lang.String r14 = "@FieldMap keys must be of type String: "
                r13.<init>(r14)
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r3]
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r13, r14)
                throw r11
            L_0x0495:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r6, r13)
                throw r11
            L_0x049e:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.String r14 = "@FieldMap parameter type must be Map."
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x04a9:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.String r14 = "@FieldMap parameters can only be used with form encoding."
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x04b4:
                boolean r0 = r14 instanceof defpackage.xhy
                if (r0 == 0) goto L_0x0644
                r10.a(r11, r12)
                boolean r0 = r10.m
                if (r0 == 0) goto L_0x0639
                xhy r14 = (defpackage.xhy) r14
                r10.g = r2
                java.lang.String r0 = r14.a()
                java.lang.Class r6 = defpackage.xgr.a(r12)
                boolean r7 = r0.isEmpty()
                if (r7 == 0) goto L_0x055d
                java.lang.Class<java.lang.Iterable> r13 = java.lang.Iterable.class
                boolean r13 = r13.isAssignableFrom(r6)
                java.lang.String r14 = "@Part annotation must supply a name or use MultipartBody.Part parameter type."
                if (r13 == 0) goto L_0x0527
                boolean r13 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r13 == 0) goto L_0x0501
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r12 = defpackage.xgr.a(r3, r12)
                java.lang.Class<xag$b> r13 = defpackage.xag.b.class
                java.lang.Class r12 = defpackage.xgr.a(r12)
                boolean r12 = r13.isAssignableFrom(r12)
                if (r12 == 0) goto L_0x04f8
                xgk$l r11 = defpackage.xgk.l.a
                xgk r11 = r11.a()
                return r11
            L_0x04f8:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x0501:
                java.lang.reflect.Method r12 = r10.b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r6.getSimpleName()
                r13.append(r14)
                r13.append(r5)
                java.lang.String r14 = r6.getSimpleName()
                r13.append(r14)
                r13.append(r1)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r3]
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r13, r14)
                throw r11
            L_0x0527:
                boolean r12 = r6.isArray()
                if (r12 == 0) goto L_0x0549
                java.lang.Class r12 = r6.getComponentType()
                java.lang.Class<xag$b> r13 = defpackage.xag.b.class
                boolean r12 = r13.isAssignableFrom(r12)
                if (r12 == 0) goto L_0x0540
                xgk$l r11 = defpackage.xgk.l.a
                xgk r11 = r11.b()
                return r11
            L_0x0540:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x0549:
                java.lang.Class<xag$b> r12 = defpackage.xag.b.class
                boolean r12 = r12.isAssignableFrom(r6)
                if (r12 == 0) goto L_0x0554
                xgk$l r11 = defpackage.xgk.l.a
                return r11
            L_0x0554:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x055d:
                r7 = 4
                java.lang.String[] r7 = new java.lang.String[r7]
                java.lang.String r8 = "Content-Disposition"
                r7[r3] = r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                java.lang.String r9 = "form-data; name=\""
                r8.<init>(r9)
                r8.append(r0)
                java.lang.String r0 = "\""
                r8.append(r0)
                java.lang.String r0 = r8.toString()
                r7[r2] = r0
                java.lang.String r0 = "Content-Transfer-Encoding"
                r7[r4] = r0
                r0 = 3
                java.lang.String r14 = r14.b()
                r7[r0] = r14
                xac r14 = defpackage.xac.a(r7)
                java.lang.Class<java.lang.Iterable> r0 = java.lang.Iterable.class
                boolean r0 = r0.isAssignableFrom(r6)
                java.lang.String r2 = "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."
                if (r0 == 0) goto L_0x05e9
                boolean r0 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto L_0x05c3
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r12 = defpackage.xgr.a(r3, r12)
                java.lang.Class<xag$b> r0 = defpackage.xag.b.class
                java.lang.Class r1 = defpackage.xgr.a(r12)
                boolean r0 = r0.isAssignableFrom(r1)
                if (r0 != 0) goto L_0x05ba
                xgp r11 = r10.a
                java.lang.annotation.Annotation[] r0 = r10.c
                xgd r11 = r11.a(r12, r13, r0)
                xgk$f r12 = new xgk$f
                r12.<init>(r14, r11)
                xgk r11 = r12.a()
                return r11
            L_0x05ba:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r2, r13)
                throw r11
            L_0x05c3:
                java.lang.reflect.Method r12 = r10.b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r6.getSimpleName()
                r13.append(r14)
                r13.append(r5)
                java.lang.String r14 = r6.getSimpleName()
                r13.append(r14)
                r13.append(r1)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r3]
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r13, r14)
                throw r11
            L_0x05e9:
                boolean r0 = r6.isArray()
                if (r0 == 0) goto L_0x061a
                java.lang.Class r12 = r6.getComponentType()
                java.lang.Class r12 = a(r12)
                java.lang.Class<xag$b> r0 = defpackage.xag.b.class
                boolean r0 = r0.isAssignableFrom(r12)
                if (r0 != 0) goto L_0x0611
                xgp r11 = r10.a
                java.lang.annotation.Annotation[] r0 = r10.c
                xgd r11 = r11.a(r12, r13, r0)
                xgk$f r12 = new xgk$f
                r12.<init>(r14, r11)
                xgk r11 = r12.b()
                return r11
            L_0x0611:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r2, r13)
                throw r11
            L_0x061a:
                java.lang.Class<xag$b> r0 = defpackage.xag.b.class
                boolean r0 = r0.isAssignableFrom(r6)
                if (r0 != 0) goto L_0x0630
                xgp r11 = r10.a
                java.lang.annotation.Annotation[] r0 = r10.c
                xgd r11 = r11.a(r12, r13, r0)
                xgk$f r12 = new xgk$f
                r12.<init>(r14, r11)
                return r12
            L_0x0630:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r2, r13)
                throw r11
            L_0x0639:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.String r14 = "@Part parameters can only be used with multipart encoding."
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x0644:
                boolean r0 = r14 instanceof defpackage.xhz
                if (r0 == 0) goto L_0x06d6
                r10.a(r11, r12)
                boolean r0 = r10.m
                if (r0 == 0) goto L_0x06cb
                r10.g = r2
                java.lang.Class r0 = defpackage.xgr.a(r12)
                java.lang.Class<java.util.Map> r1 = java.util.Map.class
                boolean r1 = r1.isAssignableFrom(r0)
                if (r1 == 0) goto L_0x06c0
                java.lang.Class<java.util.Map> r1 = java.util.Map.class
                java.lang.reflect.Type r12 = defpackage.xgr.a(r12, r0, r1)
                boolean r0 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto L_0x06b7
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r0 = defpackage.xgr.a(r3, r12)
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                if (r1 != r0) goto L_0x06a0
                java.lang.reflect.Type r12 = defpackage.xgr.a(r2, r12)
                java.lang.Class<xag$b> r0 = defpackage.xag.b.class
                java.lang.Class r1 = defpackage.xgr.a(r12)
                boolean r0 = r0.isAssignableFrom(r1)
                if (r0 != 0) goto L_0x0695
                xgp r11 = r10.a
                java.lang.annotation.Annotation[] r0 = r10.c
                xgd r11 = r11.a(r12, r13, r0)
                xhz r14 = (defpackage.xhz) r14
                xgk$g r12 = new xgk$g
                java.lang.String r13 = r14.a()
                r12.<init>(r11, r13)
                return r12
            L_0x0695:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.String r14 = "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x06a0:
                java.lang.reflect.Method r12 = r10.b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                java.lang.String r14 = "@PartMap keys must be of type String: "
                r13.<init>(r14)
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r3]
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r13, r14)
                throw r11
            L_0x06b7:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r6, r13)
                throw r11
            L_0x06c0:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.String r14 = "@PartMap parameter type must be Map."
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x06cb:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.String r14 = "@PartMap parameters can only be used with multipart encoding."
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x06d6:
                boolean r14 = r14 instanceof defpackage.xhi
                if (r14 == 0) goto L_0x071d
                r10.a(r11, r12)
                boolean r14 = r10.l
                if (r14 != 0) goto L_0x0712
                boolean r14 = r10.m
                if (r14 != 0) goto L_0x0712
                boolean r14 = r10.h
                if (r14 != 0) goto L_0x0707
                xgp r14 = r10.a     // Catch:{ RuntimeException -> 0x06f9 }
                java.lang.annotation.Annotation[] r0 = r10.c     // Catch:{ RuntimeException -> 0x06f9 }
                xgd r11 = r14.a(r12, r13, r0)     // Catch:{ RuntimeException -> 0x06f9 }
                r10.h = r2
                xgk$a r12 = new xgk$a
                r12.<init>(r11)
                return r12
            L_0x06f9:
                r13 = move-exception
                java.lang.reflect.Method r14 = r10.b
                java.lang.Object[] r0 = new java.lang.Object[r2]
                r0[r3] = r12
                java.lang.String r12 = "Unable to create @Body converter for %s"
                java.lang.RuntimeException r11 = defpackage.xgr.a(r14, r13, r11, r12, r0)
                throw r11
            L_0x0707:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.String r14 = "Multiple @Body method annotations found."
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x0712:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.String r14 = "@Body parameters cannot be used with form or multi-part encoding."
                java.lang.RuntimeException r11 = defpackage.xgr.a(r12, r11, r14, r13)
                throw r11
            L_0x071d:
                r11 = 0
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xgn.a.a(int, java.lang.reflect.Type, java.lang.annotation.Annotation[], java.lang.annotation.Annotation):xgk");
        }

        /* access modifiers changed from: 0000 */
        public void a(String str, String str2, boolean z) {
            String str3 = this.j;
            if (str3 == null) {
                this.j = str;
                this.k = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (r.matcher(substring).find()) {
                            throw xgr.a(this.b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.n = str2;
                    this.x = a(str2);
                    return;
                }
                return;
            }
            throw xgr.a(this.b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
    }

    xgn(a aVar) {
        this.b = aVar.b;
        this.c = aVar.a.b;
        this.a = aVar.j;
        this.d = aVar.n;
        this.e = aVar.o;
        this.f = aVar.p;
        this.g = aVar.k;
        this.h = aVar.l;
        this.i = aVar.m;
        this.j = aVar.q;
    }

    static xgn a(xgp xgp, Method method) {
        Annotation[] annotationArr;
        a aVar = new a(xgp, method);
        for (Annotation annotation : aVar.c) {
            if (annotation instanceof xhj) {
                aVar.a(Request.DELETE, ((xhj) annotation).a(), false);
            } else if (annotation instanceof xhn) {
                aVar.a(Request.GET, ((xhn) annotation).a(), false);
            } else if (annotation instanceof xho) {
                aVar.a("HEAD", ((xho) annotation).a(), false);
            } else if (annotation instanceof xhv) {
                aVar.a("PATCH", ((xhv) annotation).a(), true);
            } else if (annotation instanceof xhw) {
                aVar.a(Request.POST, ((xhw) annotation).a(), true);
            } else if (annotation instanceof xhx) {
                aVar.a(Request.PUT, ((xhx) annotation).a(), true);
            } else if (annotation instanceof xhu) {
                aVar.a("OPTIONS", ((xhu) annotation).a(), false);
            } else if (annotation instanceof xhp) {
                xhp xhp = (xhp) annotation;
                aVar.a(xhp.a(), xhp.b(), xhp.c());
            } else if (annotation instanceof xhs) {
                String[] a2 = ((xhs) annotation).a();
                if (a2.length != 0) {
                    aVar.o = aVar.a(a2);
                } else {
                    throw xgr.a(aVar.b, "@Headers annotation is empty.", new Object[0]);
                }
            } else {
                String str = "Only one encoding annotation is allowed.";
                if (annotation instanceof xht) {
                    if (!aVar.l) {
                        aVar.m = true;
                    } else {
                        throw xgr.a(aVar.b, str, new Object[0]);
                    }
                } else if (!(annotation instanceof xhm)) {
                    continue;
                } else if (!aVar.m) {
                    aVar.l = true;
                } else {
                    throw xgr.a(aVar.b, str, new Object[0]);
                }
            }
        }
        if (aVar.j != null) {
            if (!aVar.k) {
                if (aVar.m) {
                    throw xgr.a(aVar.b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                } else if (aVar.l) {
                    throw xgr.a(aVar.b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = aVar.d.length;
            aVar.q = new xgk[length];
            int i2 = 0;
            while (i2 < length) {
                xgk<?>[] xgkArr = aVar.q;
                Type type = aVar.e[i2];
                Annotation[] annotationArr2 = aVar.d[i2];
                xgk<?> xgk = null;
                if (annotationArr2 != null) {
                    xgk<?> xgk2 = null;
                    for (Annotation a3 : annotationArr2) {
                        xgk<?> a4 = aVar.a(i2, type, annotationArr2, a3);
                        if (a4 != null) {
                            if (xgk2 == null) {
                                xgk2 = a4;
                            } else {
                                throw xgr.a(aVar.b, i2, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                            }
                        }
                    }
                    xgk = xgk2;
                }
                if (xgk != null) {
                    xgkArr[i2] = xgk;
                    i2++;
                } else {
                    throw xgr.a(aVar.b, i2, "No Retrofit annotation found.", new Object[0]);
                }
            }
            if (aVar.n == null && !aVar.i) {
                throw xgr.a(aVar.b, "Missing either @%s URL or @Url parameter.", aVar.j);
            } else if (!aVar.l && !aVar.m && !aVar.k && aVar.h) {
                throw xgr.a(aVar.b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            } else if (aVar.l && !aVar.f) {
                throw xgr.a(aVar.b, "Form-encoded method must contain at least one @Field.", new Object[0]);
            } else if (!aVar.m || aVar.g) {
                return new xgn(aVar);
            } else {
                throw xgr.a(aVar.b, "Multipart method must contain at least one @Part.", new Object[0]);
            }
        } else {
            throw xgr.a(aVar.b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
        }
    }

    /* access modifiers changed from: 0000 */
    public final xaj a(Object[] objArr) {
        xgk<?>[] xgkArr = this.j;
        int length = objArr.length;
        if (length == xgkArr.length) {
            xgm xgm = new xgm(this.a, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(objArr[i2]);
                xgkArr[i2].a(xgm, objArr[i2]);
            }
            return xgm.a().a(xgh.class, new xgh(this.b, arrayList)).a();
        }
        StringBuilder sb = new StringBuilder("Argument count (");
        sb.append(length);
        sb.append(") doesn't match expected count (");
        sb.append(xgkArr.length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
}
