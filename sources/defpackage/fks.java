package defpackage;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import defpackage.fli;
import java.io.InputStream;

/* renamed from: fks reason: default package */
public abstract class fks<MessageType extends fli> implements fll<MessageType> {
    private static final fky a = fky.a();

    private MessageType a(MessageType messagetype) {
        UninitializedMessageException uninitializedMessageException;
        if (messagetype == null || messagetype.f()) {
            return messagetype;
        }
        if (messagetype instanceof fkr) {
            fkr fkr = (fkr) messagetype;
            uninitializedMessageException = new UninitializedMessageException();
        } else {
            uninitializedMessageException = new UninitializedMessageException();
        }
        InvalidProtocolBufferException a2 = uninitializedMessageException.a();
        a2.unfinishedMessage = messagetype;
        throw a2;
    }

    private MessageType a(byte[] bArr, int i, int i2, fky fky) {
        MessageType messagetype;
        try {
            fkw a2 = fkw.a(bArr, i, i2, false);
            messagetype = (fli) a(a2, fky);
            a2.a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            e.unfinishedMessage = messagetype;
            throw e;
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    private MessageType b(InputStream inputStream, fky fky) {
        fkw fkw = new fkw(inputStream, 4096);
        MessageType messagetype = (fli) a(fkw, fky);
        try {
            fkw.a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            e.unfinishedMessage = messagetype;
            throw e;
        }
    }

    public final /* synthetic */ Object a(InputStream inputStream, fky fky) {
        return a((MessageType) b(inputStream, fky));
    }

    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        return a((MessageType) a(bArr, 0, bArr.length, a));
    }
}
