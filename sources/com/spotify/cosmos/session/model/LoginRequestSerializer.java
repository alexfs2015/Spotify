package com.spotify.cosmos.session.model;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.google.common.io.BaseEncoding;
import com.spotify.cosmos.session.model.LoginCredentials.Facebook;
import com.spotify.cosmos.session.model.LoginCredentials.OneTimeToken;
import com.spotify.cosmos.session.model.LoginCredentials.ParentChild;
import com.spotify.cosmos.session.model.LoginCredentials.Password;
import com.spotify.cosmos.session.model.LoginCredentials.PhoneNumber;
import com.spotify.cosmos.session.model.LoginCredentials.RefreshToken;
import com.spotify.cosmos.session.model.LoginCredentials.SpotifyToken;
import com.spotify.cosmos.session.model.LoginCredentials.StoredCredentials;
import com.spotify.cosmos.session.model.LoginOptions.PreAuthenticationSetting;
import java.io.IOException;

class LoginRequestSerializer extends JsonSerializer<LoginRequest> {
    LoginRequestSerializer() {
    }

    static /* synthetic */ void lambda$serialize$0(JsonGenerator jsonGenerator, Password password) {
        String str = "password";
        writeStringField(jsonGenerator, "authenticationType", str);
        writeStringField(jsonGenerator, "username", password.username());
        writeStringField(jsonGenerator, str, password.password());
    }

    static /* synthetic */ void lambda$serialize$1(JsonGenerator jsonGenerator, Facebook facebook) {
        writeStringField(jsonGenerator, "authenticationType", "facebookToken");
        writeStringField(jsonGenerator, "username", facebook.username());
        writeStringField(jsonGenerator, "blob", facebook.blob());
    }

    static /* synthetic */ void lambda$serialize$2(JsonGenerator jsonGenerator, StoredCredentials storedCredentials) {
        writeStringField(jsonGenerator, "authenticationType", "storedSpotifyCredentials");
        writeStringField(jsonGenerator, "username", storedCredentials.username());
        writeStringField(jsonGenerator, "blobBase64", BaseEncoding.c().a(storedCredentials.blob()));
    }

    static /* synthetic */ void lambda$serialize$3(JsonGenerator jsonGenerator, PhoneNumber phoneNumber) {
        writeStringField(jsonGenerator, "authenticationType", "phoneNumber");
        writeStringField(jsonGenerator, "number", phoneNumber.number());
    }

    static /* synthetic */ void lambda$serialize$4(JsonGenerator jsonGenerator, OneTimeToken oneTimeToken) {
        writeStringField(jsonGenerator, "authenticationType", "oneTimeToken");
        writeStringField(jsonGenerator, "token", oneTimeToken.token());
    }

    static /* synthetic */ void lambda$serialize$5(JsonGenerator jsonGenerator, SpotifyToken spotifyToken) {
        writeStringField(jsonGenerator, "authenticationType", "spotifyToken");
        writeStringField(jsonGenerator, "username", spotifyToken.username());
        writeStringField(jsonGenerator, "blobBase64", BaseEncoding.c().a(spotifyToken.blob()));
    }

    static /* synthetic */ void lambda$serialize$6(JsonGenerator jsonGenerator, ParentChild parentChild) {
        writeStringField(jsonGenerator, "authenticationType", "parentChild");
        writeStringField(jsonGenerator, "childId", parentChild.childId());
        writeStringField(jsonGenerator, "parentUsername", parentChild.parentUsername());
        writeStringField(jsonGenerator, "parentDataBase64", BaseEncoding.c().a(parentChild.parentBlob()));
    }

    static /* synthetic */ void lambda$serialize$8(JsonGenerator jsonGenerator, RefreshToken refreshToken) {
        String str = "refreshToken";
        writeStringField(jsonGenerator, "authenticationType", str);
        writeStringField(jsonGenerator, str, refreshToken.refreshToken());
        if (refreshToken.obfuscatedSecret() != null) {
            writeStringField(jsonGenerator, "obfuscatedSecret", refreshToken.obfuscatedSecret());
        }
    }

    private static void writeOptions(LoginOptions loginOptions, JsonGenerator jsonGenerator) {
        if (loginOptions != null) {
            jsonGenerator.writeObjectFieldStart("options");
            PreAuthenticationSetting preAuthenticationSetting = loginOptions.preAuthenticationSetting();
            if (preAuthenticationSetting != null) {
                jsonGenerator.writeStringField("pre_authentication_setting", preAuthenticationSetting.toString());
            }
            Boolean authOnlySetting = loginOptions.authOnlySetting();
            if (authOnlySetting != null) {
                jsonGenerator.writeBooleanField("auth_only_setting", authOnlySetting.booleanValue());
            }
            Boolean bootstrapRequired = loginOptions.bootstrapRequired();
            if (bootstrapRequired != null) {
                jsonGenerator.writeBooleanField("bootstrap_required", bootstrapRequired.booleanValue());
            }
            jsonGenerator.writeEndObject();
        }
    }

    /* access modifiers changed from: private */
    public static void writeStringField(JsonGenerator jsonGenerator, String str, String str2) {
        try {
            jsonGenerator.writeStringField(str, str2);
        } catch (IOException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" : ");
            sb.append(str2);
            throw new AssertionError(sb.toString());
        }
    }

    public void serialize(LoginRequest loginRequest, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeObjectFieldStart("credentials");
        loginRequest.credentials().match(new ged() {
            public final void accept(Object obj) {
                LoginRequestSerializer.lambda$serialize$0(JsonGenerator.this, (Password) obj);
            }
        }, new ged() {
            public final void accept(Object obj) {
                LoginRequestSerializer.lambda$serialize$1(JsonGenerator.this, (Facebook) obj);
            }
        }, new ged() {
            public final void accept(Object obj) {
                LoginRequestSerializer.lambda$serialize$2(JsonGenerator.this, (StoredCredentials) obj);
            }
        }, new ged() {
            public final void accept(Object obj) {
                LoginRequestSerializer.lambda$serialize$3(JsonGenerator.this, (PhoneNumber) obj);
            }
        }, new ged() {
            public final void accept(Object obj) {
                LoginRequestSerializer.lambda$serialize$4(JsonGenerator.this, (OneTimeToken) obj);
            }
        }, new ged() {
            public final void accept(Object obj) {
                LoginRequestSerializer.lambda$serialize$5(JsonGenerator.this, (SpotifyToken) obj);
            }
        }, new ged() {
            public final void accept(Object obj) {
                LoginRequestSerializer.lambda$serialize$6(JsonGenerator.this, (ParentChild) obj);
            }
        }, new ged() {
            public final void accept(Object obj) {
                LoginRequestSerializer.writeStringField(JsonGenerator.this, "authenticationType", "autologin");
            }
        }, new ged() {
            public final void accept(Object obj) {
                LoginRequestSerializer.lambda$serialize$8(JsonGenerator.this, (RefreshToken) obj);
            }
        });
        jsonGenerator.writeEndObject();
        writeOptions(loginRequest.options(), jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
