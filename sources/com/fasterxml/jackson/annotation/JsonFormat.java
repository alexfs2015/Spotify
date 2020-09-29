package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.TimeZone;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonFormat {

    public enum Feature {
        ACCEPT_SINGLE_VALUE_AS_ARRAY,
        ACCEPT_CASE_INSENSITIVE_PROPERTIES,
        WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS,
        WRITE_DATES_WITH_ZONE_ID,
        WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED,
        WRITE_SORTED_MAP_ENTRIES,
        ADJUST_DATES_TO_CONTEXT_TIME_ZONE
    }

    public static class Features {
        private static final Features EMPTY = new Features(0, 0);
        private final int _disabled;
        private final int _enabled;

        private Features(int i, int i2) {
            this._enabled = i;
            this._disabled = i2;
        }

        public static Features construct(JsonFormat jsonFormat) {
            return construct(jsonFormat.with(), jsonFormat.without());
        }

        public static Features construct(Feature[] featureArr, Feature[] featureArr2) {
            int i = 0;
            for (Feature ordinal : featureArr) {
                i |= 1 << ordinal.ordinal();
            }
            int i2 = 0;
            for (Feature ordinal2 : featureArr2) {
                i2 |= 1 << ordinal2.ordinal();
            }
            return new Features(i, i2);
        }

        public static Features empty() {
            return EMPTY;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            Features features = (Features) obj;
            return features._enabled == this._enabled && features._disabled == this._disabled;
        }

        public Boolean get(Feature feature) {
            int ordinal = 1 << feature.ordinal();
            if ((this._disabled & ordinal) != 0) {
                return Boolean.FALSE;
            }
            if ((ordinal & this._enabled) != 0) {
                return Boolean.TRUE;
            }
            return null;
        }

        public int hashCode() {
            return this._disabled + this._enabled;
        }

        public String toString() {
            if (this == EMPTY) {
                return "EMPTY";
            }
            return String.format("(enabled=0x%x,disabled=0x%x)", new Object[]{Integer.valueOf(this._enabled), Integer.valueOf(this._disabled)});
        }

        public Features withOverrides(Features features) {
            if (features == null) {
                return this;
            }
            int i = features._disabled;
            int i2 = features._enabled;
            if (i == 0 && i2 == 0) {
                return this;
            }
            if (this._enabled == 0 && this._disabled == 0) {
                return features;
            }
            int i3 = this._enabled;
            int i4 = ((i ^ -1) & i3) | i2;
            int i5 = this._disabled;
            int i6 = i | ((i2 ^ -1) & i5);
            return (i4 == i3 && i6 == i5) ? this : new Features(i4, i6);
        }
    }

    public enum Shape {
        ANY,
        NATURAL,
        SCALAR,
        ARRAY,
        OBJECT,
        NUMBER,
        NUMBER_FLOAT,
        NUMBER_INT,
        STRING,
        BOOLEAN;

        public final boolean isNumeric() {
            return this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT;
        }
    }

    public static class Value implements Serializable {
        private static final Value EMPTY = new Value();
        private static final long serialVersionUID = 1;
        private final Features _features;
        private final Boolean _lenient;
        private final Locale _locale;
        private final String _pattern;
        private final Shape _shape;
        private transient TimeZone _timezone;
        private final String _timezoneStr;

        public Value() {
            this("", Shape.ANY, "", "", Features.empty(), null);
        }

        public Value(JsonFormat jsonFormat) {
            this(jsonFormat.pattern(), jsonFormat.shape(), jsonFormat.locale(), jsonFormat.timezone(), Features.construct(jsonFormat), jsonFormat.lenient().asBoolean());
        }

        public Value(String str, Shape shape, String str2, String str3, Features features, Boolean bool) {
            String str4 = str2;
            String str5 = str3;
            String str6 = "##default";
            this(str, shape, (str4 == null || str2.length() == 0 || str6.equals(str4)) ? null : new Locale(str4), (str5 == null || str3.length() == 0 || str6.equals(str5)) ? null : str5, null, features, bool);
        }

        public Value(String str, Shape shape, Locale locale, String str2, TimeZone timeZone, Features features, Boolean bool) {
            this._pattern = str;
            if (shape == null) {
                shape = Shape.ANY;
            }
            this._shape = shape;
            this._locale = locale;
            this._timezone = timeZone;
            this._timezoneStr = str2;
            if (features == null) {
                features = Features.empty();
            }
            this._features = features;
            this._lenient = bool;
        }

        private static <T> boolean _equal(T t, T t2) {
            if (t == null) {
                return t2 == null;
            }
            if (t2 == null) {
                return false;
            }
            return t.equals(t2);
        }

        public static final Value empty() {
            return EMPTY;
        }

        public static Value merge(Value value, Value value2) {
            return value == null ? value2 : value.withOverrides(value2);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            Value value = (Value) obj;
            return this._shape == value._shape && this._features.equals(value._features) && _equal(this._lenient, value._lenient) && _equal(this._timezoneStr, value._timezoneStr) && _equal(this._pattern, value._pattern) && _equal(this._timezone, value._timezone) && _equal(this._locale, value._locale);
        }

        public Boolean getFeature(Feature feature) {
            return this._features.get(feature);
        }

        public Boolean getLenient() {
            return this._lenient;
        }

        public Locale getLocale() {
            return this._locale;
        }

        public String getPattern() {
            return this._pattern;
        }

        public Shape getShape() {
            return this._shape;
        }

        public TimeZone getTimeZone() {
            TimeZone timeZone = this._timezone;
            if (timeZone == null) {
                String str = this._timezoneStr;
                if (str == null) {
                    return null;
                }
                timeZone = TimeZone.getTimeZone(str);
                this._timezone = timeZone;
            }
            return timeZone;
        }

        public boolean hasLocale() {
            return this._locale != null;
        }

        public boolean hasPattern() {
            String str = this._pattern;
            return str != null && str.length() > 0;
        }

        public boolean hasShape() {
            return this._shape != Shape.ANY;
        }

        public boolean hasTimeZone() {
            if (this._timezone == null) {
                String str = this._timezoneStr;
                if (str == null || str.isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            String str = this._timezoneStr;
            int hashCode = str == null ? 1 : str.hashCode();
            String str2 = this._pattern;
            if (str2 != null) {
                hashCode ^= str2.hashCode();
            }
            int hashCode2 = hashCode + this._shape.hashCode();
            Boolean bool = this._lenient;
            if (bool != null) {
                hashCode2 ^= bool.hashCode();
            }
            Locale locale = this._locale;
            if (locale != null) {
                hashCode2 += locale.hashCode();
            }
            return hashCode2 ^ this._features.hashCode();
        }

        public String toString() {
            return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s,features=%s)", new Object[]{this._pattern, this._shape, this._lenient, this._locale, this._timezoneStr, this._features});
        }

        public final Value withOverrides(Value value) {
            TimeZone timeZone;
            String str;
            if (value != null) {
                Value value2 = EMPTY;
                if (!(value == value2 || value == this)) {
                    if (this == value2) {
                        return value;
                    }
                    String str2 = value._pattern;
                    if (str2 == null || str2.isEmpty()) {
                        str2 = this._pattern;
                    }
                    String str3 = str2;
                    Shape shape = value._shape;
                    if (shape == Shape.ANY) {
                        shape = this._shape;
                    }
                    Shape shape2 = shape;
                    Locale locale = value._locale;
                    if (locale == null) {
                        locale = this._locale;
                    }
                    Locale locale2 = locale;
                    Features features = this._features;
                    Features withOverrides = features == null ? value._features : features.withOverrides(value._features);
                    Boolean bool = value._lenient;
                    if (bool == null) {
                        bool = this._lenient;
                    }
                    Boolean bool2 = bool;
                    String str4 = value._timezoneStr;
                    if (str4 == null || str4.isEmpty()) {
                        str = this._timezoneStr;
                        timeZone = this._timezone;
                    } else {
                        timeZone = value._timezone;
                        str = str4;
                    }
                    Value value3 = new Value(str3, shape2, locale2, str, timeZone, withOverrides, bool2);
                    return value3;
                }
            }
            return this;
        }
    }

    OptBoolean lenient() default OptBoolean.DEFAULT;

    String locale() default "##default";

    String pattern() default "";

    Shape shape() default Shape.ANY;

    String timezone() default "##default";

    Feature[] with() default {};

    Feature[] without() default {};
}
