package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.a;
import java.io.IOException;
import java.io.Serializable;
import java.io.StreamCorruptedException;

final class MessageSerializedForm<M extends Message<M, B>, B extends a<M, B>> implements Serializable {
    private static final long serialVersionUID = 0;
    private final byte[] bytes;
    private final Class<M> messageClass;

    public MessageSerializedForm(byte[] bArr, Class<M> cls) {
        this.bytes = bArr;
        this.messageClass = cls;
    }

    /* access modifiers changed from: 0000 */
    public final Object readResolve() {
        ProtoAdapter b = ProtoAdapter.b(this.messageClass);
        try {
            byte[] bArr = this.bytes;
            vsz.a(bArr, "bytes == null");
            wok b2 = new wok().c(bArr);
            vsz.a(b2, "source == null");
            return b.a(new vta(b2));
        } catch (IOException e) {
            throw new StreamCorruptedException(e.getMessage());
        }
    }
}
