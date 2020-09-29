package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Value;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

public interface VisibilityChecker<T extends VisibilityChecker<T>> {

    public static class Std implements VisibilityChecker<Std>, Serializable {
        protected static final Std DEFAULT;
        private static final long serialVersionUID = 1;
        protected final Visibility _creatorMinLevel;
        protected final Visibility _fieldMinLevel;
        protected final Visibility _getterMinLevel;
        protected final Visibility _isGetterMinLevel;
        protected final Visibility _setterMinLevel;

        static {
            Visibility visibility = Visibility.PUBLIC_ONLY;
            Visibility visibility2 = Visibility.ANY;
            Std std = new Std(visibility, visibility, visibility2, visibility2, Visibility.PUBLIC_ONLY);
            DEFAULT = std;
        }

        public static Std defaultInstance() {
            return DEFAULT;
        }

        public Std(Visibility visibility, Visibility visibility2, Visibility visibility3, Visibility visibility4, Visibility visibility5) {
            this._getterMinLevel = visibility;
            this._isGetterMinLevel = visibility2;
            this._setterMinLevel = visibility3;
            this._creatorMinLevel = visibility4;
            this._fieldMinLevel = visibility5;
        }

        public Std(Visibility visibility) {
            if (visibility == Visibility.DEFAULT) {
                Std std = DEFAULT;
                this._getterMinLevel = std._getterMinLevel;
                this._isGetterMinLevel = std._isGetterMinLevel;
                this._setterMinLevel = std._setterMinLevel;
                this._creatorMinLevel = std._creatorMinLevel;
                this._fieldMinLevel = std._fieldMinLevel;
                return;
            }
            this._getterMinLevel = visibility;
            this._isGetterMinLevel = visibility;
            this._setterMinLevel = visibility;
            this._creatorMinLevel = visibility;
            this._fieldMinLevel = visibility;
        }

        /* access modifiers changed from: protected */
        public Std _with(Visibility visibility, Visibility visibility2, Visibility visibility3, Visibility visibility4, Visibility visibility5) {
            if (visibility == this._getterMinLevel && visibility2 == this._isGetterMinLevel && visibility3 == this._setterMinLevel && visibility4 == this._creatorMinLevel && visibility5 == this._fieldMinLevel) {
                return this;
            }
            Std std = new Std(visibility, visibility2, visibility3, visibility4, visibility5);
            return std;
        }

        public Std with(JsonAutoDetect jsonAutoDetect) {
            if (jsonAutoDetect == null) {
                return this;
            }
            return _with(_defaultOrOverride(this._getterMinLevel, jsonAutoDetect.getterVisibility()), _defaultOrOverride(this._isGetterMinLevel, jsonAutoDetect.isGetterVisibility()), _defaultOrOverride(this._setterMinLevel, jsonAutoDetect.setterVisibility()), _defaultOrOverride(this._creatorMinLevel, jsonAutoDetect.creatorVisibility()), _defaultOrOverride(this._fieldMinLevel, jsonAutoDetect.fieldVisibility()));
        }

        public Std withOverrides(Value value) {
            if (value == null) {
                return this;
            }
            return _with(_defaultOrOverride(this._getterMinLevel, value.getGetterVisibility()), _defaultOrOverride(this._isGetterMinLevel, value.getIsGetterVisibility()), _defaultOrOverride(this._setterMinLevel, value.getSetterVisibility()), _defaultOrOverride(this._creatorMinLevel, value.getCreatorVisibility()), _defaultOrOverride(this._fieldMinLevel, value.getFieldVisibility()));
        }

        private Visibility _defaultOrOverride(Visibility visibility, Visibility visibility2) {
            return visibility2 == Visibility.DEFAULT ? visibility : visibility2;
        }

        public Std with(Visibility visibility) {
            if (visibility == Visibility.DEFAULT) {
                return DEFAULT;
            }
            return new Std(visibility);
        }

        public Std withVisibility(PropertyAccessor propertyAccessor, Visibility visibility) {
            switch (propertyAccessor) {
                case GETTER:
                    return withGetterVisibility(visibility);
                case SETTER:
                    return withSetterVisibility(visibility);
                case CREATOR:
                    return withCreatorVisibility(visibility);
                case FIELD:
                    return withFieldVisibility(visibility);
                case IS_GETTER:
                    return withIsGetterVisibility(visibility);
                case ALL:
                    return with(visibility);
                default:
                    return this;
            }
        }

        public Std withGetterVisibility(Visibility visibility) {
            if (visibility == Visibility.DEFAULT) {
                visibility = DEFAULT._getterMinLevel;
            }
            Visibility visibility2 = visibility;
            if (this._getterMinLevel == visibility2) {
                return this;
            }
            Std std = new Std(visibility2, this._isGetterMinLevel, this._setterMinLevel, this._creatorMinLevel, this._fieldMinLevel);
            return std;
        }

        public Std withIsGetterVisibility(Visibility visibility) {
            if (visibility == Visibility.DEFAULT) {
                visibility = DEFAULT._isGetterMinLevel;
            }
            Visibility visibility2 = visibility;
            if (this._isGetterMinLevel == visibility2) {
                return this;
            }
            Std std = new Std(this._getterMinLevel, visibility2, this._setterMinLevel, this._creatorMinLevel, this._fieldMinLevel);
            return std;
        }

        public Std withSetterVisibility(Visibility visibility) {
            if (visibility == Visibility.DEFAULT) {
                visibility = DEFAULT._setterMinLevel;
            }
            Visibility visibility2 = visibility;
            if (this._setterMinLevel == visibility2) {
                return this;
            }
            Std std = new Std(this._getterMinLevel, this._isGetterMinLevel, visibility2, this._creatorMinLevel, this._fieldMinLevel);
            return std;
        }

        public Std withCreatorVisibility(Visibility visibility) {
            if (visibility == Visibility.DEFAULT) {
                visibility = DEFAULT._creatorMinLevel;
            }
            Visibility visibility2 = visibility;
            if (this._creatorMinLevel == visibility2) {
                return this;
            }
            Std std = new Std(this._getterMinLevel, this._isGetterMinLevel, this._setterMinLevel, visibility2, this._fieldMinLevel);
            return std;
        }

        public Std withFieldVisibility(Visibility visibility) {
            if (visibility == Visibility.DEFAULT) {
                visibility = DEFAULT._fieldMinLevel;
            }
            Visibility visibility2 = visibility;
            if (this._fieldMinLevel == visibility2) {
                return this;
            }
            Std std = new Std(this._getterMinLevel, this._isGetterMinLevel, this._setterMinLevel, this._creatorMinLevel, visibility2);
            return std;
        }

        public boolean isCreatorVisible(Member member) {
            return this._creatorMinLevel.isVisible(member);
        }

        public boolean isCreatorVisible(AnnotatedMember annotatedMember) {
            return isCreatorVisible(annotatedMember.getMember());
        }

        public boolean isFieldVisible(Field field) {
            return this._fieldMinLevel.isVisible(field);
        }

        public boolean isFieldVisible(AnnotatedField annotatedField) {
            return isFieldVisible(annotatedField.getAnnotated());
        }

        public boolean isGetterVisible(Method method) {
            return this._getterMinLevel.isVisible(method);
        }

        public boolean isGetterVisible(AnnotatedMethod annotatedMethod) {
            return isGetterVisible(annotatedMethod.getAnnotated());
        }

        public boolean isIsGetterVisible(Method method) {
            return this._isGetterMinLevel.isVisible(method);
        }

        public boolean isIsGetterVisible(AnnotatedMethod annotatedMethod) {
            return isIsGetterVisible(annotatedMethod.getAnnotated());
        }

        public boolean isSetterVisible(Method method) {
            return this._setterMinLevel.isVisible(method);
        }

        public boolean isSetterVisible(AnnotatedMethod annotatedMethod) {
            return isSetterVisible(annotatedMethod.getAnnotated());
        }

        public String toString() {
            return String.format("[Visibility: getter=%s,isGetter=%s,setter=%s,creator=%s,field=%s]", new Object[]{this._getterMinLevel, this._isGetterMinLevel, this._setterMinLevel, this._creatorMinLevel, this._fieldMinLevel});
        }
    }

    boolean isCreatorVisible(AnnotatedMember annotatedMember);

    boolean isFieldVisible(AnnotatedField annotatedField);

    boolean isGetterVisible(AnnotatedMethod annotatedMethod);

    boolean isIsGetterVisible(AnnotatedMethod annotatedMethod);

    boolean isSetterVisible(AnnotatedMethod annotatedMethod);

    T with(JsonAutoDetect jsonAutoDetect);

    T withCreatorVisibility(Visibility visibility);

    T withFieldVisibility(Visibility visibility);

    T withGetterVisibility(Visibility visibility);

    T withIsGetterVisibility(Visibility visibility);

    T withOverrides(Value value);

    T withSetterVisibility(Visibility visibility);

    T withVisibility(PropertyAccessor propertyAccessor, Visibility visibility);
}
