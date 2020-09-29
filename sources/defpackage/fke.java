package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: fke reason: default package */
public final class fke implements fji {
    private final fjo a;
    private final fiw b;
    private final fjp c;
    private final fjz d;
    private final fkm e = fkm.a();

    /* renamed from: fke$a */
    public static final class a<T> extends fjh<T> {
        private final fjs<T> a;
        private final Map<String, b> b;

        a(fjs<T> fjs, Map<String, b> map) {
            this.a = fjs;
            this.b = map;
        }

        public final T a(fkp fkp) {
            if (fkp.f() == JsonToken.NULL) {
                fkp.k();
                return null;
            }
            T a2 = this.a.a();
            try {
                fkp.c();
                while (fkp.e()) {
                    b bVar = (b) this.b.get(fkp.h());
                    if (bVar != null) {
                        if (bVar.c) {
                            bVar.a(fkp, (Object) a2);
                        }
                    }
                    fkp.o();
                }
                fkp.d();
                return a2;
            } catch (IllegalStateException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public final void a(fkq fkq, T t) {
            if (t == null) {
                fkq.e();
                return;
            }
            fkq.c();
            try {
                for (b bVar : this.b.values()) {
                    if (bVar.a(t)) {
                        fkq.a(bVar.a);
                        bVar.a(fkq, (Object) t);
                    }
                }
                fkq.d();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: fke$b */
    static abstract class b {
        final String a;
        final boolean b;
        final boolean c;

        protected b(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        /* access modifiers changed from: 0000 */
        public abstract void a(fkp fkp, Object obj);

        /* access modifiers changed from: 0000 */
        public abstract void a(fkq fkq, Object obj);

        /* access modifiers changed from: 0000 */
        public abstract boolean a(Object obj);
    }

    public fke(fjo fjo, fiw fiw, fjp fjp, fjz fjz) {
        this.a = fjo;
        this.b = fiw;
        this.c = fjp;
        this.d = fjz;
    }

    private List<String> a(Field field) {
        fjk fjk = (fjk) field.getAnnotation(fjk.class);
        if (fjk == null) {
            return Collections.singletonList(this.b.a(field));
        }
        String a2 = fjk.a();
        String[] b2 = fjk.b();
        if (b2.length == 0) {
            return Collections.singletonList(a2);
        }
        ArrayList arrayList = new ArrayList(b2.length + 1);
        arrayList.add(a2);
        for (String add : b2) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Class<?>, code=java.lang.Class, for r34v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.String, defpackage.fke.b> a(defpackage.fix r32, defpackage.fko<?> r33, java.lang.Class r34) {
        /*
            r31 = this;
            r11 = r31
            r12 = r32
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            boolean r0 = r34.isInterface()
            if (r0 == 0) goto L_0x0010
            return r13
        L_0x0010:
            r0 = r33
            java.lang.reflect.Type r14 = r0.b
            r15 = r34
            r10 = r0
        L_0x0017:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r15 == r0) goto L_0x0141
            java.lang.reflect.Field[] r9 = r15.getDeclaredFields()
            int r8 = r9.length
            r7 = 0
            r6 = 0
        L_0x0022:
            if (r6 >= r8) goto L_0x0126
            r5 = r9[r6]
            r4 = 1
            boolean r0 = r11.a(r5, r4)
            boolean r16 = r11.a(r5, r7)
            if (r0 != 0) goto L_0x0042
            if (r16 == 0) goto L_0x0034
            goto L_0x0042
        L_0x0034:
            r28 = r6
            r23 = r8
            r29 = r9
            r30 = r10
            r33 = r15
            r22 = 0
            goto L_0x00f9
        L_0x0042:
            fkm r1 = r11.e
            r1.a(r5)
            java.lang.reflect.Type r1 = r10.b
            java.lang.reflect.Type r2 = r5.getGenericType()
            java.lang.reflect.Type r17 = com.google.gson.internal.C$Gson$Types.a(r1, r15, r2)
            java.util.List r3 = r11.a(r5)
            int r2 = r3.size()
            r18 = 0
            r19 = r0
            r0 = r18
            r1 = 0
        L_0x0060:
            if (r1 >= r2) goto L_0x00ea
            java.lang.Object r20 = r3.get(r1)
            r33 = r15
            r15 = r20
            java.lang.String r15 = (java.lang.String) r15
            r34 = r9
            if (r1 == 0) goto L_0x0072
            r19 = 0
        L_0x0072:
            fko r9 = defpackage.fko.a(r17)
            java.lang.Class<? super T> r4 = r9.a
            boolean r21 = defpackage.fjt.a(r4)
            java.lang.Class<fjj> r4 = defpackage.fjj.class
            java.lang.annotation.Annotation r4 = r5.getAnnotation(r4)
            fjj r4 = (defpackage.fjj) r4
            if (r4 == 0) goto L_0x008d
            fjo r7 = r11.a
            fjh r4 = defpackage.fjz.a(r7, r12, r9, r4)
            goto L_0x008f
        L_0x008d:
            r4 = r18
        L_0x008f:
            if (r4 == 0) goto L_0x0093
            r7 = 1
            goto L_0x0094
        L_0x0093:
            r7 = 0
        L_0x0094:
            if (r4 != 0) goto L_0x009a
            fjh r4 = r12.a(r9)
        L_0x009a:
            r23 = r4
            fke$1 r4 = new fke$1
            r11 = r0
            r0 = r4
            r24 = r1
            r1 = r31
            r25 = r2
            r2 = r15
            r26 = r3
            r3 = r19
            r12 = r4
            r20 = 1
            r4 = r16
            r27 = r5
            r28 = r6
            r6 = r7
            r22 = 0
            r7 = r23
            r23 = r8
            r8 = r32
            r29 = r34
            r30 = r10
            r10 = r21
            r0.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = r13.put(r15, r12)
            fke$b r0 = (defpackage.fke.b) r0
            if (r11 != 0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r0 = r11
        L_0x00d0:
            int r1 = r24 + 1
            r11 = r31
            r12 = r32
            r15 = r33
            r8 = r23
            r2 = r25
            r3 = r26
            r5 = r27
            r6 = r28
            r9 = r29
            r10 = r30
            r4 = 1
            r7 = 0
            goto L_0x0060
        L_0x00ea:
            r11 = r0
            r28 = r6
            r23 = r8
            r29 = r9
            r30 = r10
            r33 = r15
            r22 = 0
            if (r11 != 0) goto L_0x010a
        L_0x00f9:
            int r6 = r28 + 1
            r11 = r31
            r12 = r32
            r15 = r33
            r8 = r23
            r9 = r29
            r10 = r30
            r7 = 0
            goto L_0x0022
        L_0x010a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            java.lang.String r2 = " declares multiple JSON fields named "
            r1.append(r2)
            java.lang.String r2 = r11.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0126:
            r0 = r10
            r33 = r15
            java.lang.reflect.Type r0 = r0.b
            java.lang.reflect.Type r1 = r33.getGenericSuperclass()
            r2 = r33
            java.lang.reflect.Type r0 = com.google.gson.internal.C$Gson$Types.a(r0, r2, r1)
            fko r10 = defpackage.fko.a(r0)
            java.lang.Class<? super T> r15 = r10.a
            r11 = r31
            r12 = r32
            goto L_0x0017
        L_0x0141:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fke.a(fix, fko, java.lang.Class):java.util.Map");
    }

    private boolean a(Field field, boolean z) {
        boolean z2;
        fjp fjp = this.c;
        Class type = field.getType();
        if (!(fjp.a(type) || fjp.a(type, z))) {
            if ((fjp.c & field.getModifiers()) == 0 && ((fjp.b == -1.0d || fjp.a((fjl) field.getAnnotation(fjl.class), (fjm) field.getAnnotation(fjm.class))) && !field.isSynthetic() && ((fjp.d || !fjp.c(field.getType())) && !fjp.b(field.getType())))) {
                List<fiu> list = z ? fjp.e : fjp.f;
                if (!list.isEmpty()) {
                    new fiv(field);
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((fiu) it.next()).a()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    z2 = true;
                }
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                return true;
            }
        }
        return false;
    }

    public final <T> fjh<T> a(fix fix, fko<T> fko) {
        Class<? super T> cls = fko.a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        return new a(this.a.a(fko), a(fix, fko, cls));
    }
}
