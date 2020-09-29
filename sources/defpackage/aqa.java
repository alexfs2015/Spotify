package defpackage;

import com.google.ads.mediation.MediationServerParameters;

@Deprecated
/* renamed from: aqa reason: default package */
public interface aqa<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS extends MediationServerParameters> {
    void destroy();

    Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    Class<SERVER_PARAMETERS> getServerParametersType();
}
