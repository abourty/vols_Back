package com.abir.vols.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "destinationVol", types = { Vol.class })

public interface VolProjection {
	public String getDestinationVol();
}
