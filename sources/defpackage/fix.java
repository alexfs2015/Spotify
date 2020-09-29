package defpackage;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.LongSerializationPolicy;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: fix reason: default package */
public final class fix {
    private static final fko<?> a = fko.a(Object.class);
    private final ThreadLocal<Map<fko<?>, a<?>>> b;
    private final Map<fko<?>, fjh<?>> c;
    private final fjo d;
    private final fjz e;
    private List<fji> f;
    private fjp g;
    private fiw h;
    private Map<Type, fiy<?>> i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private String q;
    private int r;
    private int s;
    private LongSerializationPolicy t;
    private List<fji> u;
    private List<fji> v;

    /* renamed from: fix$a */
    static class a<T> extends fjh<T> {
        fjh<T> a;

        a() {
        }

        public final T a(fkp fkp) {
            fjh<T> fjh = this.a;
            if (fjh != null) {
                return fjh.a(fkp);
            }
            throw new IllegalStateException();
        }

        public final void a(fkq fkq, T t) {
            fjh<T> fjh = this.a;
            if (fjh != null) {
                fjh.a(fkq, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public fix() {
        this(fjp.a, FieldNamingPolicy.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, LongSerializationPolicy.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    private fix(fjp fjp, fiw fiw, Map<Type, fiy<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, LongSerializationPolicy longSerializationPolicy, String str, int i2, int i3, List<fji> list, List<fji> list2, List<fji> list3) {
        fjp fjp2 = fjp;
        fiw fiw2 = fiw;
        Map<Type, fiy<?>> map2 = map;
        LongSerializationPolicy longSerializationPolicy2 = longSerializationPolicy;
        this.b = new ThreadLocal<>();
        this.c = new ConcurrentHashMap();
        this.g = fjp2;
        this.h = fiw2;
        this.i = map2;
        this.d = new fjo(map);
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = true;
        this.n = false;
        this.o = false;
        this.p = false;
        this.t = longSerializationPolicy2;
        this.q = null;
        this.r = 2;
        this.s = 2;
        this.u = list;
        this.v = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(fkj.D);
        arrayList.add(fkd.a);
        arrayList.add(fjp);
        arrayList.addAll(list3);
        arrayList.add(fkj.r);
        arrayList.add(fkj.g);
        arrayList.add(fkj.d);
        arrayList.add(fkj.e);
        arrayList.add(fkj.f);
        final fjh r4 = longSerializationPolicy2 == LongSerializationPolicy.DEFAULT ? fkj.k : new fjh<Number>() {
            public final /* synthetic */ Object a(fkp fkp) {
                if (fkp.f() != JsonToken.NULL) {
                    return Long.valueOf(fkp.m());
                }
                fkp.k();
                return null;
            }

            public final /* synthetic */ void a(fkq fkq, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    fkq.e();
                } else {
                    fkq.b(number.toString());
                }
            }
        };
        arrayList.add(fkj.a(Long.TYPE, Long.class, r4));
        arrayList.add(fkj.a(Double.TYPE, Double.class, new fjh<Number>() {
            public final /* synthetic */ Object a(fkp fkp) {
                if (fkp.f() != JsonToken.NULL) {
                    return Double.valueOf(fkp.l());
                }
                fkp.k();
                return null;
            }

            public final /* synthetic */ void a(fkq fkq, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    fkq.e();
                    return;
                }
                fix.a(number.doubleValue());
                fkq.a(number);
            }
        }));
        arrayList.add(fkj.a(Float.TYPE, Float.class, new fjh<Number>() {
            public final /* synthetic */ Object a(fkp fkp) {
                if (fkp.f() != JsonToken.NULL) {
                    return Float.valueOf((float) fkp.l());
                }
                fkp.k();
                return null;
            }

            public final /* synthetic */ void a(fkq fkq, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    fkq.e();
                    return;
                }
                fix.a((double) number.floatValue());
                fkq.a(number);
            }
        }));
        arrayList.add(fkj.n);
        arrayList.add(fkj.h);
        arrayList.add(fkj.i);
        arrayList.add(fkj.a(AtomicLong.class, new fjh<AtomicLong>() {
            public final /* synthetic */ Object a(fkp fkp) {
                return new AtomicLong(((Number) r4.a(fkp)).longValue());
            }

            public final /* synthetic */ void a(fkq fkq, Object obj) {
                r4.a(fkq, Long.valueOf(((AtomicLong) obj).get()));
            }
        }.a()));
        arrayList.add(fkj.a(AtomicLongArray.class, new fjh<AtomicLongArray>() {
            public final /* synthetic */ Object a(fkp fkp) {
                ArrayList arrayList = new ArrayList();
                fkp.a();
                while (fkp.e()) {
                    arrayList.add(Long.valueOf(((Number) r4.a(fkp)).longValue()));
                }
                fkp.b();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }

            public final /* synthetic */ void a(fkq fkq, Object obj) {
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                fkq.a();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    r4.a(fkq, Long.valueOf(atomicLongArray.get(i)));
                }
                fkq.b();
            }
        }.a()));
        arrayList.add(fkj.j);
        arrayList.add(fkj.o);
        arrayList.add(fkj.s);
        arrayList.add(fkj.t);
        arrayList.add(fkj.a(BigDecimal.class, fkj.p));
        arrayList.add(fkj.a(BigInteger.class, fkj.q));
        arrayList.add(fkj.u);
        arrayList.add(fkj.v);
        arrayList.add(fkj.x);
        arrayList.add(fkj.y);
        arrayList.add(fkj.B);
        arrayList.add(fkj.w);
        arrayList.add(fkj.b);
        arrayList.add(fjy.a);
        arrayList.add(fkj.A);
        arrayList.add(fkg.a);
        arrayList.add(fkf.a);
        arrayList.add(fkj.z);
        arrayList.add(fjw.a);
        arrayList.add(fkj.a);
        arrayList.add(new fjx(this.d));
        arrayList.add(new fkc(this.d, false));
        this.e = new fjz(this.d);
        arrayList.add(this.e);
        arrayList.add(fkj.E);
        arrayList.add(new fke(this.d, fiw, fjp, this.e));
        this.f = Collections.unmodifiableList(arrayList);
    }

    private fkp a(Reader reader) {
        fkp fkp = new fkp(reader);
        fkp.a = this.o;
        return fkp;
    }

    private <T> T a(fkp fkp, Type type) {
        boolean z = fkp.a;
        fkp.a = true;
        try {
            fkp.f();
            T a2 = a(fko.a(type)).a(fkp);
            fkp.a = z;
            return a2;
        } catch (EOFException e2) {
            if (1 != 0) {
                fkp.a = z;
                return null;
            }
            throw new JsonSyntaxException((Throwable) e2);
        } catch (IllegalStateException e3) {
            throw new JsonSyntaxException((Throwable) e3);
        } catch (IOException e4) {
            throw new JsonSyntaxException((Throwable) e4);
        } catch (AssertionError e5) {
            StringBuilder sb = new StringBuilder("AssertionError (GSON 2.8.5): ");
            sb.append(e5.getMessage());
            throw new AssertionError(sb.toString(), e5);
        } catch (Throwable th) {
            fkp.a = z;
            throw th;
        }
    }

    private <T> T a(Reader reader, Type type) {
        fkp a2 = a(reader);
        T a3 = a(a2, type);
        a((Object) a3, a2);
        return a3;
    }

    static void a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(d2);
            sb.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private static void a(Object obj, fkp fkp) {
        if (obj != null) {
            try {
                if (fkp.f() != JsonToken.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            } catch (IOException e3) {
                throw new JsonIOException((Throwable) e3);
            }
        }
    }

    public final <T> fjh<T> a(fji fji, fko<T> fko) {
        if (!this.f.contains(fji)) {
            fji = this.e;
        }
        boolean z = false;
        for (fji fji2 : this.f) {
            if (z) {
                fjh<T> a2 = fji2.a(this, fko);
                if (a2 != null) {
                    return a2;
                }
            } else if (fji2 == fji) {
                z = true;
            }
        }
        StringBuilder sb = new StringBuilder("GSON cannot serialize ");
        sb.append(fko);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=fko<T>, code=fko, for r6v0, types: [fko<T>, java.lang.Object, fko] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> defpackage.fjh<T> a(defpackage.fko r6) {
        /*
            r5 = this;
            java.util.Map<fko<?>, fjh<?>> r0 = r5.c
            if (r6 != 0) goto L_0x0007
            fko<?> r1 = a
            goto L_0x0008
        L_0x0007:
            r1 = r6
        L_0x0008:
            java.lang.Object r0 = r0.get(r1)
            fjh r0 = (defpackage.fjh) r0
            if (r0 == 0) goto L_0x0011
            return r0
        L_0x0011:
            java.lang.ThreadLocal<java.util.Map<fko<?>, fix$a<?>>> r0 = r5.b
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            r1 = 0
            if (r0 != 0) goto L_0x0027
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal<java.util.Map<fko<?>, fix$a<?>>> r1 = r5.b
            r1.set(r0)
            r1 = 1
        L_0x0027:
            java.lang.Object r2 = r0.get(r6)
            fix$a r2 = (defpackage.fix.a) r2
            if (r2 == 0) goto L_0x0030
            return r2
        L_0x0030:
            fix$a r2 = new fix$a     // Catch:{ all -> 0x0080 }
            r2.<init>()     // Catch:{ all -> 0x0080 }
            r0.put(r6, r2)     // Catch:{ all -> 0x0080 }
            java.util.List<fji> r3 = r5.f     // Catch:{ all -> 0x0080 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0080 }
        L_0x003e:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0080 }
            if (r4 == 0) goto L_0x006c
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0080 }
            fji r4 = (defpackage.fji) r4     // Catch:{ all -> 0x0080 }
            fjh r4 = r4.a(r5, r6)     // Catch:{ all -> 0x0080 }
            if (r4 == 0) goto L_0x003e
            fjh<T> r3 = r2.a     // Catch:{ all -> 0x0080 }
            if (r3 != 0) goto L_0x0066
            r2.a = r4     // Catch:{ all -> 0x0080 }
            java.util.Map<fko<?>, fjh<?>> r2 = r5.c     // Catch:{ all -> 0x0080 }
            r2.put(r6, r4)     // Catch:{ all -> 0x0080 }
            r0.remove(r6)
            if (r1 == 0) goto L_0x0065
            java.lang.ThreadLocal<java.util.Map<fko<?>, fix$a<?>>> r6 = r5.b
            r6.remove()
        L_0x0065:
            return r4
        L_0x0066:
            java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch:{ all -> 0x0080 }
            r2.<init>()     // Catch:{ all -> 0x0080 }
            throw r2     // Catch:{ all -> 0x0080 }
        L_0x006c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0080 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0080 }
            java.lang.String r4 = "GSON (2.8.5) cannot handle "
            r3.<init>(r4)     // Catch:{ all -> 0x0080 }
            r3.append(r6)     // Catch:{ all -> 0x0080 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0080 }
            r2.<init>(r3)     // Catch:{ all -> 0x0080 }
            throw r2     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r2 = move-exception
            r0.remove(r6)
            if (r1 == 0) goto L_0x008b
            java.lang.ThreadLocal<java.util.Map<fko<?>, fix$a<?>>> r6 = r5.b
            r6.remove()
        L_0x008b:
            goto L_0x008d
        L_0x008c:
            throw r2
        L_0x008d:
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fix.a(fko):fjh");
    }

    public final <T> fjh<T> a(Class<T> cls) {
        return a(fko.a(cls));
    }

    public final <T> T a(String str, Type type) {
        if (str == null) {
            return null;
        }
        return a((Reader) new StringReader(str), type);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{serializeNulls:");
        sb.append(this.j);
        sb.append(",factories:");
        sb.append(this.f);
        sb.append(",instanceCreators:");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
