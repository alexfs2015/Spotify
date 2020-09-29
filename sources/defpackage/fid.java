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

/* renamed from: fid reason: default package */
public final class fid {
    private static final fju<?> a = fju.a(Object.class);
    private final ThreadLocal<Map<fju<?>, a<?>>> b;
    private final Map<fju<?>, fin<?>> c;
    private final fiu d;
    private final fjf e;
    private List<fio> f;
    private fiv g;
    private fic h;
    private Map<Type, fie<?>> i;
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
    private List<fio> u;
    private List<fio> v;

    /* renamed from: fid$a */
    static class a<T> extends fin<T> {
        fin<T> a;

        a() {
        }

        public final T a(fjv fjv) {
            fin<T> fin = this.a;
            if (fin != null) {
                return fin.a(fjv);
            }
            throw new IllegalStateException();
        }

        public final void a(fjw fjw, T t) {
            fin<T> fin = this.a;
            if (fin != null) {
                fin.a(fjw, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public fid() {
        this(fiv.a, FieldNamingPolicy.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, LongSerializationPolicy.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    private fid(fiv fiv, fic fic, Map<Type, fie<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, LongSerializationPolicy longSerializationPolicy, String str, int i2, int i3, List<fio> list, List<fio> list2, List<fio> list3) {
        final fin fin;
        fiv fiv2 = fiv;
        fic fic2 = fic;
        Map<Type, fie<?>> map2 = map;
        LongSerializationPolicy longSerializationPolicy2 = longSerializationPolicy;
        this.b = new ThreadLocal<>();
        this.c = new ConcurrentHashMap();
        this.g = fiv2;
        this.h = fic2;
        this.i = map2;
        this.d = new fiu(map);
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
        arrayList.add(fjp.D);
        arrayList.add(fjj.a);
        arrayList.add(fiv);
        arrayList.addAll(list3);
        arrayList.add(fjp.r);
        arrayList.add(fjp.g);
        arrayList.add(fjp.d);
        arrayList.add(fjp.e);
        arrayList.add(fjp.f);
        if (longSerializationPolicy2 == LongSerializationPolicy.DEFAULT) {
            fin = fjp.k;
        } else {
            fin = new fin<Number>() {
                public final /* synthetic */ void a(fjw fjw, Object obj) {
                    Number number = (Number) obj;
                    if (number == null) {
                        fjw.e();
                    } else {
                        fjw.b(number.toString());
                    }
                }

                public final /* synthetic */ Object a(fjv fjv) {
                    if (fjv.f() != JsonToken.NULL) {
                        return Long.valueOf(fjv.m());
                    }
                    fjv.k();
                    return null;
                }
            };
        }
        arrayList.add(fjp.a(Long.TYPE, Long.class, fin));
        arrayList.add(fjp.a(Double.TYPE, Double.class, new fin<Number>() {
            public final /* synthetic */ void a(fjw fjw, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    fjw.e();
                    return;
                }
                fid.a(number.doubleValue());
                fjw.a(number);
            }

            public final /* synthetic */ Object a(fjv fjv) {
                if (fjv.f() != JsonToken.NULL) {
                    return Double.valueOf(fjv.l());
                }
                fjv.k();
                return null;
            }
        }));
        arrayList.add(fjp.a(Float.TYPE, Float.class, new fin<Number>() {
            public final /* synthetic */ void a(fjw fjw, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    fjw.e();
                    return;
                }
                fid.a((double) number.floatValue());
                fjw.a(number);
            }

            public final /* synthetic */ Object a(fjv fjv) {
                if (fjv.f() != JsonToken.NULL) {
                    return Float.valueOf((float) fjv.l());
                }
                fjv.k();
                return null;
            }
        }));
        arrayList.add(fjp.n);
        arrayList.add(fjp.h);
        arrayList.add(fjp.i);
        arrayList.add(fjp.a(AtomicLong.class, new fin<AtomicLong>() {
            public final /* synthetic */ void a(fjw fjw, Object obj) {
                fin.a(fjw, Long.valueOf(((AtomicLong) obj).get()));
            }

            public final /* synthetic */ Object a(fjv fjv) {
                return new AtomicLong(((Number) fin.a(fjv)).longValue());
            }
        }.a()));
        arrayList.add(fjp.a(AtomicLongArray.class, new fin<AtomicLongArray>() {
            public final /* synthetic */ void a(fjw fjw, Object obj) {
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                fjw.a();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    fin.a(fjw, Long.valueOf(atomicLongArray.get(i)));
                }
                fjw.b();
            }

            public final /* synthetic */ Object a(fjv fjv) {
                ArrayList arrayList = new ArrayList();
                fjv.a();
                while (fjv.e()) {
                    arrayList.add(Long.valueOf(((Number) fin.a(fjv)).longValue()));
                }
                fjv.b();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }
        }.a()));
        arrayList.add(fjp.j);
        arrayList.add(fjp.o);
        arrayList.add(fjp.s);
        arrayList.add(fjp.t);
        arrayList.add(fjp.a(BigDecimal.class, fjp.p));
        arrayList.add(fjp.a(BigInteger.class, fjp.q));
        arrayList.add(fjp.u);
        arrayList.add(fjp.v);
        arrayList.add(fjp.x);
        arrayList.add(fjp.y);
        arrayList.add(fjp.B);
        arrayList.add(fjp.w);
        arrayList.add(fjp.b);
        arrayList.add(fje.a);
        arrayList.add(fjp.A);
        arrayList.add(fjm.a);
        arrayList.add(fjl.a);
        arrayList.add(fjp.z);
        arrayList.add(fjc.a);
        arrayList.add(fjp.a);
        arrayList.add(new fjd(this.d));
        arrayList.add(new fji(this.d, false));
        this.e = new fjf(this.d);
        arrayList.add(this.e);
        arrayList.add(fjp.E);
        arrayList.add(new fjk(this.d, fic, fiv, this.e));
        this.f = Collections.unmodifiableList(arrayList);
    }

    static void a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(d2);
            sb.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=fju<T>, code=fju, for r6v0, types: [fju, java.lang.Object, fju<T>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> defpackage.fin<T> a(defpackage.fju r6) {
        /*
            r5 = this;
            java.util.Map<fju<?>, fin<?>> r0 = r5.c
            if (r6 != 0) goto L_0x0007
            fju<?> r1 = a
            goto L_0x0008
        L_0x0007:
            r1 = r6
        L_0x0008:
            java.lang.Object r0 = r0.get(r1)
            fin r0 = (defpackage.fin) r0
            if (r0 == 0) goto L_0x0011
            return r0
        L_0x0011:
            java.lang.ThreadLocal<java.util.Map<fju<?>, fid$a<?>>> r0 = r5.b
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            r1 = 0
            if (r0 != 0) goto L_0x0027
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal<java.util.Map<fju<?>, fid$a<?>>> r1 = r5.b
            r1.set(r0)
            r1 = 1
        L_0x0027:
            java.lang.Object r2 = r0.get(r6)
            fid$a r2 = (defpackage.fid.a) r2
            if (r2 == 0) goto L_0x0030
            return r2
        L_0x0030:
            fid$a r2 = new fid$a     // Catch:{ all -> 0x0080 }
            r2.<init>()     // Catch:{ all -> 0x0080 }
            r0.put(r6, r2)     // Catch:{ all -> 0x0080 }
            java.util.List<fio> r3 = r5.f     // Catch:{ all -> 0x0080 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0080 }
        L_0x003e:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0080 }
            if (r4 == 0) goto L_0x006c
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0080 }
            fio r4 = (defpackage.fio) r4     // Catch:{ all -> 0x0080 }
            fin r4 = r4.a(r5, r6)     // Catch:{ all -> 0x0080 }
            if (r4 == 0) goto L_0x003e
            fin<T> r3 = r2.a     // Catch:{ all -> 0x0080 }
            if (r3 != 0) goto L_0x0066
            r2.a = r4     // Catch:{ all -> 0x0080 }
            java.util.Map<fju<?>, fin<?>> r2 = r5.c     // Catch:{ all -> 0x0080 }
            r2.put(r6, r4)     // Catch:{ all -> 0x0080 }
            r0.remove(r6)
            if (r1 == 0) goto L_0x0065
            java.lang.ThreadLocal<java.util.Map<fju<?>, fid$a<?>>> r6 = r5.b
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
            java.lang.ThreadLocal<java.util.Map<fju<?>, fid$a<?>>> r6 = r5.b
            r6.remove()
        L_0x008b:
            goto L_0x008d
        L_0x008c:
            throw r2
        L_0x008d:
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fid.a(fju):fin");
    }

    public final <T> fin<T> a(fio fio, fju<T> fju) {
        if (!this.f.contains(fio)) {
            fio = this.e;
        }
        boolean z = false;
        for (fio fio2 : this.f) {
            if (z) {
                fin<T> a2 = fio2.a(this, fju);
                if (a2 != null) {
                    return a2;
                }
            } else if (fio2 == fio) {
                z = true;
            }
        }
        StringBuilder sb = new StringBuilder("GSON cannot serialize ");
        sb.append(fju);
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> fin<T> a(Class<T> cls) {
        return a(fju.a(cls));
    }

    private fjv a(Reader reader) {
        fjv fjv = new fjv(reader);
        fjv.a = this.o;
        return fjv;
    }

    public final <T> T a(String str, Type type) {
        if (str == null) {
            return null;
        }
        return a((Reader) new StringReader(str), type);
    }

    private <T> T a(Reader reader, Type type) {
        fjv a2 = a(reader);
        T a3 = a(a2, type);
        a((Object) a3, a2);
        return a3;
    }

    private static void a(Object obj, fjv fjv) {
        if (obj != null) {
            try {
                if (fjv.f() != JsonToken.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            } catch (IOException e3) {
                throw new JsonIOException((Throwable) e3);
            }
        }
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

    private <T> T a(fjv fjv, Type type) {
        boolean z = fjv.a;
        fjv.a = true;
        try {
            fjv.f();
            T a2 = a(fju.a(type)).a(fjv);
            fjv.a = z;
            return a2;
        } catch (EOFException e2) {
            if (1 != 0) {
                fjv.a = z;
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
            fjv.a = z;
            throw th;
        }
    }
}
