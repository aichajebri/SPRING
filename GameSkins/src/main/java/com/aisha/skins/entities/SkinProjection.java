package com.aisha.skins.entities;
import org.springframework.data.rest.core.config.Projection;
@Projection(name = "nomSkin", types = { Skins.class })
public interface SkinProjection {
public String getNomSkin();
}