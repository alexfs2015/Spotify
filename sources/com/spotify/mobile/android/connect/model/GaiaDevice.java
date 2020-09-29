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
public class GaiaDevice implements Parcelable, JacksonModel, gtz {
    public static final Creator<GaiaDevice> CREATOR = new Creator<GaiaDevice>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new GaiaDevice(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new GaiaDevice[i];
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

    protected GaiaDevice(Parcel parcel) {
        this.mCreationTime = parcel.readLong();
        this.mIsSelf = juo.a(parcel);
        this.mIsActive = juo.a(parcel);
        this.mIsBeingActivated = juo.a(parcel);
        this.mIsAttached = juo.a(parcel);
        this.mIsConnect = juo.a(parcel);
        this.mIsWebApp = juo.a(parcel);
        this.mIsZeroConf = juo.a(parcel);
        this.mIsGrouped = juo.a(parcel);
        this.mIsSocialConnect = juo.a(parcel);
        this.mSupportsLogout = juo.a(parcel);
        this.mSupportsVolume = juo.a(parcel);
        this.mSupportsRename = juo.a(parcel);
        this.mIsNewlyDiscovered = juo.a(parcel);
        this.mIsDisabled = juo.a(parcel);
        this.mBrandName = parcel.readString();
        this.mModelName = parcel.readString();
        this.mIdentifier = parcel.readString();
        this.mPhysicalIdentifier = parcel.readString();
        this.mName = parcel.readString();
        this.mVolume = parcel.readString();
        this.mAttachId = parcel.readString();
        this.mState = (GaiaDeviceState) juo.a(parcel, GaiaDeviceState.class);
        this.mType = (GaiaTypes) juo.a(parcel, GaiaTypes.class);
        this.mCapabilities = parcel.createTypedArrayList(GaiaDeviceCapability.CREATOR);
        this.mIncarnations = parcel.createTypedArrayList(GaiaDeviceIncarnation.CREATOR);
    }

    @JsonCreator
    public GaiaDevice(@JsonProperty("is_self") boolean z, @JsonProperty("is_active") boolean z2, @JsonProperty("is_being_activated") boolean z3, @JsonProperty("is_attached") boolean z4, @JsonProperty("is_connect") boolean z5, @JsonProperty("is_webapp") boolean z6, @JsonProperty("is_zeroconf") boolean z7, @JsonProperty("is_group") boolean z8, @JsonProperty("is_social_connect") boolean z9, @JsonProperty("supports_logout") boolean z10, @JsonProperty("supports_volume") boolean z11, @JsonProperty("supports_rename") boolean z12, @JsonProperty("creation_time_ms") long j, @JsonProperty("brand_display_name") String str, @JsonProperty("model_display_name") String str2, @JsonProperty("identifier") String str3, @JsonProperty("physical_identifier") String str4, @JsonProperty("name") String str5, @JsonProperty("state") GaiaDeviceState gaiaDeviceState, @JsonProperty("type") GaiaTypes gaiaTypes, @JsonProperty("incarnations") List<GaiaDeviceIncarnation> list, @JsonProperty("volume") String str6, @JsonProperty("attach_id") String str7, @JsonProperty("is_newly_discovered") boolean z13, @JsonProperty("is_disabled") boolean z14, @JsonProperty("capabilities") List<GaiaDeviceCapability> list2) {
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
        this.mCapabilities = list2 != null ? list2 : Collections.emptyList();
        this.mIncarnations = list != null ? list : Collections.emptyList();
        this.mVolume = str6;
        this.mAttachId = str7;
        this.mIsNewlyDiscovered = z13;
        this.mIsDisabled = z14;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r6.mBrandName != null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        if (r6.mIdentifier != null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0070, code lost:
        if (r6.mPhysicalIdentifier != null) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 7
            r0 = 1
            if (r5 != r6) goto L_0x0006
            r4 = 6
            return r0
        L_0x0006:
            r4 = 0
            boolean r1 = r6 instanceof com.spotify.mobile.android.connect.model.GaiaDevice
            r2 = 5
            r2 = 0
            r4 = 4
            if (r1 != 0) goto L_0x0010
            r4 = 7
            return r2
        L_0x0010:
            r4 = 7
            com.spotify.mobile.android.connect.model.GaiaDevice r6 = (com.spotify.mobile.android.connect.model.GaiaDevice) r6
            r4 = 3
            java.lang.String r1 = r5.mBrandName
            if (r1 == 0) goto L_0x0023
            java.lang.String r3 = r6.mBrandName
            r4 = 7
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0029
            r4 = 5
            goto L_0x0028
        L_0x0023:
            r4 = 2
            java.lang.String r1 = r6.mBrandName
            if (r1 == 0) goto L_0x0029
        L_0x0028:
            return r2
        L_0x0029:
            java.lang.String r1 = r5.mModelName
            r4 = 2
            if (r1 == 0) goto L_0x0039
            r4 = 1
            java.lang.String r3 = r6.mModelName
            boolean r1 = r1.equals(r3)
            r4 = 5
            if (r1 != 0) goto L_0x0040
            goto L_0x003e
        L_0x0039:
            java.lang.String r1 = r6.mModelName
            r4 = 6
            if (r1 == 0) goto L_0x0040
        L_0x003e:
            r4 = 7
            return r2
        L_0x0040:
            r4 = 2
            java.lang.String r1 = r5.mIdentifier
            if (r1 == 0) goto L_0x0052
            r4 = 2
            java.lang.String r3 = r6.mIdentifier
            r4 = 4
            boolean r1 = r1.equals(r3)
            r4 = 6
            if (r1 != 0) goto L_0x0059
            r4 = 0
            goto L_0x0057
        L_0x0052:
            r4 = 4
            java.lang.String r1 = r6.mIdentifier
            if (r1 == 0) goto L_0x0059
        L_0x0057:
            r4 = 0
            return r2
        L_0x0059:
            r4 = 1
            java.lang.String r1 = r5.mPhysicalIdentifier
            r4 = 6
            if (r1 == 0) goto L_0x006c
            r4 = 0
            java.lang.String r3 = r6.mPhysicalIdentifier
            r4 = 4
            boolean r1 = r1.equals(r3)
            r4 = 1
            if (r1 != 0) goto L_0x0074
            r4 = 3
            goto L_0x0072
        L_0x006c:
            r4 = 2
            java.lang.String r1 = r6.mPhysicalIdentifier
            r4 = 4
            if (r1 == 0) goto L_0x0074
        L_0x0072:
            r4 = 5
            return r2
        L_0x0074:
            r4 = 7
            java.lang.String r1 = r5.mName
            r4 = 7
            if (r1 == 0) goto L_0x0085
            java.lang.String r3 = r6.mName
            r4 = 7
            boolean r1 = r1.equals(r3)
            r4 = 2
            if (r1 != 0) goto L_0x008c
            goto L_0x008b
        L_0x0085:
            r4 = 0
            java.lang.String r1 = r6.mName
            r4 = 4
            if (r1 == 0) goto L_0x008c
        L_0x008b:
            return r2
        L_0x008c:
            r4 = 5
            boolean r1 = r5.mIsActive
            r4 = 2
            boolean r3 = r6.mIsActive
            r4 = 2
            if (r1 == r3) goto L_0x0097
            r4 = 2
            return r2
        L_0x0097:
            r4 = 3
            java.lang.String r1 = r5.mAttachId
            r4 = 4
            java.lang.String r6 = r6.mAttachId
            r4 = 0
            if (r1 == 0) goto L_0x00a6
            r4 = 3
            boolean r6 = r1.equals(r6)
            return r6
        L_0x00a6:
            if (r6 != 0) goto L_0x00aa
            r4 = 4
            return r0
        L_0x00aa:
            r4 = 3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.connect.model.GaiaDevice.equals(java.lang.Object):boolean");
    }

    @JsonGetter("attach_id")
    public String getAttachId() {
        return this.mAttachId;
    }

    @JsonGetter("brand_display_name")
    public String getBrandName() {
        return this.mBrandName;
    }

    @JsonGetter("capabilities")
    public List<GaiaDeviceCapability> getCapabilities() {
        return this.mCapabilities;
    }

    @JsonGetter("creation_time_ms")
    public long getCreationTime() {
        return this.mCreationTime;
    }

    @JsonGetter("identifier")
    public String getIdentifier() {
        return this.mIdentifier;
    }

    @JsonGetter("incarnations")
    public List<GaiaDeviceIncarnation> getIncarnations() {
        return this.mIncarnations;
    }

    @JsonGetter("model_display_name")
    public String getModelName() {
        return this.mModelName;
    }

    @JsonGetter("name")
    public String getName() {
        return this.mName;
    }

    @JsonGetter("physical_identifier")
    public String getPhysicalIdentifier() {
        return this.mPhysicalIdentifier;
    }

    public DeviceState getState() {
        return this.mState;
    }

    @JsonGetter("state")
    public GaiaDeviceState getStateSerializable() {
        return this.mState;
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

    public boolean hasIncarnations() {
        return !this.mIncarnations.isEmpty();
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

    @JsonGetter("is_active")
    public boolean isActive() {
        return this.mIsActive;
    }

    @JsonGetter("is_attached")
    public boolean isAttached() {
        return this.mIsAttached;
    }

    @JsonGetter("is_being_activated")
    public boolean isBeingActivated() {
        return this.mIsBeingActivated;
    }

    @JsonGetter("is_connect")
    public boolean isConnect() {
        return this.mIsConnect;
    }

    @JsonGetter("is_disabled")
    public boolean isDisabled() {
        return this.mIsDisabled;
    }

    @JsonGetter("is_group")
    public boolean isGrouped() {
        return this.mIsGrouped;
    }

    @JsonGetter("is_newly_discovered")
    public boolean isNewlyDiscovered() {
        return this.mIsNewlyDiscovered;
    }

    @JsonGetter("is_self")
    public boolean isSelf() {
        return this.mIsSelf;
    }

    @JsonGetter("is_social_connect")
    public boolean isSocialConnect() {
        return this.mIsSocialConnect;
    }

    @JsonGetter("is_webapp")
    public boolean isWebApp() {
        return this.mIsWebApp;
    }

    @JsonGetter("is_zeroconf")
    public boolean isZeroConf() {
        return this.mIsZeroConf;
    }

    public void setActive() {
        this.mIsActive = true;
    }

    public void setInactive() {
        this.mIsActive = false;
    }

    public void setSupportsVolume(boolean z) {
        this.mSupportsVolume = z;
    }

    @JsonGetter("supports_logout")
    public boolean supportsLogout() {
        return this.mSupportsLogout;
    }

    @JsonGetter("supports_rename")
    public boolean supportsRename() {
        return this.mSupportsRename;
    }

    @JsonGetter("supports_volume")
    public boolean supportsVolume() {
        return this.mSupportsVolume;
    }

    @JsonIgnore
    public String toString() {
        String str = "easiieanricoTmG={CDemieav";
        StringBuilder sb = new StringBuilder("GaiaDevice{mCreationTime=");
        sb.append(this.mCreationTime);
        String str2 = "Se m=I,slf";
        sb.append(", mIsSelf=");
        sb.append(this.mIsSelf);
        String str3 = "s e=oviAImc,";
        sb.append(", mIsActive=");
        sb.append(this.mIsActive);
        String str4 = "ee=sdbI inAtavtiB,cg";
        sb.append(", mIsBeingActivated=");
        sb.append(this.mIsBeingActivated);
        String str5 = "tcmIshbe,A=tda";
        sb.append(", mIsAttached=");
        sb.append(this.mIsAttached);
        String str6 = "t,Cmo= tcsnnI";
        sb.append(", mIsConnect=");
        sb.append(this.mIsConnect);
        sb.append(", mIsWebApp=");
        sb.append(this.mIsWebApp);
        sb.append(", mIsZeroConf=");
        sb.append(this.mIsZeroConf);
        sb.append(", mIsGrouped=");
        sb.append(this.mIsGrouped);
        String str7 = "tiocenmSpCaI=o, sln";
        sb.append(", mIsSocialConnect=");
        sb.append(this.mIsSocialConnect);
        String str8 = "supuotoLStg=rpotm,";
        sb.append(", mSupportsLogout=");
        sb.append(this.mSupportsLogout);
        sb.append(", mSupportsVolume=");
        sb.append(this.mSupportsVolume);
        sb.append(", mSupportsRename=");
        sb.append(this.mSupportsRename);
        String str9 = "Nssey=,dlrcew Ioimevs";
        sb.append(", mIsNewlyDiscovered=");
        sb.append(this.mIsNewlyDiscovered);
        sb.append(", mIsDisabled=");
        sb.append(this.mIsDisabled);
        String str10 = ",m=mNnar/ema/B ";
        sb.append(", mBrandName='");
        sb.append(this.mBrandName);
        sb.append('\'');
        String str11 = "oa=eome/M,lNd/ ";
        sb.append(", mModelName='");
        sb.append(this.mModelName);
        sb.append('\'');
        String str12 = "I/ r=bfne,imd/et";
        sb.append(", mIdentifier='");
        sb.append(this.mIdentifier);
        sb.append('\'');
        String str13 = "yin hiblec=e,ai/r/tfdPmI";
        sb.append(", mPhysicalIdentifier='");
        sb.append(this.mPhysicalIdentifier);
        sb.append('\'');
        sb.append(", mName='");
        sb.append(this.mName);
        sb.append('\'');
        String str14 = "olm,/=/tVmu ";
        sb.append(", mVolume='");
        sb.append(this.mVolume);
        sb.append('\'');
        String str15 = "/tA, d=tpIcah/";
        sb.append(", mAttachId='");
        sb.append(this.mAttachId);
        sb.append('\'');
        String str16 = "t ,mSat=e";
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

    @JsonIgnore
    public String toStringState() {
        String str = "{csvi,imt AaceasiDveIG=";
        StringBuilder sb = new StringBuilder("GaiaDevice{, mIsActive=");
        sb.append(this.mIsActive);
        sb.append(", mIsBeingActivated=");
        sb.append(this.mIsBeingActivated);
        String str2 = "chtms,Ad=m Iae";
        sb.append(", mIsAttached=");
        sb.append(this.mIsAttached);
        String str3 = "=Ndaom /mna/Bre";
        sb.append(", mBrandName='");
        sb.append(this.mBrandName);
        sb.append('\'');
        String str4 = "omd/,ba lMe=Nem";
        sb.append(", mModelName='");
        sb.append(this.mModelName);
        sb.append('\'');
        sb.append(", mIdentifier='");
        sb.append(this.mIdentifier);
        sb.append('\'');
        String str5 = ",a/ eNb=/m";
        sb.append(", mName='");
        sb.append(this.mName);
        sb.append('\'');
        String str6 = "t e=tamt,";
        sb.append(", mState=");
        sb.append(this.mState);
        String str7 = "pey,=Tp ";
        sb.append(", mType=");
        sb.append(this.mType);
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mCreationTime);
        juo.a(parcel, this.mIsSelf);
        juo.a(parcel, this.mIsActive);
        juo.a(parcel, this.mIsBeingActivated);
        juo.a(parcel, this.mIsAttached);
        juo.a(parcel, this.mIsConnect);
        juo.a(parcel, this.mIsWebApp);
        juo.a(parcel, this.mIsZeroConf);
        juo.a(parcel, this.mIsGrouped);
        juo.a(parcel, this.mIsSocialConnect);
        juo.a(parcel, this.mSupportsLogout);
        juo.a(parcel, this.mSupportsVolume);
        juo.a(parcel, this.mSupportsRename);
        juo.a(parcel, this.mIsNewlyDiscovered);
        juo.a(parcel, this.mIsDisabled);
        parcel.writeString(this.mBrandName);
        parcel.writeString(this.mModelName);
        parcel.writeString(this.mIdentifier);
        parcel.writeString(this.mPhysicalIdentifier);
        parcel.writeString(this.mName);
        parcel.writeString(this.mVolume);
        parcel.writeString(this.mAttachId);
        juo.a(parcel, this.mState);
        juo.a(parcel, this.mType);
        parcel.writeTypedList(this.mCapabilities);
        parcel.writeTypedList(this.mIncarnations);
    }
}
