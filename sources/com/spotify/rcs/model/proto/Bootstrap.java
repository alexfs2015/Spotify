package com.spotify.rcs.model.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class Bootstrap {

    /* renamed from: com.spotify.rcs.model.proto.Bootstrap$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[RemoteConfigRequestCase.values().length];
        static final /* synthetic */ int[] c = new int[RemoteConfigResponseCase.values().length];
        static final /* synthetic */ int[] d = new int[ResultCase.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(2:33|34)|35|37|38|(3:39|40|42)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|37|38|(3:39|40|42)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|37|38|39|40|42) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x009a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00b9 */
        static {
            /*
                com.spotify.rcs.model.proto.Bootstrap$RemoteConfigResponseV1$ResultCase[] r0 = com.spotify.rcs.model.proto.Bootstrap.RemoteConfigResponseV1.ResultCase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                d = r0
                r0 = 1
                int[] r1 = d     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.rcs.model.proto.Bootstrap$RemoteConfigResponseV1$ResultCase r2 = com.spotify.rcs.model.proto.Bootstrap.RemoteConfigResponseV1.ResultCase.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = d     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.rcs.model.proto.Bootstrap$RemoteConfigResponseV1$ResultCase r3 = com.spotify.rcs.model.proto.Bootstrap.RemoteConfigResponseV1.ResultCase.ERROR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = d     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.rcs.model.proto.Bootstrap$RemoteConfigResponseV1$ResultCase r4 = com.spotify.rcs.model.proto.Bootstrap.RemoteConfigResponseV1.ResultCase.RESULT_NOT_SET     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.spotify.rcs.model.proto.Bootstrap$BootstrapResponse$RemoteConfigResponseCase[] r3 = com.spotify.rcs.model.proto.Bootstrap.BootstrapResponse.RemoteConfigResponseCase.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                c = r3
                int[] r3 = c     // Catch:{ NoSuchFieldError -> 0x003d }
                com.spotify.rcs.model.proto.Bootstrap$BootstrapResponse$RemoteConfigResponseCase r4 = com.spotify.rcs.model.proto.Bootstrap.BootstrapResponse.RemoteConfigResponseCase.REMOTE_CONFIG_RESPONSE_V1     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                int[] r3 = c     // Catch:{ NoSuchFieldError -> 0x0047 }
                com.spotify.rcs.model.proto.Bootstrap$BootstrapResponse$RemoteConfigResponseCase r4 = com.spotify.rcs.model.proto.Bootstrap.BootstrapResponse.RemoteConfigResponseCase.REMOTECONFIGRESPONSE_NOT_SET     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r3 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                b = r3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x005a }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r4 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x005a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r4 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x006e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r4 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x0079 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r3 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r3 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.VISIT     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r4 = 5
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x008f }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r3 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM     // Catch:{ NoSuchFieldError -> 0x008f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r4 = 6
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x009a }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r3 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x009a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x009a }
                r4 = 7
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x009a }
            L_0x009a:
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x00a6 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r3 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x00a6 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a6 }
                r4 = 8
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00a6 }
            L_0x00a6:
                com.spotify.rcs.model.proto.Bootstrap$BootstrapRequest$RemoteConfigRequestCase[] r2 = com.spotify.rcs.model.proto.Bootstrap.BootstrapRequest.RemoteConfigRequestCase.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                a = r2
                int[] r2 = a     // Catch:{ NoSuchFieldError -> 0x00b9 }
                com.spotify.rcs.model.proto.Bootstrap$BootstrapRequest$RemoteConfigRequestCase r3 = com.spotify.rcs.model.proto.Bootstrap.BootstrapRequest.RemoteConfigRequestCase.REMOTE_CONFIG_REQUEST_V1     // Catch:{ NoSuchFieldError -> 0x00b9 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b9 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x00b9 }
            L_0x00b9:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00c3 }
                com.spotify.rcs.model.proto.Bootstrap$BootstrapRequest$RemoteConfigRequestCase r2 = com.spotify.rcs.model.proto.Bootstrap.BootstrapRequest.RemoteConfigRequestCase.REMOTECONFIGREQUEST_NOT_SET     // Catch:{ NoSuchFieldError -> 0x00c3 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c3 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x00c3 }
            L_0x00c3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.rcs.model.proto.Bootstrap.AnonymousClass1.<clinit>():void");
        }
    }

    public static final class BootstrapRequest extends GeneratedMessageLite<BootstrapRequest, a> implements vqn {
        /* access modifiers changed from: private */
        public static final BootstrapRequest f;
        private static volatile fll<BootstrapRequest> g;
        private int d = 0;
        private Object e;

        public enum RemoteConfigRequestCase implements b {
            REMOTE_CONFIG_REQUEST_V1(1),
            REMOTECONFIGREQUEST_NOT_SET(0);
            
            private final int value;

            private RemoteConfigRequestCase(int i) {
                this.value = i;
            }

            public static RemoteConfigRequestCase a(int i) {
                if (i == 0) {
                    return REMOTECONFIGREQUEST_NOT_SET;
                }
                if (i != 1) {
                    return null;
                }
                return REMOTE_CONFIG_REQUEST_V1;
            }

            public final int a() {
                return this.value;
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<BootstrapRequest, a> implements vqn {
            private a() {
                super(BootstrapRequest.f);
            }

            /* synthetic */ a(byte b) {
                this();
            }

            public final a a(RemoteConfigRequestV1 remoteConfigRequestV1) {
                b();
                BootstrapRequest.a((BootstrapRequest) this.a, remoteConfigRequestV1);
                return this;
            }
        }

        static {
            BootstrapRequest bootstrapRequest = new BootstrapRequest();
            f = bootstrapRequest;
            bootstrapRequest.e();
        }

        private BootstrapRequest() {
        }

        static /* synthetic */ void a(BootstrapRequest bootstrapRequest, RemoteConfigRequestV1 remoteConfigRequestV1) {
            if (remoteConfigRequestV1 != null) {
                bootstrapRequest.e = remoteConfigRequestV1;
                bootstrapRequest.d = 1;
                return;
            }
            throw new NullPointerException();
        }

        public static a k() {
            return (a) f.h();
        }

        public static fll<BootstrapRequest> parser() {
            return f.c();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new BootstrapRequest();
                case IS_INITIALIZED:
                    return f;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    BootstrapRequest bootstrapRequest = (BootstrapRequest) obj2;
                    int i = AnonymousClass1.a[RemoteConfigRequestCase.a(bootstrapRequest.d).ordinal()];
                    if (i == 1) {
                        if (this.d == 1) {
                            z = true;
                        }
                        this.e = fVar.e(z, this.e, bootstrapRequest.e);
                    } else if (i == 2) {
                        if (this.d != 0) {
                            z = true;
                        }
                        fVar.a(z);
                    }
                    if (fVar == e.a) {
                        int i2 = bootstrapRequest.d;
                        if (i2 != 0) {
                            this.d = i2;
                        }
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkw fkw = (fkw) obj;
                    fky fky = (fky) obj2;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    a aVar = this.d == 1 ? (a) ((RemoteConfigRequestV1) this.e).h() : null;
                                    this.e = fkw.a(RemoteConfigRequestV1.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a((RemoteConfigRequestV1) this.e);
                                        this.e = aVar.e();
                                    }
                                    this.d = 1;
                                } else if (!fkw.b(a2)) {
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
                    if (g == null) {
                        synchronized (BootstrapRequest.class) {
                            if (g == null) {
                                g = new b(f);
                            }
                        }
                    }
                    return g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if (this.d == 1) {
                codedOutputStream.a(1, (fli) (RemoteConfigRequestV1) this.e);
            }
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.d == 1) {
                i2 = 0 + CodedOutputStream.b(1, (fli) (RemoteConfigRequestV1) this.e);
            }
            this.c = i2;
            return i2;
        }
    }

    public static final class BootstrapResponse extends GeneratedMessageLite<BootstrapResponse, a> implements vqo {
        /* access modifiers changed from: private */
        public static final BootstrapResponse f;
        private static volatile fll<BootstrapResponse> g;
        public int d = 0;
        private Object e;

        public enum RemoteConfigResponseCase implements b {
            REMOTE_CONFIG_RESPONSE_V1(1),
            REMOTECONFIGRESPONSE_NOT_SET(0);
            
            private final int value;

            private RemoteConfigResponseCase(int i) {
                this.value = i;
            }

            public static RemoteConfigResponseCase a(int i) {
                if (i == 0) {
                    return REMOTECONFIGRESPONSE_NOT_SET;
                }
                if (i != 1) {
                    return null;
                }
                return REMOTE_CONFIG_RESPONSE_V1;
            }

            public final int a() {
                return this.value;
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<BootstrapResponse, a> implements vqo {
            private a() {
                super(BootstrapResponse.f);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            BootstrapResponse bootstrapResponse = new BootstrapResponse();
            f = bootstrapResponse;
            bootstrapResponse.e();
        }

        private BootstrapResponse() {
        }

        public static fll<BootstrapResponse> parser() {
            return f.c();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new BootstrapResponse();
                case IS_INITIALIZED:
                    return f;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    BootstrapResponse bootstrapResponse = (BootstrapResponse) obj2;
                    int i = AnonymousClass1.c[RemoteConfigResponseCase.a(bootstrapResponse.d).ordinal()];
                    if (i == 1) {
                        if (this.d == 1) {
                            z = true;
                        }
                        this.e = fVar.e(z, this.e, bootstrapResponse.e);
                    } else if (i == 2) {
                        if (this.d != 0) {
                            z = true;
                        }
                        fVar.a(z);
                    }
                    if (fVar == e.a) {
                        int i2 = bootstrapResponse.d;
                        if (i2 != 0) {
                            this.d = i2;
                        }
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkw fkw = (fkw) obj;
                    fky fky = (fky) obj2;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    a aVar = this.d == 1 ? (a) ((RemoteConfigResponseV1) this.e).h() : null;
                                    this.e = fkw.a(RemoteConfigResponseV1.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a((RemoteConfigResponseV1) this.e);
                                        this.e = aVar.e();
                                    }
                                    this.d = 1;
                                } else if (!fkw.b(a2)) {
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
                    if (g == null) {
                        synchronized (BootstrapResponse.class) {
                            if (g == null) {
                                g = new b(f);
                            }
                        }
                    }
                    return g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if (this.d == 1) {
                codedOutputStream.a(1, (fli) (RemoteConfigResponseV1) this.e);
            }
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.d == 1) {
                i2 = 0 + CodedOutputStream.b(1, (fli) (RemoteConfigResponseV1) this.e);
            }
            this.c = i2;
            return i2;
        }

        public final RemoteConfigResponseV1 k() {
            return this.d == 1 ? (RemoteConfigResponseV1) this.e : RemoteConfigResponseV1.k();
        }
    }

    public static final class RemoteConfigRequestV1 extends GeneratedMessageLite<RemoteConfigRequestV1, a> implements vqp {
        /* access modifiers changed from: private */
        public static final RemoteConfigRequestV1 i;
        private static volatile fll<RemoteConfigRequestV1> j;
        private int d;
        private String e;
        private String f;
        private String g;
        private String h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<RemoteConfigRequestV1, a> implements vqp {
            private a() {
                super(RemoteConfigRequestV1.i);
            }

            /* synthetic */ a(byte b) {
                this();
            }

            public final a a(Platform platform) {
                b();
                RemoteConfigRequestV1.a((RemoteConfigRequestV1) this.a, platform);
                return this;
            }

            public final a a(String str) {
                b();
                RemoteConfigRequestV1.a((RemoteConfigRequestV1) this.a, str);
                return this;
            }

            public final a b(String str) {
                b();
                RemoteConfigRequestV1.b((RemoteConfigRequestV1) this.a, str);
                return this;
            }

            public final a c(String str) {
                b();
                RemoteConfigRequestV1.c((RemoteConfigRequestV1) this.a, str);
                return this;
            }

            public final a d(String str) {
                b();
                RemoteConfigRequestV1.d((RemoteConfigRequestV1) this.a, str);
                return this;
            }
        }

        static {
            RemoteConfigRequestV1 remoteConfigRequestV1 = new RemoteConfigRequestV1();
            i = remoteConfigRequestV1;
            remoteConfigRequestV1.e();
        }

        private RemoteConfigRequestV1() {
            String str = "";
            this.e = str;
            this.f = str;
            this.g = str;
            this.h = str;
        }

        static /* synthetic */ void a(RemoteConfigRequestV1 remoteConfigRequestV1, Platform platform) {
            if (platform != null) {
                remoteConfigRequestV1.d = platform.value;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(RemoteConfigRequestV1 remoteConfigRequestV1, String str) {
            if (str != null) {
                remoteConfigRequestV1.e = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void b(RemoteConfigRequestV1 remoteConfigRequestV1, String str) {
            if (str != null) {
                remoteConfigRequestV1.f = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void c(RemoteConfigRequestV1 remoteConfigRequestV1, String str) {
            if (str != null) {
                remoteConfigRequestV1.g = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void d(RemoteConfigRequestV1 remoteConfigRequestV1, String str) {
            if (str != null) {
                remoteConfigRequestV1.h = str;
                return;
            }
            throw new NullPointerException();
        }

        public static a k() {
            return (a) i.h();
        }

        public static fll<RemoteConfigRequestV1> parser() {
            return i.c();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new RemoteConfigRequestV1();
                case IS_INITIALIZED:
                    return i;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    RemoteConfigRequestV1 remoteConfigRequestV1 = (RemoteConfigRequestV1) obj2;
                    boolean z2 = this.d != 0;
                    int i2 = this.d;
                    if (remoteConfigRequestV1.d != 0) {
                        z = true;
                    }
                    this.d = fVar.a(z2, i2, z, remoteConfigRequestV1.d);
                    this.e = fVar.a(!this.e.isEmpty(), this.e, !remoteConfigRequestV1.e.isEmpty(), remoteConfigRequestV1.e);
                    this.f = fVar.a(!this.f.isEmpty(), this.f, !remoteConfigRequestV1.f.isEmpty(), remoteConfigRequestV1.f);
                    this.g = fVar.a(!this.g.isEmpty(), this.g, !remoteConfigRequestV1.g.isEmpty(), remoteConfigRequestV1.g);
                    this.h = fVar.a(!this.h.isEmpty(), this.h, true ^ remoteConfigRequestV1.h.isEmpty(), remoteConfigRequestV1.h);
                    e eVar = e.a;
                    return this;
                case MERGE_FROM_STREAM:
                    fkw fkw = (fkw) obj;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 16) {
                                    this.d = fkw.g();
                                } else if (a2 == 26) {
                                    this.e = fkw.d();
                                } else if (a2 == 34) {
                                    this.f = fkw.d();
                                } else if (a2 == 42) {
                                    this.g = fkw.d();
                                } else if (a2 == 50) {
                                    this.h = fkw.d();
                                } else if (!fkw.b(a2)) {
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
                    if (j == null) {
                        synchronized (RemoteConfigRequestV1.class) {
                            if (j == null) {
                                j = new b(i);
                            }
                        }
                    }
                    return j;
                default:
                    throw new UnsupportedOperationException();
            }
            return i;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if (this.d != Platform.UNKNOWN.value) {
                codedOutputStream.b(2, this.d);
            }
            if (!this.e.isEmpty()) {
                codedOutputStream.a(3, this.e);
            }
            if (!this.f.isEmpty()) {
                codedOutputStream.a(4, this.f);
            }
            if (!this.g.isEmpty()) {
                codedOutputStream.a(5, this.g);
            }
            if (!this.h.isEmpty()) {
                codedOutputStream.a(6, this.h);
            }
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if (this.d != Platform.UNKNOWN.value) {
                i3 = 0 + CodedOutputStream.j(2, this.d);
            }
            if (!this.e.isEmpty()) {
                i3 += CodedOutputStream.b(3, this.e);
            }
            if (!this.f.isEmpty()) {
                i3 += CodedOutputStream.b(4, this.f);
            }
            if (!this.g.isEmpty()) {
                i3 += CodedOutputStream.b(5, this.g);
            }
            if (!this.h.isEmpty()) {
                i3 += CodedOutputStream.b(6, this.h);
            }
            this.c = i3;
            return i3;
        }
    }

    public static final class RemoteConfigResponseV1 extends GeneratedMessageLite<RemoteConfigResponseV1, a> implements vqs {
        /* access modifiers changed from: private */
        public static final RemoteConfigResponseV1 f;
        private static volatile fll<RemoteConfigResponseV1> g;
        public int d = 0;
        public Object e;

        public static final class RemoteConfigError extends GeneratedMessageLite<RemoteConfigError, a> implements vqq {
            /* access modifiers changed from: private */
            public static final RemoteConfigError f;
            private static volatile fll<RemoteConfigError> g;
            private int d;
            private String e = "";

            public static final class a extends com.google.protobuf.GeneratedMessageLite.a<RemoteConfigError, a> implements vqq {
                private a() {
                    super(RemoteConfigError.f);
                }

                /* synthetic */ a(byte b) {
                    this();
                }
            }

            static {
                RemoteConfigError remoteConfigError = new RemoteConfigError();
                f = remoteConfigError;
                remoteConfigError.e();
            }

            private RemoteConfigError() {
            }

            public static fll<RemoteConfigError> parser() {
                return f.c();
            }

            public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                boolean z = false;
                switch (methodToInvoke) {
                    case NEW_MUTABLE_INSTANCE:
                        return new RemoteConfigError();
                    case IS_INITIALIZED:
                        return f;
                    case MAKE_IMMUTABLE:
                        return null;
                    case NEW_BUILDER:
                        return new a(0);
                    case VISIT:
                        f fVar = (f) obj;
                        RemoteConfigError remoteConfigError = (RemoteConfigError) obj2;
                        boolean z2 = this.d != 0;
                        int i = this.d;
                        if (remoteConfigError.d != 0) {
                            z = true;
                        }
                        this.d = fVar.a(z2, i, z, remoteConfigError.d);
                        this.e = fVar.a(!this.e.isEmpty(), this.e, true ^ remoteConfigError.e.isEmpty(), remoteConfigError.e);
                        e eVar = e.a;
                        return this;
                    case MERGE_FROM_STREAM:
                        fkw fkw = (fkw) obj;
                        while (!z) {
                            try {
                                int a2 = fkw.a();
                                if (a2 != 0) {
                                    if (a2 == 8) {
                                        this.d = fkw.g();
                                    } else if (a2 == 18) {
                                        this.e = fkw.d();
                                    } else if (!fkw.b(a2)) {
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
                        if (g == null) {
                            synchronized (RemoteConfigError.class) {
                                if (g == null) {
                                    g = new b(f);
                                }
                            }
                        }
                        return g;
                    default:
                        throw new UnsupportedOperationException();
                }
                return f;
            }

            public final void a(CodedOutputStream codedOutputStream) {
                int i = this.d;
                if (i != 0) {
                    codedOutputStream.b(1, i);
                }
                if (!this.e.isEmpty()) {
                    codedOutputStream.a(2, this.e);
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
                if (!this.e.isEmpty()) {
                    i3 += CodedOutputStream.b(2, this.e);
                }
                this.c = i3;
                return i3;
            }
        }

        public static final class RemoteConfigSuccess extends GeneratedMessageLite<RemoteConfigSuccess, a> implements vqr {
            /* access modifiers changed from: private */
            public static final RemoteConfigSuccess e;
            private static volatile fll<RemoteConfigSuccess> f;
            private GranularConfiguration d;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.a<RemoteConfigSuccess, a> implements vqr {
                private a() {
                    super(RemoteConfigSuccess.e);
                }

                /* synthetic */ a(byte b) {
                    this();
                }
            }

            static {
                RemoteConfigSuccess remoteConfigSuccess = new RemoteConfigSuccess();
                e = remoteConfigSuccess;
                remoteConfigSuccess.e();
            }

            private RemoteConfigSuccess() {
            }

            public static RemoteConfigSuccess l() {
                return e;
            }

            public static fll<RemoteConfigSuccess> parser() {
                return e.c();
            }

            public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                boolean z = false;
                switch (methodToInvoke) {
                    case NEW_MUTABLE_INSTANCE:
                        return new RemoteConfigSuccess();
                    case IS_INITIALIZED:
                        return e;
                    case MAKE_IMMUTABLE:
                        return null;
                    case NEW_BUILDER:
                        return new a(0);
                    case VISIT:
                        this.d = (GranularConfiguration) ((f) obj).a(this.d, ((RemoteConfigSuccess) obj2).d);
                        e eVar = e.a;
                        return this;
                    case MERGE_FROM_STREAM:
                        fkw fkw = (fkw) obj;
                        fky fky = (fky) obj2;
                        while (!z) {
                            try {
                                int a2 = fkw.a();
                                if (a2 != 0) {
                                    if (a2 == 10) {
                                        com.spotify.rcs.model.proto.GranularConfiguration.a aVar = this.d != null ? (com.spotify.rcs.model.proto.GranularConfiguration.a) this.d.h() : null;
                                        this.d = (GranularConfiguration) fkw.a(GranularConfiguration.parser(), fky);
                                        if (aVar != null) {
                                            aVar.a(this.d);
                                            this.d = (GranularConfiguration) aVar.e();
                                        }
                                    } else if (!fkw.b(a2)) {
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
                            synchronized (RemoteConfigSuccess.class) {
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

            public final void a(CodedOutputStream codedOutputStream) {
                if (this.d != null) {
                    codedOutputStream.a(1, (fli) k());
                }
            }

            public final int j() {
                int i = this.c;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if (this.d != null) {
                    i2 = 0 + CodedOutputStream.b(1, (fli) k());
                }
                this.c = i2;
                return i2;
            }

            public final GranularConfiguration k() {
                GranularConfiguration granularConfiguration = this.d;
                return granularConfiguration == null ? GranularConfiguration.k() : granularConfiguration;
            }
        }

        public enum ResultCase implements b {
            SUCCESS(1),
            ERROR(2),
            RESULT_NOT_SET(0);
            
            private final int value;

            private ResultCase(int i) {
                this.value = i;
            }

            public static ResultCase a(int i) {
                if (i == 0) {
                    return RESULT_NOT_SET;
                }
                if (i == 1) {
                    return SUCCESS;
                }
                if (i != 2) {
                    return null;
                }
                return ERROR;
            }

            public final int a() {
                return this.value;
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<RemoteConfigResponseV1, a> implements vqs {
            private a() {
                super(RemoteConfigResponseV1.f);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            RemoteConfigResponseV1 remoteConfigResponseV1 = new RemoteConfigResponseV1();
            f = remoteConfigResponseV1;
            remoteConfigResponseV1.e();
        }

        private RemoteConfigResponseV1() {
        }

        public static RemoteConfigResponseV1 k() {
            return f;
        }

        public static fll<RemoteConfigResponseV1> parser() {
            return f.c();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new RemoteConfigResponseV1();
                case IS_INITIALIZED:
                    return f;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    RemoteConfigResponseV1 remoteConfigResponseV1 = (RemoteConfigResponseV1) obj2;
                    int i = AnonymousClass1.d[ResultCase.a(remoteConfigResponseV1.d).ordinal()];
                    if (i == 1) {
                        if (this.d == 1) {
                            z = true;
                        }
                        this.e = fVar.e(z, this.e, remoteConfigResponseV1.e);
                    } else if (i == 2) {
                        if (this.d == 2) {
                            z = true;
                        }
                        this.e = fVar.e(z, this.e, remoteConfigResponseV1.e);
                    } else if (i == 3) {
                        if (this.d != 0) {
                            z = true;
                        }
                        fVar.a(z);
                    }
                    if (fVar == e.a) {
                        int i2 = remoteConfigResponseV1.d;
                        if (i2 != 0) {
                            this.d = i2;
                        }
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkw fkw = (fkw) obj;
                    fky fky = (fky) obj2;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    a aVar = this.d == 1 ? (a) ((RemoteConfigSuccess) this.e).h() : null;
                                    this.e = fkw.a(RemoteConfigSuccess.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a((RemoteConfigSuccess) this.e);
                                        this.e = aVar.e();
                                    }
                                    this.d = 1;
                                } else if (a2 == 18) {
                                    a aVar2 = this.d == 2 ? (a) ((RemoteConfigError) this.e).h() : null;
                                    this.e = fkw.a(RemoteConfigError.parser(), fky);
                                    if (aVar2 != null) {
                                        aVar2.a((RemoteConfigError) this.e);
                                        this.e = aVar2.e();
                                    }
                                    this.d = 2;
                                } else if (!fkw.b(a2)) {
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
                    if (g == null) {
                        synchronized (RemoteConfigResponseV1.class) {
                            if (g == null) {
                                g = new b(f);
                            }
                        }
                    }
                    return g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if (this.d == 1) {
                codedOutputStream.a(1, (fli) (RemoteConfigSuccess) this.e);
            }
            if (this.d == 2) {
                codedOutputStream.a(2, (fli) (RemoteConfigError) this.e);
            }
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.d == 1) {
                i2 = 0 + CodedOutputStream.b(1, (fli) (RemoteConfigSuccess) this.e);
            }
            if (this.d == 2) {
                i2 += CodedOutputStream.b(2, (fli) (RemoteConfigError) this.e);
            }
            this.c = i2;
            return i2;
        }
    }
}
