
package com.gnv.surge.core.models.impl;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gnv.surge.core.models.TerinaryOperator;



@Model(adaptables = SlingHttpServletRequest.class,
adapters = TerinaryOperator.class,

defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class TerinaryOperatorImpl implements TerinaryOperator{
private static final Logger LOG = LoggerFactory.getLogger(TerinaryOperatorImpl.class);

	@ValueMapValue
    private String checkbox;

	

    @Override
    public String getCheckbox() {
               return checkbox;
    }

}
