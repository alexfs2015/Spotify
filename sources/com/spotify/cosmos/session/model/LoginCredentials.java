package com.spotify.cosmos.session.model;

import java.util.Arrays;

public abstract class LoginCredentials {

    public static final class Autologin extends LoginCredentials {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Autologin{}";
        }

        Autologin() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof Autologin;
        }

        public final void match(gcs<Password> gcs, gcs<Facebook> gcs2, gcs<StoredCredentials> gcs3, gcs<PhoneNumber> gcs4, gcs<OneTimeToken> gcs5, gcs<SpotifyToken> gcs6, gcs<ParentChild> gcs7, gcs<Autologin> gcs8, gcs<RefreshToken> gcs9) {
            gcs8.accept(this);
        }

        public final <R_> R_ map(gct<Password, R_> gct, gct<Facebook, R_> gct2, gct<StoredCredentials, R_> gct3, gct<PhoneNumber, R_> gct4, gct<OneTimeToken, R_> gct5, gct<SpotifyToken, R_> gct6, gct<ParentChild, R_> gct7, gct<Autologin, R_> gct8, gct<RefreshToken, R_> gct9) {
            return gct8.apply(this);
        }
    }

    public static final class Facebook extends LoginCredentials {
        private final String blob;
        private final String username;

        Facebook(String str, String str2) {
            this.username = (String) gcr.a(str);
            this.blob = (String) gcr.a(str2);
        }

        public final String username() {
            return this.username;
        }

        public final String blob() {
            return this.blob;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Facebook)) {
                return false;
            }
            Facebook facebook = (Facebook) obj;
            return facebook.username.equals(this.username) && facebook.blob.equals(this.blob);
        }

        public final int hashCode() {
            return ((this.username.hashCode() + 0) * 31) + this.blob.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Facebook{username=");
            sb.append(this.username);
            sb.append(", blob=");
            sb.append(this.blob);
            sb.append('}');
            return sb.toString();
        }

        public final void match(gcs<Password> gcs, gcs<Facebook> gcs2, gcs<StoredCredentials> gcs3, gcs<PhoneNumber> gcs4, gcs<OneTimeToken> gcs5, gcs<SpotifyToken> gcs6, gcs<ParentChild> gcs7, gcs<Autologin> gcs8, gcs<RefreshToken> gcs9) {
            gcs2.accept(this);
        }

        public final <R_> R_ map(gct<Password, R_> gct, gct<Facebook, R_> gct2, gct<StoredCredentials, R_> gct3, gct<PhoneNumber, R_> gct4, gct<OneTimeToken, R_> gct5, gct<SpotifyToken, R_> gct6, gct<ParentChild, R_> gct7, gct<Autologin, R_> gct8, gct<RefreshToken, R_> gct9) {
            return gct2.apply(this);
        }
    }

    public static final class OneTimeToken extends LoginCredentials {
        private final String token;

        OneTimeToken(String str) {
            this.token = (String) gcr.a(str);
        }

        public final String token() {
            return this.token;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OneTimeToken)) {
                return false;
            }
            return ((OneTimeToken) obj).token.equals(this.token);
        }

        public final int hashCode() {
            return this.token.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("OneTimeToken{token=");
            sb.append(this.token);
            sb.append('}');
            return sb.toString();
        }

        public final void match(gcs<Password> gcs, gcs<Facebook> gcs2, gcs<StoredCredentials> gcs3, gcs<PhoneNumber> gcs4, gcs<OneTimeToken> gcs5, gcs<SpotifyToken> gcs6, gcs<ParentChild> gcs7, gcs<Autologin> gcs8, gcs<RefreshToken> gcs9) {
            gcs5.accept(this);
        }

        public final <R_> R_ map(gct<Password, R_> gct, gct<Facebook, R_> gct2, gct<StoredCredentials, R_> gct3, gct<PhoneNumber, R_> gct4, gct<OneTimeToken, R_> gct5, gct<SpotifyToken, R_> gct6, gct<ParentChild, R_> gct7, gct<Autologin, R_> gct8, gct<RefreshToken, R_> gct9) {
            return gct5.apply(this);
        }
    }

    public static final class ParentChild extends LoginCredentials {
        private final String childId;
        private final byte[] parentBlob;
        private final String parentUsername;

        ParentChild(String str, String str2, byte[] bArr) {
            this.childId = (String) gcr.a(str);
            this.parentUsername = (String) gcr.a(str2);
            this.parentBlob = (byte[]) gcr.a(bArr);
        }

        public final String childId() {
            return this.childId;
        }

        public final String parentUsername() {
            return this.parentUsername;
        }

        public final byte[] parentBlob() {
            return this.parentBlob;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ParentChild)) {
                return false;
            }
            ParentChild parentChild = (ParentChild) obj;
            return Arrays.equals(parentChild.parentBlob, this.parentBlob) && parentChild.childId.equals(this.childId) && parentChild.parentUsername.equals(this.parentUsername);
        }

        public final int hashCode() {
            return ((((this.childId.hashCode() + 0) * 31) + this.parentUsername.hashCode()) * 31) + Arrays.hashCode(this.parentBlob);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ParentChild{childId=");
            sb.append(this.childId);
            sb.append(", parentUsername=");
            sb.append(this.parentUsername);
            sb.append(", parentBlob=");
            sb.append(Arrays.toString(this.parentBlob));
            sb.append('}');
            return sb.toString();
        }

        public final void match(gcs<Password> gcs, gcs<Facebook> gcs2, gcs<StoredCredentials> gcs3, gcs<PhoneNumber> gcs4, gcs<OneTimeToken> gcs5, gcs<SpotifyToken> gcs6, gcs<ParentChild> gcs7, gcs<Autologin> gcs8, gcs<RefreshToken> gcs9) {
            gcs7.accept(this);
        }

        public final <R_> R_ map(gct<Password, R_> gct, gct<Facebook, R_> gct2, gct<StoredCredentials, R_> gct3, gct<PhoneNumber, R_> gct4, gct<OneTimeToken, R_> gct5, gct<SpotifyToken, R_> gct6, gct<ParentChild, R_> gct7, gct<Autologin, R_> gct8, gct<RefreshToken, R_> gct9) {
            return gct7.apply(this);
        }
    }

    public static final class Password extends LoginCredentials {
        private final String password;
        private final String username;

        Password(String str, String str2) {
            this.username = (String) gcr.a(str);
            this.password = (String) gcr.a(str2);
        }

        public final String username() {
            return this.username;
        }

        public final String password() {
            return this.password;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Password)) {
                return false;
            }
            Password password2 = (Password) obj;
            return password2.username.equals(this.username) && password2.password.equals(this.password);
        }

        public final int hashCode() {
            return ((this.username.hashCode() + 0) * 31) + this.password.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Password{username=");
            sb.append(this.username);
            sb.append(", password=");
            sb.append(this.password);
            sb.append('}');
            return sb.toString();
        }

        public final void match(gcs<Password> gcs, gcs<Facebook> gcs2, gcs<StoredCredentials> gcs3, gcs<PhoneNumber> gcs4, gcs<OneTimeToken> gcs5, gcs<SpotifyToken> gcs6, gcs<ParentChild> gcs7, gcs<Autologin> gcs8, gcs<RefreshToken> gcs9) {
            gcs.accept(this);
        }

        public final <R_> R_ map(gct<Password, R_> gct, gct<Facebook, R_> gct2, gct<StoredCredentials, R_> gct3, gct<PhoneNumber, R_> gct4, gct<OneTimeToken, R_> gct5, gct<SpotifyToken, R_> gct6, gct<ParentChild, R_> gct7, gct<Autologin, R_> gct8, gct<RefreshToken, R_> gct9) {
            return gct.apply(this);
        }
    }

    public static final class PhoneNumber extends LoginCredentials {
        private final String number;

        PhoneNumber(String str) {
            this.number = (String) gcr.a(str);
        }

        public final String number() {
            return this.number;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PhoneNumber)) {
                return false;
            }
            return ((PhoneNumber) obj).number.equals(this.number);
        }

        public final int hashCode() {
            return this.number.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PhoneNumber{number=");
            sb.append(this.number);
            sb.append('}');
            return sb.toString();
        }

        public final void match(gcs<Password> gcs, gcs<Facebook> gcs2, gcs<StoredCredentials> gcs3, gcs<PhoneNumber> gcs4, gcs<OneTimeToken> gcs5, gcs<SpotifyToken> gcs6, gcs<ParentChild> gcs7, gcs<Autologin> gcs8, gcs<RefreshToken> gcs9) {
            gcs4.accept(this);
        }

        public final <R_> R_ map(gct<Password, R_> gct, gct<Facebook, R_> gct2, gct<StoredCredentials, R_> gct3, gct<PhoneNumber, R_> gct4, gct<OneTimeToken, R_> gct5, gct<SpotifyToken, R_> gct6, gct<ParentChild, R_> gct7, gct<Autologin, R_> gct8, gct<RefreshToken, R_> gct9) {
            return gct4.apply(this);
        }
    }

    public static final class RefreshToken extends LoginCredentials {
        private final String obfuscatedSecret;
        private final String refreshToken;

        RefreshToken(String str, String str2) {
            this.refreshToken = (String) gcr.a(str);
            this.obfuscatedSecret = str2;
        }

        public final String refreshToken() {
            return this.refreshToken;
        }

        public final String obfuscatedSecret() {
            return this.obfuscatedSecret;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RefreshToken)) {
                return false;
            }
            RefreshToken refreshToken2 = (RefreshToken) obj;
            return refreshToken2.refreshToken.equals(this.refreshToken) && gcr.a(refreshToken2.obfuscatedSecret, this.obfuscatedSecret);
        }

        public final int hashCode() {
            int i = 0;
            int hashCode = (this.refreshToken.hashCode() + 0) * 31;
            String str = this.obfuscatedSecret;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RefreshToken{refreshToken=");
            sb.append(this.refreshToken);
            sb.append(", obfuscatedSecret=");
            sb.append(this.obfuscatedSecret);
            sb.append('}');
            return sb.toString();
        }

        public final void match(gcs<Password> gcs, gcs<Facebook> gcs2, gcs<StoredCredentials> gcs3, gcs<PhoneNumber> gcs4, gcs<OneTimeToken> gcs5, gcs<SpotifyToken> gcs6, gcs<ParentChild> gcs7, gcs<Autologin> gcs8, gcs<RefreshToken> gcs9) {
            gcs9.accept(this);
        }

        public final <R_> R_ map(gct<Password, R_> gct, gct<Facebook, R_> gct2, gct<StoredCredentials, R_> gct3, gct<PhoneNumber, R_> gct4, gct<OneTimeToken, R_> gct5, gct<SpotifyToken, R_> gct6, gct<ParentChild, R_> gct7, gct<Autologin, R_> gct8, gct<RefreshToken, R_> gct9) {
            return gct9.apply(this);
        }
    }

    public static final class SpotifyToken extends LoginCredentials {
        private final byte[] blob;
        private final String username;

        SpotifyToken(String str, byte[] bArr) {
            this.username = (String) gcr.a(str);
            this.blob = (byte[]) gcr.a(bArr);
        }

        public final String username() {
            return this.username;
        }

        public final byte[] blob() {
            return this.blob;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SpotifyToken)) {
                return false;
            }
            SpotifyToken spotifyToken = (SpotifyToken) obj;
            return Arrays.equals(spotifyToken.blob, this.blob) && spotifyToken.username.equals(this.username);
        }

        public final int hashCode() {
            return ((this.username.hashCode() + 0) * 31) + Arrays.hashCode(this.blob);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SpotifyToken{username=");
            sb.append(this.username);
            sb.append(", blob=");
            sb.append(Arrays.toString(this.blob));
            sb.append('}');
            return sb.toString();
        }

        public final void match(gcs<Password> gcs, gcs<Facebook> gcs2, gcs<StoredCredentials> gcs3, gcs<PhoneNumber> gcs4, gcs<OneTimeToken> gcs5, gcs<SpotifyToken> gcs6, gcs<ParentChild> gcs7, gcs<Autologin> gcs8, gcs<RefreshToken> gcs9) {
            gcs6.accept(this);
        }

        public final <R_> R_ map(gct<Password, R_> gct, gct<Facebook, R_> gct2, gct<StoredCredentials, R_> gct3, gct<PhoneNumber, R_> gct4, gct<OneTimeToken, R_> gct5, gct<SpotifyToken, R_> gct6, gct<ParentChild, R_> gct7, gct<Autologin, R_> gct8, gct<RefreshToken, R_> gct9) {
            return gct6.apply(this);
        }
    }

    public static final class StoredCredentials extends LoginCredentials {
        private final byte[] blob;
        private final String username;

        StoredCredentials(String str, byte[] bArr) {
            this.username = (String) gcr.a(str);
            this.blob = (byte[]) gcr.a(bArr);
        }

        public final String username() {
            return this.username;
        }

        public final byte[] blob() {
            return this.blob;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StoredCredentials)) {
                return false;
            }
            StoredCredentials storedCredentials = (StoredCredentials) obj;
            return Arrays.equals(storedCredentials.blob, this.blob) && storedCredentials.username.equals(this.username);
        }

        public final int hashCode() {
            return ((this.username.hashCode() + 0) * 31) + Arrays.hashCode(this.blob);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("StoredCredentials{username=");
            sb.append(this.username);
            sb.append(", blob=");
            sb.append(Arrays.toString(this.blob));
            sb.append('}');
            return sb.toString();
        }

        public final void match(gcs<Password> gcs, gcs<Facebook> gcs2, gcs<StoredCredentials> gcs3, gcs<PhoneNumber> gcs4, gcs<OneTimeToken> gcs5, gcs<SpotifyToken> gcs6, gcs<ParentChild> gcs7, gcs<Autologin> gcs8, gcs<RefreshToken> gcs9) {
            gcs3.accept(this);
        }

        public final <R_> R_ map(gct<Password, R_> gct, gct<Facebook, R_> gct2, gct<StoredCredentials, R_> gct3, gct<PhoneNumber, R_> gct4, gct<OneTimeToken, R_> gct5, gct<SpotifyToken, R_> gct6, gct<ParentChild, R_> gct7, gct<Autologin, R_> gct8, gct<RefreshToken, R_> gct9) {
            return gct3.apply(this);
        }
    }

    public abstract <R_> R_ map(gct<Password, R_> gct, gct<Facebook, R_> gct2, gct<StoredCredentials, R_> gct3, gct<PhoneNumber, R_> gct4, gct<OneTimeToken, R_> gct5, gct<SpotifyToken, R_> gct6, gct<ParentChild, R_> gct7, gct<Autologin, R_> gct8, gct<RefreshToken, R_> gct9);

    public abstract void match(gcs<Password> gcs, gcs<Facebook> gcs2, gcs<StoredCredentials> gcs3, gcs<PhoneNumber> gcs4, gcs<OneTimeToken> gcs5, gcs<SpotifyToken> gcs6, gcs<ParentChild> gcs7, gcs<Autologin> gcs8, gcs<RefreshToken> gcs9);

    LoginCredentials() {
    }

    public static LoginCredentials password(String str, String str2) {
        return new Password(str, str2);
    }

    public static LoginCredentials facebook(String str, String str2) {
        return new Facebook(str, str2);
    }

    public static LoginCredentials storedCredentials(String str, byte[] bArr) {
        return new StoredCredentials(str, bArr);
    }

    public static LoginCredentials phoneNumber(String str) {
        return new PhoneNumber(str);
    }

    public static LoginCredentials oneTimeToken(String str) {
        return new OneTimeToken(str);
    }

    public static LoginCredentials spotifyToken(String str, byte[] bArr) {
        return new SpotifyToken(str, bArr);
    }

    public static LoginCredentials parentChild(String str, String str2, byte[] bArr) {
        return new ParentChild(str, str2, bArr);
    }

    public static LoginCredentials autologin() {
        return new Autologin();
    }

    public static LoginCredentials refreshToken(String str, String str2) {
        return new RefreshToken(str, str2);
    }

    public final boolean isPassword() {
        return this instanceof Password;
    }

    public final boolean isFacebook() {
        return this instanceof Facebook;
    }

    public final boolean isStoredCredentials() {
        return this instanceof StoredCredentials;
    }

    public final boolean isPhoneNumber() {
        return this instanceof PhoneNumber;
    }

    public final boolean isOneTimeToken() {
        return this instanceof OneTimeToken;
    }

    public final boolean isSpotifyToken() {
        return this instanceof SpotifyToken;
    }

    public final boolean isParentChild() {
        return this instanceof ParentChild;
    }

    public final boolean isAutologin() {
        return this instanceof Autologin;
    }

    public final boolean isRefreshToken() {
        return this instanceof RefreshToken;
    }

    public final Password asPassword() {
        return (Password) this;
    }

    public final Facebook asFacebook() {
        return (Facebook) this;
    }

    public final StoredCredentials asStoredCredentials() {
        return (StoredCredentials) this;
    }

    public final PhoneNumber asPhoneNumber() {
        return (PhoneNumber) this;
    }

    public final OneTimeToken asOneTimeToken() {
        return (OneTimeToken) this;
    }

    public final SpotifyToken asSpotifyToken() {
        return (SpotifyToken) this;
    }

    public final ParentChild asParentChild() {
        return (ParentChild) this;
    }

    public final Autologin asAutologin() {
        return (Autologin) this;
    }

    public final RefreshToken asRefreshToken() {
        return (RefreshToken) this;
    }
}
