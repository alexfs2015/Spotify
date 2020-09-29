package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TypeBindings implements Serializable {
    private static final TypeBindings EMPTY = new TypeBindings(NO_STRINGS, NO_TYPES, null);
    private static final String[] NO_STRINGS = new String[0];
    private static final JavaType[] NO_TYPES = new JavaType[0];
    private static final long serialVersionUID = 1;
    private final int _hashCode;
    private final String[] _names;
    private final JavaType[] _types;
    private final String[] _unboundVariables;

    static final class AsKey {
        private final int _hash;
        private final JavaType[] _params;
        private final Class<?> _raw;

        public AsKey(Class<?> cls, JavaType[] javaTypeArr, int i) {
            this._raw = cls;
            this._params = javaTypeArr;
            this._hash = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            AsKey asKey = (AsKey) obj;
            if (this._hash == asKey._hash && this._raw == asKey._raw) {
                JavaType[] javaTypeArr = asKey._params;
                int length = this._params.length;
                if (length == javaTypeArr.length) {
                    for (int i = 0; i < length; i++) {
                        if (!this._params[i].equals(javaTypeArr[i])) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this._hash;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this._raw.getName());
            sb.append("<>");
            return sb.toString();
        }
    }

    static class TypeParamStash {
        private static final TypeVariable<?>[] VARS_ABSTRACT_LIST = AbstractList.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_ARRAY_LIST = ArrayList.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_COLLECTION = Collection.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_HASH_MAP = HashMap.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_ITERABLE = Iterable.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_LINKED_HASH_MAP = LinkedHashMap.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_LIST = List.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_MAP = Map.class.getTypeParameters();

        public static TypeVariable<?>[] paramsFor1(Class<?> cls) {
            return cls == Collection.class ? VARS_COLLECTION : cls == List.class ? VARS_LIST : cls == ArrayList.class ? VARS_ARRAY_LIST : cls == AbstractList.class ? VARS_ABSTRACT_LIST : cls == Iterable.class ? VARS_ITERABLE : cls.getTypeParameters();
        }

        public static TypeVariable<?>[] paramsFor2(Class<?> cls) {
            return cls == Map.class ? VARS_MAP : cls == HashMap.class ? VARS_HASH_MAP : cls == LinkedHashMap.class ? VARS_LINKED_HASH_MAP : cls.getTypeParameters();
        }
    }

    private TypeBindings(String[] strArr, JavaType[] javaTypeArr, String[] strArr2) {
        if (strArr == null) {
            strArr = NO_STRINGS;
        }
        this._names = strArr;
        if (javaTypeArr == null) {
            javaTypeArr = NO_TYPES;
        }
        this._types = javaTypeArr;
        int length = this._names.length;
        JavaType[] javaTypeArr2 = this._types;
        if (length == javaTypeArr2.length) {
            int i = 1;
            for (int i2 = 0; i2 < javaTypeArr2.length; i2++) {
                i += this._types[i2].hashCode();
            }
            this._unboundVariables = strArr2;
            this._hashCode = i;
            return;
        }
        StringBuilder sb = new StringBuilder("Mismatching names (");
        sb.append(this._names.length);
        sb.append("), types (");
        sb.append(this._types.length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    public static TypeBindings create(Class<?> cls, JavaType javaType) {
        TypeVariable[] paramsFor1 = TypeParamStash.paramsFor1(cls);
        int length = paramsFor1 == null ? 0 : paramsFor1.length;
        if (length == 1) {
            return new TypeBindings(new String[]{paramsFor1[0].getName()}, new JavaType[]{javaType}, null);
        }
        StringBuilder sb = new StringBuilder("Cannot create TypeBindings for class ");
        sb.append(cls.getName());
        sb.append(" with 1 type parameter: class expects ");
        sb.append(length);
        throw new IllegalArgumentException(sb.toString());
    }

    public static TypeBindings create(Class<?> cls, JavaType javaType, JavaType javaType2) {
        TypeVariable[] paramsFor2 = TypeParamStash.paramsFor2(cls);
        int length = paramsFor2 == null ? 0 : paramsFor2.length;
        if (length == 2) {
            return new TypeBindings(new String[]{paramsFor2[0].getName(), paramsFor2[1].getName()}, new JavaType[]{javaType, javaType2}, null);
        }
        StringBuilder sb = new StringBuilder("Cannot create TypeBindings for class ");
        sb.append(cls.getName());
        sb.append(" with 2 type parameters: class expects ");
        sb.append(length);
        throw new IllegalArgumentException(sb.toString());
    }

    public static TypeBindings create(Class<?> cls, List<JavaType> list) {
        return create(cls, (list == null || list.isEmpty()) ? NO_TYPES : (JavaType[]) list.toArray(new JavaType[list.size()]));
    }

    public static TypeBindings create(Class<?> cls, JavaType[] javaTypeArr) {
        String[] strArr;
        if (javaTypeArr == null) {
            javaTypeArr = NO_TYPES;
        } else {
            int length = javaTypeArr.length;
            if (length == 1) {
                return create(cls, javaTypeArr[0]);
            }
            if (length == 2) {
                return create(cls, javaTypeArr[0], javaTypeArr[1]);
            }
        }
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            strArr = NO_STRINGS;
        } else {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i = 0; i < length2; i++) {
                strArr[i] = typeParameters[i].getName();
            }
        }
        if (strArr.length == javaTypeArr.length) {
            return new TypeBindings(strArr, javaTypeArr, null);
        }
        StringBuilder sb = new StringBuilder("Cannot create TypeBindings for class ");
        sb.append(cls.getName());
        sb.append(" with ");
        sb.append(javaTypeArr.length);
        sb.append(" type parameter");
        sb.append(javaTypeArr.length == 1 ? "" : "s");
        sb.append(": class expects ");
        sb.append(strArr.length);
        throw new IllegalArgumentException(sb.toString());
    }

    public static TypeBindings createIfNeeded(Class<?> cls, JavaType javaType) {
        TypeVariable[] typeParameters = cls.getTypeParameters();
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 0) {
            return EMPTY;
        }
        if (length == 1) {
            return new TypeBindings(new String[]{typeParameters[0].getName()}, new JavaType[]{javaType}, null);
        }
        StringBuilder sb = new StringBuilder("Cannot create TypeBindings for class ");
        sb.append(cls.getName());
        sb.append(" with 1 type parameter: class expects ");
        sb.append(length);
        throw new IllegalArgumentException(sb.toString());
    }

    public static TypeBindings createIfNeeded(Class<?> cls, JavaType[] javaTypeArr) {
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            return EMPTY;
        }
        if (javaTypeArr == null) {
            javaTypeArr = NO_TYPES;
        }
        int length = typeParameters.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = typeParameters[i].getName();
        }
        if (strArr.length == javaTypeArr.length) {
            return new TypeBindings(strArr, javaTypeArr, null);
        }
        StringBuilder sb = new StringBuilder("Cannot create TypeBindings for class ");
        sb.append(cls.getName());
        sb.append(" with ");
        sb.append(javaTypeArr.length);
        sb.append(" type parameter");
        sb.append(javaTypeArr.length == 1 ? "" : "s");
        sb.append(": class expects ");
        sb.append(strArr.length);
        throw new IllegalArgumentException(sb.toString());
    }

    public static TypeBindings emptyBindings() {
        return EMPTY;
    }

    public Object asKey(Class<?> cls) {
        return new AsKey(cls, this._types, this._hashCode);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.hasClass(obj, getClass())) {
            return false;
        }
        TypeBindings typeBindings = (TypeBindings) obj;
        int length = this._types.length;
        if (length != typeBindings.size()) {
            return false;
        }
        JavaType[] javaTypeArr = typeBindings._types;
        for (int i = 0; i < length; i++) {
            if (!javaTypeArr[i].equals(this._types[i])) {
                return false;
            }
        }
        return true;
    }

    public JavaType findBoundType(String str) {
        int length = this._names.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(this._names[i])) {
                JavaType javaType = this._types[i];
                if (javaType instanceof ResolvedRecursiveType) {
                    JavaType selfReferencedType = ((ResolvedRecursiveType) javaType).getSelfReferencedType();
                    if (selfReferencedType != null) {
                        javaType = selfReferencedType;
                    }
                }
                return javaType;
            }
        }
        return null;
    }

    public JavaType getBoundType(int i) {
        if (i >= 0) {
            JavaType[] javaTypeArr = this._types;
            if (i < javaTypeArr.length) {
                return javaTypeArr[i];
            }
        }
        return null;
    }

    public List<JavaType> getTypeParameters() {
        JavaType[] javaTypeArr = this._types;
        return javaTypeArr.length == 0 ? Collections.emptyList() : Arrays.asList(javaTypeArr);
    }

    public boolean hasUnbound(String str) {
        String[] strArr = this._unboundVariables;
        if (strArr != null) {
            int length = strArr.length;
            do {
                length--;
                if (length >= 0) {
                }
            } while (!str.equals(this._unboundVariables[length]));
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this._hashCode;
    }

    public boolean isEmpty() {
        return this._types.length == 0;
    }

    /* access modifiers changed from: protected */
    public Object readResolve() {
        String[] strArr = this._names;
        return (strArr == null || strArr.length == 0) ? EMPTY : this;
    }

    public int size() {
        return this._types.length;
    }

    public String toString() {
        if (this._types.length == 0) {
            return "<>";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        int length = this._types.length;
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(this._types[i].getGenericSignature());
        }
        sb.append('>');
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public JavaType[] typeParameterArray() {
        return this._types;
    }

    public TypeBindings withUnboundVariable(String str) {
        String[] strArr = this._unboundVariables;
        int length = strArr == null ? 0 : strArr.length;
        String[] strArr2 = length == 0 ? new String[1] : (String[]) Arrays.copyOf(this._unboundVariables, length + 1);
        strArr2[length] = str;
        return new TypeBindings(this._names, this._types, strArr2);
    }
}
