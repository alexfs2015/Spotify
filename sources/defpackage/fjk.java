package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: fjk reason: default package */
public final class fjk implements fio {
    private final fiu a;
    private final fic b;
    private final fiv c;
    private final fjf d;
    private final fjs e = fjs.a();

    /* renamed from: fjk$a */
    public static final class a<T> extends fin<T> {
        private final fiy<T> a;
        private final Map<String, b> b;

        a(fiy<T> fiy, Map<String, b> map) {
            this.a = fiy;
            this.b = map;
        }

        public final T a(fjv fjv) {
            if (fjv.f() == JsonToken.NULL) {
                fjv.k();
                return null;
            }
            T a2 = this.a.a();
            try {
                fjv.c();
                while (fjv.e()) {
                    b bVar = (b) this.b.get(fjv.h());
                    if (bVar != null) {
                        if (bVar.c) {
                            bVar.a(fjv, (Object) a2);
                        }
                    }
                    fjv.o();
                }
                fjv.d();
                return a2;
            } catch (IllegalStateException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public final void a(fjw fjw, T t) {
            if (t == null) {
                fjw.e();
                return;
            }
            fjw.c();
            try {
                for (b bVar : this.b.values()) {
                    if (bVar.a(t)) {
                        fjw.a(bVar.a);
                        bVar.a(fjw, (Object) t);
                    }
                }
                fjw.d();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: fjk$b */
    static abstract class b {
        final String a;
        final boolean b;
        final boolean c;

        /* access modifiers changed from: 0000 */
        public abstract void a(fjv fjv, Object obj);

        /* access modifiers changed from: 0000 */
        public abstract void a(fjw fjw, Object obj);

        /* access modifiers changed from: 0000 */
        public abstract boolean a(Object obj);

        protected b(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }
    }

    public fjk(fiu fiu, fic fic, fiv fiv, fjf fjf) {
        this.a = fiu;
        this.b = fic;
        this.c = fiv;
        this.d = fjf;
    }

    private boolean a(Field field, boolean z) {
        boolean z2;
        fiv fiv = this.c;
        Class type = field.getType();
        if (!(fiv.a(type) || fiv.a(type, z))) {
            if ((fiv.c & field.getModifiers()) == 0 && ((fiv.b == -1.0d || fiv.a((fir) field.getAnnotation(fir.class), (fis) field.getAnnotation(fis.class))) && !field.isSynthetic() && ((fiv.d || !fiv.c(field.getType())) && !fiv.b(field.getType())))) {
                List<fia> list = z ? fiv.e : fiv.f;
                if (!list.isEmpty()) {
                    new fib(field);
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((fia) it.next()).a()) {
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

    private List<String> a(Field field) {
        fiq fiq = (fiq) field.getAnnotation(fiq.class);
        if (fiq == null) {
            return Collections.singletonList(this.b.a(field));
        }
        String a2 = fiq.a();
        String[] b2 = fiq.b();
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
    private java.util.Map<java.lang.String, defpackage.fjk.b> a(defpackage.fid r32, defpackage.fju<?> r33, java.lang.Class r34) {
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
            fjs r1 = r11.e
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
            fju r9 = defpackage.fju.a(r17)
            java.lang.Class<? super T> r4 = r9.a
            boolean r21 = defpackage.fiz.a(r4)
            java.lang.Class<fip> r4 = defpackage.fip.class
            java.lang.annotation.Annotation r4 = r5.getAnnotation(r4)
            fip r4 = (defpackage.fip) r4
            if (r4 == 0) goto L_0x008d
            fiu r7 = r11.a
            fin r4 = defpackage.fjf.a(r7, r12, r9, r4)
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
            fin r4 = r12.a(r9)
        L_0x009a:
            r23 = r4
            fjk$1 r4 = new fjk$1
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
            fjk$b r0 = (defpackage.fjk.b) r0
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
            fju r10 = defpackage.fju.a(r0)
            java.lang.Class<? super T> r15 = r10.a
            r11 = r31
            r12 = r32
            goto L_0x0017
        L_0x0141:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjk.a(fid, fju, java.lang.Class):java.util.Map");
    }

    public final <T> fin<T> a(fid fid, fju<T> fju) {
        Class<? super T> cls = fju.a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        return new a(this.a.a(fju), a(fid, fju, cls));
    }
}
