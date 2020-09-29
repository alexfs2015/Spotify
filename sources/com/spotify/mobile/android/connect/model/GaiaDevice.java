package com.spotify.mobile.android.connect.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.connect.model.DeviceState.GaiaDeviceState;
import com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collections;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GaiaDevice implements Parcelable, JacksonModel, grz {
    public static final Creator<GaiaDevice> CREATOR = new Creator<GaiaDevice>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new GaiaDevice[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new GaiaDevice(parcel);
        }
    };
    private final String mAttachId;
    private final String mBrandName;
    private final List<GaiaDeviceCapability> mCapabilities;
    private final long mCreationTime;
    private final String mIdentifier;
    private final List<GaiaDeviceIncarnation> mIncarnations;
    private boolean mIsActive;
    private final boolean mIsAttached;
    private final boolean mIsBeingActivated;
    private final boolean mIsConnect;
    private final boolean mIsDisabled;
    private final boolean mIsGrouped;
    private final boolean mIsNewlyDiscovered;
    private final boolean mIsSelf;
    private final boolean mIsSocialConnect;
    private final boolean mIsWebApp;
    private final boolean mIsZeroConf;
    private final String mModelName;
    private final String mName;
    private final String mPhysicalIdentifier;
    private final GaiaDeviceState mState;
    private final boolean mSupportsLogout;
    private final boolean mSupportsRename;
    private boolean mSupportsVolume;
    private final GaiaTypes mType;
    private final String mVolume;

    public int describeContents() {
        return 0;
    }

    @JsonCreator
    public GaiaDevice(@JsonProperty("is_self") boolean z, @JsonProperty("is_active") boolean z2, @JsonProperty("is_being_activated") boolean z3, @JsonProperty("is_attached") boolean z4, @JsonProperty("is_connect") boolean z5, @JsonProperty("is_webapp") boolean z6, @JsonProperty("is_zeroconf") boolean z7, @JsonProperty("is_group") boolean z8, @JsonProperty("is_social_connect") boolean z9, @JsonProperty("supports_logout") boolean z10, @JsonProperty("supports_volume") boolean z11, @JsonProperty("supports_rename") boolean z12, @JsonProperty("creation_time_ms") long j, @JsonProperty("brand_display_name") String str, @JsonProperty("model_display_name") String str2, @JsonProperty("identifier") String str3, @JsonProperty("physical_identifier") String str4, @JsonProperty("name") String str5, @JsonProperty("state") GaiaDeviceState gaiaDeviceState, @JsonProperty("type") GaiaTypes gaiaTypes, @JsonProperty("incarnations") List<GaiaDeviceIncarnation> list, @JsonProperty("volume") String str6, @JsonProperty("attach_id") String str7, @JsonProperty("is_newly_discovered") boolean z13, @JsonProperty("is_disabled") boolean z14, @JsonProperty("capabilities") List<GaiaDeviceCapability> list2) {
        List<GaiaDeviceCapability> list3;
        List<GaiaDeviceIncarnation> list4;
        this.mIsSelf = z;
        this.mIsActive = z2;
        this.mIsBeingActivated = z3;
        this.mIsAttached = z4;
        this.mIsConnect = z5;
        this.mIsWebApp = z6;
        this.mIsZeroConf = z7;
        this.mIsGrouped = z8;
        this.mIsSocialConnect = z9;
        this.mSupportsLogout = z10;
        this.mSupportsVolume = z11;
        this.mSupportsRename = z12;
        this.mCreationTime = j;
        this.mBrandName = str;
        this.mModelName = str2;
        this.mIdentifier = str3;
        this.mPhysicalIdentifier = str4;
        this.mName = str5;
        this.mState = gaiaDeviceState;
        this.mType = gaiaTypes;
        if (list2 != null) {
            list3 = list2;
        } else {
            list3 = Collections.emptyList();
        }
        this.mCapabilities = list3;
        if (list != null) {
            list4 = list;
        } else {
            list4 = Collections.emptyList();
        }
        this.mIncarnations = list4;
        this.mVolume = str6;
        this.mAttachId = str7;
        this.mIsNewlyDiscovered = z13;
        this.mIsDisabled = z14;
    }

    protected GaiaDevice(Parcel parcel) {
        this.mCreationTime = parcel.readLong();
        this.mIsSelf = jse.a(parcel);
        this.mIsActive = jse.a(parcel);
        this.mIsBeingActivated = jse.a(parcel);
        this.mIsAttached = jse.a(parcel);
        this.mIsConnect = jse.a(parcel);
        this.mIsWebApp = jse.a(parcel);
        this.mIsZeroConf = jse.a(parcel);
        this.mIsGrouped = jse.a(parcel);
        this.mIsSocialConnect = jse.a(parcel);
        this.mSupportsLogout = jse.a(parcel);
        this.mSupportsVolume = jse.a(parcel);
        this.mSupportsRename = jse.a(parcel);
        this.mIsNewlyDiscovered = jse.a(parcel);
        this.mIsDisabled = jse.a(parcel);
        this.mBrandName = parcel.readString();
        this.mModelName = parcel.readString();
        this.mIdentifier = parcel.readString();
        this.mPhysicalIdentifier = parcel.readString();
        this.mName = parcel.readString();
        this.mVolume = parcel.readString();
        this.mAttachId = parcel.readString();
        this.mState = (GaiaDeviceState) jse.a(parcel, GaiaDeviceState.class);
        this.mType = (GaiaTypes) jse.a(parcel, GaiaTypes.class);
        this.mCapabilities = parcel.createTypedArrayList(GaiaDeviceCapability.CREATOR);
        this.mIncarnations = parcel.createTypedArrayList(GaiaDeviceIncarnation.CREATOR);
    }

    @JsonGetter("brand_display_name")
    public String getBrandName() {
        return this.mBrandName;
    }

    @JsonGetter("is_self")
    public boolean isSelf() {
        return this.mIsSelf;
    }

    @JsonGetter("creation_time_ms")
    public long getCreationTime() {
        return this.mCreationTime;
    }

    @JsonGetter("identifier")
    public String getIdentifier() {
        return this.mIdentifier;
    }

    @JsonGetter("physical_identifier")
    public String getPhysicalIdentifier() {
        return this.mPhysicalIdentifier;
    }

    @JsonGetter("is_active")
    public boolean isActive() {
        return this.mIsActive;
    }

    @JsonGetter("is_being_activated")
    public boolean isBeingActivated() {
        return this.mIsBeingActivated;
    }

    @JsonGetter("is_attached")
    public boolean isAttached() {
        return this.mIsAttached;
    }

    @JsonGetter("is_connect")
    public boolean isConnect() {
        return this.mIsConnect;
    }

    @JsonGetter("is_webapp")
    public boolean isWebApp() {
        return this.mIsWebApp;
    }

    @JsonGetter("is_zeroconf")
    public boolean isZeroConf() {
        return this.mIsZeroConf;
    }

    @JsonGetter("is_group")
    public boolean isGrouped() {
        return this.mIsGrouped;
    }

    @JsonGetter("is_social_connect")
    public boolean isSocialConnect() {
        return this.mIsSocialConnect;
    }

    @JsonGetter("model_display_name")
    public String getModelName() {
        return this.mModelName;
    }

    @JsonGetter("name")
    public String getName() {
        return this.mName;
    }

    public DeviceState getState() {
        return this.mState;
    }

    @JsonGetter("state")
    public GaiaDeviceState getStateSerializable() {
        return this.mState;
    }

    @JsonGetter("supports_logout")
    public boolean supportsLogout() {
        return this.mSupportsLogout;
    }

    @JsonGetter("supports_volume")
    public boolean supportsVolume() {
        return this.mSupportsVolume;
    }

    public void setSupportsVolume(boolean z) {
        this.mSupportsVolume = z;
    }

    @JsonGetter("supports_rename")
    public boolean supportsRename() {
        return this.mSupportsRename;
    }

    public DeviceType getType() {
        return this.mType;
    }

    @JsonGetter("type")
    public GaiaTypes getTypeSerializable() {
        return this.mType;
    }

    @JsonGetter("volume")
    public String getVolume() {
        return this.mVolume;
    }

    @JsonGetter("attach_id")
    public String getAttachId() {
        return this.mAttachId;
    }

    @JsonGetter("is_newly_discovered")
    public boolean isNewlyDiscovered() {
        return this.mIsNewlyDiscovered;
    }

    @JsonGetter("is_disabled")
    public boolean isDisabled() {
        return this.mIsDisabled;
    }

    @JsonGetter("incarnations")
    public List<GaiaDeviceIncarnation> getIncarnations() {
        return this.mIncarnations;
    }

    public boolean hasIncarnations() {
        return !this.mIncarnations.isEmpty();
    }

    @JsonGetter("capabilities")
    public List<GaiaDeviceCapability> getCapabilities() {
        return this.mCapabilities;
    }

    public void setActive() {
        this.mIsActive = true;
    }

    public void setInactive() {
        this.mIsActive = false;
    }

    @JsonIgnore
    public String toStringState() {
        StringBuilder sb = new StringBuilder("GaiaDevice{, mIsActive=");
        sb.append(this.mIsActive);
        sb.append(", mIsBeingActivated=");
        sb.append(this.mIsBeingActivated);
        sb.append(", mIsAttached=");
        sb.append(this.mIsAttached);
        sb.append(", mBrandName='");
        sb.append(this.mBrandName);
        sb.append('\'');
        sb.append(", mModelName='");
        sb.append(this.mModelName);
        sb.append('\'');
        sb.append(", mIdentifier='");
        sb.append(this.mIdentifier);
        sb.append('\'');
        sb.append(", mName='");
        sb.append(this.mName);
        sb.append('\'');
        sb.append(", mState=");
        sb.append(this.mState);
        sb.append(", mType=");
        sb.append(this.mType);
        sb.append('}');
        return sb.toString();
    }

    @JsonIgnore
    public String toString() {
        StringBuilder sb = new StringBuilder("GaiaDevice{mCreationTime=");
        sb.append(this.mCreationTime);
        sb.append(", mIsSelf=");
        sb.append(this.mIsSelf);
        sb.append(", mIsActive=");
        sb.append(this.mIsActive);
        sb.append(", mIsBeingActivated=");
        sb.append(this.mIsBeingActivated);
        sb.append(", mIsAttached=");
        sb.append(this.mIsAttached);
        sb.append(", mIsConnect=");
        sb.append(this.mIsConnect);
        sb.append(", mIsWebApp=");
        sb.append(this.mIsWebApp);
        sb.append(", mIsZeroConf=");
        sb.append(this.mIsZeroConf);
        sb.append(", mIsGrouped=");
        sb.append(this.mIsGrouped);
        sb.append(", mIsSocialConnect=");
        sb.append(this.mIsSocialConnect);
        sb.append(", mSupportsLogout=");
        sb.append(this.mSupportsLogout);
        sb.append(", mSupportsVolume=");
        sb.append(this.mSupportsVolume);
        sb.append(", mSupportsRename=");
        sb.append(this.mSupportsRename);
        sb.append(", mIsNewlyDiscovered=");
        sb.append(this.mIsNewlyDiscovered);
        sb.append(", mIsDisabled=");
        sb.append(this.mIsDisabled);
        sb.append(", mBrandName='");
        sb.append(this.mBrandName);
        sb.append('\'');
        sb.append(", mModelName='");
        sb.append(this.mModelName);
        sb.append('\'');
        sb.append(", mIdentifier='");
        sb.append(this.mIdentifier);
        sb.append('\'');
        sb.append(", mPhysicalIdentifier='");
        sb.append(this.mPhysicalIdentifier);
        sb.append('\'');
        sb.append(", mName='");
        sb.append(this.mName);
        sb.append('\'');
        sb.append(", mVolume='");
        sb.append(this.mVolume);
        sb.append('\'');
        sb.append(", mAttachId='");
        sb.append(this.mAttachId);
        sb.append('\'');
        sb.append(", mState=");
        sb.append(this.mState);
        sb.append(", mType=");
        sb.append(this.mType);
        sb.append(", mCapabilities=");
        sb.append(this.mCapabilities);
        sb.append(", mIncarnations=");
        sb.append(this.mIncarnations);
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GaiaDevice)) {
            return false;
        }
        GaiaDevice gaiaDevice = (GaiaDevice) obj;
        String str = this.mBrandName;
        if (str == null ? gaiaDevice.mBrandName != null : !str.equals(gaiaDevice.mBrandName)) {
            return false;
        }
        String str2 = this.mModelName;
        if (str2 == null ? gaiaDevice.mModelName != null : !str2.equals(gaiaDevice.mModelName)) {
            return false;
        }
        String str3 = this.mIdentifier;
        if (str3 == null ? gaiaDevice.mIdentifier != null : !str3.equals(gaiaDevice.mIdentifier)) {
            return false;
        }
        String str4 = this.mPhysicalIdentifier;
        if (str4 == null ? gaiaDevice.mPhysicalIdentifier != null : !str4.equals(gaiaDevice.mPhysicalIdentifier)) {
            return false;
        }
        String str5 = this.mName;
        if (str5 == null ? gaiaDevice.mName != null : !str5.equals(gaiaDevice.mName)) {
            return false;
        }
        if (this.mIsActive != gaiaDevice.mIsActive) {
            return false;
        }
        String str6 = this.mAttachId;
        String str7 = gaiaDevice.mAttachId;
        if (str6 != null) {
            return str6.equals(str7);
        }
        return str7 == null;
    }

    public int hashCode() {
        String str = this.mBrandName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.mModelName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mIdentifier;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.mPhysicalIdentifier;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.mName;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.mAttachId;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mCreationTime);
        jse.a(parcel, this.mIsSelf);
        jse.a(parcel, this.mIsActive);
        jse.a(parcel, this.mIsBeingActivated);
        jse.a(parcel, this.mIsAttached);
        jse.a(parcel, this.mIsConnect);
        jse.a(parcel, this.mIsWebApp);
        jse.a(parcel, this.mIsZeroConf);
        jse.a(parcel, this.mIsGrouped);
        jse.a(parcel, this.mIsSocialConnect);
        jse.a(parcel, this.mSupportsLogout);
        jse.a(parcel, this.mSupportsVolume);
        jse.a(parcel, this.mSupportsRename);
        jse.a(parcel, this.mIsNewlyDiscovered);
        jse.a(parcel, this.mIsDisabled);
        parcel.writeString(this.mBrandName);
        parcel.writeString(this.mModelName);
        parcel.writeString(this.mIdentifier);
        parcel.writeString(this.mPhysicalIdentifier);
        parcel.writeString(this.mName);
        parcel.writeString(this.mVolume);
        parcel.writeString(this.mAttachId);
        jse.a(parcel, this.mState);
        jse.a(parcel, this.mType);
        parcel.writeTypedList(this.mCapabilities);
        parcel.writeTypedList(this.mIncarnations);
    }
}
