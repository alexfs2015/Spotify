package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.util.Arrays;
import java.util.UUID;

public class UUIDDeserializer extends FromStringDeserializer<UUID> {
    static final int[] HEX_DIGITS;
    private static final long serialVersionUID = 1;

    static {
        int[] iArr = new int[127];
        HEX_DIGITS = iArr;
        Arrays.fill(iArr, -1);
        for (int i = 0; i < 10; i++) {
            HEX_DIGITS[i + 48] = i;
        }
        for (int i2 = 0; i2 < 6; i2++) {
            int[] iArr2 = HEX_DIGITS;
            int i3 = i2 + 10;
            iArr2[i2 + 97] = i3;
            iArr2[i2 + 65] = i3;
        }
    }

    public UUIDDeserializer() {
        super(UUID.class);
    }

    private UUID _badFormat(String str, DeserializationContext deserializationContext) {
        return (UUID) deserializationContext.handleWeirdStringValue(handledType(), str, "UUID has to be represented by standard 36-char representation", new Object[0]);
    }

    private UUID _fromBytes(byte[] bArr, DeserializationContext deserializationContext) {
        if (bArr.length == 16) {
            return new UUID(_long(bArr, 0), _long(bArr, 8));
        }
        JsonParser parser = deserializationContext.getParser();
        StringBuilder sb = new StringBuilder("Can only construct UUIDs from byte[16]; got ");
        sb.append(bArr.length);
        sb.append(" bytes");
        throw InvalidFormatException.from(parser, sb.toString(), bArr, handledType());
    }

    private static int _int(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    private static long _long(byte[] bArr, int i) {
        return ((((long) _int(bArr, i + 4)) << 32) >>> 32) | (((long) _int(bArr, i)) << 32);
    }

    /* access modifiers changed from: 0000 */
    public int _badChar(String str, int i, DeserializationContext deserializationContext, char c) {
        throw deserializationContext.weirdStringException(str, handledType(), String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", new Object[]{Character.valueOf(c), Integer.toHexString(c)}));
    }

    /* access modifiers changed from: protected */
    public UUID _deserialize(String str, DeserializationContext deserializationContext) {
        if (str.length() != 36) {
            return str.length() == 24 ? _fromBytes(Base64Variants.getDefaultVariant().decode(str), deserializationContext) : _badFormat(str, deserializationContext);
        }
        if (!(str.charAt(8) == '-' && str.charAt(13) == '-' && str.charAt(18) == '-' && str.charAt(23) == '-')) {
            _badFormat(str, deserializationContext);
        }
        return new UUID((((long) intFromChars(str, 0, deserializationContext)) << 32) + ((((long) shortFromChars(str, 9, deserializationContext)) << 16) | ((long) shortFromChars(str, 14, deserializationContext))), ((((long) intFromChars(str, 28, deserializationContext)) << 32) >>> 32) | (((long) (shortFromChars(str, 24, deserializationContext) | (shortFromChars(str, 19, deserializationContext) << 16))) << 32));
    }

    /* access modifiers changed from: protected */
    public UUID _deserializeEmbedded(Object obj, DeserializationContext deserializationContext) {
        if (obj instanceof byte[]) {
            return _fromBytes((byte[]) obj, deserializationContext);
        }
        super._deserializeEmbedded(obj, deserializationContext);
        return null;
    }

    /* access modifiers changed from: 0000 */
    public int byteFromChars(String str, int i, DeserializationContext deserializationContext) {
        char charAt = str.charAt(i);
        int i2 = i + 1;
        char charAt2 = str.charAt(i2);
        if (charAt <= 127 && charAt2 <= 127) {
            int[] iArr = HEX_DIGITS;
            int i3 = iArr[charAt2] | (iArr[charAt] << 4);
            if (i3 >= 0) {
                return i3;
            }
        }
        return (charAt > 127 || HEX_DIGITS[charAt] < 0) ? _badChar(str, i, deserializationContext, charAt) : _badChar(str, i2, deserializationContext, charAt2);
    }

    /* access modifiers changed from: 0000 */
    public int intFromChars(String str, int i, DeserializationContext deserializationContext) {
        return (byteFromChars(str, i, deserializationContext) << 24) + (byteFromChars(str, i + 2, deserializationContext) << 16) + (byteFromChars(str, i + 4, deserializationContext) << 8) + byteFromChars(str, i + 6, deserializationContext);
    }

    /* access modifiers changed from: 0000 */
    public int shortFromChars(String str, int i, DeserializationContext deserializationContext) {
        return (byteFromChars(str, i, deserializationContext) << 8) + byteFromChars(str, i + 2, deserializationContext);
    }
}
