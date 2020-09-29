package com.spotify.mobile.android.connect.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.connect.ConnectManager.a;
import com.spotify.mobile.android.connect.model.DeviceState.GaiaDeviceState;
import com.spotify.music.R;

@Deprecated
public final class ConnectDevice implements Parcelable {
    public static final Creator<ConnectDevice> CREATOR = new Creator<ConnectDevice>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ConnectDevice(parcel, 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ConnectDevice[i];
        }
    };
    public String a;
    public String b;
    public boolean c;
    public DeviceType d;
    public SpotifyIcon e;
    private String f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private String o;
    private boolean p;
    private DeviceState q;
    private String r;
    private String s;
    private boolean t;

    public enum DeviceState {
        CONNECTING,
        INCOMPATIBLE,
        UNAVAILABLE,
        LOGGED_IN,
        NOT_LOGGED_IN,
        PREMIUM_REQUIRED,
        NOT_INSTALLED,
        UNSUPPORTED_URI;
        
        public static final DeviceState[] a = null;

        static {
            a = values();
        }
    }

    public enum DeviceTransferError {
        UNKNOWN(204),
        SUCCESS(0),
        CANNOT_PLAY_ON_DEVICE(1),
        CONTENT_NOT_SUPPORTED_BY_DEVICE(2),
        TRANSFER_TIMEOUT(3),
        TRANSFER_WRONG_STATE(4),
        ZEROCONF_NOT_LOADED(106),
        ZEROCONF_DEVICE_NOT_AUTHORIZED(107),
        ZEROCONF_CANNOT_LOAD(108),
        ZEROCONF_SYSTEM_UPDATE_REQUIRED(109),
        ZEROCONF_SPOTIFY_UPDATE_REQUIRED(110),
        ZEROCONF_LOGIN_FAILED(202),
        ZEROCONF_INVALID_PUBLIC_KEY(203);
        
        private static final DeviceTransferError[] n = null;
        public final int mCode;

        static {
            n = values();
        }

        private DeviceTransferError(int i) {
            this.mCode = i;
        }

        public static DeviceTransferError a(int i) {
            DeviceTransferError[] deviceTransferErrorArr;
            for (DeviceTransferError deviceTransferError : n) {
                if (i == deviceTransferError.mCode) {
                    return deviceTransferError;
                }
            }
            return UNKNOWN;
        }
    }

    public enum DeviceType {
        UNKNOWN(0),
        COMPUTER(1),
        TABLET(2),
        SMARTPHONE(3),
        SPEAKER(4),
        TV(5),
        AVR(6),
        STB(7),
        AUDIO_DONGLE(8),
        GAME_CONSOLE(9),
        CAST_VIDEO(10),
        CAST_AUDIO(11),
        AUTOMOBILE(12),
        SMARTWATCH(13),
        CHROMEBOOK(14),
        UNKNOWN_SPOTIFY_HW(100),
        CARTHING(101),
        HOMETHING(103);
        
        public static final DeviceType[] r = null;
        private final int mValue;

        static {
            r = values();
        }

        private DeviceType(int i) {
            this.mValue = i;
        }
    }

    protected ConnectDevice() {
    }

    private ConnectDevice(Parcel parcel) {
        this.a = parcel.readString();
        this.f = parcel.readString();
        this.b = parcel.readString();
        this.g = juo.a(parcel);
        this.c = juo.a(parcel);
        this.h = juo.a(parcel);
        this.i = juo.a(parcel);
        this.j = juo.a(parcel);
        this.k = juo.a(parcel);
        this.l = juo.a(parcel);
        this.m = juo.a(parcel);
        this.d = (DeviceType) juo.a(parcel, DeviceType.class);
        this.n = juo.a(parcel);
        this.o = parcel.readString();
        this.p = juo.a(parcel);
        this.q = (DeviceState) juo.a(parcel, DeviceState.class);
        this.r = parcel.readString();
        this.s = parcel.readString();
        this.t = juo.a(parcel);
        this.e = (SpotifyIcon) juo.a(parcel, SpotifyIcon.class);
    }

    /* synthetic */ ConnectDevice(Parcel parcel, byte b2) {
        this(parcel);
    }

    public static ConnectDevice a(GaiaDevice gaiaDevice, Context context, a aVar) {
        ConnectDevice connectDevice = new ConnectDevice();
        connectDevice.a = gaiaDevice.getIdentifier();
        connectDevice.f = "";
        connectDevice.b = gaiaDevice.getName().isEmpty() ? context.getString(R.string.connect_device_unknown) : gaiaDevice.getName();
        connectDevice.g = gaiaDevice.isActive();
        connectDevice.c = fbn.a(gaiaDevice.getIdentifier(), "local_device");
        boolean z = true;
        connectDevice.h = !gaiaDevice.isDisabled();
        connectDevice.i = gaiaDevice.getState() == GaiaDeviceState.CONNECTING;
        connectDevice.j = gaiaDevice.supportsVolume();
        connectDevice.k = gaiaDevice.isZeroConf();
        connectDevice.l = gaiaDevice.isWebApp();
        if (gaiaDevice.getState() != GaiaDeviceState.CONNECTING) {
            z = false;
        }
        connectDevice.m = z;
        int ordinal = gaiaDevice.getType().ordinal();
        if (ordinal < 0 || ordinal >= DeviceType.r.length) {
            connectDevice.d = DeviceType.UNKNOWN;
        } else {
            connectDevice.d = DeviceType.r[ordinal];
        }
        connectDevice.n = false;
        connectDevice.o = gaiaDevice.getAttachId();
        connectDevice.p = gaiaDevice.isAttached();
        int ordinal2 = gaiaDevice.getState().ordinal();
        SpotifyIcon spotifyIcon = null;
        if (ordinal2 < 0 || ordinal2 >= DeviceState.a.length) {
            connectDevice.q = null;
        } else {
            connectDevice.q = DeviceState.a[ordinal2];
        }
        connectDevice.r = gaiaDevice.getBrandName();
        connectDevice.s = gaiaDevice.getModelName();
        connectDevice.t = gaiaDevice.isNewlyDiscovered();
        boolean isGrouped = gaiaDevice.isGrouped();
        if (aVar != null) {
            spotifyIcon = aVar.a(connectDevice);
        }
        if (spotifyIcon == null) {
            switch (defpackage.gsy.AnonymousClass1.a[connectDevice.d.ordinal()]) {
                case 1:
                    spotifyIcon = SpotifyIcon.DEVICE_SPEAKER_32;
                    break;
                case 2:
                case 3:
                    spotifyIcon = SpotifyIcon.DEVICE_COMPUTER_32;
                    break;
                case 4:
                    spotifyIcon = SpotifyIcon.DEVICE_TABLET_32;
                    break;
                case 5:
                    spotifyIcon = SpotifyIcon.DEVICE_MOBILE_32;
                    break;
                case 6:
                case 7:
                    if (!isGrouped) {
                        spotifyIcon = SpotifyIcon.DEVICE_SPEAKER_32;
                        break;
                    } else {
                        spotifyIcon = SpotifyIcon.DEVICE_MULTISPEAKER_32;
                        break;
                    }
                case 8:
                    spotifyIcon = SpotifyIcon.DEVICE_TV_32;
                    break;
                case 9:
                    spotifyIcon = SpotifyIcon.DEVICE_ARM_32;
                    break;
                case 10:
                    spotifyIcon = SpotifyIcon.DEVICE_TV_32;
                    break;
                case 11:
                    spotifyIcon = SpotifyIcon.DEVICE_SPEAKER_32;
                    break;
                case 12:
                    spotifyIcon = SpotifyIcon.GAMES_CONSOLE_32;
                    break;
                case 13:
                    spotifyIcon = SpotifyIcon.DEVICE_TV_32;
                    break;
                case 14:
                    spotifyIcon = SpotifyIcon.WATCH_32;
                    break;
                case 15:
                    spotifyIcon = SpotifyIcon.DEVICE_CAR_32;
                    break;
                case 16:
                    spotifyIcon = SpotifyIcon.DEVICE_SPEAKER_32;
                    break;
                default:
                    spotifyIcon = SpotifyIcon.DEVICE_SPEAKER_32;
                    break;
            }
        }
        connectDevice.e = spotifyIcon;
        return connectDevice;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ConnectDevice) && this.a.equals(((ConnectDevice) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = "chsa//eHnvcmeC{tose=ni";
        StringBuilder sb = new StringBuilder("ConnectDevice{mHash='");
        sb.append(this.a);
        sb.append('\'');
        String str2 = "nrsmDycd vaSh/,/eme=Hacoe";
        sb.append(", mSecondaryDeviceHash='");
        sb.append(this.f);
        sb.append('\'');
        sb.append(", mName='");
        sb.append(this.b);
        sb.append('\'');
        sb.append(", mIsActive=");
        sb.append(this.g);
        String str3 = "lfeSo s,=I";
        sb.append(", mIsSelf=");
        sb.append(this.c);
        String str4 = "mIebnbd=asEl,";
        sb.append(", mIsEnabled=");
        sb.append(this.h);
        String str5 = "oIgnesbtn=i C,mc";
        sb.append(", mIsConnecting=");
        sb.append(this.i);
        sb.append(", mIsSupportingVolumeChange=");
        sb.append(this.j);
        String str6 = "eZ=C,notoIfsmr";
        sb.append(", mIsZeroConf=");
        sb.append(this.k);
        sb.append(", mIsDial=");
        sb.append(this.l);
        String str7 = "meB,Asa pvttiIn=eicg";
        sb.append(", mIsBeingActivated=");
        sb.append(this.m);
        String str8 = "=tpe, ym";
        sb.append(", mType=");
        sb.append(this.d);
        String str9 = "ncseisLeCobi splmtaIem=";
        sb.append(", mIsLicenseCompatible=");
        sb.append(this.n);
        String str10 = "hI,mt/mA=/tac ";
        sb.append(", mAttachId='");
        sb.append(this.o);
        sb.append('\'');
        sb.append(", mIsAttached=");
        sb.append(this.p);
        sb.append(", mDeviceState=");
        sb.append(this.q);
        String str11 = ",aBro//=dm ";
        sb.append(", mBrand='");
        sb.append(this.r);
        sb.append('\'');
        String str12 = "l d=/bMoem/";
        sb.append(", mModel='");
        sb.append(this.s);
        sb.append('\'');
        sb.append(", mIsNewlyDiscovered=");
        sb.append(this.t);
        String str13 = "onI ,mbc";
        sb.append(", mIcon=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeString(this.f);
        parcel.writeString(this.b);
        juo.a(parcel, this.g);
        juo.a(parcel, this.c);
        juo.a(parcel, this.h);
        juo.a(parcel, this.i);
        juo.a(parcel, this.j);
        juo.a(parcel, this.k);
        juo.a(parcel, this.l);
        juo.a(parcel, this.m);
        juo.a(parcel, this.d);
        juo.a(parcel, this.n);
        parcel.writeString(this.o);
        juo.a(parcel, this.p);
        juo.a(parcel, this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        juo.a(parcel, this.t);
        juo.a(parcel, this.e);
    }
}
