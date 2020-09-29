package com.spotify.hubs.view.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat.FieldType;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

public final class Images extends GeneratedMessageLite<Images, a> implements gkf {
    /* access modifiers changed from: private */
    public static final Images i;
    private static volatile fll<Images> j;
    public String d = "";
    private int e;
    private ImageData f;
    private ImageData g;
    private MapFieldLite<String, ImageData> h = MapFieldLite.a();

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Images, a> implements gkf {
        private a() {
            super(Images.i);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b {
        static final flh<String, ImageData> a = flh.a(FieldType.STRING, "", FieldType.MESSAGE, ImageData.l());
    }

    static {
        Images images = new Images();
        i = images;
        images.e();
    }

    private Images() {
    }

    public static Images n() {
        return i;
    }

    public static fll<Images> parser() {
        return i.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new Images();
            case IS_INITIALIZED:
                return i;
            case MAKE_IMMUTABLE:
                this.h.isMutable = false;
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                Images images = (Images) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !images.d.isEmpty(), images.d);
                this.f = (ImageData) fVar.a(this.f, images.f);
                this.g = (ImageData) fVar.a(this.g, images.g);
                this.h = fVar.a(this.h, images.h);
                if (fVar == e.a) {
                    this.e |= images.e;
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
                                this.d = fkw.d();
                            } else if (a2 == 18) {
                                com.spotify.hubs.view.proto.ImageData.a aVar = this.f != null ? (com.spotify.hubs.view.proto.ImageData.a) this.f.h() : null;
                                this.f = (ImageData) fkw.a(ImageData.parser(), fky);
                                if (aVar != null) {
                                    aVar.a(this.f);
                                    this.f = (ImageData) aVar.e();
                                }
                            } else if (a2 == 26) {
                                com.spotify.hubs.view.proto.ImageData.a aVar2 = this.g != null ? (com.spotify.hubs.view.proto.ImageData.a) this.g.h() : null;
                                this.g = (ImageData) fkw.a(ImageData.parser(), fky);
                                if (aVar2 != null) {
                                    aVar2.a(this.g);
                                    this.g = (ImageData) aVar2.e();
                                }
                            } else if (a2 == 34) {
                                if (!this.h.isMutable) {
                                    this.h = this.h.b();
                                }
                                b.a.a(this.h, fkw, fky);
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
                    synchronized (Images.class) {
                        if (j == null) {
                            j = new com.google.protobuf.GeneratedMessageLite.b(i);
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
        if (!this.d.isEmpty()) {
            codedOutputStream.a(1, this.d);
        }
        if (this.f != null) {
            codedOutputStream.a(2, (fli) k());
        }
        if (this.g != null) {
            codedOutputStream.a(3, (fli) l());
        }
        for (Entry entry : this.h.entrySet()) {
            b.a.a(codedOutputStream, 4, entry.getKey(), entry.getValue());
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
        if (this.f != null) {
            i3 += CodedOutputStream.b(2, (fli) k());
        }
        if (this.g != null) {
            i3 += CodedOutputStream.b(3, (fli) l());
        }
        for (Entry entry : this.h.entrySet()) {
            i3 += b.a.a(4, entry.getKey(), entry.getValue());
        }
        this.c = i3;
        return i3;
    }

    public final ImageData k() {
        ImageData imageData = this.f;
        return imageData == null ? ImageData.l() : imageData;
    }

    public final ImageData l() {
        ImageData imageData = this.g;
        return imageData == null ? ImageData.l() : imageData;
    }

    public final Map<String, ImageData> m() {
        return Collections.unmodifiableMap(this.h);
    }
}
