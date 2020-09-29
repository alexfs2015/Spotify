package defpackage;

import io.netty.handler.codec.http.HttpHeaderDateFormat;
import io.netty.util.internal.PlatformDependent;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: wdl reason: default package */
public class wdl extends wea {
    static final c<CharSequence> a = new c<CharSequence>() {
        public final /* synthetic */ void a(Object obj) {
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence == null || charSequence.length() == 0) {
                StringBuilder sb = new StringBuilder("empty headers are not allowed [");
                sb.append(charSequence);
                sb.append("]");
                throw new IllegalArgumentException(sb.toString());
            }
            if (charSequence instanceof wgw) {
                try {
                    wgw wgw = (wgw) charSequence;
                    wgw.a(0, wgw.length(), wdl.b);
                } catch (Exception e) {
                    PlatformDependent.a((Throwable) e);
                }
            } else {
                for (int i = 0; i < charSequence.length(); i++) {
                    wdl.a(charSequence.charAt(i));
                }
            }
        }
    };
    /* access modifiers changed from: private */
    public static final wha b = new wha() {
        public final boolean a(byte b) {
            wdl.a(b);
            return true;
        }
    };
    private final wdb<CharSequence, CharSequence, ?> c;

    /* renamed from: wdl$a */
    static class a extends wcx {
        static final a a = new a();

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        /* renamed from: a */
        public CharSequence b(Object obj) {
            if (obj instanceof CharSequence) {
                return (CharSequence) obj;
            }
            if (obj instanceof Date) {
                return HttpHeaderDateFormat.a().format((Date) obj);
            }
            if (obj instanceof Calendar) {
                return HttpHeaderDateFormat.a().format(((Calendar) obj).getTime());
            }
            return obj.toString();
        }
    }

    /* renamed from: wdl$b */
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

    public wdl() {
        this(true);
    }

    public wdl(boolean z) {
        this(z, b(z));
    }

    protected wdl(boolean z, c<CharSequence> cVar) {
        this((wdb<CharSequence, CharSequence, ?>) new wdc<CharSequence,CharSequence,Object>(wgw.c, a(z), cVar));
    }

    protected wdl(wdb<CharSequence, CharSequence, ?> wdb) {
        this.c = wdb;
    }

    public final wea a(String str, Object obj) {
        this.c.b(str, obj);
        return this;
    }

    public final wea a(CharSequence charSequence, Object obj) {
        this.c.b(charSequence, obj);
        return this;
    }

    public final wea a(String str) {
        this.c.d(str);
        return this;
    }

    public final wea a(CharSequence charSequence) {
        this.c.d(charSequence);
        return this;
    }

    public final wea b(String str, Object obj) {
        this.c.d(str, obj);
        return this;
    }

    public final wea b(CharSequence charSequence, Object obj) {
        this.c.d(charSequence, obj);
        return this;
    }

    public final wea a(String str, Iterable<?> iterable) {
        this.c.a(str, iterable);
        return this;
    }

    public final wea a(CharSequence charSequence, Iterable<?> iterable) {
        this.c.a(charSequence, iterable);
        return this;
    }

    public final String b(String str) {
        return b((CharSequence) str);
    }

    public final String b(CharSequence charSequence) {
        return wde.b(this.c, charSequence);
    }

    public final List<String> c(String str) {
        return c((CharSequence) str);
    }

    public final List<String> c(CharSequence charSequence) {
        return wde.a(this.c, charSequence);
    }

    @Deprecated
    public Iterator<Entry<String, String>> iterator() {
        return new defpackage.wde.b(this.c.iterator());
    }

    public final Iterator<Entry<CharSequence, CharSequence>> a() {
        return this.c.iterator();
    }

    public final boolean d(String str) {
        return d((CharSequence) str);
    }

    public final boolean d(CharSequence charSequence) {
        return this.c.c(charSequence);
    }

    public final boolean b() {
        return this.c.b();
    }

    public final boolean a(String str, String str2, boolean z) {
        return a((CharSequence) str, (CharSequence) str2, z);
    }

    public final boolean a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        return this.c.a(charSequence, charSequence2, z ? wgw.c : wgw.d);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wdl)) {
            return false;
        }
        return this.c.a((wdd<K, V, ?>) ((wdl) obj).c, wgw.d);
    }

    public int hashCode() {
        return this.c.a(wgw.d);
    }

    static wdg<CharSequence> a(boolean z) {
        return z ? b.b : a.a;
    }

    static c<CharSequence> b(boolean z) {
        return z ? a : c.a;
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
}
