package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class OptionalHandlerFactory implements Serializable {
    private static final Class<?> CLASS_DOM_DOCUMENT = Document.class;
    private static final Class<?> CLASS_DOM_NODE = Node.class;
    private static final Java7Support _jdk7Helper;
    public static final OptionalHandlerFactory instance = new OptionalHandlerFactory();
    private static final long serialVersionUID = 1;

    static {
        Java7Support java7Support;
        try {
            java7Support = Java7Support.instance();
        } catch (Throwable unused) {
            java7Support = null;
        }
        _jdk7Helper = java7Support;
    }

    protected OptionalHandlerFactory() {
    }

    public JsonSerializer<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription) {
        Class rawClass = javaType.getRawClass();
        Java7Support java7Support = _jdk7Helper;
        if (java7Support != null) {
            JsonSerializer<?> serializerForJavaNioFilePath = java7Support.getSerializerForJavaNioFilePath(rawClass);
            if (serializerForJavaNioFilePath != null) {
                return serializerForJavaNioFilePath;
            }
        }
        Class<?> cls = CLASS_DOM_NODE;
        if (cls != null && cls.isAssignableFrom(rawClass)) {
            return (JsonSerializer) instantiate("com.fasterxml.jackson.databind.ext.DOMSerializer");
        }
        String str = "javax.xml.";
        if (!rawClass.getName().startsWith(str) && !hasSuperClassStartingWith(rawClass, str)) {
            return null;
        }
        Object instantiate = instantiate("com.fasterxml.jackson.databind.ext.CoreXMLSerializers");
        if (instantiate == null) {
            return null;
        }
        return ((Serializers) instantiate).findSerializer(serializationConfig, javaType, beanDescription);
    }

    public JsonDeserializer<?> findDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        Class rawClass = javaType.getRawClass();
        Java7Support java7Support = _jdk7Helper;
        if (java7Support != null) {
            JsonDeserializer<?> deserializerForJavaNioFilePath = java7Support.getDeserializerForJavaNioFilePath(rawClass);
            if (deserializerForJavaNioFilePath != null) {
                return deserializerForJavaNioFilePath;
            }
        }
        Class<?> cls = CLASS_DOM_NODE;
        if (cls != null && cls.isAssignableFrom(rawClass)) {
            return (JsonDeserializer) instantiate("com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer");
        }
        Class<?> cls2 = CLASS_DOM_DOCUMENT;
        if (cls2 != null && cls2.isAssignableFrom(rawClass)) {
            return (JsonDeserializer) instantiate("com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer");
        }
        String str = "javax.xml.";
        if (!rawClass.getName().startsWith(str) && !hasSuperClassStartingWith(rawClass, str)) {
            return null;
        }
        Object instantiate = instantiate("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers");
        if (instantiate == null) {
            return null;
        }
        return ((Deserializers) instantiate).findBeanDeserializer(javaType, deserializationConfig, beanDescription);
    }

    private Object instantiate(String str) {
        try {
            return ClassUtil.createInstance(Class.forName(str), false);
        } catch (Exception | LinkageError unused) {
            return null;
        }
    }

    private boolean hasSuperClassStartingWith(Class<?> cls, String str) {
        do {
            cls = cls.getSuperclass();
            if (cls == null || cls == Object.class) {
                return false;
            }
        } while (!cls.getName().startsWith(str));
        return true;
    }
}
