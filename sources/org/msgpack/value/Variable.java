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

public final class Variable implements xev {
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

    abstract class a extends c implements xes {
        private a() {
            super(Variable.this, 0);
        }

        /* synthetic */ a(Variable variable, byte b) {
            this();
        }

        public final int bk_() {
            return Variable.this.i == Type.BIG_INTEGER ? ((BigInteger) Variable.this.l).intValue() : (int) Variable.this.j;
        }

        public final long bl_() {
            return Variable.this.i == Type.BIG_INTEGER ? ((BigInteger) Variable.this.l).longValue() : Variable.this.j;
        }

        public final BigInteger bm_() {
            return Variable.this.i == Type.BIG_INTEGER ? (BigInteger) Variable.this.l : Variable.this.i == Type.DOUBLE ? new BigDecimal(Variable.this.k).toBigInteger() : BigInteger.valueOf(Variable.this.j);
        }

        public final float bn_() {
            return Variable.this.i == Type.BIG_INTEGER ? ((BigInteger) Variable.this.l).floatValue() : Variable.this.i == Type.DOUBLE ? (float) Variable.this.k : (float) Variable.this.j;
        }

        public final double bo_() {
            return Variable.this.i == Type.BIG_INTEGER ? ((BigInteger) Variable.this.l).doubleValue() : Variable.this.i == Type.DOUBLE ? Variable.this.k : (double) Variable.this.j;
        }

        public final xes u() {
            return this;
        }
    }

    abstract class b extends c implements xet {
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
                return xdr.a.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).decode(ByteBuffer.wrap((byte[]) Variable.this.l)).toString();
            } catch (CharacterCodingException e) {
                throw new MessageStringCodingException(e);
            }
        }

        public final xet x() {
            return this;
        }
    }

    abstract class c implements xev {
        private c() {
        }

        /* synthetic */ c(Variable variable, byte b) {
            this();
        }

        public xdy A() {
            throw new MessageTypeCastException();
        }

        public xeq B() {
            throw new MessageTypeCastException();
        }

        public xeb C() {
            throw new MessageTypeCastException();
        }

        public final String D() {
            return Variable.this.D();
        }

        public boolean equals(Object obj) {
            return Variable.this.equals(obj);
        }

        public int hashCode() {
            return Variable.this.hashCode();
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

        public xea t() {
            throw new MessageTypeCastException();
        }

        public String toString() {
            return Variable.this.toString();
        }

        public xes u() {
            throw new MessageTypeCastException();
        }

        public xep v() {
            throw new MessageTypeCastException();
        }

        public xec w() {
            throw new MessageTypeCastException();
        }

        public xet x() {
            throw new MessageTypeCastException();
        }

        public xdz y() {
            throw new MessageTypeCastException();
        }

        public xeu z() {
            throw new MessageTypeCastException();
        }
    }

    class d extends c implements xdy {
        private d() {
            super(Variable.this, 0);
        }

        /* synthetic */ d(Variable variable, byte b) {
            this();
        }

        private List<xev> b() {
            return (List) Variable.this.l;
        }

        public final xdy A() {
            return this;
        }

        public final int a() {
            return b().size();
        }

        public final ValueType h() {
            return ValueType.ARRAY;
        }

        public final /* synthetic */ xeo i() {
            List b = b();
            return b.isEmpty() ? xez.I() : new xez((xev[]) b.toArray(new xev[b.size()]));
        }

        public final Iterator<xev> iterator() {
            return b().iterator();
        }
    }

    class e extends b implements xdz {
        private e() {
            super(Variable.this, 0);
        }

        /* synthetic */ e(Variable variable, byte b) {
            this();
        }

        public final ValueType h() {
            return ValueType.BINARY;
        }

        public final /* synthetic */ xeo i() {
            return xew.a(a());
        }

        public final xdz y() {
            return this;
        }
    }

    class f extends c implements xea {
        private f() {
            super(Variable.this, 0);
        }

        /* synthetic */ f(Variable variable, byte b) {
            this();
        }

        public final boolean a() {
            return Variable.this.j == 1;
        }

        public final ValueType h() {
            return ValueType.BOOLEAN;
        }

        public final /* synthetic */ xeo i() {
            return xew.a(a());
        }

        public final xea t() {
            return this;
        }
    }

    class g extends c implements xeb {
        private g() {
            super(Variable.this, 0);
        }

        /* synthetic */ g(Variable variable, byte b) {
            this();
        }

        public final xeb C() {
            return this;
        }

        public final byte a() {
            return ((xeg) Variable.this.l).a();
        }

        public final byte[] bq_() {
            return ((xeg) Variable.this.l).bq_();
        }

        public final ValueType h() {
            return ValueType.EXTENSION;
        }

        public final /* synthetic */ xeo i() {
            return (xeg) Variable.this.l;
        }
    }

    class h extends a implements xec {
        private h() {
            super(Variable.this, 0);
        }

        /* synthetic */ h(Variable variable, byte b) {
            this();
        }

        public final ValueType h() {
            return ValueType.FLOAT;
        }

        public final /* synthetic */ xeo i() {
            return xew.a(Variable.this.k);
        }

        public final xec w() {
            return this;
        }
    }

    class i extends a implements xep {
        private i() {
            super(Variable.this, 0);
        }

        /* synthetic */ i(Variable variable, byte b) {
            this();
        }

        public final boolean a() {
            return Variable.this.i != Type.BIG_INTEGER && -2147483648L <= Variable.this.j && Variable.this.j <= 2147483647L;
        }

        public final boolean bp_() {
            return Variable.this.i != Type.BIG_INTEGER;
        }

        public final ValueType h() {
            return ValueType.INTEGER;
        }

        public final /* synthetic */ xeo i() {
            return Variable.this.i == Type.BIG_INTEGER ? xew.a((BigInteger) Variable.this.l) : xew.a(Variable.this.j);
        }

        public final xep v() {
            return this;
        }
    }

    class j extends c implements xeq {
        private j() {
            super(Variable.this, 0);
        }

        /* synthetic */ j(Variable variable, byte b) {
            this();
        }

        public final xeq B() {
            return this;
        }

        public final Map<xev, xev> a() {
            return (Map) Variable.this.l;
        }

        public final ValueType h() {
            return ValueType.MAP;
        }

        public final /* synthetic */ xeo i() {
            Map a2 = a();
            xev[] xevArr = new xev[(a2.size() << 1)];
            int i = 0;
            for (Entry entry : a2.entrySet()) {
                xevArr[i] = (xev) entry.getKey();
                int i2 = i + 1;
                xevArr[i2] = (xev) entry.getValue();
                i = i2 + 1;
            }
            return xew.a(xevArr);
        }
    }

    class k extends c implements xer {
        private k() {
            super(Variable.this, 0);
        }

        /* synthetic */ k(Variable variable, byte b) {
            this();
        }

        public final ValueType h() {
            return ValueType.NIL;
        }

        public final /* synthetic */ xeo i() {
            return xfh.a();
        }
    }

    class l extends b implements xeu {
        private l() {
            super(Variable.this, 0);
        }

        /* synthetic */ l(Variable variable, byte b) {
            this();
        }

        public final ValueType h() {
            return ValueType.STRING;
        }

        public final /* synthetic */ xeo i() {
            return xew.b((byte[]) Variable.this.l);
        }

        public final xeu z() {
            return this;
        }
    }

    public Variable() {
        a();
    }

    public final xdy A() {
        if (h().g()) {
            return (xdy) this.m;
        }
        throw new MessageTypeCastException();
    }

    public final xeq B() {
        if (h().h()) {
            return (xeq) this.m;
        }
        throw new MessageTypeCastException();
    }

    public final xeb C() {
        if (h().i()) {
            return (xeb) this.m;
        }
        throw new MessageTypeCastException();
    }

    public final String D() {
        return this.m.i().D();
    }

    public final Variable a() {
        this.i = Type.NULL;
        this.m = this.p;
        return this;
    }

    public final boolean equals(Object obj) {
        return this.m.i().equals(obj);
    }

    public final ValueType h() {
        return this.i.valueType;
    }

    public final int hashCode() {
        return this.m.i().hashCode();
    }

    public final xeo i() {
        return this.m.i();
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

    public final xea t() {
        if (h().b()) {
            return (xea) this.m;
        }
        throw new MessageTypeCastException();
    }

    public final String toString() {
        return this.m.i().toString();
    }

    public final xes u() {
        if (h().numberType) {
            return (xes) this.m;
        }
        throw new MessageTypeCastException();
    }

    public final xep v() {
        if (h().c()) {
            return (xep) this.m;
        }
        throw new MessageTypeCastException();
    }

    public final xec w() {
        if (h().d()) {
            return (xec) this.m;
        }
        throw new MessageTypeCastException();
    }

    public final xet x() {
        if (n()) {
            return (xet) this.m;
        }
        throw new MessageTypeCastException();
    }

    public final xdz y() {
        if (h().f()) {
            return (xdz) this.m;
        }
        throw new MessageTypeCastException();
    }

    public final xeu z() {
        if (h().e()) {
            return (xeu) this.m;
        }
        throw new MessageTypeCastException();
    }
}
