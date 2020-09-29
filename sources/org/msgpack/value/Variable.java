package org.msgpack.value;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CodingErrorAction;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.msgpack.core.MessageStringCodingException;
import org.msgpack.core.MessageTypeCastException;

public final class Variable implements wqq {
    public static final BigInteger n = BigInteger.valueOf(Long.MIN_VALUE);
    public static final BigInteger o = BigInteger.valueOf(Long.MAX_VALUE);
    public final f a = new f(this, 0);
    public final i b = new i(this, 0);
    public final h c = new h(this, 0);
    public final e d = new e(this, 0);
    public final l e = new l(this, 0);
    public final d f = new d(this, 0);
    public final j g = new j(this, 0);
    public final g h = new g(this, 0);
    public Type i;
    public long j;
    public double k;
    public Object l;
    public c m;
    private final k p = new k(this, 0);

    public enum Type {
        NULL(ValueType.NIL),
        BOOLEAN(ValueType.BOOLEAN),
        LONG(ValueType.INTEGER),
        BIG_INTEGER(ValueType.INTEGER),
        DOUBLE(ValueType.FLOAT),
        BYTE_ARRAY(ValueType.BINARY),
        RAW_STRING(ValueType.STRING),
        LIST(ValueType.ARRAY),
        MAP(ValueType.MAP),
        EXTENSION(ValueType.EXTENSION);
        
        final ValueType valueType;

        private Type(ValueType valueType2) {
            this.valueType = valueType2;
        }
    }

    abstract class a extends c implements wqn {
        public final wqn u() {
            return this;
        }

        private a() {
            super(Variable.this, 0);
        }

        /* synthetic */ a(Variable variable, byte b) {
            this();
        }

        public final int bm_() {
            if (Variable.this.i == Type.BIG_INTEGER) {
                return ((BigInteger) Variable.this.l).intValue();
            }
            return (int) Variable.this.j;
        }

        public final long bn_() {
            if (Variable.this.i == Type.BIG_INTEGER) {
                return ((BigInteger) Variable.this.l).longValue();
            }
            return Variable.this.j;
        }

        public final BigInteger bo_() {
            if (Variable.this.i == Type.BIG_INTEGER) {
                return (BigInteger) Variable.this.l;
            }
            if (Variable.this.i == Type.DOUBLE) {
                return new BigDecimal(Variable.this.k).toBigInteger();
            }
            return BigInteger.valueOf(Variable.this.j);
        }

        public final float bp_() {
            if (Variable.this.i == Type.BIG_INTEGER) {
                return ((BigInteger) Variable.this.l).floatValue();
            }
            if (Variable.this.i == Type.DOUBLE) {
                return (float) Variable.this.k;
            }
            return (float) Variable.this.j;
        }

        public final double bq_() {
            if (Variable.this.i == Type.BIG_INTEGER) {
                return ((BigInteger) Variable.this.l).doubleValue();
            }
            if (Variable.this.i == Type.DOUBLE) {
                return Variable.this.k;
            }
            return (double) Variable.this.j;
        }
    }

    abstract class b extends c implements wqo {
        public final wqo x() {
            return this;
        }

        private b() {
            super(Variable.this, 0);
        }

        /* synthetic */ b(Variable variable, byte b) {
            this();
        }

        public final byte[] a() {
            return (byte[]) Variable.this.l;
        }

        public String toString() {
            try {
                return wpm.a.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).decode(ByteBuffer.wrap((byte[]) Variable.this.l)).toString();
            } catch (CharacterCodingException e) {
                throw new MessageStringCodingException(e);
            }
        }
    }

    abstract class c implements wqq {
        private c() {
        }

        /* synthetic */ c(Variable variable, byte b) {
            this();
        }

        public final boolean j() {
            return h().a();
        }

        public final boolean k() {
            return h().b();
        }

        public final boolean l() {
            return h().c();
        }

        public final boolean m() {
            return h().d();
        }

        public final boolean n() {
            return h().rawType;
        }

        public final boolean o() {
            return h().f();
        }

        public final boolean p() {
            return h().e();
        }

        public final boolean q() {
            return h().g();
        }

        public final boolean r() {
            return h().h();
        }

        public final boolean s() {
            return h().i();
        }

        public wpv t() {
            throw new MessageTypeCastException();
        }

        public wqn u() {
            throw new MessageTypeCastException();
        }

        public wqk v() {
            throw new MessageTypeCastException();
        }

        public wpx w() {
            throw new MessageTypeCastException();
        }

        public wqo x() {
            throw new MessageTypeCastException();
        }

        public wpu y() {
            throw new MessageTypeCastException();
        }

        public wqp z() {
            throw new MessageTypeCastException();
        }

        public wpt A() {
            throw new MessageTypeCastException();
        }

        public wql B() {
            throw new MessageTypeCastException();
        }

        public wpw C() {
            throw new MessageTypeCastException();
        }

        public boolean equals(Object obj) {
            return Variable.this.equals(obj);
        }

        public int hashCode() {
            return Variable.this.hashCode();
        }

        public final String D() {
            return Variable.this.D();
        }

        public String toString() {
            return Variable.this.toString();
        }
    }

    class d extends c implements wpt {
        public final wpt A() {
            return this;
        }

        private d() {
            super(Variable.this, 0);
        }

        /* synthetic */ d(Variable variable, byte b) {
            this();
        }

        public final ValueType h() {
            return ValueType.ARRAY;
        }

        public final int a() {
            return b().size();
        }

        public final Iterator<wqq> iterator() {
            return b().iterator();
        }

        private List<wqq> b() {
            return (List) Variable.this.l;
        }

        public final /* synthetic */ wqj i() {
            List b = b();
            if (b.isEmpty()) {
                return wqu.I();
            }
            return new wqu((wqq[]) b.toArray(new wqq[b.size()]));
        }
    }

    class e extends b implements wpu {
        public final wpu y() {
            return this;
        }

        private e() {
            super(Variable.this, 0);
        }

        /* synthetic */ e(Variable variable, byte b) {
            this();
        }

        public final ValueType h() {
            return ValueType.BINARY;
        }

        public final /* synthetic */ wqj i() {
            return wqr.a(a());
        }
    }

    class f extends c implements wpv {
        public final wpv t() {
            return this;
        }

        private f() {
            super(Variable.this, 0);
        }

        /* synthetic */ f(Variable variable, byte b) {
            this();
        }

        public final ValueType h() {
            return ValueType.BOOLEAN;
        }

        public final boolean a() {
            return Variable.this.j == 1;
        }

        public final /* synthetic */ wqj i() {
            return wqr.a(a());
        }
    }

    class g extends c implements wpw {
        public final wpw C() {
            return this;
        }

        private g() {
            super(Variable.this, 0);
        }

        /* synthetic */ g(Variable variable, byte b) {
            this();
        }

        public final ValueType h() {
            return ValueType.EXTENSION;
        }

        public final byte a() {
            return ((wqb) Variable.this.l).a();
        }

        public final byte[] bs_() {
            return ((wqb) Variable.this.l).bs_();
        }

        public final /* synthetic */ wqj i() {
            return (wqb) Variable.this.l;
        }
    }

    class h extends a implements wpx {
        public final wpx w() {
            return this;
        }

        private h() {
            super(Variable.this, 0);
        }

        /* synthetic */ h(Variable variable, byte b) {
            this();
        }

        public final ValueType h() {
            return ValueType.FLOAT;
        }

        public final /* synthetic */ wqj i() {
            return wqr.a(Variable.this.k);
        }
    }

    class i extends a implements wqk {
        public final wqk v() {
            return this;
        }

        private i() {
            super(Variable.this, 0);
        }

        /* synthetic */ i(Variable variable, byte b) {
            this();
        }

        public final ValueType h() {
            return ValueType.INTEGER;
        }

        public final boolean a() {
            if (Variable.this.i != Type.BIG_INTEGER && -2147483648L <= Variable.this.j && Variable.this.j <= 2147483647L) {
                return true;
            }
            return false;
        }

        public final boolean br_() {
            return Variable.this.i != Type.BIG_INTEGER;
        }

        public final /* synthetic */ wqj i() {
            if (Variable.this.i == Type.BIG_INTEGER) {
                return wqr.a((BigInteger) Variable.this.l);
            }
            return wqr.a(Variable.this.j);
        }
    }

    class j extends c implements wql {
        public final wql B() {
            return this;
        }

        private j() {
            super(Variable.this, 0);
        }

        /* synthetic */ j(Variable variable, byte b) {
            this();
        }

        public final ValueType h() {
            return ValueType.MAP;
        }

        public final Map<wqq, wqq> a() {
            return (Map) Variable.this.l;
        }

        public final /* synthetic */ wqj i() {
            Map a2 = a();
            wqq[] wqqArr = new wqq[(a2.size() << 1)];
            int i = 0;
            for (Entry entry : a2.entrySet()) {
                wqqArr[i] = (wqq) entry.getKey();
                int i2 = i + 1;
                wqqArr[i2] = (wqq) entry.getValue();
                i = i2 + 1;
            }
            return wqr.a(wqqArr);
        }
    }

    class k extends c implements wqm {
        private k() {
            super(Variable.this, 0);
        }

        /* synthetic */ k(Variable variable, byte b) {
            this();
        }

        public final ValueType h() {
            return ValueType.NIL;
        }

        public final /* synthetic */ wqj i() {
            return wrc.a();
        }
    }

    class l extends b implements wqp {
        public final wqp z() {
            return this;
        }

        private l() {
            super(Variable.this, 0);
        }

        /* synthetic */ l(Variable variable, byte b) {
            this();
        }

        public final ValueType h() {
            return ValueType.STRING;
        }

        public final /* synthetic */ wqj i() {
            return wqr.b((byte[]) Variable.this.l);
        }
    }

    public Variable() {
        a();
    }

    public final Variable a() {
        this.i = Type.NULL;
        this.m = this.p;
        return this;
    }

    public final wqj i() {
        return this.m.i();
    }

    public final ValueType h() {
        return this.i.valueType;
    }

    public final boolean j() {
        return h().a();
    }

    public final boolean k() {
        return h().b();
    }

    public final boolean l() {
        return h().c();
    }

    public final boolean m() {
        return h().d();
    }

    public final boolean n() {
        return h().rawType;
    }

    public final boolean o() {
        return h().f();
    }

    public final boolean p() {
        return h().e();
    }

    public final boolean q() {
        return h().g();
    }

    public final boolean r() {
        return h().h();
    }

    public final boolean s() {
        return h().i();
    }

    public final wqo x() {
        if (n()) {
            return (wqo) this.m;
        }
        throw new MessageTypeCastException();
    }

    public final int hashCode() {
        return this.m.i().hashCode();
    }

    public final boolean equals(Object obj) {
        return this.m.i().equals(obj);
    }

    public final String D() {
        return this.m.i().D();
    }

    public final String toString() {
        return this.m.i().toString();
    }

    public final wpv t() {
        if (h().b()) {
            return (wpv) this.m;
        }
        throw new MessageTypeCastException();
    }

    public final wqn u() {
        if (h().numberType) {
            return (wqn) this.m;
        }
        throw new MessageTypeCastException();
    }

    public final wqk v() {
        if (h().c()) {
            return (wqk) this.m;
        }
        throw new MessageTypeCastException();
    }

    public final wpx w() {
        if (h().d()) {
            return (wpx) this.m;
        }
        throw new MessageTypeCastException();
    }

    public final wpu y() {
        if (h().f()) {
            return (wpu) this.m;
        }
        throw new MessageTypeCastException();
    }

    public final wqp z() {
        if (h().e()) {
            return (wqp) this.m;
        }
        throw new MessageTypeCastException();
    }

    public final wpt A() {
        if (h().g()) {
            return (wpt) this.m;
        }
        throw new MessageTypeCastException();
    }

    public final wql B() {
        if (h().h()) {
            return (wql) this.m;
        }
        throw new MessageTypeCastException();
    }

    public final wpw C() {
        if (h().i()) {
            return (wpw) this.m;
        }
        throw new MessageTypeCastException();
    }
}
