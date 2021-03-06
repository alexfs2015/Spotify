package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;

public class ObjectIdReferenceProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    private final SettableBeanProperty _forward;

    public static final class PropertyReferring extends Referring {
        private final ObjectIdReferenceProperty _parent;
        public final Object _pojo;

        public PropertyReferring(ObjectIdReferenceProperty objectIdReferenceProperty, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj) {
            super(unresolvedForwardReference, cls);
            this._parent = objectIdReferenceProperty;
            this._pojo = obj;
        }

        public final void handleResolvedForwardReference(Object obj, Object obj2) {
            if (hasId(obj)) {
                this._parent.set(this._pojo, obj2);
                return;
            }
            StringBuilder sb = new StringBuilder("Trying to resolve a forward reference with id [");
            sb.append(obj);
            sb.append("] that wasn't previously seen as unresolved.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public ObjectIdReferenceProperty(SettableBeanProperty settableBeanProperty, ObjectIdInfo objectIdInfo) {
        super(settableBeanProperty);
        this._forward = settableBeanProperty;
        this._objectIdInfo = objectIdInfo;
    }

    public ObjectIdReferenceProperty(ObjectIdReferenceProperty objectIdReferenceProperty, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider) {
        super(objectIdReferenceProperty, jsonDeserializer, nullValueProvider);
        this._forward = objectIdReferenceProperty._forward;
        this._objectIdInfo = objectIdReferenceProperty._objectIdInfo;
    }

    public ObjectIdReferenceProperty(ObjectIdReferenceProperty objectIdReferenceProperty, PropertyName propertyName) {
        super(objectIdReferenceProperty, propertyName);
        this._forward = objectIdReferenceProperty._forward;
        this._objectIdInfo = objectIdReferenceProperty._objectIdInfo;
    }

    public SettableBeanProperty withName(PropertyName propertyName) {
        return new ObjectIdReferenceProperty(this, propertyName);
    }

    public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> jsonDeserializer) {
        if (this._valueDeserializer == jsonDeserializer) {
            return this;
        }
        return new ObjectIdReferenceProperty(this, jsonDeserializer, this._nullProvider);
    }

    public SettableBeanProperty withNullProvider(NullValueProvider nullValueProvider) {
        return new ObjectIdReferenceProperty(this, this._valueDeserializer, nullValueProvider);
    }

    public void fixAccess(DeserializationConfig deserializationConfig) {
        SettableBeanProperty settableBeanProperty = this._forward;
        if (settableBeanProperty != null) {
            settableBeanProperty.fixAccess(deserializationConfig);
        }
    }

    public AnnotatedMember getMember() {
        return this._forward.getMember();
    }

    public int getCreatorIndex() {
        return this._forward.getCreatorIndex();
    }

    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        deserializeSetAndReturn(jsonParser, deserializationContext, obj);
    }

    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        try {
            return setAndReturn(obj, deserialize(jsonParser, deserializationContext));
        } catch (UnresolvedForwardReference e) {
            if ((this._objectIdInfo == null && this._valueDeserializer.getObjectIdReader() == null) ? false : true) {
                e.getRoid().appendReferring(new PropertyReferring(this, e, this._type.getRawClass(), obj));
                return null;
            }
            throw JsonMappingException.from(jsonParser, "Unresolved forward reference but no identity info", (Throwable) e);
        }
    }

    public void set(Object obj, Object obj2) {
        this._forward.set(obj, obj2);
    }

    public Object setAndReturn(Object obj, Object obj2) {
        return this._forward.setAndReturn(obj, obj2);
    }
}
