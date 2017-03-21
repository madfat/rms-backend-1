package com.mitrais.bootcamp.rms.config;

import com.mitrais.bootcamp.rms.data.entity.Division;
import com.mitrais.bootcamp.rms.data.entity.Employee;
import com.mitrais.bootcamp.rms.data.entity.JobFamily;
import com.mitrais.bootcamp.rms.data.entity.SubDivision;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
public class RepositoryConfig extends RepositoryRestMvcConfiguration {

    @Override
    public RepositoryRestConfiguration config() {
        RepositoryRestConfiguration config = super.config();
        config.exposeIdsFor(JobFamily.class);
        config.exposeIdsFor(Division.class);
        config.exposeIdsFor(SubDivision.class);
        config.exposeIdsFor(Employee.class);
        return config;
    }
}