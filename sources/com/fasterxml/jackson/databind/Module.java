package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.type.TypeModifier;

public abstract class Module {

    public interface SetupContext {
        void addBeanSerializerModifier(BeanSerializerModifier beanSerializerModifier);

        void addDeserializers(Deserializers deserializers);

        void addSerializers(Serializers serializers);

        void addTypeModifier(TypeModifier typeModifier);
    }

    public abstract String getModuleName();

    public abstract void setupModule(SetupContext setupContext);

    public abstract Version version();

    public Object getTypeId() {
        return getClass().getName();
    }
}
