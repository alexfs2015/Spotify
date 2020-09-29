package defpackage;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import defpackage.fko;
import java.io.InputStream;

/* renamed from: fjy reason: default package */
public abstract class fjy<MessageType extends fko> implements fkr<MessageType> {
    private static final fke a = fke.a();

    private MessageType a(MessageType messagetype) {
        UninitializedMessageException uninitializedMessageException;
        if (messagetype == null || messagetype.f()) {
            return messagetype;
        }
        if (messagetype instanceof fjx) {
            fjx fjx = (fjx) messagetype;
            uninitializedMessageException = new UninitializedMessageException();
        } else {
            uninitializedMessageException = new UninitializedMessageException();
        }
        InvalidProtocolBufferException a2 = uninitializedMessageException.a();
        a2.unfinishedMessage = messagetype;
        throw a2;
    }

    private MessageType a(byte[] bArr, int i, int i2, fke fke) {
        MessageType messagetype;
        try {
            fkc a2 = fkc.a(bArr, i, i2, false);
            messagetype = (fko) a(a2, fke);
            a2.a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            e.unfinishedMessage = messagetype;
            throw e;
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    private MessageType b(InputStream inputStream, fke fke) {
        fkc fkc = new fkc(inputStream, 4096);
        MessageType messagetype = (fko) a(fkc, fke);
        try {
            fkc.a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            e.unfinishedMessage = messagetype;
            throw e;
        }
    }

    public final /* synthetic */ Object a(InputStream inputStream, fke fke) {
        return a((MessageType) b(inputStream, fke));
    }

    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        return a((MessageType) a(bArr, 0, bArr.length, a));
    }
}
