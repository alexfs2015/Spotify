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

/* renamed from: fjp reason: default package */
public final class fjp {
    public static final fio A;
    public static final fio B = a(Locale.class, Z);
    public static final fin<fih> C = new fin<fih>() {
        /* access modifiers changed from: private */
        /* renamed from: b */
        public fih a(fjv fjv) {
            switch (AnonymousClass29.a[fjv.f().ordinal()]) {
                case 1:
                    return new fil((Number) new LazilyParsedNumber(fjv.i()));
                case 2:
                    return new fil(Boolean.valueOf(fjv.j()));
                case 3:
                    return new fil(fjv.i());
                case 4:
                    fjv.k();
                    return fii.a;
                case 5:
                    fif fif = new fif();
                    fjv.a();
                    while (fjv.e()) {
                        fif.a(a(fjv));
                    }
                    fjv.b();
                    return fif;
                case 6:
                    fij fij = new fij();
                    fjv.c();
                    while (fjv.e()) {
                        fij.a(fjv.h(), a(fjv));
                    }
                    fjv.d();
                    return fij;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* access modifiers changed from: private */
        public void a(fjw fjw, fih fih) {
            if (fih == null || (fih instanceof fii)) {
                fjw.e();
            } else if (fih instanceof fil) {
                fil h = fih.h();
                if (h.a instanceof Number) {
                    fjw.a(h.a());
                } else if (h.a instanceof Boolean) {
                    fjw.a(h.f());
                } else {
                    fjw.b(h.b());
                }
            } else {
                boolean z = fih instanceof fif;
                if (z) {
                    fjw.a();
                    if (z) {
                        Iterator it = ((fif) fih).iterator();
                        while (it.hasNext()) {
                            a(fjw, (fih) it.next());
                        }
                        fjw.b();
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Not a JSON Array: ");
                    sb.append(fih);
                    throw new IllegalStateException(sb.toString());
                } else if (fih instanceof fij) {
                    fjw.c();
                    for (Entry entry : fih.g().a.entrySet()) {
                        fjw.a((String) entry.getKey());
                        a(fjw, (fih) entry.getValue());
                    }
                    fjw.d();
                } else {
                    StringBuilder sb2 = new StringBuilder("Couldn't write ");
                    sb2.append(fih.getClass());
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
    };
    public static final fio D = b(fih.class, C);
    public static final fio E = new fio() {
        public final <T> fin<T> a(fid fid, fju<T> fju) {
            Class<? super T> cls = fju.a;
            if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
                return null;
            }
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new a(cls);
        }
    };
    private static fin<Class> F = new fin<Class>() {
        public final /* synthetic */ void a(fjw fjw, Object obj) {
            Class cls = (Class) obj;
            StringBuilder sb = new StringBuilder("Attempted to serialize java.lang.Class: ");
            sb.append(cls.getName());
            sb.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(sb.toString());
        }

        public final /* synthetic */ Object a(fjv fjv) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }
    }.a();
    private static fin<BitSet> G = new fin<BitSet>() {
        public final /* synthetic */ Object a(fjv fjv) {
            return b(fjv);
        }

        public final /* synthetic */ void a(fjw fjw, Object obj) {
            BitSet bitSet = (BitSet) obj;
            fjw.a();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                fjw.a(bitSet.get(i) ? 1 : 0);
            }
            fjw.b();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
            if (r7.n() != 0) goto L_0x0063;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0068 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.util.BitSet b(defpackage.fjv r7) {
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
                int[] r4 = defpackage.fjp.AnonymousClass29.a
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.fjp.AnonymousClass12.b(fjv):java.util.BitSet");
        }
    }.a();
    private static fin<Boolean> H = new fin<Boolean>() {
        public final /* bridge */ /* synthetic */ void a(fjw fjw, Object obj) {
            fjw.a((Boolean) obj);
        }

        public final /* synthetic */ Object a(fjv fjv) {
            JsonToken f = fjv.f();
            if (f == JsonToken.NULL) {
                fjv.k();
                return null;
            } else if (f == JsonToken.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(fjv.i()));
            } else {
                return Boolean.valueOf(fjv.j());
            }
        }
    };
    private static fin<Number> I = new fin<Number>() {
        public final /* synthetic */ Object a(fjv fjv) {
            return b(fjv);
        }

        public final /* bridge */ /* synthetic */ void a(fjw fjw, Object obj) {
            fjw.a((Number) obj);
        }

        private static Number b(fjv fjv) {
            if (fjv.f() == JsonToken.NULL) {
                fjv.k();
                return null;
            }
            try {
                return Byte.valueOf((byte) fjv.n());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    };
    private static fin<Number> J = new fin<Number>() {
        public final /* synthetic */ Object a(fjv fjv) {
            return b(fjv);
        }

        public final /* bridge */ /* synthetic */ void a(fjw fjw, Object obj) {
            fjw.a((Number) obj);
        }

        private static Number b(fjv fjv) {
            if (fjv.f() == JsonToken.NULL) {
                fjv.k();
                return null;
            }
            try {
                return Short.valueOf((short) fjv.n());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    };
    private static fin<Number> K = new fin<Number>() {
        public final /* synthetic */ Object a(fjv fjv) {
            return b(fjv);
        }

        public final /* bridge */ /* synthetic */ void a(fjw fjw, Object obj) {
            fjw.a((Number) obj);
        }

        private static Number b(fjv fjv) {
            if (fjv.f() == JsonToken.NULL) {
                fjv.k();
                return null;
            }
            try {
                return Integer.valueOf(fjv.n());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    };
    private static fin<AtomicInteger> L = new fin<AtomicInteger>() {
        public final /* synthetic */ Object a(fjv fjv) {
            return b(fjv);
        }

        public final /* synthetic */ void a(fjw fjw, Object obj) {
            fjw.a((long) ((AtomicInteger) obj).get());
        }

        private static AtomicInteger b(fjv fjv) {
            try {
                return new AtomicInteger(fjv.n());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    }.a();
    private static fin<AtomicBoolean> M = new fin<AtomicBoolean>() {
        public final /* synthetic */ void a(fjw fjw, Object obj) {
            fjw.a(((AtomicBoolean) obj).get());
        }

        public final /* synthetic */ Object a(fjv fjv) {
            return new AtomicBoolean(fjv.j());
        }
    }.a();
    private static fin<AtomicIntegerArray> N = new fin<AtomicIntegerArray>() {
        public final /* synthetic */ Object a(fjv fjv) {
            return b(fjv);
        }

        public final /* synthetic */ void a(fjw fjw, Object obj) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            fjw.a();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                fjw.a((long) atomicIntegerArray.get(i));
            }
            fjw.b();
        }

        private static AtomicIntegerArray b(fjv fjv) {
            ArrayList arrayList = new ArrayList();
            fjv.a();
            while (fjv.e()) {
                try {
                    arrayList.add(Integer.valueOf(fjv.n()));
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }
            fjv.b();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }
    }.a();
    private static fin<Number> O = new fin<Number>() {
        public final /* bridge */ /* synthetic */ void a(fjw fjw, Object obj) {
            fjw.a((Number) obj);
        }

        public final /* synthetic */ Object a(fjv fjv) {
            JsonToken f = fjv.f();
            int i = AnonymousClass29.a[f.ordinal()];
            if (i == 1 || i == 3) {
                return new LazilyParsedNumber(fjv.i());
            }
            if (i == 4) {
                fjv.k();
                return null;
            }
            StringBuilder sb = new StringBuilder("Expecting number, got: ");
            sb.append(f);
            throw new JsonSyntaxException(sb.toString());
        }
    };
    private static fin<Character> P = new fin<Character>() {
        public final /* synthetic */ void a(fjw fjw, Object obj) {
            Character ch = (Character) obj;
            fjw.b(ch == null ? null : String.valueOf(ch));
        }

        public final /* synthetic */ Object a(fjv fjv) {
            if (fjv.f() == JsonToken.NULL) {
                fjv.k();
                return null;
            }
            String i = fjv.i();
            if (i.length() == 1) {
                return Character.valueOf(i.charAt(0));
            }
            StringBuilder sb = new StringBuilder("Expecting character, got: ");
            sb.append(i);
            throw new JsonSyntaxException(sb.toString());
        }
    };
    private static fin<String> Q = new fin<String>() {
        public final /* synthetic */ void a(fjw fjw, Object obj) {
            fjw.b((String) obj);
        }

        public final /* synthetic */ Object a(fjv fjv) {
            JsonToken f = fjv.f();
            if (f == JsonToken.NULL) {
                fjv.k();
                return null;
            } else if (f == JsonToken.BOOLEAN) {
                return Boolean.toString(fjv.j());
            } else {
                return fjv.i();
            }
        }
    };
    private static fin<StringBuilder> R = new fin<StringBuilder>() {
        public final /* synthetic */ void a(fjw fjw, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            fjw.b(sb == null ? null : sb.toString());
        }

        public final /* synthetic */ Object a(fjv fjv) {
            if (fjv.f() != JsonToken.NULL) {
                return new StringBuilder(fjv.i());
            }
            fjv.k();
            return null;
        }
    };
    private static fin<StringBuffer> S = new fin<StringBuffer>() {
        public final /* synthetic */ void a(fjw fjw, Object obj) {
            StringBuffer stringBuffer = (StringBuffer) obj;
            fjw.b(stringBuffer == null ? null : stringBuffer.toString());
        }

        public final /* synthetic */ Object a(fjv fjv) {
            if (fjv.f() != JsonToken.NULL) {
                return new StringBuffer(fjv.i());
            }
            fjv.k();
            return null;
        }
    };
    private static fin<URL> T = new fin<URL>() {
        public final /* synthetic */ void a(fjw fjw, Object obj) {
            URL url = (URL) obj;
            fjw.b(url == null ? null : url.toExternalForm());
        }

        public final /* synthetic */ Object a(fjv fjv) {
            if (fjv.f() == JsonToken.NULL) {
                fjv.k();
                return null;
            }
            String i = fjv.i();
            if ("null".equals(i)) {
                return null;
            }
            return new URL(i);
        }
    };
    private static fin<URI> U = new fin<URI>() {
        public final /* synthetic */ Object a(fjv fjv) {
            return b(fjv);
        }

        public final /* synthetic */ void a(fjw fjw, Object obj) {
            URI uri = (URI) obj;
            fjw.b(uri == null ? null : uri.toASCIIString());
        }

        private static URI b(fjv fjv) {
            if (fjv.f() == JsonToken.NULL) {
                fjv.k();
                return null;
            }
            try {
                String i = fjv.i();
                if ("null".equals(i)) {
                    return null;
                }
                return new URI(i);
            } catch (URISyntaxException e) {
                throw new JsonIOException((Throwable) e);
            }
        }
    };
    private static fin<InetAddress> V = new fin<InetAddress>() {
        public final /* synthetic */ void a(fjw fjw, Object obj) {
            InetAddress inetAddress = (InetAddress) obj;
            fjw.b(inetAddress == null ? null : inetAddress.getHostAddress());
        }

        public final /* synthetic */ Object a(fjv fjv) {
            if (fjv.f() != JsonToken.NULL) {
                return InetAddress.getByName(fjv.i());
            }
            fjv.k();
            return null;
        }
    };
    private static fin<UUID> W = new fin<UUID>() {
        public final /* synthetic */ void a(fjw fjw, Object obj) {
            UUID uuid = (UUID) obj;
            fjw.b(uuid == null ? null : uuid.toString());
        }

        public final /* synthetic */ Object a(fjv fjv) {
            if (fjv.f() != JsonToken.NULL) {
                return UUID.fromString(fjv.i());
            }
            fjv.k();
            return null;
        }
    };
    private static fin<Currency> X = new fin<Currency>() {
        public final /* synthetic */ void a(fjw fjw, Object obj) {
            fjw.b(((Currency) obj).getCurrencyCode());
        }

        public final /* synthetic */ Object a(fjv fjv) {
            return Currency.getInstance(fjv.i());
        }
    }.a();
    private static fin<Calendar> Y = new fin<Calendar>() {
        public final /* synthetic */ void a(fjw fjw, Object obj) {
            Calendar calendar = (Calendar) obj;
            if (calendar == null) {
                fjw.e();
                return;
            }
            fjw.c();
            fjw.a("year");
            fjw.a((long) calendar.get(1));
            fjw.a("month");
            fjw.a((long) calendar.get(2));
            fjw.a("dayOfMonth");
            fjw.a((long) calendar.get(5));
            fjw.a("hourOfDay");
            fjw.a((long) calendar.get(11));
            fjw.a("minute");
            fjw.a((long) calendar.get(12));
            fjw.a("second");
            fjw.a((long) calendar.get(13));
            fjw.d();
        }

        public final /* synthetic */ Object a(fjv fjv) {
            if (fjv.f() == JsonToken.NULL) {
                fjv.k();
                return null;
            }
            fjv.c();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (fjv.f() != JsonToken.END_OBJECT) {
                String h = fjv.h();
                int n = fjv.n();
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
            fjv.d();
            GregorianCalendar gregorianCalendar = new GregorianCalendar(i, i2, i3, i4, i5, i6);
            return gregorianCalendar;
        }
    };
    private static fin<Locale> Z = new fin<Locale>() {
        public final /* synthetic */ void a(fjw fjw, Object obj) {
            Locale locale = (Locale) obj;
            fjw.b(locale == null ? null : locale.toString());
        }

        public final /* synthetic */ Object a(fjv fjv) {
            String str = null;
            if (fjv.f() == JsonToken.NULL) {
                fjv.k();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(fjv.i(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken2 == null && str == null) {
                return new Locale(nextToken);
            }
            if (str == null) {
                return new Locale(nextToken, nextToken2);
            }
            return new Locale(nextToken, nextToken2, str);
        }
    };
    public static final fio a = a(Class.class, F);
    public static final fio b = a(BitSet.class, G);
    public static final fin<Boolean> c = new fin<Boolean>() {
        public final /* synthetic */ void a(fjw fjw, Object obj) {
            Boolean bool = (Boolean) obj;
            fjw.b(bool == null ? "null" : bool.toString());
        }

        public final /* synthetic */ Object a(fjv fjv) {
            if (fjv.f() != JsonToken.NULL) {
                return Boolean.valueOf(fjv.i());
            }
            fjv.k();
            return null;
        }
    };
    public static final fio d = a(Boolean.TYPE, Boolean.class, H);
    public static final fio e = a(Byte.TYPE, Byte.class, I);
    public static final fio f = a(Short.TYPE, Short.class, J);
    public static final fio g = a(Integer.TYPE, Integer.class, K);
    public static final fio h = a(AtomicInteger.class, L);
    public static final fio i = a(AtomicBoolean.class, M);
    public static final fio j = a(AtomicIntegerArray.class, N);
    public static final fin<Number> k = new fin<Number>() {
        public final /* synthetic */ Object a(fjv fjv) {
            return b(fjv);
        }

        public final /* bridge */ /* synthetic */ void a(fjw fjw, Object obj) {
            fjw.a((Number) obj);
        }

        private static Number b(fjv fjv) {
            if (fjv.f() == JsonToken.NULL) {
                fjv.k();
                return null;
            }
            try {
                return Long.valueOf(fjv.m());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    };
    public static final fin<Number> l = new fin<Number>() {
        public final /* bridge */ /* synthetic */ void a(fjw fjw, Object obj) {
            fjw.a((Number) obj);
        }

        public final /* synthetic */ Object a(fjv fjv) {
            if (fjv.f() != JsonToken.NULL) {
                return Float.valueOf((float) fjv.l());
            }
            fjv.k();
            return null;
        }
    };
    public static final fin<Number> m = new fin<Number>() {
        public final /* bridge */ /* synthetic */ void a(fjw fjw, Object obj) {
            fjw.a((Number) obj);
        }

        public final /* synthetic */ Object a(fjv fjv) {
            if (fjv.f() != JsonToken.NULL) {
                return Double.valueOf(fjv.l());
            }
            fjv.k();
            return null;
        }
    };
    public static final fio n = a(Number.class, O);
    public static final fio o = a(Character.TYPE, Character.class, P);
    public static final fin<BigDecimal> p = new fin<BigDecimal>() {
        public final /* synthetic */ Object a(fjv fjv) {
            return b(fjv);
        }

        public final /* bridge */ /* synthetic */ void a(fjw fjw, Object obj) {
            fjw.a((Number) (BigDecimal) obj);
        }

        private static BigDecimal b(fjv fjv) {
            if (fjv.f() == JsonToken.NULL) {
                fjv.k();
                return null;
            }
            try {
                return new BigDecimal(fjv.i());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    };
    public static final fin<BigInteger> q = new fin<BigInteger>() {
        public final /* synthetic */ Object a(fjv fjv) {
            return b(fjv);
        }

        public final /* bridge */ /* synthetic */ void a(fjw fjw, Object obj) {
            fjw.a((Number) (BigInteger) obj);
        }

        private static BigInteger b(fjv fjv) {
            if (fjv.f() == JsonToken.NULL) {
                fjv.k();
                return null;
            }
            try {
                return new BigInteger(fjv.i());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    };
    public static final fio r = a(String.class, Q);
    public static final fio s = a(StringBuilder.class, R);
    public static final fio t = a(StringBuffer.class, S);
    public static final fio u = a(URL.class, T);
    public static final fio v = a(URI.class, U);
    public static final fio w = b(InetAddress.class, V);
    public static final fio x = a(UUID.class, W);
    public static final fio y = a(Currency.class, X);
    public static final fio z = new fio() {
        public final <T> fin<T> a(fid fid, fju<T> fju) {
            if (fju.a != Timestamp.class) {
                return null;
            }
            final fin a = fid.a(Date.class);
            return new fin<Timestamp>() {
                public final /* bridge */ /* synthetic */ void a(fjw fjw, Object obj) {
                    a.a(fjw, (Timestamp) obj);
                }

                public final /* synthetic */ Object a(fjv fjv) {
                    Date date = (Date) a.a(fjv);
                    if (date != null) {
                        return new Timestamp(date.getTime());
                    }
                    return null;
                }
            };
        }
    };

    /* renamed from: fjp$29 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.fjp.AnonymousClass29.<clinit>():void");
        }
    }

    /* renamed from: fjp$a */
    static final class a<T extends Enum<T>> extends fin<T> {
        private final Map<String, T> a = new HashMap();
        private final Map<T, String> b = new HashMap();

        public final /* synthetic */ void a(fjw fjw, Object obj) {
            Enum enumR = (Enum) obj;
            fjw.b(enumR == null ? null : (String) this.b.get(enumR));
        }

        public a(Class<T> cls) {
            Enum[] enumArr;
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    fiq fiq = (fiq) cls.getField(name).getAnnotation(fiq.class);
                    if (fiq != null) {
                        name = fiq.a();
                        for (String put : fiq.b()) {
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

        public final /* synthetic */ Object a(fjv fjv) {
            if (fjv.f() != JsonToken.NULL) {
                return (Enum) this.a.get(fjv.i());
            }
            fjv.k();
            return null;
        }
    }

    static {
        final Class<Calendar> cls = Calendar.class;
        final Class<GregorianCalendar> cls2 = GregorianCalendar.class;
        final fin<Calendar> fin = Y;
        A = new fio() {
            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(cls.getName());
                sb.append("+");
                sb.append(cls2.getName());
                sb.append(",adapter=");
                sb.append(fin);
                sb.append("]");
                return sb.toString();
            }

            public final <T> fin<T> a(fid fid, fju<T> fju) {
                Class<? super T> cls = fju.a;
                if (cls == cls || cls == cls2) {
                    return fin;
                }
                return null;
            }
        };
    }

    public static <TT> fio a(final Class<TT> cls, final fin<TT> fin) {
        return new fio() {
            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(fin);
                sb.append("]");
                return sb.toString();
            }

            public final <T> fin<T> a(fid fid, fju<T> fju) {
                if (fju.a == cls) {
                    return fin;
                }
                return null;
            }
        };
    }

    public static <TT> fio a(final Class<TT> cls, final Class<TT> cls2, final fin<? super TT> fin) {
        return new fio() {
            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(cls2.getName());
                sb.append("+");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(fin);
                sb.append("]");
                return sb.toString();
            }

            public final <T> fin<T> a(fid fid, fju<T> fju) {
                Class<? super T> cls = fju.a;
                if (cls == cls || cls == cls2) {
                    return fin;
                }
                return null;
            }
        };
    }

    private static <T1> fio b(final Class<T1> cls, final fin<T1> fin) {
        return new fio() {
            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[typeHierarchy=");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(fin);
                sb.append("]");
                return sb.toString();
            }

            public final <T2> fin<T2> a(fid fid, fju<T2> fju) {
                final Class<? super T> cls = fju.a;
                if (!cls.isAssignableFrom(cls)) {
                    return null;
                }
                return new fin<T1>() {
                    public final void a(fjw fjw, T1 t1) {
                        fin.a(fjw, t1);
                    }

                    public final T1 a(fjv fjv) {
                        T1 a2 = fin.a(fjv);
                        if (a2 == null || cls.isInstance(a2)) {
                            return a2;
                        }
                        StringBuilder sb = new StringBuilder("Expected a ");
                        sb.append(cls.getName());
                        sb.append(" but was ");
                        sb.append(a2.getClass().getName());
                        throw new JsonSyntaxException(sb.toString());
                    }
                };
            }
        };
    }
}
