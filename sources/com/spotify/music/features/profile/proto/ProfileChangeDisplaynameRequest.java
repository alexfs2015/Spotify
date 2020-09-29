package com.spotify.music.features.profile.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class ProfileChangeDisplaynameRequest {

    public static final class ChangeDisplayNameRequest extends GeneratedMessageLite<ChangeDisplayNameRequest, a> implements psq {
        /* access modifiers changed from: private */
        public static final ChangeDisplayNameRequest f;
        private static volatile fll<ChangeDisplayNameRequest> g;
        private String d;
        private String e;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ChangeDisplayNameRequest, a> implements psq {
            private a() {
                super(ChangeDisplayNameRequest.f);
            }

            /* synthetic */ a(byte b) {
                this();
            }

            public final a a(String str) {
                b();
                ChangeDisplayNameRequest.a((ChangeDisplayNameRequest) this.a, str);
                return this;
            }

            public final a b(String str) {
                b();
                ChangeDisplayNameRequest.b((ChangeDisplayNameRequest) this.a, str);
                return this;
            }
        }

        static {
            ChangeDisplayNameRequest changeDisplayNameRequest = new ChangeDisplayNameRequest();
            f = changeDisplayNameRequest;
            changeDisplayNameRequest.e();
        }

        private ChangeDisplayNameRequest() {
            String str = "";
            this.d = str;
            this.e = str;
        }

        static /* synthetic */ void a(ChangeDisplayNameRequest changeDisplayNameRequest, String str) {
            if (str != null) {
                changeDisplayNameRequest.d = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void b(ChangeDisplayNameRequest changeDisplayNameRequest, String str) {
            if (str != null) {
                changeDisplayNameRequest.e = str;
                return;
            }
            throw new NullPointerException();
        }

        public static a k() {
            return (a) f.h();
        }

        public static fll<ChangeDisplayNameRequest> parser() {
            return f.c();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ChangeDisplayNameRequest();
                case IS_INITIALIZED:
                    return f;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ChangeDisplayNameRequest changeDisplayNameRequest = (ChangeDisplayNameRequest) obj2;
                    this.d = fVar.a(!this.d.isEmpty(), this.d, !changeDisplayNameRequest.d.isEmpty(), changeDisplayNameRequest.d);
                    this.e = fVar.a(!this.e.isEmpty(), this.e, true ^ changeDisplayNameRequest.e.isEmpty(), changeDisplayNameRequest.e);
                    e eVar = e.a;
                    return this;
                case MERGE_FROM_STREAM:
                    fkw fkw = (fkw) obj;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    this.d = fkw.d();
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
                        synchronized (ChangeDisplayNameRequest.class) {
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
            if (!this.d.isEmpty()) {
                codedOutputStream.a(1, this.d);
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
            int i2 = 0;
            if (!this.d.isEmpty()) {
                i2 = 0 + CodedOutputStream.b(1, this.d);
            }
            if (!this.e.isEmpty()) {
                i2 += CodedOutputStream.b(2, this.e);
            }
            this.c = i2;
            return i2;
        }
    }
}
