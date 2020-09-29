package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.a;
import java.io.IOException;
import java.io.Serializable;
import okio.ByteString;

public abstract class Message<M extends Message<M, B>, B extends a<M, B>> implements Serializable {
    private static final long serialVersionUID = 0;
    private final transient ProtoAdapter<M> adapter;
    transient int cachedSerializedSize = 0;
    protected transient int hashCode = 0;
    private final transient ByteString unknownFields;

    public static abstract class a<T extends Message<T, B>, B extends a<T, B>> {
        xcq unknownFieldsBuffer;
        whh unknownFieldsWriter;

        protected a() {
        }

        public final a<T, B> addUnknownField(int i, FieldEncoding fieldEncoding, Object obj) {
            if (this.unknownFieldsWriter == null) {
                this.unknownFieldsBuffer = new xcq();
                this.unknownFieldsWriter = new whh(this.unknownFieldsBuffer);
            }
            try {
                fieldEncoding.a().a(this.unknownFieldsWriter, i, obj);
                return this;
            } catch (IOException unused) {
                throw new AssertionError();
            }
        }

        public final a<T, B> addUnknownFields(ByteString byteString) {
            if (byteString.h() > 0) {
                if (this.unknownFieldsWriter == null) {
                    this.unknownFieldsBuffer = new xcq();
                    this.unknownFieldsWriter = new whh(this.unknownFieldsBuffer);
                }
                try {
                    this.unknownFieldsWriter.a(byteString);
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
            return this;
        }

        public abstract T build();

        public final ByteString buildUnknownFields() {
            xcq xcq = this.unknownFieldsBuffer;
            return xcq != null ? xcq.clone().n() : ByteString.a;
        }

        public final a<T, B> clearUnknownFields() {
            this.unknownFieldsWriter = null;
            this.unknownFieldsBuffer = null;
            return this;
        }
    }

    protected Message(ProtoAdapter<M> protoAdapter, ByteString byteString) {
        if (protoAdapter == null) {
            throw new NullPointerException("adapter == null");
        } else if (byteString != null) {
            this.adapter = protoAdapter;
            this.unknownFields = byteString;
        } else {
            throw new NullPointerException("unknownFields == null");
        }
    }

    public final ByteString a() {
        ByteString byteString = this.unknownFields;
        return byteString != null ? byteString : ByteString.a;
    }

    public String toString() {
        return ProtoAdapter.c(this);
    }

    /* access modifiers changed from: protected */
    public final Object writeReplace() {
        return new MessageSerializedForm(this.adapter.b(this), getClass());
    }
}
