package org.msgpack.jackson.dataformat;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = Serializer.class)
public final class MessagePackExtensionType {
    public final byte a;
    public final byte[] b;

    public static class Serializer extends JsonSerializer<MessagePackExtensionType> {
        public /* synthetic */ void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            MessagePackExtensionType messagePackExtensionType = (MessagePackExtensionType) obj;
            if (jsonGenerator instanceof wpq) {
                ((wpq) jsonGenerator).a((Object) messagePackExtensionType);
                return;
            }
            StringBuilder sb = new StringBuilder("'gen' is expected to be MessagePackGenerator but it's ");
            sb.append(jsonGenerator.getClass());
            throw new IllegalStateException(sb.toString());
        }
    }

    public MessagePackExtensionType(byte b2, byte[] bArr) {
        this.a = b2;
        this.b = bArr;
    }
}
