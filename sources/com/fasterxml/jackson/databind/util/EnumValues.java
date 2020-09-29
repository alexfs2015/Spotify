package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class EnumValues implements Serializable {
    private static final long serialVersionUID = 1;
    private final Class<Enum<?>> _enumClass;
    private final SerializableString[] _textual;
    private final Enum<?>[] _values;

    private EnumValues(Class<Enum<?>> cls, SerializableString[] serializableStringArr) {
        this._enumClass = cls;
        this._values = (Enum[]) cls.getEnumConstants();
        this._textual = serializableStringArr;
    }

    public static EnumValues constructFromName(MapperConfig<?> mapperConfig, Class<Enum<?>> cls) {
        Class findEnumType = ClassUtil.findEnumType(cls);
        Enum[] enumArr = (Enum[]) findEnumType.getEnumConstants();
        if (enumArr != null) {
            String[] findEnumValues = mapperConfig.getAnnotationIntrospector().findEnumValues(findEnumType, enumArr, new String[enumArr.length]);
            SerializableString[] serializableStringArr = new SerializableString[enumArr.length];
            int length = enumArr.length;
            for (int i = 0; i < length; i++) {
                Enum enumR = enumArr[i];
                String str = findEnumValues[i];
                if (str == null) {
                    str = enumR.name();
                }
                serializableStringArr[enumR.ordinal()] = mapperConfig.compileString(str);
            }
            return new EnumValues(cls, serializableStringArr);
        }
        StringBuilder sb = new StringBuilder("Cannot determine enum constants for Class ");
        sb.append(cls.getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public final SerializableString serializedValueFor(Enum<?> enumR) {
        return this._textual[enumR.ordinal()];
    }

    public final Collection<SerializableString> values() {
        return Arrays.asList(this._textual);
    }

    public final List<Enum<?>> enums() {
        return Arrays.asList(this._values);
    }

    public final Class<Enum<?>> getEnumClass() {
        return this._enumClass;
    }
}
