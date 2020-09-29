package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.Converter.None;
import java.lang.reflect.Type;

public abstract class DatabindContext {
    /* access modifiers changed from: protected */
    public String _colonConcat(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String _format(String str, Object... objArr) {
        return objArr.length > 0 ? String.format(str, objArr) : str;
    }

    /* access modifiers changed from: protected */
    public String _quotedString(String str) {
        if (str == null) {
            return "[N/A]";
        }
        return String.format("\"%s\"", new Object[]{_truncate(str)});
    }

    /* access modifiers changed from: protected */
    public final String _truncate(String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 500) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, 500));
        sb.append("]...[");
        sb.append(str.substring(str.length() - 500));
        return sb.toString();
    }

    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) {
        return javaType.getRawClass() == cls ? javaType : getConfig().constructSpecializedType(javaType, cls);
    }

    public JavaType constructType(Type type) {
        if (type == null) {
            return null;
        }
        return getTypeFactory().constructType(type);
    }

    public Converter<Object, Object> converterInstance(Annotated annotated, Object obj) {
        Converter<Object, Object> converter = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Converter) {
            return (Converter) obj;
        }
        if (obj instanceof Class) {
            Class<None> cls = (Class) obj;
            if (cls == None.class || ClassUtil.isBogusClass(cls)) {
                return null;
            }
            if (Converter.class.isAssignableFrom(cls)) {
                MapperConfig config = getConfig();
                HandlerInstantiator handlerInstantiator = config.getHandlerInstantiator();
                if (handlerInstantiator != null) {
                    converter = handlerInstantiator.converterInstance(config, annotated, cls);
                }
                if (converter == null) {
                    converter = (Converter) ClassUtil.createInstance(cls, config.canOverrideAccessModifiers());
                }
                return converter;
            }
            StringBuilder sb = new StringBuilder("AnnotationIntrospector returned Class ");
            sb.append(cls.getName());
            sb.append("; expected Class<Converter>");
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("AnnotationIntrospector returned Converter definition of type ");
        sb2.append(obj.getClass().getName());
        sb2.append("; expected type Converter or Class<Converter> instead");
        throw new IllegalStateException(sb2.toString());
    }

    public abstract MapperConfig<?> getConfig();

    public abstract TypeFactory getTypeFactory();

    /* access modifiers changed from: protected */
    public abstract JsonMappingException invalidTypeIdException(JavaType javaType, String str, String str2);

    public ObjectIdGenerator<?> objectIdGeneratorInstance(Annotated annotated, ObjectIdInfo objectIdInfo) {
        Class generatorType = objectIdInfo.getGeneratorType();
        MapperConfig config = getConfig();
        HandlerInstantiator handlerInstantiator = config.getHandlerInstantiator();
        ObjectIdGenerator objectIdGeneratorInstance = handlerInstantiator == null ? null : handlerInstantiator.objectIdGeneratorInstance(config, annotated, generatorType);
        if (objectIdGeneratorInstance == null) {
            objectIdGeneratorInstance = (ObjectIdGenerator) ClassUtil.createInstance(generatorType, config.canOverrideAccessModifiers());
        }
        return objectIdGeneratorInstance.forScope(objectIdInfo.getScope());
    }

    public ObjectIdResolver objectIdResolverInstance(Annotated annotated, ObjectIdInfo objectIdInfo) {
        Class resolverType = objectIdInfo.getResolverType();
        MapperConfig config = getConfig();
        HandlerInstantiator handlerInstantiator = config.getHandlerInstantiator();
        ObjectIdResolver resolverIdGeneratorInstance = handlerInstantiator == null ? null : handlerInstantiator.resolverIdGeneratorInstance(config, annotated, resolverType);
        return resolverIdGeneratorInstance == null ? (ObjectIdResolver) ClassUtil.createInstance(resolverType, config.canOverrideAccessModifiers()) : resolverIdGeneratorInstance;
    }

    public abstract <T> T reportBadDefinition(JavaType javaType, String str);

    public <T> T reportBadDefinition(Class<?> cls, String str) {
        return reportBadDefinition(constructType(cls), str);
    }

    public JavaType resolveSubType(JavaType javaType, String str) {
        if (str.indexOf(60) > 0) {
            JavaType constructFromCanonical = getTypeFactory().constructFromCanonical(str);
            if (constructFromCanonical.isTypeOrSubTypeOf(javaType.getRawClass())) {
                return constructFromCanonical;
            }
        } else {
            try {
                Class findClass = getTypeFactory().findClass(str);
                if (javaType.isTypeOrSuperTypeOf(findClass)) {
                    return getTypeFactory().constructSpecializedType(javaType, findClass);
                }
            } catch (ClassNotFoundException unused) {
                return null;
            } catch (Exception e) {
                throw invalidTypeIdException(javaType, str, String.format("problem: (%s) %s", new Object[]{e.getClass().getName(), e.getMessage()}));
            }
        }
        throw invalidTypeIdException(javaType, str, "Not a subtype");
    }
}
