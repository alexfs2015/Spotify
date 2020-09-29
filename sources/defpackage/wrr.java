package defpackage;

import io.netty.handler.codec.http.HttpHeaderDateFormat;
import io.netty.util.internal.PlatformDependent;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: wrr reason: default package */
public class wrr extends wsg {
    static final c<CharSequence> a = new c<CharSequence>() {
        public final /* synthetic */ void a(Object obj) {
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence == null || charSequence.length() == 0) {
                StringBuilder sb = new StringBuilder("empty headers are not allowed [");
                sb.append(charSequence);
                sb.append("]");
                throw new IllegalArgumentException(sb.toString());
            }
            if (charSequence instanceof wvc) {
                try {
                    wvc wvc = (wvc) charSequence;
                    wvc.a(0, wvc.length(), wrr.b);
                } catch (Exception e) {
                    PlatformDependent.a((Throwable) e);
                }
            } else {
                for (int i = 0; i < charSequence.length(); i++) {
                    wrr.a(charSequence.charAt(i));
                }
            }
        }
    };
    /* access modifiers changed from: private */
    public static final wvg b = new wvg() {
        public final boolean a(byte b) {
            wrr.a(b);
            return true;
        }
    };
    private final wrh<CharSequence, CharSequence, ?> c;

    /* renamed from: wrr$a */
    static class a extends wrd {
        static final a a = new a();

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        /* renamed from: a */
        public CharSequence b(Object obj) {
            return obj instanceof CharSequence ? (CharSequence) obj : obj instanceof Date ? HttpHeaderDateFormat.a().format((Date) obj) : obj instanceof Calendar ? HttpHeaderDateFormat.a().format(((Calendar) obj).getTime()) : obj.toString();
        }
    }

    /* renamed from: wrr$b */
    static final class b extends a {
        static final b b = new b();

        private b() {
            super(0);
        }

        /* renamed from: a */
        public final CharSequence b(Object obj) {
            CharSequence a = super.b(obj);
            char c = 0;
            for (int i = 0; i < a.length(); i++) {
                char charAt = a.charAt(i);
                if ((charAt & 65520) == 0) {
                    if (charAt == 0) {
                        StringBuilder sb = new StringBuilder("a header value contains a prohibited character '\u0000': ");
                        sb.append(a);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (charAt == 11) {
                        StringBuilder sb2 = new StringBuilder("a header value contains a prohibited character '\\v': ");
                        sb2.append(a);
                        throw new IllegalArgumentException(sb2.toString());
                    } else if (charAt == 12) {
                        StringBuilder sb3 = new StringBuilder("a header value contains a prohibited character '\\f': ");
                        sb3.append(a);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                }
                if (c != 0) {
                    if (c != 1) {
                        if (c != 2) {
                            continue;
                        } else if (charAt == 9 || charAt == ' ') {
                            c = 0;
                        } else {
                            StringBuilder sb4 = new StringBuilder("only ' ' and '\\t' are allowed after '\\n': ");
                            sb4.append(a);
                            throw new IllegalArgumentException(sb4.toString());
                        }
                    } else if (charAt != 10) {
                        StringBuilder sb5 = new StringBuilder("only '\\n' is allowed after '\\r': ");
                        sb5.append(a);
                        throw new IllegalArgumentException(sb5.toString());
                    }
                } else if (charAt != 10) {
                    if (charAt == 13) {
                        c = 1;
                    }
                }
                c = 2;
            }
            if (c == 0) {
                return a;
            }
            StringBuilder sb6 = new StringBuilder("a header value must not end with '\\r' or '\\n':");
            sb6.append(a);
            throw new IllegalArgumentException(sb6.toString());
        }
    }

    public wrr() {
        this(true);
    }

    protected wrr(wrh<CharSequence, CharSequence, ?> wrh) {
        this.c = wrh;
    }

    public wrr(boolean z) {
        this(z, b(z));
    }

    protected wrr(boolean z, c<CharSequence> cVar) {
        this((wrh<CharSequence, CharSequence, ?>) new wri<CharSequence,CharSequence,Object>(wvc.c, a(z), cVar));
    }

    static wrm<CharSequence> a(boolean z) {
        return z ? b.b : a.a;
    }

    static /* synthetic */ void a(byte b2) {
        if (!(b2 == 0 || b2 == 32 || b2 == 44 || b2 == 61 || b2 == 58 || b2 == 59)) {
            switch (b2) {
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    if (b2 < 0) {
                        StringBuilder sb = new StringBuilder("a header name cannot contain non-ASCII character: ");
                        sb.append(b2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    return;
            }
        }
        StringBuilder sb2 = new StringBuilder("a header name cannot contain the following prohibited characters: =,;: \\t\\r\\n\\v\\f: ");
        sb2.append(b2);
        throw new IllegalArgumentException(sb2.toString());
    }

    static /* synthetic */ void a(char c2) {
        if (!(c2 == 0 || c2 == ' ' || c2 == ',' || c2 == '=' || c2 == ':' || c2 == ';')) {
            switch (c2) {
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    if (c2 > 127) {
                        StringBuilder sb = new StringBuilder("a header name cannot contain non-ASCII character: ");
                        sb.append(c2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    return;
            }
        }
        StringBuilder sb2 = new StringBuilder("a header name cannot contain the following prohibited characters: =,;: \\t\\r\\n\\v\\f: ");
        sb2.append(c2);
        throw new IllegalArgumentException(sb2.toString());
    }

    static c<CharSequence> b(boolean z) {
        return z ? a : c.a;
    }

    public final Iterator<Entry<CharSequence, CharSequence>> a() {
        return this.c.iterator();
    }

    public final wsg a(CharSequence charSequence) {
        this.c.d(charSequence);
        return this;
    }

    public final wsg a(CharSequence charSequence, Iterable<?> iterable) {
        this.c.a(charSequence, iterable);
        return this;
    }

    public final wsg a(CharSequence charSequence, Object obj) {
        this.c.b(charSequence, obj);
        return this;
    }

    public final wsg a(String str) {
        this.c.d(str);
        return this;
    }

    public final wsg a(String str, Iterable<?> iterable) {
        this.c.a(str, iterable);
        return this;
    }

    public final wsg a(String str, Object obj) {
        this.c.b(str, obj);
        return this;
    }

    public final boolean a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        return this.c.a(charSequence, charSequence2, z ? wvc.c : wvc.d);
    }

    public final boolean a(String str, String str2, boolean z) {
        return a((CharSequence) str, (CharSequence) str2, z);
    }

    public final String b(CharSequence charSequence) {
        return wrk.b(this.c, charSequence);
    }

    public final String b(String str) {
        return b((CharSequence) str);
    }

    public final wsg b(CharSequence charSequence, Object obj) {
        this.c.d(charSequence, obj);
        return this;
    }

    public final wsg b(String str, Object obj) {
        this.c.d(str, obj);
        return this;
    }

    public final boolean b() {
        return this.c.b();
    }

    public final List<String> c(CharSequence charSequence) {
        return wrk.a(this.c, charSequence);
    }

    public final List<String> c(String str) {
        return c((CharSequence) str);
    }

    public final boolean d(CharSequence charSequence) {
        return this.c.c(charSequence);
    }

    public final boolean d(String str) {
        return d((CharSequence) str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wrr)) {
            return false;
        }
        return this.c.a((wrj<K, V, ?>) ((wrr) obj).c, wvc.d);
    }

    public int hashCode() {
        return this.c.a(wvc.d);
    }

    @Deprecated
    public Iterator<Entry<String, String>> iterator() {
        return new defpackage.wrk.b(this.c.iterator());
    }
}
