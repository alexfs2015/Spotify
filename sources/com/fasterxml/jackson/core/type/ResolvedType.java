package com.fasterxml.jackson.core.type;

public abstract class ResolvedType {
    public abstract ResolvedType getReferencedType();

    public boolean isReferenceType() {
        return getReferencedType() != null;
    }

    public abstract String toCanonical();
}
