package rx.internal.util;

public final class UtilityFunctions {

    enum AlwaysTrue implements wut<Object, Boolean> {
        INSTANCE
    }

    public enum Identity implements wut<Object, Object> {
        INSTANCE;

        public final Object call(Object obj) {
            return obj;
        }
    }
}
