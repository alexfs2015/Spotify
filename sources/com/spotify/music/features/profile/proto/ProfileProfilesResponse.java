package com.spotify.music.features.profile.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.music.features.profile.proto.Identity.DecorationData;
import java.io.IOException;

public final class ProfileProfilesResponse {

    public static final class GetProfilesResponse extends GeneratedMessageLite<GetProfilesResponse, a> implements pss {
        /* access modifiers changed from: private */
        public static final GetProfilesResponse e;
        private static volatile fll<GetProfilesResponse> f;
        public e<DecorationData> d = flm.d();

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<GetProfilesResponse, a> implements pss {
            private a() {
                super(GetProfilesResponse.e);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            GetProfilesResponse getProfilesResponse = new GetProfilesResponse();
            e = getProfilesResponse;
            getProfilesResponse.e();
        }

        private GetProfilesResponse() {
        }

        public static GetProfilesResponse a(byte[] bArr) {
            return (GetProfilesResponse) GeneratedMessageLite.a(e, bArr);
        }

        public static fll<GetProfilesResponse> parser() {
            return e.c();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new GetProfilesResponse();
                case IS_INITIALIZED:
                    return e;
                case MAKE_IMMUTABLE:
                    this.d.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    this.d = ((f) obj).a(this.d, ((GetProfilesResponse) obj2).d);
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
                                    if (!this.d.a()) {
                                        this.d = GeneratedMessageLite.a(this.d);
                                    }
                                    this.d.add(fkw.a(DecorationData.parser(), fky));
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
                        synchronized (GetProfilesResponse.class) {
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
            for (int i = 0; i < this.d.size(); i++) {
                codedOutputStream.a(1, (fli) this.d.get(i));
            }
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.d.size(); i3++) {
                i2 += CodedOutputStream.b(1, (fli) this.d.get(i3));
            }
            this.c = i2;
            return i2;
        }
    }
}
