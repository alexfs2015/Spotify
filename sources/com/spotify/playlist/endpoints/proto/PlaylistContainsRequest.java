package com.spotify.playlist.endpoints.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class PlaylistContainsRequest {

    public static final class ContainsRequest extends GeneratedMessageLite<ContainsRequest, a> implements uyh {
        /* access modifiers changed from: private */
        public static final ContainsRequest e;
        private static volatile fkr<ContainsRequest> f;
        private e<String> d = fks.d();

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ContainsRequest, a> implements uyh {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ContainsRequest.e);
            }

            public final a a(Iterable<String> iterable) {
                b();
                ContainsRequest.a((ContainsRequest) this.a, iterable);
                return this;
            }
        }

        private ContainsRequest() {
        }

        public final void a(CodedOutputStream codedOutputStream) {
            for (int i = 0; i < this.d.size(); i++) {
                codedOutputStream.a(1, (String) this.d.get(i));
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.d.size(); i3++) {
                i2 += CodedOutputStream.b((String) this.d.get(i3));
            }
            int size = i2 + 0 + (this.d.size() * 1) + this.b.d();
            this.c = size;
            return size;
        }

        public static a k() {
            return (a) e.h();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ContainsRequest();
                case IS_INITIALIZED:
                    return e;
                case MAKE_IMMUTABLE:
                    this.d.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    this.d = ((f) obj).a(this.d, ((ContainsRequest) obj2).d);
                    e eVar = e.a;
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    String c = fkc.c();
                                    if (!this.d.a()) {
                                        this.d = GeneratedMessageLite.a(this.d);
                                    }
                                    this.d.add(c);
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
                    if (f == null) {
                        synchronized (ContainsRequest.class) {
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
            ContainsRequest containsRequest = new ContainsRequest();
            e = containsRequest;
            containsRequest.e();
        }

        public static fkr<ContainsRequest> parser() {
            return e.c();
        }

        static /* synthetic */ void a(ContainsRequest containsRequest, Iterable iterable) {
            if (!containsRequest.d.a()) {
                containsRequest.d = GeneratedMessageLite.a(containsRequest.d);
            }
            fjx.a(iterable, containsRequest.d);
        }
    }

    public static final class ContainsResponse extends GeneratedMessageLite<ContainsResponse, a> implements uyi {
        /* access modifiers changed from: private */
        public static final ContainsResponse e;
        private static volatile fkr<ContainsResponse> f;
        public defpackage.fki.a d = fka.d();

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ContainsResponse, a> implements uyi {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ContainsResponse.e);
            }
        }

        private ContainsResponse() {
        }

        public final void a(CodedOutputStream codedOutputStream) {
            for (int i = 0; i < this.d.size(); i++) {
                codedOutputStream.a(1, this.d.b(i));
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int size = (this.d.size() * 1) + 0 + (this.d.size() * 1) + this.b.d();
            this.c = size;
            return size;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ContainsResponse();
                case IS_INITIALIZED:
                    return e;
                case MAKE_IMMUTABLE:
                    this.d.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    this.d = ((f) obj).a(this.d, ((ContainsResponse) obj2).d);
                    e eVar = e.a;
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            if (a2 != 0) {
                                int i = 10;
                                if (a2 == 8) {
                                    if (!this.d.a()) {
                                        defpackage.fki.a aVar = this.d;
                                        int size = aVar.size();
                                        if (size != 0) {
                                            i = size << 1;
                                        }
                                        this.d = aVar.a(i);
                                    }
                                    this.d.a(fkc.b());
                                } else if (a2 == 10) {
                                    int g = fkc.g();
                                    int c = fkc.c(g);
                                    if (!this.d.a() && fkc.k() > 0) {
                                        this.d = this.d.a(this.d.size() + g);
                                    }
                                    while (fkc.k() > 0) {
                                        this.d.a(fkc.b());
                                    }
                                    fkc.d(c);
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
                    if (f == null) {
                        synchronized (ContainsResponse.class) {
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
            ContainsResponse containsResponse = new ContainsResponse();
            e = containsResponse;
            containsResponse.e();
        }

        public static fkr<ContainsResponse> parser() {
            return e.c();
        }
    }
}
