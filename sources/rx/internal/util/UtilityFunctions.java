package rx.internal.util;

public final class UtilityFunctions {

    enum AlwaysTrue implements xiy<Object, Boolean> {
        INSTANCE
    }

    public enum Identity implements xiy<Object, Object> {
        INSTANCE;

        public final Object call(Object obj) {
            return obj;
        }
    }
}
