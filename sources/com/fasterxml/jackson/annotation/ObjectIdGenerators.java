package com.fasterxml.jackson.annotation;

public class ObjectIdGenerators {

    public static abstract class Base<T> extends ObjectIdGenerator<T> {
        protected final Class<?> _scope;

        protected Base(Class<?> cls) {
            this._scope = cls;
        }

        public boolean canUseFor(ObjectIdGenerator<?> objectIdGenerator) {
            return objectIdGenerator.getClass() == getClass() && objectIdGenerator.getScope() == this._scope;
        }

        public final Class<?> getScope() {
            return this._scope;
        }
    }

    public static abstract class None extends ObjectIdGenerator<Object> {
    }

    public static abstract class PropertyGenerator extends Base<Object> {
        private static final long serialVersionUID = 1;

        protected PropertyGenerator(Class<?> cls) {
            super(cls);
        }

        public /* bridge */ /* synthetic */ boolean canUseFor(ObjectIdGenerator objectIdGenerator) {
            return super.canUseFor(objectIdGenerator);
        }
    }
}
