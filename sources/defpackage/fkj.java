package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonToken;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: fkj reason: default package */
public final class fkj {
    public static final fji A;
    public static final fji B = a(Locale.class, Z);
    public static final fjh<fjb> C = new fjh<fjb>() {
        /* access modifiers changed from: private */
        public void a(fkq fkq, fjb fjb) {
            if (fjb == null || (fjb instanceof fjc)) {
                fkq.e();
            } else if (fjb instanceof fjf) {
                fjf h = fjb.h();
                if (h.a instanceof Number) {
                    fkq.a(h.a());
                } else if (h.a instanceof Boolean) {
                    fkq.a(h.f());
                } else {
                    fkq.b(h.b());
                }
            } else {
                boolean z = fjb instanceof fiz;
                if (z) {
                    fkq.a();
                    if (z) {
                        Iterator it = ((fiz) fjb).iterator();
                        while (it.hasNext()) {
                            a(fkq, (fjb) it.next());
                        }
                        fkq.b();
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Not a JSON Array: ");
                    sb.append(fjb);
                    throw new IllegalStateException(sb.toString());
                } else if (fjb instanceof fjd) {
                    fkq.c();
                    for (Entry entry : fjb.g().a.entrySet()) {
                        fkq.a((String) entry.getKey());
                        a(fkq, (fjb) entry.getValue());
                    }
                    fkq.d();
                } else {
                    StringBuilder sb2 = new StringBuilder("Couldn't write ");
                    sb2.append(fjb.getClass());
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public fjb a(fkp fkp) {
            switch (AnonymousClass29.a[fkp.f().ordinal()]) {
                case 1:
                    return new fjf((Number) new LazilyParsedNumber(fkp.i()));
                case 2:
                    return new fjf(Boolean.valueOf(fkp.j()));
                case 3:
                    return new fjf(fkp.i());
                case 4:
                    fkp.k();
                    return fjc.a;
                case 5:
                    fiz fiz = new fiz();
                    fkp.a();
                    while (fkp.e()) {
                        fiz.a(a(fkp));
                    }
                    fkp.b();
                    return fiz;
                case 6:
                    fjd fjd = new fjd();
                    fkp.c();
                    while (fkp.e()) {
                        fjd.a(fkp.h(), a(fkp));
                    }
                    fkp.d();
                    return fjd;
                default:
                    throw new IllegalArgumentException();
            }
        }
    };
    public static final fji D = b(fjb.class, C);
    public static final fji E = new fji() {
        public final <T> fjh<T> a(fix fix, fko<T> fko) {
            Class<? super T> cls = fko.a;
            if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
                return null;
            }
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new a(cls);
        }
    };
    private static fjh<Class> F = new fjh<Class>() {
        public final /* synthetic */ Object a(fkp fkp) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        public final /* synthetic */ void a(fkq fkq, Object obj) {
            Class cls = (Class) obj;
            StringBuilder sb = new StringBuilder("Attempted to serialize java.lang.Class: ");
            sb.append(cls.getName());
            sb.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(sb.toString());
        }
    }.a();
    private static fjh<BitSet> G = new fjh<BitSet>() {
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
            if (r7.n() != 0) goto L_0x0063;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0068 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.util.BitSet b(defpackage.fkp r7) {
            /*
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r7.a()
                com.google.gson.stream.JsonToken r1 = r7.f()
                r2 = 0
                r3 = 0
            L_0x000e:
                com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.END_ARRAY
                if (r1 == r4) goto L_0x006f
                int[] r4 = defpackage.fkj.AnonymousClass29.a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L_0x005d
                r6 = 2
                if (r4 == r6) goto L_0x0058
                r6 = 3
                if (r4 != r6) goto L_0x0044
                java.lang.String r1 = r7.i()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0030 }
                if (r1 == 0) goto L_0x002e
                goto L_0x0063
            L_0x002e:
                r5 = 0
                goto L_0x0063
            L_0x0030:
                com.google.gson.JsonSyntaxException r7 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.<init>(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>(r0)
                throw r7
            L_0x0044:
                com.google.gson.JsonSyntaxException r7 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "Invalid bitset value type: "
                r0.<init>(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>(r0)
                throw r7
            L_0x0058:
                boolean r5 = r7.j()
                goto L_0x0063
            L_0x005d:
                int r1 = r7.n()
                if (r1 == 0) goto L_0x002e
            L_0x0063:
                if (r5 == 0) goto L_0x0068
                r0.set(r3)
            L_0x0068:
                int r3 = r3 + 1
                com.google.gson.stream.JsonToken r1 = r7.f()
                goto L_0x000e
            L_0x006f:
                r7.b()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.fkj.AnonymousClass12.b(fkp):java.util.BitSet");
        }

        public final /* synthetic */ Object a(fkp fkp) {
            return b(fkp);
        }

        public final /* synthetic */ void a(fkq fkq, Object obj) {
            BitSet bitSet = (BitSet) obj;
            fkq.a();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                fkq.a(bitSet.get(i) ? 1 : 0);
            }
            fkq.b();
        }
    }.a();
    private static fjh<Boolean> H = new fjh<Boolean>() {
        public final /* synthetic */ Object a(fkp fkp) {
            JsonToken f = fkp.f();
            if (f != JsonToken.NULL) {
                return f == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(fkp.i())) : Boolean.valueOf(fkp.j());
            }
            fkp.k();
            return null;
        }

        public final /* bridge */ /* synthetic */ void a(fkq fkq, Object obj) {
            fkq.a((Boolean) obj);
        }
    };
    private static fjh<Number> I = new fjh<Number>() {
        private static Number b(fkp fkp) {
            if (fkp.f() == JsonToken.NULL) {
                fkp.k();
                return null;
            }
            try {
                return Byte.valueOf((byte) fkp.n());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        public final /* synthetic */ Object a(fkp fkp) {
            return b(fkp);
        }

        public final /* bridge */ /* synthetic */ void a(fkq fkq, Object obj) {
            fkq.a((Number) obj);
        }
    };
    private static fjh<Number> J = new fjh<Number>() {
        private static Number b(fkp fkp) {
            if (fkp.f() == JsonToken.NULL) {
                fkp.k();
                return null;
            }
            try {
                return Short.valueOf((short) fkp.n());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        public final /* synthetic */ Object a(fkp fkp) {
            return b(fkp);
        }

        public final /* bridge */ /* synthetic */ void a(fkq fkq, Object obj) {
            fkq.a((Number) obj);
        }
    };
    private static fjh<Number> K = new fjh<Number>() {
        private static Number b(fkp fkp) {
            if (fkp.f() == JsonToken.NULL) {
                fkp.k();
                return null;
            }
            try {
                return Integer.valueOf(fkp.n());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        public final /* synthetic */ Object a(fkp fkp) {
            return b(fkp);
        }

        public final /* bridge */ /* synthetic */ void a(fkq fkq, Object obj) {
            fkq.a((Number) obj);
        }
    };
    private static fjh<AtomicInteger> L = new fjh<AtomicInteger>() {
        private static AtomicInteger b(fkp fkp) {
            try {
                return new AtomicInteger(fkp.n());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        public final /* synthetic */ Object a(fkp fkp) {
            return b(fkp);
        }

        public final /* synthetic */ void a(fkq fkq, Object obj) {
            fkq.a((long) ((AtomicInteger) obj).get());
        }
    }.a();
    private static fjh<AtomicBoolean> M = new fjh<AtomicBoolean>() {
        public final /* synthetic */ Object a(fkp fkp) {
            return new AtomicBoolean(fkp.j());
        }

        public final /* synthetic */ void a(fkq fkq, Object obj) {
            fkq.a(((AtomicBoolean) obj).get());
        }
    }.a();
    private static fjh<AtomicIntegerArray> N = new fjh<AtomicIntegerArray>() {
        private static AtomicIntegerArray b(fkp fkp) {
            ArrayList arrayList = new ArrayList();
            fkp.a();
            while (fkp.e()) {
                try {
                    arrayList.add(Integer.valueOf(fkp.n()));
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }
            fkp.b();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        public final /* synthetic */ Object a(fkp fkp) {
            return b(fkp);
        }

        public final /* synthetic */ void a(fkq fkq, Object obj) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            fkq.a();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                fkq.a((long) atomicIntegerArray.get(i));
            }
            fkq.b();
        }
    }.a();
    private static fjh<Number> O = new fjh<Number>() {
        public final /* synthetic */ Object a(fkp fkp) {
            JsonToken f = fkp.f();
            int i = AnonymousClass29.a[f.ordinal()];
            if (i == 1 || i == 3) {
                return new LazilyParsedNumber(fkp.i());
            }
            if (i == 4) {
                fkp.k();
                return null;
            }
            StringBuilder sb = new StringBuilder("Expecting number, got: ");
            sb.append(f);
            throw new JsonSyntaxException(sb.toString());
        }

        public final /* bridge */ /* synthetic */ void a(fkq fkq, Object obj) {
            fkq.a((Number) obj);
        }
    };
    private static fjh<Character> P = new fjh<Character>() {
        public final /* synthetic */ Object a(fkp fkp) {
            if (fkp.f() == JsonToken.NULL) {
                fkp.k();
                return null;
            }
            String i = fkp.i();
            if (i.length() == 1) {
                return Character.valueOf(i.charAt(0));
            }
            StringBuilder sb = new StringBuilder("Expecting character, got: ");
            sb.append(i);
            throw new JsonSyntaxException(sb.toString());
        }

        public final /* synthetic */ void a(fkq fkq, Object obj) {
            Character ch = (Character) obj;
            fkq.b(ch == null ? null : String.valueOf(ch));
        }
    };
    private static fjh<String> Q = new fjh<String>() {
        public final /* synthetic */ Object a(fkp fkp) {
            JsonToken f = fkp.f();
            if (f != JsonToken.NULL) {
                return f == JsonToken.BOOLEAN ? Boolean.toString(fkp.j()) : fkp.i();
            }
            fkp.k();
            return null;
        }

        public final /* synthetic */ void a(fkq fkq, Object obj) {
            fkq.b((String) obj);
        }
    };
    private static fjh<StringBuilder> R = new fjh<StringBuilder>() {
        public final /* synthetic */ Object a(fkp fkp) {
            if (fkp.f() != JsonToken.NULL) {
                return new StringBuilder(fkp.i());
            }
            fkp.k();
            return null;
        }

        public final /* synthetic */ void a(fkq fkq, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            fkq.b(sb == null ? null : sb.toString());
        }
    };
    private static fjh<StringBuffer> S = new fjh<StringBuffer>() {
        public final /* synthetic */ Object a(fkp fkp) {
            if (fkp.f() != JsonToken.NULL) {
                return new StringBuffer(fkp.i());
            }
            fkp.k();
            return null;
        }

        public final /* synthetic */ void a(fkq fkq, Object obj) {
            StringBuffer stringBuffer = (StringBuffer) obj;
            fkq.b(stringBuffer == null ? null : stringBuffer.toString());
        }
    };
    private static fjh<URL> T = new fjh<URL>() {
        public final /* synthetic */ Object a(fkp fkp) {
            if (fkp.f() == JsonToken.NULL) {
                fkp.k();
                return null;
            }
            String i = fkp.i();
            if ("null".equals(i)) {
                return null;
            }
            return new URL(i);
        }

        public final /* synthetic */ void a(fkq fkq, Object obj) {
            URL url = (URL) obj;
            fkq.b(url == null ? null : url.toExternalForm());
        }
    };
    private static fjh<URI> U = new fjh<URI>() {
        private static URI b(fkp fkp) {
            if (fkp.f() == JsonToken.NULL) {
                fkp.k();
                return null;
            }
            try {
                String i = fkp.i();
                if ("null".equals(i)) {
                    return null;
                }
                return new URI(i);
            } catch (URISyntaxException e) {
                throw new JsonIOException((Throwable) e);
            }
        }

        public final /* synthetic */ Object a(fkp fkp) {
            return b(fkp);
        }

        public final /* synthetic */ void a(fkq fkq, Object obj) {
            URI uri = (URI) obj;
            fkq.b(uri == null ? null : uri.toASCIIString());
        }
    };
    private static fjh<InetAddress> V = new fjh<InetAddress>() {
        public final /* synthetic */ Object a(fkp fkp) {
            if (fkp.f() != JsonToken.NULL) {
                return InetAddress.getByName(fkp.i());
            }
            fkp.k();
            return null;
        }

        public final /* synthetic */ void a(fkq fkq, Object obj) {
            InetAddress inetAddress = (InetAddress) obj;
            fkq.b(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    };
    private static fjh<UUID> W = new fjh<UUID>() {
        public final /* synthetic */ Object a(fkp fkp) {
            if (fkp.f() != JsonToken.NULL) {
                return UUID.fromString(fkp.i());
            }
            fkp.k();
            return null;
        }

        public final /* synthetic */ void a(fkq fkq, Object obj) {
            UUID uuid = (UUID) obj;
            fkq.b(uuid == null ? null : uuid.toString());
        }
    };
    private static fjh<Currency> X = new fjh<Currency>() {
        public final /* synthetic */ Object a(fkp fkp) {
            return Currency.getInstance(fkp.i());
        }

        public final /* synthetic */ void a(fkq fkq, Object obj) {
            fkq.b(((Currency) obj).getCurrencyCode());
        }
    }.a();
    private static fjh<Calendar> Y = new fjh<Calendar>() {
        public final /* synthetic */ Object a(fkp fkp) {
            if (fkp.f() == JsonToken.NULL) {
                fkp.k();
                return null;
            }
            fkp.c();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (fkp.f() != JsonToken.END_OBJECT) {
                String h = fkp.h();
                int n = fkp.n();
                if ("year".equals(h)) {
                    i = n;
                } else if ("month".equals(h)) {
                    i2 = n;
                } else if ("dayOfMonth".equals(h)) {
                    i3 = n;
                } else if ("hourOfDay".equals(h)) {
                    i4 = n;
                } else if ("minute".equals(h)) {
                    i5 = n;
                } else if ("second".equals(h)) {
                    i6 = n;
                }
            }
            fkp.d();
            GregorianCalendar gregorianCalendar = new GregorianCalendar(i, i2, i3, i4, i5, i6);
            return gregorianCalendar;
        }

        public final /* synthetic */ void a(fkq fkq, Object obj) {
            Calendar calendar = (Calendar) obj;
            if (calendar == null) {
                fkq.e();
                return;
            }
            fkq.c();
            fkq.a("year");
            fkq.a((long) calendar.get(1));
            fkq.a("month");
            fkq.a((long) calendar.get(2));
            fkq.a("dayOfMonth");
            fkq.a((long) calendar.get(5));
            fkq.a("hourOfDay");
            fkq.a((long) calendar.get(11));
            fkq.a("minute");
            fkq.a((long) calendar.get(12));
            fkq.a("second");
            fkq.a((long) calendar.get(13));
            fkq.d();
        }
    };
    private static fjh<Locale> Z = new fjh<Locale>() {
        public final /* synthetic */ Object a(fkp fkp) {
            String str = null;
            if (fkp.f() == JsonToken.NULL) {
                fkp.k();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(fkp.i(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            return (nextToken2 == null && str == null) ? new Locale(nextToken) : str == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, str);
        }

        public final /* synthetic */ void a(fkq fkq, Object obj) {
            Locale locale = (Locale) obj;
            fkq.b(locale == null ? null : locale.toString());
        }
    };
    public static final fji a = a(Class.class, F);
    public static final fji b = a(BitSet.class, G);
    public static final fjh<Boolean> c = new fjh<Boolean>() {
        public final /* synthetic */ Object a(fkp fkp) {
            if (fkp.f() != JsonToken.NULL) {
                return Boolean.valueOf(fkp.i());
            }
            fkp.k();
            return null;
        }

        public final /* synthetic */ void a(fkq fkq, Object obj) {
            Boolean bool = (Boolean) obj;
            fkq.b(bool == null ? "null" : bool.toString());
        }
    };
    public static final fji d = a(Boolean.TYPE, Boolean.class, H);
    public static final fji e = a(Byte.TYPE, Byte.class, I);
    public static final fji f = a(Short.TYPE, Short.class, J);
    public static final fji g = a(Integer.TYPE, Integer.class, K);
    public static final fji h = a(AtomicInteger.class, L);
    public static final fji i = a(AtomicBoolean.class, M);
    public static final fji j = a(AtomicIntegerArray.class, N);
    public static final fjh<Number> k = new fjh<Number>() {
        private static Number b(fkp fkp) {
            if (fkp.f() == JsonToken.NULL) {
                fkp.k();
                return null;
            }
            try {
                return Long.valueOf(fkp.m());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        public final /* synthetic */ Object a(fkp fkp) {
            return b(fkp);
        }

        public final /* bridge */ /* synthetic */ void a(fkq fkq, Object obj) {
            fkq.a((Number) obj);
        }
    };
    public static final fjh<Number> l = new fjh<Number>() {
        public final /* synthetic */ Object a(fkp fkp) {
            if (fkp.f() != JsonToken.NULL) {
                return Float.valueOf((float) fkp.l());
            }
            fkp.k();
            return null;
        }

        public final /* bridge */ /* synthetic */ void a(fkq fkq, Object obj) {
            fkq.a((Number) obj);
        }
    };
    public static final fjh<Number> m = new fjh<Number>() {
        public final /* synthetic */ Object a(fkp fkp) {
            if (fkp.f() != JsonToken.NULL) {
                return Double.valueOf(fkp.l());
            }
            fkp.k();
            return null;
        }

        public final /* bridge */ /* synthetic */ void a(fkq fkq, Object obj) {
            fkq.a((Number) obj);
        }
    };
    public static final fji n = a(Number.class, O);
    public static final fji o = a(Character.TYPE, Character.class, P);
    public static final fjh<BigDecimal> p = new fjh<BigDecimal>() {
        private static BigDecimal b(fkp fkp) {
            if (fkp.f() == JsonToken.NULL) {
                fkp.k();
                return null;
            }
            try {
                return new BigDecimal(fkp.i());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        public final /* synthetic */ Object a(fkp fkp) {
            return b(fkp);
        }

        public final /* bridge */ /* synthetic */ void a(fkq fkq, Object obj) {
            fkq.a((Number) (BigDecimal) obj);
        }
    };
    public static final fjh<BigInteger> q = new fjh<BigInteger>() {
        private static BigInteger b(fkp fkp) {
            if (fkp.f() == JsonToken.NULL) {
                fkp.k();
                return null;
            }
            try {
                return new BigInteger(fkp.i());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        public final /* synthetic */ Object a(fkp fkp) {
            return b(fkp);
        }

        public final /* bridge */ /* synthetic */ void a(fkq fkq, Object obj) {
            fkq.a((Number) (BigInteger) obj);
        }
    };
    public static final fji r = a(String.class, Q);
    public static final fji s = a(StringBuilder.class, R);
    public static final fji t = a(StringBuffer.class, S);
    public static final fji u = a(URL.class, T);
    public static final fji v = a(URI.class, U);
    public static final fji w = b(InetAddress.class, V);
    public static final fji x = a(UUID.class, W);
    public static final fji y = a(Currency.class, X);
    public static final fji z = new fji() {
        public final <T> fjh<T> a(fix fix, fko<T> fko) {
            if (fko.a != Timestamp.class) {
                return null;
            }
            final fjh a = fix.a(Date.class);
            return new fjh<Timestamp>() {
                public final /* synthetic */ Object a(fkp fkp) {
                    Date date = (Date) a.a(fkp);
                    if (date != null) {
                        return new Timestamp(date.getTime());
                    }
                    return null;
                }

                public final /* bridge */ /* synthetic */ void a(fkq fkq, Object obj) {
                    a.a(fkq, (Timestamp) obj);
                }
            };
        }
    };

    /* renamed from: fkj$29 reason: invalid class name */
    static /* synthetic */ class AnonymousClass29 {
        static final /* synthetic */ int[] a = new int[JsonToken.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NAME     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.fkj.AnonymousClass29.<clinit>():void");
        }
    }

    /* renamed from: fkj$a */
    static final class a<T extends Enum<T>> extends fjh<T> {
        private final Map<String, T> a = new HashMap();
        private final Map<T, String> b = new HashMap();

        public a(Class<T> cls) {
            Enum[] enumArr;
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    fjk fjk = (fjk) cls.getField(name).getAnnotation(fjk.class);
                    if (fjk != null) {
                        name = fjk.a();
                        for (String put : fjk.b()) {
                            this.a.put(put, enumR);
                        }
                    }
                    this.a.put(name, enumR);
                    this.b.put(enumR, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        public final /* synthetic */ Object a(fkp fkp) {
            if (fkp.f() != JsonToken.NULL) {
                return (Enum) this.a.get(fkp.i());
            }
            fkp.k();
            return null;
        }

        public final /* synthetic */ void a(fkq fkq, Object obj) {
            Enum enumR = (Enum) obj;
            fkq.b(enumR == null ? null : (String) this.b.get(enumR));
        }
    }

    static {
        final Class<Calendar> cls = Calendar.class;
        final Class<GregorianCalendar> cls2 = GregorianCalendar.class;
        final fjh<Calendar> fjh = Y;
        A = new fji() {
            public final <T> fjh<T> a(fix fix, fko<T> fko) {
                Class<? super T> cls = fko.a;
                if (cls == cls || cls == cls2) {
                    return fjh;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(cls.getName());
                sb.append("+");
                sb.append(cls2.getName());
                sb.append(",adapter=");
                sb.append(fjh);
                sb.append("]");
                return sb.toString();
            }
        };
    }

    public static <TT> fji a(final Class<TT> cls, final fjh<TT> fjh) {
        return new fji() {
            public final <T> fjh<T> a(fix fix, fko<T> fko) {
                if (fko.a == cls) {
                    return fjh;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(fjh);
                sb.append("]");
                return sb.toString();
            }
        };
    }

    public static <TT> fji a(final Class<TT> cls, final Class<TT> cls2, final fjh<? super TT> fjh) {
        return new fji() {
            public final <T> fjh<T> a(fix fix, fko<T> fko) {
                Class<? super T> cls = fko.a;
                if (cls == cls || cls == cls2) {
                    return fjh;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(cls2.getName());
                sb.append("+");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(fjh);
                sb.append("]");
                return sb.toString();
            }
        };
    }

    private static <T1> fji b(final Class<T1> cls, final fjh<T1> fjh) {
        return new fji() {
            public final <T2> fjh<T2> a(fix fix, fko<T2> fko) {
                final Class<? super T> cls = fko.a;
                if (!cls.isAssignableFrom(cls)) {
                    return null;
                }
                return new fjh<T1>() {
                    public final T1 a(fkp fkp) {
                        T1 a2 = fjh.a(fkp);
                        if (a2 == null || cls.isInstance(a2)) {
                            return a2;
                        }
                        StringBuilder sb = new StringBuilder("Expected a ");
                        sb.append(cls.getName());
                        sb.append(" but was ");
                        sb.append(a2.getClass().getName());
                        throw new JsonSyntaxException(sb.toString());
                    }

                    public final void a(fkq fkq, T1 t1) {
                        fjh.a(fkq, t1);
                    }
                };
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[typeHierarchy=");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(fjh);
                sb.append("]");
                return sb.toString();
            }
        };
    }
}
