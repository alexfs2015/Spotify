package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonIgnoreProperties {

    public static class Value implements Serializable {
        protected static final Value EMPTY;
        private static final long serialVersionUID = 1;
        protected final boolean _allowGetters;
        protected final boolean _allowSetters;
        protected final boolean _ignoreUnknown;
        protected final Set<String> _ignored;
        protected final boolean _merge;

        static {
            Value value = new Value(Collections.emptySet(), false, false, false, true);
            EMPTY = value;
        }

        protected Value(Set<String> set, boolean z, boolean z2, boolean z3, boolean z4) {
            if (set == null) {
                this._ignored = Collections.emptySet();
            } else {
                this._ignored = set;
            }
            this._ignoreUnknown = z;
            this._allowGetters = z2;
            this._allowSetters = z3;
            this._merge = z4;
        }

        private static Set<String> _asSet(String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                return Collections.emptySet();
            }
            HashSet hashSet = new HashSet(strArr.length);
            for (String add : strArr) {
                hashSet.add(add);
            }
            return hashSet;
        }

        private static boolean _empty(Set<String> set, boolean z, boolean z2, boolean z3, boolean z4) {
            Value value = EMPTY;
            if (z == value._ignoreUnknown && z2 == value._allowGetters && z3 == value._allowSetters && z4 == value._merge) {
                return set == null || set.size() == 0;
            }
            return false;
        }

        private static boolean _equals(Value value, Value value2) {
            return value._ignoreUnknown == value2._ignoreUnknown && value._merge == value2._merge && value._allowGetters == value2._allowGetters && value._allowSetters == value2._allowSetters && value._ignored.equals(value2._ignored);
        }

        private static Set<String> _merge(Set<String> set, Set<String> set2) {
            if (set.isEmpty()) {
                return set2;
            }
            if (set2.isEmpty()) {
                return set;
            }
            HashSet hashSet = new HashSet(set.size() + set2.size());
            hashSet.addAll(set);
            hashSet.addAll(set2);
            return hashSet;
        }

        public static Value construct(Set<String> set, boolean z, boolean z2, boolean z3, boolean z4) {
            if (_empty(set, z, z2, z3, z4)) {
                return EMPTY;
            }
            Value value = new Value(set, z, z2, z3, z4);
            return value;
        }

        public static Value empty() {
            return EMPTY;
        }

        public static Value from(JsonIgnoreProperties jsonIgnoreProperties) {
            return jsonIgnoreProperties == null ? EMPTY : construct(_asSet(jsonIgnoreProperties.value()), jsonIgnoreProperties.ignoreUnknown(), jsonIgnoreProperties.allowGetters(), jsonIgnoreProperties.allowSetters(), false);
        }

        public static Value merge(Value value, Value value2) {
            return value == null ? value2 : value.withOverrides(value2);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return obj != null && obj.getClass() == getClass() && _equals(this, (Value) obj);
        }

        public Set<String> findIgnoredForDeserialization() {
            return this._allowSetters ? Collections.emptySet() : this._ignored;
        }

        public Set<String> findIgnoredForSerialization() {
            return this._allowGetters ? Collections.emptySet() : this._ignored;
        }

        public boolean getIgnoreUnknown() {
            return this._ignoreUnknown;
        }

        public Set<String> getIgnored() {
            return this._ignored;
        }

        public int hashCode() {
            return this._ignored.size() + (this._ignoreUnknown ? 1 : -3) + (this._allowGetters ? 3 : -7) + (this._allowSetters ? 7 : -11) + (this._merge ? 11 : -13);
        }

        /* access modifiers changed from: protected */
        public Object readResolve() {
            return _empty(this._ignored, this._ignoreUnknown, this._allowGetters, this._allowSetters, this._merge) ? EMPTY : this;
        }

        public String toString() {
            return String.format("JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)", new Object[]{this._ignored, Boolean.valueOf(this._ignoreUnknown), Boolean.valueOf(this._allowGetters), Boolean.valueOf(this._allowSetters), Boolean.valueOf(this._merge)});
        }

        public Value withOverrides(Value value) {
            if (value == null || value == EMPTY) {
                return this;
            }
            if (!value._merge) {
                return value;
            }
            if (_equals(this, value)) {
                return this;
            }
            Set _merge2 = _merge(this._ignored, value._ignored);
            boolean z = false;
            boolean z2 = this._ignoreUnknown || value._ignoreUnknown;
            boolean z3 = this._allowGetters || value._allowGetters;
            if (this._allowSetters || value._allowSetters) {
                z = true;
            }
            return construct(_merge2, z2, z3, z, true);
        }
    }

    boolean allowGetters() default false;

    boolean allowSetters() default false;

    boolean ignoreUnknown() default false;

    String[] value() default {};
}
