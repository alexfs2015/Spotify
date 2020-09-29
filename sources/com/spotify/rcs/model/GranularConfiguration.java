package com.spotify.rcs.model;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class GranularConfiguration extends GeneratedMessageLite<GranularConfiguration, a> implements vdo {
    /* access modifiers changed from: private */
    public static final GranularConfiguration h;
    private static volatile fkr<GranularConfiguration> i;
    public e<AssignedPropertyValue> d = fks.d();
    public long e;
    public String f = "";
    private int g;

    /* renamed from: com.spotify.rcs.model.GranularConfiguration$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] b = new int[StructuredValueCase.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0048 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0087 */
        static {
            /*
                com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$StructuredValueCase[] r0 = com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.StructuredValueCase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r0 = 1
                int[] r1 = b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$StructuredValueCase r2 = com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.StructuredValueCase.BOOL_VALUE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$StructuredValueCase r3 = com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.StructuredValueCase.INT_VALUE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$StructuredValueCase r4 = com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.StructuredValueCase.ENUM_VALUE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$StructuredValueCase r5 = com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.StructuredValueCase.STRUCTUREDVALUE_NOT_SET     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r4 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                a = r4
                int[] r4 = a     // Catch:{ NoSuchFieldError -> 0x0048 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r5 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0048 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0048 }
            L_0x0048:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0052 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r4 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x005c }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE     // Catch:{ NoSuchFieldError -> 0x005c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0066 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0066 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0066 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0066 }
            L_0x0066:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0071 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.VISIT     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x007c }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM     // Catch:{ NoSuchFieldError -> 0x007c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007c }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007c }
            L_0x007c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0087 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0093 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x0093 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0093 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0093 }
            L_0x0093:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.rcs.model.GranularConfiguration.AnonymousClass1.<clinit>():void");
        }
    }

    public static final class AssignedPropertyValue extends GeneratedMessageLite<AssignedPropertyValue, a> implements vdn {
        /* access modifiers changed from: private */
        public static final AssignedPropertyValue k;
        private static volatile fkr<AssignedPropertyValue> l;
        public int d = 0;
        public Object e;
        public String f;
        public long g;
        public String h;
        private int i;
        private String j;

        public static final class BoolValue extends GeneratedMessageLite<BoolValue, a> implements vdk {
            /* access modifiers changed from: private */
            public static final BoolValue e;
            private static volatile fkr<BoolValue> f;
            public boolean d;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.a<BoolValue, a> implements vdk {
                /* synthetic */ a(byte b) {
                    this();
                }

                private a() {
                    super(BoolValue.e);
                }
            }

            private BoolValue() {
            }

            public final void a(CodedOutputStream codedOutputStream) {
                boolean z = this.d;
                if (z) {
                    codedOutputStream.a(1, z);
                }
            }

            public final int j() {
                int i = this.c;
                if (i != -1) {
                    return i;
                }
                boolean z = this.d;
                int i2 = 0;
                if (z) {
                    i2 = 0 + CodedOutputStream.b(1, z);
                }
                this.c = i2;
                return i2;
            }

            public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                boolean z = false;
                switch (methodToInvoke) {
                    case NEW_MUTABLE_INSTANCE:
                        return new BoolValue();
                    case IS_INITIALIZED:
                        return e;
                    case MAKE_IMMUTABLE:
                        return null;
                    case NEW_BUILDER:
                        return new a(0);
                    case VISIT:
                        f fVar = (f) obj;
                        BoolValue boolValue = (BoolValue) obj2;
                        boolean z2 = this.d;
                        boolean z3 = boolValue.d;
                        this.d = fVar.a(z2, z2, z3, z3);
                        e eVar = e.a;
                        return this;
                    case MERGE_FROM_STREAM:
                        fkc fkc = (fkc) obj;
                        while (!z) {
                            try {
                                int a2 = fkc.a();
                                if (a2 != 0) {
                                    if (a2 == 8) {
                                        this.d = fkc.b();
                                    } else if (!fkc.b(a2)) {
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e2) {
                                e2.unfinishedMessage = this;
                                throw new RuntimeException(e2);
                            } catch (IOException e3) {
                                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                                invalidProtocolBufferException.unfinishedMessage = this;
                                throw new RuntimeException(invalidProtocolBufferException);
                            }
                        }
                        break;
                    case GET_DEFAULT_INSTANCE:
                        break;
                    case GET_PARSER:
                        if (f == null) {
                            synchronized (BoolValue.class) {
                                if (f == null) {
                                    f = new b(e);
                                }
                            }
                        }
                        return f;
                    default:
                        throw new UnsupportedOperationException();
                }
                return e;
            }

            static {
                BoolValue boolValue = new BoolValue();
                e = boolValue;
                boolValue.e();
            }

            public static BoolValue k() {
                return e;
            }

            public static fkr<BoolValue> parser() {
                return e.c();
            }
        }

        public static final class EnumValue extends GeneratedMessageLite<EnumValue, a> implements vdl {
            /* access modifiers changed from: private */
            public static final EnumValue e;
            private static volatile fkr<EnumValue> f;
            public String d = "";

            public static final class a extends com.google.protobuf.GeneratedMessageLite.a<EnumValue, a> implements vdl {
                /* synthetic */ a(byte b) {
                    this();
                }

                private a() {
                    super(EnumValue.e);
                }
            }

            private EnumValue() {
            }

            public final void a(CodedOutputStream codedOutputStream) {
                if (!this.d.isEmpty()) {
                    codedOutputStream.a(1, this.d);
                }
            }

            public final int j() {
                int i = this.c;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if (!this.d.isEmpty()) {
                    i2 = 0 + CodedOutputStream.b(1, this.d);
                }
                this.c = i2;
                return i2;
            }

            public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                boolean z = false;
                switch (methodToInvoke) {
                    case NEW_MUTABLE_INSTANCE:
                        return new EnumValue();
                    case IS_INITIALIZED:
                        return e;
                    case MAKE_IMMUTABLE:
                        return null;
                    case NEW_BUILDER:
                        return new a(0);
                    case VISIT:
                        EnumValue enumValue = (EnumValue) obj2;
                        this.d = ((f) obj).a(!this.d.isEmpty(), this.d, true ^ enumValue.d.isEmpty(), enumValue.d);
                        e eVar = e.a;
                        return this;
                    case MERGE_FROM_STREAM:
                        fkc fkc = (fkc) obj;
                        while (!z) {
                            try {
                                int a2 = fkc.a();
                                if (a2 != 0) {
                                    if (a2 == 10) {
                                        this.d = fkc.d();
                                    } else if (!fkc.b(a2)) {
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e2) {
                                e2.unfinishedMessage = this;
                                throw new RuntimeException(e2);
                            } catch (IOException e3) {
                                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                                invalidProtocolBufferException.unfinishedMessage = this;
                                throw new RuntimeException(invalidProtocolBufferException);
                            }
                        }
                        break;
                    case GET_DEFAULT_INSTANCE:
                        break;
                    case GET_PARSER:
                        if (f == null) {
                            synchronized (EnumValue.class) {
                                if (f == null) {
                                    f = new b(e);
                                }
                            }
                        }
                        return f;
                    default:
                        throw new UnsupportedOperationException();
                }
                return e;
            }

            static {
                EnumValue enumValue = new EnumValue();
                e = enumValue;
                enumValue.e();
            }

            public static EnumValue k() {
                return e;
            }

            public static fkr<EnumValue> parser() {
                return e.c();
            }
        }

        public static final class IntValue extends GeneratedMessageLite<IntValue, a> implements vdm {
            /* access modifiers changed from: private */
            public static final IntValue e;
            private static volatile fkr<IntValue> f;
            public int d;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.a<IntValue, a> implements vdm {
                /* synthetic */ a(byte b) {
                    this();
                }

                private a() {
                    super(IntValue.e);
                }
            }

            private IntValue() {
            }

            public final void a(CodedOutputStream codedOutputStream) {
                int i = this.d;
                if (i != 0) {
                    codedOutputStream.b(1, i);
                }
            }

            public final int j() {
                int i = this.c;
                if (i != -1) {
                    return i;
                }
                int i2 = this.d;
                int i3 = 0;
                if (i2 != 0) {
                    i3 = 0 + CodedOutputStream.f(1, i2);
                }
                this.c = i3;
                return i3;
            }

            public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                boolean z = true;
                boolean z2 = false;
                switch (methodToInvoke) {
                    case NEW_MUTABLE_INSTANCE:
                        return new IntValue();
                    case IS_INITIALIZED:
                        return e;
                    case MAKE_IMMUTABLE:
                        return null;
                    case NEW_BUILDER:
                        return new a(0);
                    case VISIT:
                        f fVar = (f) obj;
                        IntValue intValue = (IntValue) obj2;
                        boolean z3 = this.d != 0;
                        int i = this.d;
                        if (intValue.d == 0) {
                            z = false;
                        }
                        this.d = fVar.a(z3, i, z, intValue.d);
                        e eVar = e.a;
                        return this;
                    case MERGE_FROM_STREAM:
                        fkc fkc = (fkc) obj;
                        while (!z2) {
                            try {
                                int a2 = fkc.a();
                                if (a2 != 0) {
                                    if (a2 == 8) {
                                        this.d = fkc.g();
                                    } else if (!fkc.b(a2)) {
                                    }
                                }
                                z2 = true;
                            } catch (InvalidProtocolBufferException e2) {
                                e2.unfinishedMessage = this;
                                throw new RuntimeException(e2);
                            } catch (IOException e3) {
                                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                                invalidProtocolBufferException.unfinishedMessage = this;
                                throw new RuntimeException(invalidProtocolBufferException);
                            }
                        }
                        break;
                    case GET_DEFAULT_INSTANCE:
                        break;
                    case GET_PARSER:
                        if (f == null) {
                            synchronized (IntValue.class) {
                                if (f == null) {
                                    f = new b(e);
                                }
                            }
                        }
                        return f;
                    default:
                        throw new UnsupportedOperationException();
                }
                return e;
            }

            static {
                IntValue intValue = new IntValue();
                e = intValue;
                intValue.e();
            }

            public static IntValue k() {
                return e;
            }

            public static fkr<IntValue> parser() {
                return e.c();
            }
        }

        public enum StructuredValueCase implements b {
            BOOL_VALUE(1),
            INT_VALUE(2),
            ENUM_VALUE(3),
            STRUCTUREDVALUE_NOT_SET(0);
            
            private final int value;

            private StructuredValueCase(int i) {
                this.value = i;
            }

            public static StructuredValueCase a(int i) {
                if (i == 0) {
                    return STRUCTUREDVALUE_NOT_SET;
                }
                if (i == 1) {
                    return BOOL_VALUE;
                }
                if (i == 2) {
                    return INT_VALUE;
                }
                if (i != 3) {
                    return null;
                }
                return ENUM_VALUE;
            }

            public final int a() {
                return this.value;
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<AssignedPropertyValue, a> implements vdn {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(AssignedPropertyValue.k);
            }
        }

        private AssignedPropertyValue() {
            String str = "";
            this.j = str;
            this.f = str;
            this.h = str;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if (this.d == 1) {
                codedOutputStream.a(1, (fko) (BoolValue) this.e);
            }
            if (this.d == 2) {
                codedOutputStream.a(2, (fko) (IntValue) this.e);
            }
            if (this.d == 3) {
                codedOutputStream.a(3, (fko) (EnumValue) this.e);
            }
            if (!this.j.isEmpty()) {
                codedOutputStream.a(4, this.j);
            }
            if (!this.f.isEmpty()) {
                codedOutputStream.a(5, this.f);
            }
            if (!this.h.isEmpty()) {
                codedOutputStream.a(6, this.h);
            }
            if (this.i != Platform.UNKNOWN.value) {
                codedOutputStream.b(7, this.i);
            }
            long j2 = this.g;
            if (j2 != 0) {
                codedOutputStream.a(8, j2);
            }
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if (this.d == 1) {
                i3 = 0 + CodedOutputStream.b(1, (fko) (BoolValue) this.e);
            }
            if (this.d == 2) {
                i3 += CodedOutputStream.b(2, (fko) (IntValue) this.e);
            }
            if (this.d == 3) {
                i3 += CodedOutputStream.b(3, (fko) (EnumValue) this.e);
            }
            if (!this.j.isEmpty()) {
                i3 += CodedOutputStream.b(4, this.j);
            }
            if (!this.f.isEmpty()) {
                i3 += CodedOutputStream.b(5, this.f);
            }
            if (!this.h.isEmpty()) {
                i3 += CodedOutputStream.b(6, this.h);
            }
            if (this.i != Platform.UNKNOWN.value) {
                i3 += CodedOutputStream.j(7, this.i);
            }
            long j2 = this.g;
            if (j2 != 0) {
                i3 += CodedOutputStream.c(8, j2);
            }
            this.c = i3;
            return i3;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new AssignedPropertyValue();
                case IS_INITIALIZED:
                    return k;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    AssignedPropertyValue assignedPropertyValue = (AssignedPropertyValue) obj2;
                    this.i = fVar.a(this.i != 0, this.i, assignedPropertyValue.i != 0, assignedPropertyValue.i);
                    this.j = fVar.a(!this.j.isEmpty(), this.j, !assignedPropertyValue.j.isEmpty(), assignedPropertyValue.j);
                    this.f = fVar.a(!this.f.isEmpty(), this.f, !assignedPropertyValue.f.isEmpty(), assignedPropertyValue.f);
                    this.g = fVar.a(this.g != 0, this.g, assignedPropertyValue.g != 0, assignedPropertyValue.g);
                    this.h = fVar.a(!this.h.isEmpty(), this.h, !assignedPropertyValue.h.isEmpty(), assignedPropertyValue.h);
                    int i2 = AnonymousClass1.b[StructuredValueCase.a(assignedPropertyValue.d).ordinal()];
                    if (i2 == 1) {
                        if (this.d == 1) {
                            z = true;
                        }
                        this.e = fVar.e(z, this.e, assignedPropertyValue.e);
                    } else if (i2 == 2) {
                        if (this.d == 2) {
                            z = true;
                        }
                        this.e = fVar.e(z, this.e, assignedPropertyValue.e);
                    } else if (i2 == 3) {
                        if (this.d == 3) {
                            z = true;
                        }
                        this.e = fVar.e(z, this.e, assignedPropertyValue.e);
                    } else if (i2 == 4) {
                        if (this.d != 0) {
                            z = true;
                        }
                        fVar.a(z);
                    }
                    if (fVar == e.a) {
                        int i3 = assignedPropertyValue.d;
                        if (i3 != 0) {
                            this.d = i3;
                        }
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    fke fke = (fke) obj2;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    a aVar = this.d == 1 ? (a) ((BoolValue) this.e).h() : null;
                                    this.e = fkc.a(BoolValue.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a((BoolValue) this.e);
                                        this.e = aVar.e();
                                    }
                                    this.d = 1;
                                } else if (a2 == 18) {
                                    a aVar2 = this.d == 2 ? (a) ((IntValue) this.e).h() : null;
                                    this.e = fkc.a(IntValue.parser(), fke);
                                    if (aVar2 != null) {
                                        aVar2.a((IntValue) this.e);
                                        this.e = aVar2.e();
                                    }
                                    this.d = 2;
                                } else if (a2 == 26) {
                                    a aVar3 = this.d == 3 ? (a) ((EnumValue) this.e).h() : null;
                                    this.e = fkc.a(EnumValue.parser(), fke);
                                    if (aVar3 != null) {
                                        aVar3.a((EnumValue) this.e);
                                        this.e = aVar3.e();
                                    }
                                    this.d = 3;
                                } else if (a2 == 34) {
                                    this.j = fkc.d();
                                } else if (a2 == 42) {
                                    this.f = fkc.d();
                                } else if (a2 == 50) {
                                    this.h = fkc.d();
                                } else if (a2 == 56) {
                                    this.i = fkc.g();
                                } else if (a2 == 64) {
                                    this.g = fkc.h();
                                } else if (!fkc.b(a2)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e2) {
                            e2.unfinishedMessage = this;
                            throw new RuntimeException(e2);
                        } catch (IOException e3) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                            invalidProtocolBufferException.unfinishedMessage = this;
                            throw new RuntimeException(invalidProtocolBufferException);
                        }
                    }
                    break;
                case GET_DEFAULT_INSTANCE:
                    break;
                case GET_PARSER:
                    if (l == null) {
                        synchronized (AssignedPropertyValue.class) {
                            if (l == null) {
                                l = new b(k);
                            }
                        }
                    }
                    return l;
                default:
                    throw new UnsupportedOperationException();
            }
            return k;
        }

        static {
            AssignedPropertyValue assignedPropertyValue = new AssignedPropertyValue();
            k = assignedPropertyValue;
            assignedPropertyValue.e();
        }

        public static fkr<AssignedPropertyValue> parser() {
            return k.c();
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<GranularConfiguration, a> implements vdo {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(GranularConfiguration.h);
        }

        public final a a(Iterable<? extends AssignedPropertyValue> iterable) {
            b();
            GranularConfiguration.a((GranularConfiguration) this.a, iterable);
            return this;
        }
    }

    private GranularConfiguration() {
    }

    public final void a(CodedOutputStream codedOutputStream) {
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            codedOutputStream.a(1, (fko) this.d.get(i2));
        }
        long j = this.e;
        if (j != 0) {
            codedOutputStream.a(2, j);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.a(3, this.f);
        }
    }

    public final int j() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.d.size(); i4++) {
            i3 += CodedOutputStream.b(1, (fko) this.d.get(i4));
        }
        long j = this.e;
        if (j != 0) {
            i3 += CodedOutputStream.c(2, j);
        }
        if (!this.f.isEmpty()) {
            i3 += CodedOutputStream.b(3, this.f);
        }
        this.c = i3;
        return i3;
    }

    public static GranularConfiguration a(byte[] bArr) {
        return (GranularConfiguration) GeneratedMessageLite.a(h, bArr);
    }

    public static a k() {
        return (a) h.h();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new GranularConfiguration();
            case IS_INITIALIZED:
                return h;
            case MAKE_IMMUTABLE:
                this.d.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                GranularConfiguration granularConfiguration = (GranularConfiguration) obj2;
                this.d = fVar.a(this.d, granularConfiguration.d);
                boolean z2 = this.e != 0;
                long j = this.e;
                if (granularConfiguration.e != 0) {
                    z = true;
                }
                this.e = fVar.a(z2, j, z, granularConfiguration.e);
                this.f = fVar.a(!this.f.isEmpty(), this.f, true ^ granularConfiguration.f.isEmpty(), granularConfiguration.f);
                if (fVar == e.a) {
                    this.g |= granularConfiguration.g;
                }
                return this;
            case MERGE_FROM_STREAM:
                fkc fkc = (fkc) obj;
                fke fke = (fke) obj2;
                while (!z) {
                    try {
                        int a2 = fkc.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                if (!this.d.a()) {
                                    this.d = GeneratedMessageLite.a(this.d);
                                }
                                this.d.add(fkc.a(AssignedPropertyValue.parser(), fke));
                            } else if (a2 == 16) {
                                this.e = fkc.h();
                            } else if (a2 == 26) {
                                this.f = fkc.d();
                            } else if (!fkc.b(a2)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        e2.unfinishedMessage = this;
                        throw new RuntimeException(e2);
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                        invalidProtocolBufferException.unfinishedMessage = this;
                        throw new RuntimeException(invalidProtocolBufferException);
                    }
                }
                break;
            case GET_DEFAULT_INSTANCE:
                break;
            case GET_PARSER:
                if (i == null) {
                    synchronized (GranularConfiguration.class) {
                        if (i == null) {
                            i = new b(h);
                        }
                    }
                }
                return i;
            default:
                throw new UnsupportedOperationException();
        }
        return h;
    }

    static {
        GranularConfiguration granularConfiguration = new GranularConfiguration();
        h = granularConfiguration;
        granularConfiguration.e();
    }

    public static fkr<GranularConfiguration> parser() {
        return h.c();
    }

    static /* synthetic */ void a(GranularConfiguration granularConfiguration, Iterable iterable) {
        if (!granularConfiguration.d.a()) {
            granularConfiguration.d = GeneratedMessageLite.a(granularConfiguration.d);
        }
        fjx.a(iterable, granularConfiguration.d);
    }
}
