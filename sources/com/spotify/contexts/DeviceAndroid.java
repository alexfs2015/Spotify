package com.spotify.contexts;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class DeviceAndroid extends GeneratedMessageLite<DeviceAndroid, a> implements gck {
    /* access modifiers changed from: private */
    public static final DeviceAndroid j;
    private static volatile fkr<DeviceAndroid> k;
    private int d;
    private String e;
    private String f;
    private String g;
    private int h;
    private String i;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<DeviceAndroid, a> implements gck {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(DeviceAndroid.j);
        }

        public final a a(String str) {
            b();
            DeviceAndroid.a((DeviceAndroid) this.a, str);
            return this;
        }

        public final a b(String str) {
            b();
            DeviceAndroid.b((DeviceAndroid) this.a, str);
            return this;
        }

        public final a c(String str) {
            b();
            DeviceAndroid.c((DeviceAndroid) this.a, str);
            return this;
        }

        public final a a(int i) {
            b();
            DeviceAndroid.a((DeviceAndroid) this.a, i);
            return this;
        }

        public final a d(String str) {
            b();
            DeviceAndroid.d((DeviceAndroid) this.a, str);
            return this;
        }
    }

    private DeviceAndroid() {
        String str = "";
        this.e = str;
        this.f = str;
        this.g = str;
        this.i = str;
    }

    private boolean m() {
        return (this.d & 1) == 1;
    }

    private boolean n() {
        return (this.d & 2) == 2;
    }

    private boolean o() {
        return (this.d & 4) == 4;
    }

    private boolean p() {
        return (this.d & 8) == 8;
    }

    private boolean q() {
        return (this.d & 16) == 16;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        if ((this.d & 1) == 1) {
            codedOutputStream.a(1, this.e);
        }
        if ((this.d & 2) == 2) {
            codedOutputStream.a(2, this.f);
        }
        if ((this.d & 4) == 4) {
            codedOutputStream.a(3, this.g);
        }
        if ((this.d & 8) == 8) {
            codedOutputStream.b(4, this.h);
        }
        if ((this.d & 16) == 16) {
            codedOutputStream.a(5, this.i);
        }
        this.b.a(codedOutputStream);
    }

    public final int j() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.d & 1) == 1) {
            i3 = 0 + CodedOutputStream.b(1, this.e);
        }
        if ((this.d & 2) == 2) {
            i3 += CodedOutputStream.b(2, this.f);
        }
        if ((this.d & 4) == 4) {
            i3 += CodedOutputStream.b(3, this.g);
        }
        if ((this.d & 8) == 8) {
            i3 += CodedOutputStream.f(4, this.h);
        }
        if ((this.d & 16) == 16) {
            i3 += CodedOutputStream.b(5, this.i);
        }
        int d2 = i3 + this.b.d();
        this.c = d2;
        return d2;
    }

    public static a k() {
        return (a) j.h();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new DeviceAndroid();
            case IS_INITIALIZED:
                return j;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                DeviceAndroid deviceAndroid = (DeviceAndroid) obj2;
                this.e = fVar.a(m(), this.e, deviceAndroid.m(), deviceAndroid.e);
                this.f = fVar.a(n(), this.f, deviceAndroid.n(), deviceAndroid.f);
                this.g = fVar.a(o(), this.g, deviceAndroid.o(), deviceAndroid.g);
                this.h = fVar.a(p(), this.h, deviceAndroid.p(), deviceAndroid.h);
                this.i = fVar.a(q(), this.i, deviceAndroid.q(), deviceAndroid.i);
                if (fVar == e.a) {
                    this.d |= deviceAndroid.d;
                }
                return this;
            case MERGE_FROM_STREAM:
                fkc fkc = (fkc) obj;
                while (!z) {
                    try {
                        int a2 = fkc.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                String c = fkc.c();
                                this.d |= 1;
                                this.e = c;
                            } else if (a2 == 18) {
                                String c2 = fkc.c();
                                this.d |= 2;
                                this.f = c2;
                            } else if (a2 == 26) {
                                String c3 = fkc.c();
                                this.d |= 4;
                                this.g = c3;
                            } else if (a2 == 32) {
                                this.d |= 8;
                                this.h = fkc.g();
                            } else if (a2 == 42) {
                                String c4 = fkc.c();
                                this.d |= 16;
                                this.i = c4;
                            } else if (!a(a2, fkc)) {
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
                if (k == null) {
                    synchronized (DeviceAndroid.class) {
                        if (k == null) {
                            k = new b(j);
                        }
                    }
                }
                return k;
            default:
                throw new UnsupportedOperationException();
        }
        return j;
    }

    static {
        DeviceAndroid deviceAndroid = new DeviceAndroid();
        j = deviceAndroid;
        deviceAndroid.e();
    }

    public static fkr<DeviceAndroid> parser() {
        return j.c();
    }

    static /* synthetic */ void a(DeviceAndroid deviceAndroid, String str) {
        if (str != null) {
            deviceAndroid.d |= 1;
            deviceAndroid.e = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void b(DeviceAndroid deviceAndroid, String str) {
        if (str != null) {
            deviceAndroid.d |= 2;
            deviceAndroid.f = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void c(DeviceAndroid deviceAndroid, String str) {
        if (str != null) {
            deviceAndroid.d |= 4;
            deviceAndroid.g = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void a(DeviceAndroid deviceAndroid, int i2) {
        deviceAndroid.d |= 8;
        deviceAndroid.h = i2;
    }

    static /* synthetic */ void d(DeviceAndroid deviceAndroid, String str) {
        if (str != null) {
            deviceAndroid.d |= 16;
            deviceAndroid.i = str;
            return;
        }
        throw new NullPointerException();
    }
}
