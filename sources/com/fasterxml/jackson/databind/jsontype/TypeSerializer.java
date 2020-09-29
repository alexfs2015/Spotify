package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.core.type.WritableTypeId.Inclusion;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.BeanProperty;

public abstract class TypeSerializer {

    /* renamed from: com.fasterxml.jackson.databind.jsontype.TypeSerializer$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As = new int[As.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.fasterxml.jackson.annotation.JsonTypeInfo$As[] r0 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As = r0
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.fasterxml.jackson.annotation.JsonTypeInfo$As r1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As     // Catch:{ NoSuchFieldError -> 0x001f }
                com.fasterxml.jackson.annotation.JsonTypeInfo$As r1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As     // Catch:{ NoSuchFieldError -> 0x002a }
                com.fasterxml.jackson.annotation.JsonTypeInfo$As r1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.fasterxml.jackson.annotation.JsonTypeInfo$As r1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.fasterxml.jackson.annotation.JsonTypeInfo$As r1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.jsontype.TypeSerializer.AnonymousClass1.<clinit>():void");
        }
    }

    public abstract TypeSerializer forProperty(BeanProperty beanProperty);

    public abstract String getPropertyName();

    public abstract As getTypeInclusion();

    public WritableTypeId typeId(Object obj, JsonToken jsonToken) {
        WritableTypeId writableTypeId = new WritableTypeId(obj, jsonToken);
        int i = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[getTypeInclusion().ordinal()];
        if (i == 1) {
            writableTypeId.include = Inclusion.PAYLOAD_PROPERTY;
            writableTypeId.asProperty = getPropertyName();
        } else if (i == 2) {
            writableTypeId.include = Inclusion.PARENT_PROPERTY;
            writableTypeId.asProperty = getPropertyName();
        } else if (i == 3) {
            writableTypeId.include = Inclusion.METADATA_PROPERTY;
            writableTypeId.asProperty = getPropertyName();
        } else if (i == 4) {
            writableTypeId.include = Inclusion.WRAPPER_ARRAY;
        } else if (i != 5) {
            VersionUtil.throwInternal();
        } else {
            writableTypeId.include = Inclusion.WRAPPER_OBJECT;
        }
        return writableTypeId;
    }

    public WritableTypeId typeId(Object obj, JsonToken jsonToken, Object obj2) {
        WritableTypeId typeId = typeId(obj, jsonToken);
        typeId.id = obj2;
        return typeId;
    }

    public WritableTypeId typeId(Object obj, Class<?> cls, JsonToken jsonToken) {
        WritableTypeId typeId = typeId(obj, jsonToken);
        typeId.forValueType = cls;
        return typeId;
    }

    public abstract WritableTypeId writeTypePrefix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId);

    public abstract WritableTypeId writeTypeSuffix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId);
}
