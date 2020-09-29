package com.spotify.hubs.view.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Struct;
import java.io.IOException;

public final class ImageData extends GeneratedMessageLite<ImageData, a> implements git {
    /* access modifiers changed from: private */
    public static final ImageData h;
    private static volatile fkr<ImageData> i;
    public String d;
    public String e;
    private String f;
    private Struct g;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ImageData, a> implements git {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(ImageData.h);
        }
    }

    private ImageData() {
        String str = "";
        this.d = str;
        this.e = str;
        this.f = str;
    }

    public final Struct k() {
        Struct struct = this.g;
        return struct == null ? Struct.l() : struct;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        if (!this.d.isEmpty()) {
            codedOutputStream.a(1, this.d);
        }
        if (!this.e.isEmpty()) {
            codedOutputStream.a(2, this.e);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.a(3, this.f);
        }
        if (this.g != null) {
            codedOutputStream.a(4, (fko) k());
        }
    }

    public final int j() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if (!this.d.isEmpty()) {
            i3 = 0 + CodedOutputStream.b(1, this.d);
        }
        if (!this.e.isEmpty()) {
            i3 += CodedOutputStream.b(2, this.e);
        }
        if (!this.f.isEmpty()) {
            i3 += CodedOutputStream.b(3, this.f);
        }
        if (this.g != null) {
            i3 += CodedOutputStream.b(4, (fko) k());
        }
        this.c = i3;
        return i3;
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new ImageData();
            case IS_INITIALIZED:
                return h;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                ImageData imageData = (ImageData) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !imageData.d.isEmpty(), imageData.d);
                this.e = fVar.a(!this.e.isEmpty(), this.e, !imageData.e.isEmpty(), imageData.e);
                this.f = fVar.a(!this.f.isEmpty(), this.f, !imageData.f.isEmpty(), imageData.f);
                this.g = (Struct) fVar.a(this.g, imageData.g);
                e eVar = e.a;
                return this;
            case MERGE_FROM_STREAM:
                fkc fkc = (fkc) obj;
                fke fke = (fke) obj2;
                while (!z) {
                    try {
                        int a2 = fkc.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                this.d = fkc.d();
                            } else if (a2 == 18) {
                                this.e = fkc.d();
                            } else if (a2 == 26) {
                                this.f = fkc.d();
                            } else if (a2 == 34) {
                                com.google.protobuf.Struct.a aVar = this.g != null ? (com.google.protobuf.Struct.a) this.g.h() : null;
                                this.g = (Struct) fkc.a(Struct.parser(), fke);
                                if (aVar != null) {
                                    aVar.a(this.g);
                                    this.g = (Struct) aVar.e();
                                }
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
                    synchronized (ImageData.class) {
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
        ImageData imageData = new ImageData();
        h = imageData;
        imageData.e();
    }

    public static ImageData l() {
        return h;
    }

    public static fkr<ImageData> parser() {
        return h.c();
    }
}
