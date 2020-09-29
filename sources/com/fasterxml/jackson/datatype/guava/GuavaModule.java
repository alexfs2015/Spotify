package com.fasterxml.jackson.datatype.guava;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.Module.SetupContext;
import com.fasterxml.jackson.datatype.guava.ser.GuavaBeanSerializerModifier;
import com.google.common.collect.BoundType;

public class GuavaModule extends Module {
    private final String NAME = "GuavaModule";
    protected boolean _cfgHandleAbsentAsNull = true;
    protected BoundType _defaultBoundType;

    public boolean equals(Object obj) {
        return this == obj;
    }

    public String getModuleName() {
        return "GuavaModule";
    }

    public Version version() {
        return PackageVersion.VERSION;
    }

    public void setupModule(SetupContext setupContext) {
        setupContext.addDeserializers(new GuavaDeserializers(this._defaultBoundType));
        setupContext.addSerializers(new GuavaSerializers());
        setupContext.addTypeModifier(new GuavaTypeModifier());
        if (this._cfgHandleAbsentAsNull) {
            setupContext.addBeanSerializerModifier(new GuavaBeanSerializerModifier());
        }
    }

    public int hashCode() {
        return "GuavaModule".hashCode();
    }
}
