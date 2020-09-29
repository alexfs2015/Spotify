package org.msgpack.core;

import org.msgpack.value.ValueType;

public enum MessageFormat {
    POSFIXINT(ValueType.INTEGER),
    FIXMAP(ValueType.MAP),
    FIXARRAY(ValueType.ARRAY),
    FIXSTR(ValueType.STRING),
    NIL(ValueType.NIL),
    NEVER_USED(null),
    BOOLEAN(ValueType.BOOLEAN),
    BIN8(ValueType.BINARY),
    BIN16(ValueType.BINARY),
    BIN32(ValueType.BINARY),
    EXT8(ValueType.EXTENSION),
    EXT16(ValueType.EXTENSION),
    EXT32(ValueType.EXTENSION),
    FLOAT32(ValueType.FLOAT),
    FLOAT64(ValueType.FLOAT),
    UINT8(ValueType.INTEGER),
    UINT16(ValueType.INTEGER),
    UINT32(ValueType.INTEGER),
    UINT64(ValueType.INTEGER),
    INT8(ValueType.INTEGER),
    INT16(ValueType.INTEGER),
    INT32(ValueType.INTEGER),
    INT64(ValueType.INTEGER),
    FIXEXT1(ValueType.EXTENSION),
    FIXEXT2(ValueType.EXTENSION),
    FIXEXT4(ValueType.EXTENSION),
    FIXEXT8(ValueType.EXTENSION),
    FIXEXT16(ValueType.EXTENSION),
    STR8(ValueType.STRING),
    STR16(ValueType.STRING),
    STR32(ValueType.STRING),
    ARRAY16(ValueType.ARRAY),
    ARRAY32(ValueType.ARRAY),
    MAP16(ValueType.MAP),
    MAP32(ValueType.MAP),
    NEGFIXINT(ValueType.INTEGER);
    
    private static final MessageFormat[] K = null;
    private final ValueType valueType;

    static {
        MessageFormat messageFormat;
        K = new MessageFormat[256];
        for (int i = 0; i <= 255; i++) {
            byte b = (byte) i;
            if (!((b & Byte.MIN_VALUE) == 0)) {
                byte b2 = b & -32;
                if (!(b2 == -32)) {
                    if (!(b2 == -96)) {
                        if (!a.b(b)) {
                            if (!a.c(b)) {
                                switch (b) {
                                    case -64:
                                        messageFormat = NIL;
                                        break;
                                    case -62:
                                    case -61:
                                        messageFormat = BOOLEAN;
                                        break;
                                    case -60:
                                        messageFormat = BIN8;
                                        break;
                                    case -59:
                                        messageFormat = BIN16;
                                        break;
                                    case -58:
                                        messageFormat = BIN32;
                                        break;
                                    case -57:
                                        messageFormat = EXT8;
                                        break;
                                    case -56:
                                        messageFormat = EXT16;
                                        break;
                                    case -55:
                                        messageFormat = EXT32;
                                        break;
                                    case -54:
                                        messageFormat = FLOAT32;
                                        break;
                                    case -53:
                                        messageFormat = FLOAT64;
                                        break;
                                    case -52:
                                        messageFormat = UINT8;
                                        break;
                                    case -51:
                                        messageFormat = UINT16;
                                        break;
                                    case -50:
                                        messageFormat = UINT32;
                                        break;
                                    case -49:
                                        messageFormat = UINT64;
                                        break;
                                    case -48:
                                        messageFormat = INT8;
                                        break;
                                    case -47:
                                        messageFormat = INT16;
                                        break;
                                    case -46:
                                        messageFormat = INT32;
                                        break;
                                    case -45:
                                        messageFormat = INT64;
                                        break;
                                    case -44:
                                        messageFormat = FIXEXT1;
                                        break;
                                    case -43:
                                        messageFormat = FIXEXT2;
                                        break;
                                    case -42:
                                        messageFormat = FIXEXT4;
                                        break;
                                    case -41:
                                        messageFormat = FIXEXT8;
                                        break;
                                    case -40:
                                        messageFormat = FIXEXT16;
                                        break;
                                    case -39:
                                        messageFormat = STR8;
                                        break;
                                    case -38:
                                        messageFormat = STR16;
                                        break;
                                    case -37:
                                        messageFormat = STR32;
                                        break;
                                    case -36:
                                        messageFormat = ARRAY16;
                                        break;
                                    case -35:
                                        messageFormat = ARRAY32;
                                        break;
                                    case -34:
                                        messageFormat = MAP16;
                                        break;
                                    case -33:
                                        messageFormat = MAP32;
                                        break;
                                    default:
                                        messageFormat = NEVER_USED;
                                        break;
                                }
                            } else {
                                messageFormat = FIXMAP;
                            }
                        } else {
                            messageFormat = FIXARRAY;
                        }
                    } else {
                        messageFormat = FIXSTR;
                    }
                } else {
                    messageFormat = NEGFIXINT;
                }
            } else {
                messageFormat = POSFIXINT;
            }
            K[i] = messageFormat;
        }
    }

    private MessageFormat(ValueType valueType2) {
        this.valueType = valueType2;
    }

    public final ValueType a() {
        if (this != NEVER_USED) {
            return this.valueType;
        }
        throw new MessageFormatException("Cannot convert NEVER_USED to ValueType");
    }

    public static MessageFormat a(byte b) {
        return K[b & 255];
    }
}
