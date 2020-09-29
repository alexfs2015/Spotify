package defpackage;

import com.spotify.mobile.android.connect.model.DeviceState;
import com.spotify.mobile.android.connect.model.DeviceType;
import com.spotify.mobile.android.connect.model.GaiaDeviceCapability;
import java.util.List;

/* renamed from: grz reason: default package */
public interface grz {
    List<GaiaDeviceCapability> getCapabilities();

    String getIdentifier();

    String getName();

    DeviceState getState();

    DeviceType getType();

    boolean hasIncarnations();

    boolean isActive();

    boolean isBeingActivated();

    boolean isDisabled();

    boolean isGrouped();

    boolean isSelf();

    void setActive();

    boolean supportsLogout();
}
