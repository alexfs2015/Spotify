package io.fabric.sdk.android.services.common;

public enum DeliveryMechanism {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    
    public final int id;

    private DeliveryMechanism(int i) {
        this.id = i;
    }

    public static DeliveryMechanism a(String str) {
        return "io.crash.air".equals(str) ? TEST_DISTRIBUTION : str != null ? APP_STORE : DEVELOPER;
    }

    public final String toString() {
        return Integer.toString(this.id);
    }
}
