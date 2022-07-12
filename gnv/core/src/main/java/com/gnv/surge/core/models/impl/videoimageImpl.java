package com.gnv.surge.core.models.impl;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gnv.surge.core.models.Videoimage;



@Model(adaptables = SlingHttpServletRequest.class,
adapters = Videoimage.class,

defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class videoimageImpl implements Videoimage{
private static final Logger LOG = LoggerFactory.getLogger(videoimageImpl.class);

	@ValueMapValue
    private String checkbox;

	@ValueMapValue
    private String video;
	
    @Override
    public String getCheckbox() {
            return checkbox;
    }

    @Override
    public String getvideo() {
               return video;
    }
}


